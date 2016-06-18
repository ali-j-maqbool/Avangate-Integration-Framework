/**
 * UpdateProductRelationshipRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UpdateProductRelationshipRequestType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.UpdateProductRelationshipDataType[] relationship;

    public UpdateProductRelationshipRequestType() {
    }

    public UpdateProductRelationshipRequestType(
           com.flexnet.operations.webservices.UpdateProductRelationshipDataType[] relationship) {
           this.relationship = relationship;
    }


    /**
     * Gets the relationship value for this UpdateProductRelationshipRequestType.
     * 
     * @return relationship
     */
    public com.flexnet.operations.webservices.UpdateProductRelationshipDataType[] getRelationship() {
        return relationship;
    }


    /**
     * Sets the relationship value for this UpdateProductRelationshipRequestType.
     * 
     * @param relationship
     */
    public void setRelationship(com.flexnet.operations.webservices.UpdateProductRelationshipDataType[] relationship) {
        this.relationship = relationship;
    }

    public com.flexnet.operations.webservices.UpdateProductRelationshipDataType getRelationship(int i) {
        return this.relationship[i];
    }

    public void setRelationship(int i, com.flexnet.operations.webservices.UpdateProductRelationshipDataType _value) {
        this.relationship[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateProductRelationshipRequestType)) return false;
        UpdateProductRelationshipRequestType other = (UpdateProductRelationshipRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        new org.apache.axis.description.TypeDesc(UpdateProductRelationshipRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductRelationshipRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationship");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductRelationshipDataType"));
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
