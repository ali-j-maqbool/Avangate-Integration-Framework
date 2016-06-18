/**
 * FailedUnlinkMaintenanceLineItemListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedUnlinkMaintenanceLineItemListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedUnlinkMaintenanceLineItemDataType[] failedUnlinkMaintenanceLineItem;

    public FailedUnlinkMaintenanceLineItemListType() {
    }

    public FailedUnlinkMaintenanceLineItemListType(
           com.flexnet.operations.webservices.FailedUnlinkMaintenanceLineItemDataType[] failedUnlinkMaintenanceLineItem) {
           this.failedUnlinkMaintenanceLineItem = failedUnlinkMaintenanceLineItem;
    }


    /**
     * Gets the failedUnlinkMaintenanceLineItem value for this FailedUnlinkMaintenanceLineItemListType.
     * 
     * @return failedUnlinkMaintenanceLineItem
     */
    public com.flexnet.operations.webservices.FailedUnlinkMaintenanceLineItemDataType[] getFailedUnlinkMaintenanceLineItem() {
        return failedUnlinkMaintenanceLineItem;
    }


    /**
     * Sets the failedUnlinkMaintenanceLineItem value for this FailedUnlinkMaintenanceLineItemListType.
     * 
     * @param failedUnlinkMaintenanceLineItem
     */
    public void setFailedUnlinkMaintenanceLineItem(com.flexnet.operations.webservices.FailedUnlinkMaintenanceLineItemDataType[] failedUnlinkMaintenanceLineItem) {
        this.failedUnlinkMaintenanceLineItem = failedUnlinkMaintenanceLineItem;
    }

    public com.flexnet.operations.webservices.FailedUnlinkMaintenanceLineItemDataType getFailedUnlinkMaintenanceLineItem(int i) {
        return this.failedUnlinkMaintenanceLineItem[i];
    }

    public void setFailedUnlinkMaintenanceLineItem(int i, com.flexnet.operations.webservices.FailedUnlinkMaintenanceLineItemDataType _value) {
        this.failedUnlinkMaintenanceLineItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedUnlinkMaintenanceLineItemListType)) return false;
        FailedUnlinkMaintenanceLineItemListType other = (FailedUnlinkMaintenanceLineItemListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedUnlinkMaintenanceLineItem==null && other.getFailedUnlinkMaintenanceLineItem()==null) || 
             (this.failedUnlinkMaintenanceLineItem!=null &&
              java.util.Arrays.equals(this.failedUnlinkMaintenanceLineItem, other.getFailedUnlinkMaintenanceLineItem())));
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
        if (getFailedUnlinkMaintenanceLineItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedUnlinkMaintenanceLineItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedUnlinkMaintenanceLineItem(), i);
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
        new org.apache.axis.description.TypeDesc(FailedUnlinkMaintenanceLineItemListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUnlinkMaintenanceLineItemListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedUnlinkMaintenanceLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUnlinkMaintenanceLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUnlinkMaintenanceLineItemDataType"));
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
