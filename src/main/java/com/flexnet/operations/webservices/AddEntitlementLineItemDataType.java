/**
 * AddEntitlementLineItemDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class AddEntitlementLineItemDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier;

    private com.flexnet.operations.webservices.CreateEntitlementLineItemDataType[] lineItems;

    private com.flexnet.operations.webservices.CreateMaintenanceLineItemDataType[] maintenanceLineItems;

    private java.lang.Boolean autoDeploy;

    public AddEntitlementLineItemDataType() {
    }

    public AddEntitlementLineItemDataType(
           com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier,
           com.flexnet.operations.webservices.CreateEntitlementLineItemDataType[] lineItems,
           com.flexnet.operations.webservices.CreateMaintenanceLineItemDataType[] maintenanceLineItems,
           java.lang.Boolean autoDeploy) {
           this.entitlementIdentifier = entitlementIdentifier;
           this.lineItems = lineItems;
           this.maintenanceLineItems = maintenanceLineItems;
           this.autoDeploy = autoDeploy;
    }


    /**
     * Gets the entitlementIdentifier value for this AddEntitlementLineItemDataType.
     * 
     * @return entitlementIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getEntitlementIdentifier() {
        return entitlementIdentifier;
    }


    /**
     * Sets the entitlementIdentifier value for this AddEntitlementLineItemDataType.
     * 
     * @param entitlementIdentifier
     */
    public void setEntitlementIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier) {
        this.entitlementIdentifier = entitlementIdentifier;
    }


    /**
     * Gets the lineItems value for this AddEntitlementLineItemDataType.
     * 
     * @return lineItems
     */
    public com.flexnet.operations.webservices.CreateEntitlementLineItemDataType[] getLineItems() {
        return lineItems;
    }


    /**
     * Sets the lineItems value for this AddEntitlementLineItemDataType.
     * 
     * @param lineItems
     */
    public void setLineItems(com.flexnet.operations.webservices.CreateEntitlementLineItemDataType[] lineItems) {
        this.lineItems = lineItems;
    }

    public com.flexnet.operations.webservices.CreateEntitlementLineItemDataType getLineItems(int i) {
        return this.lineItems[i];
    }

    public void setLineItems(int i, com.flexnet.operations.webservices.CreateEntitlementLineItemDataType _value) {
        this.lineItems[i] = _value;
    }


    /**
     * Gets the maintenanceLineItems value for this AddEntitlementLineItemDataType.
     * 
     * @return maintenanceLineItems
     */
    public com.flexnet.operations.webservices.CreateMaintenanceLineItemDataType[] getMaintenanceLineItems() {
        return maintenanceLineItems;
    }


    /**
     * Sets the maintenanceLineItems value for this AddEntitlementLineItemDataType.
     * 
     * @param maintenanceLineItems
     */
    public void setMaintenanceLineItems(com.flexnet.operations.webservices.CreateMaintenanceLineItemDataType[] maintenanceLineItems) {
        this.maintenanceLineItems = maintenanceLineItems;
    }

    public com.flexnet.operations.webservices.CreateMaintenanceLineItemDataType getMaintenanceLineItems(int i) {
        return this.maintenanceLineItems[i];
    }

    public void setMaintenanceLineItems(int i, com.flexnet.operations.webservices.CreateMaintenanceLineItemDataType _value) {
        this.maintenanceLineItems[i] = _value;
    }


    /**
     * Gets the autoDeploy value for this AddEntitlementLineItemDataType.
     * 
     * @return autoDeploy
     */
    public java.lang.Boolean getAutoDeploy() {
        return autoDeploy;
    }


    /**
     * Sets the autoDeploy value for this AddEntitlementLineItemDataType.
     * 
     * @param autoDeploy
     */
    public void setAutoDeploy(java.lang.Boolean autoDeploy) {
        this.autoDeploy = autoDeploy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddEntitlementLineItemDataType)) return false;
        AddEntitlementLineItemDataType other = (AddEntitlementLineItemDataType) obj;
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
            ((this.lineItems==null && other.getLineItems()==null) || 
             (this.lineItems!=null &&
              java.util.Arrays.equals(this.lineItems, other.getLineItems()))) &&
            ((this.maintenanceLineItems==null && other.getMaintenanceLineItems()==null) || 
             (this.maintenanceLineItems!=null &&
              java.util.Arrays.equals(this.maintenanceLineItems, other.getMaintenanceLineItems()))) &&
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
        if (getLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaintenanceLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaintenanceLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaintenanceLineItems(), i);
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
        new org.apache.axis.description.TypeDesc(AddEntitlementLineItemDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addEntitlementLineItemDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createEntitlementLineItemDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createMaintenanceLineItemDataType"));
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
