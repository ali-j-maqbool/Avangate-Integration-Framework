/**
 * GetDeletedSyncParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GetDeletedSyncParametersType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.DateTimeQueryType startTime;

    private com.flexnet.opsembedded.webservices.DateTimeQueryType endTime;

    private com.flexnet.opsembedded.webservices.ExternalIdQueryType serverUniqueId;

    private com.flexnet.opsembedded.webservices.SimpleQueryType serverId;

    public GetDeletedSyncParametersType() {
    }

    public GetDeletedSyncParametersType(
           com.flexnet.opsembedded.webservices.DateTimeQueryType startTime,
           com.flexnet.opsembedded.webservices.DateTimeQueryType endTime,
           com.flexnet.opsembedded.webservices.ExternalIdQueryType serverUniqueId,
           com.flexnet.opsembedded.webservices.SimpleQueryType serverId) {
           this.startTime = startTime;
           this.endTime = endTime;
           this.serverUniqueId = serverUniqueId;
           this.serverId = serverId;
    }


    /**
     * Gets the startTime value for this GetDeletedSyncParametersType.
     * 
     * @return startTime
     */
    public com.flexnet.opsembedded.webservices.DateTimeQueryType getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this GetDeletedSyncParametersType.
     * 
     * @param startTime
     */
    public void setStartTime(com.flexnet.opsembedded.webservices.DateTimeQueryType startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this GetDeletedSyncParametersType.
     * 
     * @return endTime
     */
    public com.flexnet.opsembedded.webservices.DateTimeQueryType getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this GetDeletedSyncParametersType.
     * 
     * @param endTime
     */
    public void setEndTime(com.flexnet.opsembedded.webservices.DateTimeQueryType endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the serverUniqueId value for this GetDeletedSyncParametersType.
     * 
     * @return serverUniqueId
     */
    public com.flexnet.opsembedded.webservices.ExternalIdQueryType getServerUniqueId() {
        return serverUniqueId;
    }


    /**
     * Sets the serverUniqueId value for this GetDeletedSyncParametersType.
     * 
     * @param serverUniqueId
     */
    public void setServerUniqueId(com.flexnet.opsembedded.webservices.ExternalIdQueryType serverUniqueId) {
        this.serverUniqueId = serverUniqueId;
    }


    /**
     * Gets the serverId value for this GetDeletedSyncParametersType.
     * 
     * @return serverId
     */
    public com.flexnet.opsembedded.webservices.SimpleQueryType getServerId() {
        return serverId;
    }


    /**
     * Sets the serverId value for this GetDeletedSyncParametersType.
     * 
     * @param serverId
     */
    public void setServerId(com.flexnet.opsembedded.webservices.SimpleQueryType serverId) {
        this.serverId = serverId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeletedSyncParametersType)) return false;
        GetDeletedSyncParametersType other = (GetDeletedSyncParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.serverUniqueId==null && other.getServerUniqueId()==null) || 
             (this.serverUniqueId!=null &&
              this.serverUniqueId.equals(other.getServerUniqueId()))) &&
            ((this.serverId==null && other.getServerId()==null) || 
             (this.serverId!=null &&
              this.serverId.equals(other.getServerId())));
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
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getServerUniqueId() != null) {
            _hashCode += getServerUniqueId().hashCode();
        }
        if (getServerId() != null) {
            _hashCode += getServerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDeletedSyncParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeletedSyncParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "serverUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "ExternalIdQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "serverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType"));
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
