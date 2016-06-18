/**
 * GeneratePrebuiltLicenseDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GeneratePrebuiltLicenseDataType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier;

    private com.flexnet.opsembedded.webservices.ProductIdentifierType product;

    private com.flexnet.opsembedded.webservices.LicenseModelIdentifierType licenseModel;

    private com.flexnet.opsembedded.webservices.AttributeDescriptorDataType licenseModelAttributes;

    private java.util.Date startDate;

    private java.lang.Boolean isPermanent;

    private com.flexnet.opsembedded.webservices.DurationType term;

    private java.util.Date expirationDate;

    public GeneratePrebuiltLicenseDataType() {
    }

    public GeneratePrebuiltLicenseDataType(
           com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier,
           com.flexnet.opsembedded.webservices.ProductIdentifierType product,
           com.flexnet.opsembedded.webservices.LicenseModelIdentifierType licenseModel,
           com.flexnet.opsembedded.webservices.AttributeDescriptorDataType licenseModelAttributes,
           java.util.Date startDate,
           java.lang.Boolean isPermanent,
           com.flexnet.opsembedded.webservices.DurationType term,
           java.util.Date expirationDate) {
           this.deviceIdentifier = deviceIdentifier;
           this.product = product;
           this.licenseModel = licenseModel;
           this.licenseModelAttributes = licenseModelAttributes;
           this.startDate = startDate;
           this.isPermanent = isPermanent;
           this.term = term;
           this.expirationDate = expirationDate;
    }


    /**
     * Gets the deviceIdentifier value for this GeneratePrebuiltLicenseDataType.
     * 
     * @return deviceIdentifier
     */
    public com.flexnet.opsembedded.webservices.DeviceIdentifier getDeviceIdentifier() {
        return deviceIdentifier;
    }


    /**
     * Sets the deviceIdentifier value for this GeneratePrebuiltLicenseDataType.
     * 
     * @param deviceIdentifier
     */
    public void setDeviceIdentifier(com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }


    /**
     * Gets the product value for this GeneratePrebuiltLicenseDataType.
     * 
     * @return product
     */
    public com.flexnet.opsembedded.webservices.ProductIdentifierType getProduct() {
        return product;
    }


    /**
     * Sets the product value for this GeneratePrebuiltLicenseDataType.
     * 
     * @param product
     */
    public void setProduct(com.flexnet.opsembedded.webservices.ProductIdentifierType product) {
        this.product = product;
    }


    /**
     * Gets the licenseModel value for this GeneratePrebuiltLicenseDataType.
     * 
     * @return licenseModel
     */
    public com.flexnet.opsembedded.webservices.LicenseModelIdentifierType getLicenseModel() {
        return licenseModel;
    }


    /**
     * Sets the licenseModel value for this GeneratePrebuiltLicenseDataType.
     * 
     * @param licenseModel
     */
    public void setLicenseModel(com.flexnet.opsembedded.webservices.LicenseModelIdentifierType licenseModel) {
        this.licenseModel = licenseModel;
    }


    /**
     * Gets the licenseModelAttributes value for this GeneratePrebuiltLicenseDataType.
     * 
     * @return licenseModelAttributes
     */
    public com.flexnet.opsembedded.webservices.AttributeDescriptorDataType getLicenseModelAttributes() {
        return licenseModelAttributes;
    }


    /**
     * Sets the licenseModelAttributes value for this GeneratePrebuiltLicenseDataType.
     * 
     * @param licenseModelAttributes
     */
    public void setLicenseModelAttributes(com.flexnet.opsembedded.webservices.AttributeDescriptorDataType licenseModelAttributes) {
        this.licenseModelAttributes = licenseModelAttributes;
    }


    /**
     * Gets the startDate value for this GeneratePrebuiltLicenseDataType.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GeneratePrebuiltLicenseDataType.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the isPermanent value for this GeneratePrebuiltLicenseDataType.
     * 
     * @return isPermanent
     */
    public java.lang.Boolean getIsPermanent() {
        return isPermanent;
    }


    /**
     * Sets the isPermanent value for this GeneratePrebuiltLicenseDataType.
     * 
     * @param isPermanent
     */
    public void setIsPermanent(java.lang.Boolean isPermanent) {
        this.isPermanent = isPermanent;
    }


    /**
     * Gets the term value for this GeneratePrebuiltLicenseDataType.
     * 
     * @return term
     */
    public com.flexnet.opsembedded.webservices.DurationType getTerm() {
        return term;
    }


    /**
     * Sets the term value for this GeneratePrebuiltLicenseDataType.
     * 
     * @param term
     */
    public void setTerm(com.flexnet.opsembedded.webservices.DurationType term) {
        this.term = term;
    }


    /**
     * Gets the expirationDate value for this GeneratePrebuiltLicenseDataType.
     * 
     * @return expirationDate
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this GeneratePrebuiltLicenseDataType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneratePrebuiltLicenseDataType)) return false;
        GeneratePrebuiltLicenseDataType other = (GeneratePrebuiltLicenseDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceIdentifier==null && other.getDeviceIdentifier()==null) || 
             (this.deviceIdentifier!=null &&
              this.deviceIdentifier.equals(other.getDeviceIdentifier()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.licenseModel==null && other.getLicenseModel()==null) || 
             (this.licenseModel!=null &&
              this.licenseModel.equals(other.getLicenseModel()))) &&
            ((this.licenseModelAttributes==null && other.getLicenseModelAttributes()==null) || 
             (this.licenseModelAttributes!=null &&
              this.licenseModelAttributes.equals(other.getLicenseModelAttributes()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.isPermanent==null && other.getIsPermanent()==null) || 
             (this.isPermanent!=null &&
              this.isPermanent.equals(other.getIsPermanent()))) &&
            ((this.term==null && other.getTerm()==null) || 
             (this.term!=null &&
              this.term.equals(other.getTerm()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate())));
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
        if (getDeviceIdentifier() != null) {
            _hashCode += getDeviceIdentifier().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getLicenseModel() != null) {
            _hashCode += getLicenseModel().hashCode();
        }
        if (getLicenseModelAttributes() != null) {
            _hashCode += getLicenseModelAttributes().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getIsPermanent() != null) {
            _hashCode += getIsPermanent().hashCode();
        }
        if (getTerm() != null) {
            _hashCode += getTerm().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneratePrebuiltLicenseDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generatePrebuiltLicenseDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "productIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseModel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "licenseModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "licenseModelIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseModelAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "licenseModelAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "attributeDescriptorDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPermanent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "isPermanent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("term");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "term"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DurationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
