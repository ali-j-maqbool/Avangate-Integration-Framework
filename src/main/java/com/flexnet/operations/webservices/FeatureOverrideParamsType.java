/**
 * FeatureOverrideParamsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FeatureOverrideParamsType  implements java.io.Serializable {
    private java.lang.String vendorString;

    private java.lang.String notice;

    private java.lang.String serialNumber;

    private com.flexnet.operations.webservices.DupGroupDataType dupGroup;

    public FeatureOverrideParamsType() {
    }

    public FeatureOverrideParamsType(
           java.lang.String vendorString,
           java.lang.String notice,
           java.lang.String serialNumber,
           com.flexnet.operations.webservices.DupGroupDataType dupGroup) {
           this.vendorString = vendorString;
           this.notice = notice;
           this.serialNumber = serialNumber;
           this.dupGroup = dupGroup;
    }


    /**
     * Gets the vendorString value for this FeatureOverrideParamsType.
     * 
     * @return vendorString
     */
    public java.lang.String getVendorString() {
        return vendorString;
    }


    /**
     * Sets the vendorString value for this FeatureOverrideParamsType.
     * 
     * @param vendorString
     */
    public void setVendorString(java.lang.String vendorString) {
        this.vendorString = vendorString;
    }


    /**
     * Gets the notice value for this FeatureOverrideParamsType.
     * 
     * @return notice
     */
    public java.lang.String getNotice() {
        return notice;
    }


    /**
     * Sets the notice value for this FeatureOverrideParamsType.
     * 
     * @param notice
     */
    public void setNotice(java.lang.String notice) {
        this.notice = notice;
    }


    /**
     * Gets the serialNumber value for this FeatureOverrideParamsType.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this FeatureOverrideParamsType.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the dupGroup value for this FeatureOverrideParamsType.
     * 
     * @return dupGroup
     */
    public com.flexnet.operations.webservices.DupGroupDataType getDupGroup() {
        return dupGroup;
    }


    /**
     * Sets the dupGroup value for this FeatureOverrideParamsType.
     * 
     * @param dupGroup
     */
    public void setDupGroup(com.flexnet.operations.webservices.DupGroupDataType dupGroup) {
        this.dupGroup = dupGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureOverrideParamsType)) return false;
        FeatureOverrideParamsType other = (FeatureOverrideParamsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vendorString==null && other.getVendorString()==null) || 
             (this.vendorString!=null &&
              this.vendorString.equals(other.getVendorString()))) &&
            ((this.notice==null && other.getNotice()==null) || 
             (this.notice!=null &&
              this.notice.equals(other.getNotice()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.dupGroup==null && other.getDupGroup()==null) || 
             (this.dupGroup!=null &&
              this.dupGroup.equals(other.getDupGroup())));
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
        if (getVendorString() != null) {
            _hashCode += getVendorString().hashCode();
        }
        if (getNotice() != null) {
            _hashCode += getNotice().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getDupGroup() != null) {
            _hashCode += getDupGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureOverrideParamsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureOverrideParamsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "vendorString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "notice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dupGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "dupGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "dupGroupDataType"));
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
