/**
 * FailedMatchingBulkEntsListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedMatchingBulkEntsListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedMatchingBulkEntDataType[] failedBulkEnt;

    public FailedMatchingBulkEntsListType() {
    }

    public FailedMatchingBulkEntsListType(
           com.flexnet.operations.webservices.FailedMatchingBulkEntDataType[] failedBulkEnt) {
           this.failedBulkEnt = failedBulkEnt;
    }


    /**
     * Gets the failedBulkEnt value for this FailedMatchingBulkEntsListType.
     * 
     * @return failedBulkEnt
     */
    public com.flexnet.operations.webservices.FailedMatchingBulkEntDataType[] getFailedBulkEnt() {
        return failedBulkEnt;
    }


    /**
     * Sets the failedBulkEnt value for this FailedMatchingBulkEntsListType.
     * 
     * @param failedBulkEnt
     */
    public void setFailedBulkEnt(com.flexnet.operations.webservices.FailedMatchingBulkEntDataType[] failedBulkEnt) {
        this.failedBulkEnt = failedBulkEnt;
    }

    public com.flexnet.operations.webservices.FailedMatchingBulkEntDataType getFailedBulkEnt(int i) {
        return this.failedBulkEnt[i];
    }

    public void setFailedBulkEnt(int i, com.flexnet.operations.webservices.FailedMatchingBulkEntDataType _value) {
        this.failedBulkEnt[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedMatchingBulkEntsListType)) return false;
        FailedMatchingBulkEntsListType other = (FailedMatchingBulkEntsListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedBulkEnt==null && other.getFailedBulkEnt()==null) || 
             (this.failedBulkEnt!=null &&
              java.util.Arrays.equals(this.failedBulkEnt, other.getFailedBulkEnt())));
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
        if (getFailedBulkEnt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedBulkEnt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedBulkEnt(), i);
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
        new org.apache.axis.description.TypeDesc(FailedMatchingBulkEntsListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMatchingBulkEntsListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedBulkEnt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedBulkEnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMatchingBulkEntDataType"));
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
