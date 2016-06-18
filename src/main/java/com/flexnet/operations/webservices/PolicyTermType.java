/**
 * PolicyTermType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class PolicyTermType  implements java.io.Serializable {
    private java.math.BigInteger duration;

    private com.flexnet.operations.webservices.DurationUnit durationUnit;

    public PolicyTermType() {
    }

    public PolicyTermType(
           java.math.BigInteger duration,
           com.flexnet.operations.webservices.DurationUnit durationUnit) {
           this.duration = duration;
           this.durationUnit = durationUnit;
    }


    /**
     * Gets the duration value for this PolicyTermType.
     * 
     * @return duration
     */
    public java.math.BigInteger getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this PolicyTermType.
     * 
     * @param duration
     */
    public void setDuration(java.math.BigInteger duration) {
        this.duration = duration;
    }


    /**
     * Gets the durationUnit value for this PolicyTermType.
     * 
     * @return durationUnit
     */
    public com.flexnet.operations.webservices.DurationUnit getDurationUnit() {
        return durationUnit;
    }


    /**
     * Sets the durationUnit value for this PolicyTermType.
     * 
     * @param durationUnit
     */
    public void setDurationUnit(com.flexnet.operations.webservices.DurationUnit durationUnit) {
        this.durationUnit = durationUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyTermType)) return false;
        PolicyTermType other = (PolicyTermType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.durationUnit==null && other.getDurationUnit()==null) || 
             (this.durationUnit!=null &&
              this.durationUnit.equals(other.getDurationUnit())));
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
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getDurationUnit() != null) {
            _hashCode += getDurationUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyTermType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyTermType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "durationUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DurationUnit"));
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
