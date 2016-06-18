/**
 * GetMatchingLineItemsResponseListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetMatchingLineItemsResponseListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.MatchingLineItemDataType[] matchingLineItem;

    public GetMatchingLineItemsResponseListType() {
    }

    public GetMatchingLineItemsResponseListType(
           com.flexnet.operations.webservices.MatchingLineItemDataType[] matchingLineItem) {
           this.matchingLineItem = matchingLineItem;
    }


    /**
     * Gets the matchingLineItem value for this GetMatchingLineItemsResponseListType.
     * 
     * @return matchingLineItem
     */
    public com.flexnet.operations.webservices.MatchingLineItemDataType[] getMatchingLineItem() {
        return matchingLineItem;
    }


    /**
     * Sets the matchingLineItem value for this GetMatchingLineItemsResponseListType.
     * 
     * @param matchingLineItem
     */
    public void setMatchingLineItem(com.flexnet.operations.webservices.MatchingLineItemDataType[] matchingLineItem) {
        this.matchingLineItem = matchingLineItem;
    }

    public com.flexnet.operations.webservices.MatchingLineItemDataType getMatchingLineItem(int i) {
        return this.matchingLineItem[i];
    }

    public void setMatchingLineItem(int i, com.flexnet.operations.webservices.MatchingLineItemDataType _value) {
        this.matchingLineItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMatchingLineItemsResponseListType)) return false;
        GetMatchingLineItemsResponseListType other = (GetMatchingLineItemsResponseListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matchingLineItem==null && other.getMatchingLineItem()==null) || 
             (this.matchingLineItem!=null &&
              java.util.Arrays.equals(this.matchingLineItem, other.getMatchingLineItem())));
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
        if (getMatchingLineItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchingLineItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchingLineItem(), i);
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
        new org.apache.axis.description.TypeDesc(GetMatchingLineItemsResponseListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingLineItemsResponseListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "matchingLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "matchingLineItemDataType"));
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
