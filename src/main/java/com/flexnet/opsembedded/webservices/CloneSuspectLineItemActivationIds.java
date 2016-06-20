/**
 * CloneSuspectLineItemActivationIds.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class CloneSuspectLineItemActivationIds  implements java.io.Serializable {
    private java.lang.String[] lineItemActivationId;

    public CloneSuspectLineItemActivationIds() {
    }

    public CloneSuspectLineItemActivationIds(
           java.lang.String[] lineItemActivationId) {
           this.lineItemActivationId = lineItemActivationId;
    }


    /**
     * Gets the lineItemActivationId value for this CloneSuspectLineItemActivationIds.
     * 
     * @return lineItemActivationId
     */
    public java.lang.String[] getLineItemActivationId() {
        return lineItemActivationId;
    }


    /**
     * Sets the lineItemActivationId value for this CloneSuspectLineItemActivationIds.
     * 
     * @param lineItemActivationId
     */
    public void setLineItemActivationId(java.lang.String[] lineItemActivationId) {
        this.lineItemActivationId = lineItemActivationId;
    }

    public java.lang.String getLineItemActivationId(int i) {
        return this.lineItemActivationId[i];
    }

    public void setLineItemActivationId(int i, java.lang.String _value) {
        this.lineItemActivationId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CloneSuspectLineItemActivationIds)) return false;
        CloneSuspectLineItemActivationIds other = (CloneSuspectLineItemActivationIds) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemActivationId==null && other.getLineItemActivationId()==null) || 
             (this.lineItemActivationId!=null &&
              java.util.Arrays.equals(this.lineItemActivationId, other.getLineItemActivationId())));
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
        if (getLineItemActivationId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItemActivationId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItemActivationId(), i);
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
        new org.apache.axis.description.TypeDesc(CloneSuspectLineItemActivationIds.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", ">cloneSuspect>lineItemActivationIds"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemActivationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "lineItemActivationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
