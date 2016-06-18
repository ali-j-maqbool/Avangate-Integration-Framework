/*
 * Decompiled with CFR 0_114.
 */
package com.flexerasoftware.fnocc.vo;

public abstract class BaseVO {
    private String id;
    private String lastModifiedDate;

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "BaseVO [id=" + this.id + ", lastModifiedDate=" + this.lastModifiedDate + "]";
    }
}
