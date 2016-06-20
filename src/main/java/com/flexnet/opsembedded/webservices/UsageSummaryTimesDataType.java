/**
 * UsageSummaryTimesDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class UsageSummaryTimesDataType  implements java.io.Serializable {
    private java.lang.String summaryTimeId;

    private java.util.Calendar summaryTime;

    public UsageSummaryTimesDataType() {
    }

    public UsageSummaryTimesDataType(
           java.lang.String summaryTimeId,
           java.util.Calendar summaryTime) {
           this.summaryTimeId = summaryTimeId;
           this.summaryTime = summaryTime;
    }


    /**
     * Gets the summaryTimeId value for this UsageSummaryTimesDataType.
     * 
     * @return summaryTimeId
     */
    public java.lang.String getSummaryTimeId() {
        return summaryTimeId;
    }


    /**
     * Sets the summaryTimeId value for this UsageSummaryTimesDataType.
     * 
     * @param summaryTimeId
     */
    public void setSummaryTimeId(java.lang.String summaryTimeId) {
        this.summaryTimeId = summaryTimeId;
    }


    /**
     * Gets the summaryTime value for this UsageSummaryTimesDataType.
     * 
     * @return summaryTime
     */
    public java.util.Calendar getSummaryTime() {
        return summaryTime;
    }


    /**
     * Sets the summaryTime value for this UsageSummaryTimesDataType.
     * 
     * @param summaryTime
     */
    public void setSummaryTime(java.util.Calendar summaryTime) {
        this.summaryTime = summaryTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsageSummaryTimesDataType)) return false;
        UsageSummaryTimesDataType other = (UsageSummaryTimesDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.summaryTimeId==null && other.getSummaryTimeId()==null) || 
             (this.summaryTimeId!=null &&
              this.summaryTimeId.equals(other.getSummaryTimeId()))) &&
            ((this.summaryTime==null && other.getSummaryTime()==null) || 
             (this.summaryTime!=null &&
              this.summaryTime.equals(other.getSummaryTime())));
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
        if (getSummaryTimeId() != null) {
            _hashCode += getSummaryTimeId().hashCode();
        }
        if (getSummaryTime() != null) {
            _hashCode += getSummaryTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsageSummaryTimesDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usageSummaryTimesDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryTimeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "summaryTimeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "summaryTime"));
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
