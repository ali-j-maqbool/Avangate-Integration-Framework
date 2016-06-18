/**
 * UpdateEntitlementLineItemDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UpdateEntitlementLineItemDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier;

    private com.flexnet.operations.webservices.UpdateLineItemDataType[] lineItemData;

    private com.flexnet.operations.webservices.UpdateMaintenanceLineItemDataType[] maintenanceLineItemData;

    private java.lang.Boolean autoDeploy;

    public UpdateEntitlementLineItemDataType() {
    }

    public UpdateEntitlementLineItemDataType(
           com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier,
           com.flexnet.operations.webservices.UpdateLineItemDataType[] lineItemData,
           com.flexnet.operations.webservices.UpdateMaintenanceLineItemDataType[] maintenanceLineItemData,
           java.lang.Boolean autoDeploy) {
           this.entitlementIdentifier = entitlementIdentifier;
           this.lineItemData = lineItemData;
           this.maintenanceLineItemData = maintenanceLineItemData;
           this.autoDeploy = autoDeploy;
    }


    /**
     * Gets the entitlementIdentifier value for this UpdateEntitlementLineItemDataType.
     * 
     * @return entitlementIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getEntitlementIdentifier() {
        return entitlementIdentifier;
    }


    /**
     * Sets the entitlementIdentifier value for this UpdateEntitlementLineItemDataType.
     * 
     * @param entitlementIdentifier
     */
    public void setEntitlementIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier) {
        this.entitlementIdentifier = entitlementIdentifier;
    }


    /**
     * Gets the lineItemData value for this UpdateEntitlementLineItemDataType.
     * 
     * @return lineItemData
     */
    public com.flexnet.operations.webservices.UpdateLineItemDataType[] getLineItemData() {
        return lineItemData;
    }


    /**
     * Sets the lineItemData value for this UpdateEntitlementLineItemDataType.
     * 
     * @param lineItemData
     */
    public void setLineItemData(com.flexnet.operations.webservices.UpdateLineItemDataType[] lineItemData) {
        this.lineItemData = lineItemData;
    }

    public com.flexnet.operations.webservices.UpdateLineItemDataType getLineItemData(int i) {
        return this.lineItemData[i];
    }

    public void setLineItemData(int i, com.flexnet.operations.webservices.UpdateLineItemDataType _value) {
        this.lineItemData[i] = _value;
    }


    /**
     * Gets the maintenanceLineItemData value for this UpdateEntitlementLineItemDataType.
     * 
     * @return maintenanceLineItemData
     */
    public com.flexnet.operations.webservices.UpdateMaintenanceLineItemDataType[] getMaintenanceLineItemData() {
        return maintenanceLineItemData;
    }


    /**
     * Sets the maintenanceLineItemData value for this UpdateEntitlementLineItemDataType.
     * 
     * @param maintenanceLineItemData
     */
    public void setMaintenanceLineItemData(com.flexnet.operations.webservices.UpdateMaintenanceLineItemDataType[] maintenanceLineItemData) {
        this.maintenanceLineItemData = maintenanceLineItemData;
    }

    public com.flexnet.operations.webservices.UpdateMaintenanceLineItemDataType getMaintenanceLineItemData(int i) {
        return this.maintenanceLineItemData[i];
    }

    public void setMaintenanceLineItemData(int i, com.flexnet.operations.webservices.UpdateMaintenanceLineItemDataType _value) {
        this.maintenanceLineItemData[i] = _value;
    }


    /**
     * Gets the autoDeploy value for this UpdateEntitlementLineItemDataType.
     * 
     * @return autoDeploy
     */
    public java.lang.Boolean getAutoDeploy() {
        return autoDeploy;
    }


    /**
     * Sets the autoDeploy value for this UpdateEntitlementLineItemDataType.
     * 
     * @param autoDeploy
     */
    public void setAutoDeploy(java.lang.Boolean autoDeploy) {
        this.autoDeploy = autoDeploy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateEntitlementLineItemDataType)) return false;
        UpdateEntitlementLineItemDataType other = (UpdateEntitlementLineItemDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitlementIdentifier==null && other.getEntitlementIdentifier()==null) || 
             (this.entitlementIdentifier!=null &&
              this.entitlementIdentifier.equals(other.getEntitlementIdentifier()))) &&
            ((this.lineItemData==null && other.getLineItemData()==null) || 
             (this.lineItemData!=null &&
              java.util.Arrays.equals(this.lineItemData, other.getLineItemData()))) &&
            ((this.maintenanceLineItemData==null && other.getMaintenanceLineItemData()==null) || 
             (this.maintenanceLineItemData!=null &&
              java.util.Arrays.equals(this.maintenanceLineItemData, other.getMaintenanceLineItemData()))) &&
            ((this.autoDeploy==null && other.getAutoDeploy()==null) || 
             (this.autoDeploy!=null &&
              this.autoDeploy.equals(other.getAutoDeploy())));
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
        if (getEntitlementIdentifier() != null) {
            _hashCode += getEntitlementIdentifier().hashCode();
        }
        if (getLineItemData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItemData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItemData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaintenanceLineItemData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaintenanceLineItemData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaintenanceLineItemData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutoDeploy() != null) {
            _hashCode += getAutoDeploy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateEntitlementLineItemDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateEntitlementLineItemDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateLineItemDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceLineItemData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItemData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateMaintenanceLineItemDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoDeploy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "autoDeploy"));
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
