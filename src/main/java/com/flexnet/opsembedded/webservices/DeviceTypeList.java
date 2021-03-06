/**
 * DeviceTypeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class DeviceTypeList  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.WSDeviceType[] deviceType;

    public DeviceTypeList() {
    }

    public DeviceTypeList(
           com.flexnet.opsembedded.webservices.WSDeviceType[] deviceType) {
           this.deviceType = deviceType;
    }


    /**
     * Gets the deviceType value for this DeviceTypeList.
     * 
     * @return deviceType
     */
    public com.flexnet.opsembedded.webservices.WSDeviceType[] getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this DeviceTypeList.
     * 
     * @param deviceType
     */
    public void setDeviceType(com.flexnet.opsembedded.webservices.WSDeviceType[] deviceType) {
        this.deviceType = deviceType;
    }

    public com.flexnet.opsembedded.webservices.WSDeviceType getDeviceType(int i) {
        return this.deviceType[i];
    }

    public void setDeviceType(int i, com.flexnet.opsembedded.webservices.WSDeviceType _value) {
        this.deviceType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceTypeList)) return false;
        DeviceTypeList other = (DeviceTypeList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              java.util.Arrays.equals(this.deviceType, other.getDeviceType())));
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
        if (getDeviceType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceType(), i);
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
        new org.apache.axis.description.TypeDesc(DeviceTypeList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceTypeList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "WSDeviceType"));
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
