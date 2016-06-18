/**
 * FeatureQueryParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FeatureQueryParametersType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SimpleQueryType featureName;

    private com.flexnet.operations.webservices.SimpleQueryType version;

    private com.flexnet.operations.webservices.VersionFormatQueryType versionFormat;

    private com.flexnet.operations.webservices.SimpleQueryType description;

    private com.flexnet.operations.webservices.StateQueryType state;

    private com.flexnet.operations.webservices.DateQueryType creationDate;

    private com.flexnet.operations.webservices.DateQueryType lastModifiedDate;

    public FeatureQueryParametersType() {
    }

    public FeatureQueryParametersType(
           com.flexnet.operations.webservices.SimpleQueryType featureName,
           com.flexnet.operations.webservices.SimpleQueryType version,
           com.flexnet.operations.webservices.VersionFormatQueryType versionFormat,
           com.flexnet.operations.webservices.SimpleQueryType description,
           com.flexnet.operations.webservices.StateQueryType state,
           com.flexnet.operations.webservices.DateQueryType creationDate,
           com.flexnet.operations.webservices.DateQueryType lastModifiedDate) {
           this.featureName = featureName;
           this.version = version;
           this.versionFormat = versionFormat;
           this.description = description;
           this.state = state;
           this.creationDate = creationDate;
           this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the featureName value for this FeatureQueryParametersType.
     * 
     * @return featureName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getFeatureName() {
        return featureName;
    }


    /**
     * Sets the featureName value for this FeatureQueryParametersType.
     * 
     * @param featureName
     */
    public void setFeatureName(com.flexnet.operations.webservices.SimpleQueryType featureName) {
        this.featureName = featureName;
    }


    /**
     * Gets the version value for this FeatureQueryParametersType.
     * 
     * @return version
     */
    public com.flexnet.operations.webservices.SimpleQueryType getVersion() {
        return version;
    }


    /**
     * Sets the version value for this FeatureQueryParametersType.
     * 
     * @param version
     */
    public void setVersion(com.flexnet.operations.webservices.SimpleQueryType version) {
        this.version = version;
    }


    /**
     * Gets the versionFormat value for this FeatureQueryParametersType.
     * 
     * @return versionFormat
     */
    public com.flexnet.operations.webservices.VersionFormatQueryType getVersionFormat() {
        return versionFormat;
    }


    /**
     * Sets the versionFormat value for this FeatureQueryParametersType.
     * 
     * @param versionFormat
     */
    public void setVersionFormat(com.flexnet.operations.webservices.VersionFormatQueryType versionFormat) {
        this.versionFormat = versionFormat;
    }


    /**
     * Gets the description value for this FeatureQueryParametersType.
     * 
     * @return description
     */
    public com.flexnet.operations.webservices.SimpleQueryType getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FeatureQueryParametersType.
     * 
     * @param description
     */
    public void setDescription(com.flexnet.operations.webservices.SimpleQueryType description) {
        this.description = description;
    }


    /**
     * Gets the state value for this FeatureQueryParametersType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.StateQueryType getState() {
        return state;
    }


    /**
     * Sets the state value for this FeatureQueryParametersType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.StateQueryType state) {
        this.state = state;
    }


    /**
     * Gets the creationDate value for this FeatureQueryParametersType.
     * 
     * @return creationDate
     */
    public com.flexnet.operations.webservices.DateQueryType getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this FeatureQueryParametersType.
     * 
     * @param creationDate
     */
    public void setCreationDate(com.flexnet.operations.webservices.DateQueryType creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the lastModifiedDate value for this FeatureQueryParametersType.
     * 
     * @return lastModifiedDate
     */
    public com.flexnet.operations.webservices.DateQueryType getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this FeatureQueryParametersType.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.flexnet.operations.webservices.DateQueryType lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureQueryParametersType)) return false;
        FeatureQueryParametersType other = (FeatureQueryParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.featureName==null && other.getFeatureName()==null) || 
             (this.featureName!=null &&
              this.featureName.equals(other.getFeatureName()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.versionFormat==null && other.getVersionFormat()==null) || 
             (this.versionFormat!=null &&
              this.versionFormat.equals(other.getVersionFormat()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate())));
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
        if (getFeatureName() != null) {
            _hashCode += getFeatureName().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getVersionFormat() != null) {
            _hashCode += getVersionFormat().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureQueryParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureQueryParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "versionFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "VersionFormatQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
