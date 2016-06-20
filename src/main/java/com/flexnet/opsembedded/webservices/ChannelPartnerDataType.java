/**
 * ChannelPartnerDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class ChannelPartnerDataType  implements java.io.Serializable {
    private java.lang.String tierName;

    private com.flexnet.opsembedded.webservices.OrganizationIdentifierType organizationUnit;

    private com.flexnet.opsembedded.webservices.UserIdentifierType contact;

    private java.lang.Boolean currentOwner;

    public ChannelPartnerDataType() {
    }

    public ChannelPartnerDataType(
           java.lang.String tierName,
           com.flexnet.opsembedded.webservices.OrganizationIdentifierType organizationUnit,
           com.flexnet.opsembedded.webservices.UserIdentifierType contact,
           java.lang.Boolean currentOwner) {
           this.tierName = tierName;
           this.organizationUnit = organizationUnit;
           this.contact = contact;
           this.currentOwner = currentOwner;
    }


    /**
     * Gets the tierName value for this ChannelPartnerDataType.
     * 
     * @return tierName
     */
    public java.lang.String getTierName() {
        return tierName;
    }


    /**
     * Sets the tierName value for this ChannelPartnerDataType.
     * 
     * @param tierName
     */
    public void setTierName(java.lang.String tierName) {
        this.tierName = tierName;
    }


    /**
     * Gets the organizationUnit value for this ChannelPartnerDataType.
     * 
     * @return organizationUnit
     */
    public com.flexnet.opsembedded.webservices.OrganizationIdentifierType getOrganizationUnit() {
        return organizationUnit;
    }


    /**
     * Sets the organizationUnit value for this ChannelPartnerDataType.
     * 
     * @param organizationUnit
     */
    public void setOrganizationUnit(com.flexnet.opsembedded.webservices.OrganizationIdentifierType organizationUnit) {
        this.organizationUnit = organizationUnit;
    }


    /**
     * Gets the contact value for this ChannelPartnerDataType.
     * 
     * @return contact
     */
    public com.flexnet.opsembedded.webservices.UserIdentifierType getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this ChannelPartnerDataType.
     * 
     * @param contact
     */
    public void setContact(com.flexnet.opsembedded.webservices.UserIdentifierType contact) {
        this.contact = contact;
    }


    /**
     * Gets the currentOwner value for this ChannelPartnerDataType.
     * 
     * @return currentOwner
     */
    public java.lang.Boolean getCurrentOwner() {
        return currentOwner;
    }


    /**
     * Sets the currentOwner value for this ChannelPartnerDataType.
     * 
     * @param currentOwner
     */
    public void setCurrentOwner(java.lang.Boolean currentOwner) {
        this.currentOwner = currentOwner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChannelPartnerDataType)) return false;
        ChannelPartnerDataType other = (ChannelPartnerDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tierName==null && other.getTierName()==null) || 
             (this.tierName!=null &&
              this.tierName.equals(other.getTierName()))) &&
            ((this.organizationUnit==null && other.getOrganizationUnit()==null) || 
             (this.organizationUnit!=null &&
              this.organizationUnit.equals(other.getOrganizationUnit()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.currentOwner==null && other.getCurrentOwner()==null) || 
             (this.currentOwner!=null &&
              this.currentOwner.equals(other.getCurrentOwner())));
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
        if (getTierName() != null) {
            _hashCode += getTierName().hashCode();
        }
        if (getOrganizationUnit() != null) {
            _hashCode += getOrganizationUnit().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getCurrentOwner() != null) {
            _hashCode += getCurrentOwner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChannelPartnerDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "channelPartnerDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tierName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "tierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "organizationUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "organizationIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "userIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "currentOwner"));
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
