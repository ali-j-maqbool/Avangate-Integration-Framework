/**
 * MoveDeviceRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class MoveDeviceRequestType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.MoveDeviceList sourceDevices;

    private java.lang.String soldToUniqueId;

    private java.lang.String soldToName;

    private java.lang.Boolean poolEntitlements;

    public MoveDeviceRequestType() {
    }

    public MoveDeviceRequestType(
           com.flexnet.opsembedded.webservices.MoveDeviceList sourceDevices,
           java.lang.String soldToUniqueId,
           java.lang.String soldToName,
           java.lang.Boolean poolEntitlements) {
           this.sourceDevices = sourceDevices;
           this.soldToUniqueId = soldToUniqueId;
           this.soldToName = soldToName;
           this.poolEntitlements = poolEntitlements;
    }


    /**
     * Gets the sourceDevices value for this MoveDeviceRequestType.
     * 
     * @return sourceDevices
     */
    public com.flexnet.opsembedded.webservices.MoveDeviceList getSourceDevices() {
        return sourceDevices;
    }


    /**
     * Sets the sourceDevices value for this MoveDeviceRequestType.
     * 
     * @param sourceDevices
     */
    public void setSourceDevices(com.flexnet.opsembedded.webservices.MoveDeviceList sourceDevices) {
        this.sourceDevices = sourceDevices;
    }


    /**
     * Gets the soldToUniqueId value for this MoveDeviceRequestType.
     * 
     * @return soldToUniqueId
     */
    public java.lang.String getSoldToUniqueId() {
        return soldToUniqueId;
    }


    /**
     * Sets the soldToUniqueId value for this MoveDeviceRequestType.
     * 
     * @param soldToUniqueId
     */
    public void setSoldToUniqueId(java.lang.String soldToUniqueId) {
        this.soldToUniqueId = soldToUniqueId;
    }


    /**
     * Gets the soldToName value for this MoveDeviceRequestType.
     * 
     * @return soldToName
     */
    public java.lang.String getSoldToName() {
        return soldToName;
    }


    /**
     * Sets the soldToName value for this MoveDeviceRequestType.
     * 
     * @param soldToName
     */
    public void setSoldToName(java.lang.String soldToName) {
        this.soldToName = soldToName;
    }


    /**
     * Gets the poolEntitlements value for this MoveDeviceRequestType.
     * 
     * @return poolEntitlements
     */
    public java.lang.Boolean getPoolEntitlements() {
        return poolEntitlements;
    }


    /**
     * Sets the poolEntitlements value for this MoveDeviceRequestType.
     * 
     * @param poolEntitlements
     */
    public void setPoolEntitlements(java.lang.Boolean poolEntitlements) {
        this.poolEntitlements = poolEntitlements;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoveDeviceRequestType)) return false;
        MoveDeviceRequestType other = (MoveDeviceRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sourceDevices==null && other.getSourceDevices()==null) || 
             (this.sourceDevices!=null &&
              this.sourceDevices.equals(other.getSourceDevices()))) &&
            ((this.soldToUniqueId==null && other.getSoldToUniqueId()==null) || 
             (this.soldToUniqueId!=null &&
              this.soldToUniqueId.equals(other.getSoldToUniqueId()))) &&
            ((this.soldToName==null && other.getSoldToName()==null) || 
             (this.soldToName!=null &&
              this.soldToName.equals(other.getSoldToName()))) &&
            ((this.poolEntitlements==null && other.getPoolEntitlements()==null) || 
             (this.poolEntitlements!=null &&
              this.poolEntitlements.equals(other.getPoolEntitlements())));
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
        if (getSourceDevices() != null) {
            _hashCode += getSourceDevices().hashCode();
        }
        if (getSoldToUniqueId() != null) {
            _hashCode += getSoldToUniqueId().hashCode();
        }
        if (getSoldToName() != null) {
            _hashCode += getSoldToName().hashCode();
        }
        if (getPoolEntitlements() != null) {
            _hashCode += getPoolEntitlements().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoveDeviceRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "moveDeviceRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "sourceDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "moveDeviceList"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldToUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "soldToUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldToName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "soldToName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poolEntitlements");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "poolEntitlements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
