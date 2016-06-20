/**
 * RestoreServedClientRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class RestoreServedClientRequestType  implements java.io.Serializable {
    private java.lang.String servedClientHostId;

    private com.flexnet.opsembedded.webservices.DeviceIdTypeType servedClientIdType;

    private java.lang.String newHostID;

    private com.flexnet.opsembedded.webservices.DeviceIdTypeType[] serverHostIdTypes;

    public RestoreServedClientRequestType() {
    }

    public RestoreServedClientRequestType(
           java.lang.String servedClientHostId,
           com.flexnet.opsembedded.webservices.DeviceIdTypeType servedClientIdType,
           java.lang.String newHostID,
           com.flexnet.opsembedded.webservices.DeviceIdTypeType[] serverHostIdTypes) {
           this.servedClientHostId = servedClientHostId;
           this.servedClientIdType = servedClientIdType;
           this.newHostID = newHostID;
           this.serverHostIdTypes = serverHostIdTypes;
    }


    /**
     * Gets the servedClientHostId value for this RestoreServedClientRequestType.
     * 
     * @return servedClientHostId
     */
    public java.lang.String getServedClientHostId() {
        return servedClientHostId;
    }


    /**
     * Sets the servedClientHostId value for this RestoreServedClientRequestType.
     * 
     * @param servedClientHostId
     */
    public void setServedClientHostId(java.lang.String servedClientHostId) {
        this.servedClientHostId = servedClientHostId;
    }


    /**
     * Gets the servedClientIdType value for this RestoreServedClientRequestType.
     * 
     * @return servedClientIdType
     */
    public com.flexnet.opsembedded.webservices.DeviceIdTypeType getServedClientIdType() {
        return servedClientIdType;
    }


    /**
     * Sets the servedClientIdType value for this RestoreServedClientRequestType.
     * 
     * @param servedClientIdType
     */
    public void setServedClientIdType(com.flexnet.opsembedded.webservices.DeviceIdTypeType servedClientIdType) {
        this.servedClientIdType = servedClientIdType;
    }


    /**
     * Gets the newHostID value for this RestoreServedClientRequestType.
     * 
     * @return newHostID
     */
    public java.lang.String getNewHostID() {
        return newHostID;
    }


    /**
     * Sets the newHostID value for this RestoreServedClientRequestType.
     * 
     * @param newHostID
     */
    public void setNewHostID(java.lang.String newHostID) {
        this.newHostID = newHostID;
    }


    /**
     * Gets the serverHostIdTypes value for this RestoreServedClientRequestType.
     * 
     * @return serverHostIdTypes
     */
    public com.flexnet.opsembedded.webservices.DeviceIdTypeType[] getServerHostIdTypes() {
        return serverHostIdTypes;
    }


    /**
     * Sets the serverHostIdTypes value for this RestoreServedClientRequestType.
     * 
     * @param serverHostIdTypes
     */
    public void setServerHostIdTypes(com.flexnet.opsembedded.webservices.DeviceIdTypeType[] serverHostIdTypes) {
        this.serverHostIdTypes = serverHostIdTypes;
    }

    public com.flexnet.opsembedded.webservices.DeviceIdTypeType getServerHostIdTypes(int i) {
        return this.serverHostIdTypes[i];
    }

    public void setServerHostIdTypes(int i, com.flexnet.opsembedded.webservices.DeviceIdTypeType _value) {
        this.serverHostIdTypes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RestoreServedClientRequestType)) return false;
        RestoreServedClientRequestType other = (RestoreServedClientRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servedClientHostId==null && other.getServedClientHostId()==null) || 
             (this.servedClientHostId!=null &&
              this.servedClientHostId.equals(other.getServedClientHostId()))) &&
            ((this.servedClientIdType==null && other.getServedClientIdType()==null) || 
             (this.servedClientIdType!=null &&
              this.servedClientIdType.equals(other.getServedClientIdType()))) &&
            ((this.newHostID==null && other.getNewHostID()==null) || 
             (this.newHostID!=null &&
              this.newHostID.equals(other.getNewHostID()))) &&
            ((this.serverHostIdTypes==null && other.getServerHostIdTypes()==null) || 
             (this.serverHostIdTypes!=null &&
              java.util.Arrays.equals(this.serverHostIdTypes, other.getServerHostIdTypes())));
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
        if (getServedClientHostId() != null) {
            _hashCode += getServedClientHostId().hashCode();
        }
        if (getServedClientIdType() != null) {
            _hashCode += getServedClientIdType().hashCode();
        }
        if (getNewHostID() != null) {
            _hashCode += getNewHostID().hashCode();
        }
        if (getServerHostIdTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServerHostIdTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServerHostIdTypes(), i);
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
        new org.apache.axis.description.TypeDesc(RestoreServedClientRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "restoreServedClientRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servedClientHostId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "servedClientHostId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servedClientIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "servedClientIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdTypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newHostID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "newHostID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverHostIdTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "serverHostIdTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdTypeType"));
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
