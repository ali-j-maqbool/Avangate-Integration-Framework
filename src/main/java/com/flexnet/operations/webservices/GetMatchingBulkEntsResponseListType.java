/**
 * GetMatchingBulkEntsResponseListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetMatchingBulkEntsResponseListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.MatchingBulkEntDataType[] matchingBulkEnt;

    public GetMatchingBulkEntsResponseListType() {
    }

    public GetMatchingBulkEntsResponseListType(
           com.flexnet.operations.webservices.MatchingBulkEntDataType[] matchingBulkEnt) {
           this.matchingBulkEnt = matchingBulkEnt;
    }


    /**
     * Gets the matchingBulkEnt value for this GetMatchingBulkEntsResponseListType.
     * 
     * @return matchingBulkEnt
     */
    public com.flexnet.operations.webservices.MatchingBulkEntDataType[] getMatchingBulkEnt() {
        return matchingBulkEnt;
    }


    /**
     * Sets the matchingBulkEnt value for this GetMatchingBulkEntsResponseListType.
     * 
     * @param matchingBulkEnt
     */
    public void setMatchingBulkEnt(com.flexnet.operations.webservices.MatchingBulkEntDataType[] matchingBulkEnt) {
        this.matchingBulkEnt = matchingBulkEnt;
    }

    public com.flexnet.operations.webservices.MatchingBulkEntDataType getMatchingBulkEnt(int i) {
        return this.matchingBulkEnt[i];
    }

    public void setMatchingBulkEnt(int i, com.flexnet.operations.webservices.MatchingBulkEntDataType _value) {
        this.matchingBulkEnt[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMatchingBulkEntsResponseListType)) return false;
        GetMatchingBulkEntsResponseListType other = (GetMatchingBulkEntsResponseListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matchingBulkEnt==null && other.getMatchingBulkEnt()==null) || 
             (this.matchingBulkEnt!=null &&
              java.util.Arrays.equals(this.matchingBulkEnt, other.getMatchingBulkEnt())));
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
        if (getMatchingBulkEnt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchingBulkEnt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchingBulkEnt(), i);
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
        new org.apache.axis.description.TypeDesc(GetMatchingBulkEntsResponseListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingBulkEntsResponseListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingBulkEnt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "matchingBulkEnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "matchingBulkEntDataType"));
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
