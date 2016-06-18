/**
 * PartnerTierQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class PartnerTierQueryType  implements java.io.Serializable {
    private java.lang.String value;

    private com.flexnet.operations.webservices.SimpleSearchType searchType;

    private java.lang.String partnerTier;

    public PartnerTierQueryType() {
    }

    public PartnerTierQueryType(
           java.lang.String value,
           com.flexnet.operations.webservices.SimpleSearchType searchType,
           java.lang.String partnerTier) {
           this.value = value;
           this.searchType = searchType;
           this.partnerTier = partnerTier;
    }


    /**
     * Gets the value value for this PartnerTierQueryType.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this PartnerTierQueryType.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the searchType value for this PartnerTierQueryType.
     * 
     * @return searchType
     */
    public com.flexnet.operations.webservices.SimpleSearchType getSearchType() {
        return searchType;
    }


    /**
     * Sets the searchType value for this PartnerTierQueryType.
     * 
     * @param searchType
     */
    public void setSearchType(com.flexnet.operations.webservices.SimpleSearchType searchType) {
        this.searchType = searchType;
    }


    /**
     * Gets the partnerTier value for this PartnerTierQueryType.
     * 
     * @return partnerTier
     */
    public java.lang.String getPartnerTier() {
        return partnerTier;
    }


    /**
     * Sets the partnerTier value for this PartnerTierQueryType.
     * 
     * @param partnerTier
     */
    public void setPartnerTier(java.lang.String partnerTier) {
        this.partnerTier = partnerTier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PartnerTierQueryType)) return false;
        PartnerTierQueryType other = (PartnerTierQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.searchType==null && other.getSearchType()==null) || 
             (this.searchType!=null &&
              this.searchType.equals(other.getSearchType()))) &&
            ((this.partnerTier==null && other.getPartnerTier()==null) || 
             (this.partnerTier!=null &&
              this.partnerTier.equals(other.getPartnerTier())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getSearchType() != null) {
            _hashCode += getSearchType().hashCode();
        }
        if (getPartnerTier() != null) {
            _hashCode += getPartnerTier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PartnerTierQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "PartnerTierQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "simpleSearchType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partnerTier"));
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
