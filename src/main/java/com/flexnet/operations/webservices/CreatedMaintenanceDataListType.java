/**
 * CreatedMaintenanceDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreatedMaintenanceDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.CreatedMaintenaceDataType[] createdMaintenance;

    public CreatedMaintenanceDataListType() {
    }

    public CreatedMaintenanceDataListType(
           com.flexnet.operations.webservices.CreatedMaintenaceDataType[] createdMaintenance) {
           this.createdMaintenance = createdMaintenance;
    }


    /**
     * Gets the createdMaintenance value for this CreatedMaintenanceDataListType.
     * 
     * @return createdMaintenance
     */
    public com.flexnet.operations.webservices.CreatedMaintenaceDataType[] getCreatedMaintenance() {
        return createdMaintenance;
    }


    /**
     * Sets the createdMaintenance value for this CreatedMaintenanceDataListType.
     * 
     * @param createdMaintenance
     */
    public void setCreatedMaintenance(com.flexnet.operations.webservices.CreatedMaintenaceDataType[] createdMaintenance) {
        this.createdMaintenance = createdMaintenance;
    }

    public com.flexnet.operations.webservices.CreatedMaintenaceDataType getCreatedMaintenance(int i) {
        return this.createdMaintenance[i];
    }

    public void setCreatedMaintenance(int i, com.flexnet.operations.webservices.CreatedMaintenaceDataType _value) {
        this.createdMaintenance[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatedMaintenanceDataListType)) return false;
        CreatedMaintenanceDataListType other = (CreatedMaintenanceDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdMaintenance==null && other.getCreatedMaintenance()==null) || 
             (this.createdMaintenance!=null &&
              java.util.Arrays.equals(this.createdMaintenance, other.getCreatedMaintenance())));
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
        if (getCreatedMaintenance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedMaintenance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedMaintenance(), i);
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
        new org.apache.axis.description.TypeDesc(CreatedMaintenanceDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdMaintenanceDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdMaintenance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdMaintenance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdMaintenaceDataType"));
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
