/**
 * DupGroupDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class DupGroupDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.DupGroupType dupGroupOption;

    private com.flexnet.operations.webservices.GroupMaskDataType groupMask;

    public DupGroupDataType() {
    }

    public DupGroupDataType(
           com.flexnet.operations.webservices.DupGroupType dupGroupOption,
           com.flexnet.operations.webservices.GroupMaskDataType groupMask) {
           this.dupGroupOption = dupGroupOption;
           this.groupMask = groupMask;
    }


    /**
     * Gets the dupGroupOption value for this DupGroupDataType.
     * 
     * @return dupGroupOption
     */
    public com.flexnet.operations.webservices.DupGroupType getDupGroupOption() {
        return dupGroupOption;
    }


    /**
     * Sets the dupGroupOption value for this DupGroupDataType.
     * 
     * @param dupGroupOption
     */
    public void setDupGroupOption(com.flexnet.operations.webservices.DupGroupType dupGroupOption) {
        this.dupGroupOption = dupGroupOption;
    }


    /**
     * Gets the groupMask value for this DupGroupDataType.
     * 
     * @return groupMask
     */
    public com.flexnet.operations.webservices.GroupMaskDataType getGroupMask() {
        return groupMask;
    }


    /**
     * Sets the groupMask value for this DupGroupDataType.
     * 
     * @param groupMask
     */
    public void setGroupMask(com.flexnet.operations.webservices.GroupMaskDataType groupMask) {
        this.groupMask = groupMask;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DupGroupDataType)) return false;
        DupGroupDataType other = (DupGroupDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dupGroupOption==null && other.getDupGroupOption()==null) || 
             (this.dupGroupOption!=null &&
              this.dupGroupOption.equals(other.getDupGroupOption()))) &&
            ((this.groupMask==null && other.getGroupMask()==null) || 
             (this.groupMask!=null &&
              this.groupMask.equals(other.getGroupMask())));
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
        if (getDupGroupOption() != null) {
            _hashCode += getDupGroupOption().hashCode();
        }
        if (getGroupMask() != null) {
            _hashCode += getGroupMask().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DupGroupDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "dupGroupDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dupGroupOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "dupGroupOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DupGroupType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "groupMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "groupMaskDataType"));
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
