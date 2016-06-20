/**
 * ReturnHostType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class ReturnHostType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.DeviceIdentifier hostIdentifier;

    private com.flexnet.opsembedded.webservices.DeviceIdentifier targetHostIdentifier;

    public ReturnHostType() {
    }

    public ReturnHostType(
           com.flexnet.opsembedded.webservices.DeviceIdentifier hostIdentifier,
           com.flexnet.opsembedded.webservices.DeviceIdentifier targetHostIdentifier) {
           this.hostIdentifier = hostIdentifier;
           this.targetHostIdentifier = targetHostIdentifier;
    }


    /**
     * Gets the hostIdentifier value for this ReturnHostType.
     * 
     * @return hostIdentifier
     */
    public com.flexnet.opsembedded.webservices.DeviceIdentifier getHostIdentifier() {
        return hostIdentifier;
    }


    /**
     * Sets the hostIdentifier value for this ReturnHostType.
     * 
     * @param hostIdentifier
     */
    public void setHostIdentifier(com.flexnet.opsembedded.webservices.DeviceIdentifier hostIdentifier) {
        this.hostIdentifier = hostIdentifier;
    }


    /**
     * Gets the targetHostIdentifier value for this ReturnHostType.
     * 
     * @return targetHostIdentifier
     */
    public com.flexnet.opsembedded.webservices.DeviceIdentifier getTargetHostIdentifier() {
        return targetHostIdentifier;
    }


    /**
     * Sets the targetHostIdentifier value for this ReturnHostType.
     * 
     * @param targetHostIdentifier
     */
    public void setTargetHostIdentifier(com.flexnet.opsembedded.webservices.DeviceIdentifier targetHostIdentifier) {
        this.targetHostIdentifier = targetHostIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnHostType)) return false;
        ReturnHostType other = (ReturnHostType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostIdentifier==null && other.getHostIdentifier()==null) || 
             (this.hostIdentifier!=null &&
              this.hostIdentifier.equals(other.getHostIdentifier()))) &&
            ((this.targetHostIdentifier==null && other.getTargetHostIdentifier()==null) || 
             (this.targetHostIdentifier!=null &&
              this.targetHostIdentifier.equals(other.getTargetHostIdentifier())));
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
        if (getHostIdentifier() != null) {
            _hashCode += getHostIdentifier().hashCode();
        }
        if (getTargetHostIdentifier() != null) {
            _hashCode += getTargetHostIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnHostType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "returnHostType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "hostIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetHostIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "targetHostIdentifier"));
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
