/**
 * OrgType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class OrgType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OrgType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _CUSTOMER = new org.apache.axis.types.NMToken("CUSTOMER");
    public static final org.apache.axis.types.NMToken _PUBLISHER = new org.apache.axis.types.NMToken("PUBLISHER");
    public static final org.apache.axis.types.NMToken _CHANNEL_PARTNER = new org.apache.axis.types.NMToken("CHANNEL_PARTNER");
    public static final org.apache.axis.types.NMToken _SELF_REGISTERED = new org.apache.axis.types.NMToken("SELF_REGISTERED");
    public static final OrgType CUSTOMER = new OrgType(_CUSTOMER);
    public static final OrgType PUBLISHER = new OrgType(_PUBLISHER);
    public static final OrgType CHANNEL_PARTNER = new OrgType(_CHANNEL_PARTNER);
    public static final OrgType SELF_REGISTERED = new OrgType(_SELF_REGISTERED);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static OrgType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        OrgType enumeration = (OrgType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OrgType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OrgType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "OrgType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
