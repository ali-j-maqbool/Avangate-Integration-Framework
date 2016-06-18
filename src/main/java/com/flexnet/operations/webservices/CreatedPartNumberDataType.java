/**
 * CreatedPartNumberDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreatedPartNumberDataType  implements java.io.Serializable {
    private java.lang.String recordRefNo;

    private java.lang.String uniqueId;

    public CreatedPartNumberDataType() {
    }

    public CreatedPartNumberDataType(
           java.lang.String recordRefNo,
           java.lang.String uniqueId) {
           this.recordRefNo = recordRefNo;
           this.uniqueId = uniqueId;
    }


    /**
     * Gets the recordRefNo value for this CreatedPartNumberDataType.
     * 
     * @return recordRefNo
     */
    public java.lang.String getRecordRefNo() {
        return recordRefNo;
    }


    /**
     * Sets the recordRefNo value for this CreatedPartNumberDataType.
     * 
     * @param recordRefNo
     */
    public void setRecordRefNo(java.lang.String recordRefNo) {
        this.recordRefNo = recordRefNo;
    }


    /**
     * Gets the uniqueId value for this CreatedPartNumberDataType.
     * 
     * @return uniqueId
     */
    public java.lang.String getUniqueId() {
        return uniqueId;
    }


    /**
     * Sets the uniqueId value for this CreatedPartNumberDataType.
     * 
     * @param uniqueId
     */
    public void setUniqueId(java.lang.String uniqueId) {
        this.uniqueId = uniqueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatedPartNumberDataType)) return false;
        CreatedPartNumberDataType other = (CreatedPartNumberDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recordRefNo==null && other.getRecordRefNo()==null) || 
             (this.recordRefNo!=null &&
              this.recordRefNo.equals(other.getRecordRefNo()))) &&
            ((this.uniqueId==null && other.getUniqueId()==null) || 
             (this.uniqueId!=null &&
              this.uniqueId.equals(other.getUniqueId())));
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
        if (getRecordRefNo() != null) {
            _hashCode += getRecordRefNo().hashCode();
        }
        if (getUniqueId() != null) {
            _hashCode += getUniqueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreatedPartNumberDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdPartNumberDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "recordRefNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "uniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
