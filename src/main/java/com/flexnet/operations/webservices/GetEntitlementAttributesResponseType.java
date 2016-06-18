/**
 * GetEntitlementAttributesResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetEntitlementAttributesResponseType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.StatusInfoType statusInfo;

    private com.flexnet.operations.webservices.AttributeMetaDescriptorDataType entitlementAttributes;

    private com.flexnet.operations.webservices.PolicyAttributesDataType policyAttributes;

    private java.lang.Boolean needTimeZone;

    public GetEntitlementAttributesResponseType() {
    }

    public GetEntitlementAttributesResponseType(
           com.flexnet.operations.webservices.StatusInfoType statusInfo,
           com.flexnet.operations.webservices.AttributeMetaDescriptorDataType entitlementAttributes,
           com.flexnet.operations.webservices.PolicyAttributesDataType policyAttributes,
           java.lang.Boolean needTimeZone) {
           this.statusInfo = statusInfo;
           this.entitlementAttributes = entitlementAttributes;
           this.policyAttributes = policyAttributes;
           this.needTimeZone = needTimeZone;
    }


    /**
     * Gets the statusInfo value for this GetEntitlementAttributesResponseType.
     * 
     * @return statusInfo
     */
    public com.flexnet.operations.webservices.StatusInfoType getStatusInfo() {
        return statusInfo;
    }


    /**
     * Sets the statusInfo value for this GetEntitlementAttributesResponseType.
     * 
     * @param statusInfo
     */
    public void setStatusInfo(com.flexnet.operations.webservices.StatusInfoType statusInfo) {
        this.statusInfo = statusInfo;
    }


    /**
     * Gets the entitlementAttributes value for this GetEntitlementAttributesResponseType.
     * 
     * @return entitlementAttributes
     */
    public com.flexnet.operations.webservices.AttributeMetaDescriptorDataType getEntitlementAttributes() {
        return entitlementAttributes;
    }


    /**
     * Sets the entitlementAttributes value for this GetEntitlementAttributesResponseType.
     * 
     * @param entitlementAttributes
     */
    public void setEntitlementAttributes(com.flexnet.operations.webservices.AttributeMetaDescriptorDataType entitlementAttributes) {
        this.entitlementAttributes = entitlementAttributes;
    }


    /**
     * Gets the policyAttributes value for this GetEntitlementAttributesResponseType.
     * 
     * @return policyAttributes
     */
    public com.flexnet.operations.webservices.PolicyAttributesDataType getPolicyAttributes() {
        return policyAttributes;
    }


    /**
     * Sets the policyAttributes value for this GetEntitlementAttributesResponseType.
     * 
     * @param policyAttributes
     */
    public void setPolicyAttributes(com.flexnet.operations.webservices.PolicyAttributesDataType policyAttributes) {
        this.policyAttributes = policyAttributes;
    }


    /**
     * Gets the needTimeZone value for this GetEntitlementAttributesResponseType.
     * 
     * @return needTimeZone
     */
    public java.lang.Boolean getNeedTimeZone() {
        return needTimeZone;
    }


    /**
     * Sets the needTimeZone value for this GetEntitlementAttributesResponseType.
     * 
     * @param needTimeZone
     */
    public void setNeedTimeZone(java.lang.Boolean needTimeZone) {
        this.needTimeZone = needTimeZone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEntitlementAttributesResponseType)) return false;
        GetEntitlementAttributesResponseType other = (GetEntitlementAttributesResponseType) obj;
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
            ((this.entitlementAttributes==null && other.getEntitlementAttributes()==null) || 
             (this.entitlementAttributes!=null &&
              this.entitlementAttributes.equals(other.getEntitlementAttributes()))) &&
            ((this.policyAttributes==null && other.getPolicyAttributes()==null) || 
             (this.policyAttributes!=null &&
              this.policyAttributes.equals(other.getPolicyAttributes()))) &&
            ((this.needTimeZone==null && other.getNeedTimeZone()==null) || 
             (this.needTimeZone!=null &&
              this.needTimeZone.equals(other.getNeedTimeZone())));
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
        if (getEntitlementAttributes() != null) {
            _hashCode += getEntitlementAttributes().hashCode();
        }
        if (getPolicyAttributes() != null) {
            _hashCode += getPolicyAttributes().hashCode();
        }
        if (getNeedTimeZone() != null) {
            _hashCode += getNeedTimeZone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEntitlementAttributesResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementAttributesResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "statusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StatusInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeMetaDescriptorDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyAttributesDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "needTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
