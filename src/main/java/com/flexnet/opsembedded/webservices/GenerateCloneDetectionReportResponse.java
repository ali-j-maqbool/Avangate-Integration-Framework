/**
 * GenerateCloneDetectionReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GenerateCloneDetectionReportResponse  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.OpsEmbeddedStatusInfoType statusInfo;

    private com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportResponseCloneSuspects cloneSuspects;

    public GenerateCloneDetectionReportResponse() {
    }

    public GenerateCloneDetectionReportResponse(
           com.flexnet.opsembedded.webservices.OpsEmbeddedStatusInfoType statusInfo,
           com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportResponseCloneSuspects cloneSuspects) {
           this.statusInfo = statusInfo;
           this.cloneSuspects = cloneSuspects;
    }


    /**
     * Gets the statusInfo value for this GenerateCloneDetectionReportResponse.
     * 
     * @return statusInfo
     */
    public com.flexnet.opsembedded.webservices.OpsEmbeddedStatusInfoType getStatusInfo() {
        return statusInfo;
    }


    /**
     * Sets the statusInfo value for this GenerateCloneDetectionReportResponse.
     * 
     * @param statusInfo
     */
    public void setStatusInfo(com.flexnet.opsembedded.webservices.OpsEmbeddedStatusInfoType statusInfo) {
        this.statusInfo = statusInfo;
    }


    /**
     * Gets the cloneSuspects value for this GenerateCloneDetectionReportResponse.
     * 
     * @return cloneSuspects
     */
    public com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportResponseCloneSuspects getCloneSuspects() {
        return cloneSuspects;
    }


    /**
     * Sets the cloneSuspects value for this GenerateCloneDetectionReportResponse.
     * 
     * @param cloneSuspects
     */
    public void setCloneSuspects(com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportResponseCloneSuspects cloneSuspects) {
        this.cloneSuspects = cloneSuspects;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateCloneDetectionReportResponse)) return false;
        GenerateCloneDetectionReportResponse other = (GenerateCloneDetectionReportResponse) obj;
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
            ((this.cloneSuspects==null && other.getCloneSuspects()==null) || 
             (this.cloneSuspects!=null &&
              this.cloneSuspects.equals(other.getCloneSuspects())));
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
        if (getCloneSuspects() != null) {
            _hashCode += getCloneSuspects().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerateCloneDetectionReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCloneDetectionReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "statusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "OpsEmbeddedStatusInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloneSuspects");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "cloneSuspects"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", ">generateCloneDetectionReportResponse>cloneSuspects"));
        elemField.setNillable(true);
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
