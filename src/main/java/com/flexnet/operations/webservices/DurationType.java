/**
 * DurationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class DurationType  implements java.io.Serializable {
    private java.math.BigInteger numDuration;

    private com.flexnet.operations.webservices.DurationUnit durationUnit;

    public DurationType() {
    }

    public DurationType(
           java.math.BigInteger numDuration,
           com.flexnet.operations.webservices.DurationUnit durationUnit) {
           this.numDuration = numDuration;
           this.durationUnit = durationUnit;
    }


    /**
     * Gets the numDuration value for this DurationType.
     * 
     * @return numDuration
     */
    public java.math.BigInteger getNumDuration() {
        return numDuration;
    }


    /**
     * Sets the numDuration value for this DurationType.
     * 
     * @param numDuration
     */
    public void setNumDuration(java.math.BigInteger numDuration) {
        this.numDuration = numDuration;
    }


    /**
     * Gets the durationUnit value for this DurationType.
     * 
     * @return durationUnit
     */
    public com.flexnet.operations.webservices.DurationUnit getDurationUnit() {
        return durationUnit;
    }


    /**
     * Sets the durationUnit value for this DurationType.
     * 
     * @param durationUnit
     */
    public void setDurationUnit(com.flexnet.operations.webservices.DurationUnit durationUnit) {
        this.durationUnit = durationUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DurationType)) return false;
        DurationType other = (DurationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numDuration==null && other.getNumDuration()==null) || 
             (this.numDuration!=null &&
              this.numDuration.equals(other.getNumDuration()))) &&
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
        if (getNumDuration() != null) {
            _hashCode += getNumDuration().hashCode();
        }
        if (getDurationUnit() != null) {
            _hashCode += getDurationUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DurationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DurationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "numDuration"));
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
