/*
 * Decompiled with CFR 0_114.
 */
package com.flexerasoftware.fnocc.vo;

import com.flexerasoftware.fnocc.vo.AccountVO;
import com.flexerasoftware.fnocc.vo.BaseVO;
import com.flexerasoftware.fnocc.vo.EntitlementLineVO;
import java.util.Date;

public class EntitlementVO
extends BaseVO {
    public AccountVO account;
    public Date orderDate;
    public EntitlementLineVO[] lines;

    public AccountVO getAccount() {
        return this.account;
    }

    public void setAccount(AccountVO account) {
        this.account = account;
    }

    public EntitlementLineVO[] getLines() {
        return this.lines;
    }

    public void setLines(EntitlementLineVO[] lines) {
        this.lines = lines;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
