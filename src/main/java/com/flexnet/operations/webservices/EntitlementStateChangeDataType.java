/**
 * EntitlementStateChangeDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class EntitlementStateChangeDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier;

    private com.flexnet.operations.webservices.StateChangeDataType[] stateChangeRecord;

    public EntitlementStateChangeDataType() {
    }

    public EntitlementStateChangeDataType(
           com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier,
           com.flexnet.operations.webservices.StateChangeDataType[] stateChangeRecord) {
           this.entitlementIdentifier = entitlementIdentifier;
           this.stateChangeRecord = stateChangeRecord;
    }


    /**
     * Gets the entitlementIdentifier value for this EntitlementStateChangeDataType.
     * 
     * @return entitlementIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getEntitlementIdentifier() {
        return entitlementIdentifier;
    }


    /**
     * Sets the entitlementIdentifier value for this EntitlementStateChangeDataType.
     * 
     * @param entitlementIdentifier
     */
    public void setEntitlementIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier) {
        this.entitlementIdentifier = entitlementIdentifier;
    }


    /**
     * Gets the stateChangeRecord value for this EntitlementStateChangeDataType.
     * 
     * @return stateChangeRecord
     */
    public com.flexnet.operations.webservices.StateChangeDataType[] getStateChangeRecord() {
        return stateChangeRecord;
    }


    /**
     * Sets the stateChangeRecord value for this EntitlementStateChangeDataType.
     * 
     * @param stateChangeRecord
     */
    public void setStateChangeRecord(com.flexnet.operations.webservices.StateChangeDataType[] stateChangeRecord) {
        this.stateChangeRecord = stateChangeRecord;
    }

    public com.flexnet.operations.webservices.StateChangeDataType getStateChangeRecord(int i) {
        return this.stateChangeRecord[i];
    }

    public void setStateChangeRecord(int i, com.flexnet.operations.webservices.StateChangeDataType _value) {
        this.stateChangeRecord[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitlementStateChangeDataType)) return false;
        EntitlementStateChangeDataType other = (EntitlementStateChangeDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitlementIdentifier==null && other.getEntitlementIdentifier()==null) || 
             (this.entitlementIdentifier!=null &&
              this.entitlementIdentifier.equals(other.getEntitlementIdentifier()))) &&
            ((this.stateChangeRecord==null && other.getStateChangeRecord()==null) || 
             (this.stateChangeRecord!=null &&
              java.util.Arrays.equals(this.stateChangeRecord, other.getStateChangeRecord())));
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
        if (getEntitlementIdentifier() != null) {
            _hashCode += getEntitlementIdentifier().hashCode();
        }
        if (getStateChangeRecord() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStateChangeRecord());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStateChangeRecord(), i);
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
        new org.apache.axis.description.TypeDesc(EntitlementStateChangeDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementStateChangeDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateChangeRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "stateChangeRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "stateChangeDataType"));
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
