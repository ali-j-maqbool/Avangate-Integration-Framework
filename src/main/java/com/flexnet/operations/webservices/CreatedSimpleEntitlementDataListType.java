/**
 * CreatedSimpleEntitlementDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreatedSimpleEntitlementDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.CreatedSimpleEntitlementDataType[] createdSimpleEntitlement;

    public CreatedSimpleEntitlementDataListType() {
    }

    public CreatedSimpleEntitlementDataListType(
           com.flexnet.operations.webservices.CreatedSimpleEntitlementDataType[] createdSimpleEntitlement) {
           this.createdSimpleEntitlement = createdSimpleEntitlement;
    }


    /**
     * Gets the createdSimpleEntitlement value for this CreatedSimpleEntitlementDataListType.
     * 
     * @return createdSimpleEntitlement
     */
    public com.flexnet.operations.webservices.CreatedSimpleEntitlementDataType[] getCreatedSimpleEntitlement() {
        return createdSimpleEntitlement;
    }


    /**
     * Sets the createdSimpleEntitlement value for this CreatedSimpleEntitlementDataListType.
     * 
     * @param createdSimpleEntitlement
     */
    public void setCreatedSimpleEntitlement(com.flexnet.operations.webservices.CreatedSimpleEntitlementDataType[] createdSimpleEntitlement) {
        this.createdSimpleEntitlement = createdSimpleEntitlement;
    }

    public com.flexnet.operations.webservices.CreatedSimpleEntitlementDataType getCreatedSimpleEntitlement(int i) {
        return this.createdSimpleEntitlement[i];
    }

    public void setCreatedSimpleEntitlement(int i, com.flexnet.operations.webservices.CreatedSimpleEntitlementDataType _value) {
        this.createdSimpleEntitlement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatedSimpleEntitlementDataListType)) return false;
        CreatedSimpleEntitlementDataListType other = (CreatedSimpleEntitlementDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdSimpleEntitlement==null && other.getCreatedSimpleEntitlement()==null) || 
             (this.createdSimpleEntitlement!=null &&
              java.util.Arrays.equals(this.createdSimpleEntitlement, other.getCreatedSimpleEntitlement())));
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
        if (getCreatedSimpleEntitlement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedSimpleEntitlement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedSimpleEntitlement(), i);
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
        new org.apache.axis.description.TypeDesc(CreatedSimpleEntitlementDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdSimpleEntitlementDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdSimpleEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdSimpleEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdSimpleEntitlementDataType"));
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
