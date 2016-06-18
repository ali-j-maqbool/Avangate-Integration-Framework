/**
 * WebRegKeyCountDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class WebRegKeyCountDataType  implements java.io.Serializable {
    private java.math.BigInteger totalCount;

    private java.math.BigInteger redeemedCount;

    public WebRegKeyCountDataType() {
    }

    public WebRegKeyCountDataType(
           java.math.BigInteger totalCount,
           java.math.BigInteger redeemedCount) {
           this.totalCount = totalCount;
           this.redeemedCount = redeemedCount;
    }


    /**
     * Gets the totalCount value for this WebRegKeyCountDataType.
     * 
     * @return totalCount
     */
    public java.math.BigInteger getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this WebRegKeyCountDataType.
     * 
     * @param totalCount
     */
    public void setTotalCount(java.math.BigInteger totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * Gets the redeemedCount value for this WebRegKeyCountDataType.
     * 
     * @return redeemedCount
     */
    public java.math.BigInteger getRedeemedCount() {
        return redeemedCount;
    }


    /**
     * Sets the redeemedCount value for this WebRegKeyCountDataType.
     * 
     * @param redeemedCount
     */
    public void setRedeemedCount(java.math.BigInteger redeemedCount) {
        this.redeemedCount = redeemedCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebRegKeyCountDataType)) return false;
        WebRegKeyCountDataType other = (WebRegKeyCountDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalCount==null && other.getTotalCount()==null) || 
             (this.totalCount!=null &&
              this.totalCount.equals(other.getTotalCount()))) &&
            ((this.redeemedCount==null && other.getRedeemedCount()==null) || 
             (this.redeemedCount!=null &&
              this.redeemedCount.equals(other.getRedeemedCount())));
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
        if (getTotalCount() != null) {
            _hashCode += getTotalCount().hashCode();
        }
        if (getRedeemedCount() != null) {
            _hashCode += getRedeemedCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebRegKeyCountDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeyCountDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "totalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redeemedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "redeemedCount"));
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
