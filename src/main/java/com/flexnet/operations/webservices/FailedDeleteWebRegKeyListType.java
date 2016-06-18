/**
 * FailedDeleteWebRegKeyListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedDeleteWebRegKeyListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedDeleteWebRegKeyDataType[] failedWebRegKey;

    public FailedDeleteWebRegKeyListType() {
    }

    public FailedDeleteWebRegKeyListType(
           com.flexnet.operations.webservices.FailedDeleteWebRegKeyDataType[] failedWebRegKey) {
           this.failedWebRegKey = failedWebRegKey;
    }


    /**
     * Gets the failedWebRegKey value for this FailedDeleteWebRegKeyListType.
     * 
     * @return failedWebRegKey
     */
    public com.flexnet.operations.webservices.FailedDeleteWebRegKeyDataType[] getFailedWebRegKey() {
        return failedWebRegKey;
    }


    /**
     * Sets the failedWebRegKey value for this FailedDeleteWebRegKeyListType.
     * 
     * @param failedWebRegKey
     */
    public void setFailedWebRegKey(com.flexnet.operations.webservices.FailedDeleteWebRegKeyDataType[] failedWebRegKey) {
        this.failedWebRegKey = failedWebRegKey;
    }

    public com.flexnet.operations.webservices.FailedDeleteWebRegKeyDataType getFailedWebRegKey(int i) {
        return this.failedWebRegKey[i];
    }

    public void setFailedWebRegKey(int i, com.flexnet.operations.webservices.FailedDeleteWebRegKeyDataType _value) {
        this.failedWebRegKey[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedDeleteWebRegKeyListType)) return false;
        FailedDeleteWebRegKeyListType other = (FailedDeleteWebRegKeyListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedWebRegKey==null && other.getFailedWebRegKey()==null) || 
             (this.failedWebRegKey!=null &&
              java.util.Arrays.equals(this.failedWebRegKey, other.getFailedWebRegKey())));
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
        if (getFailedWebRegKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedWebRegKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedWebRegKey(), i);
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
        new org.apache.axis.description.TypeDesc(FailedDeleteWebRegKeyListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteWebRegKeyListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedWebRegKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedWebRegKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteWebRegKeyDataType"));
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
