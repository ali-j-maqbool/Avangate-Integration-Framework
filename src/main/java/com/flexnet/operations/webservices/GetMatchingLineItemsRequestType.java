/**
 * GetMatchingLineItemsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetMatchingLineItemsRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.GetMatchingLineItemsListType lineItemList;

    public GetMatchingLineItemsRequestType() {
    }

    public GetMatchingLineItemsRequestType(
           com.flexnet.operations.webservices.GetMatchingLineItemsListType lineItemList) {
           this.lineItemList = lineItemList;
    }


    /**
     * Gets the lineItemList value for this GetMatchingLineItemsRequestType.
     * 
     * @return lineItemList
     */
    public com.flexnet.operations.webservices.GetMatchingLineItemsListType getLineItemList() {
        return lineItemList;
    }


    /**
     * Sets the lineItemList value for this GetMatchingLineItemsRequestType.
     * 
     * @param lineItemList
     */
    public void setLineItemList(com.flexnet.operations.webservices.GetMatchingLineItemsListType lineItemList) {
        this.lineItemList = lineItemList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMatchingLineItemsRequestType)) return false;
        GetMatchingLineItemsRequestType other = (GetMatchingLineItemsRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemList==null && other.getLineItemList()==null) || 
             (this.lineItemList!=null &&
              this.lineItemList.equals(other.getLineItemList())));
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
        if (getLineItemList() != null) {
            _hashCode += getLineItemList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMatchingLineItemsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingLineItemsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingLineItemsListType"));
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
