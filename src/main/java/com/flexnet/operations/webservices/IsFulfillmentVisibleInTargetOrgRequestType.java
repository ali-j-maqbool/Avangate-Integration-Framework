/**
 * IsFulfillmentVisibleInTargetOrgRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class IsFulfillmentVisibleInTargetOrgRequestType  implements java.io.Serializable {
    private java.lang.String activationID;

    private java.lang.String targetOrgID;

    public IsFulfillmentVisibleInTargetOrgRequestType() {
    }

    public IsFulfillmentVisibleInTargetOrgRequestType(
           java.lang.String activationID,
           java.lang.String targetOrgID) {
           this.activationID = activationID;
           this.targetOrgID = targetOrgID;
    }


    /**
     * Gets the activationID value for this IsFulfillmentVisibleInTargetOrgRequestType.
     * 
     * @return activationID
     */
    public java.lang.String getActivationID() {
        return activationID;
    }


    /**
     * Sets the activationID value for this IsFulfillmentVisibleInTargetOrgRequestType.
     * 
     * @param activationID
     */
    public void setActivationID(java.lang.String activationID) {
        this.activationID = activationID;
    }


    /**
     * Gets the targetOrgID value for this IsFulfillmentVisibleInTargetOrgRequestType.
     * 
     * @return targetOrgID
     */
    public java.lang.String getTargetOrgID() {
        return targetOrgID;
    }


    /**
     * Sets the targetOrgID value for this IsFulfillmentVisibleInTargetOrgRequestType.
     * 
     * @param targetOrgID
     */
    public void setTargetOrgID(java.lang.String targetOrgID) {
        this.targetOrgID = targetOrgID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsFulfillmentVisibleInTargetOrgRequestType)) return false;
        IsFulfillmentVisibleInTargetOrgRequestType other = (IsFulfillmentVisibleInTargetOrgRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activationID==null && other.getActivationID()==null) || 
             (this.activationID!=null &&
              this.activationID.equals(other.getActivationID()))) &&
            ((this.targetOrgID==null && other.getTargetOrgID()==null) || 
             (this.targetOrgID!=null &&
              this.targetOrgID.equals(other.getTargetOrgID())));
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
        if (getActivationID() != null) {
            _hashCode += getActivationID().hashCode();
        }
        if (getTargetOrgID() != null) {
            _hashCode += getTargetOrgID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsFulfillmentVisibleInTargetOrgRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isFulfillmentVisibleInTargetOrgRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "ActivationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetOrgID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "targetOrgID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
