/**
 * CreateBulkEntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreateBulkEntitlementDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.IdType entitlementId;

    private java.lang.String soldTo;

    private com.flexnet.operations.webservices.ProductIdentifierType product;

    private com.flexnet.operations.webservices.PartNumberIdentifierType partNumber;

    private com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModel;

    private com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel1;

    private com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel2;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType licenseModelAttributes;

    private java.lang.String FNPTimeZoneValue;

    private com.flexnet.operations.webservices.PolicyAttributesListType policyAttributes;

    private java.lang.String shipToEmail;

    private java.lang.String shipToAddress;

    private java.lang.String orderId;

    private java.lang.String orderLineNumber;

    private com.flexnet.operations.webservices.StartDateOptionType startDateOption;

    private java.lang.Boolean isPermanent;

    private com.flexnet.operations.webservices.DurationType term;

    private java.util.Date expirationDate;

    private java.util.Date versionDate;

    private com.flexnet.operations.webservices.VersionDateAttributesType versionDateAttributes;

    private java.lang.String description;

    private java.math.BigInteger numberOfCopies;

    private com.flexnet.operations.webservices.BulkEntitlementType bulkEntitlementType;

    private java.lang.Boolean autoDeploy;

    private com.flexnet.operations.webservices.EntitledProductDataListType entitledProducts;

    private com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners;

    private java.lang.Boolean allowPortalLogin;

    public CreateBulkEntitlementDataType() {
    }

    public CreateBulkEntitlementDataType(
           com.flexnet.operations.webservices.IdType entitlementId,
           java.lang.String soldTo,
           com.flexnet.operations.webservices.ProductIdentifierType product,
           com.flexnet.operations.webservices.PartNumberIdentifierType partNumber,
           com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModel,
           com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel1,
           com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel2,
           com.flexnet.operations.webservices.AttributeDescriptorDataType licenseModelAttributes,
           java.lang.String FNPTimeZoneValue,
           com.flexnet.operations.webservices.PolicyAttributesListType policyAttributes,
           java.lang.String shipToEmail,
           java.lang.String shipToAddress,
           java.lang.String orderId,
           java.lang.String orderLineNumber,
           com.flexnet.operations.webservices.StartDateOptionType startDateOption,
           java.lang.Boolean isPermanent,
           com.flexnet.operations.webservices.DurationType term,
           java.util.Date expirationDate,
           java.util.Date versionDate,
           com.flexnet.operations.webservices.VersionDateAttributesType versionDateAttributes,
           java.lang.String description,
           java.math.BigInteger numberOfCopies,
           com.flexnet.operations.webservices.BulkEntitlementType bulkEntitlementType,
           java.lang.Boolean autoDeploy,
           com.flexnet.operations.webservices.EntitledProductDataListType entitledProducts,
           com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners,
           java.lang.Boolean allowPortalLogin) {
           this.entitlementId = entitlementId;
           this.soldTo = soldTo;
           this.product = product;
           this.partNumber = partNumber;
           this.licenseModel = licenseModel;
           this.alternateLicenseModel1 = alternateLicenseModel1;
           this.alternateLicenseModel2 = alternateLicenseModel2;
           this.licenseModelAttributes = licenseModelAttributes;
           this.FNPTimeZoneValue = FNPTimeZoneValue;
           this.policyAttributes = policyAttributes;
           this.shipToEmail = shipToEmail;
           this.shipToAddress = shipToAddress;
           this.orderId = orderId;
           this.orderLineNumber = orderLineNumber;
           this.startDateOption = startDateOption;
           this.isPermanent = isPermanent;
           this.term = term;
           this.expirationDate = expirationDate;
           this.versionDate = versionDate;
           this.versionDateAttributes = versionDateAttributes;
           this.description = description;
           this.numberOfCopies = numberOfCopies;
           this.bulkEntitlementType = bulkEntitlementType;
           this.autoDeploy = autoDeploy;
           this.entitledProducts = entitledProducts;
           this.channelPartners = channelPartners;
           this.allowPortalLogin = allowPortalLogin;
    }


    /**
     * Gets the entitlementId value for this CreateBulkEntitlementDataType.
     * 
     * @return entitlementId
     */
    public com.flexnet.operations.webservices.IdType getEntitlementId() {
        return entitlementId;
    }


    /**
     * Sets the entitlementId value for this CreateBulkEntitlementDataType.
     * 
     * @param entitlementId
     */
    public void setEntitlementId(com.flexnet.operations.webservices.IdType entitlementId) {
        this.entitlementId = entitlementId;
    }


    /**
     * Gets the soldTo value for this CreateBulkEntitlementDataType.
     * 
     * @return soldTo
     */
    public java.lang.String getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this CreateBulkEntitlementDataType.
     * 
     * @param soldTo
     */
    public void setSoldTo(java.lang.String soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the product value for this CreateBulkEntitlementDataType.
     * 
     * @return product
     */
    public com.flexnet.operations.webservices.ProductIdentifierType getProduct() {
        return product;
    }


    /**
     * Sets the product value for this CreateBulkEntitlementDataType.
     * 
     * @param product
     */
    public void setProduct(com.flexnet.operations.webservices.ProductIdentifierType product) {
        this.product = product;
    }


    /**
     * Gets the partNumber value for this CreateBulkEntitlementDataType.
     * 
     * @return partNumber
     */
    public com.flexnet.operations.webservices.PartNumberIdentifierType getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this CreateBulkEntitlementDataType.
     * 
     * @param partNumber
     */
    public void setPartNumber(com.flexnet.operations.webservices.PartNumberIdentifierType partNumber) {
        this.partNumber = partNumber;
    }


    /**
     * Gets the licenseModel value for this CreateBulkEntitlementDataType.
     * 
     * @return licenseModel
     */
    public com.flexnet.operations.webservices.LicenseModelIdentifierType getLicenseModel() {
        return licenseModel;
    }


    /**
     * Sets the licenseModel value for this CreateBulkEntitlementDataType.
     * 
     * @param licenseModel
     */
    public void setLicenseModel(com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModel) {
        this.licenseModel = licenseModel;
    }


    /**
     * Gets the alternateLicenseModel1 value for this CreateBulkEntitlementDataType.
     * 
     * @return alternateLicenseModel1
     */
    public com.flexnet.operations.webservices.LicenseModelIdentifierType getAlternateLicenseModel1() {
        return alternateLicenseModel1;
    }


    /**
     * Sets the alternateLicenseModel1 value for this CreateBulkEntitlementDataType.
     * 
     * @param alternateLicenseModel1
     */
    public void setAlternateLicenseModel1(com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel1) {
        this.alternateLicenseModel1 = alternateLicenseModel1;
    }


    /**
     * Gets the alternateLicenseModel2 value for this CreateBulkEntitlementDataType.
     * 
     * @return alternateLicenseModel2
     */
    public com.flexnet.operations.webservices.LicenseModelIdentifierType getAlternateLicenseModel2() {
        return alternateLicenseModel2;
    }


    /**
     * Sets the alternateLicenseModel2 value for this CreateBulkEntitlementDataType.
     * 
     * @param alternateLicenseModel2
     */
    public void setAlternateLicenseModel2(com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel2) {
        this.alternateLicenseModel2 = alternateLicenseModel2;
    }


    /**
     * Gets the licenseModelAttributes value for this CreateBulkEntitlementDataType.
     * 
     * @return licenseModelAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getLicenseModelAttributes() {
        return licenseModelAttributes;
    }


    /**
     * Sets the licenseModelAttributes value for this CreateBulkEntitlementDataType.
     * 
     * @param licenseModelAttributes
     */
    public void setLicenseModelAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType licenseModelAttributes) {
        this.licenseModelAttributes = licenseModelAttributes;
    }


    /**
     * Gets the FNPTimeZoneValue value for this CreateBulkEntitlementDataType.
     * 
     * @return FNPTimeZoneValue
     */
    public java.lang.String getFNPTimeZoneValue() {
        return FNPTimeZoneValue;
    }


    /**
     * Sets the FNPTimeZoneValue value for this CreateBulkEntitlementDataType.
     * 
     * @param FNPTimeZoneValue
     */
    public void setFNPTimeZoneValue(java.lang.String FNPTimeZoneValue) {
        this.FNPTimeZoneValue = FNPTimeZoneValue;
    }


    /**
     * Gets the policyAttributes value for this CreateBulkEntitlementDataType.
     * 
     * @return policyAttributes
     */
    public com.flexnet.operations.webservices.PolicyAttributesListType getPolicyAttributes() {
        return policyAttributes;
    }


    /**
     * Sets the policyAttributes value for this CreateBulkEntitlementDataType.
     * 
     * @param policyAttributes
     */
    public void setPolicyAttributes(com.flexnet.operations.webservices.PolicyAttributesListType policyAttributes) {
        this.policyAttributes = policyAttributes;
    }


    /**
     * Gets the shipToEmail value for this CreateBulkEntitlementDataType.
     * 
     * @return shipToEmail
     */
    public java.lang.String getShipToEmail() {
        return shipToEmail;
    }


    /**
     * Sets the shipToEmail value for this CreateBulkEntitlementDataType.
     * 
     * @param shipToEmail
     */
    public void setShipToEmail(java.lang.String shipToEmail) {
        this.shipToEmail = shipToEmail;
    }


    /**
     * Gets the shipToAddress value for this CreateBulkEntitlementDataType.
     * 
     * @return shipToAddress
     */
    public java.lang.String getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this CreateBulkEntitlementDataType.
     * 
     * @param shipToAddress
     */
    public void setShipToAddress(java.lang.String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the orderId value for this CreateBulkEntitlementDataType.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this CreateBulkEntitlementDataType.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderLineNumber value for this CreateBulkEntitlementDataType.
     * 
     * @return orderLineNumber
     */
    public java.lang.String getOrderLineNumber() {
        return orderLineNumber;
    }


    /**
     * Sets the orderLineNumber value for this CreateBulkEntitlementDataType.
     * 
     * @param orderLineNumber
     */
    public void setOrderLineNumber(java.lang.String orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }


    /**
     * Gets the startDateOption value for this CreateBulkEntitlementDataType.
     * 
     * @return startDateOption
     */
    public com.flexnet.operations.webservices.StartDateOptionType getStartDateOption() {
        return startDateOption;
    }


    /**
     * Sets the startDateOption value for this CreateBulkEntitlementDataType.
     * 
     * @param startDateOption
     */
    public void setStartDateOption(com.flexnet.operations.webservices.StartDateOptionType startDateOption) {
        this.startDateOption = startDateOption;
    }


    /**
     * Gets the isPermanent value for this CreateBulkEntitlementDataType.
     * 
     * @return isPermanent
     */
    public java.lang.Boolean getIsPermanent() {
        return isPermanent;
    }


    /**
     * Sets the isPermanent value for this CreateBulkEntitlementDataType.
     * 
     * @param isPermanent
     */
    public void setIsPermanent(java.lang.Boolean isPermanent) {
        this.isPermanent = isPermanent;
    }


    /**
     * Gets the term value for this CreateBulkEntitlementDataType.
     * 
     * @return term
     */
    public com.flexnet.operations.webservices.DurationType getTerm() {
        return term;
    }


    /**
     * Sets the term value for this CreateBulkEntitlementDataType.
     * 
     * @param term
     */
    public void setTerm(com.flexnet.operations.webservices.DurationType term) {
        this.term = term;
    }


    /**
     * Gets the expirationDate value for this CreateBulkEntitlementDataType.
     * 
     * @return expirationDate
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this CreateBulkEntitlementDataType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the versionDate value for this CreateBulkEntitlementDataType.
     * 
     * @return versionDate
     */
    public java.util.Date getVersionDate() {
        return versionDate;
    }


    /**
     * Sets the versionDate value for this CreateBulkEntitlementDataType.
     * 
     * @param versionDate
     */
    public void setVersionDate(java.util.Date versionDate) {
        this.versionDate = versionDate;
    }


    /**
     * Gets the versionDateAttributes value for this CreateBulkEntitlementDataType.
     * 
     * @return versionDateAttributes
     */
    public com.flexnet.operations.webservices.VersionDateAttributesType getVersionDateAttributes() {
        return versionDateAttributes;
    }


    /**
     * Sets the versionDateAttributes value for this CreateBulkEntitlementDataType.
     * 
     * @param versionDateAttributes
     */
    public void setVersionDateAttributes(com.flexnet.operations.webservices.VersionDateAttributesType versionDateAttributes) {
        this.versionDateAttributes = versionDateAttributes;
    }


    /**
     * Gets the description value for this CreateBulkEntitlementDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CreateBulkEntitlementDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the numberOfCopies value for this CreateBulkEntitlementDataType.
     * 
     * @return numberOfCopies
     */
    public java.math.BigInteger getNumberOfCopies() {
        return numberOfCopies;
    }


    /**
     * Sets the numberOfCopies value for this CreateBulkEntitlementDataType.
     * 
     * @param numberOfCopies
     */
    public void setNumberOfCopies(java.math.BigInteger numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }


    /**
     * Gets the bulkEntitlementType value for this CreateBulkEntitlementDataType.
     * 
     * @return bulkEntitlementType
     */
    public com.flexnet.operations.webservices.BulkEntitlementType getBulkEntitlementType() {
        return bulkEntitlementType;
    }


    /**
     * Sets the bulkEntitlementType value for this CreateBulkEntitlementDataType.
     * 
     * @param bulkEntitlementType
     */
    public void setBulkEntitlementType(com.flexnet.operations.webservices.BulkEntitlementType bulkEntitlementType) {
        this.bulkEntitlementType = bulkEntitlementType;
    }


    /**
     * Gets the autoDeploy value for this CreateBulkEntitlementDataType.
     * 
     * @return autoDeploy
     */
    public java.lang.Boolean getAutoDeploy() {
        return autoDeploy;
    }


    /**
     * Sets the autoDeploy value for this CreateBulkEntitlementDataType.
     * 
     * @param autoDeploy
     */
    public void setAutoDeploy(java.lang.Boolean autoDeploy) {
        this.autoDeploy = autoDeploy;
    }


    /**
     * Gets the entitledProducts value for this CreateBulkEntitlementDataType.
     * 
     * @return entitledProducts
     */
    public com.flexnet.operations.webservices.EntitledProductDataListType getEntitledProducts() {
        return entitledProducts;
    }


    /**
     * Sets the entitledProducts value for this CreateBulkEntitlementDataType.
     * 
     * @param entitledProducts
     */
    public void setEntitledProducts(com.flexnet.operations.webservices.EntitledProductDataListType entitledProducts) {
        this.entitledProducts = entitledProducts;
    }


    /**
     * Gets the channelPartners value for this CreateBulkEntitlementDataType.
     * 
     * @return channelPartners
     */
    public com.flexnet.operations.webservices.ChannelPartnerDataListType getChannelPartners() {
        return channelPartners;
    }


    /**
     * Sets the channelPartners value for this CreateBulkEntitlementDataType.
     * 
     * @param channelPartners
     */
    public void setChannelPartners(com.flexnet.operations.webservices.ChannelPartnerDataListType channelPartners) {
        this.channelPartners = channelPartners;
    }


    /**
     * Gets the allowPortalLogin value for this CreateBulkEntitlementDataType.
     * 
     * @return allowPortalLogin
     */
    public java.lang.Boolean getAllowPortalLogin() {
        return allowPortalLogin;
    }


    /**
     * Sets the allowPortalLogin value for this CreateBulkEntitlementDataType.
     * 
     * @param allowPortalLogin
     */
    public void setAllowPortalLogin(java.lang.Boolean allowPortalLogin) {
        this.allowPortalLogin = allowPortalLogin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateBulkEntitlementDataType)) return false;
        CreateBulkEntitlementDataType other = (CreateBulkEntitlementDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitlementId==null && other.getEntitlementId()==null) || 
             (this.entitlementId!=null &&
              this.entitlementId.equals(other.getEntitlementId()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.partNumber==null && other.getPartNumber()==null) || 
             (this.partNumber!=null &&
              this.partNumber.equals(other.getPartNumber()))) &&
            ((this.licenseModel==null && other.getLicenseModel()==null) || 
             (this.licenseModel!=null &&
              this.licenseModel.equals(other.getLicenseModel()))) &&
            ((this.alternateLicenseModel1==null && other.getAlternateLicenseModel1()==null) || 
             (this.alternateLicenseModel1!=null &&
              this.alternateLicenseModel1.equals(other.getAlternateLicenseModel1()))) &&
            ((this.alternateLicenseModel2==null && other.getAlternateLicenseModel2()==null) || 
             (this.alternateLicenseModel2!=null &&
              this.alternateLicenseModel2.equals(other.getAlternateLicenseModel2()))) &&
            ((this.licenseModelAttributes==null && other.getLicenseModelAttributes()==null) || 
             (this.licenseModelAttributes!=null &&
              this.licenseModelAttributes.equals(other.getLicenseModelAttributes()))) &&
            ((this.FNPTimeZoneValue==null && other.getFNPTimeZoneValue()==null) || 
             (this.FNPTimeZoneValue!=null &&
              this.FNPTimeZoneValue.equals(other.getFNPTimeZoneValue()))) &&
            ((this.policyAttributes==null && other.getPolicyAttributes()==null) || 
             (this.policyAttributes!=null &&
              this.policyAttributes.equals(other.getPolicyAttributes()))) &&
            ((this.shipToEmail==null && other.getShipToEmail()==null) || 
             (this.shipToEmail!=null &&
              this.shipToEmail.equals(other.getShipToEmail()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderLineNumber==null && other.getOrderLineNumber()==null) || 
             (this.orderLineNumber!=null &&
              this.orderLineNumber.equals(other.getOrderLineNumber()))) &&
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.numberOfCopies==null && other.getNumberOfCopies()==null) || 
             (this.numberOfCopies!=null &&
              this.numberOfCopies.equals(other.getNumberOfCopies()))) &&
            ((this.bulkEntitlementType==null && other.getBulkEntitlementType()==null) || 
             (this.bulkEntitlementType!=null &&
              this.bulkEntitlementType.equals(other.getBulkEntitlementType()))) &&
            ((this.autoDeploy==null && other.getAutoDeploy()==null) || 
             (this.autoDeploy!=null &&
              this.autoDeploy.equals(other.getAutoDeploy()))) &&
            ((this.entitledProducts==null && other.getEntitledProducts()==null) || 
             (this.entitledProducts!=null &&
              this.entitledProducts.equals(other.getEntitledProducts()))) &&
            ((this.channelPartners==null && other.getChannelPartners()==null) || 
             (this.channelPartners!=null &&
              this.channelPartners.equals(other.getChannelPartners()))) &&
            ((this.allowPortalLogin==null && other.getAllowPortalLogin()==null) || 
             (this.allowPortalLogin!=null &&
              this.allowPortalLogin.equals(other.getAllowPortalLogin())));
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
        if (getEntitlementId() != null) {
            _hashCode += getEntitlementId().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getPartNumber() != null) {
            _hashCode += getPartNumber().hashCode();
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
        if (getLicenseModelAttributes() != null) {
            _hashCode += getLicenseModelAttributes().hashCode();
        }
        if (getFNPTimeZoneValue() != null) {
            _hashCode += getFNPTimeZoneValue().hashCode();
        }
        if (getPolicyAttributes() != null) {
            _hashCode += getPolicyAttributes().hashCode();
        }
        if (getShipToEmail() != null) {
            _hashCode += getShipToEmail().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderLineNumber() != null) {
            _hashCode += getOrderLineNumber().hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getNumberOfCopies() != null) {
            _hashCode += getNumberOfCopies().hashCode();
        }
        if (getBulkEntitlementType() != null) {
            _hashCode += getBulkEntitlementType().hashCode();
        }
        if (getAutoDeploy() != null) {
            _hashCode += getAutoDeploy().hashCode();
        }
        if (getEntitledProducts() != null) {
            _hashCode += getEntitledProducts().hashCode();
        }
        if (getChannelPartners() != null) {
            _hashCode += getChannelPartners().hashCode();
        }
        if (getAllowPortalLogin() != null) {
            _hashCode += getAllowPortalLogin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateBulkEntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createBulkEntitlementDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "soldTo"));
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
        elemField.setFieldName("partNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberIdentifierType"));
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
        elemField.setFieldName("licenseModelAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeDescriptorDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FNPTimeZoneValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "FNPTimeZoneValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyAttributesListType"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("bulkEntitlementType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "BulkEntitlementType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoDeploy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "autoDeploy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("allowPortalLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "allowPortalLogin"));
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
