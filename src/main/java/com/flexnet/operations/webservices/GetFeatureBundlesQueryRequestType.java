/**
 * GetFeatureBundlesQueryRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetFeatureBundlesQueryRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FeatureBundleQueryParametersType queryParams;

    private java.math.BigInteger pageNumber;

    private java.math.BigInteger batchSize;

    private boolean returnContainedObjects;

    public GetFeatureBundlesQueryRequestType() {
    }

    public GetFeatureBundlesQueryRequestType(
           com.flexnet.operations.webservices.FeatureBundleQueryParametersType queryParams,
           java.math.BigInteger pageNumber,
           java.math.BigInteger batchSize,
           boolean returnContainedObjects) {
           this.queryParams = queryParams;
           this.pageNumber = pageNumber;
           this.batchSize = batchSize;
           this.returnContainedObjects = returnContainedObjects;
    }


    /**
     * Gets the queryParams value for this GetFeatureBundlesQueryRequestType.
     * 
     * @return queryParams
     */
    public com.flexnet.operations.webservices.FeatureBundleQueryParametersType getQueryParams() {
        return queryParams;
    }


    /**
     * Sets the queryParams value for this GetFeatureBundlesQueryRequestType.
     * 
     * @param queryParams
     */
    public void setQueryParams(com.flexnet.operations.webservices.FeatureBundleQueryParametersType queryParams) {
        this.queryParams = queryParams;
    }


    /**
     * Gets the pageNumber value for this GetFeatureBundlesQueryRequestType.
     * 
     * @return pageNumber
     */
    public java.math.BigInteger getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this GetFeatureBundlesQueryRequestType.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.math.BigInteger pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the batchSize value for this GetFeatureBundlesQueryRequestType.
     * 
     * @return batchSize
     */
    public java.math.BigInteger getBatchSize() {
        return batchSize;
    }


    /**
     * Sets the batchSize value for this GetFeatureBundlesQueryRequestType.
     * 
     * @param batchSize
     */
    public void setBatchSize(java.math.BigInteger batchSize) {
        this.batchSize = batchSize;
    }


    /**
     * Gets the returnContainedObjects value for this GetFeatureBundlesQueryRequestType.
     * 
     * @return returnContainedObjects
     */
    public boolean isReturnContainedObjects() {
        return returnContainedObjects;
    }


    /**
     * Sets the returnContainedObjects value for this GetFeatureBundlesQueryRequestType.
     * 
     * @param returnContainedObjects
     */
    public void setReturnContainedObjects(boolean returnContainedObjects) {
        this.returnContainedObjects = returnContainedObjects;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFeatureBundlesQueryRequestType)) return false;
        GetFeatureBundlesQueryRequestType other = (GetFeatureBundlesQueryRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryParams==null && other.getQueryParams()==null) || 
             (this.queryParams!=null &&
              this.queryParams.equals(other.getQueryParams()))) &&
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber()))) &&
            ((this.batchSize==null && other.getBatchSize()==null) || 
             (this.batchSize!=null &&
              this.batchSize.equals(other.getBatchSize()))) &&
            this.returnContainedObjects == other.isReturnContainedObjects();
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
        if (getQueryParams() != null) {
            _hashCode += getQueryParams().hashCode();
        }
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        if (getBatchSize() != null) {
            _hashCode += getBatchSize().hashCode();
        }
        _hashCode += (isReturnContainedObjects() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFeatureBundlesQueryRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundlesQueryRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "queryParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleQueryParametersType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "pageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "batchSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnContainedObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "returnContainedObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
