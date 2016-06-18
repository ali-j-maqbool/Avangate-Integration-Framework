/**
 * CreatedProductDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreatedProductDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.CreatedProductDataType[] createdProduct;

    public CreatedProductDataListType() {
    }

    public CreatedProductDataListType(
           com.flexnet.operations.webservices.CreatedProductDataType[] createdProduct) {
           this.createdProduct = createdProduct;
    }


    /**
     * Gets the createdProduct value for this CreatedProductDataListType.
     * 
     * @return createdProduct
     */
    public com.flexnet.operations.webservices.CreatedProductDataType[] getCreatedProduct() {
        return createdProduct;
    }


    /**
     * Sets the createdProduct value for this CreatedProductDataListType.
     * 
     * @param createdProduct
     */
    public void setCreatedProduct(com.flexnet.operations.webservices.CreatedProductDataType[] createdProduct) {
        this.createdProduct = createdProduct;
    }

    public com.flexnet.operations.webservices.CreatedProductDataType getCreatedProduct(int i) {
        return this.createdProduct[i];
    }

    public void setCreatedProduct(int i, com.flexnet.operations.webservices.CreatedProductDataType _value) {
        this.createdProduct[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatedProductDataListType)) return false;
        CreatedProductDataListType other = (CreatedProductDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdProduct==null && other.getCreatedProduct()==null) || 
             (this.createdProduct!=null &&
              java.util.Arrays.equals(this.createdProduct, other.getCreatedProduct())));
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
        if (getCreatedProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedProduct(), i);
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
        new org.apache.axis.description.TypeDesc(CreatedProductDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdProductDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdProductDataType"));
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
