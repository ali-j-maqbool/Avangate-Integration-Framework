/**
 * Class provides a endpoint to the implementation to injest data.
 */
package com.flexerasoftware.fnocc.injestor;


import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import com.flexerasoftware.fnocc.configuration.IntegrationFrameworkProperties;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.flexerasoftware.fnocc.configuration.MaterialiseProperties;
import com.flexerasoftware.fnocc.configuration.SecretKeyProperties;
import com.flexerasoftware.fnocc.service.AvangateService;
import com.flexerasoftware.fnocc.vo.*;

/**
 * @author Jawaid Maqbool
 *
 */
@RestController
@RequestMapping("/avangate")
public class AvangateController {

	static Logger log = Logger.getLogger(AvangateController.class.getName());
	private SecretKeyProperties secretKeyProperties;
	private MaterialiseProperties materialiseProperties;
    private IntegrationFrameworkProperties integrationFrameworkProperties;
    private static final String COMPANY = "COMPANY";
    private static final String LICENSE_REF = "LICENSE_REF";


    ApplicationContext propertiesCTX = new AnnotationConfigApplicationContext(SecretKeyProperties.class);
	ApplicationContext materialiseCTX = new AnnotationConfigApplicationContext(MaterialiseProperties.class);
    ApplicationContext integrationFrameworkCTX = new AnnotationConfigApplicationContext(IntegrationFrameworkProperties.class);

	/**
	 * A test endpoint for assuring that the controller is running.
	 * 
	 * @return InjestorResult with status of the call.
	 */
	@RequestMapping("/Connector")
	public InjestorResult notification() {
		return new InjestorResult("OK", "FNO - AVANGATE END-POINT RUNNING");
	}
	
	public void requestInformation(HttpServletRequest request){
        Map<String,String[]> data = request.getParameterMap();
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }

        log.info("Request received from ipAddress:" + ipAddress);
        this.integrationFrameworkProperties = integrationFrameworkCTX.getBean(IntegrationFrameworkProperties.class);

