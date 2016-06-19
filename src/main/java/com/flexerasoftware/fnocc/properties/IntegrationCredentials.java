/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  com.flexerasoftware.fnocc.entity.IntegrationCredentialsEntity
 */
package com.flexerasoftware.fnocc.properties;

import com.flexerasoftware.fnocc.entity.IntegrationCredentialsEntity;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Properties;

public class IntegrationCredentials {
    public String ENDPOINT = "";
    public String PRODUCT_PACKAGING_SERVICE = "";
    public String ENTITLEMENT_ORDER_SERVICE_ENDPOINT = "";
    public String USER_ORG_HIERARCHY_SERVICE = "";
    public String MANAGE_DEVICE_SERVICE = "";
    public String XMLENDPOINT = "";
    public String BATCHENDPOINT = "";
    public String USER = "";
    public String PARTNER = "";
    public String PASSWORD = "";

    public IntegrationCredentials() {
    }

    public IntegrationCredentials(String file) throws Exception {
        Properties properties = new Properties();
        System.out.println("file=" + file);
        try {
            InputStream iostream = this.getClass().getClassLoader().getResourceAsStream(file);
            if (null == iostream) {
                throw new Exception("Cannot find application properties;");
            }
            properties.load(iostream);
            this.ENDPOINT = properties.getProperty("ENDPOINT");
            this.XMLENDPOINT = properties.getProperty("XMLENDPOINT");
            this.BATCHENDPOINT = properties.getProperty("BATCHENDPOINT");
            this.USER = properties.getProperty("USER");
            this.PARTNER = properties.getProperty("PARTNER");
            this.PASSWORD = properties.getProperty("PASSWORD");
            this.PRODUCT_PACKAGING_SERVICE = properties.getProperty("PRODUCT_PACKAGING_SERVICE");
            this.ENTITLEMENT_ORDER_SERVICE_ENDPOINT = properties.getProperty("ENTITLEMENT_ORDER_SERVICE_ENDPOINT");
            this.USER_ORG_HIERARCHY_SERVICE = properties.getProperty("USER_ORG_HIERARCHY_SERVICE");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public IntegrationCredentials(IntegrationCredentialsEntity ice) throws Exception {
        try {
            this.ENDPOINT = ice.getLlmEndpoint();
            this.XMLENDPOINT = ice.getLlmXmlEndpoint();
            this.BATCHENDPOINT = ice.getLlmBatchEndpoint();
            this.PARTNER = ice.getLlmPartner();
            this.USER = ice.getUser();
            this.PASSWORD = ice.getPassword();
            this.PRODUCT_PACKAGING_SERVICE = ice.getAlmProductPackagingEndpoint();
            this.ENTITLEMENT_ORDER_SERVICE_ENDPOINT = ice.getAlmEntitlementOrderEndpoint();
            this.USER_ORG_HIERARCHY_SERVICE = ice.getAlmUserOrgHierarchyEndpoint();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
