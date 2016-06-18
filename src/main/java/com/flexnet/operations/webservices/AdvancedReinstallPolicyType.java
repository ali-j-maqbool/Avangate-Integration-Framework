/**
 * AdvancedReinstallPolicyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class AdvancedReinstallPolicyType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.PolicyDataType umn1Policy;

    private com.flexnet.operations.webservices.PolicyDataType umn2Policy;

    private com.flexnet.operations.webservices.PolicyDataType umn3Policy;

    private com.flexnet.operations.webservices.PolicyDataType midPolicy;

    public AdvancedReinstallPolicyType() {
    }

    public AdvancedReinstallPolicyType(
           com.flexnet.operations.webservices.PolicyDataType umn1Policy,
           com.flexnet.operations.webservices.PolicyDataType umn2Policy,
           com.flexnet.operations.webservices.PolicyDataType umn3Policy,
           com.flexnet.operations.webservices.PolicyDataType midPolicy) {
           this.umn1Policy = umn1Policy;
           this.umn2Policy = umn2Policy;
           this.umn3Policy = umn3Policy;
           this.midPolicy = midPolicy;
    }


    /**
     * Gets the umn1Policy value for this AdvancedReinstallPolicyType.
     * 
     * @return umn1Policy
     */
    public com.flexnet.operations.webservices.PolicyDataType getUmn1Policy() {
        return umn1Policy;
    }


    /**
     * Sets the umn1Policy value for this AdvancedReinstallPolicyType.
     * 
     * @param umn1Policy
     */
    public void setUmn1Policy(com.flexnet.operations.webservices.PolicyDataType umn1Policy) {
        this.umn1Policy = umn1Policy;
    }


    /**
     * Gets the umn2Policy value for this AdvancedReinstallPolicyType.
     * 
     * @return umn2Policy
     */
    public com.flexnet.operations.webservices.PolicyDataType getUmn2Policy() {
        return umn2Policy;
    }


    /**
     * Sets the umn2Policy value for this AdvancedReinstallPolicyType.
     * 
     * @param umn2Policy
     */
    public void setUmn2Policy(com.flexnet.operations.webservices.PolicyDataType umn2Policy) {
        this.umn2Policy = umn2Policy;
    }


    /**
     * Gets the umn3Policy value for this AdvancedReinstallPolicyType.
     * 
     * @return umn3Policy
     */
    public com.flexnet.operations.webservices.PolicyDataType getUmn3Policy() {
        return umn3Policy;
    }


    /**
     * Sets the umn3Policy value for this AdvancedReinstallPolicyType.
     * 
     * @param umn3Policy
     */
    public void setUmn3Policy(com.flexnet.operations.webservices.PolicyDataType umn3Policy) {
        this.umn3Policy = umn3Policy;
    }


    /**
     * Gets the midPolicy value for this AdvancedReinstallPolicyType.
     * 
     * @return midPolicy
     */
    public com.flexnet.operations.webservices.PolicyDataType getMidPolicy() {
        return midPolicy;
    }


    /**
     * Sets the midPolicy value for this AdvancedReinstallPolicyType.
     * 
     * @param midPolicy
     */
    public void setMidPolicy(com.flexnet.operations.webservices.PolicyDataType midPolicy) {
        this.midPolicy = midPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvancedReinstallPolicyType)) return false;
        AdvancedReinstallPolicyType other = (AdvancedReinstallPolicyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.umn1Policy==null && other.getUmn1Policy()==null) || 
             (this.umn1Policy!=null &&
              this.umn1Policy.equals(other.getUmn1Policy()))) &&
            ((this.umn2Policy==null && other.getUmn2Policy()==null) || 
             (this.umn2Policy!=null &&
              this.umn2Policy.equals(other.getUmn2Policy()))) &&
            ((this.umn3Policy==null && other.getUmn3Policy()==null) || 
             (this.umn3Policy!=null &&
              this.umn3Policy.equals(other.getUmn3Policy()))) &&
            ((this.midPolicy==null && other.getMidPolicy()==null) || 
             (this.midPolicy!=null &&
              this.midPolicy.equals(other.getMidPolicy())));
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
        if (getUmn1Policy() != null) {
            _hashCode += getUmn1Policy().hashCode();
        }
        if (getUmn2Policy() != null) {
            _hashCode += getUmn2Policy().hashCode();
        }
        if (getUmn3Policy() != null) {
            _hashCode += getUmn3Policy().hashCode();
        }
        if (getMidPolicy() != null) {
            _hashCode += getMidPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvancedReinstallPolicyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "advancedReinstallPolicyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("umn1Policy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "umn1Policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyDataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("umn2Policy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "umn2Policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyDataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("umn3Policy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "umn3Policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyDataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("midPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "midPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyDataType"));
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
