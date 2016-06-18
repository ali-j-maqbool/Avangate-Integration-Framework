/**
 * VersionDateAttributesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class VersionDateAttributesType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.VersionDateOptionType versionOption;

    private com.flexnet.operations.webservices.DurationType duration;

    public VersionDateAttributesType() {
    }

    public VersionDateAttributesType(
           com.flexnet.operations.webservices.VersionDateOptionType versionOption,
           com.flexnet.operations.webservices.DurationType duration) {
           this.versionOption = versionOption;
           this.duration = duration;
    }


    /**
     * Gets the versionOption value for this VersionDateAttributesType.
     * 
     * @return versionOption
     */
    public com.flexnet.operations.webservices.VersionDateOptionType getVersionOption() {
        return versionOption;
    }


    /**
     * Sets the versionOption value for this VersionDateAttributesType.
     * 
     * @param versionOption
     */
    public void setVersionOption(com.flexnet.operations.webservices.VersionDateOptionType versionOption) {
        this.versionOption = versionOption;
    }


    /**
     * Gets the duration value for this VersionDateAttributesType.
     * 
     * @return duration
     */
    public com.flexnet.operations.webservices.DurationType getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this VersionDateAttributesType.
     * 
     * @param duration
     */
    public void setDuration(com.flexnet.operations.webservices.DurationType duration) {
        this.duration = duration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VersionDateAttributesType)) return false;
        VersionDateAttributesType other = (VersionDateAttributesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.versionOption==null && other.getVersionOption()==null) || 
             (this.versionOption!=null &&
              this.versionOption.equals(other.getVersionOption()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration())));
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
        if (getVersionOption() != null) {
            _hashCode += getVersionOption().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VersionDateAttributesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "versionDateAttributesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "versionOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "VersionDateOptionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DurationType"));
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
