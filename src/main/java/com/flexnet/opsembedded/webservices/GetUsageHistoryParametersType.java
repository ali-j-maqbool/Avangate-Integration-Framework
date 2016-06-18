/**
 * GetUsageHistoryParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GetUsageHistoryParametersType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.DateTimeQueryType updateTime;

    private com.flexnet.opsembedded.webservices.ExternalIdQueryType serverUniqueId;

    private com.flexnet.opsembedded.webservices.SimpleQueryType serverId;

    private com.flexnet.opsembedded.webservices.ExternalIdQueryType deviceUniqueId;

    private com.flexnet.opsembedded.webservices.SimpleQueryType deviceId;

    private com.flexnet.opsembedded.webservices.SimpleQueryType alias;

    private com.flexnet.opsembedded.webservices.SimpleQueryType hostTypeName;

    private com.flexnet.opsembedded.webservices.SimpleQueryType featureName;

    private com.flexnet.opsembedded.webservices.SimpleQueryType featureVersion;

    private com.flexnet.opsembedded.webservices.NumberQueryType featureCount;

    private com.flexnet.opsembedded.webservices.NumberQueryType featureOverage;

    private com.flexnet.opsembedded.webservices.DeviceMachineTypeQueryType machineType;

    public GetUsageHistoryParametersType() {
    }

    public GetUsageHistoryParametersType(
           com.flexnet.opsembedded.webservices.DateTimeQueryType updateTime,
           com.flexnet.opsembedded.webservices.ExternalIdQueryType serverUniqueId,
           com.flexnet.opsembedded.webservices.SimpleQueryType serverId,
           com.flexnet.opsembedded.webservices.ExternalIdQueryType deviceUniqueId,
           com.flexnet.opsembedded.webservices.SimpleQueryType deviceId,
           com.flexnet.opsembedded.webservices.SimpleQueryType alias,
           com.flexnet.opsembedded.webservices.SimpleQueryType hostTypeName,
           com.flexnet.opsembedded.webservices.SimpleQueryType featureName,
           com.flexnet.opsembedded.webservices.SimpleQueryType featureVersion,
           com.flexnet.opsembedded.webservices.NumberQueryType featureCount,
           com.flexnet.opsembedded.webservices.NumberQueryType featureOverage,
           com.flexnet.opsembedded.webservices.DeviceMachineTypeQueryType machineType) {
           this.updateTime = updateTime;
           this.serverUniqueId = serverUniqueId;
           this.serverId = serverId;
           this.deviceUniqueId = deviceUniqueId;
           this.deviceId = deviceId;
           this.alias = alias;
           this.hostTypeName = hostTypeName;
           this.featureName = featureName;
           this.featureVersion = featureVersion;
           this.featureCount = featureCount;
           this.featureOverage = featureOverage;
           this.machineType = machineType;
    }


    /**
     * Gets the updateTime value for this GetUsageHistoryParametersType.
     * 
     * @return updateTime
     */
    public com.flexnet.opsembedded.webservices.DateTimeQueryType getUpdateTime() {
        return updateTime;
    }


    /**
     * Sets the updateTime value for this GetUsageHistoryParametersType.
     * 
     * @param updateTime
     */
    public void setUpdateTime(com.flexnet.opsembedded.webservices.DateTimeQueryType updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * Gets the serverUniqueId value for this GetUsageHistoryParametersType.
     * 
     * @return serverUniqueId
     */
    public com.flexnet.opsembedded.webservices.ExternalIdQueryType getServerUniqueId() {
        return serverUniqueId;
    }


    /**
     * Sets the serverUniqueId value for this GetUsageHistoryParametersType.
     * 
     * @param serverUniqueId
     */
    public void setServerUniqueId(com.flexnet.opsembedded.webservices.ExternalIdQueryType serverUniqueId) {
        this.serverUniqueId = serverUniqueId;
    }


    /**
     * Gets the serverId value for this GetUsageHistoryParametersType.
     * 
     * @return serverId
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getServerId() {
        return serverId;
    }


    /**
     * Sets the serverId value for this GetUsageHistoryParametersType.
     * 
     * @param serverId
     */
    public void setServerId(com.flexnet.opsembedded.webservices.SimpleQueryType serverId) {
        this.serverId = serverId;
    }


    /**
     * Gets the deviceUniqueId value for this GetUsageHistoryParametersType.
     * 
     * @return deviceUniqueId
     */
    public com.flexnet.opsembedded.webservices.ExternalIdQueryType getDeviceUniqueId() {
        return deviceUniqueId;
    }


    /**
     * Sets the deviceUniqueId value for this GetUsageHistoryParametersType.
     * 
     * @param deviceUniqueId
     */
    public void setDeviceUniqueId(com.flexnet.opsembedded.webservices.ExternalIdQueryType deviceUniqueId) {
        this.deviceUniqueId = deviceUniqueId;
    }


    /**
     * Gets the deviceId value for this GetUsageHistoryParametersType.
     * 
     * @return deviceId
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this GetUsageHistoryParametersType.
     * 
     * @param deviceId
     */
    public void setDeviceId(com.flexnet.opsembedded.webservices.SimpleQueryType deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the alias value for this GetUsageHistoryParametersType.
     * 
     * @return alias
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this GetUsageHistoryParametersType.
     * 
     * @param alias
     */
    public void setAlias(com.flexnet.opsembedded.webservices.SimpleQueryType alias) {
        this.alias = alias;
    }


    /**
     * Gets the hostTypeName value for this GetUsageHistoryParametersType.
     * 
     * @return hostTypeName
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getHostTypeName() {
        return hostTypeName;
    }


    /**
     * Sets the hostTypeName value for this GetUsageHistoryParametersType.
     * 
     * @param hostTypeName
     */
    public void setHostTypeName(com.flexnet.opsembedded.webservices.SimpleQueryType hostTypeName) {
        this.hostTypeName = hostTypeName;
    }


    /**
     * Gets the featureName value for this GetUsageHistoryParametersType.
     * 
     * @return featureName
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getFeatureName() {
        return featureName;
    }


    /**
     * Sets the featureName value for this GetUsageHistoryParametersType.
     * 
     * @param featureName
     */
    public void setFeatureName(com.flexnet.opsembedded.webservices.SimpleQueryType featureName) {
        this.featureName = featureName;
    }


    /**
     * Gets the featureVersion value for this GetUsageHistoryParametersType.
     * 
     * @return featureVersion
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getFeatureVersion() {
        return featureVersion;
    }


    /**
     * Sets the featureVersion value for this GetUsageHistoryParametersType.
     * 
     * @param featureVersion
     */
    public void setFeatureVersion(com.flexnet.opsembedded.webservices.SimpleQueryType featureVersion) {
        this.featureVersion = featureVersion;
    }


    /**
     * Gets the featureCount value for this GetUsageHistoryParametersType.
     * 
     * @return featureCount
     */
    public com.flexnet.opsembedded.webservices.NumberQueryType getFeatureCount() {
        return featureCount;
    }


    /**
     * Sets the featureCount value for this GetUsageHistoryParametersType.
     * 
     * @param featureCount
     */
    public void setFeatureCount(com.flexnet.opsembedded.webservices.NumberQueryType featureCount) {
        this.featureCount = featureCount;
    }


    /**
     * Gets the featureOverage value for this GetUsageHistoryParametersType.
     * 
     * @return featureOverage
     */
    public com.flexnet.opsembedded.webservices.NumberQueryType getFeatureOverage() {
        return featureOverage;
    }


    /**
     * Sets the featureOverage value for this GetUsageHistoryParametersType.
     * 
     * @param featureOverage
     */
    public void setFeatureOverage(com.flexnet.opsembedded.webservices.NumberQueryType featureOverage) {
        this.featureOverage = featureOverage;
    }


    /**
     * Gets the machineType value for this GetUsageHistoryParametersType.
     * 
     * @return machineType
     */
    public com.flexnet.opsembedded.webservices.DeviceMachineTypeQueryType getMachineType() {
        return machineType;
    }


    /**
     * Sets the machineType value for this GetUsageHistoryParametersType.
     * 
     * @param machineType
     */
    public void setMachineType(com.flexnet.opsembedded.webservices.DeviceMachineTypeQueryType machineType) {
        this.machineType = machineType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUsageHistoryParametersType)) return false;
        GetUsageHistoryParametersType other = (GetUsageHistoryParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateTime==null && other.getUpdateTime()==null) || 
             (this.updateTime!=null &&
              this.updateTime.equals(other.getUpdateTime()))) &&
            ((this.serverUniqueId==null && other.getServerUniqueId()==null) || 
             (this.serverUniqueId!=null &&
              this.serverUniqueId.equals(other.getServerUniqueId()))) &&
            ((this.serverId==null && other.getServerId()==null) || 
             (this.serverId!=null &&
              this.serverId.equals(other.getServerId()))) &&
            ((this.deviceUniqueId==null && other.getDeviceUniqueId()==null) || 
             (this.deviceUniqueId!=null &&
              this.deviceUniqueId.equals(other.getDeviceUniqueId()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.hostTypeName==null && other.getHostTypeName()==null) || 
             (this.hostTypeName!=null &&
              this.hostTypeName.equals(other.getHostTypeName()))) &&
            ((this.featureName==null && other.getFeatureName()==null) || 
             (this.featureName!=null &&
              this.featureName.equals(other.getFeatureName()))) &&
            ((this.featureVersion==null && other.getFeatureVersion()==null) || 
             (this.featureVersion!=null &&
              this.featureVersion.equals(other.getFeatureVersion()))) &&
            ((this.featureCount==null && other.getFeatureCount()==null) || 
             (this.featureCount!=null &&
              this.featureCount.equals(other.getFeatureCount()))) &&
            ((this.featureOverage==null && other.getFeatureOverage()==null) || 
             (this.featureOverage!=null &&
              this.featureOverage.equals(other.getFeatureOverage()))) &&
            ((this.machineType==null && other.getMachineType()==null) || 
             (this.machineType!=null &&
              this.machineType.equals(other.getMachineType())));
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
        if (getUpdateTime() != null) {
            _hashCode += getUpdateTime().hashCode();
        }
        if (getServerUniqueId() != null) {
            _hashCode += getServerUniqueId().hashCode();
        }
        if (getServerId() != null) {
            _hashCode += getServerId().hashCode();
        }
        if (getDeviceUniqueId() != null) {
            _hashCode += getDeviceUniqueId().hashCode();
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getHostTypeName() != null) {
            _hashCode += getHostTypeName().hashCode();
        }
        if (getFeatureName() != null) {
            _hashCode += getFeatureName().hashCode();
        }
        if (getFeatureVersion() != null) {
            _hashCode += getFeatureVersion().hashCode();
        }
        if (getFeatureCount() != null) {
            _hashCode += getFeatureCount().hashCode();
        }
        if (getFeatureOverage() != null) {
            _hashCode += getFeatureOverage().hashCode();
        }
        if (getMachineType() != null) {
            _hashCode += getMachineType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUsageHistoryParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageHistoryParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "serverUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "ExternalIdQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "serverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "ExternalIdQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "hostTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "NumberQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureOverage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureOverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "NumberQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "machineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DeviceMachineTypeQueryType"));
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
