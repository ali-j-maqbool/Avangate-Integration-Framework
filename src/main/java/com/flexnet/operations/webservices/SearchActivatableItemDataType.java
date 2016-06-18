/**
 * SearchActivatableItemDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class SearchActivatableItemDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SimpleQueryType parentBulkEntitlementId;

    private com.flexnet.operations.webservices.SimpleQueryType entitlementId;

    private com.flexnet.operations.webservices.SimpleQueryType activationId;

    private com.flexnet.operations.webservices.SimpleQueryType productName;

    private com.flexnet.operations.webservices.SimpleQueryType productVersion;

    private com.flexnet.operations.webservices.ProductType productType;

    private com.flexnet.operations.webservices.SimpleQueryType partNumber;

    private com.flexnet.operations.webservices.DateQueryType startDate;

    private java.lang.Boolean isPermanent;

    private com.flexnet.operations.webservices.DateQueryType expirationDate;

    private com.flexnet.operations.webservices.DateQueryType versionDate;

    private com.flexnet.operations.webservices.SimpleQueryType licenseTechnology;

    private com.flexnet.operations.webservices.SimpleQueryType orderId;

    private java.lang.Boolean withNoOrderId;

    private java.lang.Boolean restrictToItemsWithCount;

    private com.flexnet.operations.webservices.NumberQueryType fulfilledAmount;

    private java.lang.String userId;

    private com.flexnet.operations.webservices.CustomAttributesQueryListType customAttributes;

    private com.flexnet.operations.webservices.SimpleQueryType soldTo;

    private com.flexnet.operations.webservices.SimpleQueryType parentBulkEntSoldTo;

    private com.flexnet.operations.webservices.ActivatableItemType activatableItemType;

    private java.lang.Boolean allowPortalLogin;

    private com.flexnet.operations.webservices.PartnerTierQueryType organizationUnitName;

    private com.flexnet.operations.webservices.SimpleQueryType currentOwnerName;

    private com.flexnet.operations.webservices.SimpleQueryType lineItemParentLineItemId;

    private com.flexnet.operations.webservices.DateTimeQueryType createdOnDateTime;

    private com.flexnet.operations.webservices.DateTimeQueryType lastModifiedDateTime;

    private com.flexnet.operations.webservices.LineItemCustomAttributesQueryListType lineItemAttributes;

    public SearchActivatableItemDataType() {
    }

    public SearchActivatableItemDataType(
           com.flexnet.operations.webservices.SimpleQueryType parentBulkEntitlementId,
           com.flexnet.operations.webservices.SimpleQueryType entitlementId,
           com.flexnet.operations.webservices.SimpleQueryType activationId,
           com.flexnet.operations.webservices.SimpleQueryType productName,
           com.flexnet.operations.webservices.SimpleQueryType productVersion,
           com.flexnet.operations.webservices.ProductType productType,
           com.flexnet.operations.webservices.SimpleQueryType partNumber,
           com.flexnet.operations.webservices.DateQueryType startDate,
           java.lang.Boolean isPermanent,
           com.flexnet.operations.webservices.DateQueryType expirationDate,
           com.flexnet.operations.webservices.DateQueryType versionDate,
           com.flexnet.operations.webservices.SimpleQueryType licenseTechnology,
           com.flexnet.operations.webservices.SimpleQueryType orderId,
           java.lang.Boolean withNoOrderId,
           java.lang.Boolean restrictToItemsWithCount,
           com.flexnet.operations.webservices.NumberQueryType fulfilledAmount,
           java.lang.String userId,
           com.flexnet.operations.webservices.CustomAttributesQueryListType customAttributes,
           com.flexnet.operations.webservices.SimpleQueryType soldTo,
           com.flexnet.operations.webservices.SimpleQueryType parentBulkEntSoldTo,
           com.flexnet.operations.webservices.ActivatableItemType activatableItemType,
           java.lang.Boolean allowPortalLogin,
           com.flexnet.operations.webservices.PartnerTierQueryType organizationUnitName,
           com.flexnet.operations.webservices.SimpleQueryType currentOwnerName,
           com.flexnet.operations.webservices.SimpleQueryType lineItemParentLineItemId,
           com.flexnet.operations.webservices.DateTimeQueryType createdOnDateTime,
           com.flexnet.operations.webservices.DateTimeQueryType lastModifiedDateTime,
           com.flexnet.operations.webservices.LineItemCustomAttributesQueryListType lineItemAttributes) {
           this.parentBulkEntitlementId = parentBulkEntitlementId;
           this.entitlementId = entitlementId;
           this.activationId = activationId;
           this.productName = productName;
           this.productVersion = productVersion;
           this.productType = productType;
           this.partNumber = partNumber;
           this.startDate = startDate;
           this.isPermanent = isPermanent;
           this.expirationDate = expirationDate;
           this.versionDate = versionDate;
           this.licenseTechnology = licenseTechnology;
           this.orderId = orderId;
           this.withNoOrderId = withNoOrderId;
           this.restrictToItemsWithCount = restrictToItemsWithCount;
           this.fulfilledAmount = fulfilledAmount;
           this.userId = userId;
           this.customAttributes = customAttributes;
           this.soldTo = soldTo;
           this.parentBulkEntSoldTo = parentBulkEntSoldTo;
           this.activatableItemType = activatableItemType;
           this.allowPortalLogin = allowPortalLogin;
           this.organizationUnitName = organizationUnitName;
           this.currentOwnerName = currentOwnerName;
           this.lineItemParentLineItemId = lineItemParentLineItemId;
           this.createdOnDateTime = createdOnDateTime;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.lineItemAttributes = lineItemAttributes;
    }


    /**
     * Gets the parentBulkEntitlementId value for this SearchActivatableItemDataType.
     * 
     * @return parentBulkEntitlementId
     */
    public com.flexnet.operations.webservices.SimpleQueryType getParentBulkEntitlementId() {
        return parentBulkEntitlementId;
    }


    /**
     * Sets the parentBulkEntitlementId value for this SearchActivatableItemDataType.
     * 
     * @param parentBulkEntitlementId
     */
    public void setParentBulkEntitlementId(com.flexnet.operations.webservices.SimpleQueryType parentBulkEntitlementId) {
        this.parentBulkEntitlementId = parentBulkEntitlementId;
    }


    /**
     * Gets the entitlementId value for this SearchActivatableItemDataType.
     * 
     * @return entitlementId
     */
    public com.flexnet.operations.webservices.SimpleQueryType getEntitlementId() {
        return entitlementId;
    }


    /**
     * Sets the entitlementId value for this SearchActivatableItemDataType.
     * 
     * @param entitlementId
     */
    public void setEntitlementId(com.flexnet.operations.webservices.SimpleQueryType entitlementId) {
        this.entitlementId = entitlementId;
    }


    /**
     * Gets the activationId value for this SearchActivatableItemDataType.
     * 
     * @return activationId
     */
    public com.flexnet.operations.webservices.SimpleQueryType getActivationId() {
        return activationId;
    }


    /**
     * Sets the activationId value for this SearchActivatableItemDataType.
     * 
     * @param activationId
     */
    public void setActivationId(com.flexnet.operations.webservices.SimpleQueryType activationId) {
        this.activationId = activationId;
    }


    /**
     * Gets the productName value for this SearchActivatableItemDataType.
     * 
     * @return productName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this SearchActivatableItemDataType.
     * 
     * @param productName
     */
    public void setProductName(com.flexnet.operations.webservices.SimpleQueryType productName) {
        this.productName = productName;
    }


    /**
     * Gets the productVersion value for this SearchActivatableItemDataType.
     * 
     * @return productVersion
     */
    public com.flexnet.operations.webservices.SimpleQueryType getProductVersion() {
        return productVersion;
    }


    /**
     * Sets the productVersion value for this SearchActivatableItemDataType.
     * 
     * @param productVersion
     */
    public void setProductVersion(com.flexnet.operations.webservices.SimpleQueryType productVersion) {
        this.productVersion = productVersion;
    }


    /**
     * Gets the productType value for this SearchActivatableItemDataType.
     * 
     * @return productType
     */
    public com.flexnet.operations.webservices.ProductType getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this SearchActivatableItemDataType.
     * 
     * @param productType
     */
    public void setProductType(com.flexnet.operations.webservices.ProductType productType) {
        this.productType = productType;
    }


    /**
     * Gets the partNumber value for this SearchActivatableItemDataType.
     * 
     * @return partNumber
     */
    public com.flexnet.operations.webservices.SimpleQueryType getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this SearchActivatableItemDataType.
     * 
     * @param partNumber
     */
    public void setPartNumber(com.flexnet.operations.webservices.SimpleQueryType partNumber) {
        this.partNumber = partNumber;
    }


    /**
     * Gets the startDate value for this SearchActivatableItemDataType.
     * 
     * @return startDate
     */
    public com.flexnet.operations.webservices.DateQueryType getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SearchActivatableItemDataType.
     * 
     * @param startDate
     */
    public void setStartDate(com.flexnet.operations.webservices.DateQueryType startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the isPermanent value for this SearchActivatableItemDataType.
     * 
     * @return isPermanent
     */
    public java.lang.Boolean getIsPermanent() {
        return isPermanent;
    }


    /**
     * Sets the isPermanent value for this SearchActivatableItemDataType.
     * 
     * @param isPermanent
     */
    public void setIsPermanent(java.lang.Boolean isPermanent) {
        this.isPermanent = isPermanent;
    }


    /**
     * Gets the expirationDate value for this SearchActivatableItemDataType.
     * 
     * @return expirationDate
     */
    public com.flexnet.operations.webservices.DateQueryType getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this SearchActivatableItemDataType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(com.flexnet.operations.webservices.DateQueryType expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the versionDate value for this SearchActivatableItemDataType.
     * 
     * @return versionDate
     */
    public com.flexnet.operations.webservices.DateQueryType getVersionDate() {
        return versionDate;
    }


    /**
     * Sets the versionDate value for this SearchActivatableItemDataType.
     * 
     * @param versionDate
     */
    public void setVersionDate(com.flexnet.operations.webservices.DateQueryType versionDate) {
        this.versionDate = versionDate;
    }


    /**
     * Gets the licenseTechnology value for this SearchActivatableItemDataType.
     * 
     * @return licenseTechnology
     */
    public com.flexnet.operations.webservices.SimpleQueryType getLicenseTechnology() {
        return licenseTechnology;
    }


    /**
     * Sets the licenseTechnology value for this SearchActivatableItemDataType.
     * 
     * @param licenseTechnology
     */
    public void setLicenseTechnology(com.flexnet.operations.webservices.SimpleQueryType licenseTechnology) {
        this.licenseTechnology = licenseTechnology;
    }


    /**
     * Gets the orderId value for this SearchActivatableItemDataType.
     * 
     * @return orderId
     */
    public com.flexnet.operations.webservices.SimpleQueryType getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SearchActivatableItemDataType.
     * 
     * @param orderId
     */
    public void setOrderId(com.flexnet.operations.webservices.SimpleQueryType orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the withNoOrderId value for this SearchActivatableItemDataType.
     * 
     * @return withNoOrderId
     */
    public java.lang.Boolean getWithNoOrderId() {
        return withNoOrderId;
    }


    /**
     * Sets the withNoOrderId value for this SearchActivatableItemDataType.
     * 
     * @param withNoOrderId
     */
    public void setWithNoOrderId(java.lang.Boolean withNoOrderId) {
        this.withNoOrderId = withNoOrderId;
    }


    /**
     * Gets the restrictToItemsWithCount value for this SearchActivatableItemDataType.
     * 
     * @return restrictToItemsWithCount
     */
    public java.lang.Boolean getRestrictToItemsWithCount() {
        return restrictToItemsWithCount;
    }


    /**
     * Sets the restrictToItemsWithCount value for this SearchActivatableItemDataType.
     * 
     * @param restrictToItemsWithCount
     */
    public void setRestrictToItemsWithCount(java.lang.Boolean restrictToItemsWithCount) {
        this.restrictToItemsWithCount = restrictToItemsWithCount;
    }


    /**
     * Gets the fulfilledAmount value for this SearchActivatableItemDataType.
     * 
     * @return fulfilledAmount
     */
    public com.flexnet.operations.webservices.NumberQueryType getFulfilledAmount() {
        return fulfilledAmount;
    }


    /**
     * Sets the fulfilledAmount value for this SearchActivatableItemDataType.
     * 
     * @param fulfilledAmount
     */
    public void setFulfilledAmount(com.flexnet.operations.webservices.NumberQueryType fulfilledAmount) {
        this.fulfilledAmount = fulfilledAmount;
    }


    /**
     * Gets the userId value for this SearchActivatableItemDataType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SearchActivatableItemDataType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the customAttributes value for this SearchActivatableItemDataType.
     * 
     * @return customAttributes
     */
    public com.flexnet.operations.webservices.CustomAttributesQueryListType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this SearchActivatableItemDataType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.operations.webservices.CustomAttributesQueryListType customAttributes) {
        this.customAttributes = customAttributes;
    }


    /**
     * Gets the soldTo value for this SearchActivatableItemDataType.
     * 
     * @return soldTo
     */
    public com.flexnet.operations.webservices.SimpleQueryType getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this SearchActivatableItemDataType.
     * 
     * @param soldTo
     */
    public void setSoldTo(com.flexnet.operations.webservices.SimpleQueryType soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the parentBulkEntSoldTo value for this SearchActivatableItemDataType.
     * 
     * @return parentBulkEntSoldTo
     */
    public com.flexnet.operations.webservices.SimpleQueryType getParentBulkEntSoldTo() {
        return parentBulkEntSoldTo;
    }


    /**
     * Sets the parentBulkEntSoldTo value for this SearchActivatableItemDataType.
     * 
     * @param parentBulkEntSoldTo
     */
    public void setParentBulkEntSoldTo(com.flexnet.operations.webservices.SimpleQueryType parentBulkEntSoldTo) {
        this.parentBulkEntSoldTo = parentBulkEntSoldTo;
    }


    /**
     * Gets the activatableItemType value for this SearchActivatableItemDataType.
     * 
     * @return activatableItemType
     */
    public com.flexnet.operations.webservices.ActivatableItemType getActivatableItemType() {
        return activatableItemType;
    }


    /**
     * Sets the activatableItemType value for this SearchActivatableItemDataType.
     * 
     * @param activatableItemType
     */
    public void setActivatableItemType(com.flexnet.operations.webservices.ActivatableItemType activatableItemType) {
        this.activatableItemType = activatableItemType;
    }


    /**
     * Gets the allowPortalLogin value for this SearchActivatableItemDataType.
     * 
     * @return allowPortalLogin
     */
    public java.lang.Boolean getAllowPortalLogin() {
        return allowPortalLogin;
    }


    /**
     * Sets the allowPortalLogin value for this SearchActivatableItemDataType.
     * 
     * @param allowPortalLogin
     */
    public void setAllowPortalLogin(java.lang.Boolean allowPortalLogin) {
        this.allowPortalLogin = allowPortalLogin;
    }


    /**
     * Gets the organizationUnitName value for this SearchActivatableItemDataType.
     * 
     * @return organizationUnitName
     */
    public com.flexnet.operations.webservices.PartnerTierQueryType getOrganizationUnitName() {
        return organizationUnitName;
    }


    /**
     * Sets the organizationUnitName value for this SearchActivatableItemDataType.
     * 
     * @param organizationUnitName
     */
    public void setOrganizationUnitName(com.flexnet.operations.webservices.PartnerTierQueryType organizationUnitName) {
        this.organizationUnitName = organizationUnitName;
    }


    /**
     * Gets the currentOwnerName value for this SearchActivatableItemDataType.
     * 
     * @return currentOwnerName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getCurrentOwnerName() {
        return currentOwnerName;
    }


    /**
     * Sets the currentOwnerName value for this SearchActivatableItemDataType.
     * 
     * @param currentOwnerName
     */
    public void setCurrentOwnerName(com.flexnet.operations.webservices.SimpleQueryType currentOwnerName) {
        this.currentOwnerName = currentOwnerName;
    }


    /**
     * Gets the lineItemParentLineItemId value for this SearchActivatableItemDataType.
     * 
     * @return lineItemParentLineItemId
     */
    public com.flexnet.operations.webservices.SimpleQueryType getLineItemParentLineItemId() {
        return lineItemParentLineItemId;
    }


    /**
     * Sets the lineItemParentLineItemId value for this SearchActivatableItemDataType.
     * 
     * @param lineItemParentLineItemId
     */
    public void setLineItemParentLineItemId(com.flexnet.operations.webservices.SimpleQueryType lineItemParentLineItemId) {
        this.lineItemParentLineItemId = lineItemParentLineItemId;
    }


    /**
     * Gets the createdOnDateTime value for this SearchActivatableItemDataType.
     * 
     * @return createdOnDateTime
     */
    public com.flexnet.operations.webservices.DateTimeQueryType getCreatedOnDateTime() {
        return createdOnDateTime;
    }


    /**
     * Sets the createdOnDateTime value for this SearchActivatableItemDataType.
     * 
     * @param createdOnDateTime
     */
    public void setCreatedOnDateTime(com.flexnet.operations.webservices.DateTimeQueryType createdOnDateTime) {
        this.createdOnDateTime = createdOnDateTime;
    }


    /**
     * Gets the lastModifiedDateTime value for this SearchActivatableItemDataType.
     * 
     * @return lastModifiedDateTime
     */
    public com.flexnet.operations.webservices.DateTimeQueryType getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this SearchActivatableItemDataType.
     * 
     * @param lastModifiedDateTime
     */
    public void setLastModifiedDateTime(com.flexnet.operations.webservices.DateTimeQueryType lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the lineItemAttributes value for this SearchActivatableItemDataType.
     * 
     * @return lineItemAttributes
     */
    public com.flexnet.operations.webservices.LineItemCustomAttributesQueryListType getLineItemAttributes() {
        return lineItemAttributes;
    }


    /**
     * Sets the lineItemAttributes value for this SearchActivatableItemDataType.
     * 
     * @param lineItemAttributes
     */
    public void setLineItemAttributes(com.flexnet.operations.webservices.LineItemCustomAttributesQueryListType lineItemAttributes) {
        this.lineItemAttributes = lineItemAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchActivatableItemDataType)) return false;
        SearchActivatableItemDataType other = (SearchActivatableItemDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parentBulkEntitlementId==null && other.getParentBulkEntitlementId()==null) || 
             (this.parentBulkEntitlementId!=null &&
              this.parentBulkEntitlementId.equals(other.getParentBulkEntitlementId()))) &&
            ((this.entitlementId==null && other.getEntitlementId()==null) || 
             (this.entitlementId!=null &&
              this.entitlementId.equals(other.getEntitlementId()))) &&
            ((this.activationId==null && other.getActivationId()==null) || 
             (this.activationId!=null &&
              this.activationId.equals(other.getActivationId()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.productVersion==null && other.getProductVersion()==null) || 
             (this.productVersion!=null &&
              this.productVersion.equals(other.getProductVersion()))) &&
            ((this.productType==null && other.getProductType()==null) || 
             (this.productType!=null &&
              this.productType.equals(other.getProductType()))) &&
            ((this.partNumber==null && other.getPartNumber()==null) || 
             (this.partNumber!=null &&
              this.partNumber.equals(other.getPartNumber()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.isPermanent==null && other.getIsPermanent()==null) || 
             (this.isPermanent!=null &&
              this.isPermanent.equals(other.getIsPermanent()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.versionDate==null && other.getVersionDate()==null) || 
             (this.versionDate!=null &&
              this.versionDate.equals(other.getVersionDate()))) &&
            ((this.licenseTechnology==null && other.getLicenseTechnology()==null) || 
             (this.licenseTechnology!=null &&
              this.licenseTechnology.equals(other.getLicenseTechnology()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.withNoOrderId==null && other.getWithNoOrderId()==null) || 
             (this.withNoOrderId!=null &&
              this.withNoOrderId.equals(other.getWithNoOrderId()))) &&
            ((this.restrictToItemsWithCount==null && other.getRestrictToItemsWithCount()==null) || 
             (this.restrictToItemsWithCount!=null &&
              this.restrictToItemsWithCount.equals(other.getRestrictToItemsWithCount()))) &&
            ((this.fulfilledAmount==null && other.getFulfilledAmount()==null) || 
             (this.fulfilledAmount!=null &&
              this.fulfilledAmount.equals(other.getFulfilledAmount()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.customAttributes==null && other.getCustomAttributes()==null) || 
             (this.customAttributes!=null &&
              this.customAttributes.equals(other.getCustomAttributes()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.parentBulkEntSoldTo==null && other.getParentBulkEntSoldTo()==null) || 
             (this.parentBulkEntSoldTo!=null &&
              this.parentBulkEntSoldTo.equals(other.getParentBulkEntSoldTo()))) &&
            ((this.activatableItemType==null && other.getActivatableItemType()==null) || 
             (this.activatableItemType!=null &&
              this.activatableItemType.equals(other.getActivatableItemType()))) &&
            ((this.allowPortalLogin==null && other.getAllowPortalLogin()==null) || 
             (this.allowPortalLogin!=null &&
              this.allowPortalLogin.equals(other.getAllowPortalLogin()))) &&
            ((this.organizationUnitName==null && other.getOrganizationUnitName()==null) || 
             (this.organizationUnitName!=null &&
              this.organizationUnitName.equals(other.getOrganizationUnitName()))) &&
            ((this.currentOwnerName==null && other.getCurrentOwnerName()==null) || 
             (this.currentOwnerName!=null &&
              this.currentOwnerName.equals(other.getCurrentOwnerName()))) &&
            ((this.lineItemParentLineItemId==null && other.getLineItemParentLineItemId()==null) || 
             (this.lineItemParentLineItemId!=null &&
              this.lineItemParentLineItemId.equals(other.getLineItemParentLineItemId()))) &&
            ((this.createdOnDateTime==null && other.getCreatedOnDateTime()==null) || 
             (this.createdOnDateTime!=null &&
              this.createdOnDateTime.equals(other.getCreatedOnDateTime()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.lineItemAttributes==null && other.getLineItemAttributes()==null) || 
             (this.lineItemAttributes!=null &&
              this.lineItemAttributes.equals(other.getLineItemAttributes())));
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
        if (getParentBulkEntitlementId() != null) {
            _hashCode += getParentBulkEntitlementId().hashCode();
        }
        if (getEntitlementId() != null) {
            _hashCode += getEntitlementId().hashCode();
        }
        if (getActivationId() != null) {
            _hashCode += getActivationId().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getProductVersion() != null) {
            _hashCode += getProductVersion().hashCode();
        }
        if (getProductType() != null) {
            _hashCode += getProductType().hashCode();
        }
        if (getPartNumber() != null) {
            _hashCode += getPartNumber().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getIsPermanent() != null) {
            _hashCode += getIsPermanent().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getVersionDate() != null) {
            _hashCode += getVersionDate().hashCode();
        }
        if (getLicenseTechnology() != null) {
            _hashCode += getLicenseTechnology().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getWithNoOrderId() != null) {
            _hashCode += getWithNoOrderId().hashCode();
        }
        if (getRestrictToItemsWithCount() != null) {
            _hashCode += getRestrictToItemsWithCount().hashCode();
        }
        if (getFulfilledAmount() != null) {
            _hashCode += getFulfilledAmount().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getCustomAttributes() != null) {
            _hashCode += getCustomAttributes().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getParentBulkEntSoldTo() != null) {
            _hashCode += getParentBulkEntSoldTo().hashCode();
        }
        if (getActivatableItemType() != null) {
            _hashCode += getActivatableItemType().hashCode();
        }
        if (getAllowPortalLogin() != null) {
            _hashCode += getAllowPortalLogin().hashCode();
        }
        if (getOrganizationUnitName() != null) {
            _hashCode += getOrganizationUnitName().hashCode();
        }
        if (getCurrentOwnerName() != null) {
            _hashCode += getCurrentOwnerName().hashCode();
        }
        if (getLineItemParentLineItemId() != null) {
            _hashCode += getLineItemParentLineItemId().hashCode();
        }
        if (getCreatedOnDateTime() != null) {
            _hashCode += getCreatedOnDateTime().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getLineItemAttributes() != null) {
            _hashCode += getLineItemAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchActivatableItemDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchActivatableItemDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentBulkEntitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentBulkEntitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "ProductType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPermanent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isPermanent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "versionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseTechnology");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnology"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withNoOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "withNoOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictToItemsWithCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "restrictToItemsWithCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfilledAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "fulfilledAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "NumberQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customAttributesQueryListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "soldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentBulkEntSoldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentBulkEntSoldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activatableItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activatableItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "ActivatableItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPortalLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "allowPortalLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "PartnerTierQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentOwnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "currentOwnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemParentLineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemParentLineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdOnDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdOnDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemCustomAttributesQueryListType"));
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
