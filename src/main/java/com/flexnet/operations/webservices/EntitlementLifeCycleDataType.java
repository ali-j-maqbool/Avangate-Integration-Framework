/**
 * EntitlementLifeCycleDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class EntitlementLifeCycleDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType parentEntitlementIdentifier;

    private com.flexnet.operations.webservices.LineItemLifeCycleDataType[] lineItemData;

    public EntitlementLifeCycleDataType() {
    }

    public EntitlementLifeCycleDataType(
           com.flexnet.operations.webservices.EntitlementIdentifierType parentEntitlementIdentifier,
           com.flexnet.operations.webservices.LineItemLifeCycleDataType[] lineItemData) {
           this.parentEntitlementIdentifier = parentEntitlementIdentifier;
           this.lineItemData = lineItemData;
    }


    /**
     * Gets the parentEntitlementIdentifier value for this EntitlementLifeCycleDataType.
     * 
     * @return parentEntitlementIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getParentEntitlementIdentifier() {
        return parentEntitlementIdentifier;
    }


    /**
     * Sets the parentEntitlementIdentifier value for this EntitlementLifeCycleDataType.
     * 
     * @param parentEntitlementIdentifier
     */
    public void setParentEntitlementIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType parentEntitlementIdentifier) {
        this.parentEntitlementIdentifier = parentEntitlementIdentifier;
    }


    /**
     * Gets the lineItemData value for this EntitlementLifeCycleDataType.
     * 
     * @return lineItemData
     */
    public com.flexnet.operations.webservices.LineItemLifeCycleDataType[] getLineItemData() {
        return lineItemData;
    }


    /**
     * Sets the lineItemData value for this EntitlementLifeCycleDataType.
     * 
     * @param lineItemData
     */
    public void setLineItemData(com.flexnet.operations.webservices.LineItemLifeCycleDataType[] lineItemData) {
        this.lineItemData = lineItemData;
    }

    public com.flexnet.operations.webservices.LineItemLifeCycleDataType getLineItemData(int i) {
        return this.lineItemData[i];
    }

    public void setLineItemData(int i, com.flexnet.operations.webservices.LineItemLifeCycleDataType _value) {
        this.lineItemData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitlementLifeCycleDataType)) return false;
        EntitlementLifeCycleDataType other = (EntitlementLifeCycleDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parentEntitlementIdentifier==null && other.getParentEntitlementIdentifier()==null) || 
             (this.parentEntitlementIdentifier!=null &&
              this.parentEntitlementIdentifier.equals(other.getParentEntitlementIdentifier()))) &&
            ((this.lineItemData==null && other.getLineItemData()==null) || 
             (this.lineItemData!=null &&
              java.util.Arrays.equals(this.lineItemData, other.getLineItemData())));
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
        if (getParentEntitlementIdentifier() != null) {
            _hashCode += getParentEntitlementIdentifier().hashCode();
        }
        if (getLineItemData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItemData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItemData(), i);
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
        new org.apache.axis.description.TypeDesc(EntitlementLifeCycleDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLifeCycleDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentEntitlementIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentEntitlementIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemLifeCycleDataType"));
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
