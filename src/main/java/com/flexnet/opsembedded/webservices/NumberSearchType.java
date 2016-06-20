/**
 * NumberSearchType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class NumberSearchType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NumberSearchType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _GREATER_THAN = new org.apache.axis.types.NMToken("GREATER_THAN");
    public static final org.apache.axis.types.NMToken _GREATER_THAN_EQUALS = new org.apache.axis.types.NMToken("GREATER_THAN_EQUALS");
    public static final org.apache.axis.types.NMToken _LESS_THAN = new org.apache.axis.types.NMToken("LESS_THAN");
    public static final org.apache.axis.types.NMToken _LESS_THAN_EQUALS = new org.apache.axis.types.NMToken("LESS_THAN_EQUALS");
    public static final org.apache.axis.types.NMToken _EQUALS = new org.apache.axis.types.NMToken("EQUALS");
    public static final org.apache.axis.types.NMToken _NOT_EQUALS = new org.apache.axis.types.NMToken("NOT_EQUALS");
    public static final NumberSearchType GREATER_THAN = new NumberSearchType(_GREATER_THAN);
    public static final NumberSearchType GREATER_THAN_EQUALS = new NumberSearchType(_GREATER_THAN_EQUALS);
    public static final NumberSearchType LESS_THAN = new NumberSearchType(_LESS_THAN);
    public static final NumberSearchType LESS_THAN_EQUALS = new NumberSearchType(_LESS_THAN_EQUALS);
    public static final NumberSearchType EQUALS = new NumberSearchType(_EQUALS);
    public static final NumberSearchType NOT_EQUALS = new NumberSearchType(_NOT_EQUALS);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static NumberSearchType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        NumberSearchType enumeration = (NumberSearchType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NumberSearchType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NumberSearchType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "numberSearchType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
