/**
 * FailedLinkOrgDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedLinkOrgDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedLinkOrgDataType[] failedOrgData;

    public FailedLinkOrgDataListType() {
    }

    public FailedLinkOrgDataListType(
           com.flexnet.operations.webservices.FailedLinkOrgDataType[] failedOrgData) {
           this.failedOrgData = failedOrgData;
    }


    /**
     * Gets the failedOrgData value for this FailedLinkOrgDataListType.
     * 
     * @return failedOrgData
     */
    public com.flexnet.operations.webservices.FailedLinkOrgDataType[] getFailedOrgData() {
        return failedOrgData;
    }


    /**
     * Sets the failedOrgData value for this FailedLinkOrgDataListType.
     * 
     * @param failedOrgData
     */
    public void setFailedOrgData(com.flexnet.operations.webservices.FailedLinkOrgDataType[] failedOrgData) {
        this.failedOrgData = failedOrgData;
    }

    public com.flexnet.operations.webservices.FailedLinkOrgDataType getFailedOrgData(int i) {
        return this.failedOrgData[i];
    }

    public void setFailedOrgData(int i, com.flexnet.operations.webservices.FailedLinkOrgDataType _value) {
        this.failedOrgData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedLinkOrgDataListType)) return false;
        FailedLinkOrgDataListType other = (FailedLinkOrgDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedOrgData==null && other.getFailedOrgData()==null) || 
             (this.failedOrgData!=null &&
              java.util.Arrays.equals(this.failedOrgData, other.getFailedOrgData())));
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
        if (getFailedOrgData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedOrgData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedOrgData(), i);
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
        new org.apache.axis.description.TypeDesc(FailedLinkOrgDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedLinkOrgDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedOrgData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedOrgData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedLinkOrgDataType"));
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
