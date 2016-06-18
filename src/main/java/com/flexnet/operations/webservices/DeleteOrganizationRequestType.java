/**
 * DeleteOrganizationRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class DeleteOrganizationRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.DeleteOrgDataType[] orgData;

    public DeleteOrganizationRequestType() {
    }

    public DeleteOrganizationRequestType(
           com.flexnet.operations.webservices.DeleteOrgDataType[] orgData) {
           this.orgData = orgData;
    }


    /**
     * Gets the orgData value for this DeleteOrganizationRequestType.
     * 
     * @return orgData
     */
    public com.flexnet.operations.webservices.DeleteOrgDataType[] getOrgData() {
        return orgData;
    }


    /**
     * Sets the orgData value for this DeleteOrganizationRequestType.
     * 
     * @param orgData
     */
    public void setOrgData(com.flexnet.operations.webservices.DeleteOrgDataType[] orgData) {
        this.orgData = orgData;
    }

    public com.flexnet.operations.webservices.DeleteOrgDataType getOrgData(int i) {
        return this.orgData[i];
    }

    public void setOrgData(int i, com.flexnet.operations.webservices.DeleteOrgDataType _value) {
        this.orgData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteOrganizationRequestType)) return false;
        DeleteOrganizationRequestType other = (DeleteOrganizationRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orgData==null && other.getOrgData()==null) || 
             (this.orgData!=null &&
              java.util.Arrays.equals(this.orgData, other.getOrgData())));
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
        if (getOrgData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrgData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrgData(), i);
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
        new org.apache.axis.description.TypeDesc(DeleteOrganizationRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteOrganizationRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteOrgDataType"));
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
