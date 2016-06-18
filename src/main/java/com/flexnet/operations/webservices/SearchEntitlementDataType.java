/**
 * SearchEntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class SearchEntitlementDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SimpleQueryType entitlementId;

    private com.flexnet.operations.webservices.SimpleQueryType entDescription;

    private com.flexnet.operations.webservices.SimpleQueryType productName;

    private com.flexnet.operations.webservices.SimpleQueryType productVersion;

    private com.flexnet.operations.webservices.ProductType productType;

    private com.flexnet.operations.webservices.SimpleQueryType partNumber;

    private java.lang.Boolean isBulk;

    private com.flexnet.operations.webservices.SimpleQueryType soldTo;

    private com.flexnet.operations.webservices.SimpleQueryType shipToEmail;

    private com.flexnet.operations.webservices.SimpleQueryType shipToAddress;

    private com.flexnet.operations.webservices.DateQueryType startDate;

    private java.lang.Boolean isPermanent;

    private com.flexnet.operations.webservices.DateQueryType expirationDate;

    private com.flexnet.operations.webservices.DateQueryType createdOn;

    private com.flexnet.operations.webservices.DateQueryType versionDate;

    private com.flexnet.operations.webservices.DateQueryType lastModifiedDate;

    private com.flexnet.operations.webservices.SimpleQueryType description;

    private com.flexnet.operations.webservices.StateQueryType state;

    private com.flexnet.operations.webservices.SimpleQueryType licenseTechnology;

    private com.flexnet.operations.webservices.SimpleQueryType createdUserId;

    private com.flexnet.operations.webservices.PartnerTierQueryType organizationUnitName;

    private com.flexnet.operations.webservices.SimpleQueryType currentOwnerName;

    private com.flexnet.operations.webservices.DateQueryType maintStartDate;

    private java.lang.Boolean maintIsPermanent;

    private com.flexnet.operations.webservices.DateQueryType maintExpirationDate;

    private com.flexnet.operations.webservices.EntCustomAttributesQueryListType entitlementAttributes;

    public SearchEntitlementDataType() {
    }

    public SearchEntitlementDataType(
           com.flexnet.operations.webservices.SimpleQueryType entitlementId,
           com.flexnet.operations.webservices.SimpleQueryType entDescription,
           com.flexnet.operations.webservices.SimpleQueryType productName,
           com.flexnet.operations.webservices.SimpleQueryType productVersion,
           com.flexnet.operations.webservices.ProductType productType,
           com.flexnet.operations.webservices.SimpleQueryType partNumber,
           java.lang.Boolean isBulk,
           com.flexnet.operations.webservices.SimpleQueryType soldTo,
           com.flexnet.operations.webservices.SimpleQueryType shipToEmail,
           com.flexnet.operations.webservices.SimpleQueryType shipToAddress,
           com.flexnet.operations.webservices.DateQueryType startDate,
           java.lang.Boolean isPermanent,
           com.flexnet.operations.webservices.DateQueryType expirationDate,
           com.flexnet.operations.webservices.DateQueryType createdOn,
           com.flexnet.operations.webservices.DateQueryType versionDate,
           com.flexnet.operations.webservices.DateQueryType lastModifiedDate,
           com.flexnet.operations.webservices.SimpleQueryType description,
           com.flexnet.operations.webservices.StateQueryType state,
           com.flexnet.operations.webservices.SimpleQueryType licenseTechnology,
           com.flexnet.operations.webservices.SimpleQueryType createdUserId,
           com.flexnet.operations.webservices.PartnerTierQueryType organizationUnitName,
           com.flexnet.operations.webservices.SimpleQueryType currentOwnerName,
           com.flexnet.operations.webservices.DateQueryType maintStartDate,
           java.lang.Boolean maintIsPermanent,
           com.flexnet.operations.webservices.DateQueryType maintExpirationDate,
           com.flexnet.operations.webservices.EntCustomAttributesQueryListType entitlementAttributes) {
           this.entitlementId = entitlementId;
           this.entDescription = entDescription;
           this.productName = productName;
           this.productVersion = productVersion;
           this.productType = productType;
           this.partNumber = partNumber;
           this.isBulk = isBulk;
           this.soldTo = soldTo;
           this.shipToEmail = shipToEmail;
           this.shipToAddress = shipToAddress;
           this.startDate = startDate;
           this.isPermanent = isPermanent;
           this.expirationDate = expirationDate;
           this.createdOn = createdOn;
           this.versionDate = versionDate;
           this.lastModifiedDate = lastModifiedDate;
           this.description = description;
           this.state = state;
           this.licenseTechnology = licenseTechnology;
           this.createdUserId = createdUserId;
           this.organizationUnitName = organizationUnitName;
           this.currentOwnerName = currentOwnerName;
           this.maintStartDate = maintStartDate;
           this.maintIsPermanent = maintIsPermanent;
           this.maintExpirationDate = maintExpirationDate;
           this.entitlementAttributes = entitlementAttributes;
    }


    /**
     * Gets the entitlementId value for this SearchEntitlementDataType.
     * 
     * @return entitlementId
     */
    public com.flexnet.operations.webservices.SimpleQueryType getEntitlementId() {
        return entitlementId;
    }


    /**
     * Sets the entitlementId value for this SearchEntitlementDataType.
     * 
     * @param entitlementId
     */
    public void setEntitlementId(com.flexnet.operations.webservices.SimpleQueryType entitlementId) {
        this.entitlementId = entitlementId;
    }


    /**
     * Gets the entDescription value for this SearchEntitlementDataType.
     * 
     * @return entDescription
     */
    public com.flexnet.operations.webservices.SimpleQueryType getEntDescription() {
        return entDescription;
    }


    /**
     * Sets the entDescription value for this SearchEntitlementDataType.
     * 
     * @param entDescription
     */
    public void setEntDescription(com.flexnet.operations.webservices.SimpleQueryType entDescription) {
        this.entDescription = entDescription;
    }


    /**
     * Gets the productName value for this SearchEntitlementDataType.
     * 
     * @return productName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this SearchEntitlementDataType.
     * 
     * @param productName
     */
    public void setProductName(com.flexnet.operations.webservices.SimpleQueryType productName) {
        this.productName = productName;
    }


    /**
     * Gets the productVersion value for this SearchEntitlementDataType.
     * 
     * @return productVersion
     */
    public com.flexnet.operations.webservices.SimpleQueryType getProductVersion() {
        return productVersion;
    }


    /**
     * Sets the productVersion value for this SearchEntitlementDataType.
     * 
     * @param productVersion
     */
    public void setProductVersion(com.flexnet.operations.webservices.SimpleQueryType productVersion) {
        this.productVersion = productVersion;
    }


    /**
     * Gets the productType value for this SearchEntitlementDataType.
     * 
     * @return productType
     */
    public com.flexnet.operations.webservices.ProductType getProductType() {
        return productType;
    }


    /**
     * Sets the productType value for this SearchEntitlementDataType.
     * 
     * @param productType
     */
    public void setProductType(com.flexnet.operations.webservices.ProductType productType) {
        this.productType = productType;
    }


    /**
     * Gets the partNumber value for this SearchEntitlementDataType.
     * 
     * @return partNumber
     */
    public com.flexnet.operations.webservices.SimpleQueryType getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this SearchEntitlementDataType.
     * 
     * @param partNumber
     */
    public void setPartNumber(com.flexnet.operations.webservices.SimpleQueryType partNumber) {
        this.partNumber = partNumber;
    }


    /**
     * Gets the isBulk value for this SearchEntitlementDataType.
     * 
     * @return isBulk
     */
    public java.lang.Boolean getIsBulk() {
        return isBulk;
    }


    /**
     * Sets the isBulk value for this SearchEntitlementDataType.
     * 
     * @param isBulk
     */
    public void setIsBulk(java.lang.Boolean isBulk) {
        this.isBulk = isBulk;
    }


    /**
     * Gets the soldTo value for this SearchEntitlementDataType.
     * 
     * @return soldTo
     */
    public com.flexnet.operations.webservices.SimpleQueryType getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this SearchEntitlementDataType.
     * 
     * @param soldTo
     */
    public void setSoldTo(com.flexnet.operations.webservices.SimpleQueryType soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the shipToEmail value for this SearchEntitlementDataType.
     * 
     * @return shipToEmail
     */
    public com.flexnet.operations.webservices.SimpleQueryType getShipToEmail() {
        return shipToEmail;
    }


    /**
     * Sets the shipToEmail value for this SearchEntitlementDataType.
     * 
     * @param shipToEmail
     */
    public void setShipToEmail(com.flexnet.operations.webservices.SimpleQueryType shipToEmail) {
        this.shipToEmail = shipToEmail;
    }


    /**
     * Gets the shipToAddress value for this SearchEntitlementDataType.
     * 
     * @return shipToAddress
     */
    public com.flexnet.operations.webservices.SimpleQueryType getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this SearchEntitlementDataType.
     * 
     * @param shipToAddress
     */
    public void setShipToAddress(com.flexnet.operations.webservices.SimpleQueryType shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the startDate value for this SearchEntitlementDataType.
     * 
     * @return startDate
     */
    public com.flexnet.operations.webservices.DateQueryType getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SearchEntitlementDataType.
     * 
     * @param startDate
     */
    public void setStartDate(com.flexnet.operations.webservices.DateQueryType startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the isPermanent value for this SearchEntitlementDataType.
     * 
     * @return isPermanent
     */
    public java.lang.Boolean getIsPermanent() {
        return isPermanent;
    }


    /**
     * Sets the isPermanent value for this SearchEntitlementDataType.
     * 
     * @param isPermanent
     */
    public void setIsPermanent(java.lang.Boolean isPermanent) {
        this.isPermanent = isPermanent;
    }


    /**
     * Gets the expirationDate value for this SearchEntitlementDataType.
     * 
     * @return expirationDate
     */
    public com.flexnet.operations.webservices.DateQueryType getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this SearchEntitlementDataType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(com.flexnet.operations.webservices.DateQueryType expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the createdOn value for this SearchEntitlementDataType.
     * 
     * @return createdOn
     */
    public com.flexnet.operations.webservices.DateQueryType getCreatedOn() {
        return createdOn;
    }


    /**
     * Sets the createdOn value for this SearchEntitlementDataType.
     * 
     * @param createdOn
     */
    public void setCreatedOn(com.flexnet.operations.webservices.DateQueryType createdOn) {
        this.createdOn = createdOn;
    }


    /**
     * Gets the versionDate value for this SearchEntitlementDataType.
     * 
     * @return versionDate
     */
    public com.flexnet.operations.webservices.DateQueryType getVersionDate() {
        return versionDate;
    }


    /**
     * Sets the versionDate value for this SearchEntitlementDataType.
     * 
     * @param versionDate
     */
    public void setVersionDate(com.flexnet.operations.webservices.DateQueryType versionDate) {
        this.versionDate = versionDate;
    }


    /**
     * Gets the lastModifiedDate value for this SearchEntitlementDataType.
     * 
     * @return lastModifiedDate
     */
    public com.flexnet.operations.webservices.DateQueryType getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this SearchEntitlementDataType.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.flexnet.operations.webservices.DateQueryType lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the description value for this SearchEntitlementDataType.
     * 
     * @return description
     */
    public com.flexnet.operations.webservices.SimpleQueryType getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SearchEntitlementDataType.
     * 
     * @param description
     */
    public void setDescription(com.flexnet.operations.webservices.SimpleQueryType description) {
        this.description = description;
    }


    /**
     * Gets the state value for this SearchEntitlementDataType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.StateQueryType getState() {
        return state;
    }


    /**
     * Sets the state value for this SearchEntitlementDataType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.StateQueryType state) {
        this.state = state;
    }


    /**
     * Gets the licenseTechnology value for this SearchEntitlementDataType.
     * 
     * @return licenseTechnology
     */
    public com.flexnet.operations.webservices.SimpleQueryType getLicenseTechnology() {
        return licenseTechnology;
    }


    /**
     * Sets the licenseTechnology value for this SearchEntitlementDataType.
     * 
     * @param licenseTechnology
     */
    public void setLicenseTechnology(com.flexnet.operations.webservices.SimpleQueryType licenseTechnology) {
        this.licenseTechnology = licenseTechnology;
    }


    /**
     * Gets the createdUserId value for this SearchEntitlementDataType.
     * 
     * @return createdUserId
     */
    public com.flexnet.operations.webservices.SimpleQueryType getCreatedUserId() {
        return createdUserId;
    }


    /**
     * Sets the createdUserId value for this SearchEntitlementDataType.
     * 
     * @param createdUserId
     */
    public void setCreatedUserId(com.flexnet.operations.webservices.SimpleQueryType createdUserId) {
        this.createdUserId = createdUserId;
    }


    /**
     * Gets the organizationUnitName value for this SearchEntitlementDataType.
     * 
     * @return organizationUnitName
     */
    public com.flexnet.operations.webservices.PartnerTierQueryType getOrganizationUnitName() {
        return organizationUnitName;
    }


    /**
     * Sets the organizationUnitName value for this SearchEntitlementDataType.
     * 
     * @param organizationUnitName
     */
    public void setOrganizationUnitName(com.flexnet.operations.webservices.PartnerTierQueryType organizationUnitName) {
        this.organizationUnitName = organizationUnitName;
    }


    /**
     * Gets the currentOwnerName value for this SearchEntitlementDataType.
     * 
     * @return currentOwnerName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getCurrentOwnerName() {
        return currentOwnerName;
    }


    /**
     * Sets the currentOwnerName value for this SearchEntitlementDataType.
     * 
     * @param currentOwnerName
     */
    public void setCurrentOwnerName(com.flexnet.operations.webservices.SimpleQueryType currentOwnerName) {
        this.currentOwnerName = currentOwnerName;
    }


    /**
     * Gets the maintStartDate value for this SearchEntitlementDataType.
     * 
     * @return maintStartDate
     */
    public com.flexnet.operations.webservices.DateQueryType getMaintStartDate() {
        return maintStartDate;
    }


    /**
     * Sets the maintStartDate value for this SearchEntitlementDataType.
     * 
     * @param maintStartDate
     */
    public void setMaintStartDate(com.flexnet.operations.webservices.DateQueryType maintStartDate) {
        this.maintStartDate = maintStartDate;
    }


    /**
     * Gets the maintIsPermanent value for this SearchEntitlementDataType.
     * 
     * @return maintIsPermanent
     */
    public java.lang.Boolean getMaintIsPermanent() {
        return maintIsPermanent;
    }


    /**
     * Sets the maintIsPermanent value for this SearchEntitlementDataType.
     * 
     * @param maintIsPermanent
     */
    public void setMaintIsPermanent(java.lang.Boolean maintIsPermanent) {
        this.maintIsPermanent = maintIsPermanent;
    }


    /**
     * Gets the maintExpirationDate value for this SearchEntitlementDataType.
     * 
     * @return maintExpirationDate
     */
    public com.flexnet.operations.webservices.DateQueryType getMaintExpirationDate() {
        return maintExpirationDate;
    }


    /**
     * Sets the maintExpirationDate value for this SearchEntitlementDataType.
     * 
     * @param maintExpirationDate
     */
    public void setMaintExpirationDate(com.flexnet.operations.webservices.DateQueryType maintExpirationDate) {
        this.maintExpirationDate = maintExpirationDate;
    }


    /**
     * Gets the entitlementAttributes value for this SearchEntitlementDataType.
     * 
     * @return entitlementAttributes
     */
    public com.flexnet.operations.webservices.EntCustomAttributesQueryListType getEntitlementAttributes() {
        return entitlementAttributes;
    }


    /**
     * Sets the entitlementAttributes value for this SearchEntitlementDataType.
     * 
     * @param entitlementAttributes
     */
    public void setEntitlementAttributes(com.flexnet.operations.webservices.EntCustomAttributesQueryListType entitlementAttributes) {
        this.entitlementAttributes = entitlementAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchEntitlementDataType)) return false;
        SearchEntitlementDataType other = (SearchEntitlementDataType) obj;
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
            ((this.entDescription==null && other.getEntDescription()==null) || 
             (this.entDescription!=null &&
              this.entDescription.equals(other.getEntDescription()))) &&
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
            ((this.isBulk==null && other.getIsBulk()==null) || 
             (this.isBulk!=null &&
              this.isBulk.equals(other.getIsBulk()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.shipToEmail==null && other.getShipToEmail()==null) || 
             (this.shipToEmail!=null &&
              this.shipToEmail.equals(other.getShipToEmail()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.isPermanent==null && other.getIsPermanent()==null) || 
             (this.isPermanent!=null &&
              this.isPermanent.equals(other.getIsPermanent()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.createdOn==null && other.getCreatedOn()==null) || 
             (this.createdOn!=null &&
              this.createdOn.equals(other.getCreatedOn()))) &&
            ((this.versionDate==null && other.getVersionDate()==null) || 
             (this.versionDate!=null &&
              this.versionDate.equals(other.getVersionDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.licenseTechnology==null && other.getLicenseTechnology()==null) || 
             (this.licenseTechnology!=null &&
              this.licenseTechnology.equals(other.getLicenseTechnology()))) &&
            ((this.createdUserId==null && other.getCreatedUserId()==null) || 
             (this.createdUserId!=null &&
              this.createdUserId.equals(other.getCreatedUserId()))) &&
            ((this.organizationUnitName==null && other.getOrganizationUnitName()==null) || 
             (this.organizationUnitName!=null &&
              this.organizationUnitName.equals(other.getOrganizationUnitName()))) &&
            ((this.currentOwnerName==null && other.getCurrentOwnerName()==null) || 
             (this.currentOwnerName!=null &&
              this.currentOwnerName.equals(other.getCurrentOwnerName()))) &&
            ((this.maintStartDate==null && other.getMaintStartDate()==null) || 
             (this.maintStartDate!=null &&
              this.maintStartDate.equals(other.getMaintStartDate()))) &&
            ((this.maintIsPermanent==null && other.getMaintIsPermanent()==null) || 
             (this.maintIsPermanent!=null &&
              this.maintIsPermanent.equals(other.getMaintIsPermanent()))) &&
            ((this.maintExpirationDate==null && other.getMaintExpirationDate()==null) || 
             (this.maintExpirationDate!=null &&
              this.maintExpirationDate.equals(other.getMaintExpirationDate()))) &&
            ((this.entitlementAttributes==null && other.getEntitlementAttributes()==null) || 
             (this.entitlementAttributes!=null &&
              this.entitlementAttributes.equals(other.getEntitlementAttributes())));
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
        if (getEntDescription() != null) {
            _hashCode += getEntDescription().hashCode();
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
        if (getIsBulk() != null) {
            _hashCode += getIsBulk().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getShipToEmail() != null) {
            _hashCode += getShipToEmail().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
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
        if (getCreatedOn() != null) {
            _hashCode += getCreatedOn().hashCode();
        }
        if (getVersionDate() != null) {
            _hashCode += getVersionDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getLicenseTechnology() != null) {
            _hashCode += getLicenseTechnology().hashCode();
        }
        if (getCreatedUserId() != null) {
            _hashCode += getCreatedUserId().hashCode();
        }
        if (getOrganizationUnitName() != null) {
            _hashCode += getOrganizationUnitName().hashCode();
        }
        if (getCurrentOwnerName() != null) {
            _hashCode += getCurrentOwnerName().hashCode();
        }
        if (getMaintStartDate() != null) {
            _hashCode += getMaintStartDate().hashCode();
        }
        if (getMaintIsPermanent() != null) {
            _hashCode += getMaintIsPermanent().hashCode();
        }
        if (getMaintExpirationDate() != null) {
            _hashCode += getMaintExpirationDate().hashCode();
        }
        if (getEntitlementAttributes() != null) {
            _hashCode += getEntitlementAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchEntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entDescription"));
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
        elemField.setFieldName("isBulk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isBulk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("shipToEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "shipToEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "shipToAddress"));
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
        elemField.setFieldName("createdOn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdOn"));
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
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateQueryType"));
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
        elemField.setFieldName("createdUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
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
        elemField.setFieldName("maintStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintIsPermanent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintIsPermanent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entCustomAttributesQueryListType"));
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
