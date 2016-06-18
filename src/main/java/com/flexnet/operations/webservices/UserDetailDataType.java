/**
 * UserDetailDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UserDetailDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.UserIdentifierType userIdentifier;

    private java.lang.String displayName;

    private java.lang.Boolean optIn;

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

    private java.lang.String domain;

    private java.util.Calendar dateCreated;

    private java.util.Calendar dateLastModified;

    private java.util.Calendar dateLastLogin;

    private com.flexnet.operations.webservices.UserOrganizationsListType orgRolesList;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes;

    public UserDetailDataType() {
    }

    public UserDetailDataType(
           com.flexnet.operations.webservices.UserIdentifierType userIdentifier,
           java.lang.String displayName,
           java.lang.Boolean optIn,
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
           java.lang.String domain,
           java.util.Calendar dateCreated,
           java.util.Calendar dateLastModified,
           java.util.Calendar dateLastLogin,
           com.flexnet.operations.webservices.UserOrganizationsListType orgRolesList,
           com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes) {
           this.userIdentifier = userIdentifier;
           this.displayName = displayName;
           this.optIn = optIn;
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
           this.domain = domain;
           this.dateCreated = dateCreated;
           this.dateLastModified = dateLastModified;
           this.dateLastLogin = dateLastLogin;
           this.orgRolesList = orgRolesList;
           this.customAttributes = customAttributes;
    }


    /**
     * Gets the userIdentifier value for this UserDetailDataType.
     * 
     * @return userIdentifier
     */
    public com.flexnet.operations.webservices.UserIdentifierType getUserIdentifier() {
        return userIdentifier;
    }


    /**
     * Sets the userIdentifier value for this UserDetailDataType.
     * 
     * @param userIdentifier
     */
    public void setUserIdentifier(com.flexnet.operations.webservices.UserIdentifierType userIdentifier) {
        this.userIdentifier = userIdentifier;
    }


    /**
     * Gets the displayName value for this UserDetailDataType.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this UserDetailDataType.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the optIn value for this UserDetailDataType.
     * 
     * @return optIn
     */
    public java.lang.Boolean getOptIn() {
        return optIn;
    }


    /**
     * Sets the optIn value for this UserDetailDataType.
     * 
     * @param optIn
     */
    public void setOptIn(java.lang.Boolean optIn) {
        this.optIn = optIn;
    }


    /**
     * Gets the faxNumber value for this UserDetailDataType.
     * 
     * @return faxNumber
     */
    public java.lang.String getFaxNumber() {
        return faxNumber;
    }


    /**
     * Sets the faxNumber value for this UserDetailDataType.
     * 
     * @param faxNumber
     */
    public void setFaxNumber(java.lang.String faxNumber) {
        this.faxNumber = faxNumber;
    }


    /**
     * Gets the street value for this UserDetailDataType.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this UserDetailDataType.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the city value for this UserDetailDataType.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this UserDetailDataType.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this UserDetailDataType.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this UserDetailDataType.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zipcode value for this UserDetailDataType.
     * 
     * @return zipcode
     */
    public java.lang.String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this UserDetailDataType.
     * 
     * @param zipcode
     */
    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the country value for this UserDetailDataType.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this UserDetailDataType.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the status value for this UserDetailDataType.
     * 
     * @return status
     */
    public com.flexnet.operations.webservices.UserStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UserDetailDataType.
     * 
     * @param status
     */
    public void setStatus(com.flexnet.operations.webservices.UserStatusType status) {
        this.status = status;
    }


    /**
     * Gets the locale value for this UserDetailDataType.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this UserDetailDataType.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the timezone value for this UserDetailDataType.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this UserDetailDataType.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the shared value for this UserDetailDataType.
     * 
     * @return shared
     */
    public java.lang.Boolean getShared() {
        return shared;
    }


    /**
     * Sets the shared value for this UserDetailDataType.
     * 
     * @param shared
     */
    public void setShared(java.lang.Boolean shared) {
        this.shared = shared;
    }


    /**
     * Gets the domain value for this UserDetailDataType.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this UserDetailDataType.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the dateCreated value for this UserDetailDataType.
     * 
     * @return dateCreated
     */
    public java.util.Calendar getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this UserDetailDataType.
     * 
     * @param dateCreated
     */
    public void setDateCreated(java.util.Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the dateLastModified value for this UserDetailDataType.
     * 
     * @return dateLastModified
     */
    public java.util.Calendar getDateLastModified() {
        return dateLastModified;
    }


    /**
     * Sets the dateLastModified value for this UserDetailDataType.
     * 
     * @param dateLastModified
     */
    public void setDateLastModified(java.util.Calendar dateLastModified) {
        this.dateLastModified = dateLastModified;
    }


    /**
     * Gets the dateLastLogin value for this UserDetailDataType.
     * 
     * @return dateLastLogin
     */
    public java.util.Calendar getDateLastLogin() {
        return dateLastLogin;
    }


    /**
     * Sets the dateLastLogin value for this UserDetailDataType.
     * 
     * @param dateLastLogin
     */
    public void setDateLastLogin(java.util.Calendar dateLastLogin) {
        this.dateLastLogin = dateLastLogin;
    }


    /**
     * Gets the orgRolesList value for this UserDetailDataType.
     * 
     * @return orgRolesList
     */
    public com.flexnet.operations.webservices.UserOrganizationsListType getOrgRolesList() {
        return orgRolesList;
    }


    /**
     * Sets the orgRolesList value for this UserDetailDataType.
     * 
     * @param orgRolesList
     */
    public void setOrgRolesList(com.flexnet.operations.webservices.UserOrganizationsListType orgRolesList) {
        this.orgRolesList = orgRolesList;
    }


    /**
     * Gets the customAttributes value for this UserDetailDataType.
     * 
     * @return customAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this UserDetailDataType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes) {
        this.customAttributes = customAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDetailDataType)) return false;
        UserDetailDataType other = (UserDetailDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userIdentifier==null && other.getUserIdentifier()==null) || 
             (this.userIdentifier!=null &&
              this.userIdentifier.equals(other.getUserIdentifier()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.optIn==null && other.getOptIn()==null) || 
             (this.optIn!=null &&
              this.optIn.equals(other.getOptIn()))) &&
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
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.dateLastModified==null && other.getDateLastModified()==null) || 
             (this.dateLastModified!=null &&
              this.dateLastModified.equals(other.getDateLastModified()))) &&
            ((this.dateLastLogin==null && other.getDateLastLogin()==null) || 
             (this.dateLastLogin!=null &&
              this.dateLastLogin.equals(other.getDateLastLogin()))) &&
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
        if (getUserIdentifier() != null) {
            _hashCode += getUserIdentifier().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getOptIn() != null) {
            _hashCode += getOptIn().hashCode();
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
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDateLastModified() != null) {
            _hashCode += getDateLastModified().hashCode();
        }
        if (getDateLastLogin() != null) {
            _hashCode += getDateLastLogin().hashCode();
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
        new org.apache.axis.description.TypeDesc(UserDetailDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userDetailDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userIdentifierType"));
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
        elemField.setFieldName("optIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "optIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "dateLastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLastLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "dateLastLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgRolesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgRolesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userOrganizationsListType"));
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
