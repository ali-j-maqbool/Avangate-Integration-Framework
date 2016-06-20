/**
 * GetUsageSummaryDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GetUsageSummaryDataType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.UsageSummaryDataType[] usageSummary;

    public GetUsageSummaryDataType() {
    }

    public GetUsageSummaryDataType(
           com.flexnet.opsembedded.webservices.UsageSummaryDataType[] usageSummary) {
           this.usageSummary = usageSummary;
    }


    /**
     * Gets the usageSummary value for this GetUsageSummaryDataType.
     * 
     * @return usageSummary
     */
    public com.flexnet.opsembedded.webservices.UsageSummaryDataType[] getUsageSummary() {
        return usageSummary;
    }


    /**
     * Sets the usageSummary value for this GetUsageSummaryDataType.
     * 
     * @param usageSummary
     */
    public void setUsageSummary(com.flexnet.opsembedded.webservices.UsageSummaryDataType[] usageSummary) {
        this.usageSummary = usageSummary;
    }

    public com.flexnet.opsembedded.webservices.UsageSummaryDataType getUsageSummary(int i) {
        return this.usageSummary[i];
    }

    public void setUsageSummary(int i, com.flexnet.opsembedded.webservices.UsageSummaryDataType _value) {
        this.usageSummary[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUsageSummaryDataType)) return false;
        GetUsageSummaryDataType other = (GetUsageSummaryDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usageSummary==null && other.getUsageSummary()==null) || 
             (this.usageSummary!=null &&
              java.util.Arrays.equals(this.usageSummary, other.getUsageSummary())));
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
        if (getUsageSummary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsageSummary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsageSummary(), i);
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
        new org.apache.axis.description.TypeDesc(GetUsageSummaryDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usageSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usageSummaryDataType"));
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
