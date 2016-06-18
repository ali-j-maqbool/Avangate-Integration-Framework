/**
 * OrganizationQueryParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class OrganizationQueryParametersType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SimpleQueryType orgName;

    private com.flexnet.operations.webservices.SimpleQueryType orgDisplayName;

    private com.flexnet.operations.webservices.SimpleQueryType description;

    private com.flexnet.operations.webservices.SimpleQueryType address1;

    private com.flexnet.operations.webservices.SimpleQueryType address2;

    private com.flexnet.operations.webservices.SimpleQueryType city;

    private com.flexnet.operations.webservices.SimpleQueryType state;

    private com.flexnet.operations.webservices.SimpleQueryType zipcode;

    private com.flexnet.operations.webservices.SimpleQueryType country;

    private com.flexnet.operations.webservices.SimpleQueryType region;

    private java.lang.Boolean onlyRootOrgs;

    private com.flexnet.operations.webservices.OrgType orgType;

    private com.flexnet.operations.webservices.OrgTypeList orgTypeList;

    private com.flexnet.operations.webservices.OrgCustomAttributesQueryListType customAttributes;

    private com.flexnet.operations.webservices.DateTimeQueryType lastModifiedDateTime;

    public OrganizationQueryParametersType() {
    }

    public OrganizationQueryParametersType(
           com.flexnet.operations.webservices.SimpleQueryType orgName,
           com.flexnet.operations.webservices.SimpleQueryType orgDisplayName,
           com.flexnet.operations.webservices.SimpleQueryType description,
           com.flexnet.operations.webservices.SimpleQueryType address1,
           com.flexnet.operations.webservices.SimpleQueryType address2,
           com.flexnet.operations.webservices.SimpleQueryType city,
           com.flexnet.operations.webservices.SimpleQueryType state,
           com.flexnet.operations.webservices.SimpleQueryType zipcode,
           com.flexnet.operations.webservices.SimpleQueryType country,
           com.flexnet.operations.webservices.SimpleQueryType region,
           java.lang.Boolean onlyRootOrgs,
           com.flexnet.operations.webservices.OrgType orgType,
           com.flexnet.operations.webservices.OrgTypeList orgTypeList,
           com.flexnet.operations.webservices.OrgCustomAttributesQueryListType customAttributes,
           com.flexnet.operations.webservices.DateTimeQueryType lastModifiedDateTime) {
           this.orgName = orgName;
           this.orgDisplayName = orgDisplayName;
           this.description = description;
           this.address1 = address1;
           this.address2 = address2;
           this.city = city;
           this.state = state;
           this.zipcode = zipcode;
           this.country = country;
           this.region = region;
           this.onlyRootOrgs = onlyRootOrgs;
           this.orgType = orgType;
           this.orgTypeList = orgTypeList;
           this.customAttributes = customAttributes;
           this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the orgName value for this OrganizationQueryParametersType.
     * 
     * @return orgName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this OrganizationQueryParametersType.
     * 
     * @param orgName
     */
    public void setOrgName(com.flexnet.operations.webservices.SimpleQueryType orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the orgDisplayName value for this OrganizationQueryParametersType.
     * 
     * @return orgDisplayName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getOrgDisplayName() {
        return orgDisplayName;
    }


    /**
     * Sets the orgDisplayName value for this OrganizationQueryParametersType.
     * 
     * @param orgDisplayName
     */
    public void setOrgDisplayName(com.flexnet.operations.webservices.SimpleQueryType orgDisplayName) {
        this.orgDisplayName = orgDisplayName;
    }


    /**
     * Gets the description value for this OrganizationQueryParametersType.
     * 
     * @return description
     */
    public com.flexnet.operations.webservices.SimpleQueryType getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OrganizationQueryParametersType.
     * 
     * @param description
     */
    public void setDescription(com.flexnet.operations.webservices.SimpleQueryType description) {
        this.description = description;
    }


    /**
     * Gets the address1 value for this OrganizationQueryParametersType.
     * 
     * @return address1
     */
    public com.flexnet.operations.webservices.SimpleQueryType getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this OrganizationQueryParametersType.
     * 
     * @param address1
     */
    public void setAddress1(com.flexnet.operations.webservices.SimpleQueryType address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this OrganizationQueryParametersType.
     * 
     * @return address2
     */
    public com.flexnet.operations.webservices.SimpleQueryType getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this OrganizationQueryParametersType.
     * 
     * @param address2
     */
    public void setAddress2(com.flexnet.operations.webservices.SimpleQueryType address2) {
        this.address2 = address2;
    }


    /**
     * Gets the city value for this OrganizationQueryParametersType.
     * 
     * @return city
     */
    public com.flexnet.operations.webservices.SimpleQueryType getCity() {
        return city;
    }


    /**
     * Sets the city value for this OrganizationQueryParametersType.
     * 
     * @param city
     */
    public void setCity(com.flexnet.operations.webservices.SimpleQueryType city) {
        this.city = city;
    }


    /**
     * Gets the state value for this OrganizationQueryParametersType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.SimpleQueryType getState() {
        return state;
    }


    /**
     * Sets the state value for this OrganizationQueryParametersType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.SimpleQueryType state) {
        this.state = state;
    }


    /**
     * Gets the zipcode value for this OrganizationQueryParametersType.
     * 
     * @return zipcode
     */
    public com.flexnet.operations.webservices.SimpleQueryType getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this OrganizationQueryParametersType.
     * 
     * @param zipcode
     */
    public void setZipcode(com.flexnet.operations.webservices.SimpleQueryType zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the country value for this OrganizationQueryParametersType.
     * 
     * @return country
     */
    public com.flexnet.operations.webservices.SimpleQueryType getCountry() {
        return country;
    }


    /**
     * Sets the country value for this OrganizationQueryParametersType.
     * 
     * @param country
     */
    public void setCountry(com.flexnet.operations.webservices.SimpleQueryType country) {
        this.country = country;
    }


    /**
     * Gets the region value for this OrganizationQueryParametersType.
     * 
     * @return region
     */
    public com.flexnet.operations.webservices.SimpleQueryType getRegion() {
        return region;
    }


    /**
     * Sets the region value for this OrganizationQueryParametersType.
     * 
     * @param region
     */
    public void setRegion(com.flexnet.operations.webservices.SimpleQueryType region) {
        this.region = region;
    }


    /**
     * Gets the onlyRootOrgs value for this OrganizationQueryParametersType.
     * 
     * @return onlyRootOrgs
     */
    public java.lang.Boolean getOnlyRootOrgs() {
        return onlyRootOrgs;
    }


    /**
     * Sets the onlyRootOrgs value for this OrganizationQueryParametersType.
     * 
     * @param onlyRootOrgs
     */
    public void setOnlyRootOrgs(java.lang.Boolean onlyRootOrgs) {
        this.onlyRootOrgs = onlyRootOrgs;
    }


    /**
     * Gets the orgType value for this OrganizationQueryParametersType.
     * 
     * @return orgType
     */
    public com.flexnet.operations.webservices.OrgType getOrgType() {
        return orgType;
    }


    /**
     * Sets the orgType value for this OrganizationQueryParametersType.
     * 
     * @param orgType
     */
    public void setOrgType(com.flexnet.operations.webservices.OrgType orgType) {
        this.orgType = orgType;
    }


    /**
     * Gets the orgTypeList value for this OrganizationQueryParametersType.
     * 
     * @return orgTypeList
     */
    public com.flexnet.operations.webservices.OrgTypeList getOrgTypeList() {
        return orgTypeList;
    }


    /**
     * Sets the orgTypeList value for this OrganizationQueryParametersType.
     * 
     * @param orgTypeList
     */
    public void setOrgTypeList(com.flexnet.operations.webservices.OrgTypeList orgTypeList) {
        this.orgTypeList = orgTypeList;
    }


    /**
     * Gets the customAttributes value for this OrganizationQueryParametersType.
     * 
     * @return customAttributes
     */
    public com.flexnet.operations.webservices.OrgCustomAttributesQueryListType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this OrganizationQueryParametersType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.operations.webservices.OrgCustomAttributesQueryListType customAttributes) {
        this.customAttributes = customAttributes;
    }


    /**
     * Gets the lastModifiedDateTime value for this OrganizationQueryParametersType.
     * 
     * @return lastModifiedDateTime
     */
    public com.flexnet.operations.webservices.DateTimeQueryType getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this OrganizationQueryParametersType.
     * 
     * @param lastModifiedDateTime
     */
    public void setLastModifiedDateTime(com.flexnet.operations.webservices.DateTimeQueryType lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrganizationQueryParametersType)) return false;
        OrganizationQueryParametersType other = (OrganizationQueryParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              this.orgName.equals(other.getOrgName()))) &&
            ((this.orgDisplayName==null && other.getOrgDisplayName()==null) || 
             (this.orgDisplayName!=null &&
              this.orgDisplayName.equals(other.getOrgDisplayName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
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
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.onlyRootOrgs==null && other.getOnlyRootOrgs()==null) || 
             (this.onlyRootOrgs!=null &&
              this.onlyRootOrgs.equals(other.getOnlyRootOrgs()))) &&
            ((this.orgType==null && other.getOrgType()==null) || 
             (this.orgType!=null &&
              this.orgType.equals(other.getOrgType()))) &&
            ((this.orgTypeList==null && other.getOrgTypeList()==null) || 
             (this.orgTypeList!=null &&
              this.orgTypeList.equals(other.getOrgTypeList()))) &&
            ((this.customAttributes==null && other.getCustomAttributes()==null) || 
             (this.customAttributes!=null &&
              this.customAttributes.equals(other.getCustomAttributes()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime())));
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
        if (getOrgName() != null) {
            _hashCode += getOrgName().hashCode();
        }
        if (getOrgDisplayName() != null) {
            _hashCode += getOrgDisplayName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
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
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getOnlyRootOrgs() != null) {
            _hashCode += getOnlyRootOrgs().hashCode();
        }
        if (getOrgType() != null) {
            _hashCode += getOrgType().hashCode();
        }
        if (getOrgTypeList() != null) {
            _hashCode += getOrgTypeList().hashCode();
        }
        if (getCustomAttributes() != null) {
            _hashCode += getCustomAttributes().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationQueryParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationQueryParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "address2"));
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
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlyRootOrgs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "onlyRootOrgs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "OrgTypeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgCustomAttributesQueryListType"));
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
