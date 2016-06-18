/**
 * SearchActivatableItemResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class SearchActivatableItemResponseType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.StatusInfoType statusInfo;

    private com.flexnet.operations.webservices.ActivatableItemDetailType[] activatableItem;

    public SearchActivatableItemResponseType() {
    }

    public SearchActivatableItemResponseType(
           com.flexnet.operations.webservices.StatusInfoType statusInfo,
           com.flexnet.operations.webservices.ActivatableItemDetailType[] activatableItem) {
           this.statusInfo = statusInfo;
           this.activatableItem = activatableItem;
    }


    /**
     * Gets the statusInfo value for this SearchActivatableItemResponseType.
     * 
     * @return statusInfo
     */
    public com.flexnet.operations.webservices.StatusInfoType getStatusInfo() {
        return statusInfo;
    }


    /**
     * Sets the statusInfo value for this SearchActivatableItemResponseType.
     * 
     * @param statusInfo
     */
    public void setStatusInfo(com.flexnet.operations.webservices.StatusInfoType statusInfo) {
        this.statusInfo = statusInfo;
    }


    /**
     * Gets the activatableItem value for this SearchActivatableItemResponseType.
     * 
     * @return activatableItem
     */
    public com.flexnet.operations.webservices.ActivatableItemDetailType[] getActivatableItem() {
        return activatableItem;
    }


    /**
     * Sets the activatableItem value for this SearchActivatableItemResponseType.
     * 
     * @param activatableItem
     */
    public void setActivatableItem(com.flexnet.operations.webservices.ActivatableItemDetailType[] activatableItem) {
        this.activatableItem = activatableItem;
    }

    public com.flexnet.operations.webservices.ActivatableItemDetailType getActivatableItem(int i) {
        return this.activatableItem[i];
    }

    public void setActivatableItem(int i, com.flexnet.operations.webservices.ActivatableItemDetailType _value) {
        this.activatableItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchActivatableItemResponseType)) return false;
        SearchActivatableItemResponseType other = (SearchActivatableItemResponseType) obj;
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
            ((this.activatableItem==null && other.getActivatableItem()==null) || 
             (this.activatableItem!=null &&
              java.util.Arrays.equals(this.activatableItem, other.getActivatableItem())));
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
        if (getActivatableItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivatableItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivatableItem(), i);
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
        new org.apache.axis.description.TypeDesc(SearchActivatableItemResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchActivatableItemResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "statusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StatusInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activatableItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activatableItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activatableItemDetailType"));
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
