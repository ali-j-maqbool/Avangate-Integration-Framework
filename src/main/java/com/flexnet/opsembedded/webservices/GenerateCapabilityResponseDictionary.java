/**
 * GenerateCapabilityResponseDictionary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class GenerateCapabilityResponseDictionary  implements java.io.Serializable {
    private com.flexnet.opsembedded.webservices.GenerateCapabilityResponseDictionaryEntry[] entry;

    public GenerateCapabilityResponseDictionary() {
    }

    public GenerateCapabilityResponseDictionary(
           com.flexnet.opsembedded.webservices.GenerateCapabilityResponseDictionaryEntry[] entry) {
           this.entry = entry;
    }


    /**
     * Gets the entry value for this GenerateCapabilityResponseDictionary.
     * 
     * @return entry
     */
    public com.flexnet.opsembedded.webservices.GenerateCapabilityResponseDictionaryEntry[] getEntry() {
        return entry;
    }


    /**
     * Sets the entry value for this GenerateCapabilityResponseDictionary.
     * 
     * @param entry
     */
    public void setEntry(com.flexnet.opsembedded.webservices.GenerateCapabilityResponseDictionaryEntry[] entry) {
        this.entry = entry;
    }

    public com.flexnet.opsembedded.webservices.GenerateCapabilityResponseDictionaryEntry getEntry(int i) {
        return this.entry[i];
    }

    public void setEntry(int i, com.flexnet.opsembedded.webservices.GenerateCapabilityResponseDictionaryEntry _value) {
        this.entry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateCapabilityResponseDictionary)) return false;
        GenerateCapabilityResponseDictionary other = (GenerateCapabilityResponseDictionary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entry==null && other.getEntry()==null) || 
             (this.entry!=null &&
              java.util.Arrays.equals(this.entry, other.getEntry())));
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
        if (getEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntry(), i);
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
        new org.apache.axis.description.TypeDesc(GenerateCapabilityResponseDictionary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCapabilityResponseDictionary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "entry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCapabilityResponseDictionaryEntry"));
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
