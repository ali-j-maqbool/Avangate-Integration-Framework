/**
 * DurationUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class DurationUnit implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DurationUnit(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _DAYS = new org.apache.axis.types.NMToken("DAYS");
    public static final org.apache.axis.types.NMToken _WEEKS = new org.apache.axis.types.NMToken("WEEKS");
    public static final org.apache.axis.types.NMToken _MONTHS = new org.apache.axis.types.NMToken("MONTHS");
    public static final org.apache.axis.types.NMToken _YEARS = new org.apache.axis.types.NMToken("YEARS");
    public static final DurationUnit DAYS = new DurationUnit(_DAYS);
    public static final DurationUnit WEEKS = new DurationUnit(_WEEKS);
    public static final DurationUnit MONTHS = new DurationUnit(_MONTHS);
    public static final DurationUnit YEARS = new DurationUnit(_YEARS);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static DurationUnit fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        DurationUnit enumeration = (DurationUnit)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DurationUnit fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DurationUnit.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DurationUnit"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
