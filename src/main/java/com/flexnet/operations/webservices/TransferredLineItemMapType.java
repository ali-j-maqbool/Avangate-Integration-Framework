/**
 * TransferredLineItemMapType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class TransferredLineItemMapType  implements java.io.Serializable {
    private java.lang.String activationId;

    private java.lang.String transferredFromId;

    public TransferredLineItemMapType() {
    }

    public TransferredLineItemMapType(
           java.lang.String activationId,
           java.lang.String transferredFromId) {
           this.activationId = activationId;
           this.transferredFromId = transferredFromId;
    }


    /**
     * Gets the activationId value for this TransferredLineItemMapType.
     * 
     * @return activationId
     */
    public java.lang.String getActivationId() {
        return activationId;
    }


    /**
     * Sets the activationId value for this TransferredLineItemMapType.
     * 
     * @param activationId
     */
    public void setActivationId(java.lang.String activationId) {
        this.activationId = activationId;
    }


    /**
     * Gets the transferredFromId value for this TransferredLineItemMapType.
     * 
     * @return transferredFromId
     */
    public java.lang.String getTransferredFromId() {
        return transferredFromId;
    }


    /**
     * Sets the transferredFromId value for this TransferredLineItemMapType.
     * 
     * @param transferredFromId
     */
    public void setTransferredFromId(java.lang.String transferredFromId) {
        this.transferredFromId = transferredFromId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferredLineItemMapType)) return false;
        TransferredLineItemMapType other = (TransferredLineItemMapType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activationId==null && other.getActivationId()==null) || 
             (this.activationId!=null &&
              this.activationId.equals(other.getActivationId()))) &&
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
        if (getActivationId() != null) {
            _hashCode += getActivationId().hashCode();
        }
        if (getTransferredFromId() != null) {
            _hashCode += getTransferredFromId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferredLineItemMapType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferredLineItemMapType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferredFromId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferredFromId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
