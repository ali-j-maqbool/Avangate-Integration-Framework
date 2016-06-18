/**
 * OrgTypeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class OrgTypeList  implements java.io.Serializable {
    private com.flexnet.operations.webservices.OrgType[] orgType;

    public OrgTypeList() {
    }

    public OrgTypeList(
           com.flexnet.operations.webservices.OrgType[] orgType) {
           this.orgType = orgType;
    }


    /**
     * Gets the orgType value for this OrgTypeList.
     * 
     * @return orgType
     */
    public com.flexnet.operations.webservices.OrgType[] getOrgType() {
        return orgType;
    }


    /**
     * Sets the orgType value for this OrgTypeList.
     * 
     * @param orgType
     */
    public void setOrgType(com.flexnet.operations.webservices.OrgType[] orgType) {
        this.orgType = orgType;
    }

    public com.flexnet.operations.webservices.OrgType getOrgType(int i) {
        return this.orgType[i];
    }

    public void setOrgType(int i, com.flexnet.operations.webservices.OrgType _value) {
        this.orgType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrgTypeList)) return false;
        OrgTypeList other = (OrgTypeList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgType==null && other.getOrgType()==null) || 
             (this.orgType!=null &&
              java.util.Arrays.equals(this.orgType, other.getOrgType())));
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
        if (getOrgType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrgType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrgType(), i);
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
        new org.apache.axis.description.TypeDesc(OrgTypeList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "OrgTypeList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "OrgType"));
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
