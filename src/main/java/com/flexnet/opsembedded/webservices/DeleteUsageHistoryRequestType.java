/**
 * DeleteUsageHistoryRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class DeleteUsageHistoryRequestType  implements java.io.Serializable {
    private java.util.Calendar beforeUpdateTime;

    public DeleteUsageHistoryRequestType() {
    }

    public DeleteUsageHistoryRequestType(
           java.util.Calendar beforeUpdateTime) {
           this.beforeUpdateTime = beforeUpdateTime;
    }


    /**
     * Gets the beforeUpdateTime value for this DeleteUsageHistoryRequestType.
     * 
     * @return beforeUpdateTime
     */
    public java.util.Calendar getBeforeUpdateTime() {
        return beforeUpdateTime;
    }


    /**
     * Sets the beforeUpdateTime value for this DeleteUsageHistoryRequestType.
     * 
     * @param beforeUpdateTime
     */
    public void setBeforeUpdateTime(java.util.Calendar beforeUpdateTime) {
        this.beforeUpdateTime = beforeUpdateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteUsageHistoryRequestType)) return false;
        DeleteUsageHistoryRequestType other = (DeleteUsageHistoryRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.beforeUpdateTime==null && other.getBeforeUpdateTime()==null) || 
             (this.beforeUpdateTime!=null &&
              this.beforeUpdateTime.equals(other.getBeforeUpdateTime())));
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
        if (getBeforeUpdateTime() != null) {
            _hashCode += getBeforeUpdateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteUsageHistoryRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteUsageHistoryRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beforeUpdateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "beforeUpdateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
