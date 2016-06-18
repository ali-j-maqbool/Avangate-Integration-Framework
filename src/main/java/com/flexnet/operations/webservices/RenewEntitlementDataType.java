/**
 * RenewEntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class RenewEntitlementDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType parentEntitlementIdentifier;

    private com.flexnet.operations.webservices.RenewLineItemDataType[] renewLineItemData;

    public RenewEntitlementDataType() {
    }

    public RenewEntitlementDataType(
           com.flexnet.operations.webservices.EntitlementIdentifierType parentEntitlementIdentifier,
           com.flexnet.operations.webservices.RenewLineItemDataType[] renewLineItemData) {
           this.parentEntitlementIdentifier = parentEntitlementIdentifier;
           this.renewLineItemData = renewLineItemData;
    }


    /**
     * Gets the parentEntitlementIdentifier value for this RenewEntitlementDataType.
     * 
     * @return parentEntitlementIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getParentEntitlementIdentifier() {
        return parentEntitlementIdentifier;
    }


    /**
     * Sets the parentEntitlementIdentifier value for this RenewEntitlementDataType.
     * 
     * @param parentEntitlementIdentifier
     */
    public void setParentEntitlementIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType parentEntitlementIdentifier) {
        this.parentEntitlementIdentifier = parentEntitlementIdentifier;
    }


    /**
     * Gets the renewLineItemData value for this RenewEntitlementDataType.
     * 
     * @return renewLineItemData
     */
    public com.flexnet.operations.webservices.RenewLineItemDataType[] getRenewLineItemData() {
        return renewLineItemData;
    }


    /**
     * Sets the renewLineItemData value for this RenewEntitlementDataType.
     * 
     * @param renewLineItemData
     */
    public void setRenewLineItemData(com.flexnet.operations.webservices.RenewLineItemDataType[] renewLineItemData) {
        this.renewLineItemData = renewLineItemData;
    }

    public com.flexnet.operations.webservices.RenewLineItemDataType getRenewLineItemData(int i) {
        return this.renewLineItemData[i];
    }

    public void setRenewLineItemData(int i, com.flexnet.operations.webservices.RenewLineItemDataType _value) {
        this.renewLineItemData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RenewEntitlementDataType)) return false;
        RenewEntitlementDataType other = (RenewEntitlementDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parentEntitlementIdentifier==null && other.getParentEntitlementIdentifier()==null) || 
             (this.parentEntitlementIdentifier!=null &&
              this.parentEntitlementIdentifier.equals(other.getParentEntitlementIdentifier()))) &&
            ((this.renewLineItemData==null && other.getRenewLineItemData()==null) || 
             (this.renewLineItemData!=null &&
              java.util.Arrays.equals(this.renewLineItemData, other.getRenewLineItemData())));
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
        if (getParentEntitlementIdentifier() != null) {
            _hashCode += getParentEntitlementIdentifier().hashCode();
        }
        if (getRenewLineItemData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRenewLineItemData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRenewLineItemData(), i);
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
        new org.apache.axis.description.TypeDesc(RenewEntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewEntitlementDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentEntitlementIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentEntitlementIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewLineItemData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewLineItemData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewLineItemDataType"));
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
