/**
 * AddonLineItemDataDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class AddonLineItemDataDataType  implements java.io.Serializable {
    private java.lang.String uniqueId;

    private java.lang.String activationId;

    private java.math.BigInteger enabledCount;

    private java.math.BigInteger consumedCount;

    private com.flexnet.opsembedded.webservices.LicenseStateType licenseState;

    private com.flexnet.opsembedded.webservices.EntitledProductDataListType entitledProducts;

    public AddonLineItemDataDataType() {
    }

    public AddonLineItemDataDataType(
           java.lang.String uniqueId,
           java.lang.String activationId,
           java.math.BigInteger enabledCount,
           java.math.BigInteger consumedCount,
           com.flexnet.opsembedded.webservices.LicenseStateType licenseState,
           com.flexnet.opsembedded.webservices.EntitledProductDataListType entitledProducts) {
           this.uniqueId = uniqueId;
           this.activationId = activationId;
           this.enabledCount = enabledCount;
           this.consumedCount = consumedCount;
           this.licenseState = licenseState;
           this.entitledProducts = entitledProducts;
    }


    /**
     * Gets the uniqueId value for this AddonLineItemDataDataType.
     * 
     * @return uniqueId
     */
    public java.lang.String getUniqueId() {
        return uniqueId;
    }


    /**
     * Sets the uniqueId value for this AddonLineItemDataDataType.
     * 
     * @param uniqueId
     */
    public void setUniqueId(java.lang.String uniqueId) {
        this.uniqueId = uniqueId;
    }


    /**
     * Gets the activationId value for this AddonLineItemDataDataType.
     * 
     * @return activationId
     */
    public java.lang.String getActivationId() {
        return activationId;
    }


    /**
     * Sets the activationId value for this AddonLineItemDataDataType.
     * 
     * @param activationId
     */
    public void setActivationId(java.lang.String activationId) {
        this.activationId = activationId;
    }


    /**
     * Gets the enabledCount value for this AddonLineItemDataDataType.
     * 
     * @return enabledCount
     */
    public java.math.BigInteger getEnabledCount() {
        return enabledCount;
    }


    /**
     * Sets the enabledCount value for this AddonLineItemDataDataType.
     * 
     * @param enabledCount
     */
    public void setEnabledCount(java.math.BigInteger enabledCount) {
        this.enabledCount = enabledCount;
    }


    /**
     * Gets the consumedCount value for this AddonLineItemDataDataType.
     * 
     * @return consumedCount
     */
    public java.math.BigInteger getConsumedCount() {
        return consumedCount;
    }


    /**
     * Sets the consumedCount value for this AddonLineItemDataDataType.
     * 
     * @param consumedCount
     */
    public void setConsumedCount(java.math.BigInteger consumedCount) {
        this.consumedCount = consumedCount;
    }


    /**
     * Gets the licenseState value for this AddonLineItemDataDataType.
     * 
     * @return licenseState
     */
    public com.flexnet.opsembedded.webservices.LicenseStateType getLicenseState() {
        return licenseState;
    }


    /**
     * Sets the licenseState value for this AddonLineItemDataDataType.
     * 
     * @param licenseState
     */
    public void setLicenseState(com.flexnet.opsembedded.webservices.LicenseStateType licenseState) {
        this.licenseState = licenseState;
    }


    /**
     * Gets the entitledProducts value for this AddonLineItemDataDataType.
     * 
     * @return entitledProducts
     */
    public com.flexnet.opsembedded.webservices.EntitledProductDataListType getEntitledProducts() {
        return entitledProducts;
    }


    /**
     * Sets the entitledProducts value for this AddonLineItemDataDataType.
     * 
     * @param entitledProducts
     */
    public void setEntitledProducts(com.flexnet.opsembedded.webservices.EntitledProductDataListType entitledProducts) {
        this.entitledProducts = entitledProducts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddonLineItemDataDataType)) return false;
        AddonLineItemDataDataType other = (AddonLineItemDataDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uniqueId==null && other.getUniqueId()==null) || 
             (this.uniqueId!=null &&
              this.uniqueId.equals(other.getUniqueId()))) &&
            ((this.activationId==null && other.getActivationId()==null) || 
             (this.activationId!=null &&
              this.activationId.equals(other.getActivationId()))) &&
            ((this.enabledCount==null && other.getEnabledCount()==null) || 
             (this.enabledCount!=null &&
              this.enabledCount.equals(other.getEnabledCount()))) &&
            ((this.consumedCount==null && other.getConsumedCount()==null) || 
             (this.consumedCount!=null &&
              this.consumedCount.equals(other.getConsumedCount()))) &&
            ((this.licenseState==null && other.getLicenseState()==null) || 
             (this.licenseState!=null &&
              this.licenseState.equals(other.getLicenseState()))) &&
            ((this.entitledProducts==null && other.getEntitledProducts()==null) || 
             (this.entitledProducts!=null &&
              this.entitledProducts.equals(other.getEntitledProducts())));
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
        if (getUniqueId() != null) {
            _hashCode += getUniqueId().hashCode();
        }
        if (getActivationId() != null) {
            _hashCode += getActivationId().hashCode();
        }
        if (getEnabledCount() != null) {
            _hashCode += getEnabledCount().hashCode();
        }
        if (getConsumedCount() != null) {
            _hashCode += getConsumedCount().hashCode();
        }
        if (getLicenseState() != null) {
            _hashCode += getLicenseState().hashCode();
        }
        if (getEntitledProducts() != null) {
            _hashCode += getEntitledProducts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddonLineItemDataDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "addonLineItemDataDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "uniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "activationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabledCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "enabledCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "consumedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "licenseState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "licenseStateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitledProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "entitledProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "entitledProductDataListType"));
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
