/**
 * UpdateFeatureBundleDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UpdateFeatureBundleDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FeatureBundleIdentifierType featureBundleIdentifier;

    private java.lang.String name;

    private java.lang.String description;

    private com.flexnet.operations.webservices.UpdateFeaturesListType features;

    public UpdateFeatureBundleDataType() {
    }

    public UpdateFeatureBundleDataType(
           com.flexnet.operations.webservices.FeatureBundleIdentifierType featureBundleIdentifier,
           java.lang.String name,
           java.lang.String description,
           com.flexnet.operations.webservices.UpdateFeaturesListType features) {
           this.featureBundleIdentifier = featureBundleIdentifier;
           this.name = name;
           this.description = description;
           this.features = features;
    }


    /**
     * Gets the featureBundleIdentifier value for this UpdateFeatureBundleDataType.
     * 
     * @return featureBundleIdentifier
     */
    public com.flexnet.operations.webservices.FeatureBundleIdentifierType getFeatureBundleIdentifier() {
        return featureBundleIdentifier;
    }


    /**
     * Sets the featureBundleIdentifier value for this UpdateFeatureBundleDataType.
     * 
     * @param featureBundleIdentifier
     */
    public void setFeatureBundleIdentifier(com.flexnet.operations.webservices.FeatureBundleIdentifierType featureBundleIdentifier) {
        this.featureBundleIdentifier = featureBundleIdentifier;
    }


    /**
     * Gets the name value for this UpdateFeatureBundleDataType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UpdateFeatureBundleDataType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this UpdateFeatureBundleDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UpdateFeatureBundleDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the features value for this UpdateFeatureBundleDataType.
     * 
     * @return features
     */
    public com.flexnet.operations.webservices.UpdateFeaturesListType getFeatures() {
        return features;
    }


    /**
     * Sets the features value for this UpdateFeatureBundleDataType.
     * 
     * @param features
     */
    public void setFeatures(com.flexnet.operations.webservices.UpdateFeaturesListType features) {
        this.features = features;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateFeatureBundleDataType)) return false;
        UpdateFeatureBundleDataType other = (UpdateFeatureBundleDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featureBundleIdentifier==null && other.getFeatureBundleIdentifier()==null) || 
             (this.featureBundleIdentifier!=null &&
              this.featureBundleIdentifier.equals(other.getFeatureBundleIdentifier()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.features==null && other.getFeatures()==null) || 
             (this.features!=null &&
              this.features.equals(other.getFeatures())));
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
        if (getFeatureBundleIdentifier() != null) {
            _hashCode += getFeatureBundleIdentifier().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFeatures() != null) {
            _hashCode += getFeatures().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateFeatureBundleDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureBundleDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureBundleIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "name"));
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
        elemField.setFieldName("features");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "features"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeaturesListType"));
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
