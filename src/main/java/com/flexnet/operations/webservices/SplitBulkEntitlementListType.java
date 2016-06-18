/**
 * SplitBulkEntitlementListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class SplitBulkEntitlementListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SplitBulkEntitlementInfoType[] bulkEntitlementInfo;

    public SplitBulkEntitlementListType() {
    }

    public SplitBulkEntitlementListType(
           com.flexnet.operations.webservices.SplitBulkEntitlementInfoType[] bulkEntitlementInfo) {
           this.bulkEntitlementInfo = bulkEntitlementInfo;
    }


    /**
     * Gets the bulkEntitlementInfo value for this SplitBulkEntitlementListType.
     * 
     * @return bulkEntitlementInfo
     */
    public com.flexnet.operations.webservices.SplitBulkEntitlementInfoType[] getBulkEntitlementInfo() {
        return bulkEntitlementInfo;
    }


    /**
     * Sets the bulkEntitlementInfo value for this SplitBulkEntitlementListType.
     * 
     * @param bulkEntitlementInfo
     */
    public void setBulkEntitlementInfo(com.flexnet.operations.webservices.SplitBulkEntitlementInfoType[] bulkEntitlementInfo) {
        this.bulkEntitlementInfo = bulkEntitlementInfo;
    }

    public com.flexnet.operations.webservices.SplitBulkEntitlementInfoType getBulkEntitlementInfo(int i) {
        return this.bulkEntitlementInfo[i];
    }

    public void setBulkEntitlementInfo(int i, com.flexnet.operations.webservices.SplitBulkEntitlementInfoType _value) {
        this.bulkEntitlementInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SplitBulkEntitlementListType)) return false;
        SplitBulkEntitlementListType other = (SplitBulkEntitlementListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkEntitlementInfo==null && other.getBulkEntitlementInfo()==null) || 
             (this.bulkEntitlementInfo!=null &&
              java.util.Arrays.equals(this.bulkEntitlementInfo, other.getBulkEntitlementInfo())));
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
        if (getBulkEntitlementInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBulkEntitlementInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBulkEntitlementInfo(), i);
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
        new org.apache.axis.description.TypeDesc(SplitBulkEntitlementListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntitlementInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementInfoType"));
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
