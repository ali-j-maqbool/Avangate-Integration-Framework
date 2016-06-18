/**
 * EntitlementStateChangeListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class EntitlementStateChangeListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementStateChangeDataType[] entitlement;

    public EntitlementStateChangeListType() {
    }

    public EntitlementStateChangeListType(
           com.flexnet.operations.webservices.EntitlementStateChangeDataType[] entitlement) {
           this.entitlement = entitlement;
    }


    /**
     * Gets the entitlement value for this EntitlementStateChangeListType.
     * 
     * @return entitlement
     */
    public com.flexnet.operations.webservices.EntitlementStateChangeDataType[] getEntitlement() {
        return entitlement;
    }


    /**
     * Sets the entitlement value for this EntitlementStateChangeListType.
     * 
     * @param entitlement
     */
    public void setEntitlement(com.flexnet.operations.webservices.EntitlementStateChangeDataType[] entitlement) {
        this.entitlement = entitlement;
    }

    public com.flexnet.operations.webservices.EntitlementStateChangeDataType getEntitlement(int i) {
        return this.entitlement[i];
    }

    public void setEntitlement(int i, com.flexnet.operations.webservices.EntitlementStateChangeDataType _value) {
        this.entitlement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitlementStateChangeListType)) return false;
        EntitlementStateChangeListType other = (EntitlementStateChangeListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitlement==null && other.getEntitlement()==null) || 
             (this.entitlement!=null &&
              java.util.Arrays.equals(this.entitlement, other.getEntitlement())));
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
        if (getEntitlement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntitlement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntitlement(), i);
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
        new org.apache.axis.description.TypeDesc(EntitlementStateChangeListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementStateChangeListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementStateChangeDataType"));
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