        StringBuilder sb = new StringBuilder();
        String[] keySet = data.keySet().toArray(new String[data.keySet().size()]);
        sb.append("[");
        for(int i=0;i<keySet.length;i++) {
            sb.append(String.format("%s=%s",keySet[i],data.get(keySet[i])[0]));
            if(i==keySet.length-1) {
                sb.append("ipAddress="+ipAddress+"]");
            }else{
                sb.append(",\n");
            }
        }
        log.info("REQUEST INFORMATION: "+sb.toString());

    }
	
	/**
	 * Process IPN
	 * @Avangate expects the end-point to accept both POST and GET
	 * @param ipn A key/value pair of data from the external system.
	 * @return InjestorResult with status of the call.
	 */
	@RequestMapping(value="/IPN", method= {RequestMethod.POST, RequestMethod.GET}, 
			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE )
	public InjestorResult processIPN(HttpServletRequest ipn) {
		
		AvangateService avangateSvc = null;
        StringBuffer returnMsg = new StringBuffer();
		
		try {
            this.integrationFrameworkProperties = integrationFrameworkCTX.getBean(IntegrationFrameworkProperties.class);


            if (ipn.getMethod().equalsIgnoreCase(RequestMethod.POST.name())){
				log.info(String.format("IPN POST CALLED"));
			} else if (ipn.getMethod().equalsIgnoreCase(RequestMethod.GET.name())){
				log.info(String.format("IPN GET CALLED"));
				return new InjestorResult("OK","Get request processed");
			}

            //print request
            requestInformation(ipn);

            avangateSvc = new AvangateService(ipn);

            if (avangateSvc.isValidAvangateSource(ipn.getParameterMap())){
				avangateSvc.processIPN();
			} else {
                returnMsg.append("Data received from an un-authorised source");
                log.error(returnMsg);

            }
		} catch (Exception e) {
            log.error("Error has occurred.", e);
            returnMsg.append(String.format("Error occurred %s", e.getMessage()));
		}

        if (returnMsg.toString().trim().length() > 0){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            String dtToStr = dateFormat.format(new Date());
            log.error(String.format("<EPAYMENT>%s|%s</EPAYMENT>", dtToStr, returnMsg.toString()));
            return new InjestorResult("Error",String.format("<EPAYMENT>%s|%s</EPAYMENT>", dtToStr, returnMsg.toString()));
        }else {
            return new InjestorResult("OK", avangateSvc.acknowledgeReceipt());
        }
	}
	
	/**
	 * Process LCN
	 * @Avangate expects the end-point to accept both POST and GET
	 * 
	 * @param lcn A String of data from the external system.
	 * @return InjestorResult with status of the call.
	 */
	@RequestMapping(value="/LCN", method= {RequestMethod.POST, RequestMethod.GET} )
	public InjestorResult processLCN(HttpServletRequest lcn) {
        AvangateService avangateSvc = null;
        StringBuffer returnMsg = new StringBuffer();

        try {


            if (lcn.getMethod().equalsIgnoreCase(RequestMethod.POST.name())){
                log.info(String.format("LCN POST CALLED"));
            } else if (lcn.getMethod().equalsIgnoreCase(RequestMethod.GET.name())){
                log.info(String.format("LCN GET CALLED"));
                return new InjestorResult("OK","Get request processed");
            }

            requestInformation(lcn);

            avangateSvc = new AvangateService(lcn);
            if (avangateSvc.isValidAvangateSource(lcn.getParameterMap())){
                avangateSvc.processLCN();
            } else {
                returnMsg.append("Data received from an un-authorised source");
            }
		} catch (Exception e) {
            returnMsg.append(String.format("Error occurred %s", e.getMessage()));
		}

        if (returnMsg.toString().trim().length() > 0){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            String dtToStr = dateFormat.format(new Date());
            log.error(String.format("<EPAYMENT>%s|%s</EPAYMENT>", dtToStr, returnMsg.toString()));

            return new InjestorResult("Error", String.format("<EPAYMENT>%s|%s</EPAYMENT>", dtToStr, returnMsg.toString()));
        }else {
            return new InjestorResult("OK", avangateSvc.acknowledgeReceiptLCN());
        }
    }
	
	
	/**
	 * Process Electronic Delivery Request
	 * 
	 *@Avangate expects the end-point to accept both POST and GET
	 * 
	 * @param edr A key/value pair  of data from the external system.
	 * @return InjestorResult with status of the call.
	 */
	@RequestMapping(value="/EDR", method= {RequestMethod.POST, RequestMethod.GET})
	public InjestorResult processElectronicDeliveryRequest(HttpServletRequest edr) {
        AvangateService avangateSvc = null;
        StringBuffer returnMsg = new StringBuffer();

        try {
            this.secretKeyProperties = propertiesCTX.getBean(SecretKeyProperties.class);

            if (edr.getMethod().equalsIgnoreCase(RequestMethod.POST.name())) {
                log.info(String.format("EDR POST CALLED"));
            } else if (edr.getMethod().equalsIgnoreCase(RequestMethod.GET.name())) {
                log.info(String.format("EDR GET CALLED"));
                return new InjestorResult("OK", "Get request processed");
            }

            requestInformation(edr);

            avangateSvc = new AvangateService(edr);

            if (avangateSvc.isValidAvangateSource(edr.getParameterMap())) {
                Map<String, String[]> edrParams = edr.getParameterMap();
                if (edrParams.containsKey(COMPANY) &&
                        edrParams.containsKey(LICENSE_REF)){

                    returnMsg.append(avangateSvc.acknowledgeReceiptEDR(edr.getParameter(COMPANY),
                            edr.getParameter(LICENSE_REF),this.secretKeyProperties.getClsID()));

                }else{
                    throw new Exception("Mandatory data COMPANY, AND LICENSE_REF is missing, process aborted");
                }
           } else {
                throw new Exception("Data received from an un-authorised source");
            }


        } catch (Exception e) {
            log.error("Error has occurred.", e);
            returnMsg.append(String.format("<Error>%s</Error>", e.getMessage()));
            log.error(returnMsg);
            return new InjestorResult("Error", returnMsg.toString());

        }

        return new InjestorResult("Ok", returnMsg.toString());

    }
}
