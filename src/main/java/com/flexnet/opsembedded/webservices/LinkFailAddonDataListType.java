/**
 * LinkFailAddonDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class LinkFailAddonDataListType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.LinkFailAddonDataType[] failAddon;

    public LinkFailAddonDataListType() {
    }

    public LinkFailAddonDataListType(
           com.flexnet.opsembedded.webservices.LinkFailAddonDataType[] failAddon) {
           this.failAddon = failAddon;
    }


    /**
     * Gets the failAddon value for this LinkFailAddonDataListType.
     * 
     * @return failAddon
     */
    public com.flexnet.opsembedded.webservices.LinkFailAddonDataType[] getFailAddon() {
        return failAddon;
    }


    /**
     * Sets the failAddon value for this LinkFailAddonDataListType.
     * 
     * @param failAddon
     */
    public void setFailAddon(com.flexnet.opsembedded.webservices.LinkFailAddonDataType[] failAddon) {
        this.failAddon = failAddon;
    }

    public com.flexnet.opsembedded.webservices.LinkFailAddonDataType getFailAddon(int i) {
        return this.failAddon[i];
    }

    public void setFailAddon(int i, com.flexnet.opsembedded.webservices.LinkFailAddonDataType _value) {
        this.failAddon[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkFailAddonDataListType)) return false;
        LinkFailAddonDataListType other = (LinkFailAddonDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failAddon==null && other.getFailAddon()==null) || 
             (this.failAddon!=null &&
              java.util.Arrays.equals(this.failAddon, other.getFailAddon())));
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
        if (getFailAddon() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailAddon());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailAddon(), i);
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
        new org.apache.axis.description.TypeDesc(LinkFailAddonDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkFailAddonDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failAddon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failAddon"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkFailAddonDataType"));
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
