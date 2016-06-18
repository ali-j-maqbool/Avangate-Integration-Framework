/**
 * GetMatchingBulkEntInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetMatchingBulkEntInfoType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntIdentifier;

    private java.lang.String targetTierName;

    private com.flexnet.operations.webservices.OrganizationIdentifierType targetOrganizationUnit;

    public GetMatchingBulkEntInfoType() {
    }

    public GetMatchingBulkEntInfoType(
           com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntIdentifier,
           java.lang.String targetTierName,
           com.flexnet.operations.webservices.OrganizationIdentifierType targetOrganizationUnit) {
           this.bulkEntIdentifier = bulkEntIdentifier;
           this.targetTierName = targetTierName;
           this.targetOrganizationUnit = targetOrganizationUnit;
    }


    /**
     * Gets the bulkEntIdentifier value for this GetMatchingBulkEntInfoType.
     * 
     * @return bulkEntIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getBulkEntIdentifier() {
        return bulkEntIdentifier;
    }


    /**
     * Sets the bulkEntIdentifier value for this GetMatchingBulkEntInfoType.
     * 
     * @param bulkEntIdentifier
     */
    public void setBulkEntIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntIdentifier) {
        this.bulkEntIdentifier = bulkEntIdentifier;
    }


    /**
     * Gets the targetTierName value for this GetMatchingBulkEntInfoType.
     * 
     * @return targetTierName
     */
    public java.lang.String getTargetTierName() {
        return targetTierName;
    }


    /**
     * Sets the targetTierName value for this GetMatchingBulkEntInfoType.
     * 
     * @param targetTierName
     */
    public void setTargetTierName(java.lang.String targetTierName) {
        this.targetTierName = targetTierName;
    }


    /**
     * Gets the targetOrganizationUnit value for this GetMatchingBulkEntInfoType.
     * 
     * @return targetOrganizationUnit
     */
    public com.flexnet.operations.webservices.OrganizationIdentifierType getTargetOrganizationUnit() {
        return targetOrganizationUnit;
    }


    /**
     * Sets the targetOrganizationUnit value for this GetMatchingBulkEntInfoType.
     * 
     * @param targetOrganizationUnit
     */
    public void setTargetOrganizationUnit(com.flexnet.operations.webservices.OrganizationIdentifierType targetOrganizationUnit) {
        this.targetOrganizationUnit = targetOrganizationUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMatchingBulkEntInfoType)) return false;
        GetMatchingBulkEntInfoType other = (GetMatchingBulkEntInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkEntIdentifier==null && other.getBulkEntIdentifier()==null) || 
             (this.bulkEntIdentifier!=null &&
              this.bulkEntIdentifier.equals(other.getBulkEntIdentifier()))) &&
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
        if (getBulkEntIdentifier() != null) {
            _hashCode += getBulkEntIdentifier().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetMatchingBulkEntInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingBulkEntInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
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
