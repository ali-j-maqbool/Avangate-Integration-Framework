/**
 * FailedDeleteProductDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedDeleteProductDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedDeleteProductDataType[] failedProduct;

    public FailedDeleteProductDataListType() {
    }

    public FailedDeleteProductDataListType(
           com.flexnet.operations.webservices.FailedDeleteProductDataType[] failedProduct) {
           this.failedProduct = failedProduct;
    }


    /**
     * Gets the failedProduct value for this FailedDeleteProductDataListType.
     * 
     * @return failedProduct
     */
    public com.flexnet.operations.webservices.FailedDeleteProductDataType[] getFailedProduct() {
        return failedProduct;
    }


    /**
     * Sets the failedProduct value for this FailedDeleteProductDataListType.
     * 
     * @param failedProduct
     */
    public void setFailedProduct(com.flexnet.operations.webservices.FailedDeleteProductDataType[] failedProduct) {
        this.failedProduct = failedProduct;
    }

    public com.flexnet.operations.webservices.FailedDeleteProductDataType getFailedProduct(int i) {
        return this.failedProduct[i];
    }

    public void setFailedProduct(int i, com.flexnet.operations.webservices.FailedDeleteProductDataType _value) {
        this.failedProduct[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedDeleteProductDataListType)) return false;
        FailedDeleteProductDataListType other = (FailedDeleteProductDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedProduct==null && other.getFailedProduct()==null) || 
             (this.failedProduct!=null &&
              java.util.Arrays.equals(this.failedProduct, other.getFailedProduct())));
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
        if (getFailedProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedProduct(), i);
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
        new org.apache.axis.description.TypeDesc(FailedDeleteProductDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteProductDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteProductDataType"));
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
