/**
 * MaintenanceLineItemDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class MaintenanceLineItemDataType  extends com.flexnet.operations.webservices.CreateMaintenanceLineItemDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.StateType state;

    public MaintenanceLineItemDataType() {
    }

    public MaintenanceLineItemDataType(
           com.flexnet.operations.webservices.IdType activationId,
           com.flexnet.operations.webservices.ProductIdentifierType maintenanceProduct,
           com.flexnet.operations.webservices.PartNumberIdentifierType partNumber,
           java.lang.String orderId,
           java.lang.String orderLineNumber,
           java.util.Date startDate,
           java.util.Date expirationDate,
           java.lang.Boolean isPermanent,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItem,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] associatedLineItems,
           com.flexnet.operations.webservices.StateType state) {
        super(
            activationId,
            maintenanceProduct,
            partNumber,
            orderId,
            orderLineNumber,
            startDate,
            expirationDate,
            isPermanent,
            parentLineItem,
            associatedLineItems);
        this.state = state;
    }


    /**
     * Gets the state value for this MaintenanceLineItemDataType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.StateType getState() {
        return state;
    }


    /**
     * Sets the state value for this MaintenanceLineItemDataType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.StateType state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaintenanceLineItemDataType)) return false;
        MaintenanceLineItemDataType other = (MaintenanceLineItemDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MaintenanceLineItemDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItemDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateType"));
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
