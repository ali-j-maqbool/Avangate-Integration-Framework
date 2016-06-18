/**
 * AttributeMetaDescriptorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class AttributeMetaDescriptorType  implements java.io.Serializable {
    private java.lang.String attributeName;

    private com.flexnet.operations.webservices.AttributeDataType attributeDataType;

    private java.lang.String namespace;

    private com.flexnet.operations.webservices.ValueType validValues;

    public AttributeMetaDescriptorType() {
    }

    public AttributeMetaDescriptorType(
           java.lang.String attributeName,
           com.flexnet.operations.webservices.AttributeDataType attributeDataType,
           java.lang.String namespace,
           com.flexnet.operations.webservices.ValueType validValues) {
           this.attributeName = attributeName;
           this.attributeDataType = attributeDataType;
           this.namespace = namespace;
           this.validValues = validValues;
    }


    /**
     * Gets the attributeName value for this AttributeMetaDescriptorType.
     * 
     * @return attributeName
     */
    public java.lang.String getAttributeName() {
        return attributeName;
    }


    /**
     * Sets the attributeName value for this AttributeMetaDescriptorType.
     * 
     * @param attributeName
     */
    public void setAttributeName(java.lang.String attributeName) {
        this.attributeName = attributeName;
    }


    /**
     * Gets the attributeDataType value for this AttributeMetaDescriptorType.
     * 
     * @return attributeDataType
     */
    public com.flexnet.operations.webservices.AttributeDataType getAttributeDataType() {
        return attributeDataType;
    }


    /**
     * Sets the attributeDataType value for this AttributeMetaDescriptorType.
     * 
     * @param attributeDataType
     */
    public void setAttributeDataType(com.flexnet.operations.webservices.AttributeDataType attributeDataType) {
        this.attributeDataType = attributeDataType;
    }


    /**
     * Gets the namespace value for this AttributeMetaDescriptorType.
     * 
     * @return namespace
     */
    public java.lang.String getNamespace() {
        return namespace;
    }


    /**
     * Sets the namespace value for this AttributeMetaDescriptorType.
     * 
     * @param namespace
     */
    public void setNamespace(java.lang.String namespace) {
        this.namespace = namespace;
    }


    /**
     * Gets the validValues value for this AttributeMetaDescriptorType.
     * 
     * @return validValues
     */
    public com.flexnet.operations.webservices.ValueType getValidValues() {
        return validValues;
    }


    /**
     * Sets the validValues value for this AttributeMetaDescriptorType.
     * 
     * @param validValues
     */
    public void setValidValues(com.flexnet.operations.webservices.ValueType validValues) {
        this.validValues = validValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeMetaDescriptorType)) return false;
        AttributeMetaDescriptorType other = (AttributeMetaDescriptorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributeName==null && other.getAttributeName()==null) || 
             (this.attributeName!=null &&
              this.attributeName.equals(other.getAttributeName()))) &&
            ((this.attributeDataType==null && other.getAttributeDataType()==null) || 
             (this.attributeDataType!=null &&
              this.attributeDataType.equals(other.getAttributeDataType()))) &&
            ((this.namespace==null && other.getNamespace()==null) || 
             (this.namespace!=null &&
              this.namespace.equals(other.getNamespace()))) &&
            ((this.validValues==null && other.getValidValues()==null) || 
             (this.validValues!=null &&
              this.validValues.equals(other.getValidValues())));
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
        if (getAttributeName() != null) {
            _hashCode += getAttributeName().hashCode();
        }
        if (getAttributeDataType() != null) {
            _hashCode += getAttributeDataType().hashCode();
        }
        if (getNamespace() != null) {
            _hashCode += getNamespace().hashCode();
        }
        if (getValidValues() != null) {
            _hashCode += getValidValues().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeMetaDescriptorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeMetaDescriptorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "AttributeDataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "namespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "validValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "valueType"));
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
