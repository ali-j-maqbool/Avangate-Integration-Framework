/**
 * FailedAddWebRegKeyDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedAddWebRegKeyDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedAddWebRegKeyDataType[] failedWebRegKeyData;

    public FailedAddWebRegKeyDataListType() {
    }

    public FailedAddWebRegKeyDataListType(
           com.flexnet.operations.webservices.FailedAddWebRegKeyDataType[] failedWebRegKeyData) {
           this.failedWebRegKeyData = failedWebRegKeyData;
    }


    /**
     * Gets the failedWebRegKeyData value for this FailedAddWebRegKeyDataListType.
     * 
     * @return failedWebRegKeyData
     */
    public com.flexnet.operations.webservices.FailedAddWebRegKeyDataType[] getFailedWebRegKeyData() {
        return failedWebRegKeyData;
    }


    /**
     * Sets the failedWebRegKeyData value for this FailedAddWebRegKeyDataListType.
     * 
     * @param failedWebRegKeyData
     */
    public void setFailedWebRegKeyData(com.flexnet.operations.webservices.FailedAddWebRegKeyDataType[] failedWebRegKeyData) {
        this.failedWebRegKeyData = failedWebRegKeyData;
    }

    public com.flexnet.operations.webservices.FailedAddWebRegKeyDataType getFailedWebRegKeyData(int i) {
        return this.failedWebRegKeyData[i];
    }

    public void setFailedWebRegKeyData(int i, com.flexnet.operations.webservices.FailedAddWebRegKeyDataType _value) {
        this.failedWebRegKeyData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedAddWebRegKeyDataListType)) return false;
        FailedAddWebRegKeyDataListType other = (FailedAddWebRegKeyDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedWebRegKeyData==null && other.getFailedWebRegKeyData()==null) || 
             (this.failedWebRegKeyData!=null &&
              java.util.Arrays.equals(this.failedWebRegKeyData, other.getFailedWebRegKeyData())));
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
        if (getFailedWebRegKeyData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedWebRegKeyData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedWebRegKeyData(), i);
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
        new org.apache.axis.description.TypeDesc(FailedAddWebRegKeyDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedAddWebRegKeyDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedWebRegKeyData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedWebRegKeyData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedAddWebRegKeyDataType"));
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
