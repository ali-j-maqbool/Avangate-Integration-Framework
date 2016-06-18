/**
 * GetExactAvailableCountRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetExactAvailableCountRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType activationId;

    public GetExactAvailableCountRequestType() {
    }

    public GetExactAvailableCountRequestType(
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType activationId) {
           this.activationId = activationId;
    }


    /**
     * Gets the activationId value for this GetExactAvailableCountRequestType.
     * 
     * @return activationId
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getActivationId() {
        return activationId;
    }


    /**
     * Sets the activationId value for this GetExactAvailableCountRequestType.
     * 
     * @param activationId
     */
    public void setActivationId(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType activationId) {
        this.activationId = activationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetExactAvailableCountRequestType)) return false;
        GetExactAvailableCountRequestType other = (GetExactAvailableCountRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activationId==null && other.getActivationId()==null) || 
             (this.activationId!=null &&
              this.activationId.equals(other.getActivationId())));
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
        if (getActivationId() != null) {
            _hashCode += getActivationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExactAvailableCountRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getExactAvailableCountRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
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
