/**
 * UsageSummaryDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class UsageSummaryDataType  implements java.io.Serializable {
    private java.lang.String summaryTimeUniqueId;

    private java.util.Calendar summaryTime;

    private com.flexnet.opsembedded.webservices.DeviceIdentifier server;

    private java.lang.String serverAlias;

    private java.util.Calendar serverLastSyncTime;

    private java.lang.String entitlementUniqueId;

    private java.lang.String entitlementId;

    private java.lang.String activationUniqueId;

    private java.lang.String activationId;

    private java.lang.String featureUniqueId;

    private java.lang.String featureName;

    private java.lang.String featureVersion;

    private java.math.BigInteger orderedCount;

    private java.math.BigInteger usedCount;

    private java.math.BigInteger provisionedCount;

    public UsageSummaryDataType() {
    }

    public UsageSummaryDataType(
           java.lang.String summaryTimeUniqueId,
           java.util.Calendar summaryTime,
           com.flexnet.opsembedded.webservices.DeviceIdentifier server,
           java.lang.String serverAlias,
           java.util.Calendar serverLastSyncTime,
           java.lang.String entitlementUniqueId,
           java.lang.String entitlementId,
           java.lang.String activationUniqueId,
           java.lang.String activationId,
           java.lang.String featureUniqueId,
           java.lang.String featureName,
           java.lang.String featureVersion,
           java.math.BigInteger orderedCount,
           java.math.BigInteger usedCount,
           java.math.BigInteger provisionedCount) {
           this.summaryTimeUniqueId = summaryTimeUniqueId;
           this.summaryTime = summaryTime;
           this.server = server;
           this.serverAlias = serverAlias;
           this.serverLastSyncTime = serverLastSyncTime;
           this.entitlementUniqueId = entitlementUniqueId;
           this.entitlementId = entitlementId;
           this.activationUniqueId = activationUniqueId;
           this.activationId = activationId;
           this.featureUniqueId = featureUniqueId;
           this.featureName = featureName;
           this.featureVersion = featureVersion;
           this.orderedCount = orderedCount;
           this.usedCount = usedCount;
           this.provisionedCount = provisionedCount;
    }


    /**
     * Gets the summaryTimeUniqueId value for this UsageSummaryDataType.
     * 
     * @return summaryTimeUniqueId
     */
    public java.lang.String getSummaryTimeUniqueId() {
        return summaryTimeUniqueId;
    }


    /**
     * Sets the summaryTimeUniqueId value for this UsageSummaryDataType.
     * 
     * @param summaryTimeUniqueId
     */
    public void setSummaryTimeUniqueId(java.lang.String summaryTimeUniqueId) {
        this.summaryTimeUniqueId = summaryTimeUniqueId;
    }


    /**
     * Gets the summaryTime value for this UsageSummaryDataType.
     * 
     * @return summaryTime
     */
    public java.util.Calendar getSummaryTime() {
        return summaryTime;
    }


    /**
     * Sets the summaryTime value for this UsageSummaryDataType.
     * 
     * @param summaryTime
     */
    public void setSummaryTime(java.util.Calendar summaryTime) {
        this.summaryTime = summaryTime;
    }


    /**
     * Gets the server value for this UsageSummaryDataType.
     * 
     * @return server
     */
    public com.flexnet.opsembedded.webservices.DeviceIdentifier getServer() {
        return server;
    }


    /**
     * Sets the server value for this UsageSummaryDataType.
     * 
     * @param server
     */
    public void setServer(com.flexnet.opsembedded.webservices.DeviceIdentifier server) {
        this.server = server;
    }


    /**
     * Gets the serverAlias value for this UsageSummaryDataType.
     * 
     * @return serverAlias
     */
    public java.lang.String getServerAlias() {
        return serverAlias;
    }


    /**
     * Sets the serverAlias value for this UsageSummaryDataType.
     * 
     * @param serverAlias
     */
    public void setServerAlias(java.lang.String serverAlias) {
        this.serverAlias = serverAlias;
    }


    /**
     * Gets the serverLastSyncTime value for this UsageSummaryDataType.
     * 
     * @return serverLastSyncTime
     */
    public java.util.Calendar getServerLastSyncTime() {
        return serverLastSyncTime;
    }


    /**
     * Sets the serverLastSyncTime value for this UsageSummaryDataType.
     * 
     * @param serverLastSyncTime
     */
    public void setServerLastSyncTime(java.util.Calendar serverLastSyncTime) {
        this.serverLastSyncTime = serverLastSyncTime;
    }


    /**
     * Gets the entitlementUniqueId value for this UsageSummaryDataType.
     * 
     * @return entitlementUniqueId
     */
    public java.lang.String getEntitlementUniqueId() {
        return entitlementUniqueId;
    }


    /**
     * Sets the entitlementUniqueId value for this UsageSummaryDataType.
     * 
     * @param entitlementUniqueId
     */
    public void setEntitlementUniqueId(java.lang.String entitlementUniqueId) {
        this.entitlementUniqueId = entitlementUniqueId;
    }


    /**
     * Gets the entitlementId value for this UsageSummaryDataType.
     * 
     * @return entitlementId
     */
    public java.lang.String getEntitlementId() {
        return entitlementId;
    }


    /**
     * Sets the entitlementId value for this UsageSummaryDataType.
     * 
     * @param entitlementId
     */
    public void setEntitlementId(java.lang.String entitlementId) {
        this.entitlementId = entitlementId;
    }


    /**
     * Gets the activationUniqueId value for this UsageSummaryDataType.
     * 
     * @return activationUniqueId
     */
    public java.lang.String getActivationUniqueId() {
        return activationUniqueId;
    }


    /**
     * Sets the activationUniqueId value for this UsageSummaryDataType.
     * 
     * @param activationUniqueId
     */
    public void setActivationUniqueId(java.lang.String activationUniqueId) {
        this.activationUniqueId = activationUniqueId;
    }


    /**
     * Gets the activationId value for this UsageSummaryDataType.
     * 
     * @return activationId
     */
    public java.lang.String getActivationId() {
        return activationId;
    }


    /**
     * Sets the activationId value for this UsageSummaryDataType.
     * 
     * @param activationId
     */
    public void setActivationId(java.lang.String activationId) {
        this.activationId = activationId;
    }


    /**
     * Gets the featureUniqueId value for this UsageSummaryDataType.
     * 
     * @return featureUniqueId
     */
    public java.lang.String getFeatureUniqueId() {
        return featureUniqueId;
    }


    /**
     * Sets the featureUniqueId value for this UsageSummaryDataType.
     * 
     * @param featureUniqueId
     */
    public void setFeatureUniqueId(java.lang.String featureUniqueId) {
        this.featureUniqueId = featureUniqueId;
    }


    /**
     * Gets the featureName value for this UsageSummaryDataType.
     * 
     * @return featureName
     */
    public java.lang.String getFeatureName() {
        return featureName;
    }


    /**
     * Sets the featureName value for this UsageSummaryDataType.
     * 
     * @param featureName
     */
    public void setFeatureName(java.lang.String featureName) {
        this.featureName = featureName;
    }


    /**
     * Gets the featureVersion value for this UsageSummaryDataType.
     * 
     * @return featureVersion
     */
    public java.lang.String getFeatureVersion() {
        return featureVersion;
    }


    /**
     * Sets the featureVersion value for this UsageSummaryDataType.
     * 
     * @param featureVersion
     */
    public void setFeatureVersion(java.lang.String featureVersion) {
        this.featureVersion = featureVersion;
    }


    /**
     * Gets the orderedCount value for this UsageSummaryDataType.
     * 
     * @return orderedCount
     */
    public java.math.BigInteger getOrderedCount() {
        return orderedCount;
    }


    /**
     * Sets the orderedCount value for this UsageSummaryDataType.
     * 
     * @param orderedCount
     */
    public void setOrderedCount(java.math.BigInteger orderedCount) {
        this.orderedCount = orderedCount;
    }


    /**
     * Gets the usedCount value for this UsageSummaryDataType.
     * 
     * @return usedCount
     */
    public java.math.BigInteger getUsedCount() {
        return usedCount;
    }


    /**
     * Sets the usedCount value for this UsageSummaryDataType.
     * 
     * @param usedCount
     */
    public void setUsedCount(java.math.BigInteger usedCount) {
        this.usedCount = usedCount;
    }


    /**
     * Gets the provisionedCount value for this UsageSummaryDataType.
     * 
     * @return provisionedCount
     */
    public java.math.BigInteger getProvisionedCount() {
        return provisionedCount;
    }


    /**
     * Sets the provisionedCount value for this UsageSummaryDataType.
     * 
     * @param provisionedCount
     */
    public void setProvisionedCount(java.math.BigInteger provisionedCount) {
        this.provisionedCount = provisionedCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsageSummaryDataType)) return false;
        UsageSummaryDataType other = (UsageSummaryDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.summaryTimeUniqueId==null && other.getSummaryTimeUniqueId()==null) || 
             (this.summaryTimeUniqueId!=null &&
              this.summaryTimeUniqueId.equals(other.getSummaryTimeUniqueId()))) &&
            ((this.summaryTime==null && other.getSummaryTime()==null) || 
             (this.summaryTime!=null &&
              this.summaryTime.equals(other.getSummaryTime()))) &&
            ((this.server==null && other.getServer()==null) || 
             (this.server!=null &&
              this.server.equals(other.getServer()))) &&
            ((this.serverAlias==null && other.getServerAlias()==null) || 
             (this.serverAlias!=null &&
              this.serverAlias.equals(other.getServerAlias()))) &&
            ((this.serverLastSyncTime==null && other.getServerLastSyncTime()==null) || 
             (this.serverLastSyncTime!=null &&
              this.serverLastSyncTime.equals(other.getServerLastSyncTime()))) &&
            ((this.entitlementUniqueId==null && other.getEntitlementUniqueId()==null) || 
             (this.entitlementUniqueId!=null &&
              this.entitlementUniqueId.equals(other.getEntitlementUniqueId()))) &&
            ((this.entitlementId==null && other.getEntitlementId()==null) || 
             (this.entitlementId!=null &&
              this.entitlementId.equals(other.getEntitlementId()))) &&
            ((this.activationUniqueId==null && other.getActivationUniqueId()==null) || 
             (this.activationUniqueId!=null &&
              this.activationUniqueId.equals(other.getActivationUniqueId()))) &&
            ((this.activationId==null && other.getActivationId()==null) || 
             (this.activationId!=null &&
              this.activationId.equals(other.getActivationId()))) &&
            ((this.featureUniqueId==null && other.getFeatureUniqueId()==null) || 
             (this.featureUniqueId!=null &&
              this.featureUniqueId.equals(other.getFeatureUniqueId()))) &&
            ((this.featureName==null && other.getFeatureName()==null) || 
             (this.featureName!=null &&
              this.featureName.equals(other.getFeatureName()))) &&
            ((this.featureVersion==null && other.getFeatureVersion()==null) || 
             (this.featureVersion!=null &&
              this.featureVersion.equals(other.getFeatureVersion()))) &&
            ((this.orderedCount==null && other.getOrderedCount()==null) || 
             (this.orderedCount!=null &&
              this.orderedCount.equals(other.getOrderedCount()))) &&
            ((this.usedCount==null && other.getUsedCount()==null) || 
             (this.usedCount!=null &&
              this.usedCount.equals(other.getUsedCount()))) &&
            ((this.provisionedCount==null && other.getProvisionedCount()==null) || 
             (this.provisionedCount!=null &&
              this.provisionedCount.equals(other.getProvisionedCount())));
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
        if (getSummaryTimeUniqueId() != null) {
            _hashCode += getSummaryTimeUniqueId().hashCode();
        }
        if (getSummaryTime() != null) {
            _hashCode += getSummaryTime().hashCode();
        }
        if (getServer() != null) {
            _hashCode += getServer().hashCode();
        }
        if (getServerAlias() != null) {
            _hashCode += getServerAlias().hashCode();
        }
        if (getServerLastSyncTime() != null) {
            _hashCode += getServerLastSyncTime().hashCode();
        }
        if (getEntitlementUniqueId() != null) {
            _hashCode += getEntitlementUniqueId().hashCode();
        }
        if (getEntitlementId() != null) {
            _hashCode += getEntitlementId().hashCode();
        }
        if (getActivationUniqueId() != null) {
            _hashCode += getActivationUniqueId().hashCode();
        }
        if (getActivationId() != null) {
            _hashCode += getActivationId().hashCode();
        }
        if (getFeatureUniqueId() != null) {
            _hashCode += getFeatureUniqueId().hashCode();
        }
        if (getFeatureName() != null) {
            _hashCode += getFeatureName().hashCode();
        }
        if (getFeatureVersion() != null) {
            _hashCode += getFeatureVersion().hashCode();
        }
        if (getOrderedCount() != null) {
            _hashCode += getOrderedCount().hashCode();
        }
        if (getUsedCount() != null) {
            _hashCode += getUsedCount().hashCode();
        }
        if (getProvisionedCount() != null) {
            _hashCode += getProvisionedCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsageSummaryDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usageSummaryDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryTimeUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "summaryTimeUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "summaryTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "server"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "serverAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverLastSyncTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "serverLastSyncTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "entitlementUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "entitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "activationUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "activationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "orderedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisionedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "provisionedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
