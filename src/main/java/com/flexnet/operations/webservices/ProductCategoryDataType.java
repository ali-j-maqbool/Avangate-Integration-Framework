/**
 * ProductCategoryDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class ProductCategoryDataType  implements java.io.Serializable {
    private java.lang.String uniqueId;

    private java.lang.String name;

    private java.lang.String description;

    private com.flexnet.operations.webservices.CategoryAttributesDataType categoryAttributes;

    public ProductCategoryDataType() {
    }

    public ProductCategoryDataType(
           java.lang.String uniqueId,
           java.lang.String name,
           java.lang.String description,
           com.flexnet.operations.webservices.CategoryAttributesDataType categoryAttributes) {
           this.uniqueId = uniqueId;
           this.name = name;
           this.description = description;
           this.categoryAttributes = categoryAttributes;
    }


    /**
     * Gets the uniqueId value for this ProductCategoryDataType.
     * 
     * @return uniqueId
     */
    public java.lang.String getUniqueId() {
        return uniqueId;
    }


    /**
     * Sets the uniqueId value for this ProductCategoryDataType.
     * 
     * @param uniqueId
     */
    public void setUniqueId(java.lang.String uniqueId) {
        this.uniqueId = uniqueId;
    }


    /**
     * Gets the name value for this ProductCategoryDataType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProductCategoryDataType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this ProductCategoryDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductCategoryDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the categoryAttributes value for this ProductCategoryDataType.
     * 
     * @return categoryAttributes
     */
    public com.flexnet.operations.webservices.CategoryAttributesDataType getCategoryAttributes() {
        return categoryAttributes;
    }


    /**
     * Sets the categoryAttributes value for this ProductCategoryDataType.
     * 
     * @param categoryAttributes
     */
    public void setCategoryAttributes(com.flexnet.operations.webservices.CategoryAttributesDataType categoryAttributes) {
        this.categoryAttributes = categoryAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductCategoryDataType)) return false;
        ProductCategoryDataType other = (ProductCategoryDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uniqueId==null && other.getUniqueId()==null) || 
             (this.uniqueId!=null &&
              this.uniqueId.equals(other.getUniqueId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.categoryAttributes==null && other.getCategoryAttributes()==null) || 
             (this.categoryAttributes!=null &&
              this.categoryAttributes.equals(other.getCategoryAttributes())));
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
        if (getUniqueId() != null) {
            _hashCode += getUniqueId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCategoryAttributes() != null) {
            _hashCode += getCategoryAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductCategoryDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productCategoryDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "uniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "categoryAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "categoryAttributesDataType"));
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
