/**
 * GetBulkEntitlementPropertiesRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetBulkEntitlementPropertiesRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SearchBulkEntitlementDataType bulkEntitlementSearchCriteria;

    private com.flexnet.operations.webservices.BulkEntitlementResponseConfigRequestType bulkEntitlementResponseConfig;

    private java.math.BigInteger batchSize;

    private java.math.BigInteger pageNumber;

    public GetBulkEntitlementPropertiesRequestType() {
    }

    public GetBulkEntitlementPropertiesRequestType(
           com.flexnet.operations.webservices.SearchBulkEntitlementDataType bulkEntitlementSearchCriteria,
           com.flexnet.operations.webservices.BulkEntitlementResponseConfigRequestType bulkEntitlementResponseConfig,
           java.math.BigInteger batchSize,
           java.math.BigInteger pageNumber) {
           this.bulkEntitlementSearchCriteria = bulkEntitlementSearchCriteria;
           this.bulkEntitlementResponseConfig = bulkEntitlementResponseConfig;
           this.batchSize = batchSize;
           this.pageNumber = pageNumber;
    }


    /**
     * Gets the bulkEntitlementSearchCriteria value for this GetBulkEntitlementPropertiesRequestType.
     * 
     * @return bulkEntitlementSearchCriteria
     */
    public com.flexnet.operations.webservices.SearchBulkEntitlementDataType getBulkEntitlementSearchCriteria() {
        return bulkEntitlementSearchCriteria;
    }


    /**
     * Sets the bulkEntitlementSearchCriteria value for this GetBulkEntitlementPropertiesRequestType.
     * 
     * @param bulkEntitlementSearchCriteria
     */
    public void setBulkEntitlementSearchCriteria(com.flexnet.operations.webservices.SearchBulkEntitlementDataType bulkEntitlementSearchCriteria) {
        this.bulkEntitlementSearchCriteria = bulkEntitlementSearchCriteria;
    }


    /**
     * Gets the bulkEntitlementResponseConfig value for this GetBulkEntitlementPropertiesRequestType.
     * 
     * @return bulkEntitlementResponseConfig
     */
    public com.flexnet.operations.webservices.BulkEntitlementResponseConfigRequestType getBulkEntitlementResponseConfig() {
        return bulkEntitlementResponseConfig;
    }


    /**
     * Sets the bulkEntitlementResponseConfig value for this GetBulkEntitlementPropertiesRequestType.
     * 
     * @param bulkEntitlementResponseConfig
     */
    public void setBulkEntitlementResponseConfig(com.flexnet.operations.webservices.BulkEntitlementResponseConfigRequestType bulkEntitlementResponseConfig) {
        this.bulkEntitlementResponseConfig = bulkEntitlementResponseConfig;
    }


    /**
     * Gets the batchSize value for this GetBulkEntitlementPropertiesRequestType.
     * 
     * @return batchSize
     */
    public java.math.BigInteger getBatchSize() {
        return batchSize;
    }


    /**
     * Sets the batchSize value for this GetBulkEntitlementPropertiesRequestType.
     * 
     * @param batchSize
     */
    public void setBatchSize(java.math.BigInteger batchSize) {
        this.batchSize = batchSize;
    }


    /**
     * Gets the pageNumber value for this GetBulkEntitlementPropertiesRequestType.
     * 
     * @return pageNumber
     */
    public java.math.BigInteger getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this GetBulkEntitlementPropertiesRequestType.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.math.BigInteger pageNumber) {
        this.pageNumber = pageNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBulkEntitlementPropertiesRequestType)) return false;
        GetBulkEntitlementPropertiesRequestType other = (GetBulkEntitlementPropertiesRequestType) obj;
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
              this.bulkEntitlementSearchCriteria.equals(other.getBulkEntitlementSearchCriteria()))) &&
            ((this.bulkEntitlementResponseConfig==null && other.getBulkEntitlementResponseConfig()==null) || 
             (this.bulkEntitlementResponseConfig!=null &&
              this.bulkEntitlementResponseConfig.equals(other.getBulkEntitlementResponseConfig()))) &&
            ((this.batchSize==null && other.getBatchSize()==null) || 
             (this.batchSize!=null &&
              this.batchSize.equals(other.getBatchSize()))) &&
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber())));
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
        if (getBulkEntitlementResponseConfig() != null) {
            _hashCode += getBulkEntitlementResponseConfig().hashCode();
        }
        if (getBatchSize() != null) {
            _hashCode += getBatchSize().hashCode();
        }
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBulkEntitlementPropertiesRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementPropertiesRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntitlementSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchBulkEntitlementDataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntitlementResponseConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementResponseConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementResponseConfigRequestType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "batchSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "pageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
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
