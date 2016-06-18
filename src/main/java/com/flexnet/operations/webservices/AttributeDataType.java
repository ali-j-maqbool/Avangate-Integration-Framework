/**
 * AttributeDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class AttributeDataType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AttributeDataType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _TEXT = new org.apache.axis.types.NMToken("TEXT");
    public static final org.apache.axis.types.NMToken _BOOLEAN = new org.apache.axis.types.NMToken("BOOLEAN");
    public static final org.apache.axis.types.NMToken _NUMBER = new org.apache.axis.types.NMToken("NUMBER");
    public static final org.apache.axis.types.NMToken _DATE = new org.apache.axis.types.NMToken("DATE");
    public static final org.apache.axis.types.NMToken _MULTI_VALUED_TEXT = new org.apache.axis.types.NMToken("MULTI_VALUED_TEXT");
    public static final org.apache.axis.types.NMToken _LONGTEXT = new org.apache.axis.types.NMToken("LONGTEXT");
    public static final AttributeDataType TEXT = new AttributeDataType(_TEXT);
    public static final AttributeDataType BOOLEAN = new AttributeDataType(_BOOLEAN);
    public static final AttributeDataType NUMBER = new AttributeDataType(_NUMBER);
    public static final AttributeDataType DATE = new AttributeDataType(_DATE);
    public static final AttributeDataType MULTI_VALUED_TEXT = new AttributeDataType(_MULTI_VALUED_TEXT);
    public static final AttributeDataType LONGTEXT = new AttributeDataType(_LONGTEXT);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static AttributeDataType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        AttributeDataType enumeration = (AttributeDataType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AttributeDataType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AttributeDataType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "AttributeDataType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
