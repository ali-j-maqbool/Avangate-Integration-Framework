/**
 * UsageHistoryDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class UsageHistoryDataType  implements java.io.Serializable {
    private java.util.Calendar updateTime;

    private com.flexnet.opsembedded.webservices.DeviceIdentifier serverIdentifier;

    private com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier;

    private java.lang.String alias;

    private com.flexnet.opsembedded.webservices.HostTypeIdentifier hostTypeName;

    private com.flexnet.opsembedded.webservices.DeviceServedStatusType deviceServedStatus;

    private com.flexnet.opsembedded.webservices.FeatureDataDataType[] featureData;

    private com.flexnet.opsembedded.webservices.MachineTypeType machineType;

    private java.lang.String vmName;

    private com.flexnet.opsembedded.webservices.DictionaryType vmInfo;

    private com.flexnet.opsembedded.webservices.DictionaryType vendorDictionary;

    public UsageHistoryDataType() {
    }

    public UsageHistoryDataType(
           java.util.Calendar updateTime,
           com.flexnet.opsembedded.webservices.DeviceIdentifier serverIdentifier,
           com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier,
           java.lang.String alias,
           com.flexnet.opsembedded.webservices.HostTypeIdentifier hostTypeName,
           com.flexnet.opsembedded.webservices.DeviceServedStatusType deviceServedStatus,
           com.flexnet.opsembedded.webservices.FeatureDataDataType[] featureData,
           com.flexnet.opsembedded.webservices.MachineTypeType machineType,
           java.lang.String vmName,
           com.flexnet.opsembedded.webservices.DictionaryType vmInfo,
           com.flexnet.opsembedded.webservices.DictionaryType vendorDictionary) {
           this.updateTime = updateTime;
           this.serverIdentifier = serverIdentifier;
           this.deviceIdentifier = deviceIdentifier;
           this.alias = alias;
           this.hostTypeName = hostTypeName;
           this.deviceServedStatus = deviceServedStatus;
           this.featureData = featureData;
           this.machineType = machineType;
           this.vmName = vmName;
           this.vmInfo = vmInfo;
           this.vendorDictionary = vendorDictionary;
    }


    /**
     * Gets the updateTime value for this UsageHistoryDataType.
     * 
     * @return updateTime
     */
    public java.util.Calendar getUpdateTime() {
        return updateTime;
    }


    /**
     * Sets the updateTime value for this UsageHistoryDataType.
     * 
     * @param updateTime
     */
    public void setUpdateTime(java.util.Calendar updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * Gets the serverIdentifier value for this UsageHistoryDataType.
     * 
     * @return serverIdentifier
     */
    public com.flexnet.opsembedded.webservices.DeviceIdentifier getServerIdentifier() {
        return serverIdentifier;
    }


    /**
     * Sets the serverIdentifier value for this UsageHistoryDataType.
     * 
     * @param serverIdentifier
     */
    public void setServerIdentifier(com.flexnet.opsembedded.webservices.DeviceIdentifier serverIdentifier) {
        this.serverIdentifier = serverIdentifier;
    }


    /**
     * Gets the deviceIdentifier value for this UsageHistoryDataType.
     * 
     * @return deviceIdentifier
     */
    public com.flexnet.opsembedded.webservices.DeviceIdentifier getDeviceIdentifier() {
        return deviceIdentifier;
    }


    /**
     * Sets the deviceIdentifier value for this UsageHistoryDataType.
     * 
     * @param deviceIdentifier
     */
    public void setDeviceIdentifier(com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }


    /**
     * Gets the alias value for this UsageHistoryDataType.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this UsageHistoryDataType.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the hostTypeName value for this UsageHistoryDataType.
     * 
     * @return hostTypeName
     */
    public com.flexnet.opsembedded.webservices.HostTypeIdentifier getHostTypeName() {
        return hostTypeName;
    }


    /**
     * Sets the hostTypeName value for this UsageHistoryDataType.
     * 
     * @param hostTypeName
     */
    public void setHostTypeName(com.flexnet.opsembedded.webservices.HostTypeIdentifier hostTypeName) {
        this.hostTypeName = hostTypeName;
    }


    /**
     * Gets the deviceServedStatus value for this UsageHistoryDataType.
     * 
     * @return deviceServedStatus
     */
    public com.flexnet.opsembedded.webservices.DeviceServedStatusType getDeviceServedStatus() {
        return deviceServedStatus;
    }


    /**
     * Sets the deviceServedStatus value for this UsageHistoryDataType.
     * 
     * @param deviceServedStatus
     */
    public void setDeviceServedStatus(com.flexnet.opsembedded.webservices.DeviceServedStatusType deviceServedStatus) {
        this.deviceServedStatus = deviceServedStatus;
    }


    /**
     * Gets the featureData value for this UsageHistoryDataType.
     * 
     * @return featureData
     */
    public com.flexnet.opsembedded.webservices.FeatureDataDataType[] getFeatureData() {
        return featureData;
    }


    /**
     * Sets the featureData value for this UsageHistoryDataType.
     * 
     * @param featureData
     */
    public void setFeatureData(com.flexnet.opsembedded.webservices.FeatureDataDataType[] featureData) {
        this.featureData = featureData;
    }

    public com.flexnet.opsembedded.webservices.FeatureDataDataType getFeatureData(int i) {
        return this.featureData[i];
    }

    public void setFeatureData(int i, com.flexnet.opsembedded.webservices.FeatureDataDataType _value) {
        this.featureData[i] = _value;
    }


    /**
     * Gets the machineType value for this UsageHistoryDataType.
     * 
     * @return machineType
     */
    public com.flexnet.opsembedded.webservices.MachineTypeType getMachineType() {
        return machineType;
    }


    /**
     * Sets the machineType value for this UsageHistoryDataType.
     * 
     * @param machineType
     */
    public void setMachineType(com.flexnet.opsembedded.webservices.MachineTypeType machineType) {
        this.machineType = machineType;
    }


    /**
     * Gets the vmName value for this UsageHistoryDataType.
     * 
     * @return vmName
     */
    public java.lang.String getVmName() {
        return vmName;
    }


    /**
     * Sets the vmName value for this UsageHistoryDataType.
     * 
     * @param vmName
     */
    public void setVmName(java.lang.String vmName) {
        this.vmName = vmName;
    }


    /**
     * Gets the vmInfo value for this UsageHistoryDataType.
     * 
     * @return vmInfo
     */
    public com.flexnet.opsembedded.webservices.DictionaryType getVmInfo() {
        return vmInfo;
    }


    /**
     * Sets the vmInfo value for this UsageHistoryDataType.
     * 
     * @param vmInfo
     */
    public void setVmInfo(com.flexnet.opsembedded.webservices.DictionaryType vmInfo) {
        this.vmInfo = vmInfo;
    }


    /**
     * Gets the vendorDictionary value for this UsageHistoryDataType.
     * 
     * @return vendorDictionary
     */
    public com.flexnet.opsembedded.webservices.DictionaryType getVendorDictionary() {
        return vendorDictionary;
    }


    /**
     * Sets the vendorDictionary value for this UsageHistoryDataType.
     * 
     * @param vendorDictionary
     */
    public void setVendorDictionary(com.flexnet.opsembedded.webservices.DictionaryType vendorDictionary) {
        this.vendorDictionary = vendorDictionary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsageHistoryDataType)) return false;
        UsageHistoryDataType other = (UsageHistoryDataType) obj;
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
            ((this.serverIdentifier==null && other.getServerIdentifier()==null) || 
             (this.serverIdentifier!=null &&
              this.serverIdentifier.equals(other.getServerIdentifier()))) &&
            ((this.deviceIdentifier==null && other.getDeviceIdentifier()==null) || 
             (this.deviceIdentifier!=null &&
              this.deviceIdentifier.equals(other.getDeviceIdentifier()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.hostTypeName==null && other.getHostTypeName()==null) || 
             (this.hostTypeName!=null &&
              this.hostTypeName.equals(other.getHostTypeName()))) &&
            ((this.deviceServedStatus==null && other.getDeviceServedStatus()==null) || 
             (this.deviceServedStatus!=null &&
              this.deviceServedStatus.equals(other.getDeviceServedStatus()))) &&
            ((this.featureData==null && other.getFeatureData()==null) || 
             (this.featureData!=null &&
              java.util.Arrays.equals(this.featureData, other.getFeatureData()))) &&
            ((this.machineType==null && other.getMachineType()==null) || 
             (this.machineType!=null &&
              this.machineType.equals(other.getMachineType()))) &&
            ((this.vmName==null && other.getVmName()==null) || 
             (this.vmName!=null &&
              this.vmName.equals(other.getVmName()))) &&
            ((this.vmInfo==null && other.getVmInfo()==null) || 
             (this.vmInfo!=null &&
              this.vmInfo.equals(other.getVmInfo()))) &&
            ((this.vendorDictionary==null && other.getVendorDictionary()==null) || 
             (this.vendorDictionary!=null &&
              this.vendorDictionary.equals(other.getVendorDictionary())));
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
        if (getServerIdentifier() != null) {
            _hashCode += getServerIdentifier().hashCode();
        }
        if (getDeviceIdentifier() != null) {
            _hashCode += getDeviceIdentifier().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getHostTypeName() != null) {
            _hashCode += getHostTypeName().hashCode();
        }
        if (getDeviceServedStatus() != null) {
            _hashCode += getDeviceServedStatus().hashCode();
        }
        if (getFeatureData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMachineType() != null) {
            _hashCode += getMachineType().hashCode();
        }
        if (getVmName() != null) {
            _hashCode += getVmName().hashCode();
        }
        if (getVmInfo() != null) {
            _hashCode += getVmInfo().hashCode();
        }
        if (getVendorDictionary() != null) {
            _hashCode += getVendorDictionary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsageHistoryDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usageHistoryDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "serverIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "hostTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "hostTypeIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceServedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceServedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceServedStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureDataDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "machineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "machineTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "vmName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "vmInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "dictionaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorDictionary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "vendorDictionary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "dictionaryType"));
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
