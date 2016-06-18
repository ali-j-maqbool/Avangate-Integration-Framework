/**
 * DeleteOrgDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class DeleteOrgDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.OrganizationIdentifierType organization;

    private java.lang.Boolean deleteSubTree;

    public DeleteOrgDataType() {
    }

    public DeleteOrgDataType(
           com.flexnet.operations.webservices.OrganizationIdentifierType organization,
           java.lang.Boolean deleteSubTree) {
           this.organization = organization;
           this.deleteSubTree = deleteSubTree;
    }


    /**
     * Gets the organization value for this DeleteOrgDataType.
     * 
     * @return organization
     */
    public com.flexnet.operations.webservices.OrganizationIdentifierType getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this DeleteOrgDataType.
     * 
     * @param organization
     */
    public void setOrganization(com.flexnet.operations.webservices.OrganizationIdentifierType organization) {
        this.organization = organization;
    }


    /**
     * Gets the deleteSubTree value for this DeleteOrgDataType.
     * 
     * @return deleteSubTree
     */
    public java.lang.Boolean getDeleteSubTree() {
        return deleteSubTree;
    }


    /**
     * Sets the deleteSubTree value for this DeleteOrgDataType.
     * 
     * @param deleteSubTree
     */
    public void setDeleteSubTree(java.lang.Boolean deleteSubTree) {
        this.deleteSubTree = deleteSubTree;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteOrgDataType)) return false;
        DeleteOrgDataType other = (DeleteOrgDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization()))) &&
            ((this.deleteSubTree==null && other.getDeleteSubTree()==null) || 
             (this.deleteSubTree!=null &&
              this.deleteSubTree.equals(other.getDeleteSubTree())));
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
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        if (getDeleteSubTree() != null) {
            _hashCode += getDeleteSubTree().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteOrgDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteOrgDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteSubTree");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteSubTree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
