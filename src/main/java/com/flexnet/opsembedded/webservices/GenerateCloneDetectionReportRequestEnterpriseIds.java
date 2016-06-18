/**
 * GenerateCloneDetectionReportRequestEnterpriseIds.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GenerateCloneDetectionReportRequestEnterpriseIds  implements java.io.Serializable {
    private java.lang.String[] enterpriseId;

    public GenerateCloneDetectionReportRequestEnterpriseIds() {
    }

    public GenerateCloneDetectionReportRequestEnterpriseIds(
           java.lang.String[] enterpriseId) {
           this.enterpriseId = enterpriseId;
    }


    /**
     * Gets the enterpriseId value for this GenerateCloneDetectionReportRequestEnterpriseIds.
     * 
     * @return enterpriseId
     */
    public java.lang.String[] getEnterpriseId() {
        return enterpriseId;
    }


    /**
     * Sets the enterpriseId value for this GenerateCloneDetectionReportRequestEnterpriseIds.
     * 
     * @param enterpriseId
     */
    public void setEnterpriseId(java.lang.String[] enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public java.lang.String getEnterpriseId(int i) {
        return this.enterpriseId[i];
    }

    public void setEnterpriseId(int i, java.lang.String _value) {
        this.enterpriseId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateCloneDetectionReportRequestEnterpriseIds)) return false;
        GenerateCloneDetectionReportRequestEnterpriseIds other = (GenerateCloneDetectionReportRequestEnterpriseIds) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enterpriseId==null && other.getEnterpriseId()==null) || 
             (this.enterpriseId!=null &&
              java.util.Arrays.equals(this.enterpriseId, other.getEnterpriseId())));
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
        if (getEnterpriseId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnterpriseId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnterpriseId(), i);
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
        new org.apache.axis.description.TypeDesc(GenerateCloneDetectionReportRequestEnterpriseIds.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", ">generateCloneDetectionReportRequest>enterpriseIds"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enterpriseId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "enterpriseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
