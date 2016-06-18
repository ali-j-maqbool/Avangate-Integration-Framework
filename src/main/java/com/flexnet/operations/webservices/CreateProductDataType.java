/**
 * CreateProductDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreateProductDataType  implements java.io.Serializable {
    private java.lang.String productName;

    private java.lang.String version;

    private java.lang.String description;

    private com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology;

    private com.flexnet.operations.webservices.LicenseGeneratorIdentifierType licenseGenerator;

    private com.flexnet.operations.webservices.PackagePropertiesDataType packageProperties;

    private com.flexnet.operations.webservices.FeaturesListType features;

    private com.flexnet.operations.webservices.FeatureBundlesListType featureBundles;

    private com.flexnet.operations.webservices.LicenseModelsListType licenseModels;

    private com.flexnet.operations.webservices.TrustedKeyIdentifierType trustedKey;

    private com.flexnet.operations.webservices.TrustedKeyIdentifierType virtualTrustedKey;

    private com.flexnet.operations.webservices.PartNumbersListType partNumbers;

    private com.flexnet.operations.webservices.HostTypePKType hostType;

    private com.flexnet.operations.webservices.HostTypeListType hostTypes;

    private java.lang.Boolean usedOnDevice;

    private java.lang.String productCategory;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes;

    private java.lang.Boolean allowDownloadObsoleteFrInAdmin;

    private java.lang.Boolean allowDownloadObsoleteFrInPortal;

    private com.flexnet.operations.webservices.AttributeDescriptorDataType productAttributes;

    public CreateProductDataType() {
    }

    public CreateProductDataType(
           java.lang.String productName,
           java.lang.String version,
           java.lang.String description,
           com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology,
           com.flexnet.operations.webservices.LicenseGeneratorIdentifierType licenseGenerator,
           com.flexnet.operations.webservices.PackagePropertiesDataType packageProperties,
           com.flexnet.operations.webservices.FeaturesListType features,
           com.flexnet.operations.webservices.FeatureBundlesListType featureBundles,
           com.flexnet.operations.webservices.LicenseModelsListType licenseModels,
           com.flexnet.operations.webservices.TrustedKeyIdentifierType trustedKey,
           com.flexnet.operations.webservices.TrustedKeyIdentifierType virtualTrustedKey,
           com.flexnet.operations.webservices.PartNumbersListType partNumbers,
           com.flexnet.operations.webservices.HostTypePKType hostType,
           com.flexnet.operations.webservices.HostTypeListType hostTypes,
           java.lang.Boolean usedOnDevice,
           java.lang.String productCategory,
           com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes,
           java.lang.Boolean allowDownloadObsoleteFrInAdmin,
           java.lang.Boolean allowDownloadObsoleteFrInPortal,
           com.flexnet.operations.webservices.AttributeDescriptorDataType productAttributes) {
           this.productName = productName;
           this.version = version;
           this.description = description;
           this.licenseTechnology = licenseTechnology;
           this.licenseGenerator = licenseGenerator;
           this.packageProperties = packageProperties;
           this.features = features;
           this.featureBundles = featureBundles;
           this.licenseModels = licenseModels;
           this.trustedKey = trustedKey;
           this.virtualTrustedKey = virtualTrustedKey;
           this.partNumbers = partNumbers;
           this.hostType = hostType;
           this.hostTypes = hostTypes;
           this.usedOnDevice = usedOnDevice;
           this.productCategory = productCategory;
           this.customAttributes = customAttributes;
           this.allowDownloadObsoleteFrInAdmin = allowDownloadObsoleteFrInAdmin;
           this.allowDownloadObsoleteFrInPortal = allowDownloadObsoleteFrInPortal;
           this.productAttributes = productAttributes;
    }


    /**
     * Gets the productName value for this CreateProductDataType.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this CreateProductDataType.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the version value for this CreateProductDataType.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this CreateProductDataType.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the description value for this CreateProductDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CreateProductDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the licenseTechnology value for this CreateProductDataType.
     * 
     * @return licenseTechnology
     */
    public com.flexnet.operations.webservices.LicenseTechnologyIdentifierType getLicenseTechnology() {
        return licenseTechnology;
    }


    /**
     * Sets the licenseTechnology value for this CreateProductDataType.
     * 
     * @param licenseTechnology
     */
    public void setLicenseTechnology(com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnology) {
        this.licenseTechnology = licenseTechnology;
    }


    /**
     * Gets the licenseGenerator value for this CreateProductDataType.
     * 
     * @return licenseGenerator
     */
    public com.flexnet.operations.webservices.LicenseGeneratorIdentifierType getLicenseGenerator() {
        return licenseGenerator;
    }


    /**
     * Sets the licenseGenerator value for this CreateProductDataType.
     * 
     * @param licenseGenerator
     */
    public void setLicenseGenerator(com.flexnet.operations.webservices.LicenseGeneratorIdentifierType licenseGenerator) {
        this.licenseGenerator = licenseGenerator;
    }


    /**
     * Gets the packageProperties value for this CreateProductDataType.
     * 
     * @return packageProperties
     */
    public com.flexnet.operations.webservices.PackagePropertiesDataType getPackageProperties() {
        return packageProperties;
    }


    /**
     * Sets the packageProperties value for this CreateProductDataType.
     * 
     * @param packageProperties
     */
    public void setPackageProperties(com.flexnet.operations.webservices.PackagePropertiesDataType packageProperties) {
        this.packageProperties = packageProperties;
    }


    /**
     * Gets the features value for this CreateProductDataType.
     * 
     * @return features
     */
    public com.flexnet.operations.webservices.FeaturesListType getFeatures() {
        return features;
    }


    /**
     * Sets the features value for this CreateProductDataType.
     * 
     * @param features
     */
    public void setFeatures(com.flexnet.operations.webservices.FeaturesListType features) {
        this.features = features;
    }


    /**
     * Gets the featureBundles value for this CreateProductDataType.
     * 
     * @return featureBundles
     */
    public com.flexnet.operations.webservices.FeatureBundlesListType getFeatureBundles() {
        return featureBundles;
    }


    /**
     * Sets the featureBundles value for this CreateProductDataType.
     * 
     * @param featureBundles
     */
    public void setFeatureBundles(com.flexnet.operations.webservices.FeatureBundlesListType featureBundles) {
        this.featureBundles = featureBundles;
    }


    /**
     * Gets the licenseModels value for this CreateProductDataType.
     * 
     * @return licenseModels
     */
    public com.flexnet.operations.webservices.LicenseModelsListType getLicenseModels() {
        return licenseModels;
    }


    /**
     * Sets the licenseModels value for this CreateProductDataType.
     * 
     * @param licenseModels
     */
    public void setLicenseModels(com.flexnet.operations.webservices.LicenseModelsListType licenseModels) {
        this.licenseModels = licenseModels;
    }


    /**
     * Gets the trustedKey value for this CreateProductDataType.
     * 
     * @return trustedKey
     */
    public com.flexnet.operations.webservices.TrustedKeyIdentifierType getTrustedKey() {
        return trustedKey;
    }


    /**
     * Sets the trustedKey value for this CreateProductDataType.
     * 
     * @param trustedKey
     */
    public void setTrustedKey(com.flexnet.operations.webservices.TrustedKeyIdentifierType trustedKey) {
        this.trustedKey = trustedKey;
    }


    /**
     * Gets the virtualTrustedKey value for this CreateProductDataType.
     * 
     * @return virtualTrustedKey
     */
    public com.flexnet.operations.webservices.TrustedKeyIdentifierType getVirtualTrustedKey() {
        return virtualTrustedKey;
    }


    /**
     * Sets the virtualTrustedKey value for this CreateProductDataType.
     * 
     * @param virtualTrustedKey
     */
    public void setVirtualTrustedKey(com.flexnet.operations.webservices.TrustedKeyIdentifierType virtualTrustedKey) {
        this.virtualTrustedKey = virtualTrustedKey;
    }


    /**
     * Gets the partNumbers value for this CreateProductDataType.
     * 
     * @return partNumbers
     */
    public com.flexnet.operations.webservices.PartNumbersListType getPartNumbers() {
        return partNumbers;
    }


    /**
     * Sets the partNumbers value for this CreateProductDataType.
     * 
     * @param partNumbers
     */
    public void setPartNumbers(com.flexnet.operations.webservices.PartNumbersListType partNumbers) {
        this.partNumbers = partNumbers;
    }


    /**
     * Gets the hostType value for this CreateProductDataType.
     * 
     * @return hostType
     */
    public com.flexnet.operations.webservices.HostTypePKType getHostType() {
        return hostType;
    }


    /**
     * Sets the hostType value for this CreateProductDataType.
     * 
     * @param hostType
     */
    public void setHostType(com.flexnet.operations.webservices.HostTypePKType hostType) {
        this.hostType = hostType;
    }


    /**
     * Gets the hostTypes value for this CreateProductDataType.
     * 
     * @return hostTypes
     */
    public com.flexnet.operations.webservices.HostTypeListType getHostTypes() {
        return hostTypes;
    }


    /**
     * Sets the hostTypes value for this CreateProductDataType.
     * 
     * @param hostTypes
     */
    public void setHostTypes(com.flexnet.operations.webservices.HostTypeListType hostTypes) {
        this.hostTypes = hostTypes;
    }


    /**
     * Gets the usedOnDevice value for this CreateProductDataType.
     * 
     * @return usedOnDevice
     */
    public java.lang.Boolean getUsedOnDevice() {
        return usedOnDevice;
    }


    /**
     * Sets the usedOnDevice value for this CreateProductDataType.
     * 
     * @param usedOnDevice
     */
    public void setUsedOnDevice(java.lang.Boolean usedOnDevice) {
        this.usedOnDevice = usedOnDevice;
    }


    /**
     * Gets the productCategory value for this CreateProductDataType.
     * 
     * @return productCategory
     */
    public java.lang.String getProductCategory() {
        return productCategory;
    }


    /**
     * Sets the productCategory value for this CreateProductDataType.
     * 
     * @param productCategory
     */
    public void setProductCategory(java.lang.String productCategory) {
        this.productCategory = productCategory;
    }


    /**
     * Gets the customAttributes value for this CreateProductDataType.
     * 
     * @return customAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getCustomAttributes() {
        return customAttributes;
    }


    /**
     * Sets the customAttributes value for this CreateProductDataType.
     * 
     * @param customAttributes
     */
    public void setCustomAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType customAttributes) {
        this.customAttributes = customAttributes;
    }


    /**
     * Gets the allowDownloadObsoleteFrInAdmin value for this CreateProductDataType.
     * 
     * @return allowDownloadObsoleteFrInAdmin
     */
    public java.lang.Boolean getAllowDownloadObsoleteFrInAdmin() {
        return allowDownloadObsoleteFrInAdmin;
    }


    /**
     * Sets the allowDownloadObsoleteFrInAdmin value for this CreateProductDataType.
     * 
     * @param allowDownloadObsoleteFrInAdmin
     */
    public void setAllowDownloadObsoleteFrInAdmin(java.lang.Boolean allowDownloadObsoleteFrInAdmin) {
        this.allowDownloadObsoleteFrInAdmin = allowDownloadObsoleteFrInAdmin;
    }


    /**
     * Gets the allowDownloadObsoleteFrInPortal value for this CreateProductDataType.
     * 
     * @return allowDownloadObsoleteFrInPortal
     */
    public java.lang.Boolean getAllowDownloadObsoleteFrInPortal() {
        return allowDownloadObsoleteFrInPortal;
    }


    /**
     * Sets the allowDownloadObsoleteFrInPortal value for this CreateProductDataType.
     * 
     * @param allowDownloadObsoleteFrInPortal
     */
    public void setAllowDownloadObsoleteFrInPortal(java.lang.Boolean allowDownloadObsoleteFrInPortal) {
        this.allowDownloadObsoleteFrInPortal = allowDownloadObsoleteFrInPortal;
    }


    /**
     * Gets the productAttributes value for this CreateProductDataType.
     * 
     * @return productAttributes
     */
    public com.flexnet.operations.webservices.AttributeDescriptorDataType getProductAttributes() {
        return productAttributes;
    }


    /**
     * Sets the productAttributes value for this CreateProductDataType.
     * 
     * @param productAttributes
     */
    public void setProductAttributes(com.flexnet.operations.webservices.AttributeDescriptorDataType productAttributes) {
        this.productAttributes = productAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateProductDataType)) return false;
        CreateProductDataType other = (CreateProductDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.licenseTechnology==null && other.getLicenseTechnology()==null) || 
             (this.licenseTechnology!=null &&
              this.licenseTechnology.equals(other.getLicenseTechnology()))) &&
            ((this.licenseGenerator==null && other.getLicenseGenerator()==null) || 
             (this.licenseGenerator!=null &&
              this.licenseGenerator.equals(other.getLicenseGenerator()))) &&
            ((this.packageProperties==null && other.getPackageProperties()==null) || 
             (this.packageProperties!=null &&
              this.packageProperties.equals(other.getPackageProperties()))) &&
            ((this.features==null && other.getFeatures()==null) || 
             (this.features!=null &&
              this.features.equals(other.getFeatures()))) &&
            ((this.featureBundles==null && other.getFeatureBundles()==null) || 
             (this.featureBundles!=null &&
              this.featureBundles.equals(other.getFeatureBundles()))) &&
            ((this.licenseModels==null && other.getLicenseModels()==null) || 
             (this.licenseModels!=null &&
              this.licenseModels.equals(other.getLicenseModels()))) &&
            ((this.trustedKey==null && other.getTrustedKey()==null) || 
             (this.trustedKey!=null &&
              this.trustedKey.equals(other.getTrustedKey()))) &&
            ((this.virtualTrustedKey==null && other.getVirtualTrustedKey()==null) || 
             (this.virtualTrustedKey!=null &&
              this.virtualTrustedKey.equals(other.getVirtualTrustedKey()))) &&
            ((this.partNumbers==null && other.getPartNumbers()==null) || 
             (this.partNumbers!=null &&
              this.partNumbers.equals(other.getPartNumbers()))) &&
            ((this.hostType==null && other.getHostType()==null) || 
             (this.hostType!=null &&
              this.hostType.equals(other.getHostType()))) &&
            ((this.hostTypes==null && other.getHostTypes()==null) || 
             (this.hostTypes!=null &&
              this.hostTypes.equals(other.getHostTypes()))) &&
            ((this.usedOnDevice==null && other.getUsedOnDevice()==null) || 
             (this.usedOnDevice!=null &&
              this.usedOnDevice.equals(other.getUsedOnDevice()))) &&
            ((this.productCategory==null && other.getProductCategory()==null) || 
             (this.productCategory!=null &&
              this.productCategory.equals(other.getProductCategory()))) &&
            ((this.customAttributes==null && other.getCustomAttributes()==null) || 
             (this.customAttributes!=null &&
              this.customAttributes.equals(other.getCustomAttributes()))) &&
            ((this.allowDownloadObsoleteFrInAdmin==null && other.getAllowDownloadObsoleteFrInAdmin()==null) || 
             (this.allowDownloadObsoleteFrInAdmin!=null &&
              this.allowDownloadObsoleteFrInAdmin.equals(other.getAllowDownloadObsoleteFrInAdmin()))) &&
            ((this.allowDownloadObsoleteFrInPortal==null && other.getAllowDownloadObsoleteFrInPortal()==null) || 
             (this.allowDownloadObsoleteFrInPortal!=null &&
              this.allowDownloadObsoleteFrInPortal.equals(other.getAllowDownloadObsoleteFrInPortal()))) &&
            ((this.productAttributes==null && other.getProductAttributes()==null) || 
             (this.productAttributes!=null &&
              this.productAttributes.equals(other.getProductAttributes())));
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
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLicenseTechnology() != null) {
            _hashCode += getLicenseTechnology().hashCode();
        }
        if (getLicenseGenerator() != null) {
            _hashCode += getLicenseGenerator().hashCode();
        }
        if (getPackageProperties() != null) {
            _hashCode += getPackageProperties().hashCode();
        }
        if (getFeatures() != null) {
            _hashCode += getFeatures().hashCode();
        }
        if (getFeatureBundles() != null) {
            _hashCode += getFeatureBundles().hashCode();
        }
        if (getLicenseModels() != null) {
            _hashCode += getLicenseModels().hashCode();
        }
        if (getTrustedKey() != null) {
            _hashCode += getTrustedKey().hashCode();
        }
        if (getVirtualTrustedKey() != null) {
            _hashCode += getVirtualTrustedKey().hashCode();
        }
        if (getPartNumbers() != null) {
            _hashCode += getPartNumbers().hashCode();
        }
        if (getHostType() != null) {
            _hashCode += getHostType().hashCode();
        }
        if (getHostTypes() != null) {
            _hashCode += getHostTypes().hashCode();
        }
        if (getUsedOnDevice() != null) {
            _hashCode += getUsedOnDevice().hashCode();
        }
        if (getProductCategory() != null) {
            _hashCode += getProductCategory().hashCode();
        }
        if (getCustomAttributes() != null) {
            _hashCode += getCustomAttributes().hashCode();
        }
        if (getAllowDownloadObsoleteFrInAdmin() != null) {
            _hashCode += getAllowDownloadObsoleteFrInAdmin().hashCode();
        }
        if (getAllowDownloadObsoleteFrInPortal() != null) {
            _hashCode += getAllowDownloadObsoleteFrInPortal().hashCode();
        }
        if (getProductAttributes() != null) {
            _hashCode += getProductAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateProductDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("licenseTechnology");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnology"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnologyIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseGenerator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseGenerator"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseGeneratorIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "packageProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "packagePropertiesDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("features");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "features"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featuresListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureBundles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundlesListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseModels");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModels"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelsListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustedKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "trustedKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "trustedKeyIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualTrustedKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "virtualTrustedKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "trustedKeyIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumbersListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "hostType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "hostTypePKType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "hostTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "hostTypeListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedOnDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "usedOnDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("allowDownloadObsoleteFrInAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "allowDownloadObsoleteFrInAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDownloadObsoleteFrInPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "allowDownloadObsoleteFrInPortal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productAttributes"));
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
