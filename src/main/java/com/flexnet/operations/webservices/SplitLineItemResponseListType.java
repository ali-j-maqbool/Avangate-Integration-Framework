/**
 * SplitLineItemResponseListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class SplitLineItemResponseListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SplitLineItemDataType[] splitLineItem;

    public SplitLineItemResponseListType() {
    }

    public SplitLineItemResponseListType(
           com.flexnet.operations.webservices.SplitLineItemDataType[] splitLineItem) {
           this.splitLineItem = splitLineItem;
    }


    /**
     * Gets the splitLineItem value for this SplitLineItemResponseListType.
     * 
     * @return splitLineItem
     */
    public com.flexnet.operations.webservices.SplitLineItemDataType[] getSplitLineItem() {
        return splitLineItem;
    }


    /**
     * Sets the splitLineItem value for this SplitLineItemResponseListType.
     * 
     * @param splitLineItem
     */
    public void setSplitLineItem(com.flexnet.operations.webservices.SplitLineItemDataType[] splitLineItem) {
        this.splitLineItem = splitLineItem;
    }

    public com.flexnet.operations.webservices.SplitLineItemDataType getSplitLineItem(int i) {
        return this.splitLineItem[i];
    }

    public void setSplitLineItem(int i, com.flexnet.operations.webservices.SplitLineItemDataType _value) {
        this.splitLineItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SplitLineItemResponseListType)) return false;
        SplitLineItemResponseListType other = (SplitLineItemResponseListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.splitLineItem==null && other.getSplitLineItem()==null) || 
             (this.splitLineItem!=null &&
              java.util.Arrays.equals(this.splitLineItem, other.getSplitLineItem())));
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
        if (getSplitLineItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSplitLineItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSplitLineItem(), i);
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
        new org.apache.axis.description.TypeDesc(SplitLineItemResponseListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItemResponseListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splitLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItemDataType"));
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
