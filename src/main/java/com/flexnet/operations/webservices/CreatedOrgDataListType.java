/**
 * CreatedOrgDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreatedOrgDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.CreatedOrgDataType[] createdOrganization;

    public CreatedOrgDataListType() {
    }

    public CreatedOrgDataListType(
           com.flexnet.operations.webservices.CreatedOrgDataType[] createdOrganization) {
           this.createdOrganization = createdOrganization;
    }


    /**
     * Gets the createdOrganization value for this CreatedOrgDataListType.
     * 
     * @return createdOrganization
     */
    public com.flexnet.operations.webservices.CreatedOrgDataType[] getCreatedOrganization() {
        return createdOrganization;
    }


    /**
     * Sets the createdOrganization value for this CreatedOrgDataListType.
     * 
     * @param createdOrganization
     */
    public void setCreatedOrganization(com.flexnet.operations.webservices.CreatedOrgDataType[] createdOrganization) {
        this.createdOrganization = createdOrganization;
    }

    public com.flexnet.operations.webservices.CreatedOrgDataType getCreatedOrganization(int i) {
        return this.createdOrganization[i];
    }

    public void setCreatedOrganization(int i, com.flexnet.operations.webservices.CreatedOrgDataType _value) {
        this.createdOrganization[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatedOrgDataListType)) return false;
        CreatedOrgDataListType other = (CreatedOrgDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdOrganization==null && other.getCreatedOrganization()==null) || 
             (this.createdOrganization!=null &&
              java.util.Arrays.equals(this.createdOrganization, other.getCreatedOrganization())));
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
        if (getCreatedOrganization() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedOrganization());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedOrganization(), i);
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
        new org.apache.axis.description.TypeDesc(CreatedOrgDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdOrgDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdOrganization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdOrganization"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdOrgDataType"));
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
