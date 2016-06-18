/**
 * AddWebRegKeyRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class AddWebRegKeyRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.AddWebRegKeyDataType[] webRegKeyData;

    private java.lang.Boolean processSync;

    public AddWebRegKeyRequestType() {
    }

    public AddWebRegKeyRequestType(
           com.flexnet.operations.webservices.AddWebRegKeyDataType[] webRegKeyData,
           java.lang.Boolean processSync) {
           this.webRegKeyData = webRegKeyData;
           this.processSync = processSync;
    }


    /**
     * Gets the webRegKeyData value for this AddWebRegKeyRequestType.
     * 
     * @return webRegKeyData
     */
    public com.flexnet.operations.webservices.AddWebRegKeyDataType[] getWebRegKeyData() {
        return webRegKeyData;
    }


    /**
     * Sets the webRegKeyData value for this AddWebRegKeyRequestType.
     * 
     * @param webRegKeyData
     */
    public void setWebRegKeyData(com.flexnet.operations.webservices.AddWebRegKeyDataType[] webRegKeyData) {
        this.webRegKeyData = webRegKeyData;
    }

    public com.flexnet.operations.webservices.AddWebRegKeyDataType getWebRegKeyData(int i) {
        return this.webRegKeyData[i];
    }

    public void setWebRegKeyData(int i, com.flexnet.operations.webservices.AddWebRegKeyDataType _value) {
        this.webRegKeyData[i] = _value;
    }


    /**
     * Gets the processSync value for this AddWebRegKeyRequestType.
     * 
     * @return processSync
     */
    public java.lang.Boolean getProcessSync() {
        return processSync;
    }


    /**
     * Sets the processSync value for this AddWebRegKeyRequestType.
     * 
     * @param processSync
     */
    public void setProcessSync(java.lang.Boolean processSync) {
        this.processSync = processSync;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddWebRegKeyRequestType)) return false;
        AddWebRegKeyRequestType other = (AddWebRegKeyRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webRegKeyData==null && other.getWebRegKeyData()==null) || 
             (this.webRegKeyData!=null &&
              java.util.Arrays.equals(this.webRegKeyData, other.getWebRegKeyData()))) &&
            ((this.processSync==null && other.getProcessSync()==null) || 
             (this.processSync!=null &&
              this.processSync.equals(other.getProcessSync())));
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
        if (getWebRegKeyData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWebRegKeyData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWebRegKeyData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcessSync() != null) {
            _hashCode += getProcessSync().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddWebRegKeyRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addWebRegKeyRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webRegKeyData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeyData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addWebRegKeyDataType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processSync");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "processSync"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
