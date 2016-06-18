/*
 * Decompiled with CFR 0_114.
 */
package com.flexerasoftware.fnocc.vo;

import com.flexerasoftware.fnocc.vo.BaseVO;

public class AddressVO
extends BaseVO {
    public String address1;
    public String address2;
    public String city;
    public String state;
    public String zipcode;
    public String country;
    public String region;

    public String getAddress1() {
        return this.address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
