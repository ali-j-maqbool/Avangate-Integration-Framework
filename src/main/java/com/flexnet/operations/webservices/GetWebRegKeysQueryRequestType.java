/**
 * GetWebRegKeysQueryRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetWebRegKeysQueryRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntitlementIdentifier;

    private java.math.BigInteger batchSize;

    private java.math.BigInteger pageNumber;

    public GetWebRegKeysQueryRequestType() {
    }

    public GetWebRegKeysQueryRequestType(
           com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntitlementIdentifier,
           java.math.BigInteger batchSize,
           java.math.BigInteger pageNumber) {
           this.bulkEntitlementIdentifier = bulkEntitlementIdentifier;
           this.batchSize = batchSize;
           this.pageNumber = pageNumber;
    }


    /**
     * Gets the bulkEntitlementIdentifier value for this GetWebRegKeysQueryRequestType.
     * 
     * @return bulkEntitlementIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getBulkEntitlementIdentifier() {
        return bulkEntitlementIdentifier;
    }


    /**
     * Sets the bulkEntitlementIdentifier value for this GetWebRegKeysQueryRequestType.
     * 
     * @param bulkEntitlementIdentifier
     */
    public void setBulkEntitlementIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntitlementIdentifier) {
        this.bulkEntitlementIdentifier = bulkEntitlementIdentifier;
    }


    /**
     * Gets the batchSize value for this GetWebRegKeysQueryRequestType.
     * 
     * @return batchSize
     */
    public java.math.BigInteger getBatchSize() {
        return batchSize;
    }


    /**
     * Sets the batchSize value for this GetWebRegKeysQueryRequestType.
     * 
     * @param batchSize
     */
    public void setBatchSize(java.math.BigInteger batchSize) {
        this.batchSize = batchSize;
    }


    /**
     * Gets the pageNumber value for this GetWebRegKeysQueryRequestType.
     * 
     * @return pageNumber
     */
    public java.math.BigInteger getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this GetWebRegKeysQueryRequestType.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.math.BigInteger pageNumber) {
        this.pageNumber = pageNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWebRegKeysQueryRequestType)) return false;
        GetWebRegKeysQueryRequestType other = (GetWebRegKeysQueryRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkEntitlementIdentifier==null && other.getBulkEntitlementIdentifier()==null) || 
             (this.bulkEntitlementIdentifier!=null &&
              this.bulkEntitlementIdentifier.equals(other.getBulkEntitlementIdentifier()))) &&
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
        if (getBulkEntitlementIdentifier() != null) {
            _hashCode += getBulkEntitlementIdentifier().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetWebRegKeysQueryRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeysQueryRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntitlementIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
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
