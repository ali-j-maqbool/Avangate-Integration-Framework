/**
 * FailedReturnHostListDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class FailedReturnHostListDataType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.FailedReturnHostDataType[] failedHost;

    public FailedReturnHostListDataType() {
    }

    public FailedReturnHostListDataType(
           com.flexnet.opsembedded.webservices.FailedReturnHostDataType[] failedHost) {
           this.failedHost = failedHost;
    }


    /**
     * Gets the failedHost value for this FailedReturnHostListDataType.
     * 
     * @return failedHost
     */
    public com.flexnet.opsembedded.webservices.FailedReturnHostDataType[] getFailedHost() {
        return failedHost;
    }


    /**
     * Sets the failedHost value for this FailedReturnHostListDataType.
     * 
     * @param failedHost
     */
    public void setFailedHost(com.flexnet.opsembedded.webservices.FailedReturnHostDataType[] failedHost) {
        this.failedHost = failedHost;
    }

    public com.flexnet.opsembedded.webservices.FailedReturnHostDataType getFailedHost(int i) {
        return this.failedHost[i];
    }

    public void setFailedHost(int i, com.flexnet.opsembedded.webservices.FailedReturnHostDataType _value) {
        this.failedHost[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedReturnHostListDataType)) return false;
        FailedReturnHostListDataType other = (FailedReturnHostListDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedHost==null && other.getFailedHost()==null) || 
             (this.failedHost!=null &&
              java.util.Arrays.equals(this.failedHost, other.getFailedHost())));
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
        if (getFailedHost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedHost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedHost(), i);
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
        new org.apache.axis.description.TypeDesc(FailedReturnHostListDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedReturnHostListDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedReturnHostDataType"));
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
