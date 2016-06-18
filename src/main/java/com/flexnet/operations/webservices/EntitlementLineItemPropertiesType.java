/**
 * EntitlementLineItemPropertiesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class EntitlementLineItemPropertiesType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType activationId;

    private java.lang.String description;

    private com.flexnet.operations.webservices.StateType state;

    private com.flexnet.operations.webservices.ActivatableItemType activatableItemType;

    private java.lang.String orderId;

    private java.lang.String orderLineNumber;

    private com.flexnet.operations.webservices.EntitlementIdentifierType entitlementId;

    private com.flexnet.operations.webservices.OrganizationIdentifierType soldTo;

    private java.lang.String soldToDisplayName;

    private com.flexnet.operations.webservices.StateType entitlementState;

    private java.lang.String entitlementDescription;

    private java.lang.Boolean allowPortalLogin;

    private java.lang.String shipToEmail;

    private java.lang.String shipToAddress;

    private com.flexnet.operations.webservices.EntitlementIdentifierType parentBulkEntitlementId;

    private com.flexnet.operations.webservices.OrganizationIdentifierType bulkEntSoldTo;

    private java.lang.String bulkEntSoldToDisplayName;

    private com.flexnet.operations.webservices.ProductIdentifierType product;

    private java.lang.String productDescription;

    private com.flexnet.operations.webservices.PartNumberIdentifierType partNumber;

    private java.lang.String partNumberDescription;

    private com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology;

    private com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModel;

    private com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel1;

    private com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel2;

    private com.flexnet.operations.webservices.LineItemType lineItemSupportAction;

    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItem;

    private java.util.Date startDate;

    private com.flexnet.operations.webservices.StartDateOptionType startDateOption;

    private java.lang.Boolean isPermanent;

    private com.flexnet.operations.webservices.DurationType term;

    private java.util.Date expirationDate;

    private java.util.Date versionDate;

    private com.flexnet.operations.webservices.VersionDateAttributesType versionDateAttributes;

    private java.math.BigInteger numberOfCopies;

    private java.math.BigInteger fulfilledAmount;

    private java.math.BigInteger numberOfRemainingCopies;

    private java.lang.Boolean isTrusted;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes;

    private com.flexnet.operations.webservices.EntitledProductDataListType entitledProducts;

    private com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners;

    private com.flexnet.operations.webservices.MaintenanceLineItemPropertiesType[] maintenanceLineItems;

    private java.lang.String FNPTimeZoneValue;

    private java.util.Calendar createdOnDateTime;

    private java.util.Calendar lastModifiedDateTime;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType lineItemAttributes;

    public EntitlementLineItemPropertiesType() {
    }

    public EntitlementLineItemPropertiesType(
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType activationId,
           java.lang.String description,
           com.flexnet.operations.webservices.StateType state,
           com.flexnet.operations.webservices.ActivatableItemType activatableItemType,
           java.lang.String orderId,
           java.lang.String orderLineNumber,
           com.flexnet.operations.webservices.EntitlementIdentifierType entitlementId,
           com.flexnet.operations.webservices.OrganizationIdentifierType soldTo,
           java.lang.String soldToDisplayName,
           com.flexnet.operations.webservices.StateType entitlementState,
           java.lang.String entitlementDescription,
           java.lang.Boolean allowPortalLogin,
           java.lang.String shipToEmail,
           java.lang.String shipToAddress,
           com.flexnet.operations.webservices.EntitlementIdentifierType parentBulkEntitlementId,
           com.flexnet.operations.webservices.OrganizationIdentifierType bulkEntSoldTo,
           java.lang.String bulkEntSoldToDisplayName,
           com.flexnet.operations.webservices.ProductIdentifierType product,
           java.lang.String productDescription,
           com.flexnet.operations.webservices.PartNumberIdentifierType partNumber,
           java.lang.String partNumberDescription,
           com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology,
           com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModel,
           com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel1,
           com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel2,
           com.flexnet.operations.webservices.LineItemType lineItemSupportAction,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItem,
           java.util.Date startDate,
           com.flexnet.operations.webservices.StartDateOptionType startDateOption,
           java.lang.Boolean isPermanent,
           com.flexnet.operations.webservices.DurationType term,
           java.util.Date expirationDate,
           java.util.Date versionDate,
           com.flexnet.operations.webservices.VersionDateAttributesType versionDateAttributes,
           java.math.BigInteger numberOfCopies,
           java.math.BigInteger fulfilledAmount,
           java.math.BigInteger numberOfRemainingCopies,
           java.lang.Boolean isTrusted,
           com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes,
           com.flexnet.operations.webservices.EntitledProductDataListType entitledProducts,
           com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners,
           com.flexnet.operations.webservices.MaintenanceLineItemPropertiesType[] maintenanceLineItems,
           java.lang.String FNPTimeZoneValue,
           java.util.Calendar createdOnDateTime,
           java.util.Calendar lastModifiedDateTime,
           com.flexnet.operations.webservices.AttributeDescriptorDataType lineItemAttributes) {
           this.activationId = activationId;
           this.description = description;
           this.state = state;
           this.activatableItemType = activatableItemType;
           this.orderId = orderId;
           this.orderLineNumber = orderLineNumber;
           this.entitlementId = entitlementId;
           this.soldTo = soldTo;
           this.soldToDisplayName = soldToDisplayName;
           this.entitlementState = entitlementState;
           this.entitlementDescription = entitlementDescription;
           this.allowPortalLogin = allowPortalLogin;
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
           this.alternateLicenseModel1 = alternateLicenseModel1;
           this.alternateLicenseModel2 = alternateLicenseModel2;
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
           this.entitledProducts = entitledProducts;
           this.channelPartners = channelPartners;
           this.maintenanceLineItems = maintenanceLineItems;
           this.FNPTimeZoneValue = FNPTimeZoneValue;
           this.createdOnDateTime = createdOnDateTime;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.lineItemAttributes = lineItemAttributes;
    }


    /**
     * Gets the activationId value for this EntitlementLineItemPropertiesType.
     * 
     * @return activationId
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getActivationId() {
        return activationId;
    }


    /**
     * Sets the activationId value for this EntitlementLineItemPropertiesType.
     * 
     * @param activationId
     */
    public void setActivationId(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType activationId) {
        this.activationId = activationId;
    }


    /**
     * Gets the description value for this EntitlementLineItemPropertiesType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this EntitlementLineItemPropertiesType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the state value for this EntitlementLineItemPropertiesType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.StateType getState() {
        return state;
    }


    /**
     * Sets the state value for this EntitlementLineItemPropertiesType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.StateType state) {
        this.state = state;
    }


    /**
     * Gets the activatableItemType value for this EntitlementLineItemPropertiesType.
     * 
     * @return activatableItemType
     */
    public com.flexnet.operations.webservices.ActivatableItemType getActivatableItemType() {
        return activatableItemType;
    }


    /**
     * Sets the activatableItemType value for this EntitlementLineItemPropertiesType.
     * 
     * @param activatableItemType
     */
    public void setActivatableItemType(com.flexnet.operations.webservices.ActivatableItemType activatableItemType) {
        this.activatableItemType = activatableItemType;
    }


    /**
     * Gets the orderId value for this EntitlementLineItemPropertiesType.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this EntitlementLineItemPropertiesType.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderLineNumber value for this EntitlementLineItemPropertiesType.
     * 
     * @return orderLineNumber
     */
    public java.lang.String getOrderLineNumber() {
        return orderLineNumber;
    }


    /**
     * Sets the orderLineNumber value for this EntitlementLineItemPropertiesType.
     * 
     * @param orderLineNumber
     */
    public void setOrderLineNumber(java.lang.String orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }


    /**
     * Gets the entitlementId value for this EntitlementLineItemPropertiesType.
     * 
     * @return entitlementId
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getEntitlementId() {
        return entitlementId;
    }


    /**
     * Sets the entitlementId value for this EntitlementLineItemPropertiesType.
     * 
     * @param entitlementId
     */
    public void setEntitlementId(com.flexnet.operations.webservices.EntitlementIdentifierType entitlementId) {
        this.entitlementId = entitlementId;
    }


    /**
     * Gets the soldTo value for this EntitlementLineItemPropertiesType.
     * 
     * @return soldTo
     */
    public com.flexnet.operations.webservices.OrganizationIdentifierType getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this EntitlementLineItemPropertiesType.
     * 
     * @param soldTo
     */
    public void setSoldTo(com.flexnet.operations.webservices.OrganizationIdentifierType soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the soldToDisplayName value for this EntitlementLineItemPropertiesType.
     * 
     * @return soldToDisplayName
     */
    public java.lang.String getSoldToDisplayName() {
        return soldToDisplayName;
    }


    /**
     * Sets the soldToDisplayName value for this EntitlementLineItemPropertiesType.
     * 
     * @param soldToDisplayName
     */
    public void setSoldToDisplayName(java.lang.String soldToDisplayName) {
        this.soldToDisplayName = soldToDisplayName;
    }


    /**
     * Gets the entitlementState value for this EntitlementLineItemPropertiesType.
     * 
     * @return entitlementState
     */
    public com.flexnet.operations.webservices.StateType getEntitlementState() {
        return entitlementState;
    }


    /**
     * Sets the entitlementState value for this EntitlementLineItemPropertiesType.
     * 
     * @param entitlementState
     */
    public void setEntitlementState(com.flexnet.operations.webservices.StateType entitlementState) {
        this.entitlementState = entitlementState;
    }


    /**
     * Gets the entitlementDescription value for this EntitlementLineItemPropertiesType.
     * 
     * @return entitlementDescription
     */
    public java.lang.String getEntitlementDescription() {
        return entitlementDescription;
    }


    /**
     * Sets the entitlementDescription value for this EntitlementLineItemPropertiesType.
     * 
     * @param entitlementDescription
     */
    public void setEntitlementDescription(java.lang.String entitlementDescription) {
        this.entitlementDescription = entitlementDescription;
    }


    /**
     * Gets the allowPortalLogin value for this EntitlementLineItemPropertiesType.
     * 
     * @return allowPortalLogin
     */
    public java.lang.Boolean getAllowPortalLogin() {
        return allowPortalLogin;
    }


    /**
     * Sets the allowPortalLogin value for this EntitlementLineItemPropertiesType.
     * 
     * @param allowPortalLogin
     */
    public void setAllowPortalLogin(java.lang.Boolean allowPortalLogin) {
        this.allowPortalLogin = allowPortalLogin;
    }


    /**
     * Gets the shipToEmail value for this EntitlementLineItemPropertiesType.
     * 
     * @return shipToEmail
     */
    public java.lang.String getShipToEmail() {
        return shipToEmail;
    }


    /**
     * Sets the shipToEmail value for this EntitlementLineItemPropertiesType.
     * 
     * @param shipToEmail
     */
    public void setShipToEmail(java.lang.String shipToEmail) {
        this.shipToEmail = shipToEmail;
    }


    /**
     * Gets the shipToAddress value for this EntitlementLineItemPropertiesType.
     * 
     * @return shipToAddress
     */
    public java.lang.String getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this EntitlementLineItemPropertiesType.
     * 
     * @param shipToAddress
     */
    public void setShipToAddress(java.lang.String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the parentBulkEntitlementId value for this EntitlementLineItemPropertiesType.
     * 
     * @return parentBulkEntitlementId
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getParentBulkEntitlementId() {
        return parentBulkEntitlementId;
    }


    /**
     * Sets the parentBulkEntitlementId value for this EntitlementLineItemPropertiesType.
     * 
     * @param parentBulkEntitlementId
     */
    public void setParentBulkEntitlementId(com.flexnet.operations.webservices.EntitlementIdentifierType parentBulkEntitlementId) {
        this.parentBulkEntitlementId = parentBulkEntitlementId;
    }


    /**
     * Gets the bulkEntSoldTo value for this EntitlementLineItemPropertiesType.
     * 
     * @return bulkEntSoldTo
     */
    public com.flexnet.operations.webservices.OrganizationIdentifierType getBulkEntSoldTo() {
        return bulkEntSoldTo;
    }


    /**
     * Sets the bulkEntSoldTo value for this EntitlementLineItemPropertiesType.
     * 
     * @param bulkEntSoldTo
     */
    public void setBulkEntSoldTo(com.flexnet.operations.webservices.OrganizationIdentifierType bulkEntSoldTo) {
        this.bulkEntSoldTo = bulkEntSoldTo;
    }


    /**
     * Gets the bulkEntSoldToDisplayName value for this EntitlementLineItemPropertiesType.
     * 
     * @return bulkEntSoldToDisplayName
     */
    public java.lang.String getBulkEntSoldToDisplayName() {
        return bulkEntSoldToDisplayName;
    }


    /**
     * Sets the bulkEntSoldToDisplayName value for this EntitlementLineItemPropertiesType.
     * 
     * @param bulkEntSoldToDisplayName
     */
    public void setBulkEntSoldToDisplayName(java.lang.String bulkEntSoldToDisplayName) {
        this.bulkEntSoldToDisplayName = bulkEntSoldToDisplayName;
    }


    /**
     * Gets the product value for this EntitlementLineItemPropertiesType.
     * 
     * @return product
     */
    public com.flexnet.operations.webservices.ProductIdentifierType getProduct() {
        return product;
    }


    /**
     * Sets the product value for this EntitlementLineItemPropertiesType.
     * 
     * @param product
     */
    public void setProduct(com.flexnet.operations.webservices.ProductIdentifierType product) {
        this.product = product;
    }


    /**
     * Gets the productDescription value for this EntitlementLineItemPropertiesType.
     * 
     * @return productDescription
     */
    public java.lang.String getProductDescription() {
        return productDescription;
    }


    /**
     * Sets the productDescription value for this EntitlementLineItemPropertiesType.
     * 
     * @param productDescription
     */
    public void setProductDescription(java.lang.String productDescription) {
        this.productDescription = productDescription;
    }


    /**
     * Gets the partNumber value for this EntitlementLineItemPropertiesType.
     * 
     * @return partNumber
     */
    public com.flexnet.operations.webservices.PartNumberIdentifierType getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this EntitlementLineItemPropertiesType.
     * 
     * @param partNumber
     */
    public void setPartNumber(com.flexnet.operations.webservices.PartNumberIdentifierType partNumber) {
        this.partNumber = partNumber;
    }


    /**
     * Gets the partNumberDescription value for this EntitlementLineItemPropertiesType.
     * 
     * @return partNumberDescription
     */
    public java.lang.String getPartNumberDescription() {
        return partNumberDescription;
    }


    /**
     * Sets the partNumberDescription value for this EntitlementLineItemPropertiesType.
     * 
     * @param partNumberDescription
     */
    public void setPartNumberDescription(java.lang.String partNumberDescription) {
        this.partNumberDescription = partNumberDescription;
    }


    /**
     * Gets the licenseTechnology value for this EntitlementLineItemPropertiesType.
     * 
     * @return licenseTechnology
     */
    public com.flexnet.operations.webservices.LicenseTechnologyIdentifierType getLicenseTechnology() {
        return licenseTechnology;
    }


    /**
     * Sets the licenseTechnology value for this EntitlementLineItemPropertiesType.
     * 
     * @param licenseTechnology
     */
    public void setLicenseTechnology(com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology) {
        this.licenseTechnology = licenseTechnology;
    }


    /**
     * Gets the licenseModel value for this EntitlementLineItemPropertiesType.
     * 
     * @return licenseModel
     */
    public com.flexnet.operations.webservices.LicenseModelIdentifierType getLicenseModel() {
        return licenseModel;
    }


    /**
     * Sets the licenseModel value for this EntitlementLineItemPropertiesType.
     * 
     * @param licenseModel
     */
    public void setLicenseModel(com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModel) {
        this.licenseModel = licenseModel;
    }


    /**
     * Gets the alternateLicenseModel1 value for this EntitlementLineItemPropertiesType.
     * 
     * @return alternateLicenseModel1
     */
    public com.flexnet.operations.webservices.LicenseModelIdentifierType getAlternateLicenseModel1() {
        return alternateLicenseModel1;
    }


    /**
     * Sets the alternateLicenseModel1 value for this EntitlementLineItemPropertiesType.
     * 
     * @param alternateLicenseModel1
     */
    public void setAlternateLicenseModel1(com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel1) {
        this.alternateLicenseModel1 = alternateLicenseModel1;
    }


    /**
     * Gets the alternateLicenseModel2 value for this EntitlementLineItemPropertiesType.
     * 
     * @return alternateLicenseModel2
     */
    public com.flexnet.operations.webservices.LicenseModelIdentifierType getAlternateLicenseModel2() {
        return alternateLicenseModel2;
    }


    /**
     * Sets the alternateLicenseModel2 value for this EntitlementLineItemPropertiesType.
     * 
     * @param alternateLicenseModel2
     */
    public void setAlternateLicenseModel2(com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel2) {
        this.alternateLicenseModel2 = alternateLicenseModel2;
    }


    /**
     * Gets the lineItemSupportAction value for this EntitlementLineItemPropertiesType.
     * 
     * @return lineItemSupportAction
     */
    public com.flexnet.operations.webservices.LineItemType getLineItemSupportAction() {
        return lineItemSupportAction;
    }


    /**
     * Sets the lineItemSupportAction value for this EntitlementLineItemPropertiesType.
     * 
     * @param lineItemSupportAction
     */
    public void setLineItemSupportAction(com.flexnet.operations.webservices.LineItemType lineItemSupportAction) {
        this.lineItemSupportAction = lineItemSupportAction;
    }


    /**
     * Gets the parentLineItem value for this EntitlementLineItemPropertiesType.
     * 
     * @return parentLineItem
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getParentLineItem() {
        return parentLineItem;
    }


    /**
     * Sets the parentLineItem value for this EntitlementLineItemPropertiesType.
     * 
     * @param parentLineItem
     */
    public void setParentLineItem(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItem) {
        this.parentLineItem = parentLineItem;
    }


    /**
     * Gets the startDate value for this EntitlementLineItemPropertiesType.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this EntitlementLineItemPropertiesType.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startDateOption value for this EntitlementLineItemPropertiesType.
     * 
     * @return startDateOption
     */
    public com.flexnet.operations.webservices.StartDateOptionType getStartDateOption() {
        return startDateOption;
    }


    /**
     * Sets the startDateOption value for this EntitlementLineItemPropertiesType.
     * 
     * @param startDateOption
     */
    public void setStartDateOption(com.flexnet.operations.webservices.StartDateOptionType startDateOption) {
        this.startDateOption = startDateOption;
    }


    /**
     * Gets the isPermanent value for this EntitlementLineItemPropertiesType.
     * 
     * @return isPermanent
     */
    public java.lang.Boolean getIsPermanent() {
        return isPermanent;
    }


    /**
     * Sets the isPermanent value for this EntitlementLineItemPropertiesType.
     * 
     * @param isPermanent
     */
    public void setIsPermanent(java.lang.Boolean isPermanent) {
        this.isPermanent = isPermanent;
    }


    /**
     * Gets the term value for this EntitlementLineItemPropertiesType.
     * 
     * @return term
     */
    public com.flexnet.operations.webservices.DurationType getTerm() {
        return term;
    }


    /**
     * Sets the term value for this EntitlementLineItemPropertiesType.
     * 
     * @param term
     */
    public void setTerm(com.flexnet.operations.webservices.DurationType term) {
        this.term = term;
    }


    /**
     * Gets the expirationDate value for this EntitlementLineItemPropertiesType.
     * 
     * @return expirationDate
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this EntitlementLineItemPropertiesType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the versionDate value for this EntitlementLineItemPropertiesType.
     * 
     * @return versionDate
     */
    public java.util.Date getVersionDate() {
        return versionDate;
    }


    /**
     * Sets the versionDate value for this EntitlementLineItemPropertiesType.
     * 
     * @param versionDate
     */
    public void setVersionDate(java.util.Date versionDate) {
        this.versionDate = versionDate;
    }


    /**
     * Gets the versionDateAttributes value for this EntitlementLineItemPropertiesType.
     * 
     * @return versionDateAttributes
     */
    public com.flexnet.operations.webservices.VersionDateAttributesType getVersionDateAttributes() {
        return versionDateAttributes;
    }


    /**
     * Sets the versionDateAttributes value for this EntitlementLineItemPropertiesType.
     * 
     * @param versionDateAttributes
     */
    public void setVersionDateAttributes(com.flexnet.operations.webservices.VersionDateAttributesType versionDateAttributes) {
        this.versionDateAttributes = versionDateAttributes;
    }


    /**
     * Gets the numberOfCopies value for this EntitlementLineItemPropertiesType.
     * 
     * @return numberOfCopies
     */
    public java.math.BigInteger getNumberOfCopies() {
        return numberOfCopies;
    }


    /**
     * Sets the numberOfCopies value for this EntitlementLineItemPropertiesType.
     * 
     * @param numberOfCopies
     */
    public void setNumberOfCopies(java.math.BigInteger numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }


    /**
     * Gets the fulfilledAmount value for this EntitlementLineItemPropertiesType.
     * 
     * @return fulfilledAmount
     */
    public java.math.BigInteger getFulfilledAmount() {
        return fulfilledAmount;
    }


    /**
     * Sets the fulfilledAmount value for this EntitlementLineItemPropertiesType.
     * 
     * @param fulfilledAmount
     */
    public void setFulfilledAmount(java.math.BigInteger fulfilledAmount) {
        this.fulfilledAmount = fulfilledAmount;
    }


    /**
     * Gets the numberOfRemainingCopies value for this EntitlementLineItemPropertiesType.
     * 
     * @return numberOfRemainingCopies
     */
    public java.math.BigInteger getNumberOfRemainingCopies() {
        return numberOfRemainingCopies;
    }


    /**
     * Sets the numberOfRemainingCopies value for this EntitlementLineItemPropertiesType.
     * 
     * @param numberOfRemainingCopies
     */
    public void setNumberOfRemainingCopies(java.math.BigInteger numberOfRemainingCopies) {
        this.numberOfRemainingCopies = numberOfRemainingCopies;
    }


    /**
     * Gets the isTrusted value for this EntitlementLineItemPropertiesType.
     * 
     * @return isTrusted
     */
    public java.lang.Boolean getIsTrusted() {
        return isTrusted;
    }


    /**
     * Sets the isTrusted value for this EntitlementLineItemPropertiesType.
     * 
     * @param isTrusted
     */
    public void setIsTrusted(java.lang.Boolean isTrusted) {
        this.isTrusted = isTrusted;
    }


    /**
     * Gets the customAttributes value for this EntitlementLineItemPropertiesType.
     * 
     * @return customAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this EntitlementLineItemPropertiesType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes) {
        this.customAttributes = customAttributes;
    }


    /**
     * Gets the entitledProducts value for this EntitlementLineItemPropertiesType.
     * 
     * @return entitledProducts
     */
    public com.flexnet.operations.webservices.EntitledProductDataListType getEntitledProducts() {
        return entitledProducts;
    }


    /**
     * Sets the entitledProducts value for this EntitlementLineItemPropertiesType.
     * 
     * @param entitledProducts
     */
    public void setEntitledProducts(com.flexnet.operations.webservices.EntitledProductDataListType entitledProducts) {
        this.entitledProducts = entitledProducts;
    }


    /**
     * Gets the channelPartners value for this EntitlementLineItemPropertiesType.
     * 
     * @return channelPartners
     */
    public com.flexnet.operations.webservices.ChannelPartnerDataListType getChannelPartners() {
        return channelPartners;
    }


    /**
     * Sets the channelPartners value for this EntitlementLineItemPropertiesType.
     * 
     * @param channelPartners
     */
    public void setChannelPartners(com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners) {
        this.channelPartners = channelPartners;
    }


    /**
     * Gets the maintenanceLineItems value for this EntitlementLineItemPropertiesType.
     * 
     * @return maintenanceLineItems
     */
    public com.flexnet.operations.webservices.MaintenanceLineItemPropertiesType[] getMaintenanceLineItems() {
        return maintenanceLineItems;
    }


    /**
     * Sets the maintenanceLineItems value for this EntitlementLineItemPropertiesType.
     * 
     * @param maintenanceLineItems
     */
    public void setMaintenanceLineItems(com.flexnet.operations.webservices.MaintenanceLineItemPropertiesType[] maintenanceLineItems) {
        this.maintenanceLineItems = maintenanceLineItems;
    }

    public com.flexnet.operations.webservices.MaintenanceLineItemPropertiesType getMaintenanceLineItems(int i) {
        return this.maintenanceLineItems[i];
    }

    public void setMaintenanceLineItems(int i, com.flexnet.operations.webservices.MaintenanceLineItemPropertiesType _value) {
        this.maintenanceLineItems[i] = _value;
    }


    /**
     * Gets the FNPTimeZoneValue value for this EntitlementLineItemPropertiesType.
     * 
     * @return FNPTimeZoneValue
     */
    public java.lang.String getFNPTimeZoneValue() {
        return FNPTimeZoneValue;
    }


    /**
     * Sets the FNPTimeZoneValue value for this EntitlementLineItemPropertiesType.
     * 
     * @param FNPTimeZoneValue
     */
    public void setFNPTimeZoneValue(java.lang.String FNPTimeZoneValue) {
        this.FNPTimeZoneValue = FNPTimeZoneValue;
    }


    /**
     * Gets the createdOnDateTime value for this EntitlementLineItemPropertiesType.
     * 
     * @return createdOnDateTime
     */
    public java.util.Calendar getCreatedOnDateTime() {
        return createdOnDateTime;
    }


    /**
     * Sets the createdOnDateTime value for this EntitlementLineItemPropertiesType.
     * 
     * @param createdOnDateTime
     */
    public void setCreatedOnDateTime(java.util.Calendar createdOnDateTime) {
        this.createdOnDateTime = createdOnDateTime;
    }


    /**
     * Gets the lastModifiedDateTime value for this EntitlementLineItemPropertiesType.
     * 
     * @return lastModifiedDateTime
     */
    public java.util.Calendar getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this EntitlementLineItemPropertiesType.
     * 
     * @param lastModifiedDateTime
     */
    public void setLastModifiedDateTime(java.util.Calendar lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the lineItemAttributes value for this EntitlementLineItemPropertiesType.
     * 
     * @return lineItemAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getLineItemAttributes() {
        return lineItemAttributes;
    }


    /**
     * Sets the lineItemAttributes value for this EntitlementLineItemPropertiesType.
     * 
     * @param lineItemAttributes
     */
    public void setLineItemAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType lineItemAttributes) {
        this.lineItemAttributes = lineItemAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitlementLineItemPropertiesType)) return false;
        EntitlementLineItemPropertiesType other = (EntitlementLineItemPropertiesType) obj;
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
            ((this.allowPortalLogin==null && other.getAllowPortalLogin()==null) || 
             (this.allowPortalLogin!=null &&
              this.allowPortalLogin.equals(other.getAllowPortalLogin()))) &&
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
            ((this.alternateLicenseModel1==null && other.getAlternateLicenseModel1()==null) || 
             (this.alternateLicenseModel1!=null &&
              this.alternateLicenseModel1.equals(other.getAlternateLicenseModel1()))) &&
            ((this.alternateLicenseModel2==null && other.getAlternateLicenseModel2()==null) || 
             (this.alternateLicenseModel2!=null &&
              this.alternateLicenseModel2.equals(other.getAlternateLicenseModel2()))) &&
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
            ((this.entitledProducts==null && other.getEntitledProducts()==null) || 
             (this.entitledProducts!=null &&
              this.entitledProducts.equals(other.getEntitledProducts()))) &&
            ((this.channelPartners==null && other.getChannelPartners()==null) || 
             (this.channelPartners!=null &&
              this.channelPartners.equals(other.getChannelPartners()))) &&
            ((this.maintenanceLineItems==null && other.getMaintenanceLineItems()==null) || 
             (this.maintenanceLineItems!=null &&
              java.util.Arrays.equals(this.maintenanceLineItems, other.getMaintenanceLineItems()))) &&
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
        if (getAllowPortalLogin() != null) {
            _hashCode += getAllowPortalLogin().hashCode();
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
        if (getAlternateLicenseModel1() != null) {
            _hashCode += getAlternateLicenseModel1().hashCode();
        }
        if (getAlternateLicenseModel2() != null) {
            _hashCode += getAlternateLicenseModel2().hashCode();
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
        if (getEntitledProducts() != null) {
            _hashCode += getEntitledProducts().hashCode();
        }
        if (getChannelPartners() != null) {
            _hashCode += getChannelPartners().hashCode();
        }
        if (getMaintenanceLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaintenanceLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaintenanceLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(EntitlementLineItemPropertiesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemPropertiesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateType"));
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
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orderLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "soldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldToDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "soldToDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("shipToEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "shipToEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "shipToAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentBulkEntitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentBulkEntitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntSoldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntSoldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntSoldToDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntSoldToDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumberDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseTechnology");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnology"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnologyIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseModel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateLicenseModel1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "alternateLicenseModel1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateLicenseModel2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "alternateLicenseModel2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemSupportAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemSupportAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "startDateOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StartDateOptionType"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DurationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "versionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionDateAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "versionDateAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "versionDateAttributesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfCopies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "numberOfCopies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfilledAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "fulfilledAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfRemainingCopies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "numberOfRemainingCopies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeDescriptorDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitledProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitledProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitledProductDataListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "channelPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "channelPartnerDataListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItemPropertiesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FNPTimeZoneValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "FNPTimeZoneValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdOnDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdOnDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeDescriptorDataType"));
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
