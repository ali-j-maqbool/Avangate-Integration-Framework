/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  com.flexerasoftware.fnocc.vo.AccountVO
 *  com.flexerasoftware.fnocc.vo.EntitlementVO
 *  com.flexerasoftware.fnocc.vo.UserVO
 */
package com.flexerasoftware.fnocc.service;

import com.flexerasoftware.fnocc.vo.AccountVO;
import com.flexerasoftware.fnocc.vo.EntitlementVO;
import com.flexerasoftware.fnocc.vo.UserVO;

public interface IntegrationService {
    public void login() throws Exception;

    public void logout() throws Exception;

    public void addAccount(AccountVO var1) throws Exception;

    public void addUser(UserVO var1) throws Exception;

    public void addEntitlement(EntitlementVO var1) throws Exception;

    public void updateAccount(AccountVO var1) throws Exception;

    public void updateUser(UserVO var1) throws Exception;

    public void updateEntitlement(EntitlementVO var1) throws Exception;

    public AccountVO getAccount(AccountVO var1) throws Exception;

    public UserVO getUser(UserVO var1) throws Exception;
}
