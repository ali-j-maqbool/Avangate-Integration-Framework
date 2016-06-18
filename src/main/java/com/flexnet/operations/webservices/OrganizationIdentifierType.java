/**
 * OrganizationIdentifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class OrganizationIdentifierType  implements java.io.Serializable {
    private java.lang.String uniqueId;

    private com.flexnet.operations.webservices.OrganizationPKType primaryKeys;

    public OrganizationIdentifierType() {
    }

    public OrganizationIdentifierType(
           java.lang.String uniqueId,
           com.flexnet.operations.webservices.OrganizationPKType primaryKeys) {
           this.uniqueId = uniqueId;
           this.primaryKeys = primaryKeys;
    }


    /**
     * Gets the uniqueId value for this OrganizationIdentifierType.
     * 
     * @return uniqueId
     */
    public java.lang.String getUniqueId() {
        return uniqueId;
    }


    /**
     * Sets the uniqueId value for this OrganizationIdentifierType.
     * 
     * @param uniqueId
     */
    public void setUniqueId(java.lang.String uniqueId) {
        this.uniqueId = uniqueId;
    }


    /**
     * Gets the primaryKeys value for this OrganizationIdentifierType.
     * 
     * @return primaryKeys
     */
    public com.flexnet.operations.webservices.OrganizationPKType getPrimaryKeys() {
        return primaryKeys;
    }


    /**
     * Sets the primaryKeys value for this OrganizationIdentifierType.
     * 
     * @param primaryKeys
     */
    public void setPrimaryKeys(com.flexnet.operations.webservices.OrganizationPKType primaryKeys) {
        this.primaryKeys = primaryKeys;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrganizationIdentifierType)) return false;
        OrganizationIdentifierType other = (OrganizationIdentifierType) obj;
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
            ((this.primaryKeys==null && other.getPrimaryKeys()==null) || 
             (this.primaryKeys!=null &&
              this.primaryKeys.equals(other.getPrimaryKeys())));
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
        if (getPrimaryKeys() != null) {
            _hashCode += getPrimaryKeys().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationIdentifierType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationIdentifierType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "uniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "primaryKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationPKType"));
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
