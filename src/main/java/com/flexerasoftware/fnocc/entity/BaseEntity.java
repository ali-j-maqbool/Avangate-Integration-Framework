/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  javax.persistence.GeneratedValue
 *  javax.persistence.GenerationType
 *  javax.persistence.Id
 *  javax.persistence.MappedSuperclass
 */
package com.flexerasoftware.fnocc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity
implements Serializable {
    private static final long serialVersionUID = -2815791021765339452L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private Date createDate = new Date();
    private Date updateDate = new Date();
    private String createdBy = "SYSTEM";
    private String updatedBy = "SYSTEM";

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
