/**
 * VersionDateOptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class VersionDateOptionType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VersionDateOptionType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _DEFINE_NOW = new org.apache.axis.types.NMToken("DEFINE_NOW");
    public static final org.apache.axis.types.NMToken _USE_START_DATE = new org.apache.axis.types.NMToken("USE_START_DATE");
    public static final org.apache.axis.types.NMToken _USE_ACTIVATION_DATE = new org.apache.axis.types.NMToken("USE_ACTIVATION_DATE");
    public static final org.apache.axis.types.NMToken _DEFINE_VERSION_STARTDATE_LATER = new org.apache.axis.types.NMToken("DEFINE_VERSION_STARTDATE_LATER");
    public static final org.apache.axis.types.NMToken _DEFINE_VERSION_DATE_LATER = new org.apache.axis.types.NMToken("DEFINE_VERSION_DATE_LATER");
    public static final VersionDateOptionType DEFINE_NOW = new VersionDateOptionType(_DEFINE_NOW);
    public static final VersionDateOptionType USE_START_DATE = new VersionDateOptionType(_USE_START_DATE);
    public static final VersionDateOptionType USE_ACTIVATION_DATE = new VersionDateOptionType(_USE_ACTIVATION_DATE);
    public static final VersionDateOptionType DEFINE_VERSION_STARTDATE_LATER = new VersionDateOptionType(_DEFINE_VERSION_STARTDATE_LATER);
    public static final VersionDateOptionType DEFINE_VERSION_DATE_LATER = new VersionDateOptionType(_DEFINE_VERSION_DATE_LATER);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static VersionDateOptionType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        VersionDateOptionType enumeration = (VersionDateOptionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VersionDateOptionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VersionDateOptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "VersionDateOptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
