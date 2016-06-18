/**
 * ReinstallPolicyDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class ReinstallPolicyDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.PolicyDataType defaultPolicy;

    private com.flexnet.operations.webservices.AdvancedReinstallPolicyType advancedPolicy;

    public ReinstallPolicyDataType() {
    }

    public ReinstallPolicyDataType(
           com.flexnet.operations.webservices.PolicyDataType defaultPolicy,
           com.flexnet.operations.webservices.AdvancedReinstallPolicyType advancedPolicy) {
           this.defaultPolicy = defaultPolicy;
           this.advancedPolicy = advancedPolicy;
    }


    /**
     * Gets the defaultPolicy value for this ReinstallPolicyDataType.
     * 
     * @return defaultPolicy
     */
    public com.flexnet.operations.webservices.PolicyDataType getDefaultPolicy() {
        return defaultPolicy;
    }


    /**
     * Sets the defaultPolicy value for this ReinstallPolicyDataType.
     * 
     * @param defaultPolicy
     */
    public void setDefaultPolicy(com.flexnet.operations.webservices.PolicyDataType defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
    }


    /**
     * Gets the advancedPolicy value for this ReinstallPolicyDataType.
     * 
     * @return advancedPolicy
     */
    public com.flexnet.operations.webservices.AdvancedReinstallPolicyType getAdvancedPolicy() {
        return advancedPolicy;
    }


    /**
     * Sets the advancedPolicy value for this ReinstallPolicyDataType.
     * 
     * @param advancedPolicy
     */
    public void setAdvancedPolicy(com.flexnet.operations.webservices.AdvancedReinstallPolicyType advancedPolicy) {
        this.advancedPolicy = advancedPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReinstallPolicyDataType)) return false;
        ReinstallPolicyDataType other = (ReinstallPolicyDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.defaultPolicy==null && other.getDefaultPolicy()==null) || 
             (this.defaultPolicy!=null &&
              this.defaultPolicy.equals(other.getDefaultPolicy()))) &&
            ((this.advancedPolicy==null && other.getAdvancedPolicy()==null) || 
             (this.advancedPolicy!=null &&
              this.advancedPolicy.equals(other.getAdvancedPolicy())));
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
        if (getDefaultPolicy() != null) {
            _hashCode += getDefaultPolicy().hashCode();
        }
        if (getAdvancedPolicy() != null) {
            _hashCode += getAdvancedPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReinstallPolicyDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "reinstallPolicyDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "defaultPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advancedPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "advancedPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "advancedReinstallPolicyType"));
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
