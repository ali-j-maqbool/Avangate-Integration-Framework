/*
 * Decompiled with CFR 0_114.
 */
package com.flexerasoftware.fnocc.vo;

public class InjestorResult {
    public static String OK = "OK";
    public static String ERROR = "ERROR";
    private String result;
    private String message;

    public InjestorResult() {
    }

    public InjestorResult(String result, String message) {
        this.result = result;
        this.message = message;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
