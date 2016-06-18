/**
 * StateChangeResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class StateChangeResponseType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FeatureStateChangeListType featureList;

    private com.flexnet.operations.webservices.FeatureBundleStateChangeListType featureBundleList;

    private com.flexnet.operations.webservices.ProductStateChangeListType productList;

    private com.flexnet.operations.webservices.LicenseModelStateChangeListType licenseModelList;

    private com.flexnet.operations.webservices.EntitlementStateChangeListType simpleEntitlementList;

    private com.flexnet.operations.webservices.EntitlementStateChangeListType bulkEntitlementList;

    public StateChangeResponseType() {
    }

    public StateChangeResponseType(
           com.flexnet.operations.webservices.FeatureStateChangeListType featureList,
           com.flexnet.operations.webservices.FeatureBundleStateChangeListType featureBundleList,
           com.flexnet.operations.webservices.ProductStateChangeListType productList,
           com.flexnet.operations.webservices.LicenseModelStateChangeListType licenseModelList,
           com.flexnet.operations.webservices.EntitlementStateChangeListType simpleEntitlementList,
           com.flexnet.operations.webservices.EntitlementStateChangeListType bulkEntitlementList) {
           this.featureList = featureList;
           this.featureBundleList = featureBundleList;
           this.productList = productList;
           this.licenseModelList = licenseModelList;
           this.simpleEntitlementList = simpleEntitlementList;
           this.bulkEntitlementList = bulkEntitlementList;
    }


    /**
     * Gets the featureList value for this StateChangeResponseType.
     * 
     * @return featureList
     */
    public com.flexnet.operations.webservices.FeatureStateChangeListType getFeatureList() {
        return featureList;
    }


    /**
     * Sets the featureList value for this StateChangeResponseType.
     * 
     * @param featureList
     */
    public void setFeatureList(com.flexnet.operations.webservices.FeatureStateChangeListType featureList) {
        this.featureList = featureList;
    }


    /**
     * Gets the featureBundleList value for this StateChangeResponseType.
     * 
     * @return featureBundleList
     */
    public com.flexnet.operations.webservices.FeatureBundleStateChangeListType getFeatureBundleList() {
        return featureBundleList;
    }


    /**
     * Sets the featureBundleList value for this StateChangeResponseType.
     * 
     * @param featureBundleList
     */
    public void setFeatureBundleList(com.flexnet.operations.webservices.FeatureBundleStateChangeListType featureBundleList) {
        this.featureBundleList = featureBundleList;
    }


    /**
     * Gets the productList value for this StateChangeResponseType.
     * 
     * @return productList
     */
    public com.flexnet.operations.webservices.ProductStateChangeListType getProductList() {
        return productList;
    }


    /**
     * Sets the productList value for this StateChangeResponseType.
     * 
     * @param productList
     */
    public void setProductList(com.flexnet.operations.webservices.ProductStateChangeListType productList) {
        this.productList = productList;
    }


    /**
     * Gets the licenseModelList value for this StateChangeResponseType.
     * 
     * @return licenseModelList
     */
    public com.flexnet.operations.webservices.LicenseModelStateChangeListType getLicenseModelList() {
        return licenseModelList;
    }


    /**
     * Sets the licenseModelList value for this StateChangeResponseType.
     * 
     * @param licenseModelList
     */
    public void setLicenseModelList(com.flexnet.operations.webservices.LicenseModelStateChangeListType licenseModelList) {
        this.licenseModelList = licenseModelList;
    }


    /**
     * Gets the simpleEntitlementList value for this StateChangeResponseType.
     * 
     * @return simpleEntitlementList
     */
    public com.flexnet.operations.webservices.EntitlementStateChangeListType getSimpleEntitlementList() {
        return simpleEntitlementList;
    }


    /**
     * Sets the simpleEntitlementList value for this StateChangeResponseType.
     * 
     * @param simpleEntitlementList
     */
    public void setSimpleEntitlementList(com.flexnet.operations.webservices.EntitlementStateChangeListType simpleEntitlementList) {
        this.simpleEntitlementList = simpleEntitlementList;
    }


    /**
     * Gets the bulkEntitlementList value for this StateChangeResponseType.
     * 
     * @return bulkEntitlementList
     */
    public com.flexnet.operations.webservices.EntitlementStateChangeListType getBulkEntitlementList() {
        return bulkEntitlementList;
    }


    /**
     * Sets the bulkEntitlementList value for this StateChangeResponseType.
     * 
     * @param bulkEntitlementList
     */
    public void setBulkEntitlementList(com.flexnet.operations.webservices.EntitlementStateChangeListType bulkEntitlementList) {
        this.bulkEntitlementList = bulkEntitlementList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StateChangeResponseType)) return false;
        StateChangeResponseType other = (StateChangeResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featureList==null && other.getFeatureList()==null) || 
             (this.featureList!=null &&
              this.featureList.equals(other.getFeatureList()))) &&
            ((this.featureBundleList==null && other.getFeatureBundleList()==null) || 
             (this.featureBundleList!=null &&
              this.featureBundleList.equals(other.getFeatureBundleList()))) &&
            ((this.productList==null && other.getProductList()==null) || 
             (this.productList!=null &&
              this.productList.equals(other.getProductList()))) &&
            ((this.licenseModelList==null && other.getLicenseModelList()==null) || 
             (this.licenseModelList!=null &&
              this.licenseModelList.equals(other.getLicenseModelList()))) &&
            ((this.simpleEntitlementList==null && other.getSimpleEntitlementList()==null) || 
             (this.simpleEntitlementList!=null &&
              this.simpleEntitlementList.equals(other.getSimpleEntitlementList()))) &&
            ((this.bulkEntitlementList==null && other.getBulkEntitlementList()==null) || 
             (this.bulkEntitlementList!=null &&
              this.bulkEntitlementList.equals(other.getBulkEntitlementList())));
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
        if (getFeatureList() != null) {
            _hashCode += getFeatureList().hashCode();
        }
        if (getFeatureBundleList() != null) {
            _hashCode += getFeatureBundleList().hashCode();
        }
        if (getProductList() != null) {
            _hashCode += getProductList().hashCode();
        }
        if (getLicenseModelList() != null) {
            _hashCode += getLicenseModelList().hashCode();
        }
        if (getSimpleEntitlementList() != null) {
            _hashCode += getSimpleEntitlementList().hashCode();
        }
        if (getBulkEntitlementList() != null) {
            _hashCode += getBulkEntitlementList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StateChangeResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "stateChangeResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureStateChangeListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureBundleList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleStateChangeListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productStateChangeListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseModelList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelStateChangeListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpleEntitlementList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "simpleEntitlementList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementStateChangeListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntitlementList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementStateChangeListType"));
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
