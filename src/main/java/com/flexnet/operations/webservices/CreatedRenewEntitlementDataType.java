/**
 * CreatedRenewEntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreatedRenewEntitlementDataType  implements java.io.Serializable {
    private java.lang.String entitlementRecordRefNo;

    private com.flexnet.operations.webservices.EntitlementIdentifierType parentEntitlementIdentifier;

    private com.flexnet.operations.webservices.RenewedEntitlementLineItemDataType[] renewedLineItem;

    public CreatedRenewEntitlementDataType() {
    }

    public CreatedRenewEntitlementDataType(
           java.lang.String entitlementRecordRefNo,
           com.flexnet.operations.webservices.EntitlementIdentifierType parentEntitlementIdentifier,
           com.flexnet.operations.webservices.RenewedEntitlementLineItemDataType[] renewedLineItem) {
           this.entitlementRecordRefNo = entitlementRecordRefNo;
           this.parentEntitlementIdentifier = parentEntitlementIdentifier;
           this.renewedLineItem = renewedLineItem;
    }


    /**
     * Gets the entitlementRecordRefNo value for this CreatedRenewEntitlementDataType.
     * 
     * @return entitlementRecordRefNo
     */
    public java.lang.String getEntitlementRecordRefNo() {
        return entitlementRecordRefNo;
    }


    /**
     * Sets the entitlementRecordRefNo value for this CreatedRenewEntitlementDataType.
     * 
     * @param entitlementRecordRefNo
     */
    public void setEntitlementRecordRefNo(java.lang.String entitlementRecordRefNo) {
        this.entitlementRecordRefNo = entitlementRecordRefNo;
    }


    /**
     * Gets the parentEntitlementIdentifier value for this CreatedRenewEntitlementDataType.
     * 
     * @return parentEntitlementIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getParentEntitlementIdentifier() {
        return parentEntitlementIdentifier;
    }


    /**
     * Sets the parentEntitlementIdentifier value for this CreatedRenewEntitlementDataType.
     * 
     * @param parentEntitlementIdentifier
     */
    public void setParentEntitlementIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType parentEntitlementIdentifier) {
        this.parentEntitlementIdentifier = parentEntitlementIdentifier;
    }


    /**
     * Gets the renewedLineItem value for this CreatedRenewEntitlementDataType.
     * 
     * @return renewedLineItem
     */
    public com.flexnet.operations.webservices.RenewedEntitlementLineItemDataType[] getRenewedLineItem() {
        return renewedLineItem;
    }


    /**
     * Sets the renewedLineItem value for this CreatedRenewEntitlementDataType.
     * 
     * @param renewedLineItem
     */
    public void setRenewedLineItem(com.flexnet.operations.webservices.RenewedEntitlementLineItemDataType[] renewedLineItem) {
        this.renewedLineItem = renewedLineItem;
    }

    public com.flexnet.operations.webservices.RenewedEntitlementLineItemDataType getRenewedLineItem(int i) {
        return this.renewedLineItem[i];
    }

    public void setRenewedLineItem(int i, com.flexnet.operations.webservices.RenewedEntitlementLineItemDataType _value) {
        this.renewedLineItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatedRenewEntitlementDataType)) return false;
        CreatedRenewEntitlementDataType other = (CreatedRenewEntitlementDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitlementRecordRefNo==null && other.getEntitlementRecordRefNo()==null) || 
             (this.entitlementRecordRefNo!=null &&
              this.entitlementRecordRefNo.equals(other.getEntitlementRecordRefNo()))) &&
            ((this.parentEntitlementIdentifier==null && other.getParentEntitlementIdentifier()==null) || 
             (this.parentEntitlementIdentifier!=null &&
              this.parentEntitlementIdentifier.equals(other.getParentEntitlementIdentifier()))) &&
            ((this.renewedLineItem==null && other.getRenewedLineItem()==null) || 
             (this.renewedLineItem!=null &&
              java.util.Arrays.equals(this.renewedLineItem, other.getRenewedLineItem())));
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
        if (getEntitlementRecordRefNo() != null) {
            _hashCode += getEntitlementRecordRefNo().hashCode();
        }
        if (getParentEntitlementIdentifier() != null) {
            _hashCode += getParentEntitlementIdentifier().hashCode();
        }
        if (getRenewedLineItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRenewedLineItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRenewedLineItem(), i);
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
        new org.apache.axis.description.TypeDesc(CreatedRenewEntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdRenewEntitlementDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementRecordRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementRecordRefNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentEntitlementIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentEntitlementIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewedLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewedLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewedEntitlementLineItemDataType"));
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
