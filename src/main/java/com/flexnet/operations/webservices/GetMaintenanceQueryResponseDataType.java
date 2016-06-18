/**
 * GetMaintenanceQueryResponseDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetMaintenanceQueryResponseDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.MaintenanceQueryDataType[] maintenance;

    public GetMaintenanceQueryResponseDataType() {
    }

    public GetMaintenanceQueryResponseDataType(
           com.flexnet.operations.webservices.MaintenanceQueryDataType[] maintenance) {
           this.maintenance = maintenance;
    }


    /**
     * Gets the maintenance value for this GetMaintenanceQueryResponseDataType.
     * 
     * @return maintenance
     */
    public com.flexnet.operations.webservices.MaintenanceQueryDataType[] getMaintenance() {
        return maintenance;
    }


    /**
     * Sets the maintenance value for this GetMaintenanceQueryResponseDataType.
     * 
     * @param maintenance
     */
    public void setMaintenance(com.flexnet.operations.webservices.MaintenanceQueryDataType[] maintenance) {
        this.maintenance = maintenance;
    }

    public com.flexnet.operations.webservices.MaintenanceQueryDataType getMaintenance(int i) {
        return this.maintenance[i];
    }

    public void setMaintenance(int i, com.flexnet.operations.webservices.MaintenanceQueryDataType _value) {
        this.maintenance[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMaintenanceQueryResponseDataType)) return false;
        GetMaintenanceQueryResponseDataType other = (GetMaintenanceQueryResponseDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maintenance==null && other.getMaintenance()==null) || 
             (this.maintenance!=null &&
              java.util.Arrays.equals(this.maintenance, other.getMaintenance())));
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
        if (getMaintenance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaintenance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaintenance(), i);
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
        new org.apache.axis.description.TypeDesc(GetMaintenanceQueryResponseDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceQueryResponseDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceQueryDataType"));
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
