/**
 * GeneratePrebuiltLicenseRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GeneratePrebuiltLicenseRequestType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseDataType[] requestDataList;

    public GeneratePrebuiltLicenseRequestType() {
    }

    public GeneratePrebuiltLicenseRequestType(
           com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseDataType[] requestDataList) {
           this.requestDataList = requestDataList;
    }


    /**
     * Gets the requestDataList value for this GeneratePrebuiltLicenseRequestType.
     * 
     * @return requestDataList
     */
    public com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseDataType[] getRequestDataList() {
        return requestDataList;
    }


    /**
     * Sets the requestDataList value for this GeneratePrebuiltLicenseRequestType.
     * 
     * @param requestDataList
     */
    public void setRequestDataList(com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseDataType[] requestDataList) {
        this.requestDataList = requestDataList;
    }

    public com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseDataType getRequestDataList(int i) {
        return this.requestDataList[i];
    }

    public void setRequestDataList(int i, com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseDataType _value) {
        this.requestDataList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneratePrebuiltLicenseRequestType)) return false;
        GeneratePrebuiltLicenseRequestType other = (GeneratePrebuiltLicenseRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestDataList==null && other.getRequestDataList()==null) || 
             (this.requestDataList!=null &&
              java.util.Arrays.equals(this.requestDataList, other.getRequestDataList())));
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
        if (getRequestDataList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestDataList(), i);
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
        new org.apache.axis.description.TypeDesc(GeneratePrebuiltLicenseRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generatePrebuiltLicenseRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "requestDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generatePrebuiltLicenseDataType"));
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
