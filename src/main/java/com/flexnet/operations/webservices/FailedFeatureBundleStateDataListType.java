/**
 * FailedFeatureBundleStateDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedFeatureBundleStateDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedFeatureBundleStateDataType[] failedFeatureBundle;

    public FailedFeatureBundleStateDataListType() {
    }

    public FailedFeatureBundleStateDataListType(
           com.flexnet.operations.webservices.FailedFeatureBundleStateDataType[] failedFeatureBundle) {
           this.failedFeatureBundle = failedFeatureBundle;
    }


    /**
     * Gets the failedFeatureBundle value for this FailedFeatureBundleStateDataListType.
     * 
     * @return failedFeatureBundle
     */
    public com.flexnet.operations.webservices.FailedFeatureBundleStateDataType[] getFailedFeatureBundle() {
        return failedFeatureBundle;
    }


    /**
     * Sets the failedFeatureBundle value for this FailedFeatureBundleStateDataListType.
     * 
     * @param failedFeatureBundle
     */
    public void setFailedFeatureBundle(com.flexnet.operations.webservices.FailedFeatureBundleStateDataType[] failedFeatureBundle) {
        this.failedFeatureBundle = failedFeatureBundle;
    }

    public com.flexnet.operations.webservices.FailedFeatureBundleStateDataType getFailedFeatureBundle(int i) {
        return this.failedFeatureBundle[i];
    }

    public void setFailedFeatureBundle(int i, com.flexnet.operations.webservices.FailedFeatureBundleStateDataType _value) {
        this.failedFeatureBundle[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedFeatureBundleStateDataListType)) return false;
        FailedFeatureBundleStateDataListType other = (FailedFeatureBundleStateDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedFeatureBundle==null && other.getFailedFeatureBundle()==null) || 
             (this.failedFeatureBundle!=null &&
              java.util.Arrays.equals(this.failedFeatureBundle, other.getFailedFeatureBundle())));
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
        if (getFailedFeatureBundle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedFeatureBundle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedFeatureBundle(), i);
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
        new org.apache.axis.description.TypeDesc(FailedFeatureBundleStateDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeatureBundleStateDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedFeatureBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeatureBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeatureBundleStateDataType"));
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
