/**
 * LifeCycleLineItemDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class LifeCycleLineItemDataType  implements java.io.Serializable {
    private java.lang.String lineItemRecordRefNo;

    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItemIdentifier;

    private com.flexnet.operations.webservices.NewEntitlementLineItemDataType newLineItem;

    public LifeCycleLineItemDataType() {
    }

    public LifeCycleLineItemDataType(
           java.lang.String lineItemRecordRefNo,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItemIdentifier,
           com.flexnet.operations.webservices.NewEntitlementLineItemDataType newLineItem) {
           this.lineItemRecordRefNo = lineItemRecordRefNo;
           this.parentLineItemIdentifier = parentLineItemIdentifier;
           this.newLineItem = newLineItem;
    }


    /**
     * Gets the lineItemRecordRefNo value for this LifeCycleLineItemDataType.
     * 
     * @return lineItemRecordRefNo
     */
    public java.lang.String getLineItemRecordRefNo() {
        return lineItemRecordRefNo;
    }


    /**
     * Sets the lineItemRecordRefNo value for this LifeCycleLineItemDataType.
     * 
     * @param lineItemRecordRefNo
     */
    public void setLineItemRecordRefNo(java.lang.String lineItemRecordRefNo) {
        this.lineItemRecordRefNo = lineItemRecordRefNo;
    }


    /**
     * Gets the parentLineItemIdentifier value for this LifeCycleLineItemDataType.
     * 
     * @return parentLineItemIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getParentLineItemIdentifier() {
        return parentLineItemIdentifier;
    }


    /**
     * Sets the parentLineItemIdentifier value for this LifeCycleLineItemDataType.
     * 
     * @param parentLineItemIdentifier
     */
    public void setParentLineItemIdentifier(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItemIdentifier) {
        this.parentLineItemIdentifier = parentLineItemIdentifier;
    }


    /**
     * Gets the newLineItem value for this LifeCycleLineItemDataType.
     * 
     * @return newLineItem
     */
    public com.flexnet.operations.webservices.NewEntitlementLineItemDataType getNewLineItem() {
        return newLineItem;
    }


    /**
     * Sets the newLineItem value for this LifeCycleLineItemDataType.
     * 
     * @param newLineItem
     */
    public void setNewLineItem(com.flexnet.operations.webservices.NewEntitlementLineItemDataType newLineItem) {
        this.newLineItem = newLineItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LifeCycleLineItemDataType)) return false;
        LifeCycleLineItemDataType other = (LifeCycleLineItemDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemRecordRefNo==null && other.getLineItemRecordRefNo()==null) || 
             (this.lineItemRecordRefNo!=null &&
              this.lineItemRecordRefNo.equals(other.getLineItemRecordRefNo()))) &&
            ((this.parentLineItemIdentifier==null && other.getParentLineItemIdentifier()==null) || 
             (this.parentLineItemIdentifier!=null &&
              this.parentLineItemIdentifier.equals(other.getParentLineItemIdentifier()))) &&
            ((this.newLineItem==null && other.getNewLineItem()==null) || 
             (this.newLineItem!=null &&
              this.newLineItem.equals(other.getNewLineItem())));
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
        if (getLineItemRecordRefNo() != null) {
            _hashCode += getLineItemRecordRefNo().hashCode();
        }
        if (getParentLineItemIdentifier() != null) {
            _hashCode += getParentLineItemIdentifier().hashCode();
        }
        if (getNewLineItem() != null) {
            _hashCode += getNewLineItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LifeCycleLineItemDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lifeCycleLineItemDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemRecordRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemRecordRefNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentLineItemIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentLineItemIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "newLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "newEntitlementLineItemDataType"));
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
