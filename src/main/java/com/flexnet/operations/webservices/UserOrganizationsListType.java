/**
 * UserOrganizationsListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UserOrganizationsListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.UserOrganizationType[] orgRoles;

    public UserOrganizationsListType() {
    }

    public UserOrganizationsListType(
           com.flexnet.operations.webservices.UserOrganizationType[] orgRoles) {
           this.orgRoles = orgRoles;
    }


    /**
     * Gets the orgRoles value for this UserOrganizationsListType.
     * 
     * @return orgRoles
     */
    public com.flexnet.operations.webservices.UserOrganizationType[] getOrgRoles() {
        return orgRoles;
    }


    /**
     * Sets the orgRoles value for this UserOrganizationsListType.
     * 
     * @param orgRoles
     */
    public void setOrgRoles(com.flexnet.operations.webservices.UserOrganizationType[] orgRoles) {
        this.orgRoles = orgRoles;
    }

    public com.flexnet.operations.webservices.UserOrganizationType getOrgRoles(int i) {
        return this.orgRoles[i];
    }

    public void setOrgRoles(int i, com.flexnet.operations.webservices.UserOrganizationType _value) {
        this.orgRoles[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserOrganizationsListType)) return false;
        UserOrganizationsListType other = (UserOrganizationsListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgRoles==null && other.getOrgRoles()==null) || 
             (this.orgRoles!=null &&
              java.util.Arrays.equals(this.orgRoles, other.getOrgRoles())));
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
        if (getOrgRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrgRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrgRoles(), i);
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
        new org.apache.axis.description.TypeDesc(UserOrganizationsListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userOrganizationsListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userOrganizationType"));
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
