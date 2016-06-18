/**
 * CreateSimpleEntitlementRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreateSimpleEntitlementRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.CreateSimpleEntitlementDataType[] simpleEntitlement;

    public CreateSimpleEntitlementRequestType() {
    }

    public CreateSimpleEntitlementRequestType(
           com.flexnet.operations.webservices.CreateSimpleEntitlementDataType[] simpleEntitlement) {
           this.simpleEntitlement = simpleEntitlement;
    }


    /**
     * Gets the simpleEntitlement value for this CreateSimpleEntitlementRequestType.
     * 
     * @return simpleEntitlement
     */
    public com.flexnet.operations.webservices.CreateSimpleEntitlementDataType[] getSimpleEntitlement() {
        return simpleEntitlement;
    }


    /**
     * Sets the simpleEntitlement value for this CreateSimpleEntitlementRequestType.
     * 
     * @param simpleEntitlement
     */
    public void setSimpleEntitlement(com.flexnet.operations.webservices.CreateSimpleEntitlementDataType[] simpleEntitlement) {
        this.simpleEntitlement = simpleEntitlement;
    }

    public com.flexnet.operations.webservices.CreateSimpleEntitlementDataType getSimpleEntitlement(int i) {
        return this.simpleEntitlement[i];
    }

    public void setSimpleEntitlement(int i, com.flexnet.operations.webservices.CreateSimpleEntitlementDataType _value) {
        this.simpleEntitlement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSimpleEntitlementRequestType)) return false;
        CreateSimpleEntitlementRequestType other = (CreateSimpleEntitlementRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.simpleEntitlement==null && other.getSimpleEntitlement()==null) || 
             (this.simpleEntitlement!=null &&
              java.util.Arrays.equals(this.simpleEntitlement, other.getSimpleEntitlement())));
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
        if (getSimpleEntitlement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimpleEntitlement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimpleEntitlement(), i);
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
        new org.apache.axis.description.TypeDesc(CreateSimpleEntitlementRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createSimpleEntitlementRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpleEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "simpleEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createSimpleEntitlementDataType"));
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
