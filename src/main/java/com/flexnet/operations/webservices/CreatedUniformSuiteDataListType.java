/**
 * CreatedUniformSuiteDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreatedUniformSuiteDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.CreatedUniformSuiteDataType[] createdUniformSuite;

    public CreatedUniformSuiteDataListType() {
    }

    public CreatedUniformSuiteDataListType(
           com.flexnet.operations.webservices.CreatedUniformSuiteDataType[] createdUniformSuite) {
           this.createdUniformSuite = createdUniformSuite;
    }


    /**
     * Gets the createdUniformSuite value for this CreatedUniformSuiteDataListType.
     * 
     * @return createdUniformSuite
     */
    public com.flexnet.operations.webservices.CreatedUniformSuiteDataType[] getCreatedUniformSuite() {
        return createdUniformSuite;
    }


    /**
     * Sets the createdUniformSuite value for this CreatedUniformSuiteDataListType.
     * 
     * @param createdUniformSuite
     */
    public void setCreatedUniformSuite(com.flexnet.operations.webservices.CreatedUniformSuiteDataType[] createdUniformSuite) {
        this.createdUniformSuite = createdUniformSuite;
    }

    public com.flexnet.operations.webservices.CreatedUniformSuiteDataType getCreatedUniformSuite(int i) {
        return this.createdUniformSuite[i];
    }

    public void setCreatedUniformSuite(int i, com.flexnet.operations.webservices.CreatedUniformSuiteDataType _value) {
        this.createdUniformSuite[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatedUniformSuiteDataListType)) return false;
        CreatedUniformSuiteDataListType other = (CreatedUniformSuiteDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdUniformSuite==null && other.getCreatedUniformSuite()==null) || 
             (this.createdUniformSuite!=null &&
              java.util.Arrays.equals(this.createdUniformSuite, other.getCreatedUniformSuite())));
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
        if (getCreatedUniformSuite() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedUniformSuite());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedUniformSuite(), i);
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
        new org.apache.axis.description.TypeDesc(CreatedUniformSuiteDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdUniformSuiteDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdUniformSuite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdUniformSuite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdUniformSuiteDataType"));
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
