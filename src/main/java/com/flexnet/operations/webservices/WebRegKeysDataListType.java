/**
 * WebRegKeysDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class WebRegKeysDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.WebRegKeyType webRegKeys;

    public WebRegKeysDataListType() {
    }

    public WebRegKeysDataListType(
           com.flexnet.operations.webservices.WebRegKeyType webRegKeys) {
           this.webRegKeys = webRegKeys;
    }


    /**
     * Gets the webRegKeys value for this WebRegKeysDataListType.
     * 
     * @return webRegKeys
     */
    public com.flexnet.operations.webservices.WebRegKeyType getWebRegKeys() {
        return webRegKeys;
    }


    /**
     * Sets the webRegKeys value for this WebRegKeysDataListType.
     * 
     * @param webRegKeys
     */
    public void setWebRegKeys(com.flexnet.operations.webservices.WebRegKeyType webRegKeys) {
        this.webRegKeys = webRegKeys;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebRegKeysDataListType)) return false;
        WebRegKeysDataListType other = (WebRegKeysDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webRegKeys==null && other.getWebRegKeys()==null) || 
             (this.webRegKeys!=null &&
              this.webRegKeys.equals(other.getWebRegKeys())));
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
        if (getWebRegKeys() != null) {
            _hashCode += getWebRegKeys().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebRegKeysDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeysDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webRegKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
