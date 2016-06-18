/**
 * FailedMaintenanceLineItemStateDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedMaintenanceLineItemStateDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.MaintenanceLineItemStateDataType maintenanceLineItem;

    private java.lang.String reason;

    public FailedMaintenanceLineItemStateDataType() {
    }

    public FailedMaintenanceLineItemStateDataType(
           com.flexnet.operations.webservices.MaintenanceLineItemStateDataType maintenanceLineItem,
           java.lang.String reason) {
           this.maintenanceLineItem = maintenanceLineItem;
           this.reason = reason;
    }


    /**
     * Gets the maintenanceLineItem value for this FailedMaintenanceLineItemStateDataType.
     * 
     * @return maintenanceLineItem
     */
    public com.flexnet.operations.webservices.MaintenanceLineItemStateDataType getMaintenanceLineItem() {
        return maintenanceLineItem;
    }


    /**
     * Sets the maintenanceLineItem value for this FailedMaintenanceLineItemStateDataType.
     * 
     * @param maintenanceLineItem
     */
    public void setMaintenanceLineItem(com.flexnet.operations.webservices.MaintenanceLineItemStateDataType maintenanceLineItem) {
        this.maintenanceLineItem = maintenanceLineItem;
    }


    /**
     * Gets the reason value for this FailedMaintenanceLineItemStateDataType.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this FailedMaintenanceLineItemStateDataType.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedMaintenanceLineItemStateDataType)) return false;
        FailedMaintenanceLineItemStateDataType other = (FailedMaintenanceLineItemStateDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maintenanceLineItem==null && other.getMaintenanceLineItem()==null) || 
             (this.maintenanceLineItem!=null &&
              this.maintenanceLineItem.equals(other.getMaintenanceLineItem()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getMaintenanceLineItem() != null) {
            _hashCode += getMaintenanceLineItem().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FailedMaintenanceLineItemStateDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMaintenanceLineItemStateDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItemStateDataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
