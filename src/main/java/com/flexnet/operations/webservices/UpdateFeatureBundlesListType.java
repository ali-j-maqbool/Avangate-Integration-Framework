/**
 * UpdateFeatureBundlesListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UpdateFeatureBundlesListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FeatureBundleIdentifierWithCountDataType[] featureBundle;

    private com.flexnet.operations.webservices.CollectionOperationType opType;

    public UpdateFeatureBundlesListType() {
    }

    public UpdateFeatureBundlesListType(
           com.flexnet.operations.webservices.FeatureBundleIdentifierWithCountDataType[] featureBundle,
           com.flexnet.operations.webservices.CollectionOperationType opType) {
           this.featureBundle = featureBundle;
           this.opType = opType;
    }


    /**
     * Gets the featureBundle value for this UpdateFeatureBundlesListType.
     * 
     * @return featureBundle
     */
    public com.flexnet.operations.webservices.FeatureBundleIdentifierWithCountDataType[] getFeatureBundle() {
        return featureBundle;
    }


    /**
     * Sets the featureBundle value for this UpdateFeatureBundlesListType.
     * 
     * @param featureBundle
     */
    public void setFeatureBundle(com.flexnet.operations.webservices.FeatureBundleIdentifierWithCountDataType[] featureBundle) {
        this.featureBundle = featureBundle;
    }

    public com.flexnet.operations.webservices.FeatureBundleIdentifierWithCountDataType getFeatureBundle(int i) {
        return this.featureBundle[i];
    }

    public void setFeatureBundle(int i, com.flexnet.operations.webservices.FeatureBundleIdentifierWithCountDataType _value) {
        this.featureBundle[i] = _value;
    }


    /**
     * Gets the opType value for this UpdateFeatureBundlesListType.
     * 
     * @return opType
     */
    public com.flexnet.operations.webservices.CollectionOperationType getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this UpdateFeatureBundlesListType.
     * 
     * @param opType
     */
    public void setOpType(com.flexnet.operations.webservices.CollectionOperationType opType) {
        this.opType = opType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateFeatureBundlesListType)) return false;
        UpdateFeatureBundlesListType other = (UpdateFeatureBundlesListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featureBundle==null && other.getFeatureBundle()==null) || 
             (this.featureBundle!=null &&
              java.util.Arrays.equals(this.featureBundle, other.getFeatureBundle()))) &&
            ((this.opType==null && other.getOpType()==null) || 
             (this.opType!=null &&
              this.opType.equals(other.getOpType())));
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
        if (getFeatureBundle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureBundle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureBundle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpType() != null) {
            _hashCode += getOpType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateFeatureBundlesListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureBundlesListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleIdentifierWithCountDataType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "opType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "CollectionOperationType"));
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
