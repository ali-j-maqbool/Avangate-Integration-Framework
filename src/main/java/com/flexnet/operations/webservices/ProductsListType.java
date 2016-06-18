/**
 * ProductsListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class ProductsListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.ProductIdentifierWithCountDataType[] product;

    public ProductsListType() {
    }

    public ProductsListType(
           com.flexnet.operations.webservices.ProductIdentifierWithCountDataType[] product) {
           this.product = product;
    }


    /**
     * Gets the product value for this ProductsListType.
     * 
     * @return product
     */
    public com.flexnet.operations.webservices.ProductIdentifierWithCountDataType[] getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ProductsListType.
     * 
     * @param product
     */
    public void setProduct(com.flexnet.operations.webservices.ProductIdentifierWithCountDataType[] product) {
        this.product = product;
    }

    public com.flexnet.operations.webservices.ProductIdentifierWithCountDataType getProduct(int i) {
        return this.product[i];
    }

    public void setProduct(int i, com.flexnet.operations.webservices.ProductIdentifierWithCountDataType _value) {
        this.product[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductsListType)) return false;
        ProductsListType other = (ProductsListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              java.util.Arrays.equals(this.product, other.getProduct())));
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
        if (getProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProduct(), i);
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
        new org.apache.axis.description.TypeDesc(ProductsListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productsListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productIdentifierWithCountDataType"));
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
