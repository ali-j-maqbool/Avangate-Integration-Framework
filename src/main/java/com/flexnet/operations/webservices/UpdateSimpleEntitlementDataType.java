/**
 * UpdateSimpleEntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UpdateSimpleEntitlementDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier;

    private com.flexnet.operations.webservices.IdType entitlementId;

    private java.lang.String description;

    private java.lang.String soldTo;

    private java.lang.String shipToEmail;

    private java.lang.String shipToAddress;

    private java.lang.Boolean autoDeploy;

    private com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners;

    private java.lang.Boolean allowPortalLogin;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType entitlementAttributes;

    public UpdateSimpleEntitlementDataType() {
    }

    public UpdateSimpleEntitlementDataType(
           com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier,
           com.flexnet.operations.webservices.IdType entitlementId,
           java.lang.String description,
           java.lang.String soldTo,
           java.lang.String shipToEmail,
           java.lang.String shipToAddress,
           java.lang.Boolean autoDeploy,
           com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners,
           java.lang.Boolean allowPortalLogin,
           com.flexnet.operations.webservices.AttributeDescriptorDataType entitlementAttributes) {
           this.entitlementIdentifier = entitlementIdentifier;
           this.entitlementId = entitlementId;
           this.description = description;
           this.soldTo = soldTo;
           this.shipToEmail = shipToEmail;
           this.shipToAddress = shipToAddress;
           this.autoDeploy = autoDeploy;
           this.channelPartners = channelPartners;
           this.allowPortalLogin = allowPortalLogin;
           this.entitlementAttributes = entitlementAttributes;
    }


    /**
     * Gets the entitlementIdentifier value for this UpdateSimpleEntitlementDataType.
     * 
     * @return entitlementIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getEntitlementIdentifier() {
        return entitlementIdentifier;
    }


    /**
     * Sets the entitlementIdentifier value for this UpdateSimpleEntitlementDataType.
     * 
     * @param entitlementIdentifier
     */
    public void setEntitlementIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier) {
        this.entitlementIdentifier = entitlementIdentifier;
    }


    /**
     * Gets the entitlementId value for this UpdateSimpleEntitlementDataType.
     * 
     * @return entitlementId
     */
    public com.flexnet.operations.webservices.IdType getEntitlementId() {
        return entitlementId;
    }


    /**
     * Sets the entitlementId value for this UpdateSimpleEntitlementDataType.
     * 
     * @param entitlementId
     */
    public void setEntitlementId(com.flexnet.operations.webservices.IdType entitlementId) {
        this.entitlementId = entitlementId;
    }


    /**
     * Gets the description value for this UpdateSimpleEntitlementDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UpdateSimpleEntitlementDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the soldTo value for this UpdateSimpleEntitlementDataType.
     * 
     * @return soldTo
     */
    public java.lang.String getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this UpdateSimpleEntitlementDataType.
     * 
     * @param soldTo
     */
    public void setSoldTo(java.lang.String soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the shipToEmail value for this UpdateSimpleEntitlementDataType.
     * 
     * @return shipToEmail
     */
    public java.lang.String getShipToEmail() {
        return shipToEmail;
    }


    /**
     * Sets the shipToEmail value for this UpdateSimpleEntitlementDataType.
     * 
     * @param shipToEmail
     */
    public void setShipToEmail(java.lang.String shipToEmail) {
        this.shipToEmail = shipToEmail;
    }


    /**
     * Gets the shipToAddress value for this UpdateSimpleEntitlementDataType.
     * 
     * @return shipToAddress
     */
    public java.lang.String getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this UpdateSimpleEntitlementDataType.
     * 
     * @param shipToAddress
     */
    public void setShipToAddress(java.lang.String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the autoDeploy value for this UpdateSimpleEntitlementDataType.
     * 
     * @return autoDeploy
     */
    public java.lang.Boolean getAutoDeploy() {
        return autoDeploy;
    }


    /**
     * Sets the autoDeploy value for this UpdateSimpleEntitlementDataType.
     * 
     * @param autoDeploy
     */
    public void setAutoDeploy(java.lang.Boolean autoDeploy) {
        this.autoDeploy = autoDeploy;
    }


    /**
     * Gets the channelPartners value for this UpdateSimpleEntitlementDataType.
     * 
     * @return channelPartners
     */
    public com.flexnet.operations.webservices.ChannelPartnerDataListType getChannelPartners() {
        return channelPartners;
    }


    /**
     * Sets the channelPartners value for this UpdateSimpleEntitlementDataType.
     * 
     * @param channelPartners
     */
    public void setChannelPartners(com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners) {
        this.channelPartners = channelPartners;
    }


    /**
     * Gets the allowPortalLogin value for this UpdateSimpleEntitlementDataType.
     * 
     * @return allowPortalLogin
     */
    public java.lang.Boolean getAllowPortalLogin() {
        return allowPortalLogin;
    }


    /**
     * Sets the allowPortalLogin value for this UpdateSimpleEntitlementDataType.
     * 
     * @param allowPortalLogin
     */
    public void setAllowPortalLogin(java.lang.Boolean allowPortalLogin) {
        this.allowPortalLogin = allowPortalLogin;
    }


    /**
     * Gets the entitlementAttributes value for this UpdateSimpleEntitlementDataType.
     * 
     * @return entitlementAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getEntitlementAttributes() {
        return entitlementAttributes;
    }


    /**
     * Sets the entitlementAttributes value for this UpdateSimpleEntitlementDataType.
     * 
     * @param entitlementAttributes
     */
    public void setEntitlementAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType entitlementAttributes) {
        this.entitlementAttributes = entitlementAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSimpleEntitlementDataType)) return false;
        UpdateSimpleEntitlementDataType other = (UpdateSimpleEntitlementDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitlementIdentifier==null && other.getEntitlementIdentifier()==null) || 
             (this.entitlementIdentifier!=null &&
              this.entitlementIdentifier.equals(other.getEntitlementIdentifier()))) &&
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
            ((this.autoDeploy==null && other.getAutoDeploy()==null) || 
             (this.autoDeploy!=null &&
              this.autoDeploy.equals(other.getAutoDeploy()))) &&
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
        if (getEntitlementIdentifier() != null) {
            _hashCode += getEntitlementIdentifier().hashCode();
        }
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
        if (getAutoDeploy() != null) {
            _hashCode += getAutoDeploy().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateSimpleEntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateSimpleEntitlementDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "idType"));
        elemField.setMinOccurs(0);
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
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("autoDeploy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "autoDeploy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
