/**
 * UnlinkMaintenanceLineItemRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UnlinkMaintenanceLineItemRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.UnlinkMaintenanceLineItemListType unlinkMaintenanceLineItemList;

    public UnlinkMaintenanceLineItemRequestType() {
    }

    public UnlinkMaintenanceLineItemRequestType(
           com.flexnet.operations.webservices.UnlinkMaintenanceLineItemListType unlinkMaintenanceLineItemList) {
           this.unlinkMaintenanceLineItemList = unlinkMaintenanceLineItemList;
    }


    /**
     * Gets the unlinkMaintenanceLineItemList value for this UnlinkMaintenanceLineItemRequestType.
     * 
     * @return unlinkMaintenanceLineItemList
     */
    public com.flexnet.operations.webservices.UnlinkMaintenanceLineItemListType getUnlinkMaintenanceLineItemList() {
        return unlinkMaintenanceLineItemList;
    }


    /**
     * Sets the unlinkMaintenanceLineItemList value for this UnlinkMaintenanceLineItemRequestType.
     * 
     * @param unlinkMaintenanceLineItemList
     */
    public void setUnlinkMaintenanceLineItemList(com.flexnet.operations.webservices.UnlinkMaintenanceLineItemListType unlinkMaintenanceLineItemList) {
        this.unlinkMaintenanceLineItemList = unlinkMaintenanceLineItemList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnlinkMaintenanceLineItemRequestType)) return false;
        UnlinkMaintenanceLineItemRequestType other = (UnlinkMaintenanceLineItemRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unlinkMaintenanceLineItemList==null && other.getUnlinkMaintenanceLineItemList()==null) || 
             (this.unlinkMaintenanceLineItemList!=null &&
              this.unlinkMaintenanceLineItemList.equals(other.getUnlinkMaintenanceLineItemList())));
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
        if (getUnlinkMaintenanceLineItemList() != null) {
            _hashCode += getUnlinkMaintenanceLineItemList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnlinkMaintenanceLineItemRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItemRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlinkMaintenanceLineItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItemListType"));
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
