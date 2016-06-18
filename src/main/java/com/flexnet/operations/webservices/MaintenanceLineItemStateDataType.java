/**
 * MaintenanceLineItemStateDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class MaintenanceLineItemStateDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier;

    private com.flexnet.operations.webservices.StateType stateToSet;

    public MaintenanceLineItemStateDataType() {
    }

    public MaintenanceLineItemStateDataType(
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier,
           com.flexnet.operations.webservices.StateType stateToSet) {
           this.lineItemIdentifier = lineItemIdentifier;
           this.stateToSet = stateToSet;
    }


    /**
     * Gets the lineItemIdentifier value for this MaintenanceLineItemStateDataType.
     * 
     * @return lineItemIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getLineItemIdentifier() {
        return lineItemIdentifier;
    }


    /**
     * Sets the lineItemIdentifier value for this MaintenanceLineItemStateDataType.
     * 
     * @param lineItemIdentifier
     */
    public void setLineItemIdentifier(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier) {
        this.lineItemIdentifier = lineItemIdentifier;
    }


    /**
     * Gets the stateToSet value for this MaintenanceLineItemStateDataType.
     * 
     * @return stateToSet
     */
    public com.flexnet.operations.webservices.StateType getStateToSet() {
        return stateToSet;
    }


    /**
     * Sets the stateToSet value for this MaintenanceLineItemStateDataType.
     * 
     * @param stateToSet
     */
    public void setStateToSet(com.flexnet.operations.webservices.StateType stateToSet) {
        this.stateToSet = stateToSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaintenanceLineItemStateDataType)) return false;
        MaintenanceLineItemStateDataType other = (MaintenanceLineItemStateDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemIdentifier==null && other.getLineItemIdentifier()==null) || 
             (this.lineItemIdentifier!=null &&
              this.lineItemIdentifier.equals(other.getLineItemIdentifier()))) &&
            ((this.stateToSet==null && other.getStateToSet()==null) || 
             (this.stateToSet!=null &&
              this.stateToSet.equals(other.getStateToSet())));
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
        if (getLineItemIdentifier() != null) {
            _hashCode += getLineItemIdentifier().hashCode();
        }
        if (getStateToSet() != null) {
            _hashCode += getStateToSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MaintenanceLineItemStateDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItemStateDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateToSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "stateToSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateType"));
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
