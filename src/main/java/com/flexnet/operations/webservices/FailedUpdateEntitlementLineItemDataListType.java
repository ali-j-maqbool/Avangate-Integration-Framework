/**
 * FailedUpdateEntitlementLineItemDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedUpdateEntitlementLineItemDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedUpdateEntitlementLineItemDataType[] failedData;

    public FailedUpdateEntitlementLineItemDataListType() {
    }

    public FailedUpdateEntitlementLineItemDataListType(
           com.flexnet.operations.webservices.FailedUpdateEntitlementLineItemDataType[] failedData) {
           this.failedData = failedData;
    }


    /**
     * Gets the failedData value for this FailedUpdateEntitlementLineItemDataListType.
     * 
     * @return failedData
     */
    public com.flexnet.operations.webservices.FailedUpdateEntitlementLineItemDataType[] getFailedData() {
        return failedData;
    }


    /**
     * Sets the failedData value for this FailedUpdateEntitlementLineItemDataListType.
     * 
     * @param failedData
     */
    public void setFailedData(com.flexnet.operations.webservices.FailedUpdateEntitlementLineItemDataType[] failedData) {
        this.failedData = failedData;
    }

    public com.flexnet.operations.webservices.FailedUpdateEntitlementLineItemDataType getFailedData(int i) {
        return this.failedData[i];
    }

    public void setFailedData(int i, com.flexnet.operations.webservices.FailedUpdateEntitlementLineItemDataType _value) {
        this.failedData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedUpdateEntitlementLineItemDataListType)) return false;
        FailedUpdateEntitlementLineItemDataListType other = (FailedUpdateEntitlementLineItemDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedData==null && other.getFailedData()==null) || 
             (this.failedData!=null &&
              java.util.Arrays.equals(this.failedData, other.getFailedData())));
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
        if (getFailedData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedData(), i);
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
        new org.apache.axis.description.TypeDesc(FailedUpdateEntitlementLineItemDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateEntitlementLineItemDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateEntitlementLineItemDataType"));
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
