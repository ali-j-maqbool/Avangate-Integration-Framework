/**
 * GetMatchingBulkEntsListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetMatchingBulkEntsListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.GetMatchingBulkEntInfoType[] bulkEntInfo;

    public GetMatchingBulkEntsListType() {
    }

    public GetMatchingBulkEntsListType(
           com.flexnet.operations.webservices.GetMatchingBulkEntInfoType[] bulkEntInfo) {
           this.bulkEntInfo = bulkEntInfo;
    }


    /**
     * Gets the bulkEntInfo value for this GetMatchingBulkEntsListType.
     * 
     * @return bulkEntInfo
     */
    public com.flexnet.operations.webservices.GetMatchingBulkEntInfoType[] getBulkEntInfo() {
        return bulkEntInfo;
    }


    /**
     * Sets the bulkEntInfo value for this GetMatchingBulkEntsListType.
     * 
     * @param bulkEntInfo
     */
    public void setBulkEntInfo(com.flexnet.operations.webservices.GetMatchingBulkEntInfoType[] bulkEntInfo) {
        this.bulkEntInfo = bulkEntInfo;
    }

    public com.flexnet.operations.webservices.GetMatchingBulkEntInfoType getBulkEntInfo(int i) {
        return this.bulkEntInfo[i];
    }

    public void setBulkEntInfo(int i, com.flexnet.operations.webservices.GetMatchingBulkEntInfoType _value) {
        this.bulkEntInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMatchingBulkEntsListType)) return false;
        GetMatchingBulkEntsListType other = (GetMatchingBulkEntsListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkEntInfo==null && other.getBulkEntInfo()==null) || 
             (this.bulkEntInfo!=null &&
              java.util.Arrays.equals(this.bulkEntInfo, other.getBulkEntInfo())));
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
        if (getBulkEntInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBulkEntInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBulkEntInfo(), i);
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
        new org.apache.axis.description.TypeDesc(GetMatchingBulkEntsListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingBulkEntsListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingBulkEntInfoType"));
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
