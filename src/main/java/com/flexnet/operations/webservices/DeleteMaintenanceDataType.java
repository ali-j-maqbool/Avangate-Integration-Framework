/**
 * DeleteMaintenanceDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class DeleteMaintenanceDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.MaintenanceIdentifierType maintenanceIdentifier;

    public DeleteMaintenanceDataType() {
    }

    public DeleteMaintenanceDataType(
           com.flexnet.operations.webservices.MaintenanceIdentifierType maintenanceIdentifier) {
           this.maintenanceIdentifier = maintenanceIdentifier;
    }


    /**
     * Gets the maintenanceIdentifier value for this DeleteMaintenanceDataType.
     * 
     * @return maintenanceIdentifier
     */
    public com.flexnet.operations.webservices.MaintenanceIdentifierType getMaintenanceIdentifier() {
        return maintenanceIdentifier;
    }


    /**
     * Sets the maintenanceIdentifier value for this DeleteMaintenanceDataType.
     * 
     * @param maintenanceIdentifier
     */
    public void setMaintenanceIdentifier(com.flexnet.operations.webservices.MaintenanceIdentifierType maintenanceIdentifier) {
        this.maintenanceIdentifier = maintenanceIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteMaintenanceDataType)) return false;
        DeleteMaintenanceDataType other = (DeleteMaintenanceDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maintenanceIdentifier==null && other.getMaintenanceIdentifier()==null) || 
             (this.maintenanceIdentifier!=null &&
              this.maintenanceIdentifier.equals(other.getMaintenanceIdentifier())));
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
        if (getMaintenanceIdentifier() != null) {
            _hashCode += getMaintenanceIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteMaintenanceDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceIdentifierType"));
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
