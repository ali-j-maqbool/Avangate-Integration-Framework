/**
 * GetUserPermissionsResponseDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetUserPermissionsResponseDataType  implements java.io.Serializable {
    private java.lang.String userName;

    private java.lang.String orgType;

    private com.flexnet.operations.webservices.PermissionListType permissions;

    public GetUserPermissionsResponseDataType() {
    }

    public GetUserPermissionsResponseDataType(
           java.lang.String userName,
           java.lang.String orgType,
           com.flexnet.operations.webservices.PermissionListType permissions) {
           this.userName = userName;
           this.orgType = orgType;
           this.permissions = permissions;
    }


    /**
     * Gets the userName value for this GetUserPermissionsResponseDataType.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this GetUserPermissionsResponseDataType.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the orgType value for this GetUserPermissionsResponseDataType.
     * 
     * @return orgType
     */
    public java.lang.String getOrgType() {
        return orgType;
    }


    /**
     * Sets the orgType value for this GetUserPermissionsResponseDataType.
     * 
     * @param orgType
     */
    public void setOrgType(java.lang.String orgType) {
        this.orgType = orgType;
    }


    /**
     * Gets the permissions value for this GetUserPermissionsResponseDataType.
     * 
     * @return permissions
     */
    public com.flexnet.operations.webservices.PermissionListType getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this GetUserPermissionsResponseDataType.
     * 
     * @param permissions
     */
    public void setPermissions(com.flexnet.operations.webservices.PermissionListType permissions) {
        this.permissions = permissions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserPermissionsResponseDataType)) return false;
        GetUserPermissionsResponseDataType other = (GetUserPermissionsResponseDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.orgType==null && other.getOrgType()==null) || 
             (this.orgType!=null &&
              this.orgType.equals(other.getOrgType()))) &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              this.permissions.equals(other.getPermissions())));
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
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getOrgType() != null) {
            _hashCode += getOrgType().hashCode();
        }
        if (getPermissions() != null) {
            _hashCode += getPermissions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserPermissionsResponseDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserPermissionsResponseDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "permissionListType"));
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
