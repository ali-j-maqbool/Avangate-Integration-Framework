/**
 * FailedMaintenanceStateDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedMaintenanceStateDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedMaintenanceStateDataType[] failedMaintenance;

    public FailedMaintenanceStateDataListType() {
    }

    public FailedMaintenanceStateDataListType(
           com.flexnet.operations.webservices.FailedMaintenanceStateDataType[] failedMaintenance) {
           this.failedMaintenance = failedMaintenance;
    }


    /**
     * Gets the failedMaintenance value for this FailedMaintenanceStateDataListType.
     * 
     * @return failedMaintenance
     */
    public com.flexnet.operations.webservices.FailedMaintenanceStateDataType[] getFailedMaintenance() {
        return failedMaintenance;
    }


    /**
     * Sets the failedMaintenance value for this FailedMaintenanceStateDataListType.
     * 
     * @param failedMaintenance
     */
    public void setFailedMaintenance(com.flexnet.operations.webservices.FailedMaintenanceStateDataType[] failedMaintenance) {
        this.failedMaintenance = failedMaintenance;
    }

    public com.flexnet.operations.webservices.FailedMaintenanceStateDataType getFailedMaintenance(int i) {
        return this.failedMaintenance[i];
    }

    public void setFailedMaintenance(int i, com.flexnet.operations.webservices.FailedMaintenanceStateDataType _value) {
        this.failedMaintenance[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedMaintenanceStateDataListType)) return false;
        FailedMaintenanceStateDataListType other = (FailedMaintenanceStateDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedMaintenance==null && other.getFailedMaintenance()==null) || 
             (this.failedMaintenance!=null &&
              java.util.Arrays.equals(this.failedMaintenance, other.getFailedMaintenance())));
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
        if (getFailedMaintenance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedMaintenance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedMaintenance(), i);
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
        new org.apache.axis.description.TypeDesc(FailedMaintenanceStateDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMaintenanceStateDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedMaintenance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMaintenance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMaintenanceStateDataType"));
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
