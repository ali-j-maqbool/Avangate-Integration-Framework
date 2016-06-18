/**
 * AddedEntitlementLineItemDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class AddedEntitlementLineItemDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier;

    private java.lang.String[] lineItemUniqueIds;

    private java.lang.String[] maintenanceLineItemUniqueIds;

    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] lineItemIdentifiers;

    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] maintenanceLineItemIdentifiers;

    public AddedEntitlementLineItemDataType() {
    }

    public AddedEntitlementLineItemDataType(
           com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier,
           java.lang.String[] lineItemUniqueIds,
           java.lang.String[] maintenanceLineItemUniqueIds,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] lineItemIdentifiers,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] maintenanceLineItemIdentifiers) {
           this.entitlementIdentifier = entitlementIdentifier;
           this.lineItemUniqueIds = lineItemUniqueIds;
           this.maintenanceLineItemUniqueIds = maintenanceLineItemUniqueIds;
           this.lineItemIdentifiers = lineItemIdentifiers;
           this.maintenanceLineItemIdentifiers = maintenanceLineItemIdentifiers;
    }


    /**
     * Gets the entitlementIdentifier value for this AddedEntitlementLineItemDataType.
     * 
     * @return entitlementIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getEntitlementIdentifier() {
        return entitlementIdentifier;
    }


    /**
     * Sets the entitlementIdentifier value for this AddedEntitlementLineItemDataType.
     * 
     * @param entitlementIdentifier
     */
    public void setEntitlementIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier) {
        this.entitlementIdentifier = entitlementIdentifier;
    }


    /**
     * Gets the lineItemUniqueIds value for this AddedEntitlementLineItemDataType.
     * 
     * @return lineItemUniqueIds
     */
    public java.lang.String[] getLineItemUniqueIds() {
        return lineItemUniqueIds;
    }


    /**
     * Sets the lineItemUniqueIds value for this AddedEntitlementLineItemDataType.
     * 
     * @param lineItemUniqueIds
     */
    public void setLineItemUniqueIds(java.lang.String[] lineItemUniqueIds) {
        this.lineItemUniqueIds = lineItemUniqueIds;
    }

    public java.lang.String getLineItemUniqueIds(int i) {
        return this.lineItemUniqueIds[i];
    }

    public void setLineItemUniqueIds(int i, java.lang.String _value) {
        this.lineItemUniqueIds[i] = _value;
    }


    /**
     * Gets the maintenanceLineItemUniqueIds value for this AddedEntitlementLineItemDataType.
     * 
     * @return maintenanceLineItemUniqueIds
     */
    public java.lang.String[] getMaintenanceLineItemUniqueIds() {
        return maintenanceLineItemUniqueIds;
    }


    /**
     * Sets the maintenanceLineItemUniqueIds value for this AddedEntitlementLineItemDataType.
     * 
     * @param maintenanceLineItemUniqueIds
     */
    public void setMaintenanceLineItemUniqueIds(java.lang.String[] maintenanceLineItemUniqueIds) {
        this.maintenanceLineItemUniqueIds = maintenanceLineItemUniqueIds;
    }

    public java.lang.String getMaintenanceLineItemUniqueIds(int i) {
        return this.maintenanceLineItemUniqueIds[i];
    }

    public void setMaintenanceLineItemUniqueIds(int i, java.lang.String _value) {
        this.maintenanceLineItemUniqueIds[i] = _value;
    }


    /**
     * Gets the lineItemIdentifiers value for this AddedEntitlementLineItemDataType.
     * 
     * @return lineItemIdentifiers
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] getLineItemIdentifiers() {
        return lineItemIdentifiers;
    }


    /**
     * Sets the lineItemIdentifiers value for this AddedEntitlementLineItemDataType.
     * 
     * @param lineItemIdentifiers
     */
    public void setLineItemIdentifiers(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] lineItemIdentifiers) {
        this.lineItemIdentifiers = lineItemIdentifiers;
    }

    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getLineItemIdentifiers(int i) {
        return this.lineItemIdentifiers[i];
    }

    public void setLineItemIdentifiers(int i, com.flexnet.operations.webservices.EntitlementLineItemIdentifierType _value) {
        this.lineItemIdentifiers[i] = _value;
    }


    /**
     * Gets the maintenanceLineItemIdentifiers value for this AddedEntitlementLineItemDataType.
     * 
     * @return maintenanceLineItemIdentifiers
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] getMaintenanceLineItemIdentifiers() {
        return maintenanceLineItemIdentifiers;
    }


    /**
     * Sets the maintenanceLineItemIdentifiers value for this AddedEntitlementLineItemDataType.
     * 
     * @param maintenanceLineItemIdentifiers
     */
    public void setMaintenanceLineItemIdentifiers(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] maintenanceLineItemIdentifiers) {
        this.maintenanceLineItemIdentifiers = maintenanceLineItemIdentifiers;
    }

    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getMaintenanceLineItemIdentifiers(int i) {
        return this.maintenanceLineItemIdentifiers[i];
    }

    public void setMaintenanceLineItemIdentifiers(int i, com.flexnet.operations.webservices.EntitlementLineItemIdentifierType _value) {
        this.maintenanceLineItemIdentifiers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddedEntitlementLineItemDataType)) return false;
        AddedEntitlementLineItemDataType other = (AddedEntitlementLineItemDataType) obj;
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
            ((this.lineItemUniqueIds==null && other.getLineItemUniqueIds()==null) || 
             (this.lineItemUniqueIds!=null &&
              java.util.Arrays.equals(this.lineItemUniqueIds, other.getLineItemUniqueIds()))) &&
            ((this.maintenanceLineItemUniqueIds==null && other.getMaintenanceLineItemUniqueIds()==null) || 
             (this.maintenanceLineItemUniqueIds!=null &&
              java.util.Arrays.equals(this.maintenanceLineItemUniqueIds, other.getMaintenanceLineItemUniqueIds()))) &&
            ((this.lineItemIdentifiers==null && other.getLineItemIdentifiers()==null) || 
             (this.lineItemIdentifiers!=null &&
              java.util.Arrays.equals(this.lineItemIdentifiers, other.getLineItemIdentifiers()))) &&
            ((this.maintenanceLineItemIdentifiers==null && other.getMaintenanceLineItemIdentifiers()==null) || 
             (this.maintenanceLineItemIdentifiers!=null &&
              java.util.Arrays.equals(this.maintenanceLineItemIdentifiers, other.getMaintenanceLineItemIdentifiers())));
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
        if (getLineItemUniqueIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItemUniqueIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItemUniqueIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaintenanceLineItemUniqueIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaintenanceLineItemUniqueIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaintenanceLineItemUniqueIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineItemIdentifiers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItemIdentifiers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItemIdentifiers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaintenanceLineItemIdentifiers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaintenanceLineItemIdentifiers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaintenanceLineItemIdentifiers(), i);
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
        new org.apache.axis.description.TypeDesc(AddedEntitlementLineItemDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addedEntitlementLineItemDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemUniqueIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemUniqueIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceLineItemUniqueIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItemUniqueIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemIdentifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemIdentifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceLineItemIdentifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItemIdentifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
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
