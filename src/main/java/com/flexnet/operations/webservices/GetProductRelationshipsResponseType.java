/**
 * GetProductRelationshipsResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class GetProductRelationshipsResponseType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.StatusInfoType statusInfo;

    private com.flexnet.operations.webservices.ProductRelationshipDataType[] relationship;

    public GetProductRelationshipsResponseType() {
    }

    public GetProductRelationshipsResponseType(
           com.flexnet.operations.webservices.StatusInfoType statusInfo,
           com.flexnet.operations.webservices.ProductRelationshipDataType[] relationship) {
           this.statusInfo = statusInfo;
           this.relationship = relationship;
    }


    /**
     * Gets the statusInfo value for this GetProductRelationshipsResponseType.
     * 
     * @return statusInfo
     */
    public com.flexnet.operations.webservices.StatusInfoType getStatusInfo() {
        return statusInfo;
    }


    /**
     * Sets the statusInfo value for this GetProductRelationshipsResponseType.
     * 
     * @param statusInfo
     */
    public void setStatusInfo(com.flexnet.operations.webservices.StatusInfoType statusInfo) {
        this.statusInfo = statusInfo;
    }


    /**
     * Gets the relationship value for this GetProductRelationshipsResponseType.
     * 
     * @return relationship
     */
    public com.flexnet.operations.webservices.ProductRelationshipDataType[] getRelationship() {
        return relationship;
    }


    /**
     * Sets the relationship value for this GetProductRelationshipsResponseType.
     * 
     * @param relationship
     */
    public void setRelationship(com.flexnet.operations.webservices.ProductRelationshipDataType[] relationship) {
        this.relationship = relationship;
    }

    public com.flexnet.operations.webservices.ProductRelationshipDataType getRelationship(int i) {
        return this.relationship[i];
    }

    public void setRelationship(int i, com.flexnet.operations.webservices.ProductRelationshipDataType _value) {
        this.relationship[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetProductRelationshipsResponseType)) return false;
        GetProductRelationshipsResponseType other = (GetProductRelationshipsResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusInfo==null && other.getStatusInfo()==null) || 
             (this.statusInfo!=null &&
              this.statusInfo.equals(other.getStatusInfo()))) &&
            ((this.relationship==null && other.getRelationship()==null) || 
             (this.relationship!=null &&
              java.util.Arrays.equals(this.relationship, other.getRelationship())));
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
        if (getStatusInfo() != null) {
            _hashCode += getStatusInfo().hashCode();
        }
        if (getRelationship() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelationship());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelationship(), i);
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
        new org.apache.axis.description.TypeDesc(GetProductRelationshipsResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductRelationshipsResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "statusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StatusInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationship");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productRelationshipDataType"));
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
