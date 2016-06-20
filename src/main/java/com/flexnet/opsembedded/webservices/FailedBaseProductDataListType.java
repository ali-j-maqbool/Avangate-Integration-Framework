/**
 * FailedBaseProductDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class FailedBaseProductDataListType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.FailedBaseProductDataType[] failedBaseProduct;

    public FailedBaseProductDataListType() {
    }

    public FailedBaseProductDataListType(
           com.flexnet.opsembedded.webservices.FailedBaseProductDataType[] failedBaseProduct) {
           this.failedBaseProduct = failedBaseProduct;
    }


    /**
     * Gets the failedBaseProduct value for this FailedBaseProductDataListType.
     * 
     * @return failedBaseProduct
     */
    public com.flexnet.opsembedded.webservices.FailedBaseProductDataType[] getFailedBaseProduct() {
        return failedBaseProduct;
    }


    /**
     * Sets the failedBaseProduct value for this FailedBaseProductDataListType.
     * 
     * @param failedBaseProduct
     */
    public void setFailedBaseProduct(com.flexnet.opsembedded.webservices.FailedBaseProductDataType[] failedBaseProduct) {
        this.failedBaseProduct = failedBaseProduct;
    }

    public com.flexnet.opsembedded.webservices.FailedBaseProductDataType getFailedBaseProduct(int i) {
        return this.failedBaseProduct[i];
    }

    public void setFailedBaseProduct(int i, com.flexnet.opsembedded.webservices.FailedBaseProductDataType _value) {
        this.failedBaseProduct[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedBaseProductDataListType)) return false;
        FailedBaseProductDataListType other = (FailedBaseProductDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedBaseProduct==null && other.getFailedBaseProduct()==null) || 
             (this.failedBaseProduct!=null &&
              java.util.Arrays.equals(this.failedBaseProduct, other.getFailedBaseProduct())));
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
        if (getFailedBaseProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedBaseProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedBaseProduct(), i);
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
        new org.apache.axis.description.TypeDesc(FailedBaseProductDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedBaseProductDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedBaseProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedBaseProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedBaseProductDataType"));
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
