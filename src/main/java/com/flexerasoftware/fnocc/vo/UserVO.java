/*
 * Decompiled with CFR 0_114.
 */
package com.flexerasoftware.fnocc.vo;

import java.util.List;

import com.flexerasoftware.fnocc.vo.AddressVO;
import com.flexerasoftware.fnocc.vo.BaseVO;

public class UserVO
extends BaseVO {
    public String email;
    public String firstName;
    public String lastName;
    public String accountID;
    public AddressVO address;
    public List<String> orgsLinked;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AddressVO getAddress() {
        return this.address;
    }

    public void setAddress(AddressVO address) {
        this.address = address;
    }

    public String getAccountID() {
        return this.accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

	public List<String> getOrgsLinked() {
		return orgsLinked;
	}

	public void setOrgsLinked(List<String> orgsLinked) {
		this.orgsLinked = orgsLinked;
	}
	
	public void addOrgsLinked(String organisationName){
		this.orgsLinked.add(organisationName);
	}
}
