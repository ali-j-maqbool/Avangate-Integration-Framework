/**
 * BulkEntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class BulkEntitlementDataType  extends com.flexnet.operations.webservices.CreateBulkEntitlementDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.StateType state;

    private java.lang.String createdUserId;

    private com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology;

    public BulkEntitlementDataType() {
    }

    public BulkEntitlementDataType(
           com.flexnet.operations.webservices.IdType entitlementId,
           java.lang.String soldTo,
           com.flexnet.operations.webservices.ProductIdentifierType product,
           com.flexnet.operations.webservices.PartNumberIdentifierType partNumber,
           com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModel,
           com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel1,
           com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel2,
           com.flexnet.operations.webservices.AttributeDescriptorDataType licenseModelAttributes,
           java.lang.String FNPTimeZoneValue,
           com.flexnet.operations.webservices.PolicyAttributesListType policyAttributes,
           java.lang.String shipToEmail,
           java.lang.String shipToAddress,
           java.lang.String orderId,
           java.lang.String orderLineNumber,
           com.flexnet.operations.webservices.StartDateOptionType startDateOption,
           java.lang.Boolean isPermanent,
           com.flexnet.operations.webservices.DurationType term,
           java.util.Date expirationDate,
           java.util.Date versionDate,
           com.flexnet.operations.webservices.VersionDateAttributesType versionDateAttributes,
           java.lang.String description,
           java.math.BigInteger numberOfCopies,
           com.flexnet.operations.webservices.BulkEntitlementType bulkEntitlementType,
           java.lang.Boolean autoDeploy,
           com.flexnet.operations.webservices.EntitledProductDataListType entitledProducts,
           com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners,
           java.lang.Boolean allowPortalLogin,
           com.flexnet.operations.webservices.StateType state,
           java.lang.String createdUserId,
           com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology) {
        super(
            entitlementId,
            soldTo,
            product,
            partNumber,
            licenseModel,
            alternateLicenseModel1,
            alternateLicenseModel2,
            licenseModelAttributes,
            FNPTimeZoneValue,
            policyAttributes,
            shipToEmail,
            shipToAddress,
            orderId,
            orderLineNumber,
            startDateOption,
            isPermanent,
            term,
            expirationDate,
            versionDate,
            versionDateAttributes,
            description,
            numberOfCopies,
            bulkEntitlementType,
            autoDeploy,
            entitledProducts,
            channelPartners,
            allowPortalLogin);
        this.state = state;
        this.createdUserId = createdUserId;
        this.licenseTechnology = licenseTechnology;
    }


    /**
     * Gets the state value for this BulkEntitlementDataType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.StateType getState() {
        return state;
    }


    /**
     * Sets the state value for this BulkEntitlementDataType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.StateType state) {
        this.state = state;
    }


    /**
     * Gets the createdUserId value for this BulkEntitlementDataType.
     * 
     * @return createdUserId
     */
    public java.lang.String getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this BulkEntitlementDataType.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(java.lang.String createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the licenseTechnology value for this BulkEntitlementDataType.
     * 
     * @return licenseTechnology
     */
    public com.flexnet.operations.webservices.LicenseTechnologyIdentifierType getLicenseTechnology() {
        return licenseTechnology;
    }


    /**
     * Sets the licenseTechnology value for this BulkEntitlementDataType.
     * 
     * @param licenseTechnology
     */
    public void setLicenseTechnology(com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology) {
        this.licenseTechnology = licenseTechnology;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkEntitlementDataType)) return false;
        BulkEntitlementDataType other = (BulkEntitlementDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.createdUserId==null && other.getCreatedUserId()==null) || 
             (this.createdUserId!=null &&
              this.createdUserId.equals(other.getCreatedUserId()))) &&
            ((this.licenseTechnology==null && other.getLicenseTechnology()==null) || 
             (this.licenseTechnology!=null &&
              this.licenseTechnology.equals(other.getLicenseTechnology())));
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCreatedUserId() != null) {
            _hashCode += getCreatedUserId().hashCode();
        }
        if (getLicenseTechnology() != null) {
            _hashCode += getLicenseTechnology().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BulkEntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
