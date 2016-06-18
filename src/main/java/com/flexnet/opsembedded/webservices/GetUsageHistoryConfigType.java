/**
 * GetUsageHistoryConfigType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GetUsageHistoryConfigType  implements java.io.Serializable {
    private java.lang.Boolean server;

    private java.lang.Boolean features;

    private java.lang.Boolean machineType;

    private java.lang.Boolean vmDetails;

    private java.lang.Boolean vmInfo;

    private java.lang.Boolean vendorDictionary;

    public GetUsageHistoryConfigType() {
    }

    public GetUsageHistoryConfigType(
           java.lang.Boolean server,
           java.lang.Boolean features,
           java.lang.Boolean machineType,
           java.lang.Boolean vmDetails,
           java.lang.Boolean vmInfo,
           java.lang.Boolean vendorDictionary) {
           this.server = server;
           this.features = features;
           this.machineType = machineType;
           this.vmDetails = vmDetails;
           this.vmInfo = vmInfo;
           this.vendorDictionary = vendorDictionary;
    }


    /**
     * Gets the server value for this GetUsageHistoryConfigType.
     * 
     * @return server
     */
    public java.lang.Boolean getServer() {
        return server;
    }


    /**
     * Sets the server value for this GetUsageHistoryConfigType.
     * 
     * @param server
     */
    public void setServer(java.lang.Boolean server) {
        this.server = server;
    }


    /**
     * Gets the features value for this GetUsageHistoryConfigType.
     * 
     * @return features
     */
    public java.lang.Boolean getFeatures() {
        return features;
    }


    /**
     * Sets the features value for this GetUsageHistoryConfigType.
     * 
     * @param features
     */
    public void setFeatures(java.lang.Boolean features) {
        this.features = features;
    }


    /**
     * Gets the machineType value for this GetUsageHistoryConfigType.
     * 
     * @return machineType
     */
    public java.lang.Boolean getMachineType() {
        return machineType;
    }


    /**
     * Sets the machineType value for this GetUsageHistoryConfigType.
     * 
     * @param machineType
     */
    public void setMachineType(java.lang.Boolean machineType) {
        this.machineType = machineType;
    }


    /**
     * Gets the vmDetails value for this GetUsageHistoryConfigType.
     * 
     * @return vmDetails
     */
    public java.lang.Boolean getVmDetails() {
        return vmDetails;
    }


    /**
     * Sets the vmDetails value for this GetUsageHistoryConfigType.
     * 
     * @param vmDetails
     */
    public void setVmDetails(java.lang.Boolean vmDetails) {
        this.vmDetails = vmDetails;
    }


    /**
     * Gets the vmInfo value for this GetUsageHistoryConfigType.
     * 
     * @return vmInfo
     */
    public java.lang.Boolean getVmInfo() {
        return vmInfo;
    }


    /**
     * Sets the vmInfo value for this GetUsageHistoryConfigType.
     * 
     * @param vmInfo
     */
    public void setVmInfo(java.lang.Boolean vmInfo) {
        this.vmInfo = vmInfo;
    }


    /**
     * Gets the vendorDictionary value for this GetUsageHistoryConfigType.
     * 
     * @return vendorDictionary
     */
    public java.lang.Boolean getVendorDictionary() {
        return vendorDictionary;
    }


    /**
     * Sets the vendorDictionary value for this GetUsageHistoryConfigType.
     * 
     * @param vendorDictionary
     */
    public void setVendorDictionary(java.lang.Boolean vendorDictionary) {
        this.vendorDictionary = vendorDictionary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUsageHistoryConfigType)) return false;
        GetUsageHistoryConfigType other = (GetUsageHistoryConfigType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.server==null && other.getServer()==null) || 
             (this.server!=null &&
              this.server.equals(other.getServer()))) &&
            ((this.features==null && other.getFeatures()==null) || 
             (this.features!=null &&
              this.features.equals(other.getFeatures()))) &&
            ((this.machineType==null && other.getMachineType()==null) || 
             (this.machineType!=null &&
              this.machineType.equals(other.getMachineType()))) &&
            ((this.vmDetails==null && other.getVmDetails()==null) || 
             (this.vmDetails!=null &&
              this.vmDetails.equals(other.getVmDetails()))) &&
            ((this.vmInfo==null && other.getVmInfo()==null) || 
             (this.vmInfo!=null &&
              this.vmInfo.equals(other.getVmInfo()))) &&
            ((this.vendorDictionary==null && other.getVendorDictionary()==null) || 
             (this.vendorDictionary!=null &&
              this.vendorDictionary.equals(other.getVendorDictionary())));
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
        if (getServer() != null) {
            _hashCode += getServer().hashCode();
        }
        if (getFeatures() != null) {
            _hashCode += getFeatures().hashCode();
        }
        if (getMachineType() != null) {
            _hashCode += getMachineType().hashCode();
        }
        if (getVmDetails() != null) {
            _hashCode += getVmDetails().hashCode();
        }
        if (getVmInfo() != null) {
            _hashCode += getVmInfo().hashCode();
        }
        if (getVendorDictionary() != null) {
            _hashCode += getVendorDictionary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUsageHistoryConfigType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageHistoryConfigType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("features");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "features"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "machineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "vmDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "vmInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorDictionary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "vendorDictionary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
