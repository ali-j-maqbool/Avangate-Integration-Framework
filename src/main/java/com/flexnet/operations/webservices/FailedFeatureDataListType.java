/**
 * FailedFeatureDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedFeatureDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedFeatureDataType[] failedFeature;

    public FailedFeatureDataListType() {
    }

    public FailedFeatureDataListType(
           com.flexnet.operations.webservices.FailedFeatureDataType[] failedFeature) {
           this.failedFeature = failedFeature;
    }


    /**
     * Gets the failedFeature value for this FailedFeatureDataListType.
     * 
     * @return failedFeature
     */
    public com.flexnet.operations.webservices.FailedFeatureDataType[] getFailedFeature() {
        return failedFeature;
    }


    /**
     * Sets the failedFeature value for this FailedFeatureDataListType.
     * 
     * @param failedFeature
     */
    public void setFailedFeature(com.flexnet.operations.webservices.FailedFeatureDataType[] failedFeature) {
        this.failedFeature = failedFeature;
    }

    public com.flexnet.operations.webservices.FailedFeatureDataType getFailedFeature(int i) {
        return this.failedFeature[i];
    }

    public void setFailedFeature(int i, com.flexnet.operations.webservices.FailedFeatureDataType _value) {
        this.failedFeature[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedFeatureDataListType)) return false;
        FailedFeatureDataListType other = (FailedFeatureDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedFeature==null && other.getFailedFeature()==null) || 
             (this.failedFeature!=null &&
              java.util.Arrays.equals(this.failedFeature, other.getFailedFeature())));
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
        if (getFailedFeature() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedFeature());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedFeature(), i);
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
        new org.apache.axis.description.TypeDesc(FailedFeatureDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeatureDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedFeature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeature"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeatureDataType"));
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
