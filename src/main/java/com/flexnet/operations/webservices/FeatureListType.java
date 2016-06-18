/**
 * FeatureListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FeatureListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FeatureIdentifierType[] featureIdentifier;

    public FeatureListType() {
    }

    public FeatureListType(
           com.flexnet.operations.webservices.FeatureIdentifierType[] featureIdentifier) {
           this.featureIdentifier = featureIdentifier;
    }


    /**
     * Gets the featureIdentifier value for this FeatureListType.
     * 
     * @return featureIdentifier
     */
    public com.flexnet.operations.webservices.FeatureIdentifierType[] getFeatureIdentifier() {
        return featureIdentifier;
    }


    /**
     * Sets the featureIdentifier value for this FeatureListType.
     * 
     * @param featureIdentifier
     */
    public void setFeatureIdentifier(com.flexnet.operations.webservices.FeatureIdentifierType[] featureIdentifier) {
        this.featureIdentifier = featureIdentifier;
    }

    public com.flexnet.operations.webservices.FeatureIdentifierType getFeatureIdentifier(int i) {
        return this.featureIdentifier[i];
    }

    public void setFeatureIdentifier(int i, com.flexnet.operations.webservices.FeatureIdentifierType _value) {
        this.featureIdentifier[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureListType)) return false;
        FeatureListType other = (FeatureListType) obj;
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
              java.util.Arrays.equals(this.featureIdentifier, other.getFeatureIdentifier())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureIdentifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureIdentifier(), i);
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
        new org.apache.axis.description.TypeDesc(FeatureListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureIdentifierType"));
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
