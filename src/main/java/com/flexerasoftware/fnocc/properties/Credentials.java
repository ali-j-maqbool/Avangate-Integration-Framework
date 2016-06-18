/*
 * Decompiled with CFR 0_114.
 */
package com.flexerasoftware.fnocc.properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Properties;

public class Credentials {
    private static Credentials instance;
    public static String ENDPOINT;
    public static String PRODUCT_PACKAGING_SERVICE;
    public static String ENTITLEMENT_ORDER_SERVICE_ENDPOINT;
    public static String USER_ORG_HIERARCHY_SERVICE;
    public static String XMLENDPOINT;
    public static String BATCHENDPOINT;
    public static String USER;
    public static String PARTNER;
    public static String PASSWORD;

    private Credentials() {
    }

    private Credentials(String file) throws Exception {
        Properties properties = new Properties();
        System.out.println("file=" + file);
        try {
            InputStream iostream = this.getClass().getClassLoader().getResourceAsStream(file);
            if (null == iostream) {
                throw new Exception("Cannot find application properties;");
            }
            properties.load(iostream);
            ENDPOINT = properties.getProperty("ENDPOINT");
            XMLENDPOINT = properties.getProperty("XMLENDPOINT");
            BATCHENDPOINT = properties.getProperty("BATCHENDPOINT");
            USER = properties.getProperty("USER");
            PARTNER = properties.getProperty("PARTNER");
            PASSWORD = properties.getProperty("PASSWORD");
            PRODUCT_PACKAGING_SERVICE = properties.getProperty("PRODUCT_PACKAGING_SERVICE");
            ENTITLEMENT_ORDER_SERVICE_ENDPOINT = properties.getProperty("ENTITLEMENT_ORDER_SERVICE_ENDPOINT");
            USER_ORG_HIERARCHY_SERVICE = properties.getProperty("USER_ORG_HIERARCHY_SERVICE");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Credentials getInstance(String file) throws Exception {
        if (instance == null) {
            instance = new Credentials(file);
        }
        return instance;
    }

    static {
        ENDPOINT = "";
        PRODUCT_PACKAGING_SERVICE = "";
        ENTITLEMENT_ORDER_SERVICE_ENDPOINT = "";
        USER_ORG_HIERARCHY_SERVICE = "";
        XMLENDPOINT = "";
        BATCHENDPOINT = "";
        USER = "";
        PARTNER = "";
        PASSWORD = "";
    }
}
