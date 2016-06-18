/**
 * MatchingBulkEntDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class MatchingBulkEntDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType matchingBulkEntIdentifier;

    public MatchingBulkEntDataType() {
    }

    public MatchingBulkEntDataType(
           com.flexnet.operations.webservices.EntitlementIdentifierType matchingBulkEntIdentifier) {
           this.matchingBulkEntIdentifier = matchingBulkEntIdentifier;
    }


    /**
     * Gets the matchingBulkEntIdentifier value for this MatchingBulkEntDataType.
     * 
     * @return matchingBulkEntIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getMatchingBulkEntIdentifier() {
        return matchingBulkEntIdentifier;
    }


    /**
     * Sets the matchingBulkEntIdentifier value for this MatchingBulkEntDataType.
     * 
     * @param matchingBulkEntIdentifier
     */
    public void setMatchingBulkEntIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType matchingBulkEntIdentifier) {
        this.matchingBulkEntIdentifier = matchingBulkEntIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatchingBulkEntDataType)) return false;
        MatchingBulkEntDataType other = (MatchingBulkEntDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matchingBulkEntIdentifier==null && other.getMatchingBulkEntIdentifier()==null) || 
             (this.matchingBulkEntIdentifier!=null &&
              this.matchingBulkEntIdentifier.equals(other.getMatchingBulkEntIdentifier())));
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
        if (getMatchingBulkEntIdentifier() != null) {
            _hashCode += getMatchingBulkEntIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MatchingBulkEntDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "matchingBulkEntDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingBulkEntIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "matchingBulkEntIdentifier"));
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
