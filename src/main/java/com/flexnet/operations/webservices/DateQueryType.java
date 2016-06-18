/**
 * DateQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class DateQueryType  implements java.io.Serializable {
    private java.util.Date value;

    private com.flexnet.operations.webservices.DatedSearchType searchType;

    public DateQueryType() {
    }

    public DateQueryType(
           java.util.Date value,
           com.flexnet.operations.webservices.DatedSearchType searchType) {
           this.value = value;
           this.searchType = searchType;
    }


    /**
     * Gets the value value for this DateQueryType.
     * 
     * @return value
     */
    public java.util.Date getValue() {
        return value;
    }


    /**
     * Sets the value value for this DateQueryType.
     * 
     * @param value
     */
    public void setValue(java.util.Date value) {
        this.value = value;
    }


    /**
     * Gets the searchType value for this DateQueryType.
     * 
     * @return searchType
     */
    public com.flexnet.operations.webservices.DatedSearchType getSearchType() {
        return searchType;
    }


    /**
     * Sets the searchType value for this DateQueryType.
     * 
     * @param searchType
     */
    public void setSearchType(com.flexnet.operations.webservices.DatedSearchType searchType) {
        this.searchType = searchType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateQueryType)) return false;
        DateQueryType other = (DateQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.searchType==null && other.getSearchType()==null) || 
             (this.searchType!=null &&
              this.searchType.equals(other.getSearchType())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getSearchType() != null) {
            _hashCode += getSearchType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "datedSearchType"));
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
