/**
 * FailedTransferEntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedTransferEntitlementDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.TransferEntitlementInfoType entitlementInfo;

    private java.lang.String reason;

    public FailedTransferEntitlementDataType() {
    }

    public FailedTransferEntitlementDataType(
           com.flexnet.operations.webservices.TransferEntitlementInfoType entitlementInfo,
           java.lang.String reason) {
           this.entitlementInfo = entitlementInfo;
           this.reason = reason;
    }


    /**
     * Gets the entitlementInfo value for this FailedTransferEntitlementDataType.
     * 
     * @return entitlementInfo
     */
    public com.flexnet.operations.webservices.TransferEntitlementInfoType getEntitlementInfo() {
        return entitlementInfo;
    }


    /**
     * Sets the entitlementInfo value for this FailedTransferEntitlementDataType.
     * 
     * @param entitlementInfo
     */
    public void setEntitlementInfo(com.flexnet.operations.webservices.TransferEntitlementInfoType entitlementInfo) {
        this.entitlementInfo = entitlementInfo;
    }


    /**
     * Gets the reason value for this FailedTransferEntitlementDataType.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this FailedTransferEntitlementDataType.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedTransferEntitlementDataType)) return false;
        FailedTransferEntitlementDataType other = (FailedTransferEntitlementDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitlementInfo==null && other.getEntitlementInfo()==null) || 
             (this.entitlementInfo!=null &&
              this.entitlementInfo.equals(other.getEntitlementInfo()))) &&
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
        if (getEntitlementInfo() != null) {
            _hashCode += getEntitlementInfo().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FailedTransferEntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedTransferEntitlementDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferEntitlementInfoType"));
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
