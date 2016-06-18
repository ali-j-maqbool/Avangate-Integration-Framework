/**
 * TransferredLineItemDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class TransferredLineItemDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier;

    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType transferredFromId;

    public TransferredLineItemDataType() {
    }

    public TransferredLineItemDataType(
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType transferredFromId) {
           this.lineItemIdentifier = lineItemIdentifier;
           this.transferredFromId = transferredFromId;
    }


    /**
     * Gets the lineItemIdentifier value for this TransferredLineItemDataType.
     * 
     * @return lineItemIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getLineItemIdentifier() {
        return lineItemIdentifier;
    }


    /**
     * Sets the lineItemIdentifier value for this TransferredLineItemDataType.
     * 
     * @param lineItemIdentifier
     */
    public void setLineItemIdentifier(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier) {
        this.lineItemIdentifier = lineItemIdentifier;
    }


    /**
     * Gets the transferredFromId value for this TransferredLineItemDataType.
     * 
     * @return transferredFromId
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getTransferredFromId() {
        return transferredFromId;
    }


    /**
     * Sets the transferredFromId value for this TransferredLineItemDataType.
     * 
     * @param transferredFromId
     */
    public void setTransferredFromId(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType transferredFromId) {
        this.transferredFromId = transferredFromId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferredLineItemDataType)) return false;
        TransferredLineItemDataType other = (TransferredLineItemDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemIdentifier==null && other.getLineItemIdentifier()==null) || 
             (this.lineItemIdentifier!=null &&
              this.lineItemIdentifier.equals(other.getLineItemIdentifier()))) &&
            ((this.transferredFromId==null && other.getTransferredFromId()==null) || 
             (this.transferredFromId!=null &&
              this.transferredFromId.equals(other.getTransferredFromId())));
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
        if (getLineItemIdentifier() != null) {
            _hashCode += getLineItemIdentifier().hashCode();
        }
        if (getTransferredFromId() != null) {
            _hashCode += getTransferredFromId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferredLineItemDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferredLineItemDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferredFromId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferredFromId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
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
