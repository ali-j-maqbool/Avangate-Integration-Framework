/**
 * CapabilityResponseDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class CapabilityResponseDataType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier;

    private byte[] addonLicense;

    private java.lang.Boolean bufferLicense;

    public CapabilityResponseDataType() {
    }

    public CapabilityResponseDataType(
           com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier,
           byte[] addonLicense,
           java.lang.Boolean bufferLicense) {
           this.deviceIdentifier = deviceIdentifier;
           this.addonLicense = addonLicense;
           this.bufferLicense = bufferLicense;
    }


    /**
     * Gets the deviceIdentifier value for this CapabilityResponseDataType.
     * 
     * @return deviceIdentifier
     */
    public com.flexnet.opsembedded.webservices.DeviceIdentifier getDeviceIdentifier() {
        return deviceIdentifier;
    }


    /**
     * Sets the deviceIdentifier value for this CapabilityResponseDataType.
     * 
     * @param deviceIdentifier
     */
    public void setDeviceIdentifier(com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }


    /**
     * Gets the addonLicense value for this CapabilityResponseDataType.
     * 
     * @return addonLicense
     */
    public byte[] getAddonLicense() {
        return addonLicense;
    }


    /**
     * Sets the addonLicense value for this CapabilityResponseDataType.
     * 
     * @param addonLicense
     */
    public void setAddonLicense(byte[] addonLicense) {
        this.addonLicense = addonLicense;
    }


    /**
     * Gets the bufferLicense value for this CapabilityResponseDataType.
     * 
     * @return bufferLicense
     */
    public java.lang.Boolean getBufferLicense() {
        return bufferLicense;
    }


    /**
     * Sets the bufferLicense value for this CapabilityResponseDataType.
     * 
     * @param bufferLicense
     */
    public void setBufferLicense(java.lang.Boolean bufferLicense) {
        this.bufferLicense = bufferLicense;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapabilityResponseDataType)) return false;
        CapabilityResponseDataType other = (CapabilityResponseDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceIdentifier==null && other.getDeviceIdentifier()==null) || 
             (this.deviceIdentifier!=null &&
              this.deviceIdentifier.equals(other.getDeviceIdentifier()))) &&
            ((this.addonLicense==null && other.getAddonLicense()==null) || 
             (this.addonLicense!=null &&
              java.util.Arrays.equals(this.addonLicense, other.getAddonLicense()))) &&
            ((this.bufferLicense==null && other.getBufferLicense()==null) || 
             (this.bufferLicense!=null &&
              this.bufferLicense.equals(other.getBufferLicense())));
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
        if (getDeviceIdentifier() != null) {
            _hashCode += getDeviceIdentifier().hashCode();
        }
        if (getAddonLicense() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddonLicense());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddonLicense(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBufferLicense() != null) {
            _hashCode += getBufferLicense().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CapabilityResponseDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "capabilityResponseDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addonLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "addonLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bufferLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "bufferLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
