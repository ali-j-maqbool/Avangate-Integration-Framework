/**
 * FailedMapEntitlementsToUserDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedMapEntitlementsToUserDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedIdDataType[] failedId;

    public FailedMapEntitlementsToUserDataListType() {
    }

    public FailedMapEntitlementsToUserDataListType(
           com.flexnet.operations.webservices.FailedIdDataType[] failedId) {
           this.failedId = failedId;
    }


    /**
     * Gets the failedId value for this FailedMapEntitlementsToUserDataListType.
     * 
     * @return failedId
     */
    public com.flexnet.operations.webservices.FailedIdDataType[] getFailedId() {
        return failedId;
    }


    /**
     * Sets the failedId value for this FailedMapEntitlementsToUserDataListType.
     * 
     * @param failedId
     */
    public void setFailedId(com.flexnet.operations.webservices.FailedIdDataType[] failedId) {
        this.failedId = failedId;
    }

    public com.flexnet.operations.webservices.FailedIdDataType getFailedId(int i) {
        return this.failedId[i];
    }

    public void setFailedId(int i, com.flexnet.operations.webservices.FailedIdDataType _value) {
        this.failedId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedMapEntitlementsToUserDataListType)) return false;
        FailedMapEntitlementsToUserDataListType other = (FailedMapEntitlementsToUserDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedId==null && other.getFailedId()==null) || 
             (this.failedId!=null &&
              java.util.Arrays.equals(this.failedId, other.getFailedId())));
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
        if (getFailedId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedId(), i);
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
        new org.apache.axis.description.TypeDesc(FailedMapEntitlementsToUserDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMapEntitlementsToUserDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedIdDataType"));
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
