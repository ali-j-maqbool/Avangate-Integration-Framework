/**
 * GetMatchingLineItemInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetMatchingLineItemInfoType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier;

    private java.lang.String targetTierName;

    private com.flexnet.operations.webservices.OrganizationIdentifierType targetOrganizationUnit;

    public GetMatchingLineItemInfoType() {
    }

    public GetMatchingLineItemInfoType(
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier,
           java.lang.String targetTierName,
           com.flexnet.operations.webservices.OrganizationIdentifierType targetOrganizationUnit) {
           this.lineItemIdentifier = lineItemIdentifier;
           this.targetTierName = targetTierName;
           this.targetOrganizationUnit = targetOrganizationUnit;
    }


    /**
     * Gets the lineItemIdentifier value for this GetMatchingLineItemInfoType.
     * 
     * @return lineItemIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getLineItemIdentifier() {
        return lineItemIdentifier;
    }


    /**
     * Sets the lineItemIdentifier value for this GetMatchingLineItemInfoType.
     * 
     * @param lineItemIdentifier
     */
    public void setLineItemIdentifier(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier) {
        this.lineItemIdentifier = lineItemIdentifier;
    }


    /**
     * Gets the targetTierName value for this GetMatchingLineItemInfoType.
     * 
     * @return targetTierName
     */
    public java.lang.String getTargetTierName() {
        return targetTierName;
    }


    /**
     * Sets the targetTierName value for this GetMatchingLineItemInfoType.
     * 
     * @param targetTierName
     */
    public void setTargetTierName(java.lang.String targetTierName) {
        this.targetTierName = targetTierName;
    }


    /**
     * Gets the targetOrganizationUnit value for this GetMatchingLineItemInfoType.
     * 
     * @return targetOrganizationUnit
     */
    public com.flexnet.operations.webservices.OrganizationIdentifierType getTargetOrganizationUnit() {
        return targetOrganizationUnit;
    }


    /**
     * Sets the targetOrganizationUnit value for this GetMatchingLineItemInfoType.
     * 
     * @param targetOrganizationUnit
     */
    public void setTargetOrganizationUnit(com.flexnet.operations.webservices.OrganizationIdentifierType targetOrganizationUnit) {
        this.targetOrganizationUnit = targetOrganizationUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMatchingLineItemInfoType)) return false;
        GetMatchingLineItemInfoType other = (GetMatchingLineItemInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemIdentifier==null && other.getLineItemIdentifier()==null) || 
             (this.lineItemIdentifier!=null &&
              this.lineItemIdentifier.equals(other.getLineItemIdentifier()))) &&
            ((this.targetTierName==null && other.getTargetTierName()==null) || 
             (this.targetTierName!=null &&
              this.targetTierName.equals(other.getTargetTierName()))) &&
            ((this.targetOrganizationUnit==null && other.getTargetOrganizationUnit()==null) || 
             (this.targetOrganizationUnit!=null &&
              this.targetOrganizationUnit.equals(other.getTargetOrganizationUnit())));
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
        if (getLineItemIdentifier() != null) {
            _hashCode += getLineItemIdentifier().hashCode();
        }
        if (getTargetTierName() != null) {
            _hashCode += getTargetTierName().hashCode();
        }
        if (getTargetOrganizationUnit() != null) {
            _hashCode += getTargetOrganizationUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMatchingLineItemInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingLineItemInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetTierName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "targetTierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetOrganizationUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "targetOrganizationUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationIdentifierType"));
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
