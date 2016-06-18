/**
 * SplitBulkEntitlementInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class SplitBulkEntitlementInfoType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntIdentifier;

    private java.math.BigInteger numberOfWRKs;

    private java.lang.String targetTierName;

    private com.flexnet.operations.webservices.OrganizationIdentifierType targetOrganizationUnit;

    private com.flexnet.operations.webservices.UserIdentifierType targetContact;

    private com.flexnet.operations.webservices.EntitlementIdentifierType matchingBulkEntIdentifier;

    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType matchingLineItemIdentifier;

    public SplitBulkEntitlementInfoType() {
    }

    public SplitBulkEntitlementInfoType(
           com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntIdentifier,
           java.math.BigInteger numberOfWRKs,
           java.lang.String targetTierName,
           com.flexnet.operations.webservices.OrganizationIdentifierType targetOrganizationUnit,
           com.flexnet.operations.webservices.UserIdentifierType targetContact,
           com.flexnet.operations.webservices.EntitlementIdentifierType matchingBulkEntIdentifier,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType matchingLineItemIdentifier) {
           this.bulkEntIdentifier = bulkEntIdentifier;
           this.numberOfWRKs = numberOfWRKs;
           this.targetTierName = targetTierName;
           this.targetOrganizationUnit = targetOrganizationUnit;
           this.targetContact = targetContact;
           this.matchingBulkEntIdentifier = matchingBulkEntIdentifier;
           this.matchingLineItemIdentifier = matchingLineItemIdentifier;
    }


    /**
     * Gets the bulkEntIdentifier value for this SplitBulkEntitlementInfoType.
     * 
     * @return bulkEntIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getBulkEntIdentifier() {
        return bulkEntIdentifier;
    }


    /**
     * Sets the bulkEntIdentifier value for this SplitBulkEntitlementInfoType.
     * 
     * @param bulkEntIdentifier
     */
    public void setBulkEntIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntIdentifier) {
        this.bulkEntIdentifier = bulkEntIdentifier;
    }


    /**
     * Gets the numberOfWRKs value for this SplitBulkEntitlementInfoType.
     * 
     * @return numberOfWRKs
     */
    public java.math.BigInteger getNumberOfWRKs() {
        return numberOfWRKs;
    }


    /**
     * Sets the numberOfWRKs value for this SplitBulkEntitlementInfoType.
     * 
     * @param numberOfWRKs
     */
    public void setNumberOfWRKs(java.math.BigInteger numberOfWRKs) {
        this.numberOfWRKs = numberOfWRKs;
    }


    /**
     * Gets the targetTierName value for this SplitBulkEntitlementInfoType.
     * 
     * @return targetTierName
     */
    public java.lang.String getTargetTierName() {
        return targetTierName;
    }


    /**
     * Sets the targetTierName value for this SplitBulkEntitlementInfoType.
     * 
     * @param targetTierName
     */
    public void setTargetTierName(java.lang.String targetTierName) {
        this.targetTierName = targetTierName;
    }


    /**
     * Gets the targetOrganizationUnit value for this SplitBulkEntitlementInfoType.
     * 
     * @return targetOrganizationUnit
     */
    public com.flexnet.operations.webservices.OrganizationIdentifierType getTargetOrganizationUnit() {
        return targetOrganizationUnit;
    }


    /**
     * Sets the targetOrganizationUnit value for this SplitBulkEntitlementInfoType.
     * 
     * @param targetOrganizationUnit
     */
    public void setTargetOrganizationUnit(com.flexnet.operations.webservices.OrganizationIdentifierType targetOrganizationUnit) {
        this.targetOrganizationUnit = targetOrganizationUnit;
    }


    /**
     * Gets the targetContact value for this SplitBulkEntitlementInfoType.
     * 
     * @return targetContact
     */
    public com.flexnet.operations.webservices.UserIdentifierType getTargetContact() {
        return targetContact;
    }


    /**
     * Sets the targetContact value for this SplitBulkEntitlementInfoType.
     * 
     * @param targetContact
     */
    public void setTargetContact(com.flexnet.operations.webservices.UserIdentifierType targetContact) {
        this.targetContact = targetContact;
    }


    /**
     * Gets the matchingBulkEntIdentifier value for this SplitBulkEntitlementInfoType.
     * 
     * @return matchingBulkEntIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getMatchingBulkEntIdentifier() {
        return matchingBulkEntIdentifier;
    }


    /**
     * Sets the matchingBulkEntIdentifier value for this SplitBulkEntitlementInfoType.
     * 
     * @param matchingBulkEntIdentifier
     */
    public void setMatchingBulkEntIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType matchingBulkEntIdentifier) {
        this.matchingBulkEntIdentifier = matchingBulkEntIdentifier;
    }


    /**
     * Gets the matchingLineItemIdentifier value for this SplitBulkEntitlementInfoType.
     * 
     * @return matchingLineItemIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getMatchingLineItemIdentifier() {
        return matchingLineItemIdentifier;
    }


    /**
     * Sets the matchingLineItemIdentifier value for this SplitBulkEntitlementInfoType.
     * 
     * @param matchingLineItemIdentifier
     */
    public void setMatchingLineItemIdentifier(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType matchingLineItemIdentifier) {
        this.matchingLineItemIdentifier = matchingLineItemIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SplitBulkEntitlementInfoType)) return false;
        SplitBulkEntitlementInfoType other = (SplitBulkEntitlementInfoType) obj;
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
            ((this.numberOfWRKs==null && other.getNumberOfWRKs()==null) || 
             (this.numberOfWRKs!=null &&
              this.numberOfWRKs.equals(other.getNumberOfWRKs()))) &&
            ((this.targetTierName==null && other.getTargetTierName()==null) || 
             (this.targetTierName!=null &&
              this.targetTierName.equals(other.getTargetTierName()))) &&
            ((this.targetOrganizationUnit==null && other.getTargetOrganizationUnit()==null) || 
             (this.targetOrganizationUnit!=null &&
              this.targetOrganizationUnit.equals(other.getTargetOrganizationUnit()))) &&
            ((this.targetContact==null && other.getTargetContact()==null) || 
             (this.targetContact!=null &&
              this.targetContact.equals(other.getTargetContact()))) &&
            ((this.matchingBulkEntIdentifier==null && other.getMatchingBulkEntIdentifier()==null) || 
             (this.matchingBulkEntIdentifier!=null &&
              this.matchingBulkEntIdentifier.equals(other.getMatchingBulkEntIdentifier()))) &&
            ((this.matchingLineItemIdentifier==null && other.getMatchingLineItemIdentifier()==null) || 
             (this.matchingLineItemIdentifier!=null &&
              this.matchingLineItemIdentifier.equals(other.getMatchingLineItemIdentifier())));
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
        if (getNumberOfWRKs() != null) {
            _hashCode += getNumberOfWRKs().hashCode();
        }
        if (getTargetTierName() != null) {
            _hashCode += getTargetTierName().hashCode();
        }
        if (getTargetOrganizationUnit() != null) {
            _hashCode += getTargetOrganizationUnit().hashCode();
        }
        if (getTargetContact() != null) {
            _hashCode += getTargetContact().hashCode();
        }
        if (getMatchingBulkEntIdentifier() != null) {
            _hashCode += getMatchingBulkEntIdentifier().hashCode();
        }
        if (getMatchingLineItemIdentifier() != null) {
            _hashCode += getMatchingLineItemIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SplitBulkEntitlementInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfWRKs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "numberOfWRKs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetContact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "targetContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingBulkEntIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "matchingBulkEntIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingLineItemIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "matchingLineItemIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
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
