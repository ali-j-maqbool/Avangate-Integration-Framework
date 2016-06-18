/**
 * FailedDeleteUserDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedDeleteUserDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedDeleteUserDataType[] failedUser;

    public FailedDeleteUserDataListType() {
    }

    public FailedDeleteUserDataListType(
           com.flexnet.operations.webservices.FailedDeleteUserDataType[] failedUser) {
           this.failedUser = failedUser;
    }


    /**
     * Gets the failedUser value for this FailedDeleteUserDataListType.
     * 
     * @return failedUser
     */
    public com.flexnet.operations.webservices.FailedDeleteUserDataType[] getFailedUser() {
        return failedUser;
    }


    /**
     * Sets the failedUser value for this FailedDeleteUserDataListType.
     * 
     * @param failedUser
     */
    public void setFailedUser(com.flexnet.operations.webservices.FailedDeleteUserDataType[] failedUser) {
        this.failedUser = failedUser;
    }

    public com.flexnet.operations.webservices.FailedDeleteUserDataType getFailedUser(int i) {
        return this.failedUser[i];
    }

    public void setFailedUser(int i, com.flexnet.operations.webservices.FailedDeleteUserDataType _value) {
        this.failedUser[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedDeleteUserDataListType)) return false;
        FailedDeleteUserDataListType other = (FailedDeleteUserDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedUser==null && other.getFailedUser()==null) || 
             (this.failedUser!=null &&
              java.util.Arrays.equals(this.failedUser, other.getFailedUser())));
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
        if (getFailedUser() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedUser());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedUser(), i);
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
        new org.apache.axis.description.TypeDesc(FailedDeleteUserDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteUserDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteUserDataType"));
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
