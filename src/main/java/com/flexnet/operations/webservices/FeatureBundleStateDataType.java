/**
 * FeatureBundleStateDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FeatureBundleStateDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FeatureBundleIdentifierType featureBundleIdentifier;

    private com.flexnet.operations.webservices.StateType stateToSet;

    public FeatureBundleStateDataType() {
    }

    public FeatureBundleStateDataType(
           com.flexnet.operations.webservices.FeatureBundleIdentifierType featureBundleIdentifier,
           com.flexnet.operations.webservices.StateType stateToSet) {
           this.featureBundleIdentifier = featureBundleIdentifier;
           this.stateToSet = stateToSet;
    }


    /**
     * Gets the featureBundleIdentifier value for this FeatureBundleStateDataType.
     * 
     * @return featureBundleIdentifier
     */
    public com.flexnet.operations.webservices.FeatureBundleIdentifierType getFeatureBundleIdentifier() {
        return featureBundleIdentifier;
    }


    /**
     * Sets the featureBundleIdentifier value for this FeatureBundleStateDataType.
     * 
     * @param featureBundleIdentifier
     */
    public void setFeatureBundleIdentifier(com.flexnet.operations.webservices.FeatureBundleIdentifierType featureBundleIdentifier) {
        this.featureBundleIdentifier = featureBundleIdentifier;
    }


    /**
     * Gets the stateToSet value for this FeatureBundleStateDataType.
     * 
     * @return stateToSet
     */
    public com.flexnet.operations.webservices.StateType getStateToSet() {
        return stateToSet;
    }


    /**
     * Sets the stateToSet value for this FeatureBundleStateDataType.
     * 
     * @param stateToSet
     */
    public void setStateToSet(com.flexnet.operations.webservices.StateType stateToSet) {
        this.stateToSet = stateToSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureBundleStateDataType)) return false;
        FeatureBundleStateDataType other = (FeatureBundleStateDataType) obj;
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
            ((this.stateToSet==null && other.getStateToSet()==null) || 
             (this.stateToSet!=null &&
              this.stateToSet.equals(other.getStateToSet())));
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
        if (getStateToSet() != null) {
            _hashCode += getStateToSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureBundleStateDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleStateDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureBundleIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateToSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "stateToSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateType"));
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
