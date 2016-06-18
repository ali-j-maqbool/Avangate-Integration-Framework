/**
 * TransferredEntitlementsListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class TransferredEntitlementsListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.TransferredEntitlementDataType[] transferredEntitlement;

    public TransferredEntitlementsListType() {
    }

    public TransferredEntitlementsListType(
           com.flexnet.operations.webservices.TransferredEntitlementDataType[] transferredEntitlement) {
           this.transferredEntitlement = transferredEntitlement;
    }


    /**
     * Gets the transferredEntitlement value for this TransferredEntitlementsListType.
     * 
     * @return transferredEntitlement
     */
    public com.flexnet.operations.webservices.TransferredEntitlementDataType[] getTransferredEntitlement() {
        return transferredEntitlement;
    }


    /**
     * Sets the transferredEntitlement value for this TransferredEntitlementsListType.
     * 
     * @param transferredEntitlement
     */
    public void setTransferredEntitlement(com.flexnet.operations.webservices.TransferredEntitlementDataType[] transferredEntitlement) {
        this.transferredEntitlement = transferredEntitlement;
    }

    public com.flexnet.operations.webservices.TransferredEntitlementDataType getTransferredEntitlement(int i) {
        return this.transferredEntitlement[i];
    }

    public void setTransferredEntitlement(int i, com.flexnet.operations.webservices.TransferredEntitlementDataType _value) {
        this.transferredEntitlement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferredEntitlementsListType)) return false;
        TransferredEntitlementsListType other = (TransferredEntitlementsListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transferredEntitlement==null && other.getTransferredEntitlement()==null) || 
             (this.transferredEntitlement!=null &&
              java.util.Arrays.equals(this.transferredEntitlement, other.getTransferredEntitlement())));
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
        if (getTransferredEntitlement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferredEntitlement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferredEntitlement(), i);
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
        new org.apache.axis.description.TypeDesc(TransferredEntitlementsListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferredEntitlementsListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferredEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferredEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferredEntitlementDataType"));
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
