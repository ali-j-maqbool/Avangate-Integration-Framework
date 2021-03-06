/**
 * TransferLineItemsListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class TransferLineItemsListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.TransferLineItemInfoType[] lineItemInfo;

    public TransferLineItemsListType() {
    }

    public TransferLineItemsListType(
           com.flexnet.operations.webservices.TransferLineItemInfoType[] lineItemInfo) {
           this.lineItemInfo = lineItemInfo;
    }


    /**
     * Gets the lineItemInfo value for this TransferLineItemsListType.
     * 
     * @return lineItemInfo
     */
    public com.flexnet.operations.webservices.TransferLineItemInfoType[] getLineItemInfo() {
        return lineItemInfo;
    }


    /**
     * Sets the lineItemInfo value for this TransferLineItemsListType.
     * 
     * @param lineItemInfo
     */
    public void setLineItemInfo(com.flexnet.operations.webservices.TransferLineItemInfoType[] lineItemInfo) {
        this.lineItemInfo = lineItemInfo;
    }

    public com.flexnet.operations.webservices.TransferLineItemInfoType getLineItemInfo(int i) {
        return this.lineItemInfo[i];
    }

    public void setLineItemInfo(int i, com.flexnet.operations.webservices.TransferLineItemInfoType _value) {
        this.lineItemInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferLineItemsListType)) return false;
        TransferLineItemsListType other = (TransferLineItemsListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemInfo==null && other.getLineItemInfo()==null) || 
             (this.lineItemInfo!=null &&
              java.util.Arrays.equals(this.lineItemInfo, other.getLineItemInfo())));
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
        if (getLineItemInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItemInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItemInfo(), i);
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
        new org.apache.axis.description.TypeDesc(TransferLineItemsListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferLineItemsListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferLineItemInfoType"));
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
