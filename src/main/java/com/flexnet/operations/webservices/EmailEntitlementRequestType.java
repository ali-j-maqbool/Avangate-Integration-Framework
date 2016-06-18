/**
 * EmailEntitlementRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class EmailEntitlementRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier;

    private java.lang.Boolean ignoreExistingEmailList;

    private java.lang.Boolean validateEmailAddresses;

    private com.flexnet.operations.webservices.EmailContactListType emailIdList;

    private java.lang.String locale;

    public EmailEntitlementRequestType() {
    }

    public EmailEntitlementRequestType(
           com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier,
           java.lang.Boolean ignoreExistingEmailList,
           java.lang.Boolean validateEmailAddresses,
           com.flexnet.operations.webservices.EmailContactListType emailIdList,
           java.lang.String locale) {
           this.entitlementIdentifier = entitlementIdentifier;
           this.ignoreExistingEmailList = ignoreExistingEmailList;
           this.validateEmailAddresses = validateEmailAddresses;
           this.emailIdList = emailIdList;
           this.locale = locale;
    }


    /**
     * Gets the entitlementIdentifier value for this EmailEntitlementRequestType.
     * 
     * @return entitlementIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getEntitlementIdentifier() {
        return entitlementIdentifier;
    }


    /**
     * Sets the entitlementIdentifier value for this EmailEntitlementRequestType.
     * 
     * @param entitlementIdentifier
     */
    public void setEntitlementIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier) {
        this.entitlementIdentifier = entitlementIdentifier;
    }


    /**
     * Gets the ignoreExistingEmailList value for this EmailEntitlementRequestType.
     * 
     * @return ignoreExistingEmailList
     */
    public java.lang.Boolean getIgnoreExistingEmailList() {
        return ignoreExistingEmailList;
    }


    /**
     * Sets the ignoreExistingEmailList value for this EmailEntitlementRequestType.
     * 
     * @param ignoreExistingEmailList
     */
    public void setIgnoreExistingEmailList(java.lang.Boolean ignoreExistingEmailList) {
        this.ignoreExistingEmailList = ignoreExistingEmailList;
    }


    /**
     * Gets the validateEmailAddresses value for this EmailEntitlementRequestType.
     * 
     * @return validateEmailAddresses
     */
    public java.lang.Boolean getValidateEmailAddresses() {
        return validateEmailAddresses;
    }


    /**
     * Sets the validateEmailAddresses value for this EmailEntitlementRequestType.
     * 
     * @param validateEmailAddresses
     */
    public void setValidateEmailAddresses(java.lang.Boolean validateEmailAddresses) {
        this.validateEmailAddresses = validateEmailAddresses;
    }


    /**
     * Gets the emailIdList value for this EmailEntitlementRequestType.
     * 
     * @return emailIdList
     */
    public com.flexnet.operations.webservices.EmailContactListType getEmailIdList() {
        return emailIdList;
    }


    /**
     * Sets the emailIdList value for this EmailEntitlementRequestType.
     * 
     * @param emailIdList
     */
    public void setEmailIdList(com.flexnet.operations.webservices.EmailContactListType emailIdList) {
        this.emailIdList = emailIdList;
    }


    /**
     * Gets the locale value for this EmailEntitlementRequestType.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this EmailEntitlementRequestType.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailEntitlementRequestType)) return false;
        EmailEntitlementRequestType other = (EmailEntitlementRequestType) obj;
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
            ((this.ignoreExistingEmailList==null && other.getIgnoreExistingEmailList()==null) || 
             (this.ignoreExistingEmailList!=null &&
              this.ignoreExistingEmailList.equals(other.getIgnoreExistingEmailList()))) &&
            ((this.validateEmailAddresses==null && other.getValidateEmailAddresses()==null) || 
             (this.validateEmailAddresses!=null &&
              this.validateEmailAddresses.equals(other.getValidateEmailAddresses()))) &&
            ((this.emailIdList==null && other.getEmailIdList()==null) || 
             (this.emailIdList!=null &&
              this.emailIdList.equals(other.getEmailIdList()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale())));
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
        if (getIgnoreExistingEmailList() != null) {
            _hashCode += getIgnoreExistingEmailList().hashCode();
        }
        if (getValidateEmailAddresses() != null) {
            _hashCode += getValidateEmailAddresses().hashCode();
        }
        if (getEmailIdList() != null) {
            _hashCode += getEmailIdList().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailEntitlementRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailEntitlementRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreExistingEmailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "ignoreExistingEmailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validateEmailAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "validateEmailAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailContactListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
