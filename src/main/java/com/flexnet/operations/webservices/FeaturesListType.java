/**
 * FeaturesListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FeaturesListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FeatureIdentifierWithCountDataType[] feature;

    public FeaturesListType() {
    }

    public FeaturesListType(
           com.flexnet.operations.webservices.FeatureIdentifierWithCountDataType[] feature) {
           this.feature = feature;
    }


    /**
     * Gets the feature value for this FeaturesListType.
     * 
     * @return feature
     */
    public com.flexnet.operations.webservices.FeatureIdentifierWithCountDataType[] getFeature() {
        return feature;
    }


    /**
     * Sets the feature value for this FeaturesListType.
     * 
     * @param feature
     */
    public void setFeature(com.flexnet.operations.webservices.FeatureIdentifierWithCountDataType[] feature) {
        this.feature = feature;
    }

    public com.flexnet.operations.webservices.FeatureIdentifierWithCountDataType getFeature(int i) {
        return this.feature[i];
    }

    public void setFeature(int i, com.flexnet.operations.webservices.FeatureIdentifierWithCountDataType _value) {
        this.feature[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeaturesListType)) return false;
        FeaturesListType other = (FeaturesListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feature==null && other.getFeature()==null) || 
             (this.feature!=null &&
              java.util.Arrays.equals(this.feature, other.getFeature())));
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
        if (getFeature() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeature());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeature(), i);
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
        new org.apache.axis.description.TypeDesc(FeaturesListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featuresListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "feature"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureIdentifierWithCountDataType"));
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
