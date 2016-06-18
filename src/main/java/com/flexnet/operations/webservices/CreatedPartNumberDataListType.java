/**
 * CreatedPartNumberDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreatedPartNumberDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.CreatedPartNumberDataType[] createdPartNumber;

    public CreatedPartNumberDataListType() {
    }

    public CreatedPartNumberDataListType(
           com.flexnet.operations.webservices.CreatedPartNumberDataType[] createdPartNumber) {
           this.createdPartNumber = createdPartNumber;
    }


    /**
     * Gets the createdPartNumber value for this CreatedPartNumberDataListType.
     * 
     * @return createdPartNumber
     */
    public com.flexnet.operations.webservices.CreatedPartNumberDataType[] getCreatedPartNumber() {
        return createdPartNumber;
    }


    /**
     * Sets the createdPartNumber value for this CreatedPartNumberDataListType.
     * 
     * @param createdPartNumber
     */
    public void setCreatedPartNumber(com.flexnet.operations.webservices.CreatedPartNumberDataType[] createdPartNumber) {
        this.createdPartNumber = createdPartNumber;
    }

    public com.flexnet.operations.webservices.CreatedPartNumberDataType getCreatedPartNumber(int i) {
        return this.createdPartNumber[i];
    }

    public void setCreatedPartNumber(int i, com.flexnet.operations.webservices.CreatedPartNumberDataType _value) {
        this.createdPartNumber[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatedPartNumberDataListType)) return false;
        CreatedPartNumberDataListType other = (CreatedPartNumberDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdPartNumber==null && other.getCreatedPartNumber()==null) || 
             (this.createdPartNumber!=null &&
              java.util.Arrays.equals(this.createdPartNumber, other.getCreatedPartNumber())));
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
        if (getCreatedPartNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedPartNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedPartNumber(), i);
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
        new org.apache.axis.description.TypeDesc(CreatedPartNumberDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdPartNumberDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdPartNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdPartNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdPartNumberDataType"));
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
