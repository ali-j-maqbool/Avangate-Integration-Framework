/**
 * UserQueryParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UserQueryParametersType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SimpleQueryType userName;

    private com.flexnet.operations.webservices.SimpleQueryType firstName;

    private com.flexnet.operations.webservices.SimpleQueryType lastName;

    private com.flexnet.operations.webservices.SimpleQueryType displayName;

    private com.flexnet.operations.webservices.SimpleQueryType emailAddress;

    private com.flexnet.operations.webservices.SimpleQueryType phoneNumber;

    private com.flexnet.operations.webservices.SimpleQueryType faxNumber;

    private com.flexnet.operations.webservices.SimpleQueryType street;

    private com.flexnet.operations.webservices.SimpleQueryType city;

    private com.flexnet.operations.webservices.SimpleQueryType state;

    private com.flexnet.operations.webservices.SimpleQueryType zipcode;

    private com.flexnet.operations.webservices.SimpleQueryType country;

    private java.lang.Boolean isActive;

    private java.lang.Boolean canLogIn;

    private com.flexnet.operations.webservices.SimpleQueryType orgName;

    private com.flexnet.operations.webservices.SimpleQueryType orgDisplayName;

    private com.flexnet.operations.webservices.UserCustomAttributesQueryListType customAttributes;

    private com.flexnet.operations.webservices.DateTimeQueryType lastModifiedDateTime;

    private com.flexnet.operations.webservices.OrgType orgType;

    public UserQueryParametersType() {
    }

    public UserQueryParametersType(
           com.flexnet.operations.webservices.SimpleQueryType userName,
           com.flexnet.operations.webservices.SimpleQueryType firstName,
           com.flexnet.operations.webservices.SimpleQueryType lastName,
           com.flexnet.operations.webservices.SimpleQueryType displayName,
           com.flexnet.operations.webservices.SimpleQueryType emailAddress,
           com.flexnet.operations.webservices.SimpleQueryType phoneNumber,
           com.flexnet.operations.webservices.SimpleQueryType faxNumber,
           com.flexnet.operations.webservices.SimpleQueryType street,
           com.flexnet.operations.webservices.SimpleQueryType city,
           com.flexnet.operations.webservices.SimpleQueryType state,
           com.flexnet.operations.webservices.SimpleQueryType zipcode,
           com.flexnet.operations.webservices.SimpleQueryType country,
           java.lang.Boolean isActive,
           java.lang.Boolean canLogIn,
           com.flexnet.operations.webservices.SimpleQueryType orgName,
           com.flexnet.operations.webservices.SimpleQueryType orgDisplayName,
           com.flexnet.operations.webservices.UserCustomAttributesQueryListType customAttributes,
           com.flexnet.operations.webservices.DateTimeQueryType lastModifiedDateTime,
           com.flexnet.operations.webservices.OrgType orgType) {
           this.userName = userName;
           this.firstName = firstName;
           this.lastName = lastName;
           this.displayName = displayName;
           this.emailAddress = emailAddress;
           this.phoneNumber = phoneNumber;
           this.faxNumber = faxNumber;
           this.street = street;
           this.city = city;
           this.state = state;
           this.zipcode = zipcode;
           this.country = country;
           this.isActive = isActive;
           this.canLogIn = canLogIn;
           this.orgName = orgName;
           this.orgDisplayName = orgDisplayName;
           this.customAttributes = customAttributes;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.orgType = orgType;
    }


    /**
     * Gets the userName value for this UserQueryParametersType.
     * 
     * @return userName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this UserQueryParametersType.
     * 
     * @param userName
     */
    public void setUserName(com.flexnet.operations.webservices.SimpleQueryType userName) {
        this.userName = userName;
    }


    /**
     * Gets the firstName value for this UserQueryParametersType.
     * 
     * @return firstName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this UserQueryParametersType.
     * 
     * @param firstName
     */
    public void setFirstName(com.flexnet.operations.webservices.SimpleQueryType firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this UserQueryParametersType.
     * 
     * @return lastName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this UserQueryParametersType.
     * 
     * @param lastName
     */
    public void setLastName(com.flexnet.operations.webservices.SimpleQueryType lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the displayName value for this UserQueryParametersType.
     * 
     * @return displayName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this UserQueryParametersType.
     * 
     * @param displayName
     */
    public void setDisplayName(com.flexnet.operations.webservices.SimpleQueryType displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the emailAddress value for this UserQueryParametersType.
     * 
     * @return emailAddress
     */
    public com.flexnet.operations.webservices.SimpleQueryType getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this UserQueryParametersType.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(com.flexnet.operations.webservices.SimpleQueryType emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the phoneNumber value for this UserQueryParametersType.
     * 
     * @return phoneNumber
     */
    public com.flexnet.operations.webservices.SimpleQueryType getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this UserQueryParametersType.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(com.flexnet.operations.webservices.SimpleQueryType phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the faxNumber value for this UserQueryParametersType.
     * 
     * @return faxNumber
     */
    public com.flexnet.operations.webservices.SimpleQueryType getFaxNumber() {
        return faxNumber;
    }


    /**
     * Sets the faxNumber value for this UserQueryParametersType.
     * 
     * @param faxNumber
     */
    public void setFaxNumber(com.flexnet.operations.webservices.SimpleQueryType faxNumber) {
        this.faxNumber = faxNumber;
    }


    /**
     * Gets the street value for this UserQueryParametersType.
     * 
     * @return street
     */
    public com.flexnet.operations.webservices.SimpleQueryType getStreet() {
        return street;
    }


    /**
     * Sets the street value for this UserQueryParametersType.
     * 
     * @param street
     */
    public void setStreet(com.flexnet.operations.webservices.SimpleQueryType street) {
        this.street = street;
    }


    /**
     * Gets the city value for this UserQueryParametersType.
     * 
     * @return city
     */
    public com.flexnet.operations.webservices.SimpleQueryType getCity() {
        return city;
    }


    /**
     * Sets the city value for this UserQueryParametersType.
     * 
     * @param city
     */
    public void setCity(com.flexnet.operations.webservices.SimpleQueryType city) {
        this.city = city;
    }


    /**
     * Gets the state value for this UserQueryParametersType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.SimpleQueryType getState() {
        return state;
    }


    /**
     * Sets the state value for this UserQueryParametersType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.SimpleQueryType state) {
        this.state = state;
    }


    /**
     * Gets the zipcode value for this UserQueryParametersType.
     * 
     * @return zipcode
     */
    public com.flexnet.operations.webservices.SimpleQueryType getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this UserQueryParametersType.
     * 
     * @param zipcode
     */
    public void setZipcode(com.flexnet.operations.webservices.SimpleQueryType zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the country value for this UserQueryParametersType.
     * 
     * @return country
     */
    public com.flexnet.operations.webservices.SimpleQueryType getCountry() {
        return country;
    }


    /**
     * Sets the country value for this UserQueryParametersType.
     * 
     * @param country
     */
    public void setCountry(com.flexnet.operations.webservices.SimpleQueryType country) {
        this.country = country;
    }


    /**
     * Gets the isActive value for this UserQueryParametersType.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this UserQueryParametersType.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the canLogIn value for this UserQueryParametersType.
     * 
     * @return canLogIn
     */
    public java.lang.Boolean getCanLogIn() {
        return canLogIn;
    }


    /**
     * Sets the canLogIn value for this UserQueryParametersType.
     * 
     * @param canLogIn
     */
    public void setCanLogIn(java.lang.Boolean canLogIn) {
        this.canLogIn = canLogIn;
    }


    /**
     * Gets the orgName value for this UserQueryParametersType.
     * 
     * @return orgName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this UserQueryParametersType.
     * 
     * @param orgName
     */
    public void setOrgName(com.flexnet.operations.webservices.SimpleQueryType orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the orgDisplayName value for this UserQueryParametersType.
     * 
     * @return orgDisplayName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getOrgDisplayName() {
        return orgDisplayName;
    }


    /**
     * Sets the orgDisplayName value for this UserQueryParametersType.
     * 
     * @param orgDisplayName
     */
    public void setOrgDisplayName(com.flexnet.operations.webservices.SimpleQueryType orgDisplayName) {
        this.orgDisplayName = orgDisplayName;
    }


    /**
     * Gets the customAttributes value for this UserQueryParametersType.
     * 
     * @return customAttributes
     */
    public com.flexnet.operations.webservices.UserCustomAttributesQueryListType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this UserQueryParametersType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.operations.webservices.UserCustomAttributesQueryListType customAttributes) {
        this.customAttributes = customAttributes;
    }


    /**
     * Gets the lastModifiedDateTime value for this UserQueryParametersType.
     * 
     * @return lastModifiedDateTime
     */
    public com.flexnet.operations.webservices.DateTimeQueryType getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this UserQueryParametersType.
     * 
     * @param lastModifiedDateTime
     */
    public void setLastModifiedDateTime(com.flexnet.operations.webservices.DateTimeQueryType lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the orgType value for this UserQueryParametersType.
     * 
     * @return orgType
     */
    public com.flexnet.operations.webservices.OrgType getOrgType() {
        return orgType;
    }


    /**
     * Sets the orgType value for this UserQueryParametersType.
     * 
     * @param orgType
     */
    public void setOrgType(com.flexnet.operations.webservices.OrgType orgType) {
        this.orgType = orgType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserQueryParametersType)) return false;
        UserQueryParametersType other = (UserQueryParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
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
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.canLogIn==null && other.getCanLogIn()==null) || 
             (this.canLogIn!=null &&
              this.canLogIn.equals(other.getCanLogIn()))) &&
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              this.orgName.equals(other.getOrgName()))) &&
            ((this.orgDisplayName==null && other.getOrgDisplayName()==null) || 
             (this.orgDisplayName!=null &&
              this.orgDisplayName.equals(other.getOrgDisplayName()))) &&
            ((this.customAttributes==null && other.getCustomAttributes()==null) || 
             (this.customAttributes!=null &&
              this.customAttributes.equals(other.getCustomAttributes()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.orgType==null && other.getOrgType()==null) || 
             (this.orgType!=null &&
              this.orgType.equals(other.getOrgType())));
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
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
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
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getCanLogIn() != null) {
            _hashCode += getCanLogIn().hashCode();
        }
        if (getOrgName() != null) {
            _hashCode += getOrgName().hashCode();
        }
        if (getOrgDisplayName() != null) {
            _hashCode += getOrgDisplayName().hashCode();
        }
        if (getCustomAttributes() != null) {
            _hashCode += getCustomAttributes().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getOrgType() != null) {
            _hashCode += getOrgType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserQueryParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userQueryParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "faxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipcode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "zipcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canLogIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "canLogIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userCustomAttributesQueryListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "OrgType"));
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
