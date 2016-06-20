/**
 * AttributeDescriptorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class AttributeDescriptorType  implements java.io.Serializable {
    private java.lang.String attributeName;

    private java.lang.String stringValue;

    private java.util.Date dateValue;

    private java.lang.Boolean booleanValue;

    private java.math.BigInteger integerValue;

    private java.lang.String[] arrayValue;

    public AttributeDescriptorType() {
    }

    public AttributeDescriptorType(
           java.lang.String attributeName,
           java.lang.String stringValue,
           java.util.Date dateValue,
           java.lang.Boolean booleanValue,
           java.math.BigInteger integerValue,
           java.lang.String[] arrayValue) {
           this.attributeName = attributeName;
           this.stringValue = stringValue;
           this.dateValue = dateValue;
           this.booleanValue = booleanValue;
           this.integerValue = integerValue;
           this.arrayValue = arrayValue;
    }


    /**
     * Gets the attributeName value for this AttributeDescriptorType.
     * 
     * @return attributeName
     */
    public java.lang.String getAttributeName() {
        return attributeName;
    }


    /**
     * Sets the attributeName value for this AttributeDescriptorType.
     * 
     * @param attributeName
     */
    public void setAttributeName(java.lang.String attributeName) {
        this.attributeName = attributeName;
    }


    /**
     * Gets the stringValue value for this AttributeDescriptorType.
     * 
     * @return stringValue
     */
    public java.lang.String getStringValue() {
        return stringValue;
    }


    /**
     * Sets the stringValue value for this AttributeDescriptorType.
     * 
     * @param stringValue
     */
    public void setStringValue(java.lang.String stringValue) {
        this.stringValue = stringValue;
    }


    /**
     * Gets the dateValue value for this AttributeDescriptorType.
     * 
     * @return dateValue
     */
    public java.util.Date getDateValue() {
        return dateValue;
    }


    /**
     * Sets the dateValue value for this AttributeDescriptorType.
     * 
     * @param dateValue
     */
    public void setDateValue(java.util.Date dateValue) {
        this.dateValue = dateValue;
    }


    /**
     * Gets the booleanValue value for this AttributeDescriptorType.
     * 
     * @return booleanValue
     */
    public java.lang.Boolean getBooleanValue() {
        return booleanValue;
    }


    /**
     * Sets the booleanValue value for this AttributeDescriptorType.
     * 
     * @param booleanValue
     */
    public void setBooleanValue(java.lang.Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }


    /**
     * Gets the integerValue value for this AttributeDescriptorType.
     * 
     * @return integerValue
     */
    public java.math.BigInteger getIntegerValue() {
        return integerValue;
    }


    /**
     * Sets the integerValue value for this AttributeDescriptorType.
     * 
     * @param integerValue
     */
    public void setIntegerValue(java.math.BigInteger integerValue) {
        this.integerValue = integerValue;
    }


    /**
     * Gets the arrayValue value for this AttributeDescriptorType.
     * 
     * @return arrayValue
     */
    public java.lang.String[] getArrayValue() {
        return arrayValue;
    }


    /**
     * Sets the arrayValue value for this AttributeDescriptorType.
     * 
     * @param arrayValue
     */
    public void setArrayValue(java.lang.String[] arrayValue) {
        this.arrayValue = arrayValue;
    }

    public java.lang.String getArrayValue(int i) {
        return this.arrayValue[i];
    }

    public void setArrayValue(int i, java.lang.String _value) {
        this.arrayValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeDescriptorType)) return false;
        AttributeDescriptorType other = (AttributeDescriptorType) obj;
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
            ((this.dateValue==null && other.getDateValue()==null) || 
             (this.dateValue!=null &&
              this.dateValue.equals(other.getDateValue()))) &&
            ((this.booleanValue==null && other.getBooleanValue()==null) || 
             (this.booleanValue!=null &&
              this.booleanValue.equals(other.getBooleanValue()))) &&
            ((this.integerValue==null && other.getIntegerValue()==null) || 
             (this.integerValue!=null &&
              this.integerValue.equals(other.getIntegerValue()))) &&
            ((this.arrayValue==null && other.getArrayValue()==null) || 
             (this.arrayValue!=null &&
              java.util.Arrays.equals(this.arrayValue, other.getArrayValue())));
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
        if (getDateValue() != null) {
            _hashCode += getDateValue().hashCode();
        }
        if (getBooleanValue() != null) {
            _hashCode += getBooleanValue().hashCode();
        }
        if (getIntegerValue() != null) {
            _hashCode += getIntegerValue().hashCode();
        }
        if (getArrayValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrayValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrayValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeDescriptorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "attributeDescriptorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "attributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "stringValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "dateValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "booleanValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "integerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "arrayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
