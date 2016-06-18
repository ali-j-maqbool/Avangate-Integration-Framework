/**
 * EmailActivatableItemRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class EmailActivatableItemRequestType  implements java.io.Serializable {
    private java.lang.String activationId;

    private java.lang.Boolean ignoreExistingEmailList;

    private java.lang.Boolean validateEmailAddresses;

    private com.flexnet.operations.webservices.EmailContactListType emailIdList;

    private java.lang.String locale;

    public EmailActivatableItemRequestType() {
    }

    public EmailActivatableItemRequestType(
           java.lang.String activationId,
           java.lang.Boolean ignoreExistingEmailList,
           java.lang.Boolean validateEmailAddresses,
           com.flexnet.operations.webservices.EmailContactListType emailIdList,
           java.lang.String locale) {
           this.activationId = activationId;
           this.ignoreExistingEmailList = ignoreExistingEmailList;
           this.validateEmailAddresses = validateEmailAddresses;
           this.emailIdList = emailIdList;
           this.locale = locale;
    }


    /**
     * Gets the activationId value for this EmailActivatableItemRequestType.
     * 
     * @return activationId
     */
    public java.lang.String getActivationId() {
        return activationId;
    }


    /**
     * Sets the activationId value for this EmailActivatableItemRequestType.
     * 
     * @param activationId
     */
    public void setActivationId(java.lang.String activationId) {
        this.activationId = activationId;
    }


    /**
     * Gets the ignoreExistingEmailList value for this EmailActivatableItemRequestType.
     * 
     * @return ignoreExistingEmailList
     */
    public java.lang.Boolean getIgnoreExistingEmailList() {
        return ignoreExistingEmailList;
    }


    /**
     * Sets the ignoreExistingEmailList value for this EmailActivatableItemRequestType.
     * 
     * @param ignoreExistingEmailList
     */
    public void setIgnoreExistingEmailList(java.lang.Boolean ignoreExistingEmailList) {
        this.ignoreExistingEmailList = ignoreExistingEmailList;
    }


    /**
     * Gets the validateEmailAddresses value for this EmailActivatableItemRequestType.
     * 
     * @return validateEmailAddresses
     */
    public java.lang.Boolean getValidateEmailAddresses() {
        return validateEmailAddresses;
    }


    /**
     * Sets the validateEmailAddresses value for this EmailActivatableItemRequestType.
     * 
     * @param validateEmailAddresses
     */
    public void setValidateEmailAddresses(java.lang.Boolean validateEmailAddresses) {
        this.validateEmailAddresses = validateEmailAddresses;
    }


    /**
     * Gets the emailIdList value for this EmailActivatableItemRequestType.
     * 
     * @return emailIdList
     */
    public com.flexnet.operations.webservices.EmailContactListType getEmailIdList() {
        return emailIdList;
    }


    /**
     * Sets the emailIdList value for this EmailActivatableItemRequestType.
     * 
     * @param emailIdList
     */
    public void setEmailIdList(com.flexnet.operations.webservices.EmailContactListType emailIdList) {
        this.emailIdList = emailIdList;
    }


    /**
     * Gets the locale value for this EmailActivatableItemRequestType.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this EmailActivatableItemRequestType.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailActivatableItemRequestType)) return false;
        EmailActivatableItemRequestType other = (EmailActivatableItemRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activationId==null && other.getActivationId()==null) || 
             (this.activationId!=null &&
              this.activationId.equals(other.getActivationId()))) &&
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
        if (getActivationId() != null) {
            _hashCode += getActivationId().hashCode();
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
        new org.apache.axis.description.TypeDesc(EmailActivatableItemRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailActivatableItemRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
