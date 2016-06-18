/**
 * AddedEntitlementLineItemDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class AddedEntitlementLineItemDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.AddedEntitlementLineItemDataType[] addedLineItems;

    public AddedEntitlementLineItemDataListType() {
    }

    public AddedEntitlementLineItemDataListType(
           com.flexnet.operations.webservices.AddedEntitlementLineItemDataType[] addedLineItems) {
           this.addedLineItems = addedLineItems;
    }


    /**
     * Gets the addedLineItems value for this AddedEntitlementLineItemDataListType.
     * 
     * @return addedLineItems
     */
    public com.flexnet.operations.webservices.AddedEntitlementLineItemDataType[] getAddedLineItems() {
        return addedLineItems;
    }


    /**
     * Sets the addedLineItems value for this AddedEntitlementLineItemDataListType.
     * 
     * @param addedLineItems
     */
    public void setAddedLineItems(com.flexnet.operations.webservices.AddedEntitlementLineItemDataType[] addedLineItems) {
        this.addedLineItems = addedLineItems;
    }

    public com.flexnet.operations.webservices.AddedEntitlementLineItemDataType getAddedLineItems(int i) {
        return this.addedLineItems[i];
    }

    public void setAddedLineItems(int i, com.flexnet.operations.webservices.AddedEntitlementLineItemDataType _value) {
        this.addedLineItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddedEntitlementLineItemDataListType)) return false;
        AddedEntitlementLineItemDataListType other = (AddedEntitlementLineItemDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addedLineItems==null && other.getAddedLineItems()==null) || 
             (this.addedLineItems!=null &&
              java.util.Arrays.equals(this.addedLineItems, other.getAddedLineItems())));
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
        if (getAddedLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddedLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddedLineItems(), i);
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
        new org.apache.axis.description.TypeDesc(AddedEntitlementLineItemDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addedEntitlementLineItemDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addedLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addedLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addedEntitlementLineItemDataType"));
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
