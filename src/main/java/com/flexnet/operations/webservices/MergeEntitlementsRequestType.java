/**
 * MergeEntitlementsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class MergeEntitlementsRequestType  implements java.io.Serializable {
    private java.lang.String organizationFrom;

    private java.lang.String organizationTo;

    private java.lang.Boolean mergeUsers;

    private java.lang.Boolean mergeEntitlements;

    public MergeEntitlementsRequestType() {
    }

    public MergeEntitlementsRequestType(
           java.lang.String organizationFrom,
           java.lang.String organizationTo,
           java.lang.Boolean mergeUsers,
           java.lang.Boolean mergeEntitlements) {
           this.organizationFrom = organizationFrom;
           this.organizationTo = organizationTo;
           this.mergeUsers = mergeUsers;
           this.mergeEntitlements = mergeEntitlements;
    }


    /**
     * Gets the organizationFrom value for this MergeEntitlementsRequestType.
     * 
     * @return organizationFrom
     */
    public java.lang.String getOrganizationFrom() {
        return organizationFrom;
    }


    /**
     * Sets the organizationFrom value for this MergeEntitlementsRequestType.
     * 
     * @param organizationFrom
     */
    public void setOrganizationFrom(java.lang.String organizationFrom) {
        this.organizationFrom = organizationFrom;
    }


    /**
     * Gets the organizationTo value for this MergeEntitlementsRequestType.
     * 
     * @return organizationTo
     */
    public java.lang.String getOrganizationTo() {
        return organizationTo;
    }


    /**
     * Sets the organizationTo value for this MergeEntitlementsRequestType.
     * 
     * @param organizationTo
     */
    public void setOrganizationTo(java.lang.String organizationTo) {
        this.organizationTo = organizationTo;
    }


    /**
     * Gets the mergeUsers value for this MergeEntitlementsRequestType.
     * 
     * @return mergeUsers
     */
    public java.lang.Boolean getMergeUsers() {
        return mergeUsers;
    }


    /**
     * Sets the mergeUsers value for this MergeEntitlementsRequestType.
     * 
     * @param mergeUsers
     */
    public void setMergeUsers(java.lang.Boolean mergeUsers) {
        this.mergeUsers = mergeUsers;
    }


    /**
     * Gets the mergeEntitlements value for this MergeEntitlementsRequestType.
     * 
     * @return mergeEntitlements
     */
    public java.lang.Boolean getMergeEntitlements() {
        return mergeEntitlements;
    }


    /**
     * Sets the mergeEntitlements value for this MergeEntitlementsRequestType.
     * 
     * @param mergeEntitlements
     */
    public void setMergeEntitlements(java.lang.Boolean mergeEntitlements) {
        this.mergeEntitlements = mergeEntitlements;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MergeEntitlementsRequestType)) return false;
        MergeEntitlementsRequestType other = (MergeEntitlementsRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.organizationFrom==null && other.getOrganizationFrom()==null) || 
             (this.organizationFrom!=null &&
              this.organizationFrom.equals(other.getOrganizationFrom()))) &&
            ((this.organizationTo==null && other.getOrganizationTo()==null) || 
             (this.organizationTo!=null &&
              this.organizationTo.equals(other.getOrganizationTo()))) &&
            ((this.mergeUsers==null && other.getMergeUsers()==null) || 
             (this.mergeUsers!=null &&
              this.mergeUsers.equals(other.getMergeUsers()))) &&
            ((this.mergeEntitlements==null && other.getMergeEntitlements()==null) || 
             (this.mergeEntitlements!=null &&
              this.mergeEntitlements.equals(other.getMergeEntitlements())));
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
        if (getOrganizationFrom() != null) {
            _hashCode += getOrganizationFrom().hashCode();
        }
        if (getOrganizationTo() != null) {
            _hashCode += getOrganizationTo().hashCode();
        }
        if (getMergeUsers() != null) {
            _hashCode += getMergeUsers().hashCode();
        }
        if (getMergeEntitlements() != null) {
            _hashCode += getMergeEntitlements().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MergeEntitlementsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mergeEntitlementsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mergeUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mergeUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mergeEntitlements");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mergeEntitlements"));
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
