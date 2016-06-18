/**
 * UniformSuiteStateDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UniformSuiteStateDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SuiteIdentifierType suiteIdentifier;

    private com.flexnet.operations.webservices.StateType stateToSet;

    public UniformSuiteStateDataType() {
    }

    public UniformSuiteStateDataType(
           com.flexnet.operations.webservices.SuiteIdentifierType suiteIdentifier,
           com.flexnet.operations.webservices.StateType stateToSet) {
           this.suiteIdentifier = suiteIdentifier;
           this.stateToSet = stateToSet;
    }


    /**
     * Gets the suiteIdentifier value for this UniformSuiteStateDataType.
     * 
     * @return suiteIdentifier
     */
    public com.flexnet.operations.webservices.SuiteIdentifierType getSuiteIdentifier() {
        return suiteIdentifier;
    }


    /**
     * Sets the suiteIdentifier value for this UniformSuiteStateDataType.
     * 
     * @param suiteIdentifier
     */
    public void setSuiteIdentifier(com.flexnet.operations.webservices.SuiteIdentifierType suiteIdentifier) {
        this.suiteIdentifier = suiteIdentifier;
    }


    /**
     * Gets the stateToSet value for this UniformSuiteStateDataType.
     * 
     * @return stateToSet
     */
    public com.flexnet.operations.webservices.StateType getStateToSet() {
        return stateToSet;
    }


    /**
     * Sets the stateToSet value for this UniformSuiteStateDataType.
     * 
     * @param stateToSet
     */
    public void setStateToSet(com.flexnet.operations.webservices.StateType stateToSet) {
        this.stateToSet = stateToSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UniformSuiteStateDataType)) return false;
        UniformSuiteStateDataType other = (UniformSuiteStateDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.suiteIdentifier==null && other.getSuiteIdentifier()==null) || 
             (this.suiteIdentifier!=null &&
              this.suiteIdentifier.equals(other.getSuiteIdentifier()))) &&
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
        if (getSuiteIdentifier() != null) {
            _hashCode += getSuiteIdentifier().hashCode();
        }
        if (getStateToSet() != null) {
            _hashCode += getStateToSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UniformSuiteStateDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "uniformSuiteStateDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suiteIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "suiteIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "suiteIdentifierType"));
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
