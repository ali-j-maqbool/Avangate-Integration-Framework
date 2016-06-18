/**
 * MaintenanceQueryDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class MaintenanceQueryDataType  implements java.io.Serializable {
    private java.lang.String uniqueId;

    private java.lang.String maintenanceName;

    private java.lang.String version;

    private java.lang.String description;

    private com.flexnet.operations.webservices.StateType state;

    private java.lang.Boolean allowUpgrades;

    private java.lang.Boolean allowUpsells;

    private java.lang.Boolean allowRenewals;

    private com.flexnet.operations.webservices.PartNumbersSimpleListType partNumbers;

    public MaintenanceQueryDataType() {
    }

    public MaintenanceQueryDataType(
           java.lang.String uniqueId,
           java.lang.String maintenanceName,
           java.lang.String version,
           java.lang.String description,
           com.flexnet.operations.webservices.StateType state,
           java.lang.Boolean allowUpgrades,
           java.lang.Boolean allowUpsells,
           java.lang.Boolean allowRenewals,
           com.flexnet.operations.webservices.PartNumbersSimpleListType partNumbers) {
           this.uniqueId = uniqueId;
           this.maintenanceName = maintenanceName;
           this.version = version;
           this.description = description;
           this.state = state;
           this.allowUpgrades = allowUpgrades;
           this.allowUpsells = allowUpsells;
           this.allowRenewals = allowRenewals;
           this.partNumbers = partNumbers;
    }


    /**
     * Gets the uniqueId value for this MaintenanceQueryDataType.
     * 
     * @return uniqueId
     */
    public java.lang.String getUniqueId() {
        return uniqueId;
    }


    /**
     * Sets the uniqueId value for this MaintenanceQueryDataType.
     * 
     * @param uniqueId
     */
    public void setUniqueId(java.lang.String uniqueId) {
        this.uniqueId = uniqueId;
    }


    /**
     * Gets the maintenanceName value for this MaintenanceQueryDataType.
     * 
     * @return maintenanceName
     */
    public java.lang.String getMaintenanceName() {
        return maintenanceName;
    }


    /**
     * Sets the maintenanceName value for this MaintenanceQueryDataType.
     * 
     * @param maintenanceName
     */
    public void setMaintenanceName(java.lang.String maintenanceName) {
        this.maintenanceName = maintenanceName;
    }


    /**
     * Gets the version value for this MaintenanceQueryDataType.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this MaintenanceQueryDataType.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the description value for this MaintenanceQueryDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this MaintenanceQueryDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the state value for this MaintenanceQueryDataType.
     * 
     * @return state
     */
    public com.flexnet.operations.webservices.StateType getState() {
        return state;
    }


    /**
     * Sets the state value for this MaintenanceQueryDataType.
     * 
     * @param state
     */
    public void setState(com.flexnet.operations.webservices.StateType state) {
        this.state = state;
    }


    /**
     * Gets the allowUpgrades value for this MaintenanceQueryDataType.
     * 
     * @return allowUpgrades
     */
    public java.lang.Boolean getAllowUpgrades() {
        return allowUpgrades;
    }


    /**
     * Sets the allowUpgrades value for this MaintenanceQueryDataType.
     * 
     * @param allowUpgrades
     */
    public void setAllowUpgrades(java.lang.Boolean allowUpgrades) {
        this.allowUpgrades = allowUpgrades;
    }


    /**
     * Gets the allowUpsells value for this MaintenanceQueryDataType.
     * 
     * @return allowUpsells
     */
    public java.lang.Boolean getAllowUpsells() {
        return allowUpsells;
    }


    /**
     * Sets the allowUpsells value for this MaintenanceQueryDataType.
     * 
     * @param allowUpsells
     */
    public void setAllowUpsells(java.lang.Boolean allowUpsells) {
        this.allowUpsells = allowUpsells;
    }


    /**
     * Gets the allowRenewals value for this MaintenanceQueryDataType.
     * 
     * @return allowRenewals
     */
    public java.lang.Boolean getAllowRenewals() {
        return allowRenewals;
    }


    /**
     * Sets the allowRenewals value for this MaintenanceQueryDataType.
     * 
     * @param allowRenewals
     */
    public void setAllowRenewals(java.lang.Boolean allowRenewals) {
        this.allowRenewals = allowRenewals;
    }


    /**
     * Gets the partNumbers value for this MaintenanceQueryDataType.
     * 
     * @return partNumbers
     */
    public com.flexnet.operations.webservices.PartNumbersSimpleListType getPartNumbers() {
        return partNumbers;
    }


    /**
     * Sets the partNumbers value for this MaintenanceQueryDataType.
     * 
     * @param partNumbers
     */
    public void setPartNumbers(com.flexnet.operations.webservices.PartNumbersSimpleListType partNumbers) {
        this.partNumbers = partNumbers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaintenanceQueryDataType)) return false;
        MaintenanceQueryDataType other = (MaintenanceQueryDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uniqueId==null && other.getUniqueId()==null) || 
             (this.uniqueId!=null &&
              this.uniqueId.equals(other.getUniqueId()))) &&
            ((this.maintenanceName==null && other.getMaintenanceName()==null) || 
             (this.maintenanceName!=null &&
              this.maintenanceName.equals(other.getMaintenanceName()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.allowUpgrades==null && other.getAllowUpgrades()==null) || 
             (this.allowUpgrades!=null &&
              this.allowUpgrades.equals(other.getAllowUpgrades()))) &&
            ((this.allowUpsells==null && other.getAllowUpsells()==null) || 
             (this.allowUpsells!=null &&
              this.allowUpsells.equals(other.getAllowUpsells()))) &&
            ((this.allowRenewals==null && other.getAllowRenewals()==null) || 
             (this.allowRenewals!=null &&
              this.allowRenewals.equals(other.getAllowRenewals()))) &&
            ((this.partNumbers==null && other.getPartNumbers()==null) || 
             (this.partNumbers!=null &&
              this.partNumbers.equals(other.getPartNumbers())));
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
        if (getUniqueId() != null) {
            _hashCode += getUniqueId().hashCode();
        }
        if (getMaintenanceName() != null) {
            _hashCode += getMaintenanceName().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getAllowUpgrades() != null) {
            _hashCode += getAllowUpgrades().hashCode();
        }
        if (getAllowUpsells() != null) {
            _hashCode += getAllowUpsells().hashCode();
        }
        if (getAllowRenewals() != null) {
            _hashCode += getAllowRenewals().hashCode();
        }
        if (getPartNumbers() != null) {
            _hashCode += getPartNumbers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MaintenanceQueryDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceQueryDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "uniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowUpgrades");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "allowUpgrades"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowUpsells");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "allowUpsells"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowRenewals");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "allowRenewals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumbersSimpleListType"));
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
