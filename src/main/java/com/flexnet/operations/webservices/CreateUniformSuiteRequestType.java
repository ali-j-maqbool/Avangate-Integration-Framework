/**
 * CreateUniformSuiteRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreateUniformSuiteRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.CreateUniformSuiteDataType[] uniformSuite;

    public CreateUniformSuiteRequestType() {
    }

    public CreateUniformSuiteRequestType(
           com.flexnet.operations.webservices.CreateUniformSuiteDataType[] uniformSuite) {
           this.uniformSuite = uniformSuite;
    }


    /**
     * Gets the uniformSuite value for this CreateUniformSuiteRequestType.
     * 
     * @return uniformSuite
     */
    public com.flexnet.operations.webservices.CreateUniformSuiteDataType[] getUniformSuite() {
        return uniformSuite;
    }


    /**
     * Sets the uniformSuite value for this CreateUniformSuiteRequestType.
     * 
     * @param uniformSuite
     */
    public void setUniformSuite(com.flexnet.operations.webservices.CreateUniformSuiteDataType[] uniformSuite) {
        this.uniformSuite = uniformSuite;
    }

    public com.flexnet.operations.webservices.CreateUniformSuiteDataType getUniformSuite(int i) {
        return this.uniformSuite[i];
    }

    public void setUniformSuite(int i, com.flexnet.operations.webservices.CreateUniformSuiteDataType _value) {
        this.uniformSuite[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateUniformSuiteRequestType)) return false;
        CreateUniformSuiteRequestType other = (CreateUniformSuiteRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uniformSuite==null && other.getUniformSuite()==null) || 
             (this.uniformSuite!=null &&
              java.util.Arrays.equals(this.uniformSuite, other.getUniformSuite())));
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
        if (getUniformSuite() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUniformSuite());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUniformSuite(), i);
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
        new org.apache.axis.description.TypeDesc(CreateUniformSuiteRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUniformSuiteRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniformSuite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "uniformSuite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUniformSuiteDataType"));
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
