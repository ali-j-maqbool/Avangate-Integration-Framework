/**
 * RelateOrganizationsDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class RelateOrganizationsDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.OrganizationIdentifierType organizationToRelate;

    private com.flexnet.operations.webservices.OrganizationIdentifierType relatedOrganization;

    public RelateOrganizationsDataType() {
    }

    public RelateOrganizationsDataType(
           com.flexnet.operations.webservices.OrganizationIdentifierType organizationToRelate,
           com.flexnet.operations.webservices.OrganizationIdentifierType relatedOrganization) {
           this.organizationToRelate = organizationToRelate;
           this.relatedOrganization = relatedOrganization;
    }


    /**
     * Gets the organizationToRelate value for this RelateOrganizationsDataType.
     * 
     * @return organizationToRelate
     */
    public com.flexnet.operations.webservices.OrganizationIdentifierType getOrganizationToRelate() {
        return organizationToRelate;
    }


    /**
     * Sets the organizationToRelate value for this RelateOrganizationsDataType.
     * 
     * @param organizationToRelate
     */
    public void setOrganizationToRelate(com.flexnet.operations.webservices.OrganizationIdentifierType organizationToRelate) {
        this.organizationToRelate = organizationToRelate;
    }


    /**
     * Gets the relatedOrganization value for this RelateOrganizationsDataType.
     * 
     * @return relatedOrganization
     */
    public com.flexnet.operations.webservices.OrganizationIdentifierType getRelatedOrganization() {
        return relatedOrganization;
    }


    /**
     * Sets the relatedOrganization value for this RelateOrganizationsDataType.
     * 
     * @param relatedOrganization
     */
    public void setRelatedOrganization(com.flexnet.operations.webservices.OrganizationIdentifierType relatedOrganization) {
        this.relatedOrganization = relatedOrganization;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelateOrganizationsDataType)) return false;
        RelateOrganizationsDataType other = (RelateOrganizationsDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.organizationToRelate==null && other.getOrganizationToRelate()==null) || 
             (this.organizationToRelate!=null &&
              this.organizationToRelate.equals(other.getOrganizationToRelate()))) &&
            ((this.relatedOrganization==null && other.getRelatedOrganization()==null) || 
             (this.relatedOrganization!=null &&
              this.relatedOrganization.equals(other.getRelatedOrganization())));
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
        if (getOrganizationToRelate() != null) {
            _hashCode += getOrganizationToRelate().hashCode();
        }
        if (getRelatedOrganization() != null) {
            _hashCode += getRelatedOrganization().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelateOrganizationsDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relateOrganizationsDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationToRelate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationToRelate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedOrganization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relatedOrganization"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationIdentifierType"));
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
