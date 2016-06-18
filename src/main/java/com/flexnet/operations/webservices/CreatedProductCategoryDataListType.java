/**
 * CreatedProductCategoryDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class CreatedProductCategoryDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.CreatedProductCategoryDataType[] createdProductCatgory;

    public CreatedProductCategoryDataListType() {
    }

    public CreatedProductCategoryDataListType(
           com.flexnet.operations.webservices.CreatedProductCategoryDataType[] createdProductCatgory) {
           this.createdProductCatgory = createdProductCatgory;
    }


    /**
     * Gets the createdProductCatgory value for this CreatedProductCategoryDataListType.
     * 
     * @return createdProductCatgory
     */
    public com.flexnet.operations.webservices.CreatedProductCategoryDataType[] getCreatedProductCatgory() {
        return createdProductCatgory;
    }


    /**
     * Sets the createdProductCatgory value for this CreatedProductCategoryDataListType.
     * 
     * @param createdProductCatgory
     */
    public void setCreatedProductCatgory(com.flexnet.operations.webservices.CreatedProductCategoryDataType[] createdProductCatgory) {
        this.createdProductCatgory = createdProductCatgory;
    }

    public com.flexnet.operations.webservices.CreatedProductCategoryDataType getCreatedProductCatgory(int i) {
        return this.createdProductCatgory[i];
    }

    public void setCreatedProductCatgory(int i, com.flexnet.operations.webservices.CreatedProductCategoryDataType _value) {
        this.createdProductCatgory[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatedProductCategoryDataListType)) return false;
        CreatedProductCategoryDataListType other = (CreatedProductCategoryDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdProductCatgory==null && other.getCreatedProductCatgory()==null) || 
             (this.createdProductCatgory!=null &&
              java.util.Arrays.equals(this.createdProductCatgory, other.getCreatedProductCatgory())));
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
        if (getCreatedProductCatgory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedProductCatgory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedProductCatgory(), i);
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
        new org.apache.axis.description.TypeDesc(CreatedProductCategoryDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdProductCategoryDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdProductCatgory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdProductCatgory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdProductCategoryDataType"));
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
