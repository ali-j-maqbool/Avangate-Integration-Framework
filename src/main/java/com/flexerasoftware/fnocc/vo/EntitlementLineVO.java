/*
 * Decompiled with CFR 0_114.
 */
package com.flexerasoftware.fnocc.vo;

import com.flexerasoftware.fnocc.vo.BaseVO;
import java.util.Date;

public class EntitlementLineVO
extends BaseVO {
    public long lineNumber;
    public String SKU;
    public String product;
    public String productVersion;
    public Date effectiveDate;
    public Date expirationDate;
    public int quantity;
    public String licenseCode;
    public byte[] binLicenseCode;

    public void setProduct(String product) {
        this.product = product;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public long getLineNumber() {
        return this.lineNumber;
    }

    public void setLineNumber(long lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getSKU() {
        return this.SKU;
    }

    public void setSKU(String sKU) {
        this.SKU = sKU;
    }

    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProduct() {
        return this.product;
    }

    public String getProductVersion() {
        return this.productVersion;
    }

    public String getLicenseCode() {
        return this.licenseCode;
    }

    public byte[] getBinLicenseCode() {
        return this.binLicenseCode;
    }

    public void setBinLicenseCode(byte[] binLicenseCode) {
        this.binLicenseCode = binLicenseCode;
    }
}
