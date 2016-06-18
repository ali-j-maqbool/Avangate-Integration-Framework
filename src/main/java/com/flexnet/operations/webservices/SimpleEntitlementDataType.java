/**
 * SimpleEntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class SimpleEntitlementDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.IdType entitlementId;

    private java.lang.String description;

    private java.lang.String soldTo;

    private java.lang.String shipToEmail;

    private java.lang.String shipToAddress;

    private com.flexnet.operations.webservices.StateType state;

    private java.lang.String createdUserId;

    private com.flexnet.operations.webservices.EntitlementLineItemDataType[] lineItems;

    private com.flexnet.operations.webservices.MaintenanceLineItemDataType[] maintenanceLineItems;

    private com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners;

    private java.lang.Boolean allowPortalLogin;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType entitlementAttributes;

    public SimpleEntitlementDataType() {
    }

    public SimpleEntitlementDataType(
           com.flexnet.operations.webservices.IdType entitlementId,
           java.lang.String description,
           java.lang.String soldTo,
           java.lang.String shipToEmail,
           java.lang.String shipToAddress,
           com.flexnet.operations.webservices.StateType state,
           java.lang.String createdUserId,
           com.flexnet.operations.webservices.EntitlementLineItemDataType[] lineItems,
           com.flexnet.operations.webservices.MaintenanceLineItemDataType[] maintenanceLineItems,
           com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners,
           java.lang.Boolean allowPortalLogin,
           com.flexnet.operations.webservices.AttributeDescriptorDataType entitlementAttributes) {
           this.entitlementId = entitlementId;
           this.description = description;
           this.soldTo = soldTo;
           this.shipToEmail = shipToEmail;
           this.shipToAddress = shipToAddress;
           this.state = state;
           this.createdUserId = createdUserId;
           this.lineItems = lineItems;
           this.maintenanceLineItems = maintenanceLineItems;
           this.channelPartners = channelPartners;
           this.allowPortalLogin = allowPortalLogin;
           this.entitlementAttributes = entitlementAttributes;
    }


    /**
     * Gets the entitlementId value for this SimpleEntitlementDataType.
     * 
     * @return entitlementId
     */
    public com.flexnet.operations.webservices.IdType getEntitlementId() {
        return entitlementId;
    }


    /**
     * Sets the entitlementId value for this SimpleEntitlementDataType.
     * 
     * @param entitlementId
     */
    public void setEntitlementId(com.flexnet.operations.webservices.IdType entitlementId) {
        this.entitlementId = entitlementId;
    }


    /**
     * Gets the description value for this SimpleEntitlementDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SimpleEntitlementDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the soldTo value for this SimpleEntitlementDataType.
     * 
     * @return soldTo
     */
    public java.lang.String getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this SimpleEntitlementDataType.
     * 
     * @param soldTo
     */
    public void setSoldTo(java.lang.String soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the shipToEmail value for this SimpleEntitlementDataType.
     * 
     * @return shipToEmail
     */
    public java.lang.String getShipToEmail() {
        return shipToEmail;
    }


    /**
     * Sets the shipToEmail value for this SimpleEntitlementDataType.
     * 
     * @param shipToEmail
     */
    public void setShipToEmail(java.lang.String shipToEmail) {
        this.shipToEmail = shipToEmail;
    }


    /**
     * Gets the shipToAddress value for this SimpleEntitlementDataType.
     * 
     * @return shipToAddress
     */
    public java.lang.String getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this SimpleEntitlementDataType.
     * 
     * @param shipToAddress
     */
    public void setShipToAddress(java.lang.String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the state value for this SimpleEntitlementDataType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.StateType getState() {
        return state;
    }


    /**
     * Sets the state value for this SimpleEntitlementDataType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.StateType state) {
        this.state = state;
    }


    /**
     * Gets the createdUserId value for this SimpleEntitlementDataType.
     * 
     * @return createdUserId
     */
    public java.lang.String getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this SimpleEntitlementDataType.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(java.lang.String createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the lineItems value for this SimpleEntitlementDataType.
     * 
     * @return lineItems
     */
    public com.flexnet.operations.webservices.EntitlementLineItemDataType[] getLineItems() {
        return lineItems;
    }


    /**
     * Sets the lineItems value for this SimpleEntitlementDataType.
     * 
     * @param lineItems
     */
    public void setLineItems(com.flexnet.operations.webservices.EntitlementLineItemDataType[] lineItems) {
        this.lineItems = lineItems;
    }

    public com.flexnet.operations.webservices.EntitlementLineItemDataType getLineItems(int i) {
        return this.lineItems[i];
    }

    public void setLineItems(int i, com.flexnet.operations.webservices.EntitlementLineItemDataType _value) {
        this.lineItems[i] = _value;
    }


    /**
     * Gets the maintenanceLineItems value for this SimpleEntitlementDataType.
     * 
     * @return maintenanceLineItems
     */
    public com.flexnet.operations.webservices.MaintenanceLineItemDataType[] getMaintenanceLineItems() {
        return maintenanceLineItems;
    }


    /**
     * Sets the maintenanceLineItems value for this SimpleEntitlementDataType.
     * 
     * @param maintenanceLineItems
     */
    public void setMaintenanceLineItems(com.flexnet.operations.webservices.MaintenanceLineItemDataType[] maintenanceLineItems) {
        this.maintenanceLineItems = maintenanceLineItems;
    }

    public com.flexnet.operations.webservices.MaintenanceLineItemDataType getMaintenanceLineItems(int i) {
        return this.maintenanceLineItems[i];
    }

    public void setMaintenanceLineItems(int i, com.flexnet.operations.webservices.MaintenanceLineItemDataType _value) {
        this.maintenanceLineItems[i] = _value;
    }


    /**
     * Gets the channelPartners value for this SimpleEntitlementDataType.
     * 
     * @return channelPartners
     */
    public com.flexnet.operations.webservices.ChannelPartnerDataListType getChannelPartners() {
        return channelPartners;
    }


    /**
     * Sets the channelPartners value for this SimpleEntitlementDataType.
     * 
     * @param channelPartners
     */
    public void setChannelPartners(com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners) {
        this.channelPartners = channelPartners;
    }


    /**
     * Gets the allowPortalLogin value for this SimpleEntitlementDataType.
     * 
     * @return allowPortalLogin
     */
    public java.lang.Boolean getAllowPortalLogin() {
        return allowPortalLogin;
    }


    /**
     * Sets the allowPortalLogin value for this SimpleEntitlementDataType.
     * 
     * @param allowPortalLogin
     */
    public void setAllowPortalLogin(java.lang.Boolean allowPortalLogin) {
        this.allowPortalLogin = allowPortalLogin;
    }


    /**
     * Gets the entitlementAttributes value for this SimpleEntitlementDataType.
     * 
     * @return entitlementAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getEntitlementAttributes() {
        return entitlementAttributes;
    }


    /**
     * Sets the entitlementAttributes value for this SimpleEntitlementDataType.
     * 
     * @param entitlementAttributes
     */
    public void setEntitlementAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType entitlementAttributes) {
        this.entitlementAttributes = entitlementAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleEntitlementDataType)) return false;
        SimpleEntitlementDataType other = (SimpleEntitlementDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitlementId==null && other.getEntitlementId()==null) || 
             (this.entitlementId!=null &&
              this.entitlementId.equals(other.getEntitlementId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.shipToEmail==null && other.getShipToEmail()==null) || 
             (this.shipToEmail!=null &&
              this.shipToEmail.equals(other.getShipToEmail()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.createdUserId==null && other.getCreatedUserId()==null) || 
             (this.createdUserId!=null &&
              this.createdUserId.equals(other.getCreatedUserId()))) &&
            ((this.lineItems==null && other.getLineItems()==null) || 
             (this.lineItems!=null &&
              java.util.Arrays.equals(this.lineItems, other.getLineItems()))) &&
            ((this.maintenanceLineItems==null && other.getMaintenanceLineItems()==null) || 
             (this.maintenanceLineItems!=null &&
              java.util.Arrays.equals(this.maintenanceLineItems, other.getMaintenanceLineItems()))) &&
            ((this.channelPartners==null && other.getChannelPartners()==null) || 
             (this.channelPartners!=null &&
              this.channelPartners.equals(other.getChannelPartners()))) &&
            ((this.allowPortalLogin==null && other.getAllowPortalLogin()==null) || 
             (this.allowPortalLogin!=null &&
              this.allowPortalLogin.equals(other.getAllowPortalLogin()))) &&
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
        if (getEntitlementId() != null) {
            _hashCode += getEntitlementId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCreatedUserId() != null) {
            _hashCode += getCreatedUserId().hashCode();
        }
        if (getLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaintenanceLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaintenanceLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaintenanceLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChannelPartners() != null) {
            _hashCode += getChannelPartners().hashCode();
        }
        if (getAllowPortalLogin() != null) {
            _hashCode += getAllowPortalLogin().hashCode();
        }
        if (getEntitlementAttributes() != null) {
            _hashCode += getEntitlementAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimpleEntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "simpleEntitlementDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("lineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItemDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "channelPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "channelPartnerDataListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPortalLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "allowPortalLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
