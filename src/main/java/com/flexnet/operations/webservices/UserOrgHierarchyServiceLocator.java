/**
 * UserOrgHierarchyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UserOrgHierarchyServiceLocator extends org.apache.axis.client.Service implements com.flexnet.operations.webservices.UserOrgHierarchyService {

    public UserOrgHierarchyServiceLocator() {
    }


    public UserOrgHierarchyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserOrgHierarchyServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserOrgHierarchyService
    private java.lang.String UserOrgHierarchyService_address = "http://flex1168-fno-uat.flexnetoperations.com/flexnet/services/UserOrgHierarchyService";

    public java.lang.String getUserOrgHierarchyServiceAddress() {
        return UserOrgHierarchyService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserOrgHierarchyServiceWSDDServiceName = "UserOrgHierarchyService";

    public java.lang.String getUserOrgHierarchyServiceWSDDServiceName() {
        return UserOrgHierarchyServiceWSDDServiceName;
    }

    public void setUserOrgHierarchyServiceWSDDServiceName(java.lang.String name) {
        UserOrgHierarchyServiceWSDDServiceName = name;
    }

    public com.flexnet.operations.webservices.UserOrgHierarchyServiceInterface getUserOrgHierarchyService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserOrgHierarchyService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserOrgHierarchyService(endpoint);
    }

    public com.flexnet.operations.webservices.UserOrgHierarchyServiceInterface getUserOrgHierarchyService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.flexnet.operations.webservices.UserOrgHierarchyServiceSoapBindingStub _stub = new com.flexnet.operations.webservices.UserOrgHierarchyServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserOrgHierarchyServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserOrgHierarchyServiceEndpointAddress(java.lang.String address) {
        UserOrgHierarchyService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.flexnet.operations.webservices.UserOrgHierarchyServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.flexnet.operations.webservices.UserOrgHierarchyServiceSoapBindingStub _stub = new com.flexnet.operations.webservices.UserOrgHierarchyServiceSoapBindingStub(new java.net.URL(UserOrgHierarchyService_address), this);
                _stub.setPortName(getUserOrgHierarchyServiceWSDDServiceName());
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
        if ("UserOrgHierarchyService".equals(inputPortName)) {
            return getUserOrgHierarchyService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "UserOrgHierarchyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "UserOrgHierarchyService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserOrgHierarchyService".equals(portName)) {
            setUserOrgHierarchyServiceEndpointAddress(address);
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
