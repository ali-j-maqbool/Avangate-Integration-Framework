/**
 * LicenseModelDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class LicenseModelDetailsType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModelIdentifier;

    private com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology;

    private com.flexnet.operations.webservices.ModelAttributesType attributeDetails;

    public LicenseModelDetailsType() {
    }

    public LicenseModelDetailsType(
           com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModelIdentifier,
           com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology,
           com.flexnet.operations.webservices.ModelAttributesType attributeDetails) {
           this.licenseModelIdentifier = licenseModelIdentifier;
           this.licenseTechnology = licenseTechnology;
           this.attributeDetails = attributeDetails;
    }


    /**
     * Gets the licenseModelIdentifier value for this LicenseModelDetailsType.
     * 
     * @return licenseModelIdentifier
     */
    public com.flexnet.operations.webservices.LicenseModelIdentifierType getLicenseModelIdentifier() {
        return licenseModelIdentifier;
    }


    /**
     * Sets the licenseModelIdentifier value for this LicenseModelDetailsType.
     * 
     * @param licenseModelIdentifier
     */
    public void setLicenseModelIdentifier(com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModelIdentifier) {
        this.licenseModelIdentifier = licenseModelIdentifier;
    }


    /**
     * Gets the licenseTechnology value for this LicenseModelDetailsType.
     * 
     * @return licenseTechnology
     */
    public com.flexnet.operations.webservices.LicenseTechnologyIdentifierType getLicenseTechnology() {
        return licenseTechnology;
    }


    /**
     * Sets the licenseTechnology value for this LicenseModelDetailsType.
     * 
     * @param licenseTechnology
     */
    public void setLicenseTechnology(com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology) {
        this.licenseTechnology = licenseTechnology;
    }


    /**
     * Gets the attributeDetails value for this LicenseModelDetailsType.
     * 
     * @return attributeDetails
     */
    public com.flexnet.operations.webservices.ModelAttributesType getAttributeDetails() {
        return attributeDetails;
    }


    /**
     * Sets the attributeDetails value for this LicenseModelDetailsType.
     * 
     * @param attributeDetails
     */
    public void setAttributeDetails(com.flexnet.operations.webservices.ModelAttributesType attributeDetails) {
        this.attributeDetails = attributeDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LicenseModelDetailsType)) return false;
        LicenseModelDetailsType other = (LicenseModelDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.licenseModelIdentifier==null && other.getLicenseModelIdentifier()==null) || 
             (this.licenseModelIdentifier!=null &&
              this.licenseModelIdentifier.equals(other.getLicenseModelIdentifier()))) &&
            ((this.licenseTechnology==null && other.getLicenseTechnology()==null) || 
             (this.licenseTechnology!=null &&
              this.licenseTechnology.equals(other.getLicenseTechnology()))) &&
            ((this.attributeDetails==null && other.getAttributeDetails()==null) || 
             (this.attributeDetails!=null &&
              this.attributeDetails.equals(other.getAttributeDetails())));
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
        if (getLicenseModelIdentifier() != null) {
            _hashCode += getLicenseModelIdentifier().hashCode();
        }
        if (getLicenseTechnology() != null) {
            _hashCode += getLicenseTechnology().hashCode();
        }
        if (getAttributeDetails() != null) {
            _hashCode += getAttributeDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LicenseModelDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseModelIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseTechnology");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnology"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnologyIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "modelAttributesType"));
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
