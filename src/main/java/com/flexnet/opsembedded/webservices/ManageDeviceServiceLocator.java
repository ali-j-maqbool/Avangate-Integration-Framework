/**
 * ManageDeviceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class ManageDeviceServiceLocator extends org.apache.axis.client.Service implements com.flexnet.opsembedded.webservices.ManageDeviceService {

    public ManageDeviceServiceLocator() {
    }


    public ManageDeviceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManageDeviceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManageDeviceService
    private java.lang.String ManageDeviceService_address = "http://flex1168-fno.flexnetoperations.com/flexnet/services/ManageDeviceService";

    public java.lang.String getManageDeviceServiceAddress() {
        return ManageDeviceService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManageDeviceServiceWSDDServiceName = "ManageDeviceService";

    public java.lang.String getManageDeviceServiceWSDDServiceName() {
        return ManageDeviceServiceWSDDServiceName;
    }

    public void setManageDeviceServiceWSDDServiceName(java.lang.String name) {
        ManageDeviceServiceWSDDServiceName = name;
    }

    public com.flexnet.opsembedded.webservices.ManageDeviceServiceInterface getManageDeviceService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManageDeviceService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManageDeviceService(endpoint);
    }

    public com.flexnet.opsembedded.webservices.ManageDeviceServiceInterface getManageDeviceService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.flexnet.opsembedded.webservices.ManageDeviceServiceSoapBindingStub _stub = new com.flexnet.opsembedded.webservices.ManageDeviceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getManageDeviceServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManageDeviceServiceEndpointAddress(java.lang.String address) {
        ManageDeviceService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.flexnet.opsembedded.webservices.ManageDeviceServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.flexnet.opsembedded.webservices.ManageDeviceServiceSoapBindingStub _stub = new com.flexnet.opsembedded.webservices.ManageDeviceServiceSoapBindingStub(new java.net.URL(ManageDeviceService_address), this);
                _stub.setPortName(getManageDeviceServiceWSDDServiceName());
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
        if ("ManageDeviceService".equals(inputPortName)) {
            return getManageDeviceService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "ManageDeviceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "ManageDeviceService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManageDeviceService".equals(portName)) {
            setManageDeviceServiceEndpointAddress(address);
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
