/**
 * BaseProductRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class BaseProductRequestType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.BaseProductDataType[] baseProduct;

    public BaseProductRequestType() {
    }

    public BaseProductRequestType(
           com.flexnet.opsembedded.webservices.BaseProductDataType[] baseProduct) {
           this.baseProduct = baseProduct;
    }


    /**
     * Gets the baseProduct value for this BaseProductRequestType.
     * 
     * @return baseProduct
     */
    public com.flexnet.opsembedded.webservices.BaseProductDataType[] getBaseProduct() {
        return baseProduct;
    }


    /**
     * Sets the baseProduct value for this BaseProductRequestType.
     * 
     * @param baseProduct
     */
    public void setBaseProduct(com.flexnet.opsembedded.webservices.BaseProductDataType[] baseProduct) {
        this.baseProduct = baseProduct;
    }

    public com.flexnet.opsembedded.webservices.BaseProductDataType getBaseProduct(int i) {
        return this.baseProduct[i];
    }

    public void setBaseProduct(int i, com.flexnet.opsembedded.webservices.BaseProductDataType _value) {
        this.baseProduct[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseProductRequestType)) return false;
        BaseProductRequestType other = (BaseProductRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseProduct==null && other.getBaseProduct()==null) || 
             (this.baseProduct!=null &&
              java.util.Arrays.equals(this.baseProduct, other.getBaseProduct())));
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
        if (getBaseProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaseProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBaseProduct(), i);
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
        new org.apache.axis.description.TypeDesc(BaseProductRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "baseProductRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "baseProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "baseProductDataType"));
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
