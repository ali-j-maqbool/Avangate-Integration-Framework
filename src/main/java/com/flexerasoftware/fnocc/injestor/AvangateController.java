/**
 * Class provides a endpoint to the implementation to injest data.
 */
package com.flexerasoftware.fnocc.injestor;


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
	
	public void requestInformation(Map<String,String[]> data){
        this.integrationFrameworkProperties = integrationFrameworkCTX.getBean(IntegrationFrameworkProperties.class);
        if(this.integrationFrameworkProperties.getDevMode()){
            StringBuilder sb = new StringBuilder();
            Set<String> keySet = data.keySet();
            for(String key: keySet) {
            sb.append(String.format("[%s,%s] ",key,data.get(key)[0]));
        }
        log.info("REQUEST INFORMATION: "+sb.toString());
        }
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
		
		try {
            this.integrationFrameworkProperties = integrationFrameworkCTX.getBean(IntegrationFrameworkProperties.class);

            requestInformation(ipn.getParameterMap());

			if (ipn.getMethod().equalsIgnoreCase(RequestMethod.POST.name())){
				log.info(String.format("IPN POST CALLED"));
			}else if (ipn.getMethod().equalsIgnoreCase(RequestMethod.GET.name())){
				log.info(String.format("IPN GET CALLED"));
				return new InjestorResult("OK","Get request processed");
			}
				avangateSvc = new AvangateService(ipn);
                avangateSvc.acknowledgeReceipt();

            if (avangateSvc.isValidAvangateSource(ipn.getParameterMap())){
				avangateSvc.process();
				avangateSvc.acknowledgeReceipt();
			}else{
					throw new Exception("Data received from an un-authorised source");
			}
		} catch (Exception e) {
				log.error("Error has occurred.", e);
				return new InjestorResult("ERROR", e.getMessage());
		}
		return new InjestorResult("OK",avangateSvc.acknowledgeReceipt());
	
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

        try {
            requestInformation(lcn.getParameterMap());


            if (lcn.getMethod().equalsIgnoreCase(RequestMethod.POST.name())){
                log.info(String.format("LCN POST CALLED"));
            }else if (lcn.getMethod().equalsIgnoreCase(RequestMethod.GET.name())){
                log.info(String.format("LCN GET CALLED"));
                return new InjestorResult("OK","Get request processed");
            }

            this.secretKeyProperties = propertiesCTX.getBean(SecretKeyProperties.class);
            this.materialiseProperties = materialiseCTX.getBean(MaterialiseProperties.class);

            avangateSvc = new AvangateService(lcn);
            if (avangateSvc.isValidAvangateSource(lcn.getParameterMap())){
                if(!this.integrationFrameworkProperties.getDevMode()) {
                    avangateSvc.process();
                }

                avangateSvc.acknowledgeReceiptLCN();
            }else{
                throw new Exception("Data received from an un-authorised source");
            }

			//ALMOrderController controller = new ALMOrderController(
			//		new AvangateService(body.getBytes()), mockService);
			//controller.process();
			
		} catch (Exception e) {
			log.error("Error has occurred.", e);
			return new InjestorResult("ERROR", e.getMessage());
		}
        return new InjestorResult("OK",avangateSvc.acknowledgeReceiptLCN());
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

        try {
            requestInformation(edr.getParameterMap());

            if (edr.getMethod().equalsIgnoreCase(RequestMethod.POST.name())){
                log.info(String.format("EDR POST CALLED"));
            }else if (edr.getMethod().equalsIgnoreCase(RequestMethod.GET.name())){
                log.info(String.format("EDR GET CALLED"));
                return new InjestorResult("OK","Get request processed");
            }

            avangateSvc = new AvangateService(edr);

            if (avangateSvc.isValidAvangateSource(edr.getParameterMap())){
                if(!this.integrationFrameworkProperties.getDevMode()) {
                    avangateSvc.process();
                }

                avangateSvc.acknowledgeReceiptEDR();
            }else{
                throw new Exception("Data received from an un-authorised source");
            }
        } catch (Exception e) {
			log.error("Error has occurred.", e);
			return new InjestorResult("ERROR", e.getMessage());
		}
        return new InjestorResult("OK",avangateSvc.acknowledgeReceiptEDR());
    }
}
