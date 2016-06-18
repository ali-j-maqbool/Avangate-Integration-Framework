/**
 * PartNumberQueryParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class PartNumberQueryParametersType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SimpleQueryType partId;

    private com.flexnet.operations.webservices.SimpleQueryType description;

    private com.flexnet.operations.webservices.SimpleQueryType productName;

    private com.flexnet.operations.webservices.SimpleQueryType licenseModel;

    private com.flexnet.operations.webservices.DateQueryType creationDate;

    private com.flexnet.operations.webservices.DateQueryType lastModifiedDate;

    private java.lang.Boolean unmappedWithProduct;

    private java.lang.Boolean unmappedWithLicenseModel;

    public PartNumberQueryParametersType() {
    }

    public PartNumberQueryParametersType(
           com.flexnet.operations.webservices.SimpleQueryType partId,
           com.flexnet.operations.webservices.SimpleQueryType description,
           com.flexnet.operations.webservices.SimpleQueryType productName,
           com.flexnet.operations.webservices.SimpleQueryType licenseModel,
           com.flexnet.operations.webservices.DateQueryType creationDate,
           com.flexnet.operations.webservices.DateQueryType lastModifiedDate,
           java.lang.Boolean unmappedWithProduct,
           java.lang.Boolean unmappedWithLicenseModel) {
           this.partId = partId;
           this.description = description;
           this.productName = productName;
           this.licenseModel = licenseModel;
           this.creationDate = creationDate;
           this.lastModifiedDate = lastModifiedDate;
           this.unmappedWithProduct = unmappedWithProduct;
           this.unmappedWithLicenseModel = unmappedWithLicenseModel;
    }


    /**
     * Gets the partId value for this PartNumberQueryParametersType.
     * 
     * @return partId
     */
    public com.flexnet.operations.webservices.SimpleQueryType getPartId() {
        return partId;
    }


    /**
     * Sets the partId value for this PartNumberQueryParametersType.
     * 
     * @param partId
     */
    public void setPartId(com.flexnet.operations.webservices.SimpleQueryType partId) {
        this.partId = partId;
    }


    /**
     * Gets the description value for this PartNumberQueryParametersType.
     * 
     * @return description
     */
    public com.flexnet.operations.webservices.SimpleQueryType getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PartNumberQueryParametersType.
     * 
     * @param description
     */
    public void setDescription(com.flexnet.operations.webservices.SimpleQueryType description) {
        this.description = description;
    }


    /**
     * Gets the productName value for this PartNumberQueryParametersType.
     * 
     * @return productName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this PartNumberQueryParametersType.
     * 
     * @param productName
     */
    public void setProductName(com.flexnet.operations.webservices.SimpleQueryType productName) {
        this.productName = productName;
    }


    /**
     * Gets the licenseModel value for this PartNumberQueryParametersType.
     * 
     * @return licenseModel
     */
    public com.flexnet.operations.webservices.SimpleQueryType getLicenseModel() {
        return licenseModel;
    }


    /**
     * Sets the licenseModel value for this PartNumberQueryParametersType.
     * 
     * @param licenseModel
     */
    public void setLicenseModel(com.flexnet.operations.webservices.SimpleQueryType licenseModel) {
        this.licenseModel = licenseModel;
    }


    /**
     * Gets the creationDate value for this PartNumberQueryParametersType.
     * 
     * @return creationDate
     */
    public com.flexnet.operations.webservices.DateQueryType getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this PartNumberQueryParametersType.
     * 
     * @param creationDate
     */
    public void setCreationDate(com.flexnet.operations.webservices.DateQueryType creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the lastModifiedDate value for this PartNumberQueryParametersType.
     * 
     * @return lastModifiedDate
     */
    public com.flexnet.operations.webservices.DateQueryType getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this PartNumberQueryParametersType.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.flexnet.operations.webservices.DateQueryType lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the unmappedWithProduct value for this PartNumberQueryParametersType.
     * 
     * @return unmappedWithProduct
     */
    public java.lang.Boolean getUnmappedWithProduct() {
        return unmappedWithProduct;
    }


    /**
     * Sets the unmappedWithProduct value for this PartNumberQueryParametersType.
     * 
     * @param unmappedWithProduct
     */
    public void setUnmappedWithProduct(java.lang.Boolean unmappedWithProduct) {
        this.unmappedWithProduct = unmappedWithProduct;
    }


    /**
     * Gets the unmappedWithLicenseModel value for this PartNumberQueryParametersType.
     * 
     * @return unmappedWithLicenseModel
     */
    public java.lang.Boolean getUnmappedWithLicenseModel() {
        return unmappedWithLicenseModel;
    }


    /**
     * Sets the unmappedWithLicenseModel value for this PartNumberQueryParametersType.
     * 
     * @param unmappedWithLicenseModel
     */
    public void setUnmappedWithLicenseModel(java.lang.Boolean unmappedWithLicenseModel) {
        this.unmappedWithLicenseModel = unmappedWithLicenseModel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PartNumberQueryParametersType)) return false;
        PartNumberQueryParametersType other = (PartNumberQueryParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partId==null && other.getPartId()==null) || 
             (this.partId!=null &&
              this.partId.equals(other.getPartId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.licenseModel==null && other.getLicenseModel()==null) || 
             (this.licenseModel!=null &&
              this.licenseModel.equals(other.getLicenseModel()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.unmappedWithProduct==null && other.getUnmappedWithProduct()==null) || 
             (this.unmappedWithProduct!=null &&
              this.unmappedWithProduct.equals(other.getUnmappedWithProduct()))) &&
            ((this.unmappedWithLicenseModel==null && other.getUnmappedWithLicenseModel()==null) || 
             (this.unmappedWithLicenseModel!=null &&
              this.unmappedWithLicenseModel.equals(other.getUnmappedWithLicenseModel())));
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
        if (getPartId() != null) {
            _hashCode += getPartId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getLicenseModel() != null) {
            _hashCode += getLicenseModel().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getUnmappedWithProduct() != null) {
            _hashCode += getUnmappedWithProduct().hashCode();
        }
        if (getUnmappedWithLicenseModel() != null) {
            _hashCode += getUnmappedWithLicenseModel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PartNumberQueryParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberQueryParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partId"));
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
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseModel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unmappedWithProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unmappedWithProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unmappedWithLicenseModel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unmappedWithLicenseModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
