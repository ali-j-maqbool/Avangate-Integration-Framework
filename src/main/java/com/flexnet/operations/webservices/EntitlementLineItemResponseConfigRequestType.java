/**
 * EntitlementLineItemResponseConfigRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class EntitlementLineItemResponseConfigRequestType  implements java.io.Serializable {
    private java.lang.Boolean activationId;

    private java.lang.Boolean description;

    private java.lang.Boolean state;

    private java.lang.Boolean activatableItemType;

    private java.lang.Boolean orderId;

    private java.lang.Boolean orderLineNumber;

    private java.lang.Boolean entitlementId;

    private java.lang.Boolean allowPortalLogin;

    private java.lang.Boolean soldTo;

    private java.lang.Boolean soldToDisplayName;

    private java.lang.Boolean entitlementState;

    private java.lang.Boolean entitlementDescription;

    private java.lang.Boolean shipToEmail;

    private java.lang.Boolean shipToAddress;

    private java.lang.Boolean parentBulkEntitlementId;

    private java.lang.Boolean bulkEntSoldTo;

    private java.lang.Boolean bulkEntSoldToDisplayName;

    private java.lang.Boolean product;

    private java.lang.Boolean productDescription;

    private java.lang.Boolean partNumber;

    private java.lang.Boolean partNumberDescription;

    private java.lang.Boolean licenseTechnology;

    private java.lang.Boolean licenseModel;

    private java.lang.Boolean lineItemSupportAction;

    private java.lang.Boolean parentLineItem;

    private java.lang.Boolean startDate;

    private java.lang.Boolean startDateOption;

    private java.lang.Boolean isPermanent;

    private java.lang.Boolean term;

    private java.lang.Boolean expirationDate;

    private java.lang.Boolean versionDate;

    private java.lang.Boolean versionDateAttributes;

    private java.lang.Boolean numberOfCopies;

    private java.lang.Boolean fulfilledAmount;

    private java.lang.Boolean numberOfRemainingCopies;

    private java.lang.Boolean isTrusted;

    private com.flexnet.operations.webservices.CustomAttributeDescriptorDataType customAttributes;

    private java.lang.Boolean maintenance;

    private java.lang.Boolean maintenancePartNumber;

    private java.lang.Boolean FNPTimeZoneValue;

    private java.lang.Boolean createdOnDateTime;

    private java.lang.Boolean lastModifiedDateTime;

    private java.lang.Boolean lineItemAttributes;

    public EntitlementLineItemResponseConfigRequestType() {
    }

    public EntitlementLineItemResponseConfigRequestType(
           java.lang.Boolean activationId,
           java.lang.Boolean description,
           java.lang.Boolean state,
           java.lang.Boolean activatableItemType,
           java.lang.Boolean orderId,
           java.lang.Boolean orderLineNumber,
           java.lang.Boolean entitlementId,
           java.lang.Boolean allowPortalLogin,
           java.lang.Boolean soldTo,
           java.lang.Boolean soldToDisplayName,
           java.lang.Boolean entitlementState,
           java.lang.Boolean entitlementDescription,
           java.lang.Boolean shipToEmail,
           java.lang.Boolean shipToAddress,
           java.lang.Boolean parentBulkEntitlementId,
           java.lang.Boolean bulkEntSoldTo,
           java.lang.Boolean bulkEntSoldToDisplayName,
           java.lang.Boolean product,
           java.lang.Boolean productDescription,
           java.lang.Boolean partNumber,
           java.lang.Boolean partNumberDescription,
           java.lang.Boolean licenseTechnology,
           java.lang.Boolean licenseModel,
           java.lang.Boolean lineItemSupportAction,
           java.lang.Boolean parentLineItem,
           java.lang.Boolean startDate,
           java.lang.Boolean startDateOption,
           java.lang.Boolean isPermanent,
           java.lang.Boolean term,
           java.lang.Boolean expirationDate,
           java.lang.Boolean versionDate,
           java.lang.Boolean versionDateAttributes,
           java.lang.Boolean numberOfCopies,
           java.lang.Boolean fulfilledAmount,
           java.lang.Boolean numberOfRemainingCopies,
           java.lang.Boolean isTrusted,
           com.flexnet.operations.webservices.CustomAttributeDescriptorDataType customAttributes,
           java.lang.Boolean maintenance,
           java.lang.Boolean maintenancePartNumber,
           java.lang.Boolean FNPTimeZoneValue,
           java.lang.Boolean createdOnDateTime,
           java.lang.Boolean lastModifiedDateTime,
           java.lang.Boolean lineItemAttributes) {
           this.activationId = activationId;
           this.description = description;
           this.state = state;
           this.activatableItemType = activatableItemType;
           this.orderId = orderId;
           this.orderLineNumber = orderLineNumber;
           this.entitlementId = entitlementId;
           this.allowPortalLogin = allowPortalLogin;
           this.soldTo = soldTo;
           this.soldToDisplayName = soldToDisplayName;
           this.entitlementState = entitlementState;
           this.entitlementDescription = entitlementDescription;
           this.shipToEmail = shipToEmail;
           this.shipToAddress = shipToAddress;
           this.parentBulkEntitlementId = parentBulkEntitlementId;
           this.bulkEntSoldTo = bulkEntSoldTo;
           this.bulkEntSoldToDisplayName = bulkEntSoldToDisplayName;
           this.product = product;
           this.productDescription = productDescription;
           this.partNumber = partNumber;
           this.partNumberDescription = partNumberDescription;
           this.licenseTechnology = licenseTechnology;
           this.licenseModel = licenseModel;
           this.lineItemSupportAction = lineItemSupportAction;
           this.parentLineItem = parentLineItem;
           this.startDate = startDate;
           this.startDateOption = startDateOption;
           this.isPermanent = isPermanent;
           this.term = term;
           this.expirationDate = expirationDate;
           this.versionDate = versionDate;
           this.versionDateAttributes = versionDateAttributes;
           this.numberOfCopies = numberOfCopies;
           this.fulfilledAmount = fulfilledAmount;
           this.numberOfRemainingCopies = numberOfRemainingCopies;
           this.isTrusted = isTrusted;
           this.customAttributes = customAttributes;
           this.maintenance = maintenance;
           this.maintenancePartNumber = maintenancePartNumber;
           this.FNPTimeZoneValue = FNPTimeZoneValue;
           this.createdOnDateTime = createdOnDateTime;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.lineItemAttributes = lineItemAttributes;
    }


    /**
     * Gets the activationId value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return activationId
     */
    public java.lang.Boolean getActivationId() {
        return activationId;
    }


    /**
     * Sets the activationId value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param activationId
     */
    public void setActivationId(java.lang.Boolean activationId) {
        this.activationId = activationId;
    }


    /**
     * Gets the description value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return description
     */
    public java.lang.Boolean getDescription() {
        return description;
    }


    /**
     * Sets the description value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param description
     */
    public void setDescription(java.lang.Boolean description) {
        this.description = description;
    }


    /**
     * Gets the state value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return state
     */
    public java.lang.Boolean getState() {
        return state;
    }


    /**
     * Sets the state value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param state
     */
    public void setState(java.lang.Boolean state) {
        this.state = state;
    }


    /**
     * Gets the activatableItemType value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return activatableItemType
     */
    public java.lang.Boolean getActivatableItemType() {
        return activatableItemType;
    }


    /**
     * Sets the activatableItemType value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param activatableItemType
     */
    public void setActivatableItemType(java.lang.Boolean activatableItemType) {
        this.activatableItemType = activatableItemType;
    }


    /**
     * Gets the orderId value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return orderId
     */
    public java.lang.Boolean getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.Boolean orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderLineNumber value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return orderLineNumber
     */
    public java.lang.Boolean getOrderLineNumber() {
        return orderLineNumber;
    }


    /**
     * Sets the orderLineNumber value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param orderLineNumber
     */
    public void setOrderLineNumber(java.lang.Boolean orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }


    /**
     * Gets the entitlementId value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return entitlementId
     */
    public java.lang.Boolean getEntitlementId() {
        return entitlementId;
    }


    /**
     * Sets the entitlementId value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param entitlementId
     */
    public void setEntitlementId(java.lang.Boolean entitlementId) {
        this.entitlementId = entitlementId;
    }


    /**
     * Gets the allowPortalLogin value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return allowPortalLogin
     */
    public java.lang.Boolean getAllowPortalLogin() {
        return allowPortalLogin;
    }


    /**
     * Sets the allowPortalLogin value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param allowPortalLogin
     */
    public void setAllowPortalLogin(java.lang.Boolean allowPortalLogin) {
        this.allowPortalLogin = allowPortalLogin;
    }


    /**
     * Gets the soldTo value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return soldTo
     */
    public java.lang.Boolean getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param soldTo
     */
    public void setSoldTo(java.lang.Boolean soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the soldToDisplayName value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return soldToDisplayName
     */
    public java.lang.Boolean getSoldToDisplayName() {
        return soldToDisplayName;
    }


    /**
     * Sets the soldToDisplayName value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param soldToDisplayName
     */
    public void setSoldToDisplayName(java.lang.Boolean soldToDisplayName) {
        this.soldToDisplayName = soldToDisplayName;
    }


    /**
     * Gets the entitlementState value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return entitlementState
     */
    public java.lang.Boolean getEntitlementState() {
        return entitlementState;
    }


    /**
     * Sets the entitlementState value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param entitlementState
     */
    public void setEntitlementState(java.lang.Boolean entitlementState) {
        this.entitlementState = entitlementState;
    }


    /**
     * Gets the entitlementDescription value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return entitlementDescription
     */
    public java.lang.Boolean getEntitlementDescription() {
        return entitlementDescription;
    }


    /**
     * Sets the entitlementDescription value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param entitlementDescription
     */
    public void setEntitlementDescription(java.lang.Boolean entitlementDescription) {
        this.entitlementDescription = entitlementDescription;
    }


    /**
     * Gets the shipToEmail value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return shipToEmail
     */
    public java.lang.Boolean getShipToEmail() {
        return shipToEmail;
    }


    /**
     * Sets the shipToEmail value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param shipToEmail
     */
    public void setShipToEmail(java.lang.Boolean shipToEmail) {
        this.shipToEmail = shipToEmail;
    }


    /**
     * Gets the shipToAddress value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return shipToAddress
     */
    public java.lang.Boolean getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param shipToAddress
     */
    public void setShipToAddress(java.lang.Boolean shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the parentBulkEntitlementId value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return parentBulkEntitlementId
     */
    public java.lang.Boolean getParentBulkEntitlementId() {
        return parentBulkEntitlementId;
    }


    /**
     * Sets the parentBulkEntitlementId value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param parentBulkEntitlementId
     */
    public void setParentBulkEntitlementId(java.lang.Boolean parentBulkEntitlementId) {
        this.parentBulkEntitlementId = parentBulkEntitlementId;
    }


    /**
     * Gets the bulkEntSoldTo value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return bulkEntSoldTo
     */
    public java.lang.Boolean getBulkEntSoldTo() {
        return bulkEntSoldTo;
    }


    /**
     * Sets the bulkEntSoldTo value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param bulkEntSoldTo
     */
    public void setBulkEntSoldTo(java.lang.Boolean bulkEntSoldTo) {
        this.bulkEntSoldTo = bulkEntSoldTo;
    }


    /**
     * Gets the bulkEntSoldToDisplayName value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return bulkEntSoldToDisplayName
     */
    public java.lang.Boolean getBulkEntSoldToDisplayName() {
        return bulkEntSoldToDisplayName;
    }


    /**
     * Sets the bulkEntSoldToDisplayName value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param bulkEntSoldToDisplayName
     */
    public void setBulkEntSoldToDisplayName(java.lang.Boolean bulkEntSoldToDisplayName) {
        this.bulkEntSoldToDisplayName = bulkEntSoldToDisplayName;
    }


    /**
     * Gets the product value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return product
     */
    public java.lang.Boolean getProduct() {
        return product;
    }


    /**
     * Sets the product value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param product
     */
    public void setProduct(java.lang.Boolean product) {
        this.product = product;
    }


    /**
     * Gets the productDescription value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return productDescription
     */
    public java.lang.Boolean getProductDescription() {
        return productDescription;
    }


    /**
     * Sets the productDescription value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param productDescription
     */
    public void setProductDescription(java.lang.Boolean productDescription) {
        this.productDescription = productDescription;
    }


    /**
     * Gets the partNumber value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return partNumber
     */
    public java.lang.Boolean getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param partNumber
     */
    public void setPartNumber(java.lang.Boolean partNumber) {
        this.partNumber = partNumber;
    }


    /**
     * Gets the partNumberDescription value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return partNumberDescription
     */
    public java.lang.Boolean getPartNumberDescription() {
        return partNumberDescription;
    }


    /**
     * Sets the partNumberDescription value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param partNumberDescription
     */
    public void setPartNumberDescription(java.lang.Boolean partNumberDescription) {
        this.partNumberDescription = partNumberDescription;
    }


    /**
     * Gets the licenseTechnology value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return licenseTechnology
     */
    public java.lang.Boolean getLicenseTechnology() {
        return licenseTechnology;
    }


    /**
     * Sets the licenseTechnology value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param licenseTechnology
     */
    public void setLicenseTechnology(java.lang.Boolean licenseTechnology) {
        this.licenseTechnology = licenseTechnology;
    }


    /**
     * Gets the licenseModel value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return licenseModel
     */
    public java.lang.Boolean getLicenseModel() {
        return licenseModel;
    }


    /**
     * Sets the licenseModel value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param licenseModel
     */
    public void setLicenseModel(java.lang.Boolean licenseModel) {
        this.licenseModel = licenseModel;
    }


    /**
     * Gets the lineItemSupportAction value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return lineItemSupportAction
     */
    public java.lang.Boolean getLineItemSupportAction() {
        return lineItemSupportAction;
    }


    /**
     * Sets the lineItemSupportAction value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param lineItemSupportAction
     */
    public void setLineItemSupportAction(java.lang.Boolean lineItemSupportAction) {
        this.lineItemSupportAction = lineItemSupportAction;
    }


    /**
     * Gets the parentLineItem value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return parentLineItem
     */
    public java.lang.Boolean getParentLineItem() {
        return parentLineItem;
    }


    /**
     * Sets the parentLineItem value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param parentLineItem
     */
    public void setParentLineItem(java.lang.Boolean parentLineItem) {
        this.parentLineItem = parentLineItem;
    }


    /**
     * Gets the startDate value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return startDate
     */
    public java.lang.Boolean getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.Boolean startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startDateOption value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return startDateOption
     */
    public java.lang.Boolean getStartDateOption() {
        return startDateOption;
    }


    /**
     * Sets the startDateOption value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param startDateOption
     */
    public void setStartDateOption(java.lang.Boolean startDateOption) {
        this.startDateOption = startDateOption;
    }


    /**
     * Gets the isPermanent value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return isPermanent
     */
    public java.lang.Boolean getIsPermanent() {
        return isPermanent;
    }


    /**
     * Sets the isPermanent value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param isPermanent
     */
    public void setIsPermanent(java.lang.Boolean isPermanent) {
        this.isPermanent = isPermanent;
    }


    /**
     * Gets the term value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return term
     */
    public java.lang.Boolean getTerm() {
        return term;
    }


    /**
     * Sets the term value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param term
     */
    public void setTerm(java.lang.Boolean term) {
        this.term = term;
    }


    /**
     * Gets the expirationDate value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return expirationDate
     */
    public java.lang.Boolean getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.Boolean expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the versionDate value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return versionDate
     */
    public java.lang.Boolean getVersionDate() {
        return versionDate;
    }


    /**
     * Sets the versionDate value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param versionDate
     */
    public void setVersionDate(java.lang.Boolean versionDate) {
        this.versionDate = versionDate;
    }


    /**
     * Gets the versionDateAttributes value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return versionDateAttributes
     */
    public java.lang.Boolean getVersionDateAttributes() {
        return versionDateAttributes;
    }


    /**
     * Sets the versionDateAttributes value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param versionDateAttributes
     */
    public void setVersionDateAttributes(java.lang.Boolean versionDateAttributes) {
        this.versionDateAttributes = versionDateAttributes;
    }


    /**
     * Gets the numberOfCopies value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return numberOfCopies
     */
    public java.lang.Boolean getNumberOfCopies() {
        return numberOfCopies;
    }


    /**
     * Sets the numberOfCopies value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param numberOfCopies
     */
    public void setNumberOfCopies(java.lang.Boolean numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }


    /**
     * Gets the fulfilledAmount value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return fulfilledAmount
     */
    public java.lang.Boolean getFulfilledAmount() {
        return fulfilledAmount;
    }


    /**
     * Sets the fulfilledAmount value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param fulfilledAmount
     */
    public void setFulfilledAmount(java.lang.Boolean fulfilledAmount) {
        this.fulfilledAmount = fulfilledAmount;
    }


    /**
     * Gets the numberOfRemainingCopies value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return numberOfRemainingCopies
     */
    public java.lang.Boolean getNumberOfRemainingCopies() {
        return numberOfRemainingCopies;
    }


    /**
     * Sets the numberOfRemainingCopies value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param numberOfRemainingCopies
     */
    public void setNumberOfRemainingCopies(java.lang.Boolean numberOfRemainingCopies) {
        this.numberOfRemainingCopies = numberOfRemainingCopies;
    }


    /**
     * Gets the isTrusted value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return isTrusted
     */
    public java.lang.Boolean getIsTrusted() {
        return isTrusted;
    }


    /**
     * Sets the isTrusted value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param isTrusted
     */
    public void setIsTrusted(java.lang.Boolean isTrusted) {
        this.isTrusted = isTrusted;
    }


    /**
     * Gets the customAttributes value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return customAttributes
     */
    public com.flexnet.operations.webservices.CustomAttributeDescriptorDataType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.operations.webservices.CustomAttributeDescriptorDataType customAttributes) {
        this.customAttributes = customAttributes;
    }


    /**
     * Gets the maintenance value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return maintenance
     */
    public java.lang.Boolean getMaintenance() {
        return maintenance;
    }


    /**
     * Sets the maintenance value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param maintenance
     */
    public void setMaintenance(java.lang.Boolean maintenance) {
        this.maintenance = maintenance;
    }


    /**
     * Gets the maintenancePartNumber value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return maintenancePartNumber
     */
    public java.lang.Boolean getMaintenancePartNumber() {
        return maintenancePartNumber;
    }


    /**
     * Sets the maintenancePartNumber value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param maintenancePartNumber
     */
    public void setMaintenancePartNumber(java.lang.Boolean maintenancePartNumber) {
        this.maintenancePartNumber = maintenancePartNumber;
    }


    /**
     * Gets the FNPTimeZoneValue value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return FNPTimeZoneValue
     */
    public java.lang.Boolean getFNPTimeZoneValue() {
        return FNPTimeZoneValue;
    }


    /**
     * Sets the FNPTimeZoneValue value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param FNPTimeZoneValue
     */
    public void setFNPTimeZoneValue(java.lang.Boolean FNPTimeZoneValue) {
        this.FNPTimeZoneValue = FNPTimeZoneValue;
    }


    /**
     * Gets the createdOnDateTime value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return createdOnDateTime
     */
    public java.lang.Boolean getCreatedOnDateTime() {
        return createdOnDateTime;
    }


    /**
     * Sets the createdOnDateTime value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param createdOnDateTime
     */
    public void setCreatedOnDateTime(java.lang.Boolean createdOnDateTime) {
        this.createdOnDateTime = createdOnDateTime;
    }


    /**
     * Gets the lastModifiedDateTime value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return lastModifiedDateTime
     */
    public java.lang.Boolean getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param lastModifiedDateTime
     */
    public void setLastModifiedDateTime(java.lang.Boolean lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the lineItemAttributes value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @return lineItemAttributes
     */
    public java.lang.Boolean getLineItemAttributes() {
        return lineItemAttributes;
    }


    /**
     * Sets the lineItemAttributes value for this EntitlementLineItemResponseConfigRequestType.
     * 
     * @param lineItemAttributes
     */
    public void setLineItemAttributes(java.lang.Boolean lineItemAttributes) {
        this.lineItemAttributes = lineItemAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitlementLineItemResponseConfigRequestType)) return false;
        EntitlementLineItemResponseConfigRequestType other = (EntitlementLineItemResponseConfigRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activationId==null && other.getActivationId()==null) || 
             (this.activationId!=null &&
              this.activationId.equals(other.getActivationId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.activatableItemType==null && other.getActivatableItemType()==null) || 
             (this.activatableItemType!=null &&
              this.activatableItemType.equals(other.getActivatableItemType()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderLineNumber==null && other.getOrderLineNumber()==null) || 
             (this.orderLineNumber!=null &&
              this.orderLineNumber.equals(other.getOrderLineNumber()))) &&
            ((this.entitlementId==null && other.getEntitlementId()==null) || 
             (this.entitlementId!=null &&
              this.entitlementId.equals(other.getEntitlementId()))) &&
            ((this.allowPortalLogin==null && other.getAllowPortalLogin()==null) || 
             (this.allowPortalLogin!=null &&
              this.allowPortalLogin.equals(other.getAllowPortalLogin()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.soldToDisplayName==null && other.getSoldToDisplayName()==null) || 
             (this.soldToDisplayName!=null &&
              this.soldToDisplayName.equals(other.getSoldToDisplayName()))) &&
            ((this.entitlementState==null && other.getEntitlementState()==null) || 
             (this.entitlementState!=null &&
              this.entitlementState.equals(other.getEntitlementState()))) &&
            ((this.entitlementDescription==null && other.getEntitlementDescription()==null) || 
             (this.entitlementDescription!=null &&
              this.entitlementDescription.equals(other.getEntitlementDescription()))) &&
            ((this.shipToEmail==null && other.getShipToEmail()==null) || 
             (this.shipToEmail!=null &&
              this.shipToEmail.equals(other.getShipToEmail()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.parentBulkEntitlementId==null && other.getParentBulkEntitlementId()==null) || 
             (this.parentBulkEntitlementId!=null &&
              this.parentBulkEntitlementId.equals(other.getParentBulkEntitlementId()))) &&
            ((this.bulkEntSoldTo==null && other.getBulkEntSoldTo()==null) || 
             (this.bulkEntSoldTo!=null &&
              this.bulkEntSoldTo.equals(other.getBulkEntSoldTo()))) &&
            ((this.bulkEntSoldToDisplayName==null && other.getBulkEntSoldToDisplayName()==null) || 
             (this.bulkEntSoldToDisplayName!=null &&
              this.bulkEntSoldToDisplayName.equals(other.getBulkEntSoldToDisplayName()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.productDescription==null && other.getProductDescription()==null) || 
             (this.productDescription!=null &&
              this.productDescription.equals(other.getProductDescription()))) &&
            ((this.partNumber==null && other.getPartNumber()==null) || 
             (this.partNumber!=null &&
              this.partNumber.equals(other.getPartNumber()))) &&
            ((this.partNumberDescription==null && other.getPartNumberDescription()==null) || 
             (this.partNumberDescription!=null &&
              this.partNumberDescription.equals(other.getPartNumberDescription()))) &&
            ((this.licenseTechnology==null && other.getLicenseTechnology()==null) || 
             (this.licenseTechnology!=null &&
              this.licenseTechnology.equals(other.getLicenseTechnology()))) &&
            ((this.licenseModel==null && other.getLicenseModel()==null) || 
             (this.licenseModel!=null &&
              this.licenseModel.equals(other.getLicenseModel()))) &&
            ((this.lineItemSupportAction==null && other.getLineItemSupportAction()==null) || 
             (this.lineItemSupportAction!=null &&
              this.lineItemSupportAction.equals(other.getLineItemSupportAction()))) &&
            ((this.parentLineItem==null && other.getParentLineItem()==null) || 
             (this.parentLineItem!=null &&
              this.parentLineItem.equals(other.getParentLineItem()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.startDateOption==null && other.getStartDateOption()==null) || 
             (this.startDateOption!=null &&
              this.startDateOption.equals(other.getStartDateOption()))) &&
            ((this.isPermanent==null && other.getIsPermanent()==null) || 
             (this.isPermanent!=null &&
              this.isPermanent.equals(other.getIsPermanent()))) &&
            ((this.term==null && other.getTerm()==null) || 
             (this.term!=null &&
              this.term.equals(other.getTerm()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.versionDate==null && other.getVersionDate()==null) || 
             (this.versionDate!=null &&
              this.versionDate.equals(other.getVersionDate()))) &&
            ((this.versionDateAttributes==null && other.getVersionDateAttributes()==null) || 
             (this.versionDateAttributes!=null &&
              this.versionDateAttributes.equals(other.getVersionDateAttributes()))) &&
            ((this.numberOfCopies==null && other.getNumberOfCopies()==null) || 
             (this.numberOfCopies!=null &&
              this.numberOfCopies.equals(other.getNumberOfCopies()))) &&
            ((this.fulfilledAmount==null && other.getFulfilledAmount()==null) || 
             (this.fulfilledAmount!=null &&
              this.fulfilledAmount.equals(other.getFulfilledAmount()))) &&
            ((this.numberOfRemainingCopies==null && other.getNumberOfRemainingCopies()==null) || 
             (this.numberOfRemainingCopies!=null &&
              this.numberOfRemainingCopies.equals(other.getNumberOfRemainingCopies()))) &&
            ((this.isTrusted==null && other.getIsTrusted()==null) || 
             (this.isTrusted!=null &&
              this.isTrusted.equals(other.getIsTrusted()))) &&
            ((this.customAttributes==null && other.getCustomAttributes()==null) || 
             (this.customAttributes!=null &&
              this.customAttributes.equals(other.getCustomAttributes()))) &&
            ((this.maintenance==null && other.getMaintenance()==null) || 
             (this.maintenance!=null &&
              this.maintenance.equals(other.getMaintenance()))) &&
            ((this.maintenancePartNumber==null && other.getMaintenancePartNumber()==null) || 
             (this.maintenancePartNumber!=null &&
              this.maintenancePartNumber.equals(other.getMaintenancePartNumber()))) &&
            ((this.FNPTimeZoneValue==null && other.getFNPTimeZoneValue()==null) || 
             (this.FNPTimeZoneValue!=null &&
              this.FNPTimeZoneValue.equals(other.getFNPTimeZoneValue()))) &&
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
        if (getActivationId() != null) {
            _hashCode += getActivationId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getActivatableItemType() != null) {
            _hashCode += getActivatableItemType().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderLineNumber() != null) {
            _hashCode += getOrderLineNumber().hashCode();
        }
        if (getEntitlementId() != null) {
            _hashCode += getEntitlementId().hashCode();
        }
        if (getAllowPortalLogin() != null) {
            _hashCode += getAllowPortalLogin().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getSoldToDisplayName() != null) {
            _hashCode += getSoldToDisplayName().hashCode();
        }
        if (getEntitlementState() != null) {
            _hashCode += getEntitlementState().hashCode();
        }
        if (getEntitlementDescription() != null) {
            _hashCode += getEntitlementDescription().hashCode();
        }
        if (getShipToEmail() != null) {
            _hashCode += getShipToEmail().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
        }
        if (getParentBulkEntitlementId() != null) {
            _hashCode += getParentBulkEntitlementId().hashCode();
        }
        if (getBulkEntSoldTo() != null) {
            _hashCode += getBulkEntSoldTo().hashCode();
        }
        if (getBulkEntSoldToDisplayName() != null) {
            _hashCode += getBulkEntSoldToDisplayName().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getProductDescription() != null) {
            _hashCode += getProductDescription().hashCode();
        }
        if (getPartNumber() != null) {
            _hashCode += getPartNumber().hashCode();
        }
        if (getPartNumberDescription() != null) {
            _hashCode += getPartNumberDescription().hashCode();
        }
        if (getLicenseTechnology() != null) {
            _hashCode += getLicenseTechnology().hashCode();
        }
        if (getLicenseModel() != null) {
            _hashCode += getLicenseModel().hashCode();
        }
        if (getLineItemSupportAction() != null) {
            _hashCode += getLineItemSupportAction().hashCode();
        }
        if (getParentLineItem() != null) {
            _hashCode += getParentLineItem().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStartDateOption() != null) {
            _hashCode += getStartDateOption().hashCode();
        }
        if (getIsPermanent() != null) {
            _hashCode += getIsPermanent().hashCode();
        }
        if (getTerm() != null) {
            _hashCode += getTerm().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getVersionDate() != null) {
            _hashCode += getVersionDate().hashCode();
        }
        if (getVersionDateAttributes() != null) {
            _hashCode += getVersionDateAttributes().hashCode();
        }
        if (getNumberOfCopies() != null) {
            _hashCode += getNumberOfCopies().hashCode();
        }
        if (getFulfilledAmount() != null) {
            _hashCode += getFulfilledAmount().hashCode();
        }
        if (getNumberOfRemainingCopies() != null) {
            _hashCode += getNumberOfRemainingCopies().hashCode();
        }
        if (getIsTrusted() != null) {
            _hashCode += getIsTrusted().hashCode();
        }
        if (getCustomAttributes() != null) {
            _hashCode += getCustomAttributes().hashCode();
        }
        if (getMaintenance() != null) {
            _hashCode += getMaintenance().hashCode();
        }
        if (getMaintenancePartNumber() != null) {
            _hashCode += getMaintenancePartNumber().hashCode();
        }
        if (getFNPTimeZoneValue() != null) {
            _hashCode += getFNPTimeZoneValue().hashCode();
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
        new org.apache.axis.description.TypeDesc(EntitlementLineItemResponseConfigRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemResponseConfigRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activatableItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activatableItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orderLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "soldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldToDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "soldToDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "shipToEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "shipToAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentBulkEntitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentBulkEntitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntSoldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntSoldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntSoldToDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntSoldToDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumberDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseTechnology");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseModel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemSupportAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemSupportAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "startDateOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("term");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "versionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionDateAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "versionDateAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfCopies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "numberOfCopies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfilledAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "fulfilledAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfRemainingCopies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "numberOfRemainingCopies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTrusted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isTrusted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customAttributeDescriptorDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenancePartNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenancePartNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FNPTimeZoneValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "FNPTimeZoneValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdOnDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdOnDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
