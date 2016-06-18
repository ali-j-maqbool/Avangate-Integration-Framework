/**
 * FailedLinkMaintenanceLineItemListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedLinkMaintenanceLineItemListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedLinkMaintenanceLineItemDataType[] failedLinkMaintenanceLineItem;

    public FailedLinkMaintenanceLineItemListType() {
    }

    public FailedLinkMaintenanceLineItemListType(
           com.flexnet.operations.webservices.FailedLinkMaintenanceLineItemDataType[] failedLinkMaintenanceLineItem) {
           this.failedLinkMaintenanceLineItem = failedLinkMaintenanceLineItem;
    }


    /**
     * Gets the failedLinkMaintenanceLineItem value for this FailedLinkMaintenanceLineItemListType.
     * 
     * @return failedLinkMaintenanceLineItem
     */
    public com.flexnet.operations.webservices.FailedLinkMaintenanceLineItemDataType[] getFailedLinkMaintenanceLineItem() {
        return failedLinkMaintenanceLineItem;
    }


    /**
     * Sets the failedLinkMaintenanceLineItem value for this FailedLinkMaintenanceLineItemListType.
     * 
     * @param failedLinkMaintenanceLineItem
     */
    public void setFailedLinkMaintenanceLineItem(com.flexnet.operations.webservices.FailedLinkMaintenanceLineItemDataType[] failedLinkMaintenanceLineItem) {
        this.failedLinkMaintenanceLineItem = failedLinkMaintenanceLineItem;
    }

    public com.flexnet.operations.webservices.FailedLinkMaintenanceLineItemDataType getFailedLinkMaintenanceLineItem(int i) {
        return this.failedLinkMaintenanceLineItem[i];
    }

    public void setFailedLinkMaintenanceLineItem(int i, com.flexnet.operations.webservices.FailedLinkMaintenanceLineItemDataType _value) {
        this.failedLinkMaintenanceLineItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedLinkMaintenanceLineItemListType)) return false;
        FailedLinkMaintenanceLineItemListType other = (FailedLinkMaintenanceLineItemListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedLinkMaintenanceLineItem==null && other.getFailedLinkMaintenanceLineItem()==null) || 
             (this.failedLinkMaintenanceLineItem!=null &&
              java.util.Arrays.equals(this.failedLinkMaintenanceLineItem, other.getFailedLinkMaintenanceLineItem())));
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
        if (getFailedLinkMaintenanceLineItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedLinkMaintenanceLineItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedLinkMaintenanceLineItem(), i);
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
        new org.apache.axis.description.TypeDesc(FailedLinkMaintenanceLineItemListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedLinkMaintenanceLineItemListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedLinkMaintenanceLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedLinkMaintenanceLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedLinkMaintenanceLineItemDataType"));
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
