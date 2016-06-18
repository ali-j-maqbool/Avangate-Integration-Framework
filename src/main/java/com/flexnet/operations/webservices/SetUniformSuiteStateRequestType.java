/**
 * SetUniformSuiteStateRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class SetUniformSuiteStateRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.UniformSuiteStateDataType[] suite;

    public SetUniformSuiteStateRequestType() {
    }

    public SetUniformSuiteStateRequestType(
           com.flexnet.operations.webservices.UniformSuiteStateDataType[] suite) {
           this.suite = suite;
    }


    /**
     * Gets the suite value for this SetUniformSuiteStateRequestType.
     * 
     * @return suite
     */
    public com.flexnet.operations.webservices.UniformSuiteStateDataType[] getSuite() {
        return suite;
    }


    /**
     * Sets the suite value for this SetUniformSuiteStateRequestType.
     * 
     * @param suite
     */
    public void setSuite(com.flexnet.operations.webservices.UniformSuiteStateDataType[] suite) {
        this.suite = suite;
    }

    public com.flexnet.operations.webservices.UniformSuiteStateDataType getSuite(int i) {
        return this.suite[i];
    }

    public void setSuite(int i, com.flexnet.operations.webservices.UniformSuiteStateDataType _value) {
        this.suite[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetUniformSuiteStateRequestType)) return false;
        SetUniformSuiteStateRequestType other = (SetUniformSuiteStateRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.suite==null && other.getSuite()==null) || 
             (this.suite!=null &&
              java.util.Arrays.equals(this.suite, other.getSuite())));
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
        if (getSuite() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuite());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuite(), i);
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
        new org.apache.axis.description.TypeDesc(SetUniformSuiteStateRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setUniformSuiteStateRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "suite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "uniformSuiteStateDataType"));
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
