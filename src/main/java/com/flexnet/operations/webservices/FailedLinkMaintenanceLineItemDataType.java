/**
 * FailedLinkMaintenanceLineItemDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedLinkMaintenanceLineItemDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.LinkMaintenanceLineItemDataType linkMaintenanceLineItem;

    private java.lang.String reason;

    public FailedLinkMaintenanceLineItemDataType() {
    }

    public FailedLinkMaintenanceLineItemDataType(
           com.flexnet.operations.webservices.LinkMaintenanceLineItemDataType linkMaintenanceLineItem,
           java.lang.String reason) {
           this.linkMaintenanceLineItem = linkMaintenanceLineItem;
           this.reason = reason;
    }


    /**
     * Gets the linkMaintenanceLineItem value for this FailedLinkMaintenanceLineItemDataType.
     * 
     * @return linkMaintenanceLineItem
     */
    public com.flexnet.operations.webservices.LinkMaintenanceLineItemDataType getLinkMaintenanceLineItem() {
        return linkMaintenanceLineItem;
    }


    /**
     * Sets the linkMaintenanceLineItem value for this FailedLinkMaintenanceLineItemDataType.
     * 
     * @param linkMaintenanceLineItem
     */
    public void setLinkMaintenanceLineItem(com.flexnet.operations.webservices.LinkMaintenanceLineItemDataType linkMaintenanceLineItem) {
        this.linkMaintenanceLineItem = linkMaintenanceLineItem;
    }


    /**
     * Gets the reason value for this FailedLinkMaintenanceLineItemDataType.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this FailedLinkMaintenanceLineItemDataType.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedLinkMaintenanceLineItemDataType)) return false;
        FailedLinkMaintenanceLineItemDataType other = (FailedLinkMaintenanceLineItemDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.linkMaintenanceLineItem==null && other.getLinkMaintenanceLineItem()==null) || 
             (this.linkMaintenanceLineItem!=null &&
              this.linkMaintenanceLineItem.equals(other.getLinkMaintenanceLineItem()))) &&
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
        if (getLinkMaintenanceLineItem() != null) {
            _hashCode += getLinkMaintenanceLineItem().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FailedLinkMaintenanceLineItemDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedLinkMaintenanceLineItemDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkMaintenanceLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkMaintenanceLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkMaintenanceLineItemDataType"));
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
