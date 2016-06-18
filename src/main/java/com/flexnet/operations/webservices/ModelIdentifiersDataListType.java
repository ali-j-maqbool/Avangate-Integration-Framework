/**
 * ModelIdentifiersDataListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class ModelIdentifiersDataListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.LicenseModelDetailsType[] licenseModel;

    public ModelIdentifiersDataListType() {
    }

    public ModelIdentifiersDataListType(
           com.flexnet.operations.webservices.LicenseModelDetailsType[] licenseModel) {
           this.licenseModel = licenseModel;
    }


    /**
     * Gets the licenseModel value for this ModelIdentifiersDataListType.
     * 
     * @return licenseModel
     */
    public com.flexnet.operations.webservices.LicenseModelDetailsType[] getLicenseModel() {
        return licenseModel;
    }


    /**
     * Sets the licenseModel value for this ModelIdentifiersDataListType.
     * 
     * @param licenseModel
     */
    public void setLicenseModel(com.flexnet.operations.webservices.LicenseModelDetailsType[] licenseModel) {
        this.licenseModel = licenseModel;
    }

    public com.flexnet.operations.webservices.LicenseModelDetailsType getLicenseModel(int i) {
        return this.licenseModel[i];
    }

    public void setLicenseModel(int i, com.flexnet.operations.webservices.LicenseModelDetailsType _value) {
        this.licenseModel[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModelIdentifiersDataListType)) return false;
        ModelIdentifiersDataListType other = (ModelIdentifiersDataListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.licenseModel==null && other.getLicenseModel()==null) || 
             (this.licenseModel!=null &&
              java.util.Arrays.equals(this.licenseModel, other.getLicenseModel())));
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
        if (getLicenseModel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLicenseModel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLicenseModel(), i);
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
        new org.apache.axis.description.TypeDesc(ModelIdentifiersDataListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "modelIdentifiersDataListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseModel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelDetailsType"));
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
