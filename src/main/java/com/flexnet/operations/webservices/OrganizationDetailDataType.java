/**
 * OrganizationDetailDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class OrganizationDetailDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.OrganizationIdentifierType organization;

    private java.lang.String displayName;

    private java.lang.String description;

    private com.flexnet.operations.webservices.AddressDataType address;

    private java.lang.Boolean visible;

    private com.flexnet.operations.webservices.OrgType orgType;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes;

    private java.util.Calendar dateLastModified;

    public OrganizationDetailDataType() {
    }

    public OrganizationDetailDataType(
           com.flexnet.operations.webservices.OrganizationIdentifierType organization,
           java.lang.String displayName,
           java.lang.String description,
           com.flexnet.operations.webservices.AddressDataType address,
           java.lang.Boolean visible,
           com.flexnet.operations.webservices.OrgType orgType,
           com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes,
           java.util.Calendar dateLastModified) {
           this.organization = organization;
           this.displayName = displayName;
           this.description = description;
           this.address = address;
           this.visible = visible;
           this.orgType = orgType;
           this.customAttributes = customAttributes;
           this.dateLastModified = dateLastModified;
    }


    /**
     * Gets the organization value for this OrganizationDetailDataType.
     * 
     * @return organization
     */
    public com.flexnet.operations.webservices.OrganizationIdentifierType getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this OrganizationDetailDataType.
     * 
     * @param organization
     */
    public void setOrganization(com.flexnet.operations.webservices.OrganizationIdentifierType organization) {
        this.organization = organization;
    }


    /**
     * Gets the displayName value for this OrganizationDetailDataType.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this OrganizationDetailDataType.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the description value for this OrganizationDetailDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OrganizationDetailDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the address value for this OrganizationDetailDataType.
     * 
     * @return address
     */
    public com.flexnet.operations.webservices.AddressDataType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this OrganizationDetailDataType.
     * 
     * @param address
     */
    public void setAddress(com.flexnet.operations.webservices.AddressDataType address) {
        this.address = address;
    }


    /**
     * Gets the visible value for this OrganizationDetailDataType.
     * 
     * @return visible
     */
    public java.lang.Boolean getVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this OrganizationDetailDataType.
     * 
     * @param visible
     */
    public void setVisible(java.lang.Boolean visible) {
        this.visible = visible;
    }


    /**
     * Gets the orgType value for this OrganizationDetailDataType.
     * 
     * @return orgType
     */
    public com.flexnet.operations.webservices.OrgType getOrgType() {
        return orgType;
    }


    /**
     * Sets the orgType value for this OrganizationDetailDataType.
     * 
     * @param orgType
     */
    public void setOrgType(com.flexnet.operations.webservices.OrgType orgType) {
        this.orgType = orgType;
    }


    /**
     * Gets the customAttributes value for this OrganizationDetailDataType.
     * 
     * @return customAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this OrganizationDetailDataType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes) {
        this.customAttributes = customAttributes;
    }


    /**
     * Gets the dateLastModified value for this OrganizationDetailDataType.
     * 
     * @return dateLastModified
     */
    public java.util.Calendar getDateLastModified() {
        return dateLastModified;
    }


    /**
     * Sets the dateLastModified value for this OrganizationDetailDataType.
     * 
     * @param dateLastModified
     */
    public void setDateLastModified(java.util.Calendar dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrganizationDetailDataType)) return false;
        OrganizationDetailDataType other = (OrganizationDetailDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.visible==null && other.getVisible()==null) || 
             (this.visible!=null &&
              this.visible.equals(other.getVisible()))) &&
            ((this.orgType==null && other.getOrgType()==null) || 
             (this.orgType!=null &&
              this.orgType.equals(other.getOrgType()))) &&
            ((this.customAttributes==null && other.getCustomAttributes()==null) || 
             (this.customAttributes!=null &&
              this.customAttributes.equals(other.getCustomAttributes()))) &&
            ((this.dateLastModified==null && other.getDateLastModified()==null) || 
             (this.dateLastModified!=null &&
              this.dateLastModified.equals(other.getDateLastModified())));
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
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getVisible() != null) {
            _hashCode += getVisible().hashCode();
        }
        if (getOrgType() != null) {
            _hashCode += getOrgType().hashCode();
        }
        if (getCustomAttributes() != null) {
            _hashCode += getCustomAttributes().hashCode();
        }
        if (getDateLastModified() != null) {
            _hashCode += getDateLastModified().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationDetailDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationDetailDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addressDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "visible"));
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
        elemField.setFieldName("customAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeDescriptorDataType"));
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
