/**
 * DeviceStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class DeviceStatusType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DeviceStatusType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _UNKNOWN = new org.apache.axis.types.NMToken("UNKNOWN");
    public static final org.apache.axis.types.NMToken _ACTIVE = new org.apache.axis.types.NMToken("ACTIVE");
    public static final org.apache.axis.types.NMToken _OBSOLETE = new org.apache.axis.types.NMToken("OBSOLETE");
    public static final org.apache.axis.types.NMToken _TEST = new org.apache.axis.types.NMToken("TEST");
    public static final DeviceStatusType UNKNOWN = new DeviceStatusType(_UNKNOWN);
    public static final DeviceStatusType ACTIVE = new DeviceStatusType(_ACTIVE);
    public static final DeviceStatusType OBSOLETE = new DeviceStatusType(_OBSOLETE);
    public static final DeviceStatusType TEST = new DeviceStatusType(_TEST);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static DeviceStatusType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        DeviceStatusType enumeration = (DeviceStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DeviceStatusType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DeviceStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
