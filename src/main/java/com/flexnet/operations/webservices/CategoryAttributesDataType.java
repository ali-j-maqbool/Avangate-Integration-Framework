/**
 * CategoryAttributesDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CategoryAttributesDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.CategoryAttributeDataType[] categoryAttribute;

    public CategoryAttributesDataType() {
    }

    public CategoryAttributesDataType(
           com.flexnet.operations.webservices.CategoryAttributeDataType[] categoryAttribute) {
           this.categoryAttribute = categoryAttribute;
    }


    /**
     * Gets the categoryAttribute value for this CategoryAttributesDataType.
     * 
     * @return categoryAttribute
     */
    public com.flexnet.operations.webservices.CategoryAttributeDataType[] getCategoryAttribute() {
        return categoryAttribute;
    }


    /**
     * Sets the categoryAttribute value for this CategoryAttributesDataType.
     * 
     * @param categoryAttribute
     */
    public void setCategoryAttribute(com.flexnet.operations.webservices.CategoryAttributeDataType[] categoryAttribute) {
        this.categoryAttribute = categoryAttribute;
    }

    public com.flexnet.operations.webservices.CategoryAttributeDataType getCategoryAttribute(int i) {
        return this.categoryAttribute[i];
    }

    public void setCategoryAttribute(int i, com.flexnet.operations.webservices.CategoryAttributeDataType _value) {
        this.categoryAttribute[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoryAttributesDataType)) return false;
        CategoryAttributesDataType other = (CategoryAttributesDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoryAttribute==null && other.getCategoryAttribute()==null) || 
             (this.categoryAttribute!=null &&
              java.util.Arrays.equals(this.categoryAttribute, other.getCategoryAttribute())));
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
        if (getCategoryAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoryAttribute(), i);
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
        new org.apache.axis.description.TypeDesc(CategoryAttributesDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "categoryAttributesDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "categoryAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "categoryAttributeDataType"));
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
