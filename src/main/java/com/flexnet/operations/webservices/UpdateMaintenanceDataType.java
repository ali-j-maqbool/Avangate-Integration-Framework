/**
 * UpdateMaintenanceDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UpdateMaintenanceDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.MaintenanceIdentifierType maintenanceIdentifier;

    private java.lang.String name;

    private java.lang.String version;

    private java.lang.String description;

    private java.lang.Boolean allowUpgrades;

    private java.lang.Boolean allowUpsells;

    private java.lang.Boolean allowRenewals;

    private com.flexnet.operations.webservices.UpdatePartNumbersSimpleListType partNumbers;

    public UpdateMaintenanceDataType() {
    }

    public UpdateMaintenanceDataType(
           com.flexnet.operations.webservices.MaintenanceIdentifierType maintenanceIdentifier,
           java.lang.String name,
           java.lang.String version,
           java.lang.String description,
           java.lang.Boolean allowUpgrades,
           java.lang.Boolean allowUpsells,
           java.lang.Boolean allowRenewals,
           com.flexnet.operations.webservices.UpdatePartNumbersSimpleListType partNumbers) {
           this.maintenanceIdentifier = maintenanceIdentifier;
           this.name = name;
           this.version = version;
           this.description = description;
           this.allowUpgrades = allowUpgrades;
           this.allowUpsells = allowUpsells;
           this.allowRenewals = allowRenewals;
           this.partNumbers = partNumbers;
    }


    /**
     * Gets the maintenanceIdentifier value for this UpdateMaintenanceDataType.
     * 
     * @return maintenanceIdentifier
     */
    public com.flexnet.operations.webservices.MaintenanceIdentifierType getMaintenanceIdentifier() {
        return maintenanceIdentifier;
    }


    /**
     * Sets the maintenanceIdentifier value for this UpdateMaintenanceDataType.
     * 
     * @param maintenanceIdentifier
     */
    public void setMaintenanceIdentifier(com.flexnet.operations.webservices.MaintenanceIdentifierType maintenanceIdentifier) {
        this.maintenanceIdentifier = maintenanceIdentifier;
    }


    /**
     * Gets the name value for this UpdateMaintenanceDataType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UpdateMaintenanceDataType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the version value for this UpdateMaintenanceDataType.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this UpdateMaintenanceDataType.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the description value for this UpdateMaintenanceDataType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UpdateMaintenanceDataType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the allowUpgrades value for this UpdateMaintenanceDataType.
     * 
     * @return allowUpgrades
     */
    public java.lang.Boolean getAllowUpgrades() {
        return allowUpgrades;
    }


    /**
     * Sets the allowUpgrades value for this UpdateMaintenanceDataType.
     * 
     * @param allowUpgrades
     */
    public void setAllowUpgrades(java.lang.Boolean allowUpgrades) {
        this.allowUpgrades = allowUpgrades;
    }


    /**
     * Gets the allowUpsells value for this UpdateMaintenanceDataType.
     * 
     * @return allowUpsells
     */
    public java.lang.Boolean getAllowUpsells() {
        return allowUpsells;
    }


    /**
     * Sets the allowUpsells value for this UpdateMaintenanceDataType.
     * 
     * @param allowUpsells
     */
    public void setAllowUpsells(java.lang.Boolean allowUpsells) {
        this.allowUpsells = allowUpsells;
    }


    /**
     * Gets the allowRenewals value for this UpdateMaintenanceDataType.
     * 
     * @return allowRenewals
     */
    public java.lang.Boolean getAllowRenewals() {
        return allowRenewals;
    }


    /**
     * Sets the allowRenewals value for this UpdateMaintenanceDataType.
     * 
     * @param allowRenewals
     */
    public void setAllowRenewals(java.lang.Boolean allowRenewals) {
        this.allowRenewals = allowRenewals;
    }


    /**
     * Gets the partNumbers value for this UpdateMaintenanceDataType.
     * 
     * @return partNumbers
     */
    public com.flexnet.operations.webservices.UpdatePartNumbersSimpleListType getPartNumbers() {
        return partNumbers;
    }


    /**
     * Sets the partNumbers value for this UpdateMaintenanceDataType.
     * 
     * @param partNumbers
     */
    public void setPartNumbers(com.flexnet.operations.webservices.UpdatePartNumbersSimpleListType partNumbers) {
        this.partNumbers = partNumbers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateMaintenanceDataType)) return false;
        UpdateMaintenanceDataType other = (UpdateMaintenanceDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maintenanceIdentifier==null && other.getMaintenanceIdentifier()==null) || 
             (this.maintenanceIdentifier!=null &&
              this.maintenanceIdentifier.equals(other.getMaintenanceIdentifier()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
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
        if (getMaintenanceIdentifier() != null) {
            _hashCode += getMaintenanceIdentifier().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateMaintenanceDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateMaintenanceDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updatePartNumbersSimpleListType"));
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
