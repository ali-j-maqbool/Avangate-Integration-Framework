/**
 * DeviceIdTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class DeviceIdTypeType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DeviceIdTypeType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _UNKNOWN = new org.apache.axis.types.NMToken("UNKNOWN");
    public static final org.apache.axis.types.NMToken _STRING = new org.apache.axis.types.NMToken("STRING");
    public static final org.apache.axis.types.NMToken _ETHERNET = new org.apache.axis.types.NMToken("ETHERNET");
    public static final org.apache.axis.types.NMToken _FLEXID9 = new org.apache.axis.types.NMToken("FLEXID9");
    public static final org.apache.axis.types.NMToken _FLEXID10 = new org.apache.axis.types.NMToken("FLEXID10");
    public static final org.apache.axis.types.NMToken _VM_UUID = new org.apache.axis.types.NMToken("VM_UUID");
    public static final org.apache.axis.types.NMToken _INTERNET = new org.apache.axis.types.NMToken("INTERNET");
    public static final org.apache.axis.types.NMToken _INTERNET6 = new org.apache.axis.types.NMToken("INTERNET6");
    public static final org.apache.axis.types.NMToken _USER = new org.apache.axis.types.NMToken("USER");
    public static final org.apache.axis.types.NMToken _TOLERANT = new org.apache.axis.types.NMToken("TOLERANT");
    public static final org.apache.axis.types.NMToken _EXTENDED = new org.apache.axis.types.NMToken("EXTENDED");
    public static final org.apache.axis.types.NMToken _PUBLISHER_DEFINED = new org.apache.axis.types.NMToken("PUBLISHER_DEFINED");
    public static final DeviceIdTypeType UNKNOWN = new DeviceIdTypeType(_UNKNOWN);
    public static final DeviceIdTypeType STRING = new DeviceIdTypeType(_STRING);
    public static final DeviceIdTypeType ETHERNET = new DeviceIdTypeType(_ETHERNET);
    public static final DeviceIdTypeType FLEXID9 = new DeviceIdTypeType(_FLEXID9);
    public static final DeviceIdTypeType FLEXID10 = new DeviceIdTypeType(_FLEXID10);
    public static final DeviceIdTypeType VM_UUID = new DeviceIdTypeType(_VM_UUID);
    public static final DeviceIdTypeType INTERNET = new DeviceIdTypeType(_INTERNET);
    public static final DeviceIdTypeType INTERNET6 = new DeviceIdTypeType(_INTERNET6);
    public static final DeviceIdTypeType USER = new DeviceIdTypeType(_USER);
    public static final DeviceIdTypeType TOLERANT = new DeviceIdTypeType(_TOLERANT);
    public static final DeviceIdTypeType EXTENDED = new DeviceIdTypeType(_EXTENDED);
    public static final DeviceIdTypeType PUBLISHER_DEFINED = new DeviceIdTypeType(_PUBLISHER_DEFINED);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static DeviceIdTypeType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        DeviceIdTypeType enumeration = (DeviceIdTypeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DeviceIdTypeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DeviceIdTypeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdTypeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
