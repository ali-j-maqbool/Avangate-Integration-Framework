/*
 * Decompiled with CFR 0_114.
 */
package com.flexerasoftware.fnocc.vo;

import java.util.ArrayList;
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

    public void addLine(EntitlementLineVO line ) {
        ArrayList<EntitlementLineVO>  newLines= new ArrayList<EntitlementLineVO>();
        for (EntitlementLineVO element : lines) {
            newLines.add(element);
        }
        //now add the new one
        newLines.add(line);
        lines = null;
        lines = newLines.toArray(new EntitlementLineVO[0]);
    }
}
