/**
 * FeatureBundleIdentifierWithCountDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FeatureBundleIdentifierWithCountDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FeatureBundleIdentifierType featureBundleIdentifier;

    private org.apache.axis.types.PositiveInteger count;

    public FeatureBundleIdentifierWithCountDataType() {
    }

    public FeatureBundleIdentifierWithCountDataType(
           com.flexnet.operations.webservices.FeatureBundleIdentifierType featureBundleIdentifier,
           org.apache.axis.types.PositiveInteger count) {
           this.featureBundleIdentifier = featureBundleIdentifier;
           this.count = count;
    }


    /**
     * Gets the featureBundleIdentifier value for this FeatureBundleIdentifierWithCountDataType.
     * 
     * @return featureBundleIdentifier
     */
    public com.flexnet.operations.webservices.FeatureBundleIdentifierType getFeatureBundleIdentifier() {
        return featureBundleIdentifier;
    }


    /**
     * Sets the featureBundleIdentifier value for this FeatureBundleIdentifierWithCountDataType.
     * 
     * @param featureBundleIdentifier
     */
    public void setFeatureBundleIdentifier(com.flexnet.operations.webservices.FeatureBundleIdentifierType featureBundleIdentifier) {
        this.featureBundleIdentifier = featureBundleIdentifier;
    }


    /**
     * Gets the count value for this FeatureBundleIdentifierWithCountDataType.
     * 
     * @return count
     */
    public org.apache.axis.types.PositiveInteger getCount() {
        return count;
    }


    /**
     * Sets the count value for this FeatureBundleIdentifierWithCountDataType.
     * 
     * @param count
     */
    public void setCount(org.apache.axis.types.PositiveInteger count) {
        this.count = count;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureBundleIdentifierWithCountDataType)) return false;
        FeatureBundleIdentifierWithCountDataType other = (FeatureBundleIdentifierWithCountDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featureBundleIdentifier==null && other.getFeatureBundleIdentifier()==null) || 
             (this.featureBundleIdentifier!=null &&
              this.featureBundleIdentifier.equals(other.getFeatureBundleIdentifier()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount())));
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
        if (getFeatureBundleIdentifier() != null) {
            _hashCode += getFeatureBundleIdentifier().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureBundleIdentifierWithCountDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleIdentifierWithCountDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureBundleIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
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
