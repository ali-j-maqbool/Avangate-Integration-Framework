/**
 * GetBulkEntitlementPropertiesResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetBulkEntitlementPropertiesResponseType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.StatusInfoType statusInfo;

    private com.flexnet.operations.webservices.BulkEntitlementPropertiesType[] bulkEntitlement;

    public GetBulkEntitlementPropertiesResponseType() {
    }

    public GetBulkEntitlementPropertiesResponseType(
           com.flexnet.operations.webservices.StatusInfoType statusInfo,
           com.flexnet.operations.webservices.BulkEntitlementPropertiesType[] bulkEntitlement) {
           this.statusInfo = statusInfo;
           this.bulkEntitlement = bulkEntitlement;
    }


    /**
     * Gets the statusInfo value for this GetBulkEntitlementPropertiesResponseType.
     * 
     * @return statusInfo
     */
    public com.flexnet.operations.webservices.StatusInfoType getStatusInfo() {
        return statusInfo;
    }


    /**
     * Sets the statusInfo value for this GetBulkEntitlementPropertiesResponseType.
     * 
     * @param statusInfo
     */
    public void setStatusInfo(com.flexnet.operations.webservices.StatusInfoType statusInfo) {
        this.statusInfo = statusInfo;
    }


    /**
     * Gets the bulkEntitlement value for this GetBulkEntitlementPropertiesResponseType.
     * 
     * @return bulkEntitlement
     */
    public com.flexnet.operations.webservices.BulkEntitlementPropertiesType[] getBulkEntitlement() {
        return bulkEntitlement;
    }


    /**
     * Sets the bulkEntitlement value for this GetBulkEntitlementPropertiesResponseType.
     * 
     * @param bulkEntitlement
     */
    public void setBulkEntitlement(com.flexnet.operations.webservices.BulkEntitlementPropertiesType[] bulkEntitlement) {
        this.bulkEntitlement = bulkEntitlement;
    }

    public com.flexnet.operations.webservices.BulkEntitlementPropertiesType getBulkEntitlement(int i) {
        return this.bulkEntitlement[i];
    }

    public void setBulkEntitlement(int i, com.flexnet.operations.webservices.BulkEntitlementPropertiesType _value) {
        this.bulkEntitlement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBulkEntitlementPropertiesResponseType)) return false;
        GetBulkEntitlementPropertiesResponseType other = (GetBulkEntitlementPropertiesResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusInfo==null && other.getStatusInfo()==null) || 
             (this.statusInfo!=null &&
              this.statusInfo.equals(other.getStatusInfo()))) &&
            ((this.bulkEntitlement==null && other.getBulkEntitlement()==null) || 
             (this.bulkEntitlement!=null &&
              java.util.Arrays.equals(this.bulkEntitlement, other.getBulkEntitlement())));
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
        if (getStatusInfo() != null) {
            _hashCode += getStatusInfo().hashCode();
        }
        if (getBulkEntitlement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBulkEntitlement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBulkEntitlement(), i);
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
        new org.apache.axis.description.TypeDesc(GetBulkEntitlementPropertiesResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementPropertiesResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "statusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StatusInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementPropertiesType"));
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
