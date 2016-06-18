/**
 * WebRegKeysListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class WebRegKeysListType  implements java.io.Serializable {
    private java.lang.String[] webRegKey;

    public WebRegKeysListType() {
    }

    public WebRegKeysListType(
           java.lang.String[] webRegKey) {
           this.webRegKey = webRegKey;
    }


    /**
     * Gets the webRegKey value for this WebRegKeysListType.
     * 
     * @return webRegKey
     */
    public java.lang.String[] getWebRegKey() {
        return webRegKey;
    }


    /**
     * Sets the webRegKey value for this WebRegKeysListType.
     * 
     * @param webRegKey
     */
    public void setWebRegKey(java.lang.String[] webRegKey) {
        this.webRegKey = webRegKey;
    }

    public java.lang.String getWebRegKey(int i) {
        return this.webRegKey[i];
    }

    public void setWebRegKey(int i, java.lang.String _value) {
        this.webRegKey[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebRegKeysListType)) return false;
        WebRegKeysListType other = (WebRegKeysListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webRegKey==null && other.getWebRegKey()==null) || 
             (this.webRegKey!=null &&
              java.util.Arrays.equals(this.webRegKey, other.getWebRegKey())));
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
        if (getWebRegKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWebRegKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWebRegKey(), i);
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
        new org.apache.axis.description.TypeDesc(WebRegKeysListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeysListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webRegKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKey"));
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
