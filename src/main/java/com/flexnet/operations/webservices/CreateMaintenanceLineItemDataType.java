/**
 * CreateMaintenanceLineItemDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreateMaintenanceLineItemDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.IdType activationId;

    private com.flexnet.operations.webservices.ProductIdentifierType maintenanceProduct;

    private com.flexnet.operations.webservices.PartNumberIdentifierType partNumber;

    private java.lang.String orderId;

    private java.lang.String orderLineNumber;

    private java.util.Date startDate;

    private java.util.Date expirationDate;

    private java.lang.Boolean isPermanent;

    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItem;

    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] associatedLineItems;

    public CreateMaintenanceLineItemDataType() {
    }

    public CreateMaintenanceLineItemDataType(
           com.flexnet.operations.webservices.IdType activationId,
           com.flexnet.operations.webservices.ProductIdentifierType maintenanceProduct,
           com.flexnet.operations.webservices.PartNumberIdentifierType partNumber,
           java.lang.String orderId,
           java.lang.String orderLineNumber,
           java.util.Date startDate,
           java.util.Date expirationDate,
           java.lang.Boolean isPermanent,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItem,
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] associatedLineItems) {
           this.activationId = activationId;
           this.maintenanceProduct = maintenanceProduct;
           this.partNumber = partNumber;
           this.orderId = orderId;
           this.orderLineNumber = orderLineNumber;
           this.startDate = startDate;
           this.expirationDate = expirationDate;
           this.isPermanent = isPermanent;
           this.parentLineItem = parentLineItem;
           this.associatedLineItems = associatedLineItems;
    }


    /**
     * Gets the activationId value for this CreateMaintenanceLineItemDataType.
     * 
     * @return activationId
     */
    public com.flexnet.operations.webservices.IdType getActivationId() {
        return activationId;
    }


    /**
     * Sets the activationId value for this CreateMaintenanceLineItemDataType.
     * 
     * @param activationId
     */
    public void setActivationId(com.flexnet.operations.webservices.IdType activationId) {
        this.activationId = activationId;
    }


    /**
     * Gets the maintenanceProduct value for this CreateMaintenanceLineItemDataType.
     * 
     * @return maintenanceProduct
     */
    public com.flexnet.operations.webservices.ProductIdentifierType getMaintenanceProduct() {
        return maintenanceProduct;
    }


    /**
     * Sets the maintenanceProduct value for this CreateMaintenanceLineItemDataType.
     * 
     * @param maintenanceProduct
     */
    public void setMaintenanceProduct(com.flexnet.operations.webservices.ProductIdentifierType maintenanceProduct) {
        this.maintenanceProduct = maintenanceProduct;
    }


    /**
     * Gets the partNumber value for this CreateMaintenanceLineItemDataType.
     * 
     * @return partNumber
     */
    public com.flexnet.operations.webservices.PartNumberIdentifierType getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this CreateMaintenanceLineItemDataType.
     * 
     * @param partNumber
     */
    public void setPartNumber(com.flexnet.operations.webservices.PartNumberIdentifierType partNumber) {
        this.partNumber = partNumber;
    }


    /**
     * Gets the orderId value for this CreateMaintenanceLineItemDataType.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this CreateMaintenanceLineItemDataType.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderLineNumber value for this CreateMaintenanceLineItemDataType.
     * 
     * @return orderLineNumber
     */
    public java.lang.String getOrderLineNumber() {
        return orderLineNumber;
    }


    /**
     * Sets the orderLineNumber value for this CreateMaintenanceLineItemDataType.
     * 
     * @param orderLineNumber
     */
    public void setOrderLineNumber(java.lang.String orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }


    /**
     * Gets the startDate value for this CreateMaintenanceLineItemDataType.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CreateMaintenanceLineItemDataType.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the expirationDate value for this CreateMaintenanceLineItemDataType.
     * 
     * @return expirationDate
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this CreateMaintenanceLineItemDataType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the isPermanent value for this CreateMaintenanceLineItemDataType.
     * 
     * @return isPermanent
     */
    public java.lang.Boolean getIsPermanent() {
        return isPermanent;
    }


    /**
     * Sets the isPermanent value for this CreateMaintenanceLineItemDataType.
     * 
     * @param isPermanent
     */
    public void setIsPermanent(java.lang.Boolean isPermanent) {
        this.isPermanent = isPermanent;
    }


    /**
     * Gets the parentLineItem value for this CreateMaintenanceLineItemDataType.
     * 
     * @return parentLineItem
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getParentLineItem() {
        return parentLineItem;
    }


    /**
     * Sets the parentLineItem value for this CreateMaintenanceLineItemDataType.
     * 
     * @param parentLineItem
     */
    public void setParentLineItem(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItem) {
        this.parentLineItem = parentLineItem;
    }


    /**
     * Gets the associatedLineItems value for this CreateMaintenanceLineItemDataType.
     * 
     * @return associatedLineItems
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] getAssociatedLineItems() {
        return associatedLineItems;
    }


    /**
     * Sets the associatedLineItems value for this CreateMaintenanceLineItemDataType.
     * 
     * @param associatedLineItems
     */
    public void setAssociatedLineItems(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType[] associatedLineItems) {
        this.associatedLineItems = associatedLineItems;
    }

    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getAssociatedLineItems(int i) {
        return this.associatedLineItems[i];
    }

    public void setAssociatedLineItems(int i, com.flexnet.operations.webservices.EntitlementLineItemIdentifierType _value) {
        this.associatedLineItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateMaintenanceLineItemDataType)) return false;
        CreateMaintenanceLineItemDataType other = (CreateMaintenanceLineItemDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activationId==null && other.getActivationId()==null) || 
             (this.activationId!=null &&
              this.activationId.equals(other.getActivationId()))) &&
            ((this.maintenanceProduct==null && other.getMaintenanceProduct()==null) || 
             (this.maintenanceProduct!=null &&
              this.maintenanceProduct.equals(other.getMaintenanceProduct()))) &&
            ((this.partNumber==null && other.getPartNumber()==null) || 
             (this.partNumber!=null &&
              this.partNumber.equals(other.getPartNumber()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderLineNumber==null && other.getOrderLineNumber()==null) || 
             (this.orderLineNumber!=null &&
              this.orderLineNumber.equals(other.getOrderLineNumber()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.isPermanent==null && other.getIsPermanent()==null) || 
             (this.isPermanent!=null &&
              this.isPermanent.equals(other.getIsPermanent()))) &&
            ((this.parentLineItem==null && other.getParentLineItem()==null) || 
             (this.parentLineItem!=null &&
              this.parentLineItem.equals(other.getParentLineItem()))) &&
            ((this.associatedLineItems==null && other.getAssociatedLineItems()==null) || 
             (this.associatedLineItems!=null &&
              java.util.Arrays.equals(this.associatedLineItems, other.getAssociatedLineItems())));
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
        if (getActivationId() != null) {
            _hashCode += getActivationId().hashCode();
        }
        if (getMaintenanceProduct() != null) {
            _hashCode += getMaintenanceProduct().hashCode();
        }
        if (getPartNumber() != null) {
            _hashCode += getPartNumber().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderLineNumber() != null) {
            _hashCode += getOrderLineNumber().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getIsPermanent() != null) {
            _hashCode += getIsPermanent().hashCode();
        }
        if (getParentLineItem() != null) {
            _hashCode += getParentLineItem().hashCode();
        }
        if (getAssociatedLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociatedLineItems(), i);
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
        new org.apache.axis.description.TypeDesc(CreateMaintenanceLineItemDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createMaintenanceLineItemDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orderLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPermanent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isPermanent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "associatedLineItems"));
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
