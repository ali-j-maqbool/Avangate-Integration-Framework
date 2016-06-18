/**
 * FailedOrgDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedOrgDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedOrgDataType[] failedOrganization;

    public FailedOrgDataListType() {
    }

    public FailedOrgDataListType(
           com.flexnet.operations.webservices.FailedOrgDataType[] failedOrganization) {
           this.failedOrganization = failedOrganization;
    }


    /**
     * Gets the failedOrganization value for this FailedOrgDataListType.
     * 
     * @return failedOrganization
     */
    public com.flexnet.operations.webservices.FailedOrgDataType[] getFailedOrganization() {
        return failedOrganization;
    }


    /**
     * Sets the failedOrganization value for this FailedOrgDataListType.
     * 
     * @param failedOrganization
     */
    public void setFailedOrganization(com.flexnet.operations.webservices.FailedOrgDataType[] failedOrganization) {
        this.failedOrganization = failedOrganization;
    }

    public com.flexnet.operations.webservices.FailedOrgDataType getFailedOrganization(int i) {
        return this.failedOrganization[i];
    }

    public void setFailedOrganization(int i, com.flexnet.operations.webservices.FailedOrgDataType _value) {
        this.failedOrganization[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedOrgDataListType)) return false;
        FailedOrgDataListType other = (FailedOrgDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedOrganization==null && other.getFailedOrganization()==null) || 
             (this.failedOrganization!=null &&
              java.util.Arrays.equals(this.failedOrganization, other.getFailedOrganization())));
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
        if (getFailedOrganization() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedOrganization());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedOrganization(), i);
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
        new org.apache.axis.description.TypeDesc(FailedOrgDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedOrgDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedOrganization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedOrganization"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedOrgDataType"));
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
