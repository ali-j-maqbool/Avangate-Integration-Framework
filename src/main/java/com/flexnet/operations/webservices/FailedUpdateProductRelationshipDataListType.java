/**
 * FailedUpdateProductRelationshipDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class FailedUpdateProductRelationshipDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.FailedUpdateProductRelationshipDataType[] failedRelationship;

    public FailedUpdateProductRelationshipDataListType() {
    }

    public FailedUpdateProductRelationshipDataListType(
           com.flexnet.operations.webservices.FailedUpdateProductRelationshipDataType[] failedRelationship) {
           this.failedRelationship = failedRelationship;
    }


    /**
     * Gets the failedRelationship value for this FailedUpdateProductRelationshipDataListType.
     * 
     * @return failedRelationship
     */
    public com.flexnet.operations.webservices.FailedUpdateProductRelationshipDataType[] getFailedRelationship() {
        return failedRelationship;
    }


    /**
     * Sets the failedRelationship value for this FailedUpdateProductRelationshipDataListType.
     * 
     * @param failedRelationship
     */
    public void setFailedRelationship(com.flexnet.operations.webservices.FailedUpdateProductRelationshipDataType[] failedRelationship) {
        this.failedRelationship = failedRelationship;
    }

    public com.flexnet.operations.webservices.FailedUpdateProductRelationshipDataType getFailedRelationship(int i) {
        return this.failedRelationship[i];
    }

    public void setFailedRelationship(int i, com.flexnet.operations.webservices.FailedUpdateProductRelationshipDataType _value) {
        this.failedRelationship[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FailedUpdateProductRelationshipDataListType)) return false;
        FailedUpdateProductRelationshipDataListType other = (FailedUpdateProductRelationshipDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.failedRelationship==null && other.getFailedRelationship()==null) || 
             (this.failedRelationship!=null &&
              java.util.Arrays.equals(this.failedRelationship, other.getFailedRelationship())));
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
        if (getFailedRelationship() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedRelationship());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedRelationship(), i);
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
        new org.apache.axis.description.TypeDesc(FailedUpdateProductRelationshipDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateProductRelationshipDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedRelationship");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedRelationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateProductRelationshipDataType"));
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
