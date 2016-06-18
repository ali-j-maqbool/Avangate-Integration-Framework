/**
 * SearchEntitlementRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class SearchEntitlementRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SearchEntitlementDataType entitlementSearchCriteria;

    private java.math.BigInteger batchSize;

    private java.math.BigInteger pageNumber;

    public SearchEntitlementRequestType() {
    }

    public SearchEntitlementRequestType(
           com.flexnet.operations.webservices.SearchEntitlementDataType entitlementSearchCriteria,
           java.math.BigInteger batchSize,
           java.math.BigInteger pageNumber) {
           this.entitlementSearchCriteria = entitlementSearchCriteria;
           this.batchSize = batchSize;
           this.pageNumber = pageNumber;
    }


    /**
     * Gets the entitlementSearchCriteria value for this SearchEntitlementRequestType.
     * 
     * @return entitlementSearchCriteria
     */
    public com.flexnet.operations.webservices.SearchEntitlementDataType getEntitlementSearchCriteria() {
        return entitlementSearchCriteria;
    }


    /**
     * Sets the entitlementSearchCriteria value for this SearchEntitlementRequestType.
     * 
     * @param entitlementSearchCriteria
     */
    public void setEntitlementSearchCriteria(com.flexnet.operations.webservices.SearchEntitlementDataType entitlementSearchCriteria) {
        this.entitlementSearchCriteria = entitlementSearchCriteria;
    }


    /**
     * Gets the batchSize value for this SearchEntitlementRequestType.
     * 
     * @return batchSize
     */
    public java.math.BigInteger getBatchSize() {
        return batchSize;
    }


    /**
     * Sets the batchSize value for this SearchEntitlementRequestType.
     * 
     * @param batchSize
     */
    public void setBatchSize(java.math.BigInteger batchSize) {
        this.batchSize = batchSize;
    }


    /**
     * Gets the pageNumber value for this SearchEntitlementRequestType.
     * 
     * @return pageNumber
     */
    public java.math.BigInteger getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this SearchEntitlementRequestType.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.math.BigInteger pageNumber) {
        this.pageNumber = pageNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchEntitlementRequestType)) return false;
        SearchEntitlementRequestType other = (SearchEntitlementRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitlementSearchCriteria==null && other.getEntitlementSearchCriteria()==null) || 
             (this.entitlementSearchCriteria!=null &&
              this.entitlementSearchCriteria.equals(other.getEntitlementSearchCriteria()))) &&
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
        if (getEntitlementSearchCriteria() != null) {
            _hashCode += getEntitlementSearchCriteria().hashCode();
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
        new org.apache.axis.description.TypeDesc(SearchEntitlementRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementDataType"));
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
