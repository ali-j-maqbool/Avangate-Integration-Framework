/**
 * ChannelPartnerDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class ChannelPartnerDataListType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.ChannelPartnerDataType[] channelPartner;

    public ChannelPartnerDataListType() {
    }

    public ChannelPartnerDataListType(
           com.flexnet.opsembedded.webservices.ChannelPartnerDataType[] channelPartner) {
           this.channelPartner = channelPartner;
    }


    /**
     * Gets the channelPartner value for this ChannelPartnerDataListType.
     * 
     * @return channelPartner
     */
    public com.flexnet.opsembedded.webservices.ChannelPartnerDataType[] getChannelPartner() {
        return channelPartner;
    }


    /**
     * Sets the channelPartner value for this ChannelPartnerDataListType.
     * 
     * @param channelPartner
     */
    public void setChannelPartner(com.flexnet.opsembedded.webservices.ChannelPartnerDataType[] channelPartner) {
        this.channelPartner = channelPartner;
    }

    public com.flexnet.opsembedded.webservices.ChannelPartnerDataType getChannelPartner(int i) {
        return this.channelPartner[i];
    }

    public void setChannelPartner(int i, com.flexnet.opsembedded.webservices.ChannelPartnerDataType _value) {
        this.channelPartner[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChannelPartnerDataListType)) return false;
        ChannelPartnerDataListType other = (ChannelPartnerDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.channelPartner==null && other.getChannelPartner()==null) || 
             (this.channelPartner!=null &&
              java.util.Arrays.equals(this.channelPartner, other.getChannelPartner())));
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
        if (getChannelPartner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannelPartner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannelPartner(), i);
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
        new org.apache.axis.description.TypeDesc(ChannelPartnerDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "channelPartnerDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelPartner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "channelPartner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "channelPartnerDataType"));
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
