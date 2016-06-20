/**
 * GetDeletedSyncDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GetDeletedSyncDataType  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.DeletedSyncDataType[] deletedSync;

    public GetDeletedSyncDataType() {
    }

    public GetDeletedSyncDataType(
           com.flexnet.opsembedded.webservices.DeletedSyncDataType[] deletedSync) {
           this.deletedSync = deletedSync;
    }


    /**
     * Gets the deletedSync value for this GetDeletedSyncDataType.
     * 
     * @return deletedSync
     */
    public com.flexnet.opsembedded.webservices.DeletedSyncDataType[] getDeletedSync() {
        return deletedSync;
    }


    /**
     * Sets the deletedSync value for this GetDeletedSyncDataType.
     * 
     * @param deletedSync
     */
    public void setDeletedSync(com.flexnet.opsembedded.webservices.DeletedSyncDataType[] deletedSync) {
        this.deletedSync = deletedSync;
    }

    public com.flexnet.opsembedded.webservices.DeletedSyncDataType getDeletedSync(int i) {
        return this.deletedSync[i];
    }

    public void setDeletedSync(int i, com.flexnet.opsembedded.webservices.DeletedSyncDataType _value) {
        this.deletedSync[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeletedSyncDataType)) return false;
        GetDeletedSyncDataType other = (GetDeletedSyncDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deletedSync==null && other.getDeletedSync()==null) || 
             (this.deletedSync!=null &&
              java.util.Arrays.equals(this.deletedSync, other.getDeletedSync())));
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
        if (getDeletedSync() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeletedSync());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeletedSync(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDeletedSyncDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeletedSyncDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedSync");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deletedSync"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deletedSyncDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
