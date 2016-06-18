/**
 * RenewEntitlementRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class RenewEntitlementRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.RenewEntitlementDataType[] entitlementData;

    public RenewEntitlementRequestType() {
    }

    public RenewEntitlementRequestType(
           com.flexnet.operations.webservices.RenewEntitlementDataType[] entitlementData) {
           this.entitlementData = entitlementData;
    }


    /**
     * Gets the entitlementData value for this RenewEntitlementRequestType.
     * 
     * @return entitlementData
     */
    public com.flexnet.operations.webservices.RenewEntitlementDataType[] getEntitlementData() {
        return entitlementData;
    }


    /**
     * Sets the entitlementData value for this RenewEntitlementRequestType.
     * 
     * @param entitlementData
     */
    public void setEntitlementData(com.flexnet.operations.webservices.RenewEntitlementDataType[] entitlementData) {
        this.entitlementData = entitlementData;
    }

    public com.flexnet.operations.webservices.RenewEntitlementDataType getEntitlementData(int i) {
        return this.entitlementData[i];
    }

    public void setEntitlementData(int i, com.flexnet.operations.webservices.RenewEntitlementDataType _value) {
        this.entitlementData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RenewEntitlementRequestType)) return false;
        RenewEntitlementRequestType other = (RenewEntitlementRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitlementData==null && other.getEntitlementData()==null) || 
             (this.entitlementData!=null &&
              java.util.Arrays.equals(this.entitlementData, other.getEntitlementData())));
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
        if (getEntitlementData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntitlementData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntitlementData(), i);
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
        new org.apache.axis.description.TypeDesc(RenewEntitlementRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewEntitlementRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewEntitlementDataType"));
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
