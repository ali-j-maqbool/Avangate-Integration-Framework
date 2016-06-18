/**
 * PolicyDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class PolicyDataType  implements java.io.Serializable {
    private java.math.BigInteger allowedCount;

    private com.flexnet.operations.webservices.PolicyTermType policyTerm;

    public PolicyDataType() {
    }

    public PolicyDataType(
           java.math.BigInteger allowedCount,
           com.flexnet.operations.webservices.PolicyTermType policyTerm) {
           this.allowedCount = allowedCount;
           this.policyTerm = policyTerm;
    }


    /**
     * Gets the allowedCount value for this PolicyDataType.
     * 
     * @return allowedCount
     */
    public java.math.BigInteger getAllowedCount() {
        return allowedCount;
    }


    /**
     * Sets the allowedCount value for this PolicyDataType.
     * 
     * @param allowedCount
     */
    public void setAllowedCount(java.math.BigInteger allowedCount) {
        this.allowedCount = allowedCount;
    }


    /**
     * Gets the policyTerm value for this PolicyDataType.
     * 
     * @return policyTerm
     */
    public com.flexnet.operations.webservices.PolicyTermType getPolicyTerm() {
        return policyTerm;
    }


    /**
     * Sets the policyTerm value for this PolicyDataType.
     * 
     * @param policyTerm
     */
    public void setPolicyTerm(com.flexnet.operations.webservices.PolicyTermType policyTerm) {
        this.policyTerm = policyTerm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyDataType)) return false;
        PolicyDataType other = (PolicyDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowedCount==null && other.getAllowedCount()==null) || 
             (this.allowedCount!=null &&
              this.allowedCount.equals(other.getAllowedCount()))) &&
            ((this.policyTerm==null && other.getPolicyTerm()==null) || 
             (this.policyTerm!=null &&
              this.policyTerm.equals(other.getPolicyTerm())));
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
        if (getAllowedCount() != null) {
            _hashCode += getAllowedCount().hashCode();
        }
        if (getPolicyTerm() != null) {
            _hashCode += getPolicyTerm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "allowedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyTermType"));
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
