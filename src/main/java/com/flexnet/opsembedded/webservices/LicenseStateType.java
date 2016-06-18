/**
 * LicenseStateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class LicenseStateType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LicenseStateType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _UNDEFINED = new org.apache.axis.types.NMToken("UNDEFINED");
    public static final org.apache.axis.types.NMToken _LICENSE_NOT_GENERATED = new org.apache.axis.types.NMToken("LICENSE_NOT_GENERATED");
    public static final org.apache.axis.types.NMToken _LICENSE_GENERATED = new org.apache.axis.types.NMToken("LICENSE_GENERATED");
    public static final org.apache.axis.types.NMToken _MARKED_FOR_REMOVAL = new org.apache.axis.types.NMToken("MARKED_FOR_REMOVAL");
    public static final org.apache.axis.types.NMToken _REMOVED_FROM_LICENSE = new org.apache.axis.types.NMToken("REMOVED_FROM_LICENSE");
    public static final org.apache.axis.types.NMToken _REMOVAL_PENDING_CONFIRMATION = new org.apache.axis.types.NMToken("REMOVAL_PENDING_CONFIRMATION");
    public static final org.apache.axis.types.NMToken _COPIES_INCREASING = new org.apache.axis.types.NMToken("COPIES_INCREASING");
    public static final org.apache.axis.types.NMToken _COPIES_DECREASING = new org.apache.axis.types.NMToken("COPIES_DECREASING");
    public static final org.apache.axis.types.NMToken _WAITING_FOR_CONFIRMATION = new org.apache.axis.types.NMToken("WAITING_FOR_CONFIRMATION");
    public static final org.apache.axis.types.NMToken _EXPIRED = new org.apache.axis.types.NMToken("EXPIRED");
    public static final org.apache.axis.types.NMToken _OBSOLETE = new org.apache.axis.types.NMToken("OBSOLETE");
    public static final org.apache.axis.types.NMToken _INACTIVE = new org.apache.axis.types.NMToken("INACTIVE");
    public static final LicenseStateType UNDEFINED = new LicenseStateType(_UNDEFINED);
    public static final LicenseStateType LICENSE_NOT_GENERATED = new LicenseStateType(_LICENSE_NOT_GENERATED);
    public static final LicenseStateType LICENSE_GENERATED = new LicenseStateType(_LICENSE_GENERATED);
    public static final LicenseStateType MARKED_FOR_REMOVAL = new LicenseStateType(_MARKED_FOR_REMOVAL);
    public static final LicenseStateType REMOVED_FROM_LICENSE = new LicenseStateType(_REMOVED_FROM_LICENSE);
    public static final LicenseStateType REMOVAL_PENDING_CONFIRMATION = new LicenseStateType(_REMOVAL_PENDING_CONFIRMATION);
    public static final LicenseStateType COPIES_INCREASING = new LicenseStateType(_COPIES_INCREASING);
    public static final LicenseStateType COPIES_DECREASING = new LicenseStateType(_COPIES_DECREASING);
    public static final LicenseStateType WAITING_FOR_CONFIRMATION = new LicenseStateType(_WAITING_FOR_CONFIRMATION);
    public static final LicenseStateType EXPIRED = new LicenseStateType(_EXPIRED);
    public static final LicenseStateType OBSOLETE = new LicenseStateType(_OBSOLETE);
    public static final LicenseStateType INACTIVE = new LicenseStateType(_INACTIVE);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static LicenseStateType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        LicenseStateType enumeration = (LicenseStateType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LicenseStateType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LicenseStateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "licenseStateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
