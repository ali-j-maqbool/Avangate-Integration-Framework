/**
 * DeviceDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class DeviceDataType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.CreateDeviceIdentifier deviceIdentifier;

    private com.flexnet.opsembedded.webservices.HostTypeIdentifier hostTypeName;

    private com.flexnet.opsembedded.webservices.PublisherIdentifier publisherIdName;

    private java.lang.String description;

    private com.flexnet.opsembedded.webservices.ChannelPartnerDataListType channelPartners;

    private com.flexnet.opsembedded.webservices.AttributeDescriptorDataType customAttributes;

    private java.lang.String alias;

    public DeviceDataType() {
    }

    public DeviceDataType(
           com.flexnet.opsembedded.webservices.CreateDeviceIdentifier deviceIdentifier,
           com.flexnet.opsembedded.webservices.HostTypeIdentifier hostTypeName,
           com.flexnet.opsembedded.webservices.PublisherIdentifier publisherIdName,
           java.lang.String description,
           com.flexnet.opsembedded.webservices.ChannelPartnerDataListType channelPartners,
           com.flexnet.opsembedded.webservices.AttributeDescriptorDataType customAttributes,
           java.lang.String alias) {
           this.deviceIdentifier = deviceIdentifier;
           this.hostTypeName = hostTypeName;
           this.publisherIdName = publisherIdName;
           this.description = description;
           this.channelPartners = channelPartners;
           this.customAttributes = customAttributes;
           this.alias = alias;
    }


    /**
     * Gets the deviceIdentifier value for this DeviceDataType.
     * 
     * @return deviceIdentifier
     */
    public com.flexnet.opsembedded.webservices.CreateDeviceIdentifier getDeviceIdentifier() {
        return deviceIdentifier;
    }


    /**
     * Sets the deviceIdentifier value for this DeviceDataType.
     * 
     * @param deviceIdentifier
     */
    public void setDeviceIdentifier(com.flexnet.opsembedded.webservices.CreateDeviceIdentifier deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }


    /**
     * Gets the hostTypeName value for this DeviceDataType.
     * 
     * @return hostTypeName
     */
    public com.flexnet.opsembedded.webservices.HostTypeIdentifier getHostTypeName() {
        return hostTypeName;
    }


    /**
     * Sets the hostTypeName value for this DeviceDataType.
     * 
     * @param hostTypeName
     */
    public void setHostTypeName(com.flexnet.opsembedded.webservices.HostTypeIdentifier hostTypeName) {
        this.hostTypeName = hostTypeName;
    }


    /**
     * Gets the publisherIdName value for this DeviceDataType.
     * 
     * @return publisherIdName
     */
    public com.flexnet.opsembedded.webservices.PublisherIdentifier getPublisherIdName() {
        return publisherIdName;
    }


    /**
     * Sets the publisherIdName value for this DeviceDataType.
     * 
     * @param publisherIdName
     */
    public void setPublisherIdName(com.flexnet.opsembedded.webservices.PublisherIdentifier publisherIdName) {
        this.publisherIdName = publisherIdName;
    }


    /**
     * Gets the description value for this DeviceDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DeviceDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the channelPartners value for this DeviceDataType.
     * 
     * @return channelPartners
     */
    public com.flexnet.opsembedded.webservices.ChannelPartnerDataListType getChannelPartners() {
        return channelPartners;
    }


    /**
     * Sets the channelPartners value for this DeviceDataType.
     * 
     * @param channelPartners
     */
    public void setChannelPartners(com.flexnet.opsembedded.webservices.ChannelPartnerDataListType channelPartners) {
        this.channelPartners = channelPartners;
    }


    /**
     * Gets the customAttributes value for this DeviceDataType.
     * 
     * @return customAttributes
     */
    public com.flexnet.opsembedded.webservices.AttributeDescriptorDataType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this DeviceDataType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.opsembedded.webservices.AttributeDescriptorDataType customAttributes) {
        this.customAttributes = customAttributes;
    }


    /**
     * Gets the alias value for this DeviceDataType.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this DeviceDataType.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceDataType)) return false;
        DeviceDataType other = (DeviceDataType) obj;
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
            ((this.hostTypeName==null && other.getHostTypeName()==null) || 
             (this.hostTypeName!=null &&
              this.hostTypeName.equals(other.getHostTypeName()))) &&
            ((this.publisherIdName==null && other.getPublisherIdName()==null) || 
             (this.publisherIdName!=null &&
              this.publisherIdName.equals(other.getPublisherIdName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.channelPartners==null && other.getChannelPartners()==null) || 
             (this.channelPartners!=null &&
              this.channelPartners.equals(other.getChannelPartners()))) &&
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
        if (getHostTypeName() != null) {
            _hashCode += getHostTypeName().hashCode();
        }
        if (getPublisherIdName() != null) {
            _hashCode += getPublisherIdName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getChannelPartners() != null) {
            _hashCode += getChannelPartners().hashCode();
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
        new org.apache.axis.description.TypeDesc(DeviceDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createDeviceIdentifier"));
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
        elemField.setFieldName("channelPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "channelPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "channelPartnerDataListType"));
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
