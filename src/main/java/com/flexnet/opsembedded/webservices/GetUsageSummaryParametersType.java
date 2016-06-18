/**
 * GetUsageSummaryParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GetUsageSummaryParametersType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.ExternalIdQueryType activationUniqueId;

    private com.flexnet.opsembedded.webservices.SimpleQueryType activationId;

    private com.flexnet.opsembedded.webservices.ExternalIdQueryType entitlementUniqueId;

    private com.flexnet.opsembedded.webservices.SimpleQueryType entitlementId;

    private com.flexnet.opsembedded.webservices.NumberQueryType usedCount;

    private com.flexnet.opsembedded.webservices.NumberQueryType usedExceedsOrderedBy;

    private com.flexnet.opsembedded.webservices.NumberQueryType usedExceedsProvisionedBy;

    private com.flexnet.opsembedded.webservices.PartnerTierQueryType organizationUnitName;

    private com.flexnet.opsembedded.webservices.ExternalIdQueryType soldToUniqueId;

    private com.flexnet.opsembedded.webservices.ExternalIdQueryType orderableUniqueId;

    private com.flexnet.opsembedded.webservices.SimpleQueryType orderableName;

    private com.flexnet.opsembedded.webservices.SimpleQueryType orderableVersion;

    private com.flexnet.opsembedded.webservices.ExternalIdQueryType serverUniqueId;

    private com.flexnet.opsembedded.webservices.SimpleQueryType serverId;

    private com.flexnet.opsembedded.webservices.SimpleQueryType serverAlias;

    private com.flexnet.opsembedded.webservices.ExternalIdQueryType summaryTimeUniqueId;

    private com.flexnet.opsembedded.webservices.DateTimeQueryType summaryTime;

    private com.flexnet.opsembedded.webservices.UsageSummaryGroupByType groupBy;

    public GetUsageSummaryParametersType() {
    }

    public GetUsageSummaryParametersType(
           com.flexnet.opsembedded.webservices.ExternalIdQueryType activationUniqueId,
           com.flexnet.opsembedded.webservices.SimpleQueryType activationId,
           com.flexnet.opsembedded.webservices.ExternalIdQueryType entitlementUniqueId,
           com.flexnet.opsembedded.webservices.SimpleQueryType entitlementId,
           com.flexnet.opsembedded.webservices.NumberQueryType usedCount,
           com.flexnet.opsembedded.webservices.NumberQueryType usedExceedsOrderedBy,
           com.flexnet.opsembedded.webservices.NumberQueryType usedExceedsProvisionedBy,
           com.flexnet.opsembedded.webservices.PartnerTierQueryType organizationUnitName,
           com.flexnet.opsembedded.webservices.ExternalIdQueryType soldToUniqueId,
           com.flexnet.opsembedded.webservices.ExternalIdQueryType orderableUniqueId,
           com.flexnet.opsembedded.webservices.SimpleQueryType orderableName,
           com.flexnet.opsembedded.webservices.SimpleQueryType orderableVersion,
           com.flexnet.opsembedded.webservices.ExternalIdQueryType serverUniqueId,
           com.flexnet.opsembedded.webservices.SimpleQueryType serverId,
           com.flexnet.opsembedded.webservices.SimpleQueryType serverAlias,
           com.flexnet.opsembedded.webservices.ExternalIdQueryType summaryTimeUniqueId,
           com.flexnet.opsembedded.webservices.DateTimeQueryType summaryTime,
           com.flexnet.opsembedded.webservices.UsageSummaryGroupByType groupBy) {
           this.activationUniqueId = activationUniqueId;
           this.activationId = activationId;
           this.entitlementUniqueId = entitlementUniqueId;
           this.entitlementId = entitlementId;
           this.usedCount = usedCount;
           this.usedExceedsOrderedBy = usedExceedsOrderedBy;
           this.usedExceedsProvisionedBy = usedExceedsProvisionedBy;
           this.organizationUnitName = organizationUnitName;
           this.soldToUniqueId = soldToUniqueId;
           this.orderableUniqueId = orderableUniqueId;
           this.orderableName = orderableName;
           this.orderableVersion = orderableVersion;
           this.serverUniqueId = serverUniqueId;
           this.serverId = serverId;
           this.serverAlias = serverAlias;
           this.summaryTimeUniqueId = summaryTimeUniqueId;
           this.summaryTime = summaryTime;
           this.groupBy = groupBy;
    }


    /**
     * Gets the activationUniqueId value for this GetUsageSummaryParametersType.
     * 
     * @return activationUniqueId
     */
    public com.flexnet.opsembedded.webservices.ExternalIdQueryType getActivationUniqueId() {
        return activationUniqueId;
    }


    /**
     * Sets the activationUniqueId value for this GetUsageSummaryParametersType.
     * 
     * @param activationUniqueId
     */
    public void setActivationUniqueId(com.flexnet.opsembedded.webservices.ExternalIdQueryType activationUniqueId) {
        this.activationUniqueId = activationUniqueId;
    }


    /**
     * Gets the activationId value for this GetUsageSummaryParametersType.
     * 
     * @return activationId
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getActivationId() {
        return activationId;
    }


    /**
     * Sets the activationId value for this GetUsageSummaryParametersType.
     * 
     * @param activationId
     */
    public void setActivationId(com.flexnet.opsembedded.webservices.SimpleQueryType activationId) {
        this.activationId = activationId;
    }


    /**
     * Gets the entitlementUniqueId value for this GetUsageSummaryParametersType.
     * 
     * @return entitlementUniqueId
     */
    public com.flexnet.opsembedded.webservices.ExternalIdQueryType getEntitlementUniqueId() {
        return entitlementUniqueId;
    }


    /**
     * Sets the entitlementUniqueId value for this GetUsageSummaryParametersType.
     * 
     * @param entitlementUniqueId
     */
    public void setEntitlementUniqueId(com.flexnet.opsembedded.webservices.ExternalIdQueryType entitlementUniqueId) {
        this.entitlementUniqueId = entitlementUniqueId;
    }


    /**
     * Gets the entitlementId value for this GetUsageSummaryParametersType.
     * 
     * @return entitlementId
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getEntitlementId() {
        return entitlementId;
    }


    /**
     * Sets the entitlementId value for this GetUsageSummaryParametersType.
     * 
     * @param entitlementId
     */
    public void setEntitlementId(com.flexnet.opsembedded.webservices.SimpleQueryType entitlementId) {
        this.entitlementId = entitlementId;
    }


    /**
     * Gets the usedCount value for this GetUsageSummaryParametersType.
     * 
     * @return usedCount
     */
    public com.flexnet.opsembedded.webservices.NumberQueryType getUsedCount() {
        return usedCount;
    }


    /**
     * Sets the usedCount value for this GetUsageSummaryParametersType.
     * 
     * @param usedCount
     */
    public void setUsedCount(com.flexnet.opsembedded.webservices.NumberQueryType usedCount) {
        this.usedCount = usedCount;
    }


    /**
     * Gets the usedExceedsOrderedBy value for this GetUsageSummaryParametersType.
     * 
     * @return usedExceedsOrderedBy
     */
    public com.flexnet.opsembedded.webservices.NumberQueryType getUsedExceedsOrderedBy() {
        return usedExceedsOrderedBy;
    }


    /**
     * Sets the usedExceedsOrderedBy value for this GetUsageSummaryParametersType.
     * 
     * @param usedExceedsOrderedBy
     */
    public void setUsedExceedsOrderedBy(com.flexnet.opsembedded.webservices.NumberQueryType usedExceedsOrderedBy) {
        this.usedExceedsOrderedBy = usedExceedsOrderedBy;
    }


    /**
     * Gets the usedExceedsProvisionedBy value for this GetUsageSummaryParametersType.
     * 
     * @return usedExceedsProvisionedBy
     */
    public com.flexnet.opsembedded.webservices.NumberQueryType getUsedExceedsProvisionedBy() {
        return usedExceedsProvisionedBy;
    }


    /**
     * Sets the usedExceedsProvisionedBy value for this GetUsageSummaryParametersType.
     * 
     * @param usedExceedsProvisionedBy
     */
    public void setUsedExceedsProvisionedBy(com.flexnet.opsembedded.webservices.NumberQueryType usedExceedsProvisionedBy) {
        this.usedExceedsProvisionedBy = usedExceedsProvisionedBy;
    }


    /**
     * Gets the organizationUnitName value for this GetUsageSummaryParametersType.
     * 
     * @return organizationUnitName
     */
    public com.flexnet.opsembedded.webservices.PartnerTierQueryType getOrganizationUnitName() {
        return organizationUnitName;
    }


    /**
     * Sets the organizationUnitName value for this GetUsageSummaryParametersType.
     * 
     * @param organizationUnitName
     */
    public void setOrganizationUnitName(com.flexnet.opsembedded.webservices.PartnerTierQueryType organizationUnitName) {
        this.organizationUnitName = organizationUnitName;
    }


    /**
     * Gets the soldToUniqueId value for this GetUsageSummaryParametersType.
     * 
     * @return soldToUniqueId
     */
    public com.flexnet.opsembedded.webservices.ExternalIdQueryType getSoldToUniqueId() {
        return soldToUniqueId;
    }


    /**
     * Sets the soldToUniqueId value for this GetUsageSummaryParametersType.
     * 
     * @param soldToUniqueId
     */
    public void setSoldToUniqueId(com.flexnet.opsembedded.webservices.ExternalIdQueryType soldToUniqueId) {
        this.soldToUniqueId = soldToUniqueId;
    }


    /**
     * Gets the orderableUniqueId value for this GetUsageSummaryParametersType.
     * 
     * @return orderableUniqueId
     */
    public com.flexnet.opsembedded.webservices.ExternalIdQueryType getOrderableUniqueId() {
        return orderableUniqueId;
    }


    /**
     * Sets the orderableUniqueId value for this GetUsageSummaryParametersType.
     * 
     * @param orderableUniqueId
     */
    public void setOrderableUniqueId(com.flexnet.opsembedded.webservices.ExternalIdQueryType orderableUniqueId) {
        this.orderableUniqueId = orderableUniqueId;
    }


    /**
     * Gets the orderableName value for this GetUsageSummaryParametersType.
     * 
     * @return orderableName
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getOrderableName() {
        return orderableName;
    }


    /**
     * Sets the orderableName value for this GetUsageSummaryParametersType.
     * 
     * @param orderableName
     */
    public void setOrderableName(com.flexnet.opsembedded.webservices.SimpleQueryType orderableName) {
        this.orderableName = orderableName;
    }


    /**
     * Gets the orderableVersion value for this GetUsageSummaryParametersType.
     * 
     * @return orderableVersion
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getOrderableVersion() {
        return orderableVersion;
    }


    /**
     * Sets the orderableVersion value for this GetUsageSummaryParametersType.
     * 
     * @param orderableVersion
     */
    public void setOrderableVersion(com.flexnet.opsembedded.webservices.SimpleQueryType orderableVersion) {
        this.orderableVersion = orderableVersion;
    }


    /**
     * Gets the serverUniqueId value for this GetUsageSummaryParametersType.
     * 
     * @return serverUniqueId
     */
    public com.flexnet.opsembedded.webservices.ExternalIdQueryType getServerUniqueId() {
        return serverUniqueId;
    }


    /**
     * Sets the serverUniqueId value for this GetUsageSummaryParametersType.
     * 
     * @param serverUniqueId
     */
    public void setServerUniqueId(com.flexnet.opsembedded.webservices.ExternalIdQueryType serverUniqueId) {
        this.serverUniqueId = serverUniqueId;
    }


    /**
     * Gets the serverId value for this GetUsageSummaryParametersType.
     * 
     * @return serverId
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getServerId() {
        return serverId;
    }


    /**
     * Sets the serverId value for this GetUsageSummaryParametersType.
     * 
     * @param serverId
     */
    public void setServerId(com.flexnet.opsembedded.webservices.SimpleQueryType serverId) {
        this.serverId = serverId;
    }


    /**
     * Gets the serverAlias value for this GetUsageSummaryParametersType.
     * 
     * @return serverAlias
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getServerAlias() {
        return serverAlias;
    }


    /**
     * Sets the serverAlias value for this GetUsageSummaryParametersType.
     * 
     * @param serverAlias
     */
    public void setServerAlias(com.flexnet.opsembedded.webservices.SimpleQueryType serverAlias) {
        this.serverAlias = serverAlias;
    }


    /**
     * Gets the summaryTimeUniqueId value for this GetUsageSummaryParametersType.
     * 
     * @return summaryTimeUniqueId
     */
    public com.flexnet.opsembedded.webservices.ExternalIdQueryType getSummaryTimeUniqueId() {
        return summaryTimeUniqueId;
    }


    /**
     * Sets the summaryTimeUniqueId value for this GetUsageSummaryParametersType.
     * 
     * @param summaryTimeUniqueId
     */
    public void setSummaryTimeUniqueId(com.flexnet.opsembedded.webservices.ExternalIdQueryType summaryTimeUniqueId) {
        this.summaryTimeUniqueId = summaryTimeUniqueId;
    }


    /**
     * Gets the summaryTime value for this GetUsageSummaryParametersType.
     * 
     * @return summaryTime
     */
    public com.flexnet.opsembedded.webservices.DateTimeQueryType getSummaryTime() {
        return summaryTime;
    }


    /**
     * Sets the summaryTime value for this GetUsageSummaryParametersType.
     * 
     * @param summaryTime
     */
    public void setSummaryTime(com.flexnet.opsembedded.webservices.DateTimeQueryType summaryTime) {
        this.summaryTime = summaryTime;
    }


    /**
     * Gets the groupBy value for this GetUsageSummaryParametersType.
     * 
     * @return groupBy
     */
    public com.flexnet.opsembedded.webservices.UsageSummaryGroupByType getGroupBy() {
        return groupBy;
    }


    /**
     * Sets the groupBy value for this GetUsageSummaryParametersType.
     * 
     * @param groupBy
     */
    public void setGroupBy(com.flexnet.opsembedded.webservices.UsageSummaryGroupByType groupBy) {
        this.groupBy = groupBy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUsageSummaryParametersType)) return false;
        GetUsageSummaryParametersType other = (GetUsageSummaryParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activationUniqueId==null && other.getActivationUniqueId()==null) || 
             (this.activationUniqueId!=null &&
              this.activationUniqueId.equals(other.getActivationUniqueId()))) &&
            ((this.activationId==null && other.getActivationId()==null) || 
             (this.activationId!=null &&
              this.activationId.equals(other.getActivationId()))) &&
            ((this.entitlementUniqueId==null && other.getEntitlementUniqueId()==null) || 
             (this.entitlementUniqueId!=null &&
              this.entitlementUniqueId.equals(other.getEntitlementUniqueId()))) &&
            ((this.entitlementId==null && other.getEntitlementId()==null) || 
             (this.entitlementId!=null &&
              this.entitlementId.equals(other.getEntitlementId()))) &&
            ((this.usedCount==null && other.getUsedCount()==null) || 
             (this.usedCount!=null &&
              this.usedCount.equals(other.getUsedCount()))) &&
            ((this.usedExceedsOrderedBy==null && other.getUsedExceedsOrderedBy()==null) || 
             (this.usedExceedsOrderedBy!=null &&
              this.usedExceedsOrderedBy.equals(other.getUsedExceedsOrderedBy()))) &&
            ((this.usedExceedsProvisionedBy==null && other.getUsedExceedsProvisionedBy()==null) || 
             (this.usedExceedsProvisionedBy!=null &&
              this.usedExceedsProvisionedBy.equals(other.getUsedExceedsProvisionedBy()))) &&
            ((this.organizationUnitName==null && other.getOrganizationUnitName()==null) || 
             (this.organizationUnitName!=null &&
              this.organizationUnitName.equals(other.getOrganizationUnitName()))) &&
            ((this.soldToUniqueId==null && other.getSoldToUniqueId()==null) || 
             (this.soldToUniqueId!=null &&
              this.soldToUniqueId.equals(other.getSoldToUniqueId()))) &&
            ((this.orderableUniqueId==null && other.getOrderableUniqueId()==null) || 
             (this.orderableUniqueId!=null &&
              this.orderableUniqueId.equals(other.getOrderableUniqueId()))) &&
            ((this.orderableName==null && other.getOrderableName()==null) || 
             (this.orderableName!=null &&
              this.orderableName.equals(other.getOrderableName()))) &&
            ((this.orderableVersion==null && other.getOrderableVersion()==null) || 
             (this.orderableVersion!=null &&
              this.orderableVersion.equals(other.getOrderableVersion()))) &&
            ((this.serverUniqueId==null && other.getServerUniqueId()==null) || 
             (this.serverUniqueId!=null &&
              this.serverUniqueId.equals(other.getServerUniqueId()))) &&
            ((this.serverId==null && other.getServerId()==null) || 
             (this.serverId!=null &&
              this.serverId.equals(other.getServerId()))) &&
            ((this.serverAlias==null && other.getServerAlias()==null) || 
             (this.serverAlias!=null &&
              this.serverAlias.equals(other.getServerAlias()))) &&
            ((this.summaryTimeUniqueId==null && other.getSummaryTimeUniqueId()==null) || 
             (this.summaryTimeUniqueId!=null &&
              this.summaryTimeUniqueId.equals(other.getSummaryTimeUniqueId()))) &&
            ((this.summaryTime==null && other.getSummaryTime()==null) || 
             (this.summaryTime!=null &&
              this.summaryTime.equals(other.getSummaryTime()))) &&
            ((this.groupBy==null && other.getGroupBy()==null) || 
             (this.groupBy!=null &&
              this.groupBy.equals(other.getGroupBy())));
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
        if (getActivationUniqueId() != null) {
            _hashCode += getActivationUniqueId().hashCode();
        }
        if (getActivationId() != null) {
            _hashCode += getActivationId().hashCode();
        }
        if (getEntitlementUniqueId() != null) {
            _hashCode += getEntitlementUniqueId().hashCode();
        }
        if (getEntitlementId() != null) {
            _hashCode += getEntitlementId().hashCode();
        }
        if (getUsedCount() != null) {
            _hashCode += getUsedCount().hashCode();
        }
        if (getUsedExceedsOrderedBy() != null) {
            _hashCode += getUsedExceedsOrderedBy().hashCode();
        }
        if (getUsedExceedsProvisionedBy() != null) {
            _hashCode += getUsedExceedsProvisionedBy().hashCode();
        }
        if (getOrganizationUnitName() != null) {
            _hashCode += getOrganizationUnitName().hashCode();
        }
        if (getSoldToUniqueId() != null) {
            _hashCode += getSoldToUniqueId().hashCode();
        }
        if (getOrderableUniqueId() != null) {
            _hashCode += getOrderableUniqueId().hashCode();
        }
        if (getOrderableName() != null) {
            _hashCode += getOrderableName().hashCode();
        }
        if (getOrderableVersion() != null) {
            _hashCode += getOrderableVersion().hashCode();
        }
        if (getServerUniqueId() != null) {
            _hashCode += getServerUniqueId().hashCode();
        }
        if (getServerId() != null) {
            _hashCode += getServerId().hashCode();
        }
        if (getServerAlias() != null) {
            _hashCode += getServerAlias().hashCode();
        }
        if (getSummaryTimeUniqueId() != null) {
            _hashCode += getSummaryTimeUniqueId().hashCode();
        }
        if (getSummaryTime() != null) {
            _hashCode += getSummaryTime().hashCode();
        }
        if (getGroupBy() != null) {
            _hashCode += getGroupBy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUsageSummaryParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "activationUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "ExternalIdQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "activationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "entitlementUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "ExternalIdQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "entitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "NumberQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedExceedsOrderedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usedExceedsOrderedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "NumberQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedExceedsProvisionedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usedExceedsProvisionedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "NumberQueryType"));
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
        elemField.setFieldName("soldToUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "soldToUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "ExternalIdQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderableUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "orderableUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "ExternalIdQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderableName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "orderableName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderableVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "orderableVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
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
        elemField.setFieldName("serverAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "serverAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryTimeUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "summaryTimeUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "ExternalIdQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "summaryTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "groupBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usageSummaryGroupByType"));
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
