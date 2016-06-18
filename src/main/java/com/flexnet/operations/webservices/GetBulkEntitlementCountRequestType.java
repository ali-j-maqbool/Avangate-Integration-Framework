/**
 * GetBulkEntitlementCountRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetBulkEntitlementCountRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SearchBulkEntitlementDataType bulkEntitlementSearchCriteria;

    public GetBulkEntitlementCountRequestType() {
    }

    public GetBulkEntitlementCountRequestType(
           com.flexnet.operations.webservices.SearchBulkEntitlementDataType bulkEntitlementSearchCriteria) {
           this.bulkEntitlementSearchCriteria = bulkEntitlementSearchCriteria;
    }


    /**
     * Gets the bulkEntitlementSearchCriteria value for this GetBulkEntitlementCountRequestType.
     * 
     * @return bulkEntitlementSearchCriteria
     */
    public com.flexnet.operations.webservices.SearchBulkEntitlementDataType getBulkEntitlementSearchCriteria() {
        return bulkEntitlementSearchCriteria;
    }


    /**
     * Sets the bulkEntitlementSearchCriteria value for this GetBulkEntitlementCountRequestType.
     * 
     * @param bulkEntitlementSearchCriteria
     */
    public void setBulkEntitlementSearchCriteria(com.flexnet.operations.webservices.SearchBulkEntitlementDataType bulkEntitlementSearchCriteria) {
        this.bulkEntitlementSearchCriteria = bulkEntitlementSearchCriteria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBulkEntitlementCountRequestType)) return false;
        GetBulkEntitlementCountRequestType other = (GetBulkEntitlementCountRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkEntitlementSearchCriteria==null && other.getBulkEntitlementSearchCriteria()==null) || 
             (this.bulkEntitlementSearchCriteria!=null &&
              this.bulkEntitlementSearchCriteria.equals(other.getBulkEntitlementSearchCriteria())));
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
        if (getBulkEntitlementSearchCriteria() != null) {
            _hashCode += getBulkEntitlementSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBulkEntitlementCountRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementCountRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntitlementSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchBulkEntitlementDataType"));
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
