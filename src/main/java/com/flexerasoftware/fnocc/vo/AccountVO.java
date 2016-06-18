/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  com.flexerasoftware.fnocc.vo.AddressVO
 *  com.flexerasoftware.fnocc.vo.BaseVO
 *  com.flexerasoftware.fnocc.vo.UserVO
 */
package com.flexerasoftware.fnocc.vo;

import com.flexerasoftware.fnocc.vo.AddressVO;
import com.flexerasoftware.fnocc.vo.BaseVO;
import com.flexerasoftware.fnocc.vo.UserVO;

public class AccountVO
extends BaseVO {
    private String name;
    private AddressVO address;
    private UserVO[] users;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressVO getAddress() {
        return this.address;
    }

    public void setAddress(AddressVO address) {
        this.address = address;
    }

    public UserVO[] getUsers() {
        return this.users;
    }

    public void setUsers(UserVO[] users) {
        this.users = users;
    }
}
