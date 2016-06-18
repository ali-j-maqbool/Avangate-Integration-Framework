/**
 * GetEntitlementAttributesRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetEntitlementAttributesRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModelIdentifier;

    public GetEntitlementAttributesRequestType() {
    }

    public GetEntitlementAttributesRequestType(
           com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModelIdentifier) {
           this.licenseModelIdentifier = licenseModelIdentifier;
    }


    /**
     * Gets the licenseModelIdentifier value for this GetEntitlementAttributesRequestType.
     * 
     * @return licenseModelIdentifier
     */
    public com.flexnet.operations.webservices.LicenseModelIdentifierType getLicenseModelIdentifier() {
        return licenseModelIdentifier;
    }


    /**
     * Sets the licenseModelIdentifier value for this GetEntitlementAttributesRequestType.
     * 
     * @param licenseModelIdentifier
     */
    public void setLicenseModelIdentifier(com.flexnet.operations.webservices.LicenseModelIdentifierType licenseModelIdentifier) {
        this.licenseModelIdentifier = licenseModelIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEntitlementAttributesRequestType)) return false;
        GetEntitlementAttributesRequestType other = (GetEntitlementAttributesRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.licenseModelIdentifier==null && other.getLicenseModelIdentifier()==null) || 
             (this.licenseModelIdentifier!=null &&
              this.licenseModelIdentifier.equals(other.getLicenseModelIdentifier())));
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
        if (getLicenseModelIdentifier() != null) {
            _hashCode += getLicenseModelIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEntitlementAttributesRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementAttributesRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseModelIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelIdentifierType"));
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
