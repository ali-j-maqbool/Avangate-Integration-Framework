/**
 * FailedSplitBulkEntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedSplitBulkEntitlementDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SplitBulkEntitlementInfoType bulkEntitlementInfo;

    private java.lang.String reason;

    public FailedSplitBulkEntitlementDataType() {
    }

    public FailedSplitBulkEntitlementDataType(
           com.flexnet.operations.webservices.SplitBulkEntitlementInfoType bulkEntitlementInfo,
           java.lang.String reason) {
           this.bulkEntitlementInfo = bulkEntitlementInfo;
           this.reason = reason;
    }


    /**
     * Gets the bulkEntitlementInfo value for this FailedSplitBulkEntitlementDataType.
     * 
     * @return bulkEntitlementInfo
     */
    public com.flexnet.operations.webservices.SplitBulkEntitlementInfoType getBulkEntitlementInfo() {
        return bulkEntitlementInfo;
    }


    /**
     * Sets the bulkEntitlementInfo value for this FailedSplitBulkEntitlementDataType.
     * 
     * @param bulkEntitlementInfo
     */
    public void setBulkEntitlementInfo(com.flexnet.operations.webservices.SplitBulkEntitlementInfoType bulkEntitlementInfo) {
        this.bulkEntitlementInfo = bulkEntitlementInfo;
    }


    /**
     * Gets the reason value for this FailedSplitBulkEntitlementDataType.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this FailedSplitBulkEntitlementDataType.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedSplitBulkEntitlementDataType)) return false;
        FailedSplitBulkEntitlementDataType other = (FailedSplitBulkEntitlementDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkEntitlementInfo==null && other.getBulkEntitlementInfo()==null) || 
             (this.bulkEntitlementInfo!=null &&
              this.bulkEntitlementInfo.equals(other.getBulkEntitlementInfo()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getBulkEntitlementInfo() != null) {
            _hashCode += getBulkEntitlementInfo().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FailedSplitBulkEntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedSplitBulkEntitlementDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntitlementInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "reason"));
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
