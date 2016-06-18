/**
 * DeleteAddonLineItemsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class DeleteAddonLineItemsRequestType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.DeleteAddonLineItemDataType[] requestList;

    public DeleteAddonLineItemsRequestType() {
    }

    public DeleteAddonLineItemsRequestType(
           com.flexnet.opsembedded.webservices.DeleteAddonLineItemDataType[] requestList) {
           this.requestList = requestList;
    }


    /**
     * Gets the requestList value for this DeleteAddonLineItemsRequestType.
     * 
     * @return requestList
     */
    public com.flexnet.opsembedded.webservices.DeleteAddonLineItemDataType[] getRequestList() {
        return requestList;
    }


    /**
     * Sets the requestList value for this DeleteAddonLineItemsRequestType.
     * 
     * @param requestList
     */
    public void setRequestList(com.flexnet.opsembedded.webservices.DeleteAddonLineItemDataType[] requestList) {
        this.requestList = requestList;
    }

    public com.flexnet.opsembedded.webservices.DeleteAddonLineItemDataType getRequestList(int i) {
        return this.requestList[i];
    }

    public void setRequestList(int i, com.flexnet.opsembedded.webservices.DeleteAddonLineItemDataType _value) {
        this.requestList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteAddonLineItemsRequestType)) return false;
        DeleteAddonLineItemsRequestType other = (DeleteAddonLineItemsRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestList==null && other.getRequestList()==null) || 
             (this.requestList!=null &&
              java.util.Arrays.equals(this.requestList, other.getRequestList())));
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
        if (getRequestList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestList(), i);
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
        new org.apache.axis.description.TypeDesc(DeleteAddonLineItemsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteAddonLineItemsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "requestList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteAddonLineItemDataType"));
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
