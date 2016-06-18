/**
 * FailedEntitlementStateDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedEntitlementStateDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedEntitlementStateDataType[] failedEntitlement;

    public FailedEntitlementStateDataListType() {
    }

    public FailedEntitlementStateDataListType(
           com.flexnet.operations.webservices.FailedEntitlementStateDataType[] failedEntitlement) {
           this.failedEntitlement = failedEntitlement;
    }


    /**
     * Gets the failedEntitlement value for this FailedEntitlementStateDataListType.
     * 
     * @return failedEntitlement
     */
    public com.flexnet.operations.webservices.FailedEntitlementStateDataType[] getFailedEntitlement() {
        return failedEntitlement;
    }


    /**
     * Sets the failedEntitlement value for this FailedEntitlementStateDataListType.
     * 
     * @param failedEntitlement
     */
    public void setFailedEntitlement(com.flexnet.operations.webservices.FailedEntitlementStateDataType[] failedEntitlement) {
        this.failedEntitlement = failedEntitlement;
    }

    public com.flexnet.operations.webservices.FailedEntitlementStateDataType getFailedEntitlement(int i) {
        return this.failedEntitlement[i];
    }

    public void setFailedEntitlement(int i, com.flexnet.operations.webservices.FailedEntitlementStateDataType _value) {
        this.failedEntitlement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedEntitlementStateDataListType)) return false;
        FailedEntitlementStateDataListType other = (FailedEntitlementStateDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedEntitlement==null && other.getFailedEntitlement()==null) || 
             (this.failedEntitlement!=null &&
              java.util.Arrays.equals(this.failedEntitlement, other.getFailedEntitlement())));
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
        if (getFailedEntitlement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedEntitlement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedEntitlement(), i);
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
        new org.apache.axis.description.TypeDesc(FailedEntitlementStateDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedEntitlementStateDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedEntitlementStateDataType"));
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
