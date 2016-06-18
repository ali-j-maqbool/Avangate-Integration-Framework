/**
 * CustomAttributeQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CustomAttributeQueryType  implements java.io.Serializable {
    private java.lang.String attributeName;

    private com.flexnet.operations.webservices.SimpleQueryType stringValue;

    private com.flexnet.operations.webservices.NumberQueryType numberValue;

    private com.flexnet.operations.webservices.DateQueryType dateValue;

    private java.lang.Boolean booleanValue;

    public CustomAttributeQueryType() {
    }

    public CustomAttributeQueryType(
           java.lang.String attributeName,
           com.flexnet.operations.webservices.SimpleQueryType stringValue,
           com.flexnet.operations.webservices.NumberQueryType numberValue,
           com.flexnet.operations.webservices.DateQueryType dateValue,
           java.lang.Boolean booleanValue) {
           this.attributeName = attributeName;
           this.stringValue = stringValue;
           this.numberValue = numberValue;
           this.dateValue = dateValue;
           this.booleanValue = booleanValue;
    }


    /**
     * Gets the attributeName value for this CustomAttributeQueryType.
     * 
     * @return attributeName
     */
    public java.lang.String getAttributeName() {
        return attributeName;
    }


    /**
     * Sets the attributeName value for this CustomAttributeQueryType.
     * 
     * @param attributeName
     */
    public void setAttributeName(java.lang.String attributeName) {
        this.attributeName = attributeName;
    }


    /**
     * Gets the stringValue value for this CustomAttributeQueryType.
     * 
     * @return stringValue
     */
    public com.flexnet.operations.webservices.SimpleQueryType getStringValue() {
        return stringValue;
    }


    /**
     * Sets the stringValue value for this CustomAttributeQueryType.
     * 
     * @param stringValue
     */
    public void setStringValue(com.flexnet.operations.webservices.SimpleQueryType stringValue) {
        this.stringValue = stringValue;
    }


    /**
     * Gets the numberValue value for this CustomAttributeQueryType.
     * 
     * @return numberValue
     */
    public com.flexnet.operations.webservices.NumberQueryType getNumberValue() {
        return numberValue;
    }


    /**
     * Sets the numberValue value for this CustomAttributeQueryType.
     * 
     * @param numberValue
     */
    public void setNumberValue(com.flexnet.operations.webservices.NumberQueryType numberValue) {
        this.numberValue = numberValue;
    }


    /**
     * Gets the dateValue value for this CustomAttributeQueryType.
     * 
     * @return dateValue
     */
    public com.flexnet.operations.webservices.DateQueryType getDateValue() {
        return dateValue;
    }


    /**
     * Sets the dateValue value for this CustomAttributeQueryType.
     * 
     * @param dateValue
     */
    public void setDateValue(com.flexnet.operations.webservices.DateQueryType dateValue) {
        this.dateValue = dateValue;
    }


    /**
     * Gets the booleanValue value for this CustomAttributeQueryType.
     * 
     * @return booleanValue
     */
    public java.lang.Boolean getBooleanValue() {
        return booleanValue;
    }


    /**
     * Sets the booleanValue value for this CustomAttributeQueryType.
     * 
     * @param booleanValue
     */
    public void setBooleanValue(java.lang.Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomAttributeQueryType)) return false;
        CustomAttributeQueryType other = (CustomAttributeQueryType) obj;
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
            ((this.stringValue==null && other.getStringValue()==null) || 
             (this.stringValue!=null &&
              this.stringValue.equals(other.getStringValue()))) &&
            ((this.numberValue==null && other.getNumberValue()==null) || 
             (this.numberValue!=null &&
              this.numberValue.equals(other.getNumberValue()))) &&
            ((this.dateValue==null && other.getDateValue()==null) || 
             (this.dateValue!=null &&
              this.dateValue.equals(other.getDateValue()))) &&
            ((this.booleanValue==null && other.getBooleanValue()==null) || 
             (this.booleanValue!=null &&
              this.booleanValue.equals(other.getBooleanValue())));
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
        if (getStringValue() != null) {
            _hashCode += getStringValue().hashCode();
        }
        if (getNumberValue() != null) {
            _hashCode += getNumberValue().hashCode();
        }
        if (getDateValue() != null) {
            _hashCode += getDateValue().hashCode();
        }
        if (getBooleanValue() != null) {
            _hashCode += getBooleanValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomAttributeQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customAttributeQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "stringValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "numberValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "NumberQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "dateValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "booleanValue"));
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
