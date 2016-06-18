/**
 * CreateUserOrganizationRolesListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreateUserOrganizationRolesListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.RoleIdentifierType[] role;

    public CreateUserOrganizationRolesListType() {
    }

    public CreateUserOrganizationRolesListType(
           com.flexnet.operations.webservices.RoleIdentifierType[] role) {
           this.role = role;
    }


    /**
     * Gets the role value for this CreateUserOrganizationRolesListType.
     * 
     * @return role
     */
    public com.flexnet.operations.webservices.RoleIdentifierType[] getRole() {
        return role;
    }


    /**
     * Sets the role value for this CreateUserOrganizationRolesListType.
     * 
     * @param role
     */
    public void setRole(com.flexnet.operations.webservices.RoleIdentifierType[] role) {
        this.role = role;
    }

    public com.flexnet.operations.webservices.RoleIdentifierType getRole(int i) {
        return this.role[i];
    }

    public void setRole(int i, com.flexnet.operations.webservices.RoleIdentifierType _value) {
        this.role[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateUserOrganizationRolesListType)) return false;
        CreateUserOrganizationRolesListType other = (CreateUserOrganizationRolesListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              java.util.Arrays.equals(this.role, other.getRole())));
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
        if (getRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRole(), i);
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
        new org.apache.axis.description.TypeDesc(CreateUserOrganizationRolesListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUserOrganizationRolesListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "roleIdentifierType"));
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
