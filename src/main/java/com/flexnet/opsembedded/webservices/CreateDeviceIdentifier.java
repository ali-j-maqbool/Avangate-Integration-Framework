/**
 * CreateDeviceIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class CreateDeviceIdentifier  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.WSDeviceType deviceType;

    private java.lang.String deviceId;

    private com.flexnet.opsembedded.webservices.ServerIdsType serverIds;

    private com.flexnet.opsembedded.webservices.DeviceIdTypeType deviceIdType;

    private java.lang.String publisherName;

    public CreateDeviceIdentifier() {
    }

    public CreateDeviceIdentifier(
           com.flexnet.opsembedded.webservices.WSDeviceType deviceType,
           java.lang.String deviceId,
           com.flexnet.opsembedded.webservices.ServerIdsType serverIds,
           com.flexnet.opsembedded.webservices.DeviceIdTypeType deviceIdType,
           java.lang.String publisherName) {
           this.deviceType = deviceType;
           this.deviceId = deviceId;
           this.serverIds = serverIds;
           this.deviceIdType = deviceIdType;
           this.publisherName = publisherName;
    }


    /**
     * Gets the deviceType value for this CreateDeviceIdentifier.
     * 
     * @return deviceType
     */
    public com.flexnet.opsembedded.webservices.WSDeviceType getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this CreateDeviceIdentifier.
     * 
     * @param deviceType
     */
    public void setDeviceType(com.flexnet.opsembedded.webservices.WSDeviceType deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the deviceId value for this CreateDeviceIdentifier.
     * 
     * @return deviceId
     */
    public java.lang.String getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this CreateDeviceIdentifier.
     * 
     * @param deviceId
     */
    public void setDeviceId(java.lang.String deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the serverIds value for this CreateDeviceIdentifier.
     * 
     * @return serverIds
     */
    public com.flexnet.opsembedded.webservices.ServerIdsType getServerIds() {
        return serverIds;
    }


    /**
     * Sets the serverIds value for this CreateDeviceIdentifier.
     * 
     * @param serverIds
     */
    public void setServerIds(com.flexnet.opsembedded.webservices.ServerIdsType serverIds) {
        this.serverIds = serverIds;
    }


    /**
     * Gets the deviceIdType value for this CreateDeviceIdentifier.
     * 
     * @return deviceIdType
     */
    public com.flexnet.opsembedded.webservices.DeviceIdTypeType getDeviceIdType() {
        return deviceIdType;
    }


    /**
     * Sets the deviceIdType value for this CreateDeviceIdentifier.
     * 
     * @param deviceIdType
     */
    public void setDeviceIdType(com.flexnet.opsembedded.webservices.DeviceIdTypeType deviceIdType) {
        this.deviceIdType = deviceIdType;
    }


    /**
     * Gets the publisherName value for this CreateDeviceIdentifier.
     * 
     * @return publisherName
     */
    public java.lang.String getPublisherName() {
        return publisherName;
    }


    /**
     * Sets the publisherName value for this CreateDeviceIdentifier.
     * 
     * @param publisherName
     */
    public void setPublisherName(java.lang.String publisherName) {
        this.publisherName = publisherName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateDeviceIdentifier)) return false;
        CreateDeviceIdentifier other = (CreateDeviceIdentifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.serverIds==null && other.getServerIds()==null) || 
             (this.serverIds!=null &&
              this.serverIds.equals(other.getServerIds()))) &&
            ((this.deviceIdType==null && other.getDeviceIdType()==null) || 
             (this.deviceIdType!=null &&
              this.deviceIdType.equals(other.getDeviceIdType()))) &&
            ((this.publisherName==null && other.getPublisherName()==null) || 
             (this.publisherName!=null &&
              this.publisherName.equals(other.getPublisherName())));
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
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getServerIds() != null) {
            _hashCode += getServerIds().hashCode();
        }
        if (getDeviceIdType() != null) {
            _hashCode += getDeviceIdType().hashCode();
        }
        if (getPublisherName() != null) {
            _hashCode += getPublisherName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateDeviceIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createDeviceIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "WSDeviceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "serverIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "ServerIdsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "publisherName"));
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
