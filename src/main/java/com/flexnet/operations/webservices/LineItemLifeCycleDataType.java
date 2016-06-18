/**
 * LineItemLifeCycleDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class LineItemLifeCycleDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItemIdentifier;

    private com.flexnet.operations.webservices.CreateEntitlementLineItemDataType lineItem;

    private java.lang.Boolean isFull;

    private java.lang.Boolean allowActivationsOnParent;

    private java.lang.Boolean autoDeploy;

    public LineItemLifeCycleDataType() {
    }

    public LineItemLifeCycleDataType(
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItemIdentifier,
           com.flexnet.operations.webservices.CreateEntitlementLineItemDataType lineItem,
           java.lang.Boolean isFull,
           java.lang.Boolean allowActivationsOnParent,
           java.lang.Boolean autoDeploy) {
           this.parentLineItemIdentifier = parentLineItemIdentifier;
           this.lineItem = lineItem;
           this.isFull = isFull;
           this.allowActivationsOnParent = allowActivationsOnParent;
           this.autoDeploy = autoDeploy;
    }


    /**
     * Gets the parentLineItemIdentifier value for this LineItemLifeCycleDataType.
     * 
     * @return parentLineItemIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getParentLineItemIdentifier() {
        return parentLineItemIdentifier;
    }


    /**
     * Sets the parentLineItemIdentifier value for this LineItemLifeCycleDataType.
     * 
     * @param parentLineItemIdentifier
     */
    public void setParentLineItemIdentifier(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType parentLineItemIdentifier) {
        this.parentLineItemIdentifier = parentLineItemIdentifier;
    }


    /**
     * Gets the lineItem value for this LineItemLifeCycleDataType.
     * 
     * @return lineItem
     */
    public com.flexnet.operations.webservices.CreateEntitlementLineItemDataType getLineItem() {
        return lineItem;
    }


    /**
     * Sets the lineItem value for this LineItemLifeCycleDataType.
     * 
     * @param lineItem
     */
    public void setLineItem(com.flexnet.operations.webservices.CreateEntitlementLineItemDataType lineItem) {
        this.lineItem = lineItem;
    }


    /**
     * Gets the isFull value for this LineItemLifeCycleDataType.
     * 
     * @return isFull
     */
    public java.lang.Boolean getIsFull() {
        return isFull;
    }


    /**
     * Sets the isFull value for this LineItemLifeCycleDataType.
     * 
     * @param isFull
     */
    public void setIsFull(java.lang.Boolean isFull) {
        this.isFull = isFull;
    }


    /**
     * Gets the allowActivationsOnParent value for this LineItemLifeCycleDataType.
     * 
     * @return allowActivationsOnParent
     */
    public java.lang.Boolean getAllowActivationsOnParent() {
        return allowActivationsOnParent;
    }


    /**
     * Sets the allowActivationsOnParent value for this LineItemLifeCycleDataType.
     * 
     * @param allowActivationsOnParent
     */
    public void setAllowActivationsOnParent(java.lang.Boolean allowActivationsOnParent) {
        this.allowActivationsOnParent = allowActivationsOnParent;
    }


    /**
     * Gets the autoDeploy value for this LineItemLifeCycleDataType.
     * 
     * @return autoDeploy
     */
    public java.lang.Boolean getAutoDeploy() {
        return autoDeploy;
    }


    /**
     * Sets the autoDeploy value for this LineItemLifeCycleDataType.
     * 
     * @param autoDeploy
     */
    public void setAutoDeploy(java.lang.Boolean autoDeploy) {
        this.autoDeploy = autoDeploy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemLifeCycleDataType)) return false;
        LineItemLifeCycleDataType other = (LineItemLifeCycleDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parentLineItemIdentifier==null && other.getParentLineItemIdentifier()==null) || 
             (this.parentLineItemIdentifier!=null &&
              this.parentLineItemIdentifier.equals(other.getParentLineItemIdentifier()))) &&
            ((this.lineItem==null && other.getLineItem()==null) || 
             (this.lineItem!=null &&
              this.lineItem.equals(other.getLineItem()))) &&
            ((this.isFull==null && other.getIsFull()==null) || 
             (this.isFull!=null &&
              this.isFull.equals(other.getIsFull()))) &&
            ((this.allowActivationsOnParent==null && other.getAllowActivationsOnParent()==null) || 
             (this.allowActivationsOnParent!=null &&
              this.allowActivationsOnParent.equals(other.getAllowActivationsOnParent()))) &&
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
        if (getParentLineItemIdentifier() != null) {
            _hashCode += getParentLineItemIdentifier().hashCode();
        }
        if (getLineItem() != null) {
            _hashCode += getLineItem().hashCode();
        }
        if (getIsFull() != null) {
            _hashCode += getIsFull().hashCode();
        }
        if (getAllowActivationsOnParent() != null) {
            _hashCode += getAllowActivationsOnParent().hashCode();
        }
        if (getAutoDeploy() != null) {
            _hashCode += getAutoDeploy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemLifeCycleDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemLifeCycleDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentLineItemIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "parentLineItemIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createEntitlementLineItemDataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFull");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isFull"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowActivationsOnParent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "allowActivationsOnParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
