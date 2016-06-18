/**
 * CategoryAttributeDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CategoryAttributeDataType  implements java.io.Serializable {
    private java.lang.String attributeName;

    private boolean isRequired;

    private com.flexnet.operations.webservices.AttributeDataType dataType;

    private java.lang.String maxLength;

    private com.flexnet.operations.webservices.ValueType validValues;

    public CategoryAttributeDataType() {
    }

    public CategoryAttributeDataType(
           java.lang.String attributeName,
           boolean isRequired,
           com.flexnet.operations.webservices.AttributeDataType dataType,
           java.lang.String maxLength,
           com.flexnet.operations.webservices.ValueType validValues) {
           this.attributeName = attributeName;
           this.isRequired = isRequired;
           this.dataType = dataType;
           this.maxLength = maxLength;
           this.validValues = validValues;
    }


    /**
     * Gets the attributeName value for this CategoryAttributeDataType.
     * 
     * @return attributeName
     */
    public java.lang.String getAttributeName() {
        return attributeName;
    }


    /**
     * Sets the attributeName value for this CategoryAttributeDataType.
     * 
     * @param attributeName
     */
    public void setAttributeName(java.lang.String attributeName) {
        this.attributeName = attributeName;
    }


    /**
     * Gets the isRequired value for this CategoryAttributeDataType.
     * 
     * @return isRequired
     */
    public boolean isIsRequired() {
        return isRequired;
    }


    /**
     * Sets the isRequired value for this CategoryAttributeDataType.
     * 
     * @param isRequired
     */
    public void setIsRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }


    /**
     * Gets the dataType value for this CategoryAttributeDataType.
     * 
     * @return dataType
     */
    public com.flexnet.operations.webservices.AttributeDataType getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this CategoryAttributeDataType.
     * 
     * @param dataType
     */
    public void setDataType(com.flexnet.operations.webservices.AttributeDataType dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the maxLength value for this CategoryAttributeDataType.
     * 
     * @return maxLength
     */
    public java.lang.String getMaxLength() {
        return maxLength;
    }


    /**
     * Sets the maxLength value for this CategoryAttributeDataType.
     * 
     * @param maxLength
     */
    public void setMaxLength(java.lang.String maxLength) {
        this.maxLength = maxLength;
    }


    /**
     * Gets the validValues value for this CategoryAttributeDataType.
     * 
     * @return validValues
     */
    public com.flexnet.operations.webservices.ValueType getValidValues() {
        return validValues;
    }


    /**
     * Sets the validValues value for this CategoryAttributeDataType.
     * 
     * @param validValues
     */
    public void setValidValues(com.flexnet.operations.webservices.ValueType validValues) {
        this.validValues = validValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoryAttributeDataType)) return false;
        CategoryAttributeDataType other = (CategoryAttributeDataType) obj;
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
            this.isRequired == other.isIsRequired() &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.maxLength==null && other.getMaxLength()==null) || 
             (this.maxLength!=null &&
              this.maxLength.equals(other.getMaxLength()))) &&
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
        _hashCode += (isIsRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getMaxLength() != null) {
            _hashCode += getMaxLength().hashCode();
        }
        if (getValidValues() != null) {
            _hashCode += getValidValues().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CategoryAttributeDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "categoryAttributeDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "AttributeDataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maxLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
