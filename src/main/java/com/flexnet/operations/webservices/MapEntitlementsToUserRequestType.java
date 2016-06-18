/**
 * MapEntitlementsToUserRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class MapEntitlementsToUserRequestType  implements java.io.Serializable {
    private java.lang.String userId;

    private com.flexnet.operations.webservices.IdListType idList;

    private java.lang.String userOrg;

    public MapEntitlementsToUserRequestType() {
    }

    public MapEntitlementsToUserRequestType(
           java.lang.String userId,
           com.flexnet.operations.webservices.IdListType idList,
           java.lang.String userOrg) {
           this.userId = userId;
           this.idList = idList;
           this.userOrg = userOrg;
    }


    /**
     * Gets the userId value for this MapEntitlementsToUserRequestType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this MapEntitlementsToUserRequestType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the idList value for this MapEntitlementsToUserRequestType.
     * 
     * @return idList
     */
    public com.flexnet.operations.webservices.IdListType getIdList() {
        return idList;
    }


    /**
     * Sets the idList value for this MapEntitlementsToUserRequestType.
     * 
     * @param idList
     */
    public void setIdList(com.flexnet.operations.webservices.IdListType idList) {
        this.idList = idList;
    }


    /**
     * Gets the userOrg value for this MapEntitlementsToUserRequestType.
     * 
     * @return userOrg
     */
    public java.lang.String getUserOrg() {
        return userOrg;
    }


    /**
     * Sets the userOrg value for this MapEntitlementsToUserRequestType.
     * 
     * @param userOrg
     */
    public void setUserOrg(java.lang.String userOrg) {
        this.userOrg = userOrg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapEntitlementsToUserRequestType)) return false;
        MapEntitlementsToUserRequestType other = (MapEntitlementsToUserRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.idList==null && other.getIdList()==null) || 
             (this.idList!=null &&
              this.idList.equals(other.getIdList()))) &&
            ((this.userOrg==null && other.getUserOrg()==null) || 
             (this.userOrg!=null &&
              this.userOrg.equals(other.getUserOrg())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getIdList() != null) {
            _hashCode += getIdList().hashCode();
        }
        if (getUserOrg() != null) {
            _hashCode += getUserOrg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MapEntitlementsToUserRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mapEntitlementsToUserRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "idList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "idListType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userOrg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userOrg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
