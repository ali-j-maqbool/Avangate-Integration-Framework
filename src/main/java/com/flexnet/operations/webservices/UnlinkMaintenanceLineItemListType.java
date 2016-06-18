/**
 * UnlinkMaintenanceLineItemListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UnlinkMaintenanceLineItemListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.UnlinkMaintenanceLineItemDataType[] unlinkMaintenanceLineItem;

    public UnlinkMaintenanceLineItemListType() {
    }

    public UnlinkMaintenanceLineItemListType(
           com.flexnet.operations.webservices.UnlinkMaintenanceLineItemDataType[] unlinkMaintenanceLineItem) {
           this.unlinkMaintenanceLineItem = unlinkMaintenanceLineItem;
    }


    /**
     * Gets the unlinkMaintenanceLineItem value for this UnlinkMaintenanceLineItemListType.
     * 
     * @return unlinkMaintenanceLineItem
     */
    public com.flexnet.operations.webservices.UnlinkMaintenanceLineItemDataType[] getUnlinkMaintenanceLineItem() {
        return unlinkMaintenanceLineItem;
    }


    /**
     * Sets the unlinkMaintenanceLineItem value for this UnlinkMaintenanceLineItemListType.
     * 
     * @param unlinkMaintenanceLineItem
     */
    public void setUnlinkMaintenanceLineItem(com.flexnet.operations.webservices.UnlinkMaintenanceLineItemDataType[] unlinkMaintenanceLineItem) {
        this.unlinkMaintenanceLineItem = unlinkMaintenanceLineItem;
    }

    public com.flexnet.operations.webservices.UnlinkMaintenanceLineItemDataType getUnlinkMaintenanceLineItem(int i) {
        return this.unlinkMaintenanceLineItem[i];
    }

    public void setUnlinkMaintenanceLineItem(int i, com.flexnet.operations.webservices.UnlinkMaintenanceLineItemDataType _value) {
        this.unlinkMaintenanceLineItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnlinkMaintenanceLineItemListType)) return false;
        UnlinkMaintenanceLineItemListType other = (UnlinkMaintenanceLineItemListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unlinkMaintenanceLineItem==null && other.getUnlinkMaintenanceLineItem()==null) || 
             (this.unlinkMaintenanceLineItem!=null &&
              java.util.Arrays.equals(this.unlinkMaintenanceLineItem, other.getUnlinkMaintenanceLineItem())));
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
        if (getUnlinkMaintenanceLineItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnlinkMaintenanceLineItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnlinkMaintenanceLineItem(), i);
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
        new org.apache.axis.description.TypeDesc(UnlinkMaintenanceLineItemListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItemListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlinkMaintenanceLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItemDataType"));
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
