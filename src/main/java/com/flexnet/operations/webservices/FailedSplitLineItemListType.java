/**
 * FailedSplitLineItemListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedSplitLineItemListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedSplitLineItemDataType[] failedLineItem;

    public FailedSplitLineItemListType() {
    }

    public FailedSplitLineItemListType(
           com.flexnet.operations.webservices.FailedSplitLineItemDataType[] failedLineItem) {
           this.failedLineItem = failedLineItem;
    }


    /**
     * Gets the failedLineItem value for this FailedSplitLineItemListType.
     * 
     * @return failedLineItem
     */
    public com.flexnet.operations.webservices.FailedSplitLineItemDataType[] getFailedLineItem() {
        return failedLineItem;
    }


    /**
     * Sets the failedLineItem value for this FailedSplitLineItemListType.
     * 
     * @param failedLineItem
     */
    public void setFailedLineItem(com.flexnet.operations.webservices.FailedSplitLineItemDataType[] failedLineItem) {
        this.failedLineItem = failedLineItem;
    }

    public com.flexnet.operations.webservices.FailedSplitLineItemDataType getFailedLineItem(int i) {
        return this.failedLineItem[i];
    }

    public void setFailedLineItem(int i, com.flexnet.operations.webservices.FailedSplitLineItemDataType _value) {
        this.failedLineItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedSplitLineItemListType)) return false;
        FailedSplitLineItemListType other = (FailedSplitLineItemListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedLineItem==null && other.getFailedLineItem()==null) || 
             (this.failedLineItem!=null &&
              java.util.Arrays.equals(this.failedLineItem, other.getFailedLineItem())));
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
        if (getFailedLineItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedLineItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedLineItem(), i);
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
        new org.apache.axis.description.TypeDesc(FailedSplitLineItemListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedSplitLineItemListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedSplitLineItemDataType"));
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
