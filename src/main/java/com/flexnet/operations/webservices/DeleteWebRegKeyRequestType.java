/**
 * DeleteWebRegKeyRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class DeleteWebRegKeyRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.WebRegKeysListType webRegKeyList;

    public DeleteWebRegKeyRequestType() {
    }

    public DeleteWebRegKeyRequestType(
           com.flexnet.operations.webservices.WebRegKeysListType webRegKeyList) {
           this.webRegKeyList = webRegKeyList;
    }


    /**
     * Gets the webRegKeyList value for this DeleteWebRegKeyRequestType.
     * 
     * @return webRegKeyList
     */
    public com.flexnet.operations.webservices.WebRegKeysListType getWebRegKeyList() {
        return webRegKeyList;
    }


    /**
     * Sets the webRegKeyList value for this DeleteWebRegKeyRequestType.
     * 
     * @param webRegKeyList
     */
    public void setWebRegKeyList(com.flexnet.operations.webservices.WebRegKeysListType webRegKeyList) {
        this.webRegKeyList = webRegKeyList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteWebRegKeyRequestType)) return false;
        DeleteWebRegKeyRequestType other = (DeleteWebRegKeyRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webRegKeyList==null && other.getWebRegKeyList()==null) || 
             (this.webRegKeyList!=null &&
              this.webRegKeyList.equals(other.getWebRegKeyList())));
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
        if (getWebRegKeyList() != null) {
            _hashCode += getWebRegKeyList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteWebRegKeyRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteWebRegKeyRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webRegKeyList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeysListType"));
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
