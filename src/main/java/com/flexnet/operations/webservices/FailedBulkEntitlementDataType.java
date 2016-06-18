/**
 * FailedBulkEntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedBulkEntitlementDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.CreateBulkEntitlementDataType bulkEntitlement;

    private java.lang.String reason;

    public FailedBulkEntitlementDataType() {
    }

    public FailedBulkEntitlementDataType(
           com.flexnet.operations.webservices.CreateBulkEntitlementDataType bulkEntitlement,
           java.lang.String reason) {
           this.bulkEntitlement = bulkEntitlement;
           this.reason = reason;
    }


    /**
     * Gets the bulkEntitlement value for this FailedBulkEntitlementDataType.
     * 
     * @return bulkEntitlement
     */
    public com.flexnet.operations.webservices.CreateBulkEntitlementDataType getBulkEntitlement() {
        return bulkEntitlement;
    }


    /**
     * Sets the bulkEntitlement value for this FailedBulkEntitlementDataType.
     * 
     * @param bulkEntitlement
     */
    public void setBulkEntitlement(com.flexnet.operations.webservices.CreateBulkEntitlementDataType bulkEntitlement) {
        this.bulkEntitlement = bulkEntitlement;
    }


    /**
     * Gets the reason value for this FailedBulkEntitlementDataType.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this FailedBulkEntitlementDataType.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedBulkEntitlementDataType)) return false;
        FailedBulkEntitlementDataType other = (FailedBulkEntitlementDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkEntitlement==null && other.getBulkEntitlement()==null) || 
             (this.bulkEntitlement!=null &&
              this.bulkEntitlement.equals(other.getBulkEntitlement()))) &&
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
        if (getBulkEntitlement() != null) {
            _hashCode += getBulkEntitlement().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FailedBulkEntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedBulkEntitlementDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createBulkEntitlementDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
