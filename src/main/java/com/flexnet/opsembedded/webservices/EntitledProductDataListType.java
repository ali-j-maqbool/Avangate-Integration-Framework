/**
 * EntitledProductDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class EntitledProductDataListType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.EntitledProductDataType[] entitledProduct;

    public EntitledProductDataListType() {
    }

    public EntitledProductDataListType(
           com.flexnet.opsembedded.webservices.EntitledProductDataType[] entitledProduct) {
           this.entitledProduct = entitledProduct;
    }


    /**
     * Gets the entitledProduct value for this EntitledProductDataListType.
     * 
     * @return entitledProduct
     */
    public com.flexnet.opsembedded.webservices.EntitledProductDataType[] getEntitledProduct() {
        return entitledProduct;
    }


    /**
     * Sets the entitledProduct value for this EntitledProductDataListType.
     * 
     * @param entitledProduct
     */
    public void setEntitledProduct(com.flexnet.opsembedded.webservices.EntitledProductDataType[] entitledProduct) {
        this.entitledProduct = entitledProduct;
    }

    public com.flexnet.opsembedded.webservices.EntitledProductDataType getEntitledProduct(int i) {
        return this.entitledProduct[i];
    }

    public void setEntitledProduct(int i, com.flexnet.opsembedded.webservices.EntitledProductDataType _value) {
        this.entitledProduct[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitledProductDataListType)) return false;
        EntitledProductDataListType other = (EntitledProductDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitledProduct==null && other.getEntitledProduct()==null) || 
             (this.entitledProduct!=null &&
              java.util.Arrays.equals(this.entitledProduct, other.getEntitledProduct())));
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
        if (getEntitledProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntitledProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntitledProduct(), i);
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
        new org.apache.axis.description.TypeDesc(EntitledProductDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "entitledProductDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitledProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "entitledProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "entitledProductDataType"));
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
