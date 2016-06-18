/**
 * ProductRelationshipDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class ProductRelationshipDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.ProductIdentifierType productToRelate;

    private com.flexnet.operations.webservices.ProductIdentifierType relatedProduct;

    private com.flexnet.operations.webservices.RelationshipType relation;

    public ProductRelationshipDataType() {
    }

    public ProductRelationshipDataType(
           com.flexnet.operations.webservices.ProductIdentifierType productToRelate,
           com.flexnet.operations.webservices.ProductIdentifierType relatedProduct,
           com.flexnet.operations.webservices.RelationshipType relation) {
           this.productToRelate = productToRelate;
           this.relatedProduct = relatedProduct;
           this.relation = relation;
    }


    /**
     * Gets the productToRelate value for this ProductRelationshipDataType.
     * 
     * @return productToRelate
     */
    public com.flexnet.operations.webservices.ProductIdentifierType getProductToRelate() {
        return productToRelate;
    }


    /**
     * Sets the productToRelate value for this ProductRelationshipDataType.
     * 
     * @param productToRelate
     */
    public void setProductToRelate(com.flexnet.operations.webservices.ProductIdentifierType productToRelate) {
        this.productToRelate = productToRelate;
    }


    /**
     * Gets the relatedProduct value for this ProductRelationshipDataType.
     * 
     * @return relatedProduct
     */
    public com.flexnet.operations.webservices.ProductIdentifierType getRelatedProduct() {
        return relatedProduct;
    }


    /**
     * Sets the relatedProduct value for this ProductRelationshipDataType.
     * 
     * @param relatedProduct
     */
    public void setRelatedProduct(com.flexnet.operations.webservices.ProductIdentifierType relatedProduct) {
        this.relatedProduct = relatedProduct;
    }


    /**
     * Gets the relation value for this ProductRelationshipDataType.
     * 
     * @return relation
     */
    public com.flexnet.operations.webservices.RelationshipType getRelation() {
        return relation;
    }


    /**
     * Sets the relation value for this ProductRelationshipDataType.
     * 
     * @param relation
     */
    public void setRelation(com.flexnet.operations.webservices.RelationshipType relation) {
        this.relation = relation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductRelationshipDataType)) return false;
        ProductRelationshipDataType other = (ProductRelationshipDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productToRelate==null && other.getProductToRelate()==null) || 
             (this.productToRelate!=null &&
              this.productToRelate.equals(other.getProductToRelate()))) &&
            ((this.relatedProduct==null && other.getRelatedProduct()==null) || 
             (this.relatedProduct!=null &&
              this.relatedProduct.equals(other.getRelatedProduct()))) &&
            ((this.relation==null && other.getRelation()==null) || 
             (this.relation!=null &&
              this.relation.equals(other.getRelation())));
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
        if (getProductToRelate() != null) {
            _hashCode += getProductToRelate().hashCode();
        }
        if (getRelatedProduct() != null) {
            _hashCode += getRelatedProduct().hashCode();
        }
        if (getRelation() != null) {
            _hashCode += getRelation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductRelationshipDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productRelationshipDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productToRelate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productToRelate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relatedProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productIdentifierType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relation"));
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
