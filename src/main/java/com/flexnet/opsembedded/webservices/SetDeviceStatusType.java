/**
 * SetDeviceStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class SetDeviceStatusType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier;

    private com.flexnet.opsembedded.webservices.DeviceStatusSettableType status;

    public SetDeviceStatusType() {
    }

    public SetDeviceStatusType(
           com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier,
           com.flexnet.opsembedded.webservices.DeviceStatusSettableType status) {
           this.deviceIdentifier = deviceIdentifier;
           this.status = status;
    }


    /**
     * Gets the deviceIdentifier value for this SetDeviceStatusType.
     * 
     * @return deviceIdentifier
     */
    public com.flexnet.opsembedded.webservices.DeviceIdentifier getDeviceIdentifier() {
        return deviceIdentifier;
    }


    /**
     * Sets the deviceIdentifier value for this SetDeviceStatusType.
     * 
     * @param deviceIdentifier
     */
    public void setDeviceIdentifier(com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }


    /**
     * Gets the status value for this SetDeviceStatusType.
     * 
     * @return status
     */
    public com.flexnet.opsembedded.webservices.DeviceStatusSettableType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SetDeviceStatusType.
     * 
     * @param status
     */
    public void setStatus(com.flexnet.opsembedded.webservices.DeviceStatusSettableType status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetDeviceStatusType)) return false;
        SetDeviceStatusType other = (SetDeviceStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceIdentifier==null && other.getDeviceIdentifier()==null) || 
             (this.deviceIdentifier!=null &&
              this.deviceIdentifier.equals(other.getDeviceIdentifier()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getDeviceIdentifier() != null) {
            _hashCode += getDeviceIdentifier().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetDeviceStatusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "setDeviceStatusType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceStatusSettableType"));
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
