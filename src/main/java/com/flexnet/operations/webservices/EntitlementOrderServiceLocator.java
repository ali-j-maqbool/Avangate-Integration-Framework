/**
 * EntitlementOrderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class EntitlementOrderServiceLocator extends org.apache.axis.client.Service implements com.flexnet.operations.webservices.EntitlementOrderService {

    public EntitlementOrderServiceLocator() {
    }


    public EntitlementOrderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EntitlementOrderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EntitlementOrderService
    private java.lang.String EntitlementOrderService_address = "http://flex1168-fno-uat.flexnetoperations.com/flexnet/services/EntitlementOrderService";

    public java.lang.String getEntitlementOrderServiceAddress() {
        return EntitlementOrderService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EntitlementOrderServiceWSDDServiceName = "EntitlementOrderService";

    public java.lang.String getEntitlementOrderServiceWSDDServiceName() {
        return EntitlementOrderServiceWSDDServiceName;
    }

    public void setEntitlementOrderServiceWSDDServiceName(java.lang.String name) {
        EntitlementOrderServiceWSDDServiceName = name;
    }

    public com.flexnet.operations.webservices.EntitlementOrderServiceInterface getEntitlementOrderService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EntitlementOrderService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEntitlementOrderService(endpoint);
    }

    public com.flexnet.operations.webservices.EntitlementOrderServiceInterface getEntitlementOrderService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.flexnet.operations.webservices.EntitlementOrderServiceSoapBindingStub _stub = new com.flexnet.operations.webservices.EntitlementOrderServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getEntitlementOrderServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEntitlementOrderServiceEndpointAddress(java.lang.String address) {
        EntitlementOrderService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.flexnet.operations.webservices.EntitlementOrderServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.flexnet.operations.webservices.EntitlementOrderServiceSoapBindingStub _stub = new com.flexnet.operations.webservices.EntitlementOrderServiceSoapBindingStub(new java.net.URL(EntitlementOrderService_address), this);
                _stub.setPortName(getEntitlementOrderServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EntitlementOrderService".equals(inputPortName)) {
            return getEntitlementOrderService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "EntitlementOrderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "EntitlementOrderService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EntitlementOrderService".equals(portName)) {
            setEntitlementOrderServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
