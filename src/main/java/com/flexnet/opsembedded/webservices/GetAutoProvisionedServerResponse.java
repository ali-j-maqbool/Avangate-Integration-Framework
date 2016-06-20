/**
 * GetAutoProvisionedServerResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GetAutoProvisionedServerResponse  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.OpsEmbeddedStatusInfoType statusInfo;

    private com.flexnet.opsembedded.webservices.DeviceIdentifier cloudLicenseServer;

    public GetAutoProvisionedServerResponse() {
    }

    public GetAutoProvisionedServerResponse(
           com.flexnet.opsembedded.webservices.OpsEmbeddedStatusInfoType statusInfo,
           com.flexnet.opsembedded.webservices.DeviceIdentifier cloudLicenseServer) {
           this.statusInfo = statusInfo;
           this.cloudLicenseServer = cloudLicenseServer;
    }


    /**
     * Gets the statusInfo value for this GetAutoProvisionedServerResponse.
     * 
     * @return statusInfo
     */
    public com.flexnet.opsembedded.webservices.OpsEmbeddedStatusInfoType getStatusInfo() {
        return statusInfo;
    }


    /**
     * Sets the statusInfo value for this GetAutoProvisionedServerResponse.
     * 
     * @param statusInfo
     */
    public void setStatusInfo(com.flexnet.opsembedded.webservices.OpsEmbeddedStatusInfoType statusInfo) {
        this.statusInfo = statusInfo;
    }


    /**
     * Gets the cloudLicenseServer value for this GetAutoProvisionedServerResponse.
     * 
     * @return cloudLicenseServer
     */
    public com.flexnet.opsembedded.webservices.DeviceIdentifier getCloudLicenseServer() {
        return cloudLicenseServer;
    }


    /**
     * Sets the cloudLicenseServer value for this GetAutoProvisionedServerResponse.
     * 
     * @param cloudLicenseServer
     */
    public void setCloudLicenseServer(com.flexnet.opsembedded.webservices.DeviceIdentifier cloudLicenseServer) {
        this.cloudLicenseServer = cloudLicenseServer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAutoProvisionedServerResponse)) return false;
        GetAutoProvisionedServerResponse other = (GetAutoProvisionedServerResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusInfo==null && other.getStatusInfo()==null) || 
             (this.statusInfo!=null &&
              this.statusInfo.equals(other.getStatusInfo()))) &&
            ((this.cloudLicenseServer==null && other.getCloudLicenseServer()==null) || 
             (this.cloudLicenseServer!=null &&
              this.cloudLicenseServer.equals(other.getCloudLicenseServer())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStatusInfo() != null) {
            _hashCode += getStatusInfo().hashCode();
        }
        if (getCloudLicenseServer() != null) {
            _hashCode += getCloudLicenseServer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAutoProvisionedServerResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getAutoProvisionedServerResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "statusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "OpsEmbeddedStatusInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloudLicenseServer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "cloudLicenseServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
