/**
 * DeletePartNumberDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class DeletePartNumberDataType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.PartNumberIdentifierType partNumberIdentifier;

    public DeletePartNumberDataType() {
    }

    public DeletePartNumberDataType(
           com.flexnet.operations.webservices.PartNumberIdentifierType partNumberIdentifier) {
           this.partNumberIdentifier = partNumberIdentifier;
    }


    /**
     * Gets the partNumberIdentifier value for this DeletePartNumberDataType.
     * 
     * @return partNumberIdentifier
     */
    public com.flexnet.operations.webservices.PartNumberIdentifierType getPartNumberIdentifier() {
        return partNumberIdentifier;
    }


    /**
     * Sets the partNumberIdentifier value for this DeletePartNumberDataType.
     * 
     * @param partNumberIdentifier
     */
    public void setPartNumberIdentifier(com.flexnet.operations.webservices.PartNumberIdentifierType partNumberIdentifier) {
        this.partNumberIdentifier = partNumberIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeletePartNumberDataType)) return false;
        DeletePartNumberDataType other = (DeletePartNumberDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partNumberIdentifier==null && other.getPartNumberIdentifier()==null) || 
             (this.partNumberIdentifier!=null &&
              this.partNumberIdentifier.equals(other.getPartNumberIdentifier())));
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
        if (getPartNumberIdentifier() != null) {
            _hashCode += getPartNumberIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeletePartNumberDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deletePartNumberDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumberIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberIdentifierType"));
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
