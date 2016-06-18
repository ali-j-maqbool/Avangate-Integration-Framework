/**
 * CreatedBulkEntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreatedBulkEntitlementDataType  implements java.io.Serializable {
    private java.lang.String recordRefNo;

    private java.lang.String uniqueId;

    private java.lang.String bulkEntitlementId;

    public CreatedBulkEntitlementDataType() {
    }

    public CreatedBulkEntitlementDataType(
           java.lang.String recordRefNo,
           java.lang.String uniqueId,
           java.lang.String bulkEntitlementId) {
           this.recordRefNo = recordRefNo;
           this.uniqueId = uniqueId;
           this.bulkEntitlementId = bulkEntitlementId;
    }


    /**
     * Gets the recordRefNo value for this CreatedBulkEntitlementDataType.
     * 
     * @return recordRefNo
     */
    public java.lang.String getRecordRefNo() {
        return recordRefNo;
    }


    /**
     * Sets the recordRefNo value for this CreatedBulkEntitlementDataType.
     * 
     * @param recordRefNo
     */
    public void setRecordRefNo(java.lang.String recordRefNo) {
        this.recordRefNo = recordRefNo;
    }


    /**
     * Gets the uniqueId value for this CreatedBulkEntitlementDataType.
     * 
     * @return uniqueId
     */
    public java.lang.String getUniqueId() {
        return uniqueId;
    }


    /**
     * Sets the uniqueId value for this CreatedBulkEntitlementDataType.
     * 
     * @param uniqueId
     */
    public void setUniqueId(java.lang.String uniqueId) {
        this.uniqueId = uniqueId;
    }


    /**
     * Gets the bulkEntitlementId value for this CreatedBulkEntitlementDataType.
     * 
     * @return bulkEntitlementId
     */
    public java.lang.String getBulkEntitlementId() {
        return bulkEntitlementId;
    }


    /**
     * Sets the bulkEntitlementId value for this CreatedBulkEntitlementDataType.
     * 
     * @param bulkEntitlementId
     */
    public void setBulkEntitlementId(java.lang.String bulkEntitlementId) {
        this.bulkEntitlementId = bulkEntitlementId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatedBulkEntitlementDataType)) return false;
        CreatedBulkEntitlementDataType other = (CreatedBulkEntitlementDataType) obj;
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
              this.uniqueId.equals(other.getUniqueId()))) &&
            ((this.bulkEntitlementId==null && other.getBulkEntitlementId()==null) || 
             (this.bulkEntitlementId!=null &&
              this.bulkEntitlementId.equals(other.getBulkEntitlementId())));
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
        if (getBulkEntitlementId() != null) {
            _hashCode += getBulkEntitlementId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreatedBulkEntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdBulkEntitlementDataType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementId"));
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
