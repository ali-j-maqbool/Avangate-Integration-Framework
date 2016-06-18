/**
 * SplitBulkEntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class SplitBulkEntitlementDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntIdentifier;

    private com.flexnet.operations.webservices.EntitlementIdentifierType newBulkEntIdentifier;

    public SplitBulkEntitlementDataType() {
    }

    public SplitBulkEntitlementDataType(
           com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntIdentifier,
           com.flexnet.operations.webservices.EntitlementIdentifierType newBulkEntIdentifier) {
           this.bulkEntIdentifier = bulkEntIdentifier;
           this.newBulkEntIdentifier = newBulkEntIdentifier;
    }


    /**
     * Gets the bulkEntIdentifier value for this SplitBulkEntitlementDataType.
     * 
     * @return bulkEntIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getBulkEntIdentifier() {
        return bulkEntIdentifier;
    }


    /**
     * Sets the bulkEntIdentifier value for this SplitBulkEntitlementDataType.
     * 
     * @param bulkEntIdentifier
     */
    public void setBulkEntIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntIdentifier) {
        this.bulkEntIdentifier = bulkEntIdentifier;
    }


    /**
     * Gets the newBulkEntIdentifier value for this SplitBulkEntitlementDataType.
     * 
     * @return newBulkEntIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getNewBulkEntIdentifier() {
        return newBulkEntIdentifier;
    }


    /**
     * Sets the newBulkEntIdentifier value for this SplitBulkEntitlementDataType.
     * 
     * @param newBulkEntIdentifier
     */
    public void setNewBulkEntIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType newBulkEntIdentifier) {
        this.newBulkEntIdentifier = newBulkEntIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SplitBulkEntitlementDataType)) return false;
        SplitBulkEntitlementDataType other = (SplitBulkEntitlementDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkEntIdentifier==null && other.getBulkEntIdentifier()==null) || 
             (this.bulkEntIdentifier!=null &&
              this.bulkEntIdentifier.equals(other.getBulkEntIdentifier()))) &&
            ((this.newBulkEntIdentifier==null && other.getNewBulkEntIdentifier()==null) || 
             (this.newBulkEntIdentifier!=null &&
              this.newBulkEntIdentifier.equals(other.getNewBulkEntIdentifier())));
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
        if (getBulkEntIdentifier() != null) {
            _hashCode += getBulkEntIdentifier().hashCode();
        }
        if (getNewBulkEntIdentifier() != null) {
            _hashCode += getNewBulkEntIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SplitBulkEntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBulkEntIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "newBulkEntIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
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
