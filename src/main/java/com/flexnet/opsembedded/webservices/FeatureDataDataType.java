/**
 * FeatureDataDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class FeatureDataDataType  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String version;

    private java.math.BigInteger count;

    private java.math.BigInteger overage;

    private java.util.Calendar expiration;

    private java.lang.String lineItemUniqueId;

    private java.lang.String lineItemActivationId;

    public FeatureDataDataType() {
    }

    public FeatureDataDataType(
           java.lang.String name,
           java.lang.String version,
           java.math.BigInteger count,
           java.math.BigInteger overage,
           java.util.Calendar expiration,
           java.lang.String lineItemUniqueId,
           java.lang.String lineItemActivationId) {
           this.name = name;
           this.version = version;
           this.count = count;
           this.overage = overage;
           this.expiration = expiration;
           this.lineItemUniqueId = lineItemUniqueId;
           this.lineItemActivationId = lineItemActivationId;
    }


    /**
     * Gets the name value for this FeatureDataDataType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this FeatureDataDataType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the version value for this FeatureDataDataType.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this FeatureDataDataType.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the count value for this FeatureDataDataType.
     * 
     * @return count
     */
    public java.math.BigInteger getCount() {
        return count;
    }


    /**
     * Sets the count value for this FeatureDataDataType.
     * 
     * @param count
     */
    public void setCount(java.math.BigInteger count) {
        this.count = count;
    }


    /**
     * Gets the overage value for this FeatureDataDataType.
     * 
     * @return overage
     */
    public java.math.BigInteger getOverage() {
        return overage;
    }


    /**
     * Sets the overage value for this FeatureDataDataType.
     * 
     * @param overage
     */
    public void setOverage(java.math.BigInteger overage) {
        this.overage = overage;
    }


    /**
     * Gets the expiration value for this FeatureDataDataType.
     * 
     * @return expiration
     */
    public java.util.Calendar getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this FeatureDataDataType.
     * 
     * @param expiration
     */
    public void setExpiration(java.util.Calendar expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the lineItemUniqueId value for this FeatureDataDataType.
     * 
     * @return lineItemUniqueId
     */
    public java.lang.String getLineItemUniqueId() {
        return lineItemUniqueId;
    }


    /**
     * Sets the lineItemUniqueId value for this FeatureDataDataType.
     * 
     * @param lineItemUniqueId
     */
    public void setLineItemUniqueId(java.lang.String lineItemUniqueId) {
        this.lineItemUniqueId = lineItemUniqueId;
    }


    /**
     * Gets the lineItemActivationId value for this FeatureDataDataType.
     * 
     * @return lineItemActivationId
     */
    public java.lang.String getLineItemActivationId() {
        return lineItemActivationId;
    }


    /**
     * Sets the lineItemActivationId value for this FeatureDataDataType.
     * 
     * @param lineItemActivationId
     */
    public void setLineItemActivationId(java.lang.String lineItemActivationId) {
        this.lineItemActivationId = lineItemActivationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureDataDataType)) return false;
        FeatureDataDataType other = (FeatureDataDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.overage==null && other.getOverage()==null) || 
             (this.overage!=null &&
              this.overage.equals(other.getOverage()))) &&
            ((this.expiration==null && other.getExpiration()==null) || 
             (this.expiration!=null &&
              this.expiration.equals(other.getExpiration()))) &&
            ((this.lineItemUniqueId==null && other.getLineItemUniqueId()==null) || 
             (this.lineItemUniqueId!=null &&
              this.lineItemUniqueId.equals(other.getLineItemUniqueId()))) &&
            ((this.lineItemActivationId==null && other.getLineItemActivationId()==null) || 
             (this.lineItemActivationId!=null &&
              this.lineItemActivationId.equals(other.getLineItemActivationId())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getOverage() != null) {
            _hashCode += getOverage().hashCode();
        }
        if (getExpiration() != null) {
            _hashCode += getExpiration().hashCode();
        }
        if (getLineItemUniqueId() != null) {
            _hashCode += getLineItemUniqueId().hashCode();
        }
        if (getLineItemActivationId() != null) {
            _hashCode += getLineItemActivationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureDataDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureDataDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "overage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemUniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "lineItemUniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemActivationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "lineItemActivationId"));
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
