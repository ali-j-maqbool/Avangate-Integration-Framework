/**
 * ReturnHostRequestListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class ReturnHostRequestListType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.ReturnHostType[] returnHosts;

    public ReturnHostRequestListType() {
    }

    public ReturnHostRequestListType(
           com.flexnet.opsembedded.webservices.ReturnHostType[] returnHosts) {
           this.returnHosts = returnHosts;
    }


    /**
     * Gets the returnHosts value for this ReturnHostRequestListType.
     * 
     * @return returnHosts
     */
    public com.flexnet.opsembedded.webservices.ReturnHostType[] getReturnHosts() {
        return returnHosts;
    }


    /**
     * Sets the returnHosts value for this ReturnHostRequestListType.
     * 
     * @param returnHosts
     */
    public void setReturnHosts(com.flexnet.opsembedded.webservices.ReturnHostType[] returnHosts) {
        this.returnHosts = returnHosts;
    }

    public com.flexnet.opsembedded.webservices.ReturnHostType getReturnHosts(int i) {
        return this.returnHosts[i];
    }

    public void setReturnHosts(int i, com.flexnet.opsembedded.webservices.ReturnHostType _value) {
        this.returnHosts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnHostRequestListType)) return false;
        ReturnHostRequestListType other = (ReturnHostRequestListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnHosts==null && other.getReturnHosts()==null) || 
             (this.returnHosts!=null &&
              java.util.Arrays.equals(this.returnHosts, other.getReturnHosts())));
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
        if (getReturnHosts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReturnHosts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReturnHosts(), i);
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
        new org.apache.axis.description.TypeDesc(ReturnHostRequestListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "returnHostRequestListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnHosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "returnHosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "returnHostType"));
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
