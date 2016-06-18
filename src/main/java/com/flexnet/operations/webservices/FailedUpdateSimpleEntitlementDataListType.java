/**
 * FailedUpdateSimpleEntitlementDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedUpdateSimpleEntitlementDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedUpdateSimpleEntitlementDataType[] failedSimpleEntitlement;

    public FailedUpdateSimpleEntitlementDataListType() {
    }

    public FailedUpdateSimpleEntitlementDataListType(
           com.flexnet.operations.webservices.FailedUpdateSimpleEntitlementDataType[] failedSimpleEntitlement) {
           this.failedSimpleEntitlement = failedSimpleEntitlement;
    }


    /**
     * Gets the failedSimpleEntitlement value for this FailedUpdateSimpleEntitlementDataListType.
     * 
     * @return failedSimpleEntitlement
     */
    public com.flexnet.operations.webservices.FailedUpdateSimpleEntitlementDataType[] getFailedSimpleEntitlement() {
        return failedSimpleEntitlement;
    }


    /**
     * Sets the failedSimpleEntitlement value for this FailedUpdateSimpleEntitlementDataListType.
     * 
     * @param failedSimpleEntitlement
     */
    public void setFailedSimpleEntitlement(com.flexnet.operations.webservices.FailedUpdateSimpleEntitlementDataType[] failedSimpleEntitlement) {
        this.failedSimpleEntitlement = failedSimpleEntitlement;
    }

    public com.flexnet.operations.webservices.FailedUpdateSimpleEntitlementDataType getFailedSimpleEntitlement(int i) {
        return this.failedSimpleEntitlement[i];
    }

    public void setFailedSimpleEntitlement(int i, com.flexnet.operations.webservices.FailedUpdateSimpleEntitlementDataType _value) {
        this.failedSimpleEntitlement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedUpdateSimpleEntitlementDataListType)) return false;
        FailedUpdateSimpleEntitlementDataListType other = (FailedUpdateSimpleEntitlementDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedSimpleEntitlement==null && other.getFailedSimpleEntitlement()==null) || 
             (this.failedSimpleEntitlement!=null &&
              java.util.Arrays.equals(this.failedSimpleEntitlement, other.getFailedSimpleEntitlement())));
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
        if (getFailedSimpleEntitlement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedSimpleEntitlement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedSimpleEntitlement(), i);
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
        new org.apache.axis.description.TypeDesc(FailedUpdateSimpleEntitlementDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateSimpleEntitlementDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedSimpleEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedSimpleEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateSimpleEntitlementDataType"));
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
