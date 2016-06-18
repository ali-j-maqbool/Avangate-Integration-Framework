/**
 * ModelAttributesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class ModelAttributesType  implements java.io.Serializable {
    private boolean needServerId;

    private boolean needNodeLockId;

    private boolean needCount;

    private boolean needOverdraftCount;

    public ModelAttributesType() {
    }

    public ModelAttributesType(
           boolean needServerId,
           boolean needNodeLockId,
           boolean needCount,
           boolean needOverdraftCount) {
           this.needServerId = needServerId;
           this.needNodeLockId = needNodeLockId;
           this.needCount = needCount;
           this.needOverdraftCount = needOverdraftCount;
    }


    /**
     * Gets the needServerId value for this ModelAttributesType.
     * 
     * @return needServerId
     */
    public boolean isNeedServerId() {
        return needServerId;
    }


    /**
     * Sets the needServerId value for this ModelAttributesType.
     * 
     * @param needServerId
     */
    public void setNeedServerId(boolean needServerId) {
        this.needServerId = needServerId;
    }


    /**
     * Gets the needNodeLockId value for this ModelAttributesType.
     * 
     * @return needNodeLockId
     */
    public boolean isNeedNodeLockId() {
        return needNodeLockId;
    }


    /**
     * Sets the needNodeLockId value for this ModelAttributesType.
     * 
     * @param needNodeLockId
     */
    public void setNeedNodeLockId(boolean needNodeLockId) {
        this.needNodeLockId = needNodeLockId;
    }


    /**
     * Gets the needCount value for this ModelAttributesType.
     * 
     * @return needCount
     */
    public boolean isNeedCount() {
        return needCount;
    }


    /**
     * Sets the needCount value for this ModelAttributesType.
     * 
     * @param needCount
     */
    public void setNeedCount(boolean needCount) {
        this.needCount = needCount;
    }


    /**
     * Gets the needOverdraftCount value for this ModelAttributesType.
     * 
     * @return needOverdraftCount
     */
    public boolean isNeedOverdraftCount() {
        return needOverdraftCount;
    }


    /**
     * Sets the needOverdraftCount value for this ModelAttributesType.
     * 
     * @param needOverdraftCount
     */
    public void setNeedOverdraftCount(boolean needOverdraftCount) {
        this.needOverdraftCount = needOverdraftCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModelAttributesType)) return false;
        ModelAttributesType other = (ModelAttributesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.needServerId == other.isNeedServerId() &&
            this.needNodeLockId == other.isNeedNodeLockId() &&
            this.needCount == other.isNeedCount() &&
            this.needOverdraftCount == other.isNeedOverdraftCount();
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
        _hashCode += (isNeedServerId() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNeedNodeLockId() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNeedCount() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNeedOverdraftCount() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModelAttributesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "modelAttributesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needServerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "needServerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needNodeLockId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "needNodeLockId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "needCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needOverdraftCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "needOverdraftCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
