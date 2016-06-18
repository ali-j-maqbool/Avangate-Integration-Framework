/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonIgnore
 *  com.flexerasoftware.fnocc.entity.BaseEntity
 *  com.flexerasoftware.fnocc.enums.IntegrationTypeEnum
 *  javax.persistence.Entity
 */
package com.flexerasoftware.fnocc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flexerasoftware.fnocc.entity.BaseEntity;
import com.flexerasoftware.fnocc.enums.IntegrationTypeEnum;
import javax.persistence.Entity;

@Entity
public class IntegrationCredentialsEntity
extends BaseEntity {
    private static final long serialVersionUID = 5012119006028128955L;
    public String user;
    private String password;
    public IntegrationTypeEnum integrationType;
    public String llmProducerPortalUrl;
    public String llmEnterprisePortalUrl;
    public String llmPartner;
    public String llmEndpoint;
    public String llmXmlEndpoint;
    public String llmBatchEndpoint;
    public String almProducerPortalUrl;
    public String almEnterprisePortalUrl;
    public String almEntitlementOrderEndpoint;
    public String almUserOrgHierarchyEndpoint;
    public String almProductPackagingEndpoint;

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @JsonIgnore
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLlmProducerPortalUrl() {
        return this.llmProducerPortalUrl;
    }

    public void setLlmProducerPortalUrl(String llmProducerPortalUrl) {
        this.llmProducerPortalUrl = llmProducerPortalUrl;
    }

    public String getLlmEnterprisePortalUrl() {
        return this.llmEnterprisePortalUrl;
    }

    public void setLlmEnterprisePortalUrl(String llmEnterprisePortalUrl) {
        this.llmEnterprisePortalUrl = llmEnterprisePortalUrl;
    }

    public String getLlmPartner() {
        return this.llmPartner;
    }

    public void setLlmPartner(String llmPartner) {
        this.llmPartner = llmPartner;
    }

    public String getLlmEndpoint() {
        return this.llmEndpoint;
    }

    public void setLlmEndpoint(String llmEndpoint) {
        this.llmEndpoint = llmEndpoint;
    }

    public String getLlmXmlEndpoint() {
        return this.llmXmlEndpoint;
    }

    public void setLlmXmlEndpoint(String llmXmlEndpoint) {
        this.llmXmlEndpoint = llmXmlEndpoint;
    }

    public String getLlmBatchEndpoint() {
        return this.llmBatchEndpoint;
    }

    public void setLlmBatchEndpoint(String llmBatchEndpoint) {
        this.llmBatchEndpoint = llmBatchEndpoint;
    }

    public String getAlmProducerPortalUrl() {
        return this.almProducerPortalUrl;
    }

    public void setAlmProducerPortalUrl(String almProducerPortalUrl) {
        this.almProducerPortalUrl = almProducerPortalUrl;
    }

    public String getAlmEnterprisePortalUrl() {
        return this.almEnterprisePortalUrl;
    }

    public void setAlmEnterprisePortalUrl(String almEnterprisePortalUrl) {
        this.almEnterprisePortalUrl = almEnterprisePortalUrl;
    }

    public String getAlmEntitlementOrderEndpoint() {
        return this.almEntitlementOrderEndpoint;
    }

    public void setAlmEntitlementOrderEndpoint(String almEntitlementOrderEndpoint) {
        this.almEntitlementOrderEndpoint = almEntitlementOrderEndpoint;
    }

    public String getAlmUserOrgHierarchyEndpoint() {
        return this.almUserOrgHierarchyEndpoint;
    }

    public void setAlmUserOrgHierarchyEndpoint(String almUserOrgHierarchyEndpoint) {
        this.almUserOrgHierarchyEndpoint = almUserOrgHierarchyEndpoint;
    }

    public String getAlmProductPackagingEndpoint() {
        return this.almProductPackagingEndpoint;
    }

    public void setAlmProductPackagingEndpoint(String almProductPackagingEndpoint) {
        this.almProductPackagingEndpoint = almProductPackagingEndpoint;
    }

    public IntegrationTypeEnum getIntegrationType() {
        return this.integrationType;
    }

    public void setIntegrationType(IntegrationTypeEnum integrationType) {
        this.integrationType = integrationType;
    }
}
