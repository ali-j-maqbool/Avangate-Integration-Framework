/**
 * FeatureIdentifierWithCountDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FeatureIdentifierWithCountDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FeatureIdentifierType featureIdentifier;

    private org.apache.axis.types.PositiveInteger count;

    public FeatureIdentifierWithCountDataType() {
    }

    public FeatureIdentifierWithCountDataType(
           com.flexnet.operations.webservices.FeatureIdentifierType featureIdentifier,
           org.apache.axis.types.PositiveInteger count) {
           this.featureIdentifier = featureIdentifier;
           this.count = count;
    }


    /**
     * Gets the featureIdentifier value for this FeatureIdentifierWithCountDataType.
     * 
     * @return featureIdentifier
     */
    public com.flexnet.operations.webservices.FeatureIdentifierType getFeatureIdentifier() {
        return featureIdentifier;
    }


    /**
     * Sets the featureIdentifier value for this FeatureIdentifierWithCountDataType.
     * 
     * @param featureIdentifier
     */
    public void setFeatureIdentifier(com.flexnet.operations.webservices.FeatureIdentifierType featureIdentifier) {
        this.featureIdentifier = featureIdentifier;
    }


    /**
     * Gets the count value for this FeatureIdentifierWithCountDataType.
     * 
     * @return count
     */
    public org.apache.axis.types.PositiveInteger getCount() {
        return count;
    }


    /**
     * Sets the count value for this FeatureIdentifierWithCountDataType.
     * 
     * @param count
     */
    public void setCount(org.apache.axis.types.PositiveInteger count) {
        this.count = count;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureIdentifierWithCountDataType)) return false;
        FeatureIdentifierWithCountDataType other = (FeatureIdentifierWithCountDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featureIdentifier==null && other.getFeatureIdentifier()==null) || 
             (this.featureIdentifier!=null &&
              this.featureIdentifier.equals(other.getFeatureIdentifier()))) &&
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
        if (getFeatureIdentifier() != null) {
            _hashCode += getFeatureIdentifier().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureIdentifierWithCountDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureIdentifierWithCountDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureIdentifierType"));
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
