/**
 * SplitLineItemInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class SplitLineItemInfoType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier;

    private java.math.BigInteger numberOfCopies;

    private java.lang.String targetTierName;

    private com.flexnet.operations.webservices.OrganizationIdentifierType targetOrganizationUnit;

    private com.flexnet.operations.webservices.UserIdentifierType targetContact;

    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType matchingLineItemIdentifier;

    public SplitLineItemInfoType() {
    }

    public SplitLineItemInfoType(
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier,
           java.math.BigInteger numberOfCopies,
           java.lang.String targetTierName,
           com.flexnet.operations.webservices.OrganizationIdentifierType targetOrganizationUnit,
           com.flexnet.operations.webservices.UserIdentifierType targetContact,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType matchingLineItemIdentifier) {
           this.lineItemIdentifier = lineItemIdentifier;
           this.numberOfCopies = numberOfCopies;
           this.targetTierName = targetTierName;
           this.targetOrganizationUnit = targetOrganizationUnit;
           this.targetContact = targetContact;
           this.matchingLineItemIdentifier = matchingLineItemIdentifier;
    }


    /**
     * Gets the lineItemIdentifier value for this SplitLineItemInfoType.
     * 
     * @return lineItemIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getLineItemIdentifier() {
        return lineItemIdentifier;
    }


    /**
     * Sets the lineItemIdentifier value for this SplitLineItemInfoType.
     * 
     * @param lineItemIdentifier
     */
    public void setLineItemIdentifier(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier) {
        this.lineItemIdentifier = lineItemIdentifier;
    }


    /**
     * Gets the numberOfCopies value for this SplitLineItemInfoType.
     * 
     * @return numberOfCopies
     */
    public java.math.BigInteger getNumberOfCopies() {
        return numberOfCopies;
    }


    /**
     * Sets the numberOfCopies value for this SplitLineItemInfoType.
     * 
     * @param numberOfCopies
     */
    public void setNumberOfCopies(java.math.BigInteger numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }


    /**
     * Gets the targetTierName value for this SplitLineItemInfoType.
     * 
     * @return targetTierName
     */
    public java.lang.String getTargetTierName() {
        return targetTierName;
    }


    /**
     * Sets the targetTierName value for this SplitLineItemInfoType.
     * 
     * @param targetTierName
     */
    public void setTargetTierName(java.lang.String targetTierName) {
        this.targetTierName = targetTierName;
    }


    /**
     * Gets the targetOrganizationUnit value for this SplitLineItemInfoType.
     * 
     * @return targetOrganizationUnit
     */
    public com.flexnet.operations.webservices.OrganizationIdentifierType getTargetOrganizationUnit() {
        return targetOrganizationUnit;
    }


    /**
     * Sets the targetOrganizationUnit value for this SplitLineItemInfoType.
     * 
     * @param targetOrganizationUnit
     */
    public void setTargetOrganizationUnit(com.flexnet.operations.webservices.OrganizationIdentifierType targetOrganizationUnit) {
        this.targetOrganizationUnit = targetOrganizationUnit;
    }


    /**
     * Gets the targetContact value for this SplitLineItemInfoType.
     * 
     * @return targetContact
     */
    public com.flexnet.operations.webservices.UserIdentifierType getTargetContact() {
        return targetContact;
    }


    /**
     * Sets the targetContact value for this SplitLineItemInfoType.
     * 
     * @param targetContact
     */
    public void setTargetContact(com.flexnet.operations.webservices.UserIdentifierType targetContact) {
        this.targetContact = targetContact;
    }


    /**
     * Gets the matchingLineItemIdentifier value for this SplitLineItemInfoType.
     * 
     * @return matchingLineItemIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getMatchingLineItemIdentifier() {
        return matchingLineItemIdentifier;
    }


    /**
     * Sets the matchingLineItemIdentifier value for this SplitLineItemInfoType.
     * 
     * @param matchingLineItemIdentifier
     */
    public void setMatchingLineItemIdentifier(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType matchingLineItemIdentifier) {
        this.matchingLineItemIdentifier = matchingLineItemIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SplitLineItemInfoType)) return false;
        SplitLineItemInfoType other = (SplitLineItemInfoType) obj;
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
            ((this.numberOfCopies==null && other.getNumberOfCopies()==null) || 
             (this.numberOfCopies!=null &&
              this.numberOfCopies.equals(other.getNumberOfCopies()))) &&
            ((this.targetTierName==null && other.getTargetTierName()==null) || 
             (this.targetTierName!=null &&
              this.targetTierName.equals(other.getTargetTierName()))) &&
            ((this.targetOrganizationUnit==null && other.getTargetOrganizationUnit()==null) || 
             (this.targetOrganizationUnit!=null &&
              this.targetOrganizationUnit.equals(other.getTargetOrganizationUnit()))) &&
            ((this.targetContact==null && other.getTargetContact()==null) || 
             (this.targetContact!=null &&
              this.targetContact.equals(other.getTargetContact()))) &&
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
        if (getLineItemIdentifier() != null) {
            _hashCode += getLineItemIdentifier().hashCode();
        }
        if (getNumberOfCopies() != null) {
            _hashCode += getNumberOfCopies().hashCode();
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
        if (getMatchingLineItemIdentifier() != null) {
            _hashCode += getMatchingLineItemIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SplitLineItemInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItemInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfCopies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "numberOfCopies"));
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
