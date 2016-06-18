/**
 * TransactionKeyIdentifiersDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class TransactionKeyIdentifiersDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.TrustedKeyIdentifierType[] transactionKeyIdentifier;

    public TransactionKeyIdentifiersDataListType() {
    }

    public TransactionKeyIdentifiersDataListType(
           com.flexnet.operations.webservices.TrustedKeyIdentifierType[] transactionKeyIdentifier) {
           this.transactionKeyIdentifier = transactionKeyIdentifier;
    }


    /**
     * Gets the transactionKeyIdentifier value for this TransactionKeyIdentifiersDataListType.
     * 
     * @return transactionKeyIdentifier
     */
    public com.flexnet.operations.webservices.TrustedKeyIdentifierType[] getTransactionKeyIdentifier() {
        return transactionKeyIdentifier;
    }


    /**
     * Sets the transactionKeyIdentifier value for this TransactionKeyIdentifiersDataListType.
     * 
     * @param transactionKeyIdentifier
     */
    public void setTransactionKeyIdentifier(com.flexnet.operations.webservices.TrustedKeyIdentifierType[] transactionKeyIdentifier) {
        this.transactionKeyIdentifier = transactionKeyIdentifier;
    }

    public com.flexnet.operations.webservices.TrustedKeyIdentifierType getTransactionKeyIdentifier(int i) {
        return this.transactionKeyIdentifier[i];
    }

    public void setTransactionKeyIdentifier(int i, com.flexnet.operations.webservices.TrustedKeyIdentifierType _value) {
        this.transactionKeyIdentifier[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionKeyIdentifiersDataListType)) return false;
        TransactionKeyIdentifiersDataListType other = (TransactionKeyIdentifiersDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionKeyIdentifier==null && other.getTransactionKeyIdentifier()==null) || 
             (this.transactionKeyIdentifier!=null &&
              java.util.Arrays.equals(this.transactionKeyIdentifier, other.getTransactionKeyIdentifier())));
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
        if (getTransactionKeyIdentifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionKeyIdentifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionKeyIdentifier(), i);
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
        new org.apache.axis.description.TypeDesc(TransactionKeyIdentifiersDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transactionKeyIdentifiersDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionKeyIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transactionKeyIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "trustedKeyIdentifierType"));
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
