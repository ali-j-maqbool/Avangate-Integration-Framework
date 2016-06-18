/**
 * SuiteQueryParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class SuiteQueryParametersType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SimpleQueryType suiteName;

    private com.flexnet.operations.webservices.SimpleQueryType version;

    private com.flexnet.operations.webservices.SimpleQueryType description;

    private com.flexnet.operations.webservices.SimpleQueryType partNumber;

    private com.flexnet.operations.webservices.StateQueryType state;

    private com.flexnet.operations.webservices.DateQueryType creationDate;

    private com.flexnet.operations.webservices.DateQueryType lastModifiedDate;

    private com.flexnet.operations.webservices.SimpleQueryType licenseTechnology;

    private com.flexnet.operations.webservices.SimpleQueryType hostType;

    private java.lang.Boolean usedOnDevice;

    private com.flexnet.operations.webservices.SuiteCustomAttributesQueryListType productAttributes;

    public SuiteQueryParametersType() {
    }

    public SuiteQueryParametersType(
           com.flexnet.operations.webservices.SimpleQueryType suiteName,
           com.flexnet.operations.webservices.SimpleQueryType version,
           com.flexnet.operations.webservices.SimpleQueryType description,
           com.flexnet.operations.webservices.SimpleQueryType partNumber,
           com.flexnet.operations.webservices.StateQueryType state,
           com.flexnet.operations.webservices.DateQueryType creationDate,
           com.flexnet.operations.webservices.DateQueryType lastModifiedDate,
           com.flexnet.operations.webservices.SimpleQueryType licenseTechnology,
           com.flexnet.operations.webservices.SimpleQueryType hostType,
           java.lang.Boolean usedOnDevice,
           com.flexnet.operations.webservices.SuiteCustomAttributesQueryListType productAttributes) {
           this.suiteName = suiteName;
           this.version = version;
           this.description = description;
           this.partNumber = partNumber;
           this.state = state;
           this.creationDate = creationDate;
           this.lastModifiedDate = lastModifiedDate;
           this.licenseTechnology = licenseTechnology;
           this.hostType = hostType;
           this.usedOnDevice = usedOnDevice;
           this.productAttributes = productAttributes;
    }


    /**
     * Gets the suiteName value for this SuiteQueryParametersType.
     * 
     * @return suiteName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getSuiteName() {
        return suiteName;
    }


    /**
     * Sets the suiteName value for this SuiteQueryParametersType.
     * 
     * @param suiteName
     */
    public void setSuiteName(com.flexnet.operations.webservices.SimpleQueryType suiteName) {
        this.suiteName = suiteName;
    }


    /**
     * Gets the version value for this SuiteQueryParametersType.
     * 
     * @return version
     */
    public com.flexnet.operations.webservices.SimpleQueryType getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SuiteQueryParametersType.
     * 
     * @param version
     */
    public void setVersion(com.flexnet.operations.webservices.SimpleQueryType version) {
        this.version = version;
    }


    /**
     * Gets the description value for this SuiteQueryParametersType.
     * 
     * @return description
     */
    public com.flexnet.operations.webservices.SimpleQueryType getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SuiteQueryParametersType.
     * 
     * @param description
     */
    public void setDescription(com.flexnet.operations.webservices.SimpleQueryType description) {
        this.description = description;
    }


    /**
     * Gets the partNumber value for this SuiteQueryParametersType.
     * 
     * @return partNumber
     */
    public com.flexnet.operations.webservices.SimpleQueryType getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this SuiteQueryParametersType.
     * 
     * @param partNumber
     */
    public void setPartNumber(com.flexnet.operations.webservices.SimpleQueryType partNumber) {
        this.partNumber = partNumber;
    }


    /**
     * Gets the state value for this SuiteQueryParametersType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.StateQueryType getState() {
        return state;
    }


    /**
     * Sets the state value for this SuiteQueryParametersType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.StateQueryType state) {
        this.state = state;
    }


    /**
     * Gets the creationDate value for this SuiteQueryParametersType.
     * 
     * @return creationDate
     */
    public com.flexnet.operations.webservices.DateQueryType getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this SuiteQueryParametersType.
     * 
     * @param creationDate
     */
    public void setCreationDate(com.flexnet.operations.webservices.DateQueryType creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the lastModifiedDate value for this SuiteQueryParametersType.
     * 
     * @return lastModifiedDate
     */
    public com.flexnet.operations.webservices.DateQueryType getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this SuiteQueryParametersType.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.flexnet.operations.webservices.DateQueryType lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the licenseTechnology value for this SuiteQueryParametersType.
     * 
     * @return licenseTechnology
     */
    public com.flexnet.operations.webservices.SimpleQueryType getLicenseTechnology() {
        return licenseTechnology;
    }


    /**
     * Sets the licenseTechnology value for this SuiteQueryParametersType.
     * 
     * @param licenseTechnology
     */
    public void setLicenseTechnology(com.flexnet.operations.webservices.SimpleQueryType licenseTechnology) {
        this.licenseTechnology = licenseTechnology;
    }


    /**
     * Gets the hostType value for this SuiteQueryParametersType.
     * 
     * @return hostType
     */
    public com.flexnet.operations.webservices.SimpleQueryType getHostType() {
        return hostType;
    }


    /**
     * Sets the hostType value for this SuiteQueryParametersType.
     * 
     * @param hostType
     */
    public void setHostType(com.flexnet.operations.webservices.SimpleQueryType hostType) {
        this.hostType = hostType;
    }


    /**
     * Gets the usedOnDevice value for this SuiteQueryParametersType.
     * 
     * @return usedOnDevice
     */
    public java.lang.Boolean getUsedOnDevice() {
        return usedOnDevice;
    }


    /**
     * Sets the usedOnDevice value for this SuiteQueryParametersType.
     * 
     * @param usedOnDevice
     */
    public void setUsedOnDevice(java.lang.Boolean usedOnDevice) {
        this.usedOnDevice = usedOnDevice;
    }


    /**
     * Gets the productAttributes value for this SuiteQueryParametersType.
     * 
     * @return productAttributes
     */
    public com.flexnet.operations.webservices.SuiteCustomAttributesQueryListType getProductAttributes() {
        return productAttributes;
    }


    /**
     * Sets the productAttributes value for this SuiteQueryParametersType.
     * 
     * @param productAttributes
     */
    public void setProductAttributes(com.flexnet.operations.webservices.SuiteCustomAttributesQueryListType productAttributes) {
        this.productAttributes = productAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuiteQueryParametersType)) return false;
        SuiteQueryParametersType other = (SuiteQueryParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.suiteName==null && other.getSuiteName()==null) || 
             (this.suiteName!=null &&
              this.suiteName.equals(other.getSuiteName()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.partNumber==null && other.getPartNumber()==null) || 
             (this.partNumber!=null &&
              this.partNumber.equals(other.getPartNumber()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.licenseTechnology==null && other.getLicenseTechnology()==null) || 
             (this.licenseTechnology!=null &&
              this.licenseTechnology.equals(other.getLicenseTechnology()))) &&
            ((this.hostType==null && other.getHostType()==null) || 
             (this.hostType!=null &&
              this.hostType.equals(other.getHostType()))) &&
            ((this.usedOnDevice==null && other.getUsedOnDevice()==null) || 
             (this.usedOnDevice!=null &&
              this.usedOnDevice.equals(other.getUsedOnDevice()))) &&
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
        if (getSuiteName() != null) {
            _hashCode += getSuiteName().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPartNumber() != null) {
            _hashCode += getPartNumber().hashCode();
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
        if (getLicenseTechnology() != null) {
            _hashCode += getLicenseTechnology().hashCode();
        }
        if (getHostType() != null) {
            _hashCode += getHostType().hashCode();
        }
        if (getUsedOnDevice() != null) {
            _hashCode += getUsedOnDevice().hashCode();
        }
        if (getProductAttributes() != null) {
            _hashCode += getProductAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SuiteQueryParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "suiteQueryParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suiteName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "suiteName"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumber"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseTechnology");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnology"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "hostType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedOnDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "usedOnDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "suiteCustomAttributesQueryListType"));
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
