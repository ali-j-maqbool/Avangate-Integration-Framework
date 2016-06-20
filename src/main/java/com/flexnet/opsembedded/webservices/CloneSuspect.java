/**
 * CloneSuspect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class CloneSuspect  implements java.io.Serializable {
    private java.util.Calendar timeStamp;

    private com.flexnet.opsembedded.webservices.WSDeviceType hostClass;

    private java.lang.String hostAlias;

    private java.lang.String deviceId;

    private java.lang.String serverId;

    private com.flexnet.opsembedded.webservices.CloneSuspectLineItemActivationIds lineItemActivationIds;

    private com.flexnet.opsembedded.webservices.FeatureIds[] featureIds;

    private java.lang.String orgId;

    private java.lang.String orgName;

    private java.lang.String enterpriseId;

    public CloneSuspect() {
    }

    public CloneSuspect(
           java.util.Calendar timeStamp,
           com.flexnet.opsembedded.webservices.WSDeviceType hostClass,
           java.lang.String hostAlias,
           java.lang.String deviceId,
           java.lang.String serverId,
           com.flexnet.opsembedded.webservices.CloneSuspectLineItemActivationIds lineItemActivationIds,
           com.flexnet.opsembedded.webservices.FeatureIds[] featureIds,
           java.lang.String orgId,
           java.lang.String orgName,
           java.lang.String enterpriseId) {
           this.timeStamp = timeStamp;
           this.hostClass = hostClass;
           this.hostAlias = hostAlias;
           this.deviceId = deviceId;
           this.serverId = serverId;
           this.lineItemActivationIds = lineItemActivationIds;
           this.featureIds = featureIds;
           this.orgId = orgId;
           this.orgName = orgName;
           this.enterpriseId = enterpriseId;
    }


    /**
     * Gets the timeStamp value for this CloneSuspect.
     * 
     * @return timeStamp
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this CloneSuspect.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the hostClass value for this CloneSuspect.
     * 
     * @return hostClass
     */
    public com.flexnet.opsembedded.webservices.WSDeviceType getHostClass() {
        return hostClass;
    }


    /**
     * Sets the hostClass value for this CloneSuspect.
     * 
     * @param hostClass
     */
    public void setHostClass(com.flexnet.opsembedded.webservices.WSDeviceType hostClass) {
        this.hostClass = hostClass;
    }


    /**
     * Gets the hostAlias value for this CloneSuspect.
     * 
     * @return hostAlias
     */
    public java.lang.String getHostAlias() {
        return hostAlias;
    }


    /**
     * Sets the hostAlias value for this CloneSuspect.
     * 
     * @param hostAlias
     */
    public void setHostAlias(java.lang.String hostAlias) {
        this.hostAlias = hostAlias;
    }


    /**
     * Gets the deviceId value for this CloneSuspect.
     * 
     * @return deviceId
     */
    public java.lang.String getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this CloneSuspect.
     * 
     * @param deviceId
     */
    public void setDeviceId(java.lang.String deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the serverId value for this CloneSuspect.
     * 
     * @return serverId
     */
    public java.lang.String getServerId() {
        return serverId;
    }


    /**
     * Sets the serverId value for this CloneSuspect.
     * 
     * @param serverId
     */
    public void setServerId(java.lang.String serverId) {
        this.serverId = serverId;
    }


    /**
     * Gets the lineItemActivationIds value for this CloneSuspect.
     * 
     * @return lineItemActivationIds
     */
    public com.flexnet.opsembedded.webservices.CloneSuspectLineItemActivationIds getLineItemActivationIds() {
        return lineItemActivationIds;
    }


    /**
     * Sets the lineItemActivationIds value for this CloneSuspect.
     * 
     * @param lineItemActivationIds
     */
    public void setLineItemActivationIds(com.flexnet.opsembedded.webservices.CloneSuspectLineItemActivationIds lineItemActivationIds) {
        this.lineItemActivationIds = lineItemActivationIds;
    }


    /**
     * Gets the featureIds value for this CloneSuspect.
     * 
     * @return featureIds
     */
    public com.flexnet.opsembedded.webservices.FeatureIds[] getFeatureIds() {
        return featureIds;
    }


    /**
     * Sets the featureIds value for this CloneSuspect.
     * 
     * @param featureIds
     */
    public void setFeatureIds(com.flexnet.opsembedded.webservices.FeatureIds[] featureIds) {
        this.featureIds = featureIds;
    }

    public com.flexnet.opsembedded.webservices.FeatureIds getFeatureIds(int i) {
        return this.featureIds[i];
    }

    public void setFeatureIds(int i, com.flexnet.opsembedded.webservices.FeatureIds _value) {
        this.featureIds[i] = _value;
    }


    /**
     * Gets the orgId value for this CloneSuspect.
     * 
     * @return orgId
     */
    public java.lang.String getOrgId() {
        return orgId;
    }


    /**
     * Sets the orgId value for this CloneSuspect.
     * 
     * @param orgId
     */
    public void setOrgId(java.lang.String orgId) {
        this.orgId = orgId;
    }


    /**
     * Gets the orgName value for this CloneSuspect.
     * 
     * @return orgName
     */
    public java.lang.String getOrgName() {
        return orgName;
    }


    /**
     * Sets the orgName value for this CloneSuspect.
     * 
     * @param orgName
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }


    /**
     * Gets the enterpriseId value for this CloneSuspect.
     * 
     * @return enterpriseId
     */
    public java.lang.String getEnterpriseId() {
        return enterpriseId;
    }


    /**
     * Sets the enterpriseId value for this CloneSuspect.
     * 
     * @param enterpriseId
     */
    public void setEnterpriseId(java.lang.String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CloneSuspect)) return false;
        CloneSuspect other = (CloneSuspect) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.hostClass==null && other.getHostClass()==null) || 
             (this.hostClass!=null &&
              this.hostClass.equals(other.getHostClass()))) &&
            ((this.hostAlias==null && other.getHostAlias()==null) || 
             (this.hostAlias!=null &&
              this.hostAlias.equals(other.getHostAlias()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.serverId==null && other.getServerId()==null) || 
             (this.serverId!=null &&
              this.serverId.equals(other.getServerId()))) &&
            ((this.lineItemActivationIds==null && other.getLineItemActivationIds()==null) || 
             (this.lineItemActivationIds!=null &&
              this.lineItemActivationIds.equals(other.getLineItemActivationIds()))) &&
            ((this.featureIds==null && other.getFeatureIds()==null) || 
             (this.featureIds!=null &&
              java.util.Arrays.equals(this.featureIds, other.getFeatureIds()))) &&
            ((this.orgId==null && other.getOrgId()==null) || 
             (this.orgId!=null &&
              this.orgId.equals(other.getOrgId()))) &&
            ((this.orgName==null && other.getOrgName()==null) || 
             (this.orgName!=null &&
              this.orgName.equals(other.getOrgName()))) &&
            ((this.enterpriseId==null && other.getEnterpriseId()==null) || 
             (this.enterpriseId!=null &&
              this.enterpriseId.equals(other.getEnterpriseId())));
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
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getHostClass() != null) {
            _hashCode += getHostClass().hashCode();
        }
        if (getHostAlias() != null) {
            _hashCode += getHostAlias().hashCode();
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getServerId() != null) {
            _hashCode += getServerId().hashCode();
        }
        if (getLineItemActivationIds() != null) {
            _hashCode += getLineItemActivationIds().hashCode();
        }
        if (getFeatureIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatureIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrgId() != null) {
            _hashCode += getOrgId().hashCode();
        }
        if (getOrgName() != null) {
            _hashCode += getOrgName().hashCode();
        }
        if (getEnterpriseId() != null) {
            _hashCode += getEnterpriseId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CloneSuspect.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "cloneSuspect"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "hostClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "WSDeviceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "hostAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "serverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemActivationIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "lineItemActivationIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", ">cloneSuspect>lineItemActivationIds"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureIds"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "orgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "orgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enterpriseId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "enterpriseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
