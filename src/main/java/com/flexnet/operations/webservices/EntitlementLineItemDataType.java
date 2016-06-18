/**
 * EntitlementLineItemDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class EntitlementLineItemDataType  extends com.flexnet.operations.webservices.CreateEntitlementLineItemDataType  implements java.io.Serializable {
    private java.math.BigInteger numberOfRemainingCopies;

    private java.math.BigInteger availableExtraActivations;

    private java.lang.Boolean isTrustedType;

    private com.flexnet.operations.webservices.StateType state;

    private com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology;

    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItem;

    private java.util.Calendar createdOnDateTime;

    private java.util.Calendar lastModifiedDateTime;

    private java.math.BigInteger overdraftMax;

    private java.math.BigInteger remainingOverdraftCount;

    public EntitlementLineItemDataType() {
    }

    public EntitlementLineItemDataType(
           com.flexnet.operations.webservices.IdType activationId,
           java.lang.String description,
           com.flexnet.operations.webservices.ProductIdentifierType product,
           com.flexnet.operations.webservices.PartNumberIdentifierType partNumber,
           com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModel,
           com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel1,
           com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel2,
           com.flexnet.operations.webservices.AttributeDescriptorDataType licenseModelAttributes,
           java.lang.String FNPTimeZoneValue,
           com.flexnet.operations.webservices.PolicyAttributesListType policyAttributes,
           java.lang.String orderId,
           java.lang.String orderLineNumber,
           java.math.BigInteger numberOfCopies,
           java.util.Date startDate,
           com.flexnet.operations.webservices.StartDateOptionType startDateOption,
           java.lang.Boolean isPermanent,
           com.flexnet.operations.webservices.DurationType term,
           java.util.Date expirationDate,
           java.util.Date versionDate,
           com.flexnet.operations.webservices.VersionDateAttributesType versionDateAttributes,
           com.flexnet.operations.webservices.LineItemType lineItemType,
           com.flexnet.operations.webservices.EntitledProductDataListType entitledProducts,
           com.flexnet.operations.webservices.AttributeDescriptorDataType lineItemAttributes,
           java.math.BigInteger numberOfRemainingCopies,
           java.math.BigInteger availableExtraActivations,
           java.lang.Boolean isTrustedType,
           com.flexnet.operations.webservices.StateType state,
           com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItem,
           java.util.Calendar createdOnDateTime,
           java.util.Calendar lastModifiedDateTime,
           java.math.BigInteger overdraftMax,
           java.math.BigInteger remainingOverdraftCount) {
        super(
            activationId,
            description,
            product,
            partNumber,
            licenseModel,
            alternateLicenseModel1,
            alternateLicenseModel2,
            licenseModelAttributes,
            FNPTimeZoneValue,
            policyAttributes,
            orderId,
            orderLineNumber,
            numberOfCopies,
            startDate,
            startDateOption,
            isPermanent,
            term,
            expirationDate,
            versionDate,
            versionDateAttributes,
            lineItemType,
            entitledProducts,
            lineItemAttributes);
        this.numberOfRemainingCopies = numberOfRemainingCopies;
        this.availableExtraActivations = availableExtraActivations;
        this.isTrustedType = isTrustedType;
        this.state = state;
        this.licenseTechnology = licenseTechnology;
        this.parentLineItem = parentLineItem;
        this.createdOnDateTime = createdOnDateTime;
        this.lastModifiedDateTime = lastModifiedDateTime;
        this.overdraftMax = overdraftMax;
        this.remainingOverdraftCount = remainingOverdraftCount;
    }


    /**
     * Gets the numberOfRemainingCopies value for this EntitlementLineItemDataType.
     * 
     * @return numberOfRemainingCopies
     */
    public java.math.BigInteger getNumberOfRemainingCopies() {
        return numberOfRemainingCopies;
    }


    /**
     * Sets the numberOfRemainingCopies value for this EntitlementLineItemDataType.
     * 
     * @param numberOfRemainingCopies
     */
    public void setNumberOfRemainingCopies(java.math.BigInteger numberOfRemainingCopies) {
        this.numberOfRemainingCopies = numberOfRemainingCopies;
    }


    /**
     * Gets the availableExtraActivations value for this EntitlementLineItemDataType.
     * 
     * @return availableExtraActivations
     */
    public java.math.BigInteger getAvailableExtraActivations() {
        return availableExtraActivations;
    }


    /**
     * Sets the availableExtraActivations value for this EntitlementLineItemDataType.
     * 
     * @param availableExtraActivations
     */
    public void setAvailableExtraActivations(java.math.BigInteger availableExtraActivations) {
        this.availableExtraActivations = availableExtraActivations;
    }


    /**
     * Gets the isTrustedType value for this EntitlementLineItemDataType.
     * 
     * @return isTrustedType
     */
    public java.lang.Boolean getIsTrustedType() {
        return isTrustedType;
    }


    /**
     * Sets the isTrustedType value for this EntitlementLineItemDataType.
     * 
     * @param isTrustedType
     */
    public void setIsTrustedType(java.lang.Boolean isTrustedType) {
        this.isTrustedType = isTrustedType;
    }


    /**
     * Gets the state value for this EntitlementLineItemDataType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.StateType getState() {
        return state;
    }


    /**
     * Sets the state value for this EntitlementLineItemDataType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.StateType state) {
        this.state = state;
    }


    /**
     * Gets the licenseTechnology value for this EntitlementLineItemDataType.
     * 
     * @return licenseTechnology
     */
    public com.flexnet.operations.webservices.LicenseTechnologyIdentifierType getLicenseTechnology() {
        return licenseTechnology;
    }


    /**
     * Sets the licenseTechnology value for this EntitlementLineItemDataType.
     * 
     * @param licenseTechnology
     */
    public void setLicenseTechnology(com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology) {
        this.licenseTechnology = licenseTechnology;
    }


    /**
     * Gets the parentLineItem value for this EntitlementLineItemDataType.
     * 
     * @return parentLineItem
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getParentLineItem() {
        return parentLineItem;
    }


    /**
     * Sets the parentLineItem value for this EntitlementLineItemDataType.
     * 
     * @param parentLineItem
     */
    public void setParentLineItem(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItem) {
        this.parentLineItem = parentLineItem;
    }


    /**
     * Gets the createdOnDateTime value for this EntitlementLineItemDataType.
     * 
     * @return createdOnDateTime
     */
    public java.util.Calendar getCreatedOnDateTime() {
        return createdOnDateTime;
    }


    /**
     * Sets the createdOnDateTime value for this EntitlementLineItemDataType.
     * 
     * @param createdOnDateTime
     */
    public void setCreatedOnDateTime(java.util.Calendar createdOnDateTime) {
        this.createdOnDateTime = createdOnDateTime;
    }


    /**
     * Gets the lastModifiedDateTime value for this EntitlementLineItemDataType.
     * 
     * @return lastModifiedDateTime
     */
    public java.util.Calendar getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this EntitlementLineItemDataType.
     * 
     * @param lastModifiedDateTime
     */
    public void setLastModifiedDateTime(java.util.Calendar lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the overdraftMax value for this EntitlementLineItemDataType.
     * 
     * @return overdraftMax
     */
    public java.math.BigInteger getOverdraftMax() {
        return overdraftMax;
    }


    /**
     * Sets the overdraftMax value for this EntitlementLineItemDataType.
     * 
     * @param overdraftMax
     */
    public void setOverdraftMax(java.math.BigInteger overdraftMax) {
        this.overdraftMax = overdraftMax;
    }


    /**
     * Gets the remainingOverdraftCount value for this EntitlementLineItemDataType.
     * 
     * @return remainingOverdraftCount
     */
    public java.math.BigInteger getRemainingOverdraftCount() {
        return remainingOverdraftCount;
    }


    /**
     * Sets the remainingOverdraftCount value for this EntitlementLineItemDataType.
     * 
     * @param remainingOverdraftCount
     */
    public void setRemainingOverdraftCount(java.math.BigInteger remainingOverdraftCount) {
        this.remainingOverdraftCount = remainingOverdraftCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitlementLineItemDataType)) return false;
        EntitlementLineItemDataType other = (EntitlementLineItemDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.numberOfRemainingCopies==null && other.getNumberOfRemainingCopies()==null) || 
             (this.numberOfRemainingCopies!=null &&
              this.numberOfRemainingCopies.equals(other.getNumberOfRemainingCopies()))) &&
            ((this.availableExtraActivations==null && other.getAvailableExtraActivations()==null) || 
             (this.availableExtraActivations!=null &&
              this.availableExtraActivations.equals(other.getAvailableExtraActivations()))) &&
            ((this.isTrustedType==null && other.getIsTrustedType()==null) || 
             (this.isTrustedType!=null &&
              this.isTrustedType.equals(other.getIsTrustedType()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.licenseTechnology==null && other.getLicenseTechnology()==null) || 
             (this.licenseTechnology!=null &&
              this.licenseTechnology.equals(other.getLicenseTechnology()))) &&
            ((this.parentLineItem==null && other.getParentLineItem()==null) || 
             (this.parentLineItem!=null &&
              this.parentLineItem.equals(other.getParentLineItem()))) &&
            ((this.createdOnDateTime==null && other.getCreatedOnDateTime()==null) || 
             (this.createdOnDateTime!=null &&
              this.createdOnDateTime.equals(other.getCreatedOnDateTime()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.overdraftMax==null && other.getOverdraftMax()==null) || 
             (this.overdraftMax!=null &&
              this.overdraftMax.equals(other.getOverdraftMax()))) &&
            ((this.remainingOverdraftCount==null && other.getRemainingOverdraftCount()==null) || 
             (this.remainingOverdraftCount!=null &&
              this.remainingOverdraftCount.equals(other.getRemainingOverdraftCount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNumberOfRemainingCopies() != null) {
            _hashCode += getNumberOfRemainingCopies().hashCode();
        }
        if (getAvailableExtraActivations() != null) {
            _hashCode += getAvailableExtraActivations().hashCode();
        }
        if (getIsTrustedType() != null) {
            _hashCode += getIsTrustedType().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getLicenseTechnology() != null) {
            _hashCode += getLicenseTechnology().hashCode();
        }
        if (getParentLineItem() != null) {
            _hashCode += getParentLineItem().hashCode();
        }
        if (getCreatedOnDateTime() != null) {
            _hashCode += getCreatedOnDateTime().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getOverdraftMax() != null) {
            _hashCode += getOverdraftMax().hashCode();
        }
        if (getRemainingOverdraftCount() != null) {
            _hashCode += getRemainingOverdraftCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntitlementLineItemDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfRemainingCopies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "numberOfRemainingCopies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableExtraActivations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "availableExtraActivations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTrustedType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isTrustedType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseTechnology");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnology"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnologyIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdOnDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdOnDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overdraftMax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "overdraftMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingOverdraftCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "remainingOverdraftCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
