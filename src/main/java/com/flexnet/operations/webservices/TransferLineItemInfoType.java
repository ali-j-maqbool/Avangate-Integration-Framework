/**
 * TransferLineItemInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class TransferLineItemInfoType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier;

    private java.math.BigInteger numberOfCopies;

    private java.lang.Boolean useSameActivationId;

    private java.lang.String customActivationId;

    private java.lang.Boolean generateActivationId;

    private com.flexnet.operations.webservices.EntitlementIdentifierType entitlementBelongsTo;

    public TransferLineItemInfoType() {
    }

    public TransferLineItemInfoType(
           com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier,
           java.math.BigInteger numberOfCopies,
           java.lang.Boolean useSameActivationId,
           java.lang.String customActivationId,
           java.lang.Boolean generateActivationId,
           com.flexnet.operations.webservices.EntitlementIdentifierType entitlementBelongsTo) {
           this.lineItemIdentifier = lineItemIdentifier;
           this.numberOfCopies = numberOfCopies;
           this.useSameActivationId = useSameActivationId;
           this.customActivationId = customActivationId;
           this.generateActivationId = generateActivationId;
           this.entitlementBelongsTo = entitlementBelongsTo;
    }


    /**
     * Gets the lineItemIdentifier value for this TransferLineItemInfoType.
     * 
     * @return lineItemIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementLineItemIdentifierType getLineItemIdentifier() {
        return lineItemIdentifier;
    }


    /**
     * Sets the lineItemIdentifier value for this TransferLineItemInfoType.
     * 
     * @param lineItemIdentifier
     */
    public void setLineItemIdentifier(com.flexnet.operations.webservices.EntitlementLineItemIdentifierType lineItemIdentifier) {
        this.lineItemIdentifier = lineItemIdentifier;
    }


    /**
     * Gets the numberOfCopies value for this TransferLineItemInfoType.
     * 
     * @return numberOfCopies
     */
    public java.math.BigInteger getNumberOfCopies() {
        return numberOfCopies;
    }


    /**
     * Sets the numberOfCopies value for this TransferLineItemInfoType.
     * 
     * @param numberOfCopies
     */
    public void setNumberOfCopies(java.math.BigInteger numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }


    /**
     * Gets the useSameActivationId value for this TransferLineItemInfoType.
     * 
     * @return useSameActivationId
     */
    public java.lang.Boolean getUseSameActivationId() {
        return useSameActivationId;
    }


    /**
     * Sets the useSameActivationId value for this TransferLineItemInfoType.
     * 
     * @param useSameActivationId
     */
    public void setUseSameActivationId(java.lang.Boolean useSameActivationId) {
        this.useSameActivationId = useSameActivationId;
    }


    /**
     * Gets the customActivationId value for this TransferLineItemInfoType.
     * 
     * @return customActivationId
     */
    public java.lang.String getCustomActivationId() {
        return customActivationId;
    }


    /**
     * Sets the customActivationId value for this TransferLineItemInfoType.
     * 
     * @param customActivationId
     */
    public void setCustomActivationId(java.lang.String customActivationId) {
        this.customActivationId = customActivationId;
    }


    /**
     * Gets the generateActivationId value for this TransferLineItemInfoType.
     * 
     * @return generateActivationId
     */
    public java.lang.Boolean getGenerateActivationId() {
        return generateActivationId;
    }


    /**
     * Sets the generateActivationId value for this TransferLineItemInfoType.
     * 
     * @param generateActivationId
     */
    public void setGenerateActivationId(java.lang.Boolean generateActivationId) {
        this.generateActivationId = generateActivationId;
    }


    /**
     * Gets the entitlementBelongsTo value for this TransferLineItemInfoType.
     * 
     * @return entitlementBelongsTo
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getEntitlementBelongsTo() {
        return entitlementBelongsTo;
    }


    /**
     * Sets the entitlementBelongsTo value for this TransferLineItemInfoType.
     * 
     * @param entitlementBelongsTo
     */
    public void setEntitlementBelongsTo(com.flexnet.operations.webservices.EntitlementIdentifierType entitlementBelongsTo) {
        this.entitlementBelongsTo = entitlementBelongsTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferLineItemInfoType)) return false;
        TransferLineItemInfoType other = (TransferLineItemInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemIdentifier==null && other.getLineItemIdentifier()==null) || 
             (this.lineItemIdentifier!=null &&
              this.lineItemIdentifier.equals(other.getLineItemIdentifier()))) &&
            ((this.numberOfCopies==null && other.getNumberOfCopies()==null) || 
             (this.numberOfCopies!=null &&
              this.numberOfCopies.equals(other.getNumberOfCopies()))) &&
            ((this.useSameActivationId==null && other.getUseSameActivationId()==null) || 
             (this.useSameActivationId!=null &&
              this.useSameActivationId.equals(other.getUseSameActivationId()))) &&
            ((this.customActivationId==null && other.getCustomActivationId()==null) || 
             (this.customActivationId!=null &&
              this.customActivationId.equals(other.getCustomActivationId()))) &&
            ((this.generateActivationId==null && other.getGenerateActivationId()==null) || 
             (this.generateActivationId!=null &&
              this.generateActivationId.equals(other.getGenerateActivationId()))) &&
            ((this.entitlementBelongsTo==null && other.getEntitlementBelongsTo()==null) || 
             (this.entitlementBelongsTo!=null &&
              this.entitlementBelongsTo.equals(other.getEntitlementBelongsTo())));
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
        if (getLineItemIdentifier() != null) {
            _hashCode += getLineItemIdentifier().hashCode();
        }
        if (getNumberOfCopies() != null) {
            _hashCode += getNumberOfCopies().hashCode();
        }
        if (getUseSameActivationId() != null) {
            _hashCode += getUseSameActivationId().hashCode();
        }
        if (getCustomActivationId() != null) {
            _hashCode += getCustomActivationId().hashCode();
        }
        if (getGenerateActivationId() != null) {
            _hashCode += getGenerateActivationId().hashCode();
        }
        if (getEntitlementBelongsTo() != null) {
            _hashCode += getEntitlementBelongsTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferLineItemInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferLineItemInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfCopies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "numberOfCopies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useSameActivationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "useSameActivationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customActivationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customActivationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generateActivationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "generateActivationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementBelongsTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementBelongsTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
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
