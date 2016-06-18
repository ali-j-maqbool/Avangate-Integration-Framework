/**
 * UpdateUserDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UpdateUserDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.UserIdentifierType user;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String displayName;

    private java.lang.String emailAddress;

    private java.lang.Boolean optIn;

    private java.lang.String phoneNumber;

    private java.lang.String faxNumber;

    private java.lang.String street;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zipcode;

    private java.lang.String country;

    private com.flexnet.operations.webservices.UserStatusType status;

    private java.lang.String locale;

    private java.lang.String timezone;

    private java.lang.Boolean shared;

    private com.flexnet.operations.webservices.UpdateUserOrganizationsListType orgRolesList;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes;

    public UpdateUserDataType() {
    }

    public UpdateUserDataType(
           com.flexnet.operations.webservices.UserIdentifierType user,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String displayName,
           java.lang.String emailAddress,
           java.lang.Boolean optIn,
           java.lang.String phoneNumber,
           java.lang.String faxNumber,
           java.lang.String street,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zipcode,
           java.lang.String country,
           com.flexnet.operations.webservices.UserStatusType status,
           java.lang.String locale,
           java.lang.String timezone,
           java.lang.Boolean shared,
           com.flexnet.operations.webservices.UpdateUserOrganizationsListType orgRolesList,
           com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes) {
           this.user = user;
           this.firstName = firstName;
           this.lastName = lastName;
           this.displayName = displayName;
           this.emailAddress = emailAddress;
           this.optIn = optIn;
           this.phoneNumber = phoneNumber;
           this.faxNumber = faxNumber;
           this.street = street;
           this.city = city;
           this.state = state;
           this.zipcode = zipcode;
           this.country = country;
           this.status = status;
           this.locale = locale;
           this.timezone = timezone;
           this.shared = shared;
           this.orgRolesList = orgRolesList;
           this.customAttributes = customAttributes;
    }


    /**
     * Gets the user value for this UpdateUserDataType.
     * 
     * @return user
     */
    public com.flexnet.operations.webservices.UserIdentifierType getUser() {
        return user;
    }


    /**
     * Sets the user value for this UpdateUserDataType.
     * 
     * @param user
     */
    public void setUser(com.flexnet.operations.webservices.UserIdentifierType user) {
        this.user = user;
    }


    /**
     * Gets the firstName value for this UpdateUserDataType.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this UpdateUserDataType.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this UpdateUserDataType.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this UpdateUserDataType.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the displayName value for this UpdateUserDataType.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this UpdateUserDataType.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the emailAddress value for this UpdateUserDataType.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this UpdateUserDataType.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the optIn value for this UpdateUserDataType.
     * 
     * @return optIn
     */
    public java.lang.Boolean getOptIn() {
        return optIn;
    }


    /**
     * Sets the optIn value for this UpdateUserDataType.
     * 
     * @param optIn
     */
    public void setOptIn(java.lang.Boolean optIn) {
        this.optIn = optIn;
    }


    /**
     * Gets the phoneNumber value for this UpdateUserDataType.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this UpdateUserDataType.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the faxNumber value for this UpdateUserDataType.
     * 
     * @return faxNumber
     */
    public java.lang.String getFaxNumber() {
        return faxNumber;
    }


    /**
     * Sets the faxNumber value for this UpdateUserDataType.
     * 
     * @param faxNumber
     */
    public void setFaxNumber(java.lang.String faxNumber) {
        this.faxNumber = faxNumber;
    }


    /**
     * Gets the street value for this UpdateUserDataType.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this UpdateUserDataType.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the city value for this UpdateUserDataType.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this UpdateUserDataType.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this UpdateUserDataType.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this UpdateUserDataType.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zipcode value for this UpdateUserDataType.
     * 
     * @return zipcode
     */
    public java.lang.String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this UpdateUserDataType.
     * 
     * @param zipcode
     */
    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the country value for this UpdateUserDataType.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this UpdateUserDataType.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the status value for this UpdateUserDataType.
     * 
     * @return status
     */
    public com.flexnet.operations.webservices.UserStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UpdateUserDataType.
     * 
     * @param status
     */
    public void setStatus(com.flexnet.operations.webservices.UserStatusType status) {
        this.status = status;
    }


    /**
     * Gets the locale value for this UpdateUserDataType.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this UpdateUserDataType.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the timezone value for this UpdateUserDataType.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this UpdateUserDataType.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the shared value for this UpdateUserDataType.
     * 
     * @return shared
     */
    public java.lang.Boolean getShared() {
        return shared;
    }


    /**
     * Sets the shared value for this UpdateUserDataType.
     * 
     * @param shared
     */
    public void setShared(java.lang.Boolean shared) {
        this.shared = shared;
    }


    /**
     * Gets the orgRolesList value for this UpdateUserDataType.
     * 
     * @return orgRolesList
     */
    public com.flexnet.operations.webservices.UpdateUserOrganizationsListType getOrgRolesList() {
        return orgRolesList;
    }


    /**
     * Sets the orgRolesList value for this UpdateUserDataType.
     * 
     * @param orgRolesList
     */
    public void setOrgRolesList(com.flexnet.operations.webservices.UpdateUserOrganizationsListType orgRolesList) {
        this.orgRolesList = orgRolesList;
    }


    /**
     * Gets the customAttributes value for this UpdateUserDataType.
     * 
     * @return customAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this UpdateUserDataType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes) {
        this.customAttributes = customAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateUserDataType)) return false;
        UpdateUserDataType other = (UpdateUserDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.optIn==null && other.getOptIn()==null) || 
             (this.optIn!=null &&
              this.optIn.equals(other.getOptIn()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.faxNumber==null && other.getFaxNumber()==null) || 
             (this.faxNumber!=null &&
              this.faxNumber.equals(other.getFaxNumber()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zipcode==null && other.getZipcode()==null) || 
             (this.zipcode!=null &&
              this.zipcode.equals(other.getZipcode()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone()))) &&
            ((this.shared==null && other.getShared()==null) || 
             (this.shared!=null &&
              this.shared.equals(other.getShared()))) &&
            ((this.orgRolesList==null && other.getOrgRolesList()==null) || 
             (this.orgRolesList!=null &&
              this.orgRolesList.equals(other.getOrgRolesList()))) &&
            ((this.customAttributes==null && other.getCustomAttributes()==null) || 
             (this.customAttributes!=null &&
              this.customAttributes.equals(other.getCustomAttributes())));
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getOptIn() != null) {
            _hashCode += getOptIn().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getFaxNumber() != null) {
            _hashCode += getFaxNumber().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZipcode() != null) {
            _hashCode += getZipcode().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        if (getShared() != null) {
            _hashCode += getShared().hashCode();
        }
        if (getOrgRolesList() != null) {
            _hashCode += getOrgRolesList().hashCode();
        }
        if (getCustomAttributes() != null) {
            _hashCode += getCustomAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateUserDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "optIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "faxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipcode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "zipcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "UserStatusType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shared");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "shared"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgRolesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgRolesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserOrganizationsListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customAttributes"));
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
