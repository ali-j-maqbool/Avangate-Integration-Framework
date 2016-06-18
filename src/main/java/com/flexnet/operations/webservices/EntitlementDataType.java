/**
 * EntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class EntitlementDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SimpleEntitlementDataType simpleEntitlement;

    private com.flexnet.operations.webservices.BulkEntitlementDataType bulkEntitlement;

    public EntitlementDataType() {
    }

    public EntitlementDataType(
           com.flexnet.operations.webservices.SimpleEntitlementDataType simpleEntitlement,
           com.flexnet.operations.webservices.BulkEntitlementDataType bulkEntitlement) {
           this.simpleEntitlement = simpleEntitlement;
           this.bulkEntitlement = bulkEntitlement;
    }


    /**
     * Gets the simpleEntitlement value for this EntitlementDataType.
     * 
     * @return simpleEntitlement
     */
    public com.flexnet.operations.webservices.SimpleEntitlementDataType getSimpleEntitlement() {
        return simpleEntitlement;
    }


    /**
     * Sets the simpleEntitlement value for this EntitlementDataType.
     * 
     * @param simpleEntitlement
     */
    public void setSimpleEntitlement(com.flexnet.operations.webservices.SimpleEntitlementDataType simpleEntitlement) {
        this.simpleEntitlement = simpleEntitlement;
    }


    /**
     * Gets the bulkEntitlement value for this EntitlementDataType.
     * 
     * @return bulkEntitlement
     */
    public com.flexnet.operations.webservices.BulkEntitlementDataType getBulkEntitlement() {
        return bulkEntitlement;
    }


    /**
     * Sets the bulkEntitlement value for this EntitlementDataType.
     * 
     * @param bulkEntitlement
     */
    public void setBulkEntitlement(com.flexnet.operations.webservices.BulkEntitlementDataType bulkEntitlement) {
        this.bulkEntitlement = bulkEntitlement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitlementDataType)) return false;
        EntitlementDataType other = (EntitlementDataType) obj;
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
              this.simpleEntitlement.equals(other.getSimpleEntitlement()))) &&
            ((this.bulkEntitlement==null && other.getBulkEntitlement()==null) || 
             (this.bulkEntitlement!=null &&
              this.bulkEntitlement.equals(other.getBulkEntitlement())));
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
            _hashCode += getSimpleEntitlement().hashCode();
        }
        if (getBulkEntitlement() != null) {
            _hashCode += getBulkEntitlement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpleEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "simpleEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "simpleEntitlementDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
