/**
 * MaintenanceQueryParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class MaintenanceQueryParametersType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.SimpleQueryType maintenanceName;

    private com.flexnet.operations.webservices.SimpleQueryType version;

    private com.flexnet.operations.webservices.SimpleQueryType description;

    private com.flexnet.operations.webservices.SimpleQueryType partNumber;

    private com.flexnet.operations.webservices.StateQueryType state;

    private com.flexnet.operations.webservices.DateQueryType creationDate;

    private com.flexnet.operations.webservices.DateQueryType lastModifiedDate;

    public MaintenanceQueryParametersType() {
    }

    public MaintenanceQueryParametersType(
           com.flexnet.operations.webservices.SimpleQueryType maintenanceName,
           com.flexnet.operations.webservices.SimpleQueryType version,
           com.flexnet.operations.webservices.SimpleQueryType description,
           com.flexnet.operations.webservices.SimpleQueryType partNumber,
           com.flexnet.operations.webservices.StateQueryType state,
           com.flexnet.operations.webservices.DateQueryType creationDate,
           com.flexnet.operations.webservices.DateQueryType lastModifiedDate) {
           this.maintenanceName = maintenanceName;
           this.version = version;
           this.description = description;
           this.partNumber = partNumber;
           this.state = state;
           this.creationDate = creationDate;
           this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the maintenanceName value for this MaintenanceQueryParametersType.
     * 
     * @return maintenanceName
     */
    public com.flexnet.operations.webservices.SimpleQueryType getMaintenanceName() {
        return maintenanceName;
    }


    /**
     * Sets the maintenanceName value for this MaintenanceQueryParametersType.
     * 
     * @param maintenanceName
     */
    public void setMaintenanceName(com.flexnet.operations.webservices.SimpleQueryType maintenanceName) {
        this.maintenanceName = maintenanceName;
    }


    /**
     * Gets the version value for this MaintenanceQueryParametersType.
     * 
     * @return version
     */
    public com.flexnet.operations.webservices.SimpleQueryType getVersion() {
        return version;
    }


    /**
     * Sets the version value for this MaintenanceQueryParametersType.
     * 
     * @param version
     */
    public void setVersion(com.flexnet.operations.webservices.SimpleQueryType version) {
        this.version = version;
    }


    /**
     * Gets the description value for this MaintenanceQueryParametersType.
     * 
     * @return description
     */
    public com.flexnet.operations.webservices.SimpleQueryType getDescription() {
        return description;
    }


    /**
     * Sets the description value for this MaintenanceQueryParametersType.
     * 
     * @param description
     */
    public void setDescription(com.flexnet.operations.webservices.SimpleQueryType description) {
        this.description = description;
    }


    /**
     * Gets the partNumber value for this MaintenanceQueryParametersType.
     * 
     * @return partNumber
     */
    public com.flexnet.operations.webservices.SimpleQueryType getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this MaintenanceQueryParametersType.
     * 
     * @param partNumber
     */
    public void setPartNumber(com.flexnet.operations.webservices.SimpleQueryType partNumber) {
        this.partNumber = partNumber;
    }


    /**
     * Gets the state value for this MaintenanceQueryParametersType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.StateQueryType getState() {
        return state;
    }


    /**
     * Sets the state value for this MaintenanceQueryParametersType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.StateQueryType state) {
        this.state = state;
    }


    /**
     * Gets the creationDate value for this MaintenanceQueryParametersType.
     * 
     * @return creationDate
     */
    public com.flexnet.operations.webservices.DateQueryType getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this MaintenanceQueryParametersType.
     * 
     * @param creationDate
     */
    public void setCreationDate(com.flexnet.operations.webservices.DateQueryType creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the lastModifiedDate value for this MaintenanceQueryParametersType.
     * 
     * @return lastModifiedDate
     */
    public com.flexnet.operations.webservices.DateQueryType getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this MaintenanceQueryParametersType.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.flexnet.operations.webservices.DateQueryType lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaintenanceQueryParametersType)) return false;
        MaintenanceQueryParametersType other = (MaintenanceQueryParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maintenanceName==null && other.getMaintenanceName()==null) || 
             (this.maintenanceName!=null &&
              this.maintenanceName.equals(other.getMaintenanceName()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.partNumber==null && other.getPartNumber()==null) || 
             (this.partNumber!=null &&
              this.partNumber.equals(other.getPartNumber()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate())));
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
        if (getMaintenanceName() != null) {
            _hashCode += getMaintenanceName().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPartNumber() != null) {
            _hashCode += getPartNumber().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MaintenanceQueryParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceQueryParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType"));
        elemField.setMinOccurs(0);
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
