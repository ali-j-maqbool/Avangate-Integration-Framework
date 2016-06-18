/**
 * UpdateLineItemDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UpdateLineItemDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier;

    private com.flexnet.operations.webservices.IdType activationId;

    private java.lang.String description;

    private com.flexnet.operations.webservices.ProductIdentifierType product;

    private com.flexnet.operations.webservices.PartNumberIdentifierType partNumber;

    private com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModel;

    private com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel1;

    private com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel2;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType licenseModelAttributes;

    private java.lang.String FNPTimeZoneValue;

    private com.flexnet.operations.webservices.PolicyAttributesListType policyAttributes;

    private java.lang.String orderId;

    private java.lang.String orderLineNumber;

    private java.math.BigInteger numberOfCopies;

    private java.util.Date startDate;

    private com.flexnet.operations.webservices.StartDateOptionType startDateOption;

    private java.lang.Boolean isPermanent;

    private com.flexnet.operations.webservices.DurationType term;

    private java.util.Date expirationDate;

    private java.util.Date versionDate;

    private com.flexnet.operations.webservices.VersionDateAttributesType versionDateAttributes;

    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItem;

    private com.flexnet.operations.webservices.UpdateEntitledProductDataListType updatedEntitledProducts;

    private com.flexnet.operations.webservices.EntitledProductDataListType entitledProducts;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType lineItemAttributes;

    public UpdateLineItemDataType() {
    }

    public UpdateLineItemDataType(
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier,
           com.flexnet.operations.webservices.IdType activationId,
           java.lang.String description,
           com.flexnet.operations.webservices.ProductIdentifierType product,
           com.flexnet.operations.webservices.PartNumberIdentifierType partNumber,
           com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModel,
           com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel1,
           com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel2,
           com.flexnet.operations.webservices.AttributeDescriptorDataType licenseModelAttributes,
           java.lang.String FNPTimeZoneValue,
           com.flexnet.operations.webservices.PolicyAttributesListType policyAttributes,
           java.lang.String orderId,
           java.lang.String orderLineNumber,
           java.math.BigInteger numberOfCopies,
           java.util.Date startDate,
           com.flexnet.operations.webservices.StartDateOptionType startDateOption,
           java.lang.Boolean isPermanent,
           com.flexnet.operations.webservices.DurationType term,
           java.util.Date expirationDate,
           java.util.Date versionDate,
           com.flexnet.operations.webservices.VersionDateAttributesType versionDateAttributes,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItem,
           com.flexnet.operations.webservices.UpdateEntitledProductDataListType updatedEntitledProducts,
           com.flexnet.operations.webservices.EntitledProductDataListType entitledProducts,
           com.flexnet.operations.webservices.AttributeDescriptorDataType lineItemAttributes) {
           this.lineItemIdentifier = lineItemIdentifier;
           this.activationId = activationId;
           this.description = description;
           this.product = product;
           this.partNumber = partNumber;
           this.licenseModel = licenseModel;
           this.alternateLicenseModel1 = alternateLicenseModel1;
           this.alternateLicenseModel2 = alternateLicenseModel2;
           this.licenseModelAttributes = licenseModelAttributes;
           this.FNPTimeZoneValue = FNPTimeZoneValue;
           this.policyAttributes = policyAttributes;
           this.orderId = orderId;
           this.orderLineNumber = orderLineNumber;
           this.numberOfCopies = numberOfCopies;
           this.startDate = startDate;
           this.startDateOption = startDateOption;
           this.isPermanent = isPermanent;
           this.term = term;
           this.expirationDate = expirationDate;
           this.versionDate = versionDate;
           this.versionDateAttributes = versionDateAttributes;
           this.parentLineItem = parentLineItem;
           this.updatedEntitledProducts = updatedEntitledProducts;
           this.entitledProducts = entitledProducts;
           this.lineItemAttributes = lineItemAttributes;
    }


    /**
     * Gets the lineItemIdentifier value for this UpdateLineItemDataType.
     * 
     * @return lineItemIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getLineItemIdentifier() {
        return lineItemIdentifier;
    }


    /**
     * Sets the lineItemIdentifier value for this UpdateLineItemDataType.
     * 
     * @param lineItemIdentifier
     */
    public void setLineItemIdentifier(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier) {
        this.lineItemIdentifier = lineItemIdentifier;
    }


    /**
     * Gets the activationId value for this UpdateLineItemDataType.
     * 
     * @return activationId
     */
    public com.flexnet.operations.webservices.IdType getActivationId() {
        return activationId;
    }


    /**
     * Sets the activationId value for this UpdateLineItemDataType.
     * 
     * @param activationId
     */
    public void setActivationId(com.flexnet.operations.webservices.IdType activationId) {
        this.activationId = activationId;
    }


    /**
     * Gets the description value for this UpdateLineItemDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UpdateLineItemDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the product value for this UpdateLineItemDataType.
     * 
     * @return product
     */
    public com.flexnet.operations.webservices.ProductIdentifierType getProduct() {
        return product;
    }


    /**
     * Sets the product value for this UpdateLineItemDataType.
     * 
     * @param product
     */
    public void setProduct(com.flexnet.operations.webservices.ProductIdentifierType product) {
        this.product = product;
    }


    /**
     * Gets the partNumber value for this UpdateLineItemDataType.
     * 
     * @return partNumber
     */
    public com.flexnet.operations.webservices.PartNumberIdentifierType getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this UpdateLineItemDataType.
     * 
     * @param partNumber
     */
    public void setPartNumber(com.flexnet.operations.webservices.PartNumberIdentifierType partNumber) {
        this.partNumber = partNumber;
    }


    /**
     * Gets the licenseModel value for this UpdateLineItemDataType.
     * 
     * @return licenseModel
     */
    public com.flexnet.operations.webservices.LicenseModelIdentifierType getLicenseModel() {
        return licenseModel;
    }


    /**
     * Sets the licenseModel value for this UpdateLineItemDataType.
     * 
     * @param licenseModel
     */
    public void setLicenseModel(com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModel) {
        this.licenseModel = licenseModel;
    }


    /**
     * Gets the alternateLicenseModel1 value for this UpdateLineItemDataType.
     * 
     * @return alternateLicenseModel1
     */
    public com.flexnet.operations.webservices.LicenseModelIdentifierType getAlternateLicenseModel1() {
        return alternateLicenseModel1;
    }


    /**
     * Sets the alternateLicenseModel1 value for this UpdateLineItemDataType.
     * 
     * @param alternateLicenseModel1
     */
    public void setAlternateLicenseModel1(com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel1) {
        this.alternateLicenseModel1 = alternateLicenseModel1;
    }


    /**
     * Gets the alternateLicenseModel2 value for this UpdateLineItemDataType.
     * 
     * @return alternateLicenseModel2
     */
    public com.flexnet.operations.webservices.LicenseModelIdentifierType getAlternateLicenseModel2() {
        return alternateLicenseModel2;
    }


    /**
     * Sets the alternateLicenseModel2 value for this UpdateLineItemDataType.
     * 
     * @param alternateLicenseModel2
     */
    public void setAlternateLicenseModel2(com.flexnet.operations.webservices.LicenseModelIdentifierType alternateLicenseModel2) {
        this.alternateLicenseModel2 = alternateLicenseModel2;
    }


    /**
     * Gets the licenseModelAttributes value for this UpdateLineItemDataType.
     * 
     * @return licenseModelAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getLicenseModelAttributes() {
        return licenseModelAttributes;
    }


    /**
     * Sets the licenseModelAttributes value for this UpdateLineItemDataType.
     * 
     * @param licenseModelAttributes
     */
    public void setLicenseModelAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType licenseModelAttributes) {
        this.licenseModelAttributes = licenseModelAttributes;
    }


    /**
     * Gets the FNPTimeZoneValue value for this UpdateLineItemDataType.
     * 
     * @return FNPTimeZoneValue
     */
    public java.lang.String getFNPTimeZoneValue() {
        return FNPTimeZoneValue;
    }


    /**
     * Sets the FNPTimeZoneValue value for this UpdateLineItemDataType.
     * 
     * @param FNPTimeZoneValue
     */
    public void setFNPTimeZoneValue(java.lang.String FNPTimeZoneValue) {
        this.FNPTimeZoneValue = FNPTimeZoneValue;
    }


    /**
     * Gets the policyAttributes value for this UpdateLineItemDataType.
     * 
     * @return policyAttributes
     */
    public com.flexnet.operations.webservices.PolicyAttributesListType getPolicyAttributes() {
        return policyAttributes;
    }


    /**
     * Sets the policyAttributes value for this UpdateLineItemDataType.
     * 
     * @param policyAttributes
     */
    public void setPolicyAttributes(com.flexnet.operations.webservices.PolicyAttributesListType policyAttributes) {
        this.policyAttributes = policyAttributes;
    }


    /**
     * Gets the orderId value for this UpdateLineItemDataType.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this UpdateLineItemDataType.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderLineNumber value for this UpdateLineItemDataType.
     * 
     * @return orderLineNumber
     */
    public java.lang.String getOrderLineNumber() {
        return orderLineNumber;
    }


    /**
     * Sets the orderLineNumber value for this UpdateLineItemDataType.
     * 
     * @param orderLineNumber
     */
    public void setOrderLineNumber(java.lang.String orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }


    /**
     * Gets the numberOfCopies value for this UpdateLineItemDataType.
     * 
     * @return numberOfCopies
     */
    public java.math.BigInteger getNumberOfCopies() {
        return numberOfCopies;
    }


    /**
     * Sets the numberOfCopies value for this UpdateLineItemDataType.
     * 
     * @param numberOfCopies
     */
    public void setNumberOfCopies(java.math.BigInteger numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }


    /**
     * Gets the startDate value for this UpdateLineItemDataType.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this UpdateLineItemDataType.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startDateOption value for this UpdateLineItemDataType.
     * 
     * @return startDateOption
     */
    public com.flexnet.operations.webservices.StartDateOptionType getStartDateOption() {
        return startDateOption;
    }


    /**
     * Sets the startDateOption value for this UpdateLineItemDataType.
     * 
     * @param startDateOption
     */
    public void setStartDateOption(com.flexnet.operations.webservices.StartDateOptionType startDateOption) {
        this.startDateOption = startDateOption;
    }


    /**
     * Gets the isPermanent value for this UpdateLineItemDataType.
     * 
     * @return isPermanent
     */
    public java.lang.Boolean getIsPermanent() {
        return isPermanent;
    }


    /**
     * Sets the isPermanent value for this UpdateLineItemDataType.
     * 
     * @param isPermanent
     */
    public void setIsPermanent(java.lang.Boolean isPermanent) {
        this.isPermanent = isPermanent;
    }


    /**
     * Gets the term value for this UpdateLineItemDataType.
     * 
     * @return term
     */
    public com.flexnet.operations.webservices.DurationType getTerm() {
        return term;
    }


    /**
     * Sets the term value for this UpdateLineItemDataType.
     * 
     * @param term
     */
    public void setTerm(com.flexnet.operations.webservices.DurationType term) {
        this.term = term;
    }


    /**
     * Gets the expirationDate value for this UpdateLineItemDataType.
     * 
     * @return expirationDate
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this UpdateLineItemDataType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the versionDate value for this UpdateLineItemDataType.
     * 
     * @return versionDate
     */
    public java.util.Date getVersionDate() {
        return versionDate;
    }


    /**
     * Sets the versionDate value for this UpdateLineItemDataType.
     * 
     * @param versionDate
     */
    public void setVersionDate(java.util.Date versionDate) {
        this.versionDate = versionDate;
    }


    /**
     * Gets the versionDateAttributes value for this UpdateLineItemDataType.
     * 
     * @return versionDateAttributes
     */
    public com.flexnet.operations.webservices.VersionDateAttributesType getVersionDateAttributes() {
        return versionDateAttributes;
    }


    /**
     * Sets the versionDateAttributes value for this UpdateLineItemDataType.
     * 
     * @param versionDateAttributes
     */
    public void setVersionDateAttributes(com.flexnet.operations.webservices.VersionDateAttributesType versionDateAttributes) {
        this.versionDateAttributes = versionDateAttributes;
    }


    /**
     * Gets the parentLineItem value for this UpdateLineItemDataType.
     * 
     * @return parentLineItem
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getParentLineItem() {
        return parentLineItem;
    }


    /**
     * Sets the parentLineItem value for this UpdateLineItemDataType.
     * 
     * @param parentLineItem
     */
    public void setParentLineItem(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItem) {
        this.parentLineItem = parentLineItem;
    }


    /**
     * Gets the updatedEntitledProducts value for this UpdateLineItemDataType.
     * 
     * @return updatedEntitledProducts
     */
    public com.flexnet.operations.webservices.UpdateEntitledProductDataListType getUpdatedEntitledProducts() {
        return updatedEntitledProducts;
    }


    /**
     * Sets the updatedEntitledProducts value for this UpdateLineItemDataType.
     * 
     * @param updatedEntitledProducts
     */
    public void setUpdatedEntitledProducts(com.flexnet.operations.webservices.UpdateEntitledProductDataListType updatedEntitledProducts) {
        this.updatedEntitledProducts = updatedEntitledProducts;
    }


    /**
     * Gets the entitledProducts value for this UpdateLineItemDataType.
     * 
     * @return entitledProducts
     */
    public com.flexnet.operations.webservices.EntitledProductDataListType getEntitledProducts() {
        return entitledProducts;
    }


    /**
     * Sets the entitledProducts value for this UpdateLineItemDataType.
     * 
     * @param entitledProducts
     */
    public void setEntitledProducts(com.flexnet.operations.webservices.EntitledProductDataListType entitledProducts) {
        this.entitledProducts = entitledProducts;
    }


    /**
     * Gets the lineItemAttributes value for this UpdateLineItemDataType.
     * 
     * @return lineItemAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getLineItemAttributes() {
        return lineItemAttributes;
    }


    /**
     * Sets the lineItemAttributes value for this UpdateLineItemDataType.
     * 
     * @param lineItemAttributes
     */
    public void setLineItemAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType lineItemAttributes) {
        this.lineItemAttributes = lineItemAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateLineItemDataType)) return false;
        UpdateLineItemDataType other = (UpdateLineItemDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemIdentifier==null && other.getLineItemIdentifier()==null) || 
             (this.lineItemIdentifier!=null &&
              this.lineItemIdentifier.equals(other.getLineItemIdentifier()))) &&
            ((this.activationId==null && other.getActivationId()==null) || 
             (this.activationId!=null &&
              this.activationId.equals(other.getActivationId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
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
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderLineNumber==null && other.getOrderLineNumber()==null) || 
             (this.orderLineNumber!=null &&
              this.orderLineNumber.equals(other.getOrderLineNumber()))) &&
            ((this.numberOfCopies==null && other.getNumberOfCopies()==null) || 
             (this.numberOfCopies!=null &&
              this.numberOfCopies.equals(other.getNumberOfCopies()))) &&
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
            ((this.parentLineItem==null && other.getParentLineItem()==null) || 
             (this.parentLineItem!=null &&
              this.parentLineItem.equals(other.getParentLineItem()))) &&
            ((this.updatedEntitledProducts==null && other.getUpdatedEntitledProducts()==null) || 
             (this.updatedEntitledProducts!=null &&
              this.updatedEntitledProducts.equals(other.getUpdatedEntitledProducts()))) &&
            ((this.entitledProducts==null && other.getEntitledProducts()==null) || 
             (this.entitledProducts!=null &&
              this.entitledProducts.equals(other.getEntitledProducts()))) &&
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
        if (getLineItemIdentifier() != null) {
            _hashCode += getLineItemIdentifier().hashCode();
        }
        if (getActivationId() != null) {
            _hashCode += getActivationId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderLineNumber() != null) {
            _hashCode += getOrderLineNumber().hashCode();
        }
        if (getNumberOfCopies() != null) {
            _hashCode += getNumberOfCopies().hashCode();
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
        if (getParentLineItem() != null) {
            _hashCode += getParentLineItem().hashCode();
        }
        if (getUpdatedEntitledProducts() != null) {
            _hashCode += getUpdatedEntitledProducts().hashCode();
        }
        if (getEntitledProducts() != null) {
            _hashCode += getEntitledProducts().hashCode();
        }
        if (getLineItemAttributes() != null) {
            _hashCode += getLineItemAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateLineItemDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateLineItemDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "idType"));
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
        elemField.setFieldName("numberOfCopies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "numberOfCopies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setFieldName("parentLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedEntitledProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updatedEntitledProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateEntitledProductDataListType"));
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
