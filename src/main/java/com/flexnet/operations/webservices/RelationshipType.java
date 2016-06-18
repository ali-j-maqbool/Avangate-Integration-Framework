/**
 * RelationshipType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class RelationshipType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RelationshipType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _RELATION_UNDEFINED = new org.apache.axis.types.NMToken("RELATION_UNDEFINED");
    public static final org.apache.axis.types.NMToken _PRODUCTION_VERSION_OF = new org.apache.axis.types.NMToken("PRODUCTION_VERSION_OF");
    public static final org.apache.axis.types.NMToken _DEMO_OF = new org.apache.axis.types.NMToken("DEMO_OF");
    public static final org.apache.axis.types.NMToken _UPGRADE_FROM = new org.apache.axis.types.NMToken("UPGRADE_FROM");
    public static final org.apache.axis.types.NMToken _UPGRADE_TO = new org.apache.axis.types.NMToken("UPGRADE_TO");
    public static final org.apache.axis.types.NMToken _UPSELL_FROM = new org.apache.axis.types.NMToken("UPSELL_FROM");
    public static final org.apache.axis.types.NMToken _UPSELL_TO = new org.apache.axis.types.NMToken("UPSELL_TO");
    public static final org.apache.axis.types.NMToken _IS_MAINTENANCE = new org.apache.axis.types.NMToken("IS_MAINTENANCE");
    public static final org.apache.axis.types.NMToken _HAS_MAINTENANCE = new org.apache.axis.types.NMToken("HAS_MAINTENANCE");
    public static final RelationshipType RELATION_UNDEFINED = new RelationshipType(_RELATION_UNDEFINED);
    public static final RelationshipType PRODUCTION_VERSION_OF = new RelationshipType(_PRODUCTION_VERSION_OF);
    public static final RelationshipType DEMO_OF = new RelationshipType(_DEMO_OF);
    public static final RelationshipType UPGRADE_FROM = new RelationshipType(_UPGRADE_FROM);
    public static final RelationshipType UPGRADE_TO = new RelationshipType(_UPGRADE_TO);
    public static final RelationshipType UPSELL_FROM = new RelationshipType(_UPSELL_FROM);
    public static final RelationshipType UPSELL_TO = new RelationshipType(_UPSELL_TO);
    public static final RelationshipType IS_MAINTENANCE = new RelationshipType(_IS_MAINTENANCE);
    public static final RelationshipType HAS_MAINTENANCE = new RelationshipType(_HAS_MAINTENANCE);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static RelationshipType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        RelationshipType enumeration = (RelationshipType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RelationshipType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RelationshipType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relationshipType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
