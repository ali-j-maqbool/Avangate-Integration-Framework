/**
 * FailedPartNumberDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedPartNumberDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedPartNumberDataType[] failedPartNumber;

    public FailedPartNumberDataListType() {
    }

    public FailedPartNumberDataListType(
           com.flexnet.operations.webservices.FailedPartNumberDataType[] failedPartNumber) {
           this.failedPartNumber = failedPartNumber;
    }


    /**
     * Gets the failedPartNumber value for this FailedPartNumberDataListType.
     * 
     * @return failedPartNumber
     */
    public com.flexnet.operations.webservices.FailedPartNumberDataType[] getFailedPartNumber() {
        return failedPartNumber;
    }


    /**
     * Sets the failedPartNumber value for this FailedPartNumberDataListType.
     * 
     * @param failedPartNumber
     */
    public void setFailedPartNumber(com.flexnet.operations.webservices.FailedPartNumberDataType[] failedPartNumber) {
        this.failedPartNumber = failedPartNumber;
    }

    public com.flexnet.operations.webservices.FailedPartNumberDataType getFailedPartNumber(int i) {
        return this.failedPartNumber[i];
    }

    public void setFailedPartNumber(int i, com.flexnet.operations.webservices.FailedPartNumberDataType _value) {
        this.failedPartNumber[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedPartNumberDataListType)) return false;
        FailedPartNumberDataListType other = (FailedPartNumberDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedPartNumber==null && other.getFailedPartNumber()==null) || 
             (this.failedPartNumber!=null &&
              java.util.Arrays.equals(this.failedPartNumber, other.getFailedPartNumber())));
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
        if (getFailedPartNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedPartNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedPartNumber(), i);
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
        new org.apache.axis.description.TypeDesc(FailedPartNumberDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedPartNumberDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedPartNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedPartNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedPartNumberDataType"));
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
