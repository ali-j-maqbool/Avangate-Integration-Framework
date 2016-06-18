/**
 * AddWebRegKeyResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class AddWebRegKeyResponseType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.StatusInfoType statusInfo;

    private com.flexnet.operations.webservices.WebRegKeyDataListType responseData;

    private com.flexnet.operations.webservices.FailedAddWebRegKeyDataListType failedData;

    public AddWebRegKeyResponseType() {
    }

    public AddWebRegKeyResponseType(
           com.flexnet.operations.webservices.StatusInfoType statusInfo,
           com.flexnet.operations.webservices.WebRegKeyDataListType responseData,
           com.flexnet.operations.webservices.FailedAddWebRegKeyDataListType failedData) {
           this.statusInfo = statusInfo;
           this.responseData = responseData;
           this.failedData = failedData;
    }


    /**
     * Gets the statusInfo value for this AddWebRegKeyResponseType.
     * 
     * @return statusInfo
     */
    public com.flexnet.operations.webservices.StatusInfoType getStatusInfo() {
        return statusInfo;
    }


    /**
     * Sets the statusInfo value for this AddWebRegKeyResponseType.
     * 
     * @param statusInfo
     */
    public void setStatusInfo(com.flexnet.operations.webservices.StatusInfoType statusInfo) {
        this.statusInfo = statusInfo;
    }


    /**
     * Gets the responseData value for this AddWebRegKeyResponseType.
     * 
     * @return responseData
     */
    public com.flexnet.operations.webservices.WebRegKeyDataListType getResponseData() {
        return responseData;
    }


    /**
     * Sets the responseData value for this AddWebRegKeyResponseType.
     * 
     * @param responseData
     */
    public void setResponseData(com.flexnet.operations.webservices.WebRegKeyDataListType responseData) {
        this.responseData = responseData;
    }


    /**
     * Gets the failedData value for this AddWebRegKeyResponseType.
     * 
     * @return failedData
     */
    public com.flexnet.operations.webservices.FailedAddWebRegKeyDataListType getFailedData() {
        return failedData;
    }


    /**
     * Sets the failedData value for this AddWebRegKeyResponseType.
     * 
     * @param failedData
     */
    public void setFailedData(com.flexnet.operations.webservices.FailedAddWebRegKeyDataListType failedData) {
        this.failedData = failedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddWebRegKeyResponseType)) return false;
        AddWebRegKeyResponseType other = (AddWebRegKeyResponseType) obj;
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
            ((this.responseData==null && other.getResponseData()==null) || 
             (this.responseData!=null &&
              this.responseData.equals(other.getResponseData()))) &&
            ((this.failedData==null && other.getFailedData()==null) || 
             (this.failedData!=null &&
              this.failedData.equals(other.getFailedData())));
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
        if (getResponseData() != null) {
            _hashCode += getResponseData().hashCode();
        }
        if (getFailedData() != null) {
            _hashCode += getFailedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddWebRegKeyResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addWebRegKeyResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "statusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StatusInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "responseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeyDataListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedAddWebRegKeyDataListType"));
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
