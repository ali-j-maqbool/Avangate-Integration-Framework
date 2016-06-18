/**
 * PolicyAttributesListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class PolicyAttributesListType  implements java.io.Serializable {
    private com.flexnet.operations.webservices.PolicyDataType rehostsPolicy;

    private com.flexnet.operations.webservices.PolicyDataType returnsPolicy;

    private com.flexnet.operations.webservices.PolicyDataType repairsPolicy;

    private com.flexnet.operations.webservices.ExtraActivationDataType extraActivationsPolicy;

    private com.flexnet.operations.webservices.CancelLicensePolicyDataType cancelLicensePolicy;

    private com.flexnet.operations.webservices.VirtualLicensePolicyDataType virtualLicensePolicy;

    private com.flexnet.operations.webservices.ReinstallPolicyDataType reinstallPolicy;

    private com.flexnet.operations.webservices.AcpiGenerationIdLicensePolicyDataType acpiGenerationIdLicensePolicy;

    public PolicyAttributesListType() {
    }

    public PolicyAttributesListType(
           com.flexnet.operations.webservices.PolicyDataType rehostsPolicy,
           com.flexnet.operations.webservices.PolicyDataType returnsPolicy,
           com.flexnet.operations.webservices.PolicyDataType repairsPolicy,
           com.flexnet.operations.webservices.ExtraActivationDataType extraActivationsPolicy,
           com.flexnet.operations.webservices.CancelLicensePolicyDataType cancelLicensePolicy,
           com.flexnet.operations.webservices.VirtualLicensePolicyDataType virtualLicensePolicy,
           com.flexnet.operations.webservices.ReinstallPolicyDataType reinstallPolicy,
           com.flexnet.operations.webservices.AcpiGenerationIdLicensePolicyDataType acpiGenerationIdLicensePolicy) {
           this.rehostsPolicy = rehostsPolicy;
           this.returnsPolicy = returnsPolicy;
           this.repairsPolicy = repairsPolicy;
           this.extraActivationsPolicy = extraActivationsPolicy;
           this.cancelLicensePolicy = cancelLicensePolicy;
           this.virtualLicensePolicy = virtualLicensePolicy;
           this.reinstallPolicy = reinstallPolicy;
           this.acpiGenerationIdLicensePolicy = acpiGenerationIdLicensePolicy;
    }


    /**
     * Gets the rehostsPolicy value for this PolicyAttributesListType.
     * 
     * @return rehostsPolicy
     */
    public com.flexnet.operations.webservices.PolicyDataType getRehostsPolicy() {
        return rehostsPolicy;
    }


    /**
     * Sets the rehostsPolicy value for this PolicyAttributesListType.
     * 
     * @param rehostsPolicy
     */
    public void setRehostsPolicy(com.flexnet.operations.webservices.PolicyDataType rehostsPolicy) {
        this.rehostsPolicy = rehostsPolicy;
    }


    /**
     * Gets the returnsPolicy value for this PolicyAttributesListType.
     * 
     * @return returnsPolicy
     */
    public com.flexnet.operations.webservices.PolicyDataType getReturnsPolicy() {
        return returnsPolicy;
    }


    /**
     * Sets the returnsPolicy value for this PolicyAttributesListType.
     * 
     * @param returnsPolicy
     */
    public void setReturnsPolicy(com.flexnet.operations.webservices.PolicyDataType returnsPolicy) {
        this.returnsPolicy = returnsPolicy;
    }


    /**
     * Gets the repairsPolicy value for this PolicyAttributesListType.
     * 
     * @return repairsPolicy
     */
    public com.flexnet.operations.webservices.PolicyDataType getRepairsPolicy() {
        return repairsPolicy;
    }


    /**
     * Sets the repairsPolicy value for this PolicyAttributesListType.
     * 
     * @param repairsPolicy
     */
    public void setRepairsPolicy(com.flexnet.operations.webservices.PolicyDataType repairsPolicy) {
        this.repairsPolicy = repairsPolicy;
    }


    /**
     * Gets the extraActivationsPolicy value for this PolicyAttributesListType.
     * 
     * @return extraActivationsPolicy
     */
    public com.flexnet.operations.webservices.ExtraActivationDataType getExtraActivationsPolicy() {
        return extraActivationsPolicy;
    }


    /**
     * Sets the extraActivationsPolicy value for this PolicyAttributesListType.
     * 
     * @param extraActivationsPolicy
     */
    public void setExtraActivationsPolicy(com.flexnet.operations.webservices.ExtraActivationDataType extraActivationsPolicy) {
        this.extraActivationsPolicy = extraActivationsPolicy;
    }


    /**
     * Gets the cancelLicensePolicy value for this PolicyAttributesListType.
     * 
     * @return cancelLicensePolicy
     */
    public com.flexnet.operations.webservices.CancelLicensePolicyDataType getCancelLicensePolicy() {
        return cancelLicensePolicy;
    }


    /**
     * Sets the cancelLicensePolicy value for this PolicyAttributesListType.
     * 
     * @param cancelLicensePolicy
     */
    public void setCancelLicensePolicy(com.flexnet.operations.webservices.CancelLicensePolicyDataType cancelLicensePolicy) {
        this.cancelLicensePolicy = cancelLicensePolicy;
    }


    /**
     * Gets the virtualLicensePolicy value for this PolicyAttributesListType.
     * 
     * @return virtualLicensePolicy
     */
    public com.flexnet.operations.webservices.VirtualLicensePolicyDataType getVirtualLicensePolicy() {
        return virtualLicensePolicy;
    }


    /**
     * Sets the virtualLicensePolicy value for this PolicyAttributesListType.
     * 
     * @param virtualLicensePolicy
     */
    public void setVirtualLicensePolicy(com.flexnet.operations.webservices.VirtualLicensePolicyDataType virtualLicensePolicy) {
        this.virtualLicensePolicy = virtualLicensePolicy;
    }


    /**
     * Gets the reinstallPolicy value for this PolicyAttributesListType.
     * 
     * @return reinstallPolicy
     */
    public com.flexnet.operations.webservices.ReinstallPolicyDataType getReinstallPolicy() {
        return reinstallPolicy;
    }


    /**
     * Sets the reinstallPolicy value for this PolicyAttributesListType.
     * 
     * @param reinstallPolicy
     */
    public void setReinstallPolicy(com.flexnet.operations.webservices.ReinstallPolicyDataType reinstallPolicy) {
        this.reinstallPolicy = reinstallPolicy;
    }


    /**
     * Gets the acpiGenerationIdLicensePolicy value for this PolicyAttributesListType.
     * 
     * @return acpiGenerationIdLicensePolicy
     */
    public com.flexnet.operations.webservices.AcpiGenerationIdLicensePolicyDataType getAcpiGenerationIdLicensePolicy() {
        return acpiGenerationIdLicensePolicy;
    }


    /**
     * Sets the acpiGenerationIdLicensePolicy value for this PolicyAttributesListType.
     * 
     * @param acpiGenerationIdLicensePolicy
     */
    public void setAcpiGenerationIdLicensePolicy(com.flexnet.operations.webservices.AcpiGenerationIdLicensePolicyDataType acpiGenerationIdLicensePolicy) {
        this.acpiGenerationIdLicensePolicy = acpiGenerationIdLicensePolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyAttributesListType)) return false;
        PolicyAttributesListType other = (PolicyAttributesListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rehostsPolicy==null && other.getRehostsPolicy()==null) || 
             (this.rehostsPolicy!=null &&
              this.rehostsPolicy.equals(other.getRehostsPolicy()))) &&
            ((this.returnsPolicy==null && other.getReturnsPolicy()==null) || 
             (this.returnsPolicy!=null &&
              this.returnsPolicy.equals(other.getReturnsPolicy()))) &&
            ((this.repairsPolicy==null && other.getRepairsPolicy()==null) || 
             (this.repairsPolicy!=null &&
              this.repairsPolicy.equals(other.getRepairsPolicy()))) &&
            ((this.extraActivationsPolicy==null && other.getExtraActivationsPolicy()==null) || 
             (this.extraActivationsPolicy!=null &&
              this.extraActivationsPolicy.equals(other.getExtraActivationsPolicy()))) &&
            ((this.cancelLicensePolicy==null && other.getCancelLicensePolicy()==null) || 
             (this.cancelLicensePolicy!=null &&
              this.cancelLicensePolicy.equals(other.getCancelLicensePolicy()))) &&
            ((this.virtualLicensePolicy==null && other.getVirtualLicensePolicy()==null) || 
             (this.virtualLicensePolicy!=null &&
              this.virtualLicensePolicy.equals(other.getVirtualLicensePolicy()))) &&
            ((this.reinstallPolicy==null && other.getReinstallPolicy()==null) || 
             (this.reinstallPolicy!=null &&
              this.reinstallPolicy.equals(other.getReinstallPolicy()))) &&
            ((this.acpiGenerationIdLicensePolicy==null && other.getAcpiGenerationIdLicensePolicy()==null) || 
             (this.acpiGenerationIdLicensePolicy!=null &&
              this.acpiGenerationIdLicensePolicy.equals(other.getAcpiGenerationIdLicensePolicy())));
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
        if (getRehostsPolicy() != null) {
            _hashCode += getRehostsPolicy().hashCode();
        }
        if (getReturnsPolicy() != null) {
            _hashCode += getReturnsPolicy().hashCode();
        }
        if (getRepairsPolicy() != null) {
            _hashCode += getRepairsPolicy().hashCode();
        }
        if (getExtraActivationsPolicy() != null) {
            _hashCode += getExtraActivationsPolicy().hashCode();
        }
        if (getCancelLicensePolicy() != null) {
            _hashCode += getCancelLicensePolicy().hashCode();
        }
        if (getVirtualLicensePolicy() != null) {
            _hashCode += getVirtualLicensePolicy().hashCode();
        }
        if (getReinstallPolicy() != null) {
            _hashCode += getReinstallPolicy().hashCode();
        }
        if (getAcpiGenerationIdLicensePolicy() != null) {
            _hashCode += getAcpiGenerationIdLicensePolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyAttributesListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyAttributesListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rehostsPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "rehostsPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnsPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "returnsPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repairsPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "repairsPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraActivationsPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "extraActivationsPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "extraActivationDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelLicensePolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "cancelLicensePolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "cancelLicensePolicyDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualLicensePolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "virtualLicensePolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "virtualLicensePolicyDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reinstallPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "reinstallPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "reinstallPolicyDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acpiGenerationIdLicensePolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "acpiGenerationIdLicensePolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "acpiGenerationIdLicensePolicyDataType"));
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
