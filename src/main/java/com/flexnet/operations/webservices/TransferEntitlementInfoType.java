/**
 * TransferEntitlementInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class TransferEntitlementInfoType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier;

    private java.lang.String organizationTo;

    private java.lang.Boolean retainExistingIds;

    private java.lang.Boolean returnActiveFulfillments;

    private java.lang.Boolean forceTransferEvenIfNoTargetUsers;

    private java.lang.Boolean forceTransferEvenIfParentAndChildSeparated;

    public TransferEntitlementInfoType() {
    }

    public TransferEntitlementInfoType(
           com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier,
           java.lang.String organizationTo,
           java.lang.Boolean retainExistingIds,
           java.lang.Boolean returnActiveFulfillments,
           java.lang.Boolean forceTransferEvenIfNoTargetUsers,
           java.lang.Boolean forceTransferEvenIfParentAndChildSeparated) {
           this.entitlementIdentifier = entitlementIdentifier;
           this.organizationTo = organizationTo;
           this.retainExistingIds = retainExistingIds;
           this.returnActiveFulfillments = returnActiveFulfillments;
           this.forceTransferEvenIfNoTargetUsers = forceTransferEvenIfNoTargetUsers;
           this.forceTransferEvenIfParentAndChildSeparated = forceTransferEvenIfParentAndChildSeparated;
    }


    /**
     * Gets the entitlementIdentifier value for this TransferEntitlementInfoType.
     * 
     * @return entitlementIdentifier
     */
    public com.flexnet.operations.webservices.EntitlementIdentifierType getEntitlementIdentifier() {
        return entitlementIdentifier;
    }


    /**
     * Sets the entitlementIdentifier value for this TransferEntitlementInfoType.
     * 
     * @param entitlementIdentifier
     */
    public void setEntitlementIdentifier(com.flexnet.operations.webservices.EntitlementIdentifierType entitlementIdentifier) {
        this.entitlementIdentifier = entitlementIdentifier;
    }


    /**
     * Gets the organizationTo value for this TransferEntitlementInfoType.
     * 
     * @return organizationTo
     */
    public java.lang.String getOrganizationTo() {
        return organizationTo;
    }


    /**
     * Sets the organizationTo value for this TransferEntitlementInfoType.
     * 
     * @param organizationTo
     */
    public void setOrganizationTo(java.lang.String organizationTo) {
        this.organizationTo = organizationTo;
    }


    /**
     * Gets the retainExistingIds value for this TransferEntitlementInfoType.
     * 
     * @return retainExistingIds
     */
    public java.lang.Boolean getRetainExistingIds() {
        return retainExistingIds;
    }


    /**
     * Sets the retainExistingIds value for this TransferEntitlementInfoType.
     * 
     * @param retainExistingIds
     */
    public void setRetainExistingIds(java.lang.Boolean retainExistingIds) {
        this.retainExistingIds = retainExistingIds;
    }


    /**
     * Gets the returnActiveFulfillments value for this TransferEntitlementInfoType.
     * 
     * @return returnActiveFulfillments
     */
    public java.lang.Boolean getReturnActiveFulfillments() {
        return returnActiveFulfillments;
    }


    /**
     * Sets the returnActiveFulfillments value for this TransferEntitlementInfoType.
     * 
     * @param returnActiveFulfillments
     */
    public void setReturnActiveFulfillments(java.lang.Boolean returnActiveFulfillments) {
        this.returnActiveFulfillments = returnActiveFulfillments;
    }


    /**
     * Gets the forceTransferEvenIfNoTargetUsers value for this TransferEntitlementInfoType.
     * 
     * @return forceTransferEvenIfNoTargetUsers
     */
    public java.lang.Boolean getForceTransferEvenIfNoTargetUsers() {
        return forceTransferEvenIfNoTargetUsers;
    }


    /**
     * Sets the forceTransferEvenIfNoTargetUsers value for this TransferEntitlementInfoType.
     * 
     * @param forceTransferEvenIfNoTargetUsers
     */
    public void setForceTransferEvenIfNoTargetUsers(java.lang.Boolean forceTransferEvenIfNoTargetUsers) {
        this.forceTransferEvenIfNoTargetUsers = forceTransferEvenIfNoTargetUsers;
    }


    /**
     * Gets the forceTransferEvenIfParentAndChildSeparated value for this TransferEntitlementInfoType.
     * 
     * @return forceTransferEvenIfParentAndChildSeparated
     */
    public java.lang.Boolean getForceTransferEvenIfParentAndChildSeparated() {
        return forceTransferEvenIfParentAndChildSeparated;
    }


    /**
     * Sets the forceTransferEvenIfParentAndChildSeparated value for this TransferEntitlementInfoType.
     * 
     * @param forceTransferEvenIfParentAndChildSeparated
     */
    public void setForceTransferEvenIfParentAndChildSeparated(java.lang.Boolean forceTransferEvenIfParentAndChildSeparated) {
        this.forceTransferEvenIfParentAndChildSeparated = forceTransferEvenIfParentAndChildSeparated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferEntitlementInfoType)) return false;
        TransferEntitlementInfoType other = (TransferEntitlementInfoType) obj;
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
            ((this.organizationTo==null && other.getOrganizationTo()==null) || 
             (this.organizationTo!=null &&
              this.organizationTo.equals(other.getOrganizationTo()))) &&
            ((this.retainExistingIds==null && other.getRetainExistingIds()==null) || 
             (this.retainExistingIds!=null &&
              this.retainExistingIds.equals(other.getRetainExistingIds()))) &&
            ((this.returnActiveFulfillments==null && other.getReturnActiveFulfillments()==null) || 
             (this.returnActiveFulfillments!=null &&
              this.returnActiveFulfillments.equals(other.getReturnActiveFulfillments()))) &&
            ((this.forceTransferEvenIfNoTargetUsers==null && other.getForceTransferEvenIfNoTargetUsers()==null) || 
             (this.forceTransferEvenIfNoTargetUsers!=null &&
              this.forceTransferEvenIfNoTargetUsers.equals(other.getForceTransferEvenIfNoTargetUsers()))) &&
            ((this.forceTransferEvenIfParentAndChildSeparated==null && other.getForceTransferEvenIfParentAndChildSeparated()==null) || 
             (this.forceTransferEvenIfParentAndChildSeparated!=null &&
              this.forceTransferEvenIfParentAndChildSeparated.equals(other.getForceTransferEvenIfParentAndChildSeparated())));
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
        if (getOrganizationTo() != null) {
            _hashCode += getOrganizationTo().hashCode();
        }
        if (getRetainExistingIds() != null) {
            _hashCode += getRetainExistingIds().hashCode();
        }
        if (getReturnActiveFulfillments() != null) {
            _hashCode += getReturnActiveFulfillments().hashCode();
        }
        if (getForceTransferEvenIfNoTargetUsers() != null) {
            _hashCode += getForceTransferEvenIfNoTargetUsers().hashCode();
        }
        if (getForceTransferEvenIfParentAndChildSeparated() != null) {
            _hashCode += getForceTransferEvenIfParentAndChildSeparated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferEntitlementInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferEntitlementInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retainExistingIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "retainExistingIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnActiveFulfillments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "returnActiveFulfillments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceTransferEvenIfNoTargetUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "forceTransferEvenIfNoTargetUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceTransferEvenIfParentAndChildSeparated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "forceTransferEvenIfParentAndChildSeparated"));
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
