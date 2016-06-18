/**
 * UpdateProductRelationshipDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UpdateProductRelationshipDataType  extends com.flexnet.operations.webservices.ProductRelationshipDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.RelationshipType newRelation;

    public UpdateProductRelationshipDataType() {
    }

    public UpdateProductRelationshipDataType(
           com.flexnet.operations.webservices.ProductIdentifierType productToRelate,
           com.flexnet.operations.webservices.ProductIdentifierType relatedProduct,
           com.flexnet.operations.webservices.RelationshipType relation,
           com.flexnet.operations.webservices.RelationshipType newRelation) {
        super(
            productToRelate,
            relatedProduct,
            relation);
        this.newRelation = newRelation;
    }


    /**
     * Gets the newRelation value for this UpdateProductRelationshipDataType.
     * 
     * @return newRelation
     */
    public com.flexnet.operations.webservices.RelationshipType getNewRelation() {
        return newRelation;
    }


    /**
     * Sets the newRelation value for this UpdateProductRelationshipDataType.
     * 
     * @param newRelation
     */
    public void setNewRelation(com.flexnet.operations.webservices.RelationshipType newRelation) {
        this.newRelation = newRelation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateProductRelationshipDataType)) return false;
        UpdateProductRelationshipDataType other = (UpdateProductRelationshipDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.newRelation==null && other.getNewRelation()==null) || 
             (this.newRelation!=null &&
              this.newRelation.equals(other.getNewRelation())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNewRelation() != null) {
            _hashCode += getNewRelation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateProductRelationshipDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductRelationshipDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "newRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relationshipType"));
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
