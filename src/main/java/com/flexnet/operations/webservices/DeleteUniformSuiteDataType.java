/**
 * DeleteUniformSuiteDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class DeleteUniformSuiteDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SuiteIdentifierType suiteIdentifier;

    public DeleteUniformSuiteDataType() {
    }

    public DeleteUniformSuiteDataType(
           com.flexnet.operations.webservices.SuiteIdentifierType suiteIdentifier) {
           this.suiteIdentifier = suiteIdentifier;
    }


    /**
     * Gets the suiteIdentifier value for this DeleteUniformSuiteDataType.
     * 
     * @return suiteIdentifier
     */
    public com.flexnet.operations.webservices.SuiteIdentifierType getSuiteIdentifier() {
        return suiteIdentifier;
    }


    /**
     * Sets the suiteIdentifier value for this DeleteUniformSuiteDataType.
     * 
     * @param suiteIdentifier
     */
    public void setSuiteIdentifier(com.flexnet.operations.webservices.SuiteIdentifierType suiteIdentifier) {
        this.suiteIdentifier = suiteIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteUniformSuiteDataType)) return false;
        DeleteUniformSuiteDataType other = (DeleteUniformSuiteDataType) obj;
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
              this.suiteIdentifier.equals(other.getSuiteIdentifier())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteUniformSuiteDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUniformSuiteDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suiteIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "suiteIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "suiteIdentifierType"));
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
