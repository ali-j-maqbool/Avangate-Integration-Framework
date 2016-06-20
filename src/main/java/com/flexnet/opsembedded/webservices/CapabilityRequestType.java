/**
 * CapabilityRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class CapabilityRequestType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier;

    private java.lang.Long lastUpdateTime;

    private java.lang.Boolean force;

    private com.flexnet.opsembedded.webservices.GenerateCapabilityResponseDictionary vendorDictionary;

    private com.flexnet.opsembedded.webservices.LinkLineItemDataType[] lineItem;

    private java.lang.Boolean bufferLicense;

    public CapabilityRequestType() {
    }

    public CapabilityRequestType(
           com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier,
           java.lang.Long lastUpdateTime,
           java.lang.Boolean force,
           com.flexnet.opsembedded.webservices.GenerateCapabilityResponseDictionary vendorDictionary,
           com.flexnet.opsembedded.webservices.LinkLineItemDataType[] lineItem,
           java.lang.Boolean bufferLicense) {
           this.deviceIdentifier = deviceIdentifier;
           this.lastUpdateTime = lastUpdateTime;
           this.force = force;
           this.vendorDictionary = vendorDictionary;
           this.lineItem = lineItem;
           this.bufferLicense = bufferLicense;
    }


    /**
     * Gets the deviceIdentifier value for this CapabilityRequestType.
     * 
     * @return deviceIdentifier
     */
    public com.flexnet.opsembedded.webservices.DeviceIdentifier getDeviceIdentifier() {
        return deviceIdentifier;
    }


    /**
     * Sets the deviceIdentifier value for this CapabilityRequestType.
     * 
     * @param deviceIdentifier
     */
    public void setDeviceIdentifier(com.flexnet.opsembedded.webservices.DeviceIdentifier deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }


    /**
     * Gets the lastUpdateTime value for this CapabilityRequestType.
     * 
     * @return lastUpdateTime
     */
    public java.lang.Long getLastUpdateTime() {
        return lastUpdateTime;
    }


    /**
     * Sets the lastUpdateTime value for this CapabilityRequestType.
     * 
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(java.lang.Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }


    /**
     * Gets the force value for this CapabilityRequestType.
     * 
     * @return force
     */
    public java.lang.Boolean getForce() {
        return force;
    }


    /**
     * Sets the force value for this CapabilityRequestType.
     * 
     * @param force
     */
    public void setForce(java.lang.Boolean force) {
        this.force = force;
    }


    /**
     * Gets the vendorDictionary value for this CapabilityRequestType.
     * 
     * @return vendorDictionary
     */
    public com.flexnet.opsembedded.webservices.GenerateCapabilityResponseDictionary getVendorDictionary() {
        return vendorDictionary;
    }


    /**
     * Sets the vendorDictionary value for this CapabilityRequestType.
     * 
     * @param vendorDictionary
     */
    public void setVendorDictionary(com.flexnet.opsembedded.webservices.GenerateCapabilityResponseDictionary vendorDictionary) {
        this.vendorDictionary = vendorDictionary;
    }


    /**
     * Gets the lineItem value for this CapabilityRequestType.
     * 
     * @return lineItem
     */
    public com.flexnet.opsembedded.webservices.LinkLineItemDataType[] getLineItem() {
        return lineItem;
    }


    /**
     * Sets the lineItem value for this CapabilityRequestType.
     * 
     * @param lineItem
     */
    public void setLineItem(com.flexnet.opsembedded.webservices.LinkLineItemDataType[] lineItem) {
        this.lineItem = lineItem;
    }

    public com.flexnet.opsembedded.webservices.LinkLineItemDataType getLineItem(int i) {
        return this.lineItem[i];
    }

    public void setLineItem(int i, com.flexnet.opsembedded.webservices.LinkLineItemDataType _value) {
        this.lineItem[i] = _value;
    }


    /**
     * Gets the bufferLicense value for this CapabilityRequestType.
     * 
     * @return bufferLicense
     */
    public java.lang.Boolean getBufferLicense() {
        return bufferLicense;
    }


    /**
     * Sets the bufferLicense value for this CapabilityRequestType.
     * 
     * @param bufferLicense
     */
    public void setBufferLicense(java.lang.Boolean bufferLicense) {
        this.bufferLicense = bufferLicense;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapabilityRequestType)) return false;
        CapabilityRequestType other = (CapabilityRequestType) obj;
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
            ((this.lastUpdateTime==null && other.getLastUpdateTime()==null) || 
             (this.lastUpdateTime!=null &&
              this.lastUpdateTime.equals(other.getLastUpdateTime()))) &&
            ((this.force==null && other.getForce()==null) || 
             (this.force!=null &&
              this.force.equals(other.getForce()))) &&
            ((this.vendorDictionary==null && other.getVendorDictionary()==null) || 
             (this.vendorDictionary!=null &&
              this.vendorDictionary.equals(other.getVendorDictionary()))) &&
            ((this.lineItem==null && other.getLineItem()==null) || 
             (this.lineItem!=null &&
              java.util.Arrays.equals(this.lineItem, other.getLineItem()))) &&
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
        if (getLastUpdateTime() != null) {
            _hashCode += getLastUpdateTime().hashCode();
        }
        if (getForce() != null) {
            _hashCode += getForce().hashCode();
        }
        if (getVendorDictionary() != null) {
            _hashCode += getVendorDictionary().hashCode();
        }
        if (getLineItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItem(), i);
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
        new org.apache.axis.description.TypeDesc(CapabilityRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "capabilityRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "lastUpdateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("force");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "force"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorDictionary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "vendorDictionary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCapabilityResponseDictionary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "lineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkLineItemDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
