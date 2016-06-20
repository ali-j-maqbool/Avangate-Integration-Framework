/**
 * GetDevicesParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GetDevicesParametersType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.SimpleQueryType alias;

    private com.flexnet.opsembedded.webservices.SimpleQueryType deviceId;

    private com.flexnet.opsembedded.webservices.DeviceIdTypeQueryType deviceIdType;

    private com.flexnet.opsembedded.webservices.SimpleQueryType parentId;

    private com.flexnet.opsembedded.webservices.DeviceIdTypeQueryType parentIdType;

    private com.flexnet.opsembedded.webservices.SimpleQueryType hostTypeName;

    private com.flexnet.opsembedded.webservices.SimpleQueryType soldTo;

    private com.flexnet.opsembedded.webservices.SimpleQueryType currentOwnerName;

    private com.flexnet.opsembedded.webservices.PartnerTierQueryType organizationUnitName;

    private com.flexnet.opsembedded.webservices.SimpleQueryType description;

    private com.flexnet.opsembedded.webservices.DeviceStateQueryType status;

    private com.flexnet.opsembedded.webservices.DeviceServedStateQueryType servedStatus;

    private com.flexnet.opsembedded.webservices.SimpleQueryType preBuiltProductName;

    private com.flexnet.opsembedded.webservices.SimpleQueryType preBuiltProductVersion;

    private com.flexnet.opsembedded.webservices.SimpleQueryType addOnActivationId;

    private com.flexnet.opsembedded.webservices.SimpleQueryType addOnProductName;

    private com.flexnet.opsembedded.webservices.SimpleQueryType addOnProductVersion;

    private com.flexnet.opsembedded.webservices.SimpleQueryType featureName;

    private com.flexnet.opsembedded.webservices.SimpleQueryType featureVersion;

    private com.flexnet.opsembedded.webservices.NumberQueryType featureCount;

    private com.flexnet.opsembedded.webservices.NumberQueryType featureOverage;

    private java.lang.Boolean isServer;

    private com.flexnet.opsembedded.webservices.DeviceTypeList deviceTypes;

    private com.flexnet.opsembedded.webservices.CustomAttributesQueryListType customAttributes;

    private com.flexnet.opsembedded.webservices.DeviceMachineTypeQueryType machineType;

    private com.flexnet.opsembedded.webservices.SimpleQueryType vmName;

    public GetDevicesParametersType() {
    }

    public GetDevicesParametersType(
           com.flexnet.opsembedded.webservices.SimpleQueryType alias,
           com.flexnet.opsembedded.webservices.SimpleQueryType deviceId,
           com.flexnet.opsembedded.webservices.DeviceIdTypeQueryType deviceIdType,
           com.flexnet.opsembedded.webservices.SimpleQueryType parentId,
           com.flexnet.opsembedded.webservices.DeviceIdTypeQueryType parentIdType,
           com.flexnet.opsembedded.webservices.SimpleQueryType hostTypeName,
           com.flexnet.opsembedded.webservices.SimpleQueryType soldTo,
           com.flexnet.opsembedded.webservices.SimpleQueryType currentOwnerName,
           com.flexnet.opsembedded.webservices.PartnerTierQueryType organizationUnitName,
           com.flexnet.opsembedded.webservices.SimpleQueryType description,
           com.flexnet.opsembedded.webservices.DeviceStateQueryType status,
           com.flexnet.opsembedded.webservices.DeviceServedStateQueryType servedStatus,
           com.flexnet.opsembedded.webservices.SimpleQueryType preBuiltProductName,
           com.flexnet.opsembedded.webservices.SimpleQueryType preBuiltProductVersion,
           com.flexnet.opsembedded.webservices.SimpleQueryType addOnActivationId,
           com.flexnet.opsembedded.webservices.SimpleQueryType addOnProductName,
           com.flexnet.opsembedded.webservices.SimpleQueryType addOnProductVersion,
           com.flexnet.opsembedded.webservices.SimpleQueryType featureName,
           com.flexnet.opsembedded.webservices.SimpleQueryType featureVersion,
           com.flexnet.opsembedded.webservices.NumberQueryType featureCount,
           com.flexnet.opsembedded.webservices.NumberQueryType featureOverage,
           java.lang.Boolean isServer,
           com.flexnet.opsembedded.webservices.DeviceTypeList deviceTypes,
           com.flexnet.opsembedded.webservices.CustomAttributesQueryListType customAttributes,
           com.flexnet.opsembedded.webservices.DeviceMachineTypeQueryType machineType,
           com.flexnet.opsembedded.webservices.SimpleQueryType vmName) {
           this.alias = alias;
           this.deviceId = deviceId;
           this.deviceIdType = deviceIdType;
           this.parentId = parentId;
           this.parentIdType = parentIdType;
           this.hostTypeName = hostTypeName;
           this.soldTo = soldTo;
           this.currentOwnerName = currentOwnerName;
           this.organizationUnitName = organizationUnitName;
           this.description = description;
           this.status = status;
           this.servedStatus = servedStatus;
           this.preBuiltProductName = preBuiltProductName;
           this.preBuiltProductVersion = preBuiltProductVersion;
           this.addOnActivationId = addOnActivationId;
           this.addOnProductName = addOnProductName;
           this.addOnProductVersion = addOnProductVersion;
           this.featureName = featureName;
           this.featureVersion = featureVersion;
           this.featureCount = featureCount;
           this.featureOverage = featureOverage;
           this.isServer = isServer;
           this.deviceTypes = deviceTypes;
           this.customAttributes = customAttributes;
           this.machineType = machineType;
           this.vmName = vmName;
    }


    /**
     * Gets the alias value for this GetDevicesParametersType.
     * 
     * @return alias
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this GetDevicesParametersType.
     * 
     * @param alias
     */
    public void setAlias(com.flexnet.opsembedded.webservices.SimpleQueryType alias) {
        this.alias = alias;
    }


    /**
     * Gets the deviceId value for this GetDevicesParametersType.
     * 
     * @return deviceId
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this GetDevicesParametersType.
     * 
     * @param deviceId
     */
    public void setDeviceId(com.flexnet.opsembedded.webservices.SimpleQueryType deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the deviceIdType value for this GetDevicesParametersType.
     * 
     * @return deviceIdType
     */
    public com.flexnet.opsembedded.webservices.DeviceIdTypeQueryType getDeviceIdType() {
        return deviceIdType;
    }


    /**
     * Sets the deviceIdType value for this GetDevicesParametersType.
     * 
     * @param deviceIdType
     */
    public void setDeviceIdType(com.flexnet.opsembedded.webservices.DeviceIdTypeQueryType deviceIdType) {
        this.deviceIdType = deviceIdType;
    }


    /**
     * Gets the parentId value for this GetDevicesParametersType.
     * 
     * @return parentId
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this GetDevicesParametersType.
     * 
     * @param parentId
     */
    public void setParentId(com.flexnet.opsembedded.webservices.SimpleQueryType parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the parentIdType value for this GetDevicesParametersType.
     * 
     * @return parentIdType
     */
    public com.flexnet.opsembedded.webservices.DeviceIdTypeQueryType getParentIdType() {
        return parentIdType;
    }


    /**
     * Sets the parentIdType value for this GetDevicesParametersType.
     * 
     * @param parentIdType
     */
    public void setParentIdType(com.flexnet.opsembedded.webservices.DeviceIdTypeQueryType parentIdType) {
        this.parentIdType = parentIdType;
    }


    /**
     * Gets the hostTypeName value for this GetDevicesParametersType.
     * 
     * @return hostTypeName
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getHostTypeName() {
        return hostTypeName;
    }


    /**
     * Sets the hostTypeName value for this GetDevicesParametersType.
     * 
     * @param hostTypeName
     */
    public void setHostTypeName(com.flexnet.opsembedded.webservices.SimpleQueryType hostTypeName) {
        this.hostTypeName = hostTypeName;
    }


    /**
     * Gets the soldTo value for this GetDevicesParametersType.
     * 
     * @return soldTo
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this GetDevicesParametersType.
     * 
     * @param soldTo
     */
    public void setSoldTo(com.flexnet.opsembedded.webservices.SimpleQueryType soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the currentOwnerName value for this GetDevicesParametersType.
     * 
     * @return currentOwnerName
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getCurrentOwnerName() {
        return currentOwnerName;
    }


    /**
     * Sets the currentOwnerName value for this GetDevicesParametersType.
     * 
     * @param currentOwnerName
     */
    public void setCurrentOwnerName(com.flexnet.opsembedded.webservices.SimpleQueryType currentOwnerName) {
        this.currentOwnerName = currentOwnerName;
    }


    /**
     * Gets the organizationUnitName value for this GetDevicesParametersType.
     * 
     * @return organizationUnitName
     */
    public com.flexnet.opsembedded.webservices.PartnerTierQueryType getOrganizationUnitName() {
        return organizationUnitName;
    }


    /**
     * Sets the organizationUnitName value for this GetDevicesParametersType.
     * 
     * @param organizationUnitName
     */
    public void setOrganizationUnitName(com.flexnet.opsembedded.webservices.PartnerTierQueryType organizationUnitName) {
        this.organizationUnitName = organizationUnitName;
    }


    /**
     * Gets the description value for this GetDevicesParametersType.
     * 
     * @return description
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getDescription() {
        return description;
    }


    /**
     * Sets the description value for this GetDevicesParametersType.
     * 
     * @param description
     */
    public void setDescription(com.flexnet.opsembedded.webservices.SimpleQueryType description) {
        this.description = description;
    }


    /**
     * Gets the status value for this GetDevicesParametersType.
     * 
     * @return status
     */
    public com.flexnet.opsembedded.webservices.DeviceStateQueryType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetDevicesParametersType.
     * 
     * @param status
     */
    public void setStatus(com.flexnet.opsembedded.webservices.DeviceStateQueryType status) {
        this.status = status;
    }


    /**
     * Gets the servedStatus value for this GetDevicesParametersType.
     * 
     * @return servedStatus
     */
    public com.flexnet.opsembedded.webservices.DeviceServedStateQueryType getServedStatus() {
        return servedStatus;
    }


    /**
     * Sets the servedStatus value for this GetDevicesParametersType.
     * 
     * @param servedStatus
     */
    public void setServedStatus(com.flexnet.opsembedded.webservices.DeviceServedStateQueryType servedStatus) {
        this.servedStatus = servedStatus;
    }


    /**
     * Gets the preBuiltProductName value for this GetDevicesParametersType.
     * 
     * @return preBuiltProductName
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getPreBuiltProductName() {
        return preBuiltProductName;
    }


    /**
     * Sets the preBuiltProductName value for this GetDevicesParametersType.
     * 
     * @param preBuiltProductName
     */
    public void setPreBuiltProductName(com.flexnet.opsembedded.webservices.SimpleQueryType preBuiltProductName) {
        this.preBuiltProductName = preBuiltProductName;
    }


    /**
     * Gets the preBuiltProductVersion value for this GetDevicesParametersType.
     * 
     * @return preBuiltProductVersion
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getPreBuiltProductVersion() {
        return preBuiltProductVersion;
    }


    /**
     * Sets the preBuiltProductVersion value for this GetDevicesParametersType.
     * 
     * @param preBuiltProductVersion
     */
    public void setPreBuiltProductVersion(com.flexnet.opsembedded.webservices.SimpleQueryType preBuiltProductVersion) {
        this.preBuiltProductVersion = preBuiltProductVersion;
    }


    /**
     * Gets the addOnActivationId value for this GetDevicesParametersType.
     * 
     * @return addOnActivationId
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getAddOnActivationId() {
        return addOnActivationId;
    }


    /**
     * Sets the addOnActivationId value for this GetDevicesParametersType.
     * 
     * @param addOnActivationId
     */
    public void setAddOnActivationId(com.flexnet.opsembedded.webservices.SimpleQueryType addOnActivationId) {
        this.addOnActivationId = addOnActivationId;
    }


    /**
     * Gets the addOnProductName value for this GetDevicesParametersType.
     * 
     * @return addOnProductName
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getAddOnProductName() {
        return addOnProductName;
    }


    /**
     * Sets the addOnProductName value for this GetDevicesParametersType.
     * 
     * @param addOnProductName
     */
    public void setAddOnProductName(com.flexnet.opsembedded.webservices.SimpleQueryType addOnProductName) {
        this.addOnProductName = addOnProductName;
    }


    /**
     * Gets the addOnProductVersion value for this GetDevicesParametersType.
     * 
     * @return addOnProductVersion
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getAddOnProductVersion() {
        return addOnProductVersion;
    }


    /**
     * Sets the addOnProductVersion value for this GetDevicesParametersType.
     * 
     * @param addOnProductVersion
     */
    public void setAddOnProductVersion(com.flexnet.opsembedded.webservices.SimpleQueryType addOnProductVersion) {
        this.addOnProductVersion = addOnProductVersion;
    }


    /**
     * Gets the featureName value for this GetDevicesParametersType.
     * 
     * @return featureName
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getFeatureName() {
        return featureName;
    }


    /**
     * Sets the featureName value for this GetDevicesParametersType.
     * 
     * @param featureName
     */
    public void setFeatureName(com.flexnet.opsembedded.webservices.SimpleQueryType featureName) {
        this.featureName = featureName;
    }


    /**
     * Gets the featureVersion value for this GetDevicesParametersType.
     * 
     * @return featureVersion
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getFeatureVersion() {
        return featureVersion;
    }


    /**
     * Sets the featureVersion value for this GetDevicesParametersType.
     * 
     * @param featureVersion
     */
    public void setFeatureVersion(com.flexnet.opsembedded.webservices.SimpleQueryType featureVersion) {
        this.featureVersion = featureVersion;
    }


    /**
     * Gets the featureCount value for this GetDevicesParametersType.
     * 
     * @return featureCount
     */
    public com.flexnet.opsembedded.webservices.NumberQueryType getFeatureCount() {
        return featureCount;
    }


    /**
     * Sets the featureCount value for this GetDevicesParametersType.
     * 
     * @param featureCount
     */
    public void setFeatureCount(com.flexnet.opsembedded.webservices.NumberQueryType featureCount) {
        this.featureCount = featureCount;
    }


    /**
     * Gets the featureOverage value for this GetDevicesParametersType.
     * 
     * @return featureOverage
     */
    public com.flexnet.opsembedded.webservices.NumberQueryType getFeatureOverage() {
        return featureOverage;
    }


    /**
     * Sets the featureOverage value for this GetDevicesParametersType.
     * 
     * @param featureOverage
     */
    public void setFeatureOverage(com.flexnet.opsembedded.webservices.NumberQueryType featureOverage) {
        this.featureOverage = featureOverage;
    }


    /**
     * Gets the isServer value for this GetDevicesParametersType.
     * 
     * @return isServer
     */
    public java.lang.Boolean getIsServer() {
        return isServer;
    }


    /**
     * Sets the isServer value for this GetDevicesParametersType.
     * 
     * @param isServer
     */
    public void setIsServer(java.lang.Boolean isServer) {
        this.isServer = isServer;
    }


    /**
     * Gets the deviceTypes value for this GetDevicesParametersType.
     * 
     * @return deviceTypes
     */
    public com.flexnet.opsembedded.webservices.DeviceTypeList getDeviceTypes() {
        return deviceTypes;
    }


    /**
     * Sets the deviceTypes value for this GetDevicesParametersType.
     * 
     * @param deviceTypes
     */
    public void setDeviceTypes(com.flexnet.opsembedded.webservices.DeviceTypeList deviceTypes) {
        this.deviceTypes = deviceTypes;
    }


    /**
     * Gets the customAttributes value for this GetDevicesParametersType.
     * 
     * @return customAttributes
     */
    public com.flexnet.opsembedded.webservices.CustomAttributesQueryListType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this GetDevicesParametersType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.opsembedded.webservices.CustomAttributesQueryListType customAttributes) {
        this.customAttributes = customAttributes;
    }


    /**
     * Gets the machineType value for this GetDevicesParametersType.
     * 
     * @return machineType
     */
    public com.flexnet.opsembedded.webservices.DeviceMachineTypeQueryType getMachineType() {
        return machineType;
    }


    /**
     * Sets the machineType value for this GetDevicesParametersType.
     * 
     * @param machineType
     */
    public void setMachineType(com.flexnet.opsembedded.webservices.DeviceMachineTypeQueryType machineType) {
        this.machineType = machineType;
    }


    /**
     * Gets the vmName value for this GetDevicesParametersType.
     * 
     * @return vmName
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getVmName() {
        return vmName;
    }


    /**
     * Sets the vmName value for this GetDevicesParametersType.
     * 
     * @param vmName
     */
    public void setVmName(com.flexnet.opsembedded.webservices.SimpleQueryType vmName) {
        this.vmName = vmName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDevicesParametersType)) return false;
        GetDevicesParametersType other = (GetDevicesParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.deviceIdType==null && other.getDeviceIdType()==null) || 
             (this.deviceIdType!=null &&
              this.deviceIdType.equals(other.getDeviceIdType()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.parentIdType==null && other.getParentIdType()==null) || 
             (this.parentIdType!=null &&
              this.parentIdType.equals(other.getParentIdType()))) &&
            ((this.hostTypeName==null && other.getHostTypeName()==null) || 
             (this.hostTypeName!=null &&
              this.hostTypeName.equals(other.getHostTypeName()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.currentOwnerName==null && other.getCurrentOwnerName()==null) || 
             (this.currentOwnerName!=null &&
              this.currentOwnerName.equals(other.getCurrentOwnerName()))) &&
            ((this.organizationUnitName==null && other.getOrganizationUnitName()==null) || 
             (this.organizationUnitName!=null &&
              this.organizationUnitName.equals(other.getOrganizationUnitName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.servedStatus==null && other.getServedStatus()==null) || 
             (this.servedStatus!=null &&
              this.servedStatus.equals(other.getServedStatus()))) &&
            ((this.preBuiltProductName==null && other.getPreBuiltProductName()==null) || 
             (this.preBuiltProductName!=null &&
              this.preBuiltProductName.equals(other.getPreBuiltProductName()))) &&
            ((this.preBuiltProductVersion==null && other.getPreBuiltProductVersion()==null) || 
             (this.preBuiltProductVersion!=null &&
              this.preBuiltProductVersion.equals(other.getPreBuiltProductVersion()))) &&
            ((this.addOnActivationId==null && other.getAddOnActivationId()==null) || 
             (this.addOnActivationId!=null &&
              this.addOnActivationId.equals(other.getAddOnActivationId()))) &&
            ((this.addOnProductName==null && other.getAddOnProductName()==null) || 
             (this.addOnProductName!=null &&
              this.addOnProductName.equals(other.getAddOnProductName()))) &&
            ((this.addOnProductVersion==null && other.getAddOnProductVersion()==null) || 
             (this.addOnProductVersion!=null &&
              this.addOnProductVersion.equals(other.getAddOnProductVersion()))) &&
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
            ((this.isServer==null && other.getIsServer()==null) || 
             (this.isServer!=null &&
              this.isServer.equals(other.getIsServer()))) &&
            ((this.deviceTypes==null && other.getDeviceTypes()==null) || 
             (this.deviceTypes!=null &&
              this.deviceTypes.equals(other.getDeviceTypes()))) &&
            ((this.customAttributes==null && other.getCustomAttributes()==null) || 
             (this.customAttributes!=null &&
              this.customAttributes.equals(other.getCustomAttributes()))) &&
            ((this.machineType==null && other.getMachineType()==null) || 
             (this.machineType!=null &&
              this.machineType.equals(other.getMachineType()))) &&
            ((this.vmName==null && other.getVmName()==null) || 
             (this.vmName!=null &&
              this.vmName.equals(other.getVmName())));
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
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getDeviceIdType() != null) {
            _hashCode += getDeviceIdType().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getParentIdType() != null) {
            _hashCode += getParentIdType().hashCode();
        }
        if (getHostTypeName() != null) {
            _hashCode += getHostTypeName().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getCurrentOwnerName() != null) {
            _hashCode += getCurrentOwnerName().hashCode();
        }
        if (getOrganizationUnitName() != null) {
            _hashCode += getOrganizationUnitName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getServedStatus() != null) {
            _hashCode += getServedStatus().hashCode();
        }
        if (getPreBuiltProductName() != null) {
            _hashCode += getPreBuiltProductName().hashCode();
        }
        if (getPreBuiltProductVersion() != null) {
            _hashCode += getPreBuiltProductVersion().hashCode();
        }
        if (getAddOnActivationId() != null) {
            _hashCode += getAddOnActivationId().hashCode();
        }
        if (getAddOnProductName() != null) {
            _hashCode += getAddOnProductName().hashCode();
        }
        if (getAddOnProductVersion() != null) {
            _hashCode += getAddOnProductVersion().hashCode();
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
        if (getIsServer() != null) {
            _hashCode += getIsServer().hashCode();
        }
        if (getDeviceTypes() != null) {
            _hashCode += getDeviceTypes().hashCode();
        }
        if (getCustomAttributes() != null) {
            _hashCode += getCustomAttributes().hashCode();
        }
        if (getMachineType() != null) {
            _hashCode += getMachineType().hashCode();
        }
        if (getVmName() != null) {
            _hashCode += getVmName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDevicesParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDevicesParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
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
        elemField.setFieldName("deviceIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DeviceIdTypeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "parentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "parentIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DeviceIdTypeQueryType"));
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
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "soldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentOwnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "currentOwnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "organizationUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "PartnerTierQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DeviceStateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "servedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DeviceServedStateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preBuiltProductName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "preBuiltProductName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preBuiltProductVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "preBuiltProductVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addOnActivationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "addOnActivationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addOnProductName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "addOnProductName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addOnProductVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "addOnProductVersion"));
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
        elemField.setFieldName("isServer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "isServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceTypeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "customAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "customAttributesQueryListType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "vmName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
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
