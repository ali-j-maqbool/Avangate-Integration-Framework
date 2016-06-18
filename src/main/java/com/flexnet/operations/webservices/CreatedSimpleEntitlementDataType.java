/**
 * CreatedSimpleEntitlementDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreatedSimpleEntitlementDataType  implements java.io.Serializable {
    private java.lang.String recordRefNo;

    private java.lang.String uniqueId;

    private java.lang.String entitlementId;

    private java.lang.String[] lineItemUniqueIds;

    private java.lang.String[] maintenanceLineItemUniqueIds;

    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] lineItemIdentifiers;

    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] maintenanceLineItemIdentifiers;

    public CreatedSimpleEntitlementDataType() {
    }

    public CreatedSimpleEntitlementDataType(
           java.lang.String recordRefNo,
           java.lang.String uniqueId,
           java.lang.String entitlementId,
           java.lang.String[] lineItemUniqueIds,
           java.lang.String[] maintenanceLineItemUniqueIds,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] lineItemIdentifiers,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] maintenanceLineItemIdentifiers) {
           this.recordRefNo = recordRefNo;
           this.uniqueId = uniqueId;
           this.entitlementId = entitlementId;
           this.lineItemUniqueIds = lineItemUniqueIds;
           this.maintenanceLineItemUniqueIds = maintenanceLineItemUniqueIds;
           this.lineItemIdentifiers = lineItemIdentifiers;
           this.maintenanceLineItemIdentifiers = maintenanceLineItemIdentifiers;
    }


    /**
     * Gets the recordRefNo value for this CreatedSimpleEntitlementDataType.
     * 
     * @return recordRefNo
     */
    public java.lang.String getRecordRefNo() {
        return recordRefNo;
    }


    /**
     * Sets the recordRefNo value for this CreatedSimpleEntitlementDataType.
     * 
     * @param recordRefNo
     */
    public void setRecordRefNo(java.lang.String recordRefNo) {
        this.recordRefNo = recordRefNo;
    }


    /**
     * Gets the uniqueId value for this CreatedSimpleEntitlementDataType.
     * 
     * @return uniqueId
     */
    public java.lang.String getUniqueId() {
        return uniqueId;
    }


    /**
     * Sets the uniqueId value for this CreatedSimpleEntitlementDataType.
     * 
     * @param uniqueId
     */
    public void setUniqueId(java.lang.String uniqueId) {
        this.uniqueId = uniqueId;
    }


    /**
     * Gets the entitlementId value for this CreatedSimpleEntitlementDataType.
     * 
     * @return entitlementId
     */
    public java.lang.String getEntitlementId() {
        return entitlementId;
    }


    /**
     * Sets the entitlementId value for this CreatedSimpleEntitlementDataType.
     * 
     * @param entitlementId
     */
    public void setEntitlementId(java.lang.String entitlementId) {
        this.entitlementId = entitlementId;
    }


    /**
     * Gets the lineItemUniqueIds value for this CreatedSimpleEntitlementDataType.
     * 
     * @return lineItemUniqueIds
     */
    public java.lang.String[] getLineItemUniqueIds() {
        return lineItemUniqueIds;
    }


    /**
     * Sets the lineItemUniqueIds value for this CreatedSimpleEntitlementDataType.
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
     * Gets the maintenanceLineItemUniqueIds value for this CreatedSimpleEntitlementDataType.
     * 
     * @return maintenanceLineItemUniqueIds
     */
    public java.lang.String[] getMaintenanceLineItemUniqueIds() {
        return maintenanceLineItemUniqueIds;
    }


    /**
     * Sets the maintenanceLineItemUniqueIds value for this CreatedSimpleEntitlementDataType.
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
     * Gets the lineItemIdentifiers value for this CreatedSimpleEntitlementDataType.
     * 
     * @return lineItemIdentifiers
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] getLineItemIdentifiers() {
        return lineItemIdentifiers;
    }


    /**
     * Sets the lineItemIdentifiers value for this CreatedSimpleEntitlementDataType.
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
     * Gets the maintenanceLineItemIdentifiers value for this CreatedSimpleEntitlementDataType.
     * 
     * @return maintenanceLineItemIdentifiers
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] getMaintenanceLineItemIdentifiers() {
        return maintenanceLineItemIdentifiers;
    }


    /**
     * Sets the maintenanceLineItemIdentifiers value for this CreatedSimpleEntitlementDataType.
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
        if (!(obj instanceof CreatedSimpleEntitlementDataType)) return false;
        CreatedSimpleEntitlementDataType other = (CreatedSimpleEntitlementDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recordRefNo==null && other.getRecordRefNo()==null) || 
             (this.recordRefNo!=null &&
              this.recordRefNo.equals(other.getRecordRefNo()))) &&
            ((this.uniqueId==null && other.getUniqueId()==null) || 
             (this.uniqueId!=null &&
              this.uniqueId.equals(other.getUniqueId()))) &&
            ((this.entitlementId==null && other.getEntitlementId()==null) || 
             (this.entitlementId!=null &&
              this.entitlementId.equals(other.getEntitlementId()))) &&
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
        if (getRecordRefNo() != null) {
            _hashCode += getRecordRefNo().hashCode();
        }
        if (getUniqueId() != null) {
            _hashCode += getUniqueId().hashCode();
        }
        if (getEntitlementId() != null) {
            _hashCode += getEntitlementId().hashCode();
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
        new org.apache.axis.description.TypeDesc(CreatedSimpleEntitlementDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdSimpleEntitlementDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "recordRefNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "uniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
