/**
 * CustomAttributeDescriptorDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class CustomAttributeDescriptorDataType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.CustomAttributeDescriptorType[] attribute;

    public CustomAttributeDescriptorDataType() {
    }

    public CustomAttributeDescriptorDataType(
           com.flexnet.opsembedded.webservices.CustomAttributeDescriptorType[] attribute) {
           this.attribute = attribute;
    }


    /**
     * Gets the attribute value for this CustomAttributeDescriptorDataType.
     * 
     * @return attribute
     */
    public com.flexnet.opsembedded.webservices.CustomAttributeDescriptorType[] getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this CustomAttributeDescriptorDataType.
     * 
     * @param attribute
     */
    public void setAttribute(com.flexnet.opsembedded.webservices.CustomAttributeDescriptorType[] attribute) {
        this.attribute = attribute;
    }

    public com.flexnet.opsembedded.webservices.CustomAttributeDescriptorType getAttribute(int i) {
        return this.attribute[i];
    }

    public void setAttribute(int i, com.flexnet.opsembedded.webservices.CustomAttributeDescriptorType _value) {
        this.attribute[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomAttributeDescriptorDataType)) return false;
        CustomAttributeDescriptorDataType other = (CustomAttributeDescriptorDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              java.util.Arrays.equals(this.attribute, other.getAttribute())));
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
        if (getAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttribute(), i);
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
        new org.apache.axis.description.TypeDesc(CustomAttributeDescriptorDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "customAttributeDescriptorDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "customAttributeDescriptorType"));
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
