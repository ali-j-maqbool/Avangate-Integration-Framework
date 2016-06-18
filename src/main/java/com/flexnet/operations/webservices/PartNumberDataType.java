/**
 * PartNumberDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class PartNumberDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.PartNumberIdentifierType partNumberIdentifier;

    private java.lang.String description;

    private java.util.Date creationDate;

    private java.util.Date lastModifiedDate;

    private com.flexnet.operations.webservices.ProductIdentifierType mappedProduct;

    private com.flexnet.operations.webservices.LicenseModelIdentifierType mappedLicenseModel;

    public PartNumberDataType() {
    }

    public PartNumberDataType(
           com.flexnet.operations.webservices.PartNumberIdentifierType partNumberIdentifier,
           java.lang.String description,
           java.util.Date creationDate,
           java.util.Date lastModifiedDate,
           com.flexnet.operations.webservices.ProductIdentifierType mappedProduct,
           com.flexnet.operations.webservices.LicenseModelIdentifierType mappedLicenseModel) {
           this.partNumberIdentifier = partNumberIdentifier;
           this.description = description;
           this.creationDate = creationDate;
           this.lastModifiedDate = lastModifiedDate;
           this.mappedProduct = mappedProduct;
           this.mappedLicenseModel = mappedLicenseModel;
    }


    /**
     * Gets the partNumberIdentifier value for this PartNumberDataType.
     * 
     * @return partNumberIdentifier
     */
    public com.flexnet.operations.webservices.PartNumberIdentifierType getPartNumberIdentifier() {
        return partNumberIdentifier;
    }


    /**
     * Sets the partNumberIdentifier value for this PartNumberDataType.
     * 
     * @param partNumberIdentifier
     */
    public void setPartNumberIdentifier(com.flexnet.operations.webservices.PartNumberIdentifierType partNumberIdentifier) {
        this.partNumberIdentifier = partNumberIdentifier;
    }


    /**
     * Gets the description value for this PartNumberDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PartNumberDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the creationDate value for this PartNumberDataType.
     * 
     * @return creationDate
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this PartNumberDataType.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the lastModifiedDate value for this PartNumberDataType.
     * 
     * @return lastModifiedDate
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this PartNumberDataType.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the mappedProduct value for this PartNumberDataType.
     * 
     * @return mappedProduct
     */
    public com.flexnet.operations.webservices.ProductIdentifierType getMappedProduct() {
        return mappedProduct;
    }


    /**
     * Sets the mappedProduct value for this PartNumberDataType.
     * 
     * @param mappedProduct
     */
    public void setMappedProduct(com.flexnet.operations.webservices.ProductIdentifierType mappedProduct) {
        this.mappedProduct = mappedProduct;
    }


    /**
     * Gets the mappedLicenseModel value for this PartNumberDataType.
     * 
     * @return mappedLicenseModel
     */
    public com.flexnet.operations.webservices.LicenseModelIdentifierType getMappedLicenseModel() {
        return mappedLicenseModel;
    }


    /**
     * Sets the mappedLicenseModel value for this PartNumberDataType.
     * 
     * @param mappedLicenseModel
     */
    public void setMappedLicenseModel(com.flexnet.operations.webservices.LicenseModelIdentifierType mappedLicenseModel) {
        this.mappedLicenseModel = mappedLicenseModel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PartNumberDataType)) return false;
        PartNumberDataType other = (PartNumberDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partNumberIdentifier==null && other.getPartNumberIdentifier()==null) || 
             (this.partNumberIdentifier!=null &&
              this.partNumberIdentifier.equals(other.getPartNumberIdentifier()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.mappedProduct==null && other.getMappedProduct()==null) || 
             (this.mappedProduct!=null &&
              this.mappedProduct.equals(other.getMappedProduct()))) &&
            ((this.mappedLicenseModel==null && other.getMappedLicenseModel()==null) || 
             (this.mappedLicenseModel!=null &&
              this.mappedLicenseModel.equals(other.getMappedLicenseModel())));
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
        if (getPartNumberIdentifier() != null) {
            _hashCode += getPartNumberIdentifier().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getMappedProduct() != null) {
            _hashCode += getMappedProduct().hashCode();
        }
        if (getMappedLicenseModel() != null) {
            _hashCode += getMappedLicenseModel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PartNumberDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumberIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappedProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mappedProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappedLicenseModel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mappedLicenseModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelIdentifierType"));
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
