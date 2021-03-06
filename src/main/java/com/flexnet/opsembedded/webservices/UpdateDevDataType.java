/**
 * UpdateDevDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class UpdateDevDataType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier;

    private java.lang.String deviceId;

    private com.flexnet.opsembedded.webservices.ServerIdsType serverIds;

    private com.flexnet.opsembedded.webservices.DeviceIdTypeType deviceIdType;

    private com.flexnet.opsembedded.webservices.HostTypeIdentifier hostTypeName;

    private com.flexnet.opsembedded.webservices.PublisherIdentifier publisherIdName;

    private java.lang.String description;

    private com.flexnet.opsembedded.webservices.UpdateChannelPartnerDataListType updateChannelPartners;

    private com.flexnet.opsembedded.webservices.AttributeDescriptorDataType customAttributes;

    private java.lang.String alias;

    public UpdateDevDataType() {
    }

    public UpdateDevDataType(
           com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier,
           java.lang.String deviceId,
           com.flexnet.opsembedded.webservices.ServerIdsType serverIds,
           com.flexnet.opsembedded.webservices.DeviceIdTypeType deviceIdType,
           com.flexnet.opsembedded.webservices.HostTypeIdentifier hostTypeName,
           com.flexnet.opsembedded.webservices.PublisherIdentifier publisherIdName,
           java.lang.String description,
           com.flexnet.opsembedded.webservices.UpdateChannelPartnerDataListType updateChannelPartners,
           com.flexnet.opsembedded.webservices.AttributeDescriptorDataType customAttributes,
           java.lang.String alias) {
           this.deviceIdentifier = deviceIdentifier;
           this.deviceId = deviceId;
           this.serverIds = serverIds;
           this.deviceIdType = deviceIdType;
           this.hostTypeName = hostTypeName;
           this.publisherIdName = publisherIdName;
           this.description = description;
           this.updateChannelPartners = updateChannelPartners;
           this.customAttributes = customAttributes;
           this.alias = alias;
    }


    /**
     * Gets the deviceIdentifier value for this UpdateDevDataType.
     * 
     * @return deviceIdentifier
     */
    public com.flexnet.opsembedded.webservices.DeviceIdentifier getDeviceIdentifier() {
        return deviceIdentifier;
    }


    /**
     * Sets the deviceIdentifier value for this UpdateDevDataType.
     * 
     * @param deviceIdentifier
     */
    public void setDeviceIdentifier(com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }


    /**
     * Gets the deviceId value for this UpdateDevDataType.
     * 
     * @return deviceId
     */
    public java.lang.String getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this UpdateDevDataType.
     * 
     * @param deviceId
     */
    public void setDeviceId(java.lang.String deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the serverIds value for this UpdateDevDataType.
     * 
     * @return serverIds
     */
    public com.flexnet.opsembedded.webservices.ServerIdsType getServerIds() {
        return serverIds;
    }


    /**
     * Sets the serverIds value for this UpdateDevDataType.
     * 
     * @param serverIds
     */
    public void setServerIds(com.flexnet.opsembedded.webservices.ServerIdsType serverIds) {
        this.serverIds = serverIds;
    }


    /**
     * Gets the deviceIdType value for this UpdateDevDataType.
     * 
     * @return deviceIdType
     */
    public com.flexnet.opsembedded.webservices.DeviceIdTypeType getDeviceIdType() {
        return deviceIdType;
    }


    /**
     * Sets the deviceIdType value for this UpdateDevDataType.
     * 
     * @param deviceIdType
     */
    public void setDeviceIdType(com.flexnet.opsembedded.webservices.DeviceIdTypeType deviceIdType) {
        this.deviceIdType = deviceIdType;
    }


    /**
     * Gets the hostTypeName value for this UpdateDevDataType.
     * 
     * @return hostTypeName
     */
    public com.flexnet.opsembedded.webservices.HostTypeIdentifier getHostTypeName() {
        return hostTypeName;
    }


    /**
     * Sets the hostTypeName value for this UpdateDevDataType.
     * 
     * @param hostTypeName
     */
    public void setHostTypeName(com.flexnet.opsembedded.webservices.HostTypeIdentifier hostTypeName) {
        this.hostTypeName = hostTypeName;
    }


    /**
     * Gets the publisherIdName value for this UpdateDevDataType.
     * 
     * @return publisherIdName
     */
    public com.flexnet.opsembedded.webservices.PublisherIdentifier getPublisherIdName() {
        return publisherIdName;
    }


    /**
     * Sets the publisherIdName value for this UpdateDevDataType.
     * 
     * @param publisherIdName
     */
    public void setPublisherIdName(com.flexnet.opsembedded.webservices.PublisherIdentifier publisherIdName) {
        this.publisherIdName = publisherIdName;
    }


    /**
     * Gets the description value for this UpdateDevDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UpdateDevDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the updateChannelPartners value for this UpdateDevDataType.
     * 
     * @return updateChannelPartners
     */
    public com.flexnet.opsembedded.webservices.UpdateChannelPartnerDataListType getUpdateChannelPartners() {
        return updateChannelPartners;
    }


    /**
     * Sets the updateChannelPartners value for this UpdateDevDataType.
     * 
     * @param updateChannelPartners
     */
    public void setUpdateChannelPartners(com.flexnet.opsembedded.webservices.UpdateChannelPartnerDataListType updateChannelPartners) {
        this.updateChannelPartners = updateChannelPartners;
    }


    /**
     * Gets the customAttributes value for this UpdateDevDataType.
     * 
     * @return customAttributes
     */
    public com.flexnet.opsembedded.webservices.AttributeDescriptorDataType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this UpdateDevDataType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.opsembedded.webservices.AttributeDescriptorDataType customAttributes) {
        this.customAttributes = customAttributes;
    }


    /**
     * Gets the alias value for this UpdateDevDataType.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this UpdateDevDataType.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateDevDataType)) return false;
        UpdateDevDataType other = (UpdateDevDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceIdentifier==null && other.getDeviceIdentifier()==null) || 
             (this.deviceIdentifier!=null &&
              this.deviceIdentifier.equals(other.getDeviceIdentifier()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.serverIds==null && other.getServerIds()==null) || 
             (this.serverIds!=null &&
              this.serverIds.equals(other.getServerIds()))) &&
            ((this.deviceIdType==null && other.getDeviceIdType()==null) || 
             (this.deviceIdType!=null &&
              this.deviceIdType.equals(other.getDeviceIdType()))) &&
            ((this.hostTypeName==null && other.getHostTypeName()==null) || 
             (this.hostTypeName!=null &&
              this.hostTypeName.equals(other.getHostTypeName()))) &&
            ((this.publisherIdName==null && other.getPublisherIdName()==null) || 
             (this.publisherIdName!=null &&
              this.publisherIdName.equals(other.getPublisherIdName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.updateChannelPartners==null && other.getUpdateChannelPartners()==null) || 
             (this.updateChannelPartners!=null &&
              this.updateChannelPartners.equals(other.getUpdateChannelPartners()))) &&
            ((this.customAttributes==null && other.getCustomAttributes()==null) || 
             (this.customAttributes!=null &&
              this.customAttributes.equals(other.getCustomAttributes()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias())));
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
        if (getDeviceIdentifier() != null) {
            _hashCode += getDeviceIdentifier().hashCode();
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
        if (getHostTypeName() != null) {
            _hashCode += getHostTypeName().hashCode();
        }
        if (getPublisherIdName() != null) {
            _hashCode += getPublisherIdName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getUpdateChannelPartners() != null) {
            _hashCode += getUpdateChannelPartners().hashCode();
        }
        if (getCustomAttributes() != null) {
            _hashCode += getCustomAttributes().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateDevDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateDevDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
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
        elemField.setFieldName("hostTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "hostTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "hostTypeIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherIdName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "publisherIdName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "publisherIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateChannelPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateChannelPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateChannelPartnerDataListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "customAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "attributeDescriptorDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "alias"));
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
