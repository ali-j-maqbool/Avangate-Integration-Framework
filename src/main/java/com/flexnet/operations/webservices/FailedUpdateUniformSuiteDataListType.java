/**
 * FailedUpdateUniformSuiteDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedUpdateUniformSuiteDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedUpdateUniformSuiteDataType[] failedUniformSuite;

    public FailedUpdateUniformSuiteDataListType() {
    }

    public FailedUpdateUniformSuiteDataListType(
           com.flexnet.operations.webservices.FailedUpdateUniformSuiteDataType[] failedUniformSuite) {
           this.failedUniformSuite = failedUniformSuite;
    }


    /**
     * Gets the failedUniformSuite value for this FailedUpdateUniformSuiteDataListType.
     * 
     * @return failedUniformSuite
     */
    public com.flexnet.operations.webservices.FailedUpdateUniformSuiteDataType[] getFailedUniformSuite() {
        return failedUniformSuite;
    }


    /**
     * Sets the failedUniformSuite value for this FailedUpdateUniformSuiteDataListType.
     * 
     * @param failedUniformSuite
     */
    public void setFailedUniformSuite(com.flexnet.operations.webservices.FailedUpdateUniformSuiteDataType[] failedUniformSuite) {
        this.failedUniformSuite = failedUniformSuite;
    }

    public com.flexnet.operations.webservices.FailedUpdateUniformSuiteDataType getFailedUniformSuite(int i) {
        return this.failedUniformSuite[i];
    }

    public void setFailedUniformSuite(int i, com.flexnet.operations.webservices.FailedUpdateUniformSuiteDataType _value) {
        this.failedUniformSuite[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedUpdateUniformSuiteDataListType)) return false;
        FailedUpdateUniformSuiteDataListType other = (FailedUpdateUniformSuiteDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedUniformSuite==null && other.getFailedUniformSuite()==null) || 
             (this.failedUniformSuite!=null &&
              java.util.Arrays.equals(this.failedUniformSuite, other.getFailedUniformSuite())));
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
        if (getFailedUniformSuite() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedUniformSuite());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedUniformSuite(), i);
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
        new org.apache.axis.description.TypeDesc(FailedUpdateUniformSuiteDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateUniformSuiteDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedUniformSuite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUniformSuite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateUniformSuiteDataType"));
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
