/**
 * DeletePartNumberRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class DeletePartNumberRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.DeletePartNumberDataType[] partNumber;

    public DeletePartNumberRequestType() {
    }

    public DeletePartNumberRequestType(
           com.flexnet.operations.webservices.DeletePartNumberDataType[] partNumber) {
           this.partNumber = partNumber;
    }


    /**
     * Gets the partNumber value for this DeletePartNumberRequestType.
     * 
     * @return partNumber
     */
    public com.flexnet.operations.webservices.DeletePartNumberDataType[] getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this DeletePartNumberRequestType.
     * 
     * @param partNumber
     */
    public void setPartNumber(com.flexnet.operations.webservices.DeletePartNumberDataType[] partNumber) {
        this.partNumber = partNumber;
    }

    public com.flexnet.operations.webservices.DeletePartNumberDataType getPartNumber(int i) {
        return this.partNumber[i];
    }

    public void setPartNumber(int i, com.flexnet.operations.webservices.DeletePartNumberDataType _value) {
        this.partNumber[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeletePartNumberRequestType)) return false;
        DeletePartNumberRequestType other = (DeletePartNumberRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partNumber==null && other.getPartNumber()==null) || 
             (this.partNumber!=null &&
              java.util.Arrays.equals(this.partNumber, other.getPartNumber())));
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
        if (getPartNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartNumber(), i);
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
        new org.apache.axis.description.TypeDesc(DeletePartNumberRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deletePartNumberRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deletePartNumberDataType"));
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
