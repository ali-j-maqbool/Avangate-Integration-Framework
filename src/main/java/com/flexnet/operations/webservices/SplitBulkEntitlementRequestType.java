/**
 * SplitBulkEntitlementRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class SplitBulkEntitlementRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SplitBulkEntitlementListType bulkEntitlementList;

    public SplitBulkEntitlementRequestType() {
    }

    public SplitBulkEntitlementRequestType(
           com.flexnet.operations.webservices.SplitBulkEntitlementListType bulkEntitlementList) {
           this.bulkEntitlementList = bulkEntitlementList;
    }


    /**
     * Gets the bulkEntitlementList value for this SplitBulkEntitlementRequestType.
     * 
     * @return bulkEntitlementList
     */
    public com.flexnet.operations.webservices.SplitBulkEntitlementListType getBulkEntitlementList() {
        return bulkEntitlementList;
    }


    /**
     * Sets the bulkEntitlementList value for this SplitBulkEntitlementRequestType.
     * 
     * @param bulkEntitlementList
     */
    public void setBulkEntitlementList(com.flexnet.operations.webservices.SplitBulkEntitlementListType bulkEntitlementList) {
        this.bulkEntitlementList = bulkEntitlementList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SplitBulkEntitlementRequestType)) return false;
        SplitBulkEntitlementRequestType other = (SplitBulkEntitlementRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkEntitlementList==null && other.getBulkEntitlementList()==null) || 
             (this.bulkEntitlementList!=null &&
              this.bulkEntitlementList.equals(other.getBulkEntitlementList())));
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
        if (getBulkEntitlementList() != null) {
            _hashCode += getBulkEntitlementList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SplitBulkEntitlementRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntitlementList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementListType"));
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
