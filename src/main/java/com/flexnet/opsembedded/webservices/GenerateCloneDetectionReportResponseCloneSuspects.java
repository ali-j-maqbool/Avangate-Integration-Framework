/**
 * GenerateCloneDetectionReportResponseCloneSuspects.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GenerateCloneDetectionReportResponseCloneSuspects  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.CloneSuspect[] cloneSuspect;

    public GenerateCloneDetectionReportResponseCloneSuspects() {
    }

    public GenerateCloneDetectionReportResponseCloneSuspects(
           com.flexnet.opsembedded.webservices.CloneSuspect[] cloneSuspect) {
           this.cloneSuspect = cloneSuspect;
    }


    /**
     * Gets the cloneSuspect value for this GenerateCloneDetectionReportResponseCloneSuspects.
     * 
     * @return cloneSuspect
     */
    public com.flexnet.opsembedded.webservices.CloneSuspect[] getCloneSuspect() {
        return cloneSuspect;
    }


    /**
     * Sets the cloneSuspect value for this GenerateCloneDetectionReportResponseCloneSuspects.
     * 
     * @param cloneSuspect
     */
    public void setCloneSuspect(com.flexnet.opsembedded.webservices.CloneSuspect[] cloneSuspect) {
        this.cloneSuspect = cloneSuspect;
    }

    public com.flexnet.opsembedded.webservices.CloneSuspect getCloneSuspect(int i) {
        return this.cloneSuspect[i];
    }

    public void setCloneSuspect(int i, com.flexnet.opsembedded.webservices.CloneSuspect _value) {
        this.cloneSuspect[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateCloneDetectionReportResponseCloneSuspects)) return false;
        GenerateCloneDetectionReportResponseCloneSuspects other = (GenerateCloneDetectionReportResponseCloneSuspects) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cloneSuspect==null && other.getCloneSuspect()==null) || 
             (this.cloneSuspect!=null &&
              java.util.Arrays.equals(this.cloneSuspect, other.getCloneSuspect())));
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
        if (getCloneSuspect() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCloneSuspect());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCloneSuspect(), i);
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
        new org.apache.axis.description.TypeDesc(GenerateCloneDetectionReportResponseCloneSuspects.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", ">generateCloneDetectionReportResponse>cloneSuspects"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloneSuspect");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "cloneSuspect"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "cloneSuspect"));
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
