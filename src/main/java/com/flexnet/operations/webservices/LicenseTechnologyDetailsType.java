/**
 * LicenseTechnologyDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class LicenseTechnologyDetailsType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnologyIdentifier;

    private com.flexnet.operations.webservices.LicenseGeneratorsDetailsType licenseGenerators;

    private com.flexnet.operations.webservices.HostTypeListType hostTypes;

    private com.flexnet.operations.webservices.StateType state;

    public LicenseTechnologyDetailsType() {
    }

    public LicenseTechnologyDetailsType(
           com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnologyIdentifier,
           com.flexnet.operations.webservices.LicenseGeneratorsDetailsType licenseGenerators,
           com.flexnet.operations.webservices.HostTypeListType hostTypes,
           com.flexnet.operations.webservices.StateType state) {
           this.licenseTechnologyIdentifier = licenseTechnologyIdentifier;
           this.licenseGenerators = licenseGenerators;
           this.hostTypes = hostTypes;
           this.state = state;
    }


    /**
     * Gets the licenseTechnologyIdentifier value for this LicenseTechnologyDetailsType.
     * 
     * @return licenseTechnologyIdentifier
     */
    public com.flexnet.operations.webservices.LicenseTechnologyIdentifierType getLicenseTechnologyIdentifier() {
        return licenseTechnologyIdentifier;
    }


    /**
     * Sets the licenseTechnologyIdentifier value for this LicenseTechnologyDetailsType.
     * 
     * @param licenseTechnologyIdentifier
     */
    public void setLicenseTechnologyIdentifier(com.flexnet.operations.webservices.LicenseTechnologyIdentifierType licenseTechnologyIdentifier) {
        this.licenseTechnologyIdentifier = licenseTechnologyIdentifier;
    }


    /**
     * Gets the licenseGenerators value for this LicenseTechnologyDetailsType.
     * 
     * @return licenseGenerators
     */
    public com.flexnet.operations.webservices.LicenseGeneratorsDetailsType getLicenseGenerators() {
        return licenseGenerators;
    }


    /**
     * Sets the licenseGenerators value for this LicenseTechnologyDetailsType.
     * 
     * @param licenseGenerators
     */
    public void setLicenseGenerators(com.flexnet.operations.webservices.LicenseGeneratorsDetailsType licenseGenerators) {
        this.licenseGenerators = licenseGenerators;
    }


    /**
     * Gets the hostTypes value for this LicenseTechnologyDetailsType.
     * 
     * @return hostTypes
     */
    public com.flexnet.operations.webservices.HostTypeListType getHostTypes() {
        return hostTypes;
    }


    /**
     * Sets the hostTypes value for this LicenseTechnologyDetailsType.
     * 
     * @param hostTypes
     */
    public void setHostTypes(com.flexnet.operations.webservices.HostTypeListType hostTypes) {
        this.hostTypes = hostTypes;
    }


    /**
     * Gets the state value for this LicenseTechnologyDetailsType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.StateType getState() {
        return state;
    }


    /**
     * Sets the state value for this LicenseTechnologyDetailsType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.StateType state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LicenseTechnologyDetailsType)) return false;
        LicenseTechnologyDetailsType other = (LicenseTechnologyDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.licenseTechnologyIdentifier==null && other.getLicenseTechnologyIdentifier()==null) || 
             (this.licenseTechnologyIdentifier!=null &&
              this.licenseTechnologyIdentifier.equals(other.getLicenseTechnologyIdentifier()))) &&
            ((this.licenseGenerators==null && other.getLicenseGenerators()==null) || 
             (this.licenseGenerators!=null &&
              this.licenseGenerators.equals(other.getLicenseGenerators()))) &&
            ((this.hostTypes==null && other.getHostTypes()==null) || 
             (this.hostTypes!=null &&
              this.hostTypes.equals(other.getHostTypes()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getLicenseTechnologyIdentifier() != null) {
            _hashCode += getLicenseTechnologyIdentifier().hashCode();
        }
        if (getLicenseGenerators() != null) {
            _hashCode += getLicenseGenerators().hashCode();
        }
        if (getHostTypes() != null) {
            _hashCode += getHostTypes().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LicenseTechnologyDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnologyDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseTechnologyIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnologyIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnologyIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseGenerators");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseGenerators"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseGeneratorsDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "hostTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "hostTypeListType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateType"));
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
