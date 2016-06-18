/**
 * AddOrReplaceEntitlementLineItemRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class AddOrReplaceEntitlementLineItemRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.AddEntitlementLineItemDataType[] lineItem;

    public AddOrReplaceEntitlementLineItemRequestType() {
    }

    public AddOrReplaceEntitlementLineItemRequestType(
           com.flexnet.operations.webservices.AddEntitlementLineItemDataType[] lineItem) {
           this.lineItem = lineItem;
    }


    /**
     * Gets the lineItem value for this AddOrReplaceEntitlementLineItemRequestType.
     * 
     * @return lineItem
     */
    public com.flexnet.operations.webservices.AddEntitlementLineItemDataType[] getLineItem() {
        return lineItem;
    }


    /**
     * Sets the lineItem value for this AddOrReplaceEntitlementLineItemRequestType.
     * 
     * @param lineItem
     */
    public void setLineItem(com.flexnet.operations.webservices.AddEntitlementLineItemDataType[] lineItem) {
        this.lineItem = lineItem;
    }

    public com.flexnet.operations.webservices.AddEntitlementLineItemDataType getLineItem(int i) {
        return this.lineItem[i];
    }

    public void setLineItem(int i, com.flexnet.operations.webservices.AddEntitlementLineItemDataType _value) {
        this.lineItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddOrReplaceEntitlementLineItemRequestType)) return false;
        AddOrReplaceEntitlementLineItemRequestType other = (AddOrReplaceEntitlementLineItemRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItem==null && other.getLineItem()==null) || 
             (this.lineItem!=null &&
              java.util.Arrays.equals(this.lineItem, other.getLineItem())));
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
        if (getLineItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItem(), i);
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
        new org.apache.axis.description.TypeDesc(AddOrReplaceEntitlementLineItemRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addOrReplaceEntitlementLineItemRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addEntitlementLineItemDataType"));
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
