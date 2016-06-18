/**
 * GetWebRegKeyCountRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetWebRegKeyCountRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntitlementIdentifier;

    public GetWebRegKeyCountRequestType() {
    }

    public GetWebRegKeyCountRequestType(
           com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntitlementIdentifier) {
           this.bulkEntitlementIdentifier = bulkEntitlementIdentifier;
    }


    /**
     * Gets the bulkEntitlementIdentifier value for this GetWebRegKeyCountRequestType.
     * 
     * @return bulkEntitlementIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getBulkEntitlementIdentifier() {
        return bulkEntitlementIdentifier;
    }


    /**
     * Sets the bulkEntitlementIdentifier value for this GetWebRegKeyCountRequestType.
     * 
     * @param bulkEntitlementIdentifier
     */
    public void setBulkEntitlementIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType bulkEntitlementIdentifier) {
        this.bulkEntitlementIdentifier = bulkEntitlementIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWebRegKeyCountRequestType)) return false;
        GetWebRegKeyCountRequestType other = (GetWebRegKeyCountRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkEntitlementIdentifier==null && other.getBulkEntitlementIdentifier()==null) || 
             (this.bulkEntitlementIdentifier!=null &&
              this.bulkEntitlementIdentifier.equals(other.getBulkEntitlementIdentifier())));
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
        if (getBulkEntitlementIdentifier() != null) {
            _hashCode += getBulkEntitlementIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWebRegKeyCountRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeyCountRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntitlementIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
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
