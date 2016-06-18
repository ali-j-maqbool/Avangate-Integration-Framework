/**
 * FailedMaintenanceLineItemStateDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedMaintenanceLineItemStateDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedMaintenanceLineItemStateDataType[] failedMaintenanceLineItem;

    public FailedMaintenanceLineItemStateDataListType() {
    }

    public FailedMaintenanceLineItemStateDataListType(
           com.flexnet.operations.webservices.FailedMaintenanceLineItemStateDataType[] failedMaintenanceLineItem) {
           this.failedMaintenanceLineItem = failedMaintenanceLineItem;
    }


    /**
     * Gets the failedMaintenanceLineItem value for this FailedMaintenanceLineItemStateDataListType.
     * 
     * @return failedMaintenanceLineItem
     */
    public com.flexnet.operations.webservices.FailedMaintenanceLineItemStateDataType[] getFailedMaintenanceLineItem() {
        return failedMaintenanceLineItem;
    }


    /**
     * Sets the failedMaintenanceLineItem value for this FailedMaintenanceLineItemStateDataListType.
     * 
     * @param failedMaintenanceLineItem
     */
    public void setFailedMaintenanceLineItem(com.flexnet.operations.webservices.FailedMaintenanceLineItemStateDataType[] failedMaintenanceLineItem) {
        this.failedMaintenanceLineItem = failedMaintenanceLineItem;
    }

    public com.flexnet.operations.webservices.FailedMaintenanceLineItemStateDataType getFailedMaintenanceLineItem(int i) {
        return this.failedMaintenanceLineItem[i];
    }

    public void setFailedMaintenanceLineItem(int i, com.flexnet.operations.webservices.FailedMaintenanceLineItemStateDataType _value) {
        this.failedMaintenanceLineItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedMaintenanceLineItemStateDataListType)) return false;
        FailedMaintenanceLineItemStateDataListType other = (FailedMaintenanceLineItemStateDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedMaintenanceLineItem==null && other.getFailedMaintenanceLineItem()==null) || 
             (this.failedMaintenanceLineItem!=null &&
              java.util.Arrays.equals(this.failedMaintenanceLineItem, other.getFailedMaintenanceLineItem())));
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
        if (getFailedMaintenanceLineItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedMaintenanceLineItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedMaintenanceLineItem(), i);
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
        new org.apache.axis.description.TypeDesc(FailedMaintenanceLineItemStateDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMaintenanceLineItemStateDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedMaintenanceLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMaintenanceLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMaintenanceLineItemStateDataType"));
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
