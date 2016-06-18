/**
 * ActivatableItemDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class ActivatableItemDetailType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.ActivatableItemType activatableItemType;

    private java.lang.String parentBulkEntitlementId;

    private java.lang.String entitlementId;

    private java.lang.String soldTo;

    private java.lang.String shipToEmail;

    private java.lang.String shipToAddress;

    private com.flexnet.operations.webservices.StateType entitlementState;

    private com.flexnet.operations.webservices.EntitlementLineItemDataType activatableItemData;

    private com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType entitlementAttributes;

    public ActivatableItemDetailType() {
    }

    public ActivatableItemDetailType(
           com.flexnet.operations.webservices.ActivatableItemType activatableItemType,
           java.lang.String parentBulkEntitlementId,
           java.lang.String entitlementId,
           java.lang.String soldTo,
           java.lang.String shipToEmail,
           java.lang.String shipToAddress,
           com.flexnet.operations.webservices.StateType entitlementState,
           com.flexnet.operations.webservices.EntitlementLineItemDataType activatableItemData,
           com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners,
           com.flexnet.operations.webservices.AttributeDescriptorDataType entitlementAttributes) {
           this.activatableItemType = activatableItemType;
           this.parentBulkEntitlementId = parentBulkEntitlementId;
           this.entitlementId = entitlementId;
           this.soldTo = soldTo;
           this.shipToEmail = shipToEmail;
           this.shipToAddress = shipToAddress;
           this.entitlementState = entitlementState;
           this.activatableItemData = activatableItemData;
           this.channelPartners = channelPartners;
           this.entitlementAttributes = entitlementAttributes;
    }


    /**
     * Gets the activatableItemType value for this ActivatableItemDetailType.
     * 
     * @return activatableItemType
     */
    public com.flexnet.operations.webservices.ActivatableItemType getActivatableItemType() {
        return activatableItemType;
    }


    /**
     * Sets the activatableItemType value for this ActivatableItemDetailType.
     * 
     * @param activatableItemType
     */
    public void setActivatableItemType(com.flexnet.operations.webservices.ActivatableItemType activatableItemType) {
        this.activatableItemType = activatableItemType;
    }


    /**
     * Gets the parentBulkEntitlementId value for this ActivatableItemDetailType.
     * 
     * @return parentBulkEntitlementId
     */
    public java.lang.String getParentBulkEntitlementId() {
        return parentBulkEntitlementId;
    }


    /**
     * Sets the parentBulkEntitlementId value for this ActivatableItemDetailType.
     * 
     * @param parentBulkEntitlementId
     */
    public void setParentBulkEntitlementId(java.lang.String parentBulkEntitlementId) {
        this.parentBulkEntitlementId = parentBulkEntitlementId;
    }


    /**
     * Gets the entitlementId value for this ActivatableItemDetailType.
     * 
     * @return entitlementId
     */
    public java.lang.String getEntitlementId() {
        return entitlementId;
    }


    /**
     * Sets the entitlementId value for this ActivatableItemDetailType.
     * 
     * @param entitlementId
     */
    public void setEntitlementId(java.lang.String entitlementId) {
        this.entitlementId = entitlementId;
    }


    /**
     * Gets the soldTo value for this ActivatableItemDetailType.
     * 
     * @return soldTo
     */
    public java.lang.String getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this ActivatableItemDetailType.
     * 
     * @param soldTo
     */
    public void setSoldTo(java.lang.String soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the shipToEmail value for this ActivatableItemDetailType.
     * 
     * @return shipToEmail
     */
    public java.lang.String getShipToEmail() {
        return shipToEmail;
    }


    /**
     * Sets the shipToEmail value for this ActivatableItemDetailType.
     * 
     * @param shipToEmail
     */
    public void setShipToEmail(java.lang.String shipToEmail) {
        this.shipToEmail = shipToEmail;
    }


    /**
     * Gets the shipToAddress value for this ActivatableItemDetailType.
     * 
     * @return shipToAddress
     */
    public java.lang.String getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this ActivatableItemDetailType.
     * 
     * @param shipToAddress
     */
    public void setShipToAddress(java.lang.String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the entitlementState value for this ActivatableItemDetailType.
     * 
     * @return entitlementState
     */
    public com.flexnet.operations.webservices.StateType getEntitlementState() {
        return entitlementState;
    }


    /**
     * Sets the entitlementState value for this ActivatableItemDetailType.
     * 
     * @param entitlementState
     */
    public void setEntitlementState(com.flexnet.operations.webservices.StateType entitlementState) {
        this.entitlementState = entitlementState;
    }


    /**
     * Gets the activatableItemData value for this ActivatableItemDetailType.
     * 
     * @return activatableItemData
     */
    public com.flexnet.operations.webservices.EntitlementLineItemDataType getActivatableItemData() {
        return activatableItemData;
    }


    /**
     * Sets the activatableItemData value for this ActivatableItemDetailType.
     * 
     * @param activatableItemData
     */
    public void setActivatableItemData(com.flexnet.operations.webservices.EntitlementLineItemDataType activatableItemData) {
        this.activatableItemData = activatableItemData;
    }


    /**
     * Gets the channelPartners value for this ActivatableItemDetailType.
     * 
     * @return channelPartners
     */
    public com.flexnet.operations.webservices.ChannelPartnerDataListType getChannelPartners() {
        return channelPartners;
    }


    /**
     * Sets the channelPartners value for this ActivatableItemDetailType.
     * 
     * @param channelPartners
     */
    public void setChannelPartners(com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners) {
        this.channelPartners = channelPartners;
    }


    /**
     * Gets the entitlementAttributes value for this ActivatableItemDetailType.
     * 
     * @return entitlementAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getEntitlementAttributes() {
        return entitlementAttributes;
    }


    /**
     * Sets the entitlementAttributes value for this ActivatableItemDetailType.
     * 
     * @param entitlementAttributes
     */
    public void setEntitlementAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType entitlementAttributes) {
        this.entitlementAttributes = entitlementAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivatableItemDetailType)) return false;
        ActivatableItemDetailType other = (ActivatableItemDetailType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activatableItemType==null && other.getActivatableItemType()==null) || 
             (this.activatableItemType!=null &&
              this.activatableItemType.equals(other.getActivatableItemType()))) &&
            ((this.parentBulkEntitlementId==null && other.getParentBulkEntitlementId()==null) || 
             (this.parentBulkEntitlementId!=null &&
              this.parentBulkEntitlementId.equals(other.getParentBulkEntitlementId()))) &&
            ((this.entitlementId==null && other.getEntitlementId()==null) || 
             (this.entitlementId!=null &&
              this.entitlementId.equals(other.getEntitlementId()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.shipToEmail==null && other.getShipToEmail()==null) || 
             (this.shipToEmail!=null &&
              this.shipToEmail.equals(other.getShipToEmail()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.entitlementState==null && other.getEntitlementState()==null) || 
             (this.entitlementState!=null &&
              this.entitlementState.equals(other.getEntitlementState()))) &&
            ((this.activatableItemData==null && other.getActivatableItemData()==null) || 
             (this.activatableItemData!=null &&
              this.activatableItemData.equals(other.getActivatableItemData()))) &&
            ((this.channelPartners==null && other.getChannelPartners()==null) || 
             (this.channelPartners!=null &&
              this.channelPartners.equals(other.getChannelPartners()))) &&
            ((this.entitlementAttributes==null && other.getEntitlementAttributes()==null) || 
             (this.entitlementAttributes!=null &&
              this.entitlementAttributes.equals(other.getEntitlementAttributes())));
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
        if (getActivatableItemType() != null) {
            _hashCode += getActivatableItemType().hashCode();
        }
        if (getParentBulkEntitlementId() != null) {
            _hashCode += getParentBulkEntitlementId().hashCode();
        }
        if (getEntitlementId() != null) {
            _hashCode += getEntitlementId().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getShipToEmail() != null) {
            _hashCode += getShipToEmail().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
        }
        if (getEntitlementState() != null) {
            _hashCode += getEntitlementState().hashCode();
        }
        if (getActivatableItemData() != null) {
            _hashCode += getActivatableItemData().hashCode();
        }
        if (getChannelPartners() != null) {
            _hashCode += getChannelPartners().hashCode();
        }
        if (getEntitlementAttributes() != null) {
            _hashCode += getEntitlementAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivatableItemDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activatableItemDetailType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activatableItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activatableItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "ActivatableItemType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentBulkEntitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentBulkEntitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "soldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "shipToEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "shipToAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activatableItemData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activatableItemData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemDataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "channelPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "channelPartnerDataListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeDescriptorDataType"));
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
