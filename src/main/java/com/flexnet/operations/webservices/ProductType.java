/**
 * ProductType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class ProductType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProductType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _LICENSED_PRODUCT = new org.apache.axis.types.NMToken("LICENSED_PRODUCT");
    public static final org.apache.axis.types.NMToken _SUITE = new org.apache.axis.types.NMToken("SUITE");
    public static final org.apache.axis.types.NMToken _MAINTENENACE = new org.apache.axis.types.NMToken("MAINTENENACE");
    public static final ProductType LICENSED_PRODUCT = new ProductType(_LICENSED_PRODUCT);
    public static final ProductType SUITE = new ProductType(_SUITE);
    public static final ProductType MAINTENENACE = new ProductType(_MAINTENENACE);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static ProductType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        ProductType enumeration = (ProductType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProductType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.NMToken(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "ProductType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
