/**
 * UpdateOrgDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UpdateOrgDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.OrganizationIdentifierType organization;

    private java.lang.String name;

    private java.lang.String displayName;

    private java.lang.String description;

    private com.flexnet.operations.webservices.AddressDataType address;

    private com.flexnet.operations.webservices.UpdateSubOrganizationsListType subOrganizations;

    private com.flexnet.operations.webservices.UpdateRelatedOrganizationsListType relatedOrganizations;

    private java.lang.Boolean visible;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes;

    public UpdateOrgDataType() {
    }

    public UpdateOrgDataType(
           com.flexnet.operations.webservices.OrganizationIdentifierType organization,
           java.lang.String name,
           java.lang.String displayName,
           java.lang.String description,
           com.flexnet.operations.webservices.AddressDataType address,
           com.flexnet.operations.webservices.UpdateSubOrganizationsListType subOrganizations,
           com.flexnet.operations.webservices.UpdateRelatedOrganizationsListType relatedOrganizations,
           java.lang.Boolean visible,
           com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes) {
           this.organization = organization;
           this.name = name;
           this.displayName = displayName;
           this.description = description;
           this.address = address;
           this.subOrganizations = subOrganizations;
           this.relatedOrganizations = relatedOrganizations;
           this.visible = visible;
           this.customAttributes = customAttributes;
    }


    /**
     * Gets the organization value for this UpdateOrgDataType.
     * 
     * @return organization
     */
    public com.flexnet.operations.webservices.OrganizationIdentifierType getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this UpdateOrgDataType.
     * 
     * @param organization
     */
    public void setOrganization(com.flexnet.operations.webservices.OrganizationIdentifierType organization) {
        this.organization = organization;
    }


    /**
     * Gets the name value for this UpdateOrgDataType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UpdateOrgDataType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the displayName value for this UpdateOrgDataType.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this UpdateOrgDataType.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the description value for this UpdateOrgDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UpdateOrgDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the address value for this UpdateOrgDataType.
     * 
     * @return address
     */
    public com.flexnet.operations.webservices.AddressDataType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this UpdateOrgDataType.
     * 
     * @param address
     */
    public void setAddress(com.flexnet.operations.webservices.AddressDataType address) {
        this.address = address;
    }


    /**
     * Gets the subOrganizations value for this UpdateOrgDataType.
     * 
     * @return subOrganizations
     */
    public com.flexnet.operations.webservices.UpdateSubOrganizationsListType getSubOrganizations() {
        return subOrganizations;
    }


    /**
     * Sets the subOrganizations value for this UpdateOrgDataType.
     * 
     * @param subOrganizations
     */
    public void setSubOrganizations(com.flexnet.operations.webservices.UpdateSubOrganizationsListType subOrganizations) {
        this.subOrganizations = subOrganizations;
    }


    /**
     * Gets the relatedOrganizations value for this UpdateOrgDataType.
     * 
     * @return relatedOrganizations
     */
    public com.flexnet.operations.webservices.UpdateRelatedOrganizationsListType getRelatedOrganizations() {
        return relatedOrganizations;
    }


    /**
     * Sets the relatedOrganizations value for this UpdateOrgDataType.
     * 
     * @param relatedOrganizations
     */
    public void setRelatedOrganizations(com.flexnet.operations.webservices.UpdateRelatedOrganizationsListType relatedOrganizations) {
        this.relatedOrganizations = relatedOrganizations;
    }


    /**
     * Gets the visible value for this UpdateOrgDataType.
     * 
     * @return visible
     */
    public java.lang.Boolean getVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this UpdateOrgDataType.
     * 
     * @param visible
     */
    public void setVisible(java.lang.Boolean visible) {
        this.visible = visible;
    }


    /**
     * Gets the customAttributes value for this UpdateOrgDataType.
     * 
     * @return customAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this UpdateOrgDataType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes) {
        this.customAttributes = customAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateOrgDataType)) return false;
        UpdateOrgDataType other = (UpdateOrgDataType) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.subOrganizations==null && other.getSubOrganizations()==null) || 
             (this.subOrganizations!=null &&
              this.subOrganizations.equals(other.getSubOrganizations()))) &&
            ((this.relatedOrganizations==null && other.getRelatedOrganizations()==null) || 
             (this.relatedOrganizations!=null &&
              this.relatedOrganizations.equals(other.getRelatedOrganizations()))) &&
            ((this.visible==null && other.getVisible()==null) || 
             (this.visible!=null &&
              this.visible.equals(other.getVisible()))) &&
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
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
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
        if (getSubOrganizations() != null) {
            _hashCode += getSubOrganizations().hashCode();
        }
        if (getRelatedOrganizations() != null) {
            _hashCode += getRelatedOrganizations().hashCode();
        }
        if (getVisible() != null) {
            _hashCode += getVisible().hashCode();
        }
        if (getCustomAttributes() != null) {
            _hashCode += getCustomAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateOrgDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateOrgDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "name"));
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
        elemField.setFieldName("subOrganizations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "subOrganizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateSubOrganizationsListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedOrganizations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relatedOrganizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateRelatedOrganizationsListType"));
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
