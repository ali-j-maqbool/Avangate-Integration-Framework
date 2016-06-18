/**
 * LicenseGeneratorsDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class LicenseGeneratorsDetailsType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.LicenseGeneratorIdentifierType[] licenseGeneratorIdentifier;

    public LicenseGeneratorsDetailsType() {
    }

    public LicenseGeneratorsDetailsType(
           com.flexnet.operations.webservices.LicenseGeneratorIdentifierType[] licenseGeneratorIdentifier) {
           this.licenseGeneratorIdentifier = licenseGeneratorIdentifier;
    }


    /**
     * Gets the licenseGeneratorIdentifier value for this LicenseGeneratorsDetailsType.
     * 
     * @return licenseGeneratorIdentifier
     */
    public com.flexnet.operations.webservices.LicenseGeneratorIdentifierType[] getLicenseGeneratorIdentifier() {
        return licenseGeneratorIdentifier;
    }


    /**
     * Sets the licenseGeneratorIdentifier value for this LicenseGeneratorsDetailsType.
     * 
     * @param licenseGeneratorIdentifier
     */
    public void setLicenseGeneratorIdentifier(com.flexnet.operations.webservices.LicenseGeneratorIdentifierType[] licenseGeneratorIdentifier) {
        this.licenseGeneratorIdentifier = licenseGeneratorIdentifier;
    }

    public com.flexnet.operations.webservices.LicenseGeneratorIdentifierType getLicenseGeneratorIdentifier(int i) {
        return this.licenseGeneratorIdentifier[i];
    }

    public void setLicenseGeneratorIdentifier(int i, com.flexnet.operations.webservices.LicenseGeneratorIdentifierType _value) {
        this.licenseGeneratorIdentifier[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LicenseGeneratorsDetailsType)) return false;
        LicenseGeneratorsDetailsType other = (LicenseGeneratorsDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.licenseGeneratorIdentifier==null && other.getLicenseGeneratorIdentifier()==null) || 
             (this.licenseGeneratorIdentifier!=null &&
              java.util.Arrays.equals(this.licenseGeneratorIdentifier, other.getLicenseGeneratorIdentifier())));
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
        if (getLicenseGeneratorIdentifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLicenseGeneratorIdentifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLicenseGeneratorIdentifier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LicenseGeneratorsDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseGeneratorsDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseGeneratorIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseGeneratorIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseGeneratorIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
