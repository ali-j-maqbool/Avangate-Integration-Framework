/**
 * DeviceServedStateQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class DeviceServedStateQueryType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.DeviceServedStatusType value;

    private com.flexnet.opsembedded.webservices.SimpleSearchType searchType;

    public DeviceServedStateQueryType() {
    }

    public DeviceServedStateQueryType(
           com.flexnet.opsembedded.webservices.DeviceServedStatusType value,
           com.flexnet.opsembedded.webservices.SimpleSearchType searchType) {
           this.value = value;
           this.searchType = searchType;
    }


    /**
     * Gets the value value for this DeviceServedStateQueryType.
     * 
     * @return value
     */
    public com.flexnet.opsembedded.webservices.DeviceServedStatusType getValue() {
        return value;
    }


    /**
     * Sets the value value for this DeviceServedStateQueryType.
     * 
     * @param value
     */
    public void setValue(com.flexnet.opsembedded.webservices.DeviceServedStatusType value) {
        this.value = value;
    }


    /**
     * Gets the searchType value for this DeviceServedStateQueryType.
     * 
     * @return searchType
     */
    public com.flexnet.opsembedded.webservices.SimpleSearchType getSearchType() {
        return searchType;
    }


    /**
     * Sets the searchType value for this DeviceServedStateQueryType.
     * 
     * @param searchType
     */
    public void setSearchType(com.flexnet.opsembedded.webservices.SimpleSearchType searchType) {
        this.searchType = searchType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceServedStateQueryType)) return false;
        DeviceServedStateQueryType other = (DeviceServedStateQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.searchType==null && other.getSearchType()==null) || 
             (this.searchType!=null &&
              this.searchType.equals(other.getSearchType())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getSearchType() != null) {
            _hashCode += getSearchType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceServedStateQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DeviceServedStateQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceServedStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "searchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "simpleSearchType"));
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
