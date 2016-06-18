/**
 * GetProductCategoriesResponseDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetProductCategoriesResponseDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.ProductCategoryDataType[] productCategory;

    public GetProductCategoriesResponseDataType() {
    }

    public GetProductCategoriesResponseDataType(
           com.flexnet.operations.webservices.ProductCategoryDataType[] productCategory) {
           this.productCategory = productCategory;
    }


    /**
     * Gets the productCategory value for this GetProductCategoriesResponseDataType.
     * 
     * @return productCategory
     */
    public com.flexnet.operations.webservices.ProductCategoryDataType[] getProductCategory() {
        return productCategory;
    }


    /**
     * Sets the productCategory value for this GetProductCategoriesResponseDataType.
     * 
     * @param productCategory
     */
    public void setProductCategory(com.flexnet.operations.webservices.ProductCategoryDataType[] productCategory) {
        this.productCategory = productCategory;
    }

    public com.flexnet.operations.webservices.ProductCategoryDataType getProductCategory(int i) {
        return this.productCategory[i];
    }

    public void setProductCategory(int i, com.flexnet.operations.webservices.ProductCategoryDataType _value) {
        this.productCategory[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetProductCategoriesResponseDataType)) return false;
        GetProductCategoriesResponseDataType other = (GetProductCategoriesResponseDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productCategory==null && other.getProductCategory()==null) || 
             (this.productCategory!=null &&
              java.util.Arrays.equals(this.productCategory, other.getProductCategory())));
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
        if (getProductCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductCategory(), i);
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
        new org.apache.axis.description.TypeDesc(GetProductCategoriesResponseDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCategoriesResponseDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productCategoryDataType"));
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
