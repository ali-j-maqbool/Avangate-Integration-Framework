/**
 * DeviceQueryDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class DeviceQueryDataType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier;

    private java.lang.String alias;

    private java.lang.String description;

    private com.flexnet.opsembedded.webservices.HostTypeIdentifier hostTypeName;

    private com.flexnet.opsembedded.webservices.DeviceStatusType deviceStatus;

    private com.flexnet.opsembedded.webservices.DeviceServedStatusType deviceServedStatus;

    private com.flexnet.opsembedded.webservices.ChannelPartnerDataListType channelPartners;

    private com.flexnet.opsembedded.webservices.SoldToType soldTo;

    private com.flexnet.opsembedded.webservices.ProductPKType preBuiltProduct;

    private java.lang.Boolean hasPrebuiltLicense;

    private byte[] prebuiltLicense;

    private java.lang.Boolean hasAddonLicense;

    private byte[] addonLicense;

    private com.flexnet.opsembedded.webservices.PublisherIdentifier publisherIdName;

    private com.flexnet.opsembedded.webservices.AddonLineItemDataDataType[] addonLineItemData;

    private com.flexnet.opsembedded.webservices.FeatureDataDataType[] featureData;

    private com.flexnet.opsembedded.webservices.AttributeDescriptorDataType customAttributes;

    private com.flexnet.opsembedded.webservices.DeviceIdentifier parentIdentifier;

    private com.flexnet.opsembedded.webservices.MachineTypeType machineType;

    private java.lang.String vmName;

    private com.flexnet.opsembedded.webservices.DictionaryType vmInfo;

    private com.flexnet.opsembedded.webservices.DictionaryType vendorDictionary;

    public DeviceQueryDataType() {
    }

    public DeviceQueryDataType(
           com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier,
           java.lang.String alias,
           java.lang.String description,
           com.flexnet.opsembedded.webservices.HostTypeIdentifier hostTypeName,
           com.flexnet.opsembedded.webservices.DeviceStatusType deviceStatus,
           com.flexnet.opsembedded.webservices.DeviceServedStatusType deviceServedStatus,
           com.flexnet.opsembedded.webservices.ChannelPartnerDataListType channelPartners,
           com.flexnet.opsembedded.webservices.SoldToType soldTo,
           com.flexnet.opsembedded.webservices.ProductPKType preBuiltProduct,
           java.lang.Boolean hasPrebuiltLicense,
           byte[] prebuiltLicense,
           java.lang.Boolean hasAddonLicense,
           byte[] addonLicense,
           com.flexnet.opsembedded.webservices.PublisherIdentifier publisherIdName,
           com.flexnet.opsembedded.webservices.AddonLineItemDataDataType[] addonLineItemData,
           com.flexnet.opsembedded.webservices.FeatureDataDataType[] featureData,
           com.flexnet.opsembedded.webservices.AttributeDescriptorDataType customAttributes,
           com.flexnet.opsembedded.webservices.DeviceIdentifier parentIdentifier,
           com.flexnet.opsembedded.webservices.MachineTypeType machineType,
           java.lang.String vmName,
           com.flexnet.opsembedded.webservices.DictionaryType vmInfo,
           com.flexnet.opsembedded.webservices.DictionaryType vendorDictionary) {
           this.deviceIdentifier = deviceIdentifier;
           this.alias = alias;
           this.description = description;
           this.hostTypeName = hostTypeName;
           this.deviceStatus = deviceStatus;
           this.deviceServedStatus = deviceServedStatus;
           this.channelPartners = channelPartners;
           this.soldTo = soldTo;
           this.preBuiltProduct = preBuiltProduct;
           this.hasPrebuiltLicense = hasPrebuiltLicense;
           this.prebuiltLicense = prebuiltLicense;
           this.hasAddonLicense = hasAddonLicense;
           this.addonLicense = addonLicense;
           this.publisherIdName = publisherIdName;
           this.addonLineItemData = addonLineItemData;
           this.featureData = featureData;
           this.customAttributes = customAttributes;
           this.parentIdentifier = parentIdentifier;
           this.machineType = machineType;
           this.vmName = vmName;
           this.vmInfo = vmInfo;
           this.vendorDictionary = vendorDictionary;
    }


    /**
     * Gets the deviceIdentifier value for this DeviceQueryDataType.
     * 
     * @return deviceIdentifier
     */
    public com.flexnet.opsembedded.webservices.DeviceIdentifier getDeviceIdentifier() {
        return deviceIdentifier;
    }


    /**
     * Sets the deviceIdentifier value for this DeviceQueryDataType.
     * 
     * @param deviceIdentifier
     */
    public void setDeviceIdentifier(com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }


    /**
     * Gets the alias value for this DeviceQueryDataType.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this DeviceQueryDataType.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the description value for this DeviceQueryDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DeviceQueryDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the hostTypeName value for this DeviceQueryDataType.
     * 
     * @return hostTypeName
     */
    public com.flexnet.opsembedded.webservices.HostTypeIdentifier getHostTypeName() {
        return hostTypeName;
    }


    /**
     * Sets the hostTypeName value for this DeviceQueryDataType.
     * 
     * @param hostTypeName
     */
    public void setHostTypeName(com.flexnet.opsembedded.webservices.HostTypeIdentifier hostTypeName) {
        this.hostTypeName = hostTypeName;
    }


    /**
     * Gets the deviceStatus value for this DeviceQueryDataType.
     * 
     * @return deviceStatus
     */
    public com.flexnet.opsembedded.webservices.DeviceStatusType getDeviceStatus() {
        return deviceStatus;
    }


    /**
     * Sets the deviceStatus value for this DeviceQueryDataType.
     * 
     * @param deviceStatus
     */
    public void setDeviceStatus(com.flexnet.opsembedded.webservices.DeviceStatusType deviceStatus) {
        this.deviceStatus = deviceStatus;
    }


    /**
     * Gets the deviceServedStatus value for this DeviceQueryDataType.
     * 
     * @return deviceServedStatus
     */
    public com.flexnet.opsembedded.webservices.DeviceServedStatusType getDeviceServedStatus() {
        return deviceServedStatus;
    }


    /**
     * Sets the deviceServedStatus value for this DeviceQueryDataType.
     * 
     * @param deviceServedStatus
     */
    public void setDeviceServedStatus(com.flexnet.opsembedded.webservices.DeviceServedStatusType deviceServedStatus) {
        this.deviceServedStatus = deviceServedStatus;
    }


    /**
     * Gets the channelPartners value for this DeviceQueryDataType.
     * 
     * @return channelPartners
     */
    public com.flexnet.opsembedded.webservices.ChannelPartnerDataListType getChannelPartners() {
        return channelPartners;
    }


    /**
     * Sets the channelPartners value for this DeviceQueryDataType.
     * 
     * @param channelPartners
     */
    public void setChannelPartners(com.flexnet.opsembedded.webservices.ChannelPartnerDataListType channelPartners) {
        this.channelPartners = channelPartners;
    }


    /**
     * Gets the soldTo value for this DeviceQueryDataType.
     * 
     * @return soldTo
     */
    public com.flexnet.opsembedded.webservices.SoldToType getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this DeviceQueryDataType.
     * 
     * @param soldTo
     */
    public void setSoldTo(com.flexnet.opsembedded.webservices.SoldToType soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the preBuiltProduct value for this DeviceQueryDataType.
     * 
     * @return preBuiltProduct
     */
    public com.flexnet.opsembedded.webservices.ProductPKType getPreBuiltProduct() {
        return preBuiltProduct;
    }


    /**
     * Sets the preBuiltProduct value for this DeviceQueryDataType.
     * 
     * @param preBuiltProduct
     */
    public void setPreBuiltProduct(com.flexnet.opsembedded.webservices.ProductPKType preBuiltProduct) {
        this.preBuiltProduct = preBuiltProduct;
    }


    /**
     * Gets the hasPrebuiltLicense value for this DeviceQueryDataType.
     * 
     * @return hasPrebuiltLicense
     */
    public java.lang.Boolean getHasPrebuiltLicense() {
        return hasPrebuiltLicense;
    }


    /**
     * Sets the hasPrebuiltLicense value for this DeviceQueryDataType.
     * 
     * @param hasPrebuiltLicense
     */
    public void setHasPrebuiltLicense(java.lang.Boolean hasPrebuiltLicense) {
        this.hasPrebuiltLicense = hasPrebuiltLicense;
    }


    /**
     * Gets the prebuiltLicense value for this DeviceQueryDataType.
     * 
     * @return prebuiltLicense
     */
    public byte[] getPrebuiltLicense() {
        return prebuiltLicense;
    }


    /**
     * Sets the prebuiltLicense value for this DeviceQueryDataType.
     * 
     * @param prebuiltLicense
     */
    public void setPrebuiltLicense(byte[] prebuiltLicense) {
        this.prebuiltLicense = prebuiltLicense;
    }


    /**
     * Gets the hasAddonLicense value for this DeviceQueryDataType.
     * 
     * @return hasAddonLicense
     */
    public java.lang.Boolean getHasAddonLicense() {
        return hasAddonLicense;
    }


    /**
     * Sets the hasAddonLicense value for this DeviceQueryDataType.
     * 
     * @param hasAddonLicense
     */
    public void setHasAddonLicense(java.lang.Boolean hasAddonLicense) {
        this.hasAddonLicense = hasAddonLicense;
    }


    /**
     * Gets the addonLicense value for this DeviceQueryDataType.
     * 
     * @return addonLicense
     */
    public byte[] getAddonLicense() {
        return addonLicense;
    }


    /**
     * Sets the addonLicense value for this DeviceQueryDataType.
     * 
     * @param addonLicense
     */
    public void setAddonLicense(byte[] addonLicense) {
        this.addonLicense = addonLicense;
    }


    /**
     * Gets the publisherIdName value for this DeviceQueryDataType.
     * 
     * @return publisherIdName
     */
    public com.flexnet.opsembedded.webservices.PublisherIdentifier getPublisherIdName() {
        return publisherIdName;
    }


    /**
     * Sets the publisherIdName value for this DeviceQueryDataType.
     * 
     * @param publisherIdName
     */
    public void setPublisherIdName(com.flexnet.opsembedded.webservices.PublisherIdentifier publisherIdName) {
        this.publisherIdName = publisherIdName;
    }


    /**
     * Gets the addonLineItemData value for this DeviceQueryDataType.
     * 
     * @return addonLineItemData
     */
    public com.flexnet.opsembedded.webservices.AddonLineItemDataDataType[] getAddonLineItemData() {
        return addonLineItemData;
    }


    /**
     * Sets the addonLineItemData value for this DeviceQueryDataType.
     * 
     * @param addonLineItemData
     */
    public void setAddonLineItemData(com.flexnet.opsembedded.webservices.AddonLineItemDataDataType[] addonLineItemData) {
        this.addonLineItemData = addonLineItemData;
    }

    public com.flexnet.opsembedded.webservices.AddonLineItemDataDataType getAddonLineItemData(int i) {
        return this.addonLineItemData[i];
    }

    public void setAddonLineItemData(int i, com.flexnet.opsembedded.webservices.AddonLineItemDataDataType _value) {
        this.addonLineItemData[i] = _value;
    }


    /**
     * Gets the featureData value for this DeviceQueryDataType.
     * 
     * @return featureData
     */
    public com.flexnet.opsembedded.webservices.FeatureDataDataType[] getFeatureData() {
        return featureData;
    }


    /**
     * Sets the featureData value for this DeviceQueryDataType.
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
     * Gets the customAttributes value for this DeviceQueryDataType.
     * 
     * @return customAttributes
     */
    public com.flexnet.opsembedded.webservices.AttributeDescriptorDataType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this DeviceQueryDataType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.opsembedded.webservices.AttributeDescriptorDataType customAttributes) {
        this.customAttributes = customAttributes;
    }


    /**
     * Gets the parentIdentifier value for this DeviceQueryDataType.
     * 
     * @return parentIdentifier
     */
    public com.flexnet.opsembedded.webservices.DeviceIdentifier getParentIdentifier() {
        return parentIdentifier;
    }


    /**
     * Sets the parentIdentifier value for this DeviceQueryDataType.
     * 
     * @param parentIdentifier
     */
    public void setParentIdentifier(com.flexnet.opsembedded.webservices.DeviceIdentifier parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
    }


    /**
     * Gets the machineType value for this DeviceQueryDataType.
     * 
     * @return machineType
     */
    public com.flexnet.opsembedded.webservices.MachineTypeType getMachineType() {
        return machineType;
    }


    /**
     * Sets the machineType value for this DeviceQueryDataType.
     * 
     * @param machineType
     */
    public void setMachineType(com.flexnet.opsembedded.webservices.MachineTypeType machineType) {
        this.machineType = machineType;
    }


    /**
     * Gets the vmName value for this DeviceQueryDataType.
     * 
     * @return vmName
     */
    public java.lang.String getVmName() {
        return vmName;
    }


    /**
     * Sets the vmName value for this DeviceQueryDataType.
     * 
     * @param vmName
     */
    public void setVmName(java.lang.String vmName) {
        this.vmName = vmName;
    }


    /**
     * Gets the vmInfo value for this DeviceQueryDataType.
     * 
     * @return vmInfo
     */
    public com.flexnet.opsembedded.webservices.DictionaryType getVmInfo() {
        return vmInfo;
    }


    /**
     * Sets the vmInfo value for this DeviceQueryDataType.
     * 
     * @param vmInfo
     */
    public void setVmInfo(com.flexnet.opsembedded.webservices.DictionaryType vmInfo) {
        this.vmInfo = vmInfo;
    }


    /**
     * Gets the vendorDictionary value for this DeviceQueryDataType.
     * 
     * @return vendorDictionary
     */
    public com.flexnet.opsembedded.webservices.DictionaryType getVendorDictionary() {
        return vendorDictionary;
    }


    /**
     * Sets the vendorDictionary value for this DeviceQueryDataType.
     * 
     * @param vendorDictionary
     */
    public void setVendorDictionary(com.flexnet.opsembedded.webservices.DictionaryType vendorDictionary) {
        this.vendorDictionary = vendorDictionary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceQueryDataType)) return false;
        DeviceQueryDataType other = (DeviceQueryDataType) obj;
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
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.hostTypeName==null && other.getHostTypeName()==null) || 
             (this.hostTypeName!=null &&
              this.hostTypeName.equals(other.getHostTypeName()))) &&
            ((this.deviceStatus==null && other.getDeviceStatus()==null) || 
             (this.deviceStatus!=null &&
              this.deviceStatus.equals(other.getDeviceStatus()))) &&
            ((this.deviceServedStatus==null && other.getDeviceServedStatus()==null) || 
             (this.deviceServedStatus!=null &&
              this.deviceServedStatus.equals(other.getDeviceServedStatus()))) &&
            ((this.channelPartners==null && other.getChannelPartners()==null) || 
             (this.channelPartners!=null &&
              this.channelPartners.equals(other.getChannelPartners()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.preBuiltProduct==null && other.getPreBuiltProduct()==null) || 
             (this.preBuiltProduct!=null &&
              this.preBuiltProduct.equals(other.getPreBuiltProduct()))) &&
            ((this.hasPrebuiltLicense==null && other.getHasPrebuiltLicense()==null) || 
             (this.hasPrebuiltLicense!=null &&
              this.hasPrebuiltLicense.equals(other.getHasPrebuiltLicense()))) &&
            ((this.prebuiltLicense==null && other.getPrebuiltLicense()==null) || 
             (this.prebuiltLicense!=null &&
              java.util.Arrays.equals(this.prebuiltLicense, other.getPrebuiltLicense()))) &&
            ((this.hasAddonLicense==null && other.getHasAddonLicense()==null) || 
             (this.hasAddonLicense!=null &&
              this.hasAddonLicense.equals(other.getHasAddonLicense()))) &&
            ((this.addonLicense==null && other.getAddonLicense()==null) || 
             (this.addonLicense!=null &&
              java.util.Arrays.equals(this.addonLicense, other.getAddonLicense()))) &&
            ((this.publisherIdName==null && other.getPublisherIdName()==null) || 
             (this.publisherIdName!=null &&
              this.publisherIdName.equals(other.getPublisherIdName()))) &&
            ((this.addonLineItemData==null && other.getAddonLineItemData()==null) || 
             (this.addonLineItemData!=null &&
              java.util.Arrays.equals(this.addonLineItemData, other.getAddonLineItemData()))) &&
            ((this.featureData==null && other.getFeatureData()==null) || 
             (this.featureData!=null &&
              java.util.Arrays.equals(this.featureData, other.getFeatureData()))) &&
            ((this.customAttributes==null && other.getCustomAttributes()==null) || 
             (this.customAttributes!=null &&
              this.customAttributes.equals(other.getCustomAttributes()))) &&
            ((this.parentIdentifier==null && other.getParentIdentifier()==null) || 
             (this.parentIdentifier!=null &&
              this.parentIdentifier.equals(other.getParentIdentifier()))) &&
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
        if (getDeviceIdentifier() != null) {
            _hashCode += getDeviceIdentifier().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getHostTypeName() != null) {
            _hashCode += getHostTypeName().hashCode();
        }
        if (getDeviceStatus() != null) {
            _hashCode += getDeviceStatus().hashCode();
        }
        if (getDeviceServedStatus() != null) {
            _hashCode += getDeviceServedStatus().hashCode();
        }
        if (getChannelPartners() != null) {
            _hashCode += getChannelPartners().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getPreBuiltProduct() != null) {
            _hashCode += getPreBuiltProduct().hashCode();
        }
        if (getHasPrebuiltLicense() != null) {
            _hashCode += getHasPrebuiltLicense().hashCode();
        }
        if (getPrebuiltLicense() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrebuiltLicense());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrebuiltLicense(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHasAddonLicense() != null) {
            _hashCode += getHasAddonLicense().hashCode();
        }
        if (getAddonLicense() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddonLicense());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddonLicense(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPublisherIdName() != null) {
            _hashCode += getPublisherIdName().hashCode();
        }
        if (getAddonLineItemData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddonLineItemData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddonLineItemData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getCustomAttributes() != null) {
            _hashCode += getCustomAttributes().hashCode();
        }
        if (getParentIdentifier() != null) {
            _hashCode += getParentIdentifier().hashCode();
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
        new org.apache.axis.description.TypeDesc(DeviceQueryDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceQueryDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "description"));
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
        elemField.setFieldName("deviceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceStatusType"));
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
        elemField.setFieldName("channelPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "channelPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "channelPartnerDataListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "soldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "soldToType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preBuiltProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "preBuiltProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "productPKType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasPrebuiltLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "hasPrebuiltLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prebuiltLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "prebuiltLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasAddonLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "hasAddonLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addonLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "addonLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
        elemField.setFieldName("addonLineItemData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "addonLineItemData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "addonLineItemDataDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("customAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "customAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "attributeDescriptorDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "parentIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
