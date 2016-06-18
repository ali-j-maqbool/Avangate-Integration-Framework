package com.flexerasoftware.fnocc.service;

/*
 * @(#)ClientSecurityCredentials        1.0 10/02/2006
 *
 * COPYRIGHT (C) 2009 by Flexera Software Inc.
 * This software has been provided pursuant to a License Agreement
 * containing restrictions on its use.  This software contains
 * valuable trade secrets and proprietary information of
 * Flexera Software Inc and is protected by law.  It may
 * not be copied or distributed in any form or medium, disclosed
 * to third parties, reverse engineered or used in any manner not
 * provided for in said License Agreement except with the prior
 * written authorization from Flexera Software Inc.
 */

import org.apache.axis.client.Stub;
import org.apache.axis.encoding.Base64;
import org.apache.axis.message.SOAPHeaderElement;

import java.io.UnsupportedEncodingException;
import java.rmi.*;

import javax.xml.soap.Name;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;


/*
 * This class consist of convenient methods that allow to set
 * the username and password (credentials) for the invoker of
 * the webservice operation. The username/password can be set
 * in the ClientContext (Http Authorization header) or in the
 * SOAPHeader of the SOAPEnvelope.
 *
 *  UserName Syntax :
 *  ----------------------
 *  userName##domainName
 *        where userName --> name of user.
 * 	        domainName --> domain to which the user belongs.
 *        If domain is not provided, default domain (FLEXnet) is used.
 */

public class ClientSecurityCredentials {

  public static final String AUTH_SOAP_HEADER = "auth.soapHeader";
  public static final String nameSpace = "flex";
  public static final String nameSpaceURI = "urn:com.macrovision:flexnet/platform";

  private final static String CHAR_SET = "UTF-8";

  private Stub stub;
  private SOAPFactory soapFactory;

  /**
   * Allows setting User credentials in the Client Context (Http Authorization Header).
   * @param service
   */
  public ClientSecurityCredentials(Remote service)  {
     this.stub = (Stub) service;
  }

  /**
   * Allows setting User credentials in the SOAPHeader.
   * @param service
   * @param authType use Constant ClientSecurityCredentials.AUTH_SOAP_HEADER
   * @throws javax.xml.soap.SOAPException
   */
  public ClientSecurityCredentials(Remote service, String authType) throws SOAPException {
	 this(service);
	 if (AUTH_SOAP_HEADER.equals(authType)) {
			soapFactory = SOAPFactory.newInstance();
	 }
  }

  /**
   * Set the username in the clientContext (http header) or in SOAPHeader
   * depending on the constructor used.
   * @param username
   */
  public void setUsername(String username) throws SOAPException {
	 if (stub != null) {
		 if(soapFactory != null) {
               this.setSoapHeader("UserId", username);
		 } else {
			   stub.setUsername(username);
		 }
	 }
  }


  /**
   * Set the password in the clientContext (http header) or in SOAPHeader
   * depending on the constructor used.
   * @param password
   */
  public void setPassword(String password) throws SOAPException, UnsupportedEncodingException {
	 if (stub != null) {
		if(soapFactory != null) {
            String encryptedPwd = Base64.encode(password.getBytes(CHAR_SET));
            this.setSoapHeader("UserPassword", encryptedPwd);
		} else {
	    	stub.setPassword(password);
	    }
	 }
  }

  	/**
  	 *
  	 * @param elementName
  	 * @param value
  	 * @throws javax.xml.soap.SOAPException
  	 */
	private void setSoapHeader(String elementName, String value) throws SOAPException {
		Name nameElem = soapFactory.createName(elementName, nameSpace, nameSpaceURI);
        SOAPHeaderElement headerElem = new SOAPHeaderElement(nameElem);
        headerElem.addTextNode(value);
        this.stub.setHeader(headerElem);
	}


}
