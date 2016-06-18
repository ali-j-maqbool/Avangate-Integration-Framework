/**
 * GetPartNumberCountRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetPartNumberCountRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.PartNumberQueryParametersType queryParams;

    public GetPartNumberCountRequestType() {
    }

    public GetPartNumberCountRequestType(
           com.flexnet.operations.webservices.PartNumberQueryParametersType queryParams) {
           this.queryParams = queryParams;
    }


    /**
     * Gets the queryParams value for this GetPartNumberCountRequestType.
     * 
     * @return queryParams
     */
    public com.flexnet.operations.webservices.PartNumberQueryParametersType getQueryParams() {
        return queryParams;
    }


    /**
     * Sets the queryParams value for this GetPartNumberCountRequestType.
     * 
     * @param queryParams
     */
    public void setQueryParams(com.flexnet.operations.webservices.PartNumberQueryParametersType queryParams) {
        this.queryParams = queryParams;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPartNumberCountRequestType)) return false;
        GetPartNumberCountRequestType other = (GetPartNumberCountRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryParams==null && other.getQueryParams()==null) || 
             (this.queryParams!=null &&
              this.queryParams.equals(other.getQueryParams())));
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
        if (getQueryParams() != null) {
            _hashCode += getQueryParams().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPartNumberCountRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getPartNumberCountRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "queryParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberQueryParametersType"));
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
