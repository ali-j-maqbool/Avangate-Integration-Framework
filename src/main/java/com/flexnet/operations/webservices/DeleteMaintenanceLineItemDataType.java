/**
 * DeleteMaintenanceLineItemDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class DeleteMaintenanceLineItemDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType maintenanceLineItemIdentifier;

    public DeleteMaintenanceLineItemDataType() {
    }

    public DeleteMaintenanceLineItemDataType(
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType maintenanceLineItemIdentifier) {
           this.maintenanceLineItemIdentifier = maintenanceLineItemIdentifier;
    }


    /**
     * Gets the maintenanceLineItemIdentifier value for this DeleteMaintenanceLineItemDataType.
     * 
     * @return maintenanceLineItemIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getMaintenanceLineItemIdentifier() {
        return maintenanceLineItemIdentifier;
    }


    /**
     * Sets the maintenanceLineItemIdentifier value for this DeleteMaintenanceLineItemDataType.
     * 
     * @param maintenanceLineItemIdentifier
     */
    public void setMaintenanceLineItemIdentifier(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType maintenanceLineItemIdentifier) {
        this.maintenanceLineItemIdentifier = maintenanceLineItemIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteMaintenanceLineItemDataType)) return false;
        DeleteMaintenanceLineItemDataType other = (DeleteMaintenanceLineItemDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maintenanceLineItemIdentifier==null && other.getMaintenanceLineItemIdentifier()==null) || 
             (this.maintenanceLineItemIdentifier!=null &&
              this.maintenanceLineItemIdentifier.equals(other.getMaintenanceLineItemIdentifier())));
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
        if (getMaintenanceLineItemIdentifier() != null) {
            _hashCode += getMaintenanceLineItemIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteMaintenanceLineItemDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceLineItemDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceLineItemIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItemIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
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
