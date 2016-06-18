/**
 * UpdateUserRolesDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UpdateUserRolesDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.UserIdentifierType user;

    private com.flexnet.operations.webservices.UpdateUserRolesOrganizationDataType orgRoles;

    public UpdateUserRolesDataType() {
    }

    public UpdateUserRolesDataType(
           com.flexnet.operations.webservices.UserIdentifierType user,
           com.flexnet.operations.webservices.UpdateUserRolesOrganizationDataType orgRoles) {
           this.user = user;
           this.orgRoles = orgRoles;
    }


    /**
     * Gets the user value for this UpdateUserRolesDataType.
     * 
     * @return user
     */
    public com.flexnet.operations.webservices.UserIdentifierType getUser() {
        return user;
    }


    /**
     * Sets the user value for this UpdateUserRolesDataType.
     * 
     * @param user
     */
    public void setUser(com.flexnet.operations.webservices.UserIdentifierType user) {
        this.user = user;
    }


    /**
     * Gets the orgRoles value for this UpdateUserRolesDataType.
     * 
     * @return orgRoles
     */
    public com.flexnet.operations.webservices.UpdateUserRolesOrganizationDataType getOrgRoles() {
        return orgRoles;
    }


    /**
     * Sets the orgRoles value for this UpdateUserRolesDataType.
     * 
     * @param orgRoles
     */
    public void setOrgRoles(com.flexnet.operations.webservices.UpdateUserRolesOrganizationDataType orgRoles) {
        this.orgRoles = orgRoles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateUserRolesDataType)) return false;
        UpdateUserRolesDataType other = (UpdateUserRolesDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.orgRoles==null && other.getOrgRoles()==null) || 
             (this.orgRoles!=null &&
              this.orgRoles.equals(other.getOrgRoles())));
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getOrgRoles() != null) {
            _hashCode += getOrgRoles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateUserRolesDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRolesDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRolesOrganizationDataType"));
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
