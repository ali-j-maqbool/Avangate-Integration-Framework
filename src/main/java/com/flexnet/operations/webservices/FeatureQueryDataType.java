/**
 * FeatureQueryDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FeatureQueryDataType  implements java.io.Serializable {
    private java.lang.String uniqueId;

    private java.lang.String featureName;

    private com.flexnet.operations.webservices.VersionFormatType versionFormat;

    private java.lang.String version;

    private java.lang.String description;

    private com.flexnet.operations.webservices.StateType state;

    private com.flexnet.operations.webservices.FeatureOverrideParamsType featureOverrideParams;

    public FeatureQueryDataType() {
    }

    public FeatureQueryDataType(
           java.lang.String uniqueId,
           java.lang.String featureName,
           com.flexnet.operations.webservices.VersionFormatType versionFormat,
           java.lang.String version,
           java.lang.String description,
           com.flexnet.operations.webservices.StateType state,
           com.flexnet.operations.webservices.FeatureOverrideParamsType featureOverrideParams) {
           this.uniqueId = uniqueId;
           this.featureName = featureName;
           this.versionFormat = versionFormat;
           this.version = version;
           this.description = description;
           this.state = state;
           this.featureOverrideParams = featureOverrideParams;
    }


    /**
     * Gets the uniqueId value for this FeatureQueryDataType.
     * 
     * @return uniqueId
     */
    public java.lang.String getUniqueId() {
        return uniqueId;
    }


    /**
     * Sets the uniqueId value for this FeatureQueryDataType.
     * 
     * @param uniqueId
     */
    public void setUniqueId(java.lang.String uniqueId) {
        this.uniqueId = uniqueId;
    }


    /**
     * Gets the featureName value for this FeatureQueryDataType.
     * 
     * @return featureName
     */
    public java.lang.String getFeatureName() {
        return featureName;
    }


    /**
     * Sets the featureName value for this FeatureQueryDataType.
     * 
     * @param featureName
     */
    public void setFeatureName(java.lang.String featureName) {
        this.featureName = featureName;
    }


    /**
     * Gets the versionFormat value for this FeatureQueryDataType.
     * 
     * @return versionFormat
     */
    public com.flexnet.operations.webservices.VersionFormatType getVersionFormat() {
        return versionFormat;
    }


    /**
     * Sets the versionFormat value for this FeatureQueryDataType.
     * 
     * @param versionFormat
     */
    public void setVersionFormat(com.flexnet.operations.webservices.VersionFormatType versionFormat) {
        this.versionFormat = versionFormat;
    }


    /**
     * Gets the version value for this FeatureQueryDataType.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this FeatureQueryDataType.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the description value for this FeatureQueryDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FeatureQueryDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the state value for this FeatureQueryDataType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.StateType getState() {
        return state;
    }


    /**
     * Sets the state value for this FeatureQueryDataType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.StateType state) {
        this.state = state;
    }


    /**
     * Gets the featureOverrideParams value for this FeatureQueryDataType.
     * 
     * @return featureOverrideParams
     */
    public com.flexnet.operations.webservices.FeatureOverrideParamsType getFeatureOverrideParams() {
        return featureOverrideParams;
    }


    /**
     * Sets the featureOverrideParams value for this FeatureQueryDataType.
     * 
     * @param featureOverrideParams
     */
    public void setFeatureOverrideParams(com.flexnet.operations.webservices.FeatureOverrideParamsType featureOverrideParams) {
        this.featureOverrideParams = featureOverrideParams;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureQueryDataType)) return false;
        FeatureQueryDataType other = (FeatureQueryDataType) obj;
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
            ((this.featureName==null && other.getFeatureName()==null) || 
             (this.featureName!=null &&
              this.featureName.equals(other.getFeatureName()))) &&
            ((this.versionFormat==null && other.getVersionFormat()==null) || 
             (this.versionFormat!=null &&
              this.versionFormat.equals(other.getVersionFormat()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.featureOverrideParams==null && other.getFeatureOverrideParams()==null) || 
             (this.featureOverrideParams!=null &&
              this.featureOverrideParams.equals(other.getFeatureOverrideParams())));
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
        if (getFeatureName() != null) {
            _hashCode += getFeatureName().hashCode();
        }
        if (getVersionFormat() != null) {
            _hashCode += getVersionFormat().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getFeatureOverrideParams() != null) {
            _hashCode += getFeatureOverrideParams().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureQueryDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureQueryDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "uniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "versionFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "VersionFormatType"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureOverrideParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureOverrideParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureOverrideParamsType"));
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
