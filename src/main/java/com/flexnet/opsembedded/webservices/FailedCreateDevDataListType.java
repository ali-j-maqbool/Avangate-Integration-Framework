/**
 * FailedCreateDevDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class FailedCreateDevDataListType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.FailedCreateDeviceDataType[] failedDevice;

    public FailedCreateDevDataListType() {
    }

    public FailedCreateDevDataListType(
           com.flexnet.opsembedded.webservices.FailedCreateDeviceDataType[] failedDevice) {
           this.failedDevice = failedDevice;
    }


    /**
     * Gets the failedDevice value for this FailedCreateDevDataListType.
     * 
     * @return failedDevice
     */
    public com.flexnet.opsembedded.webservices.FailedCreateDeviceDataType[] getFailedDevice() {
        return failedDevice;
    }


    /**
     * Sets the failedDevice value for this FailedCreateDevDataListType.
     * 
     * @param failedDevice
     */
    public void setFailedDevice(com.flexnet.opsembedded.webservices.FailedCreateDeviceDataType[] failedDevice) {
        this.failedDevice = failedDevice;
    }

    public com.flexnet.opsembedded.webservices.FailedCreateDeviceDataType getFailedDevice(int i) {
        return this.failedDevice[i];
    }

    public void setFailedDevice(int i, com.flexnet.opsembedded.webservices.FailedCreateDeviceDataType _value) {
        this.failedDevice[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedCreateDevDataListType)) return false;
        FailedCreateDevDataListType other = (FailedCreateDevDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedDevice==null && other.getFailedDevice()==null) || 
             (this.failedDevice!=null &&
              java.util.Arrays.equals(this.failedDevice, other.getFailedDevice())));
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
        if (getFailedDevice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedDevice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedDevice(), i);
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
        new org.apache.axis.description.TypeDesc(FailedCreateDevDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedCreateDevDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedCreateDeviceDataType"));
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
