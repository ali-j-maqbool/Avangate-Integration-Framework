/**
 * EntitlementOrderServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class EntitlementOrderServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.flexnet.operations.webservices.EntitlementOrderServiceInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[42];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createBulkEntitlement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createBulkEntitlementRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createBulkEntitlementRequestType"), com.flexnet.operations.webservices.CreateBulkEntitlementRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createBulkEntitlementResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.CreateBulkEntitlementResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createBulkEntitlementResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSimpleEntitlement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createSimpleEntitlementRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createSimpleEntitlementRequestType"), com.flexnet.operations.webservices.CreateSimpleEntitlementRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createSimpleEntitlementResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.CreateSimpleEntitlementResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createSimpleEntitlementResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteEntitlement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteEntitlementRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteEntitlementRequestType"), com.flexnet.operations.webservices.DeleteEntitlementRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteEntitlementResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.DeleteEntitlementResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteEntitlementResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createWebRegKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addWebRegKeyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addWebRegKeyRequestType"), com.flexnet.operations.webservices.AddWebRegKeyRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addWebRegKeyResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.AddWebRegKeyResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addWebRegKeyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateBulkEntitlement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateBulkEntitlementRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateBulkEntitlementRequestType"), com.flexnet.operations.webservices.UpdateBulkEntitlementRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateBulkEntitlementResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.UpdateBulkEntitlementResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateBulkEntitlementResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSimpleEntitlement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateSimpleEntitlementRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateSimpleEntitlementRequestType"), com.flexnet.operations.webservices.UpdateSimpleEntitlementRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateSimpleEntitlementResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.UpdateSimpleEntitlementResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateSimpleEntitlementResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createEntitlementLineItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createEntitlementLineItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addOrReplaceEntitlementLineItemRequestType"), com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addOrReplaceEntitlementLineItemResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createEntitlementLineItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("replaceEntitlementLineItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "replaceEntitlementLineItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addOrReplaceEntitlementLineItemRequestType"), com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addOrReplaceEntitlementLineItemResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "replaceEntitlementLineItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteEntitlementLineItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "removeEntitlementLineItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "removeEntitlementLineItemRequestType"), com.flexnet.operations.webservices.RemoveEntitlementLineItemRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "removeEntitlementLineItemResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.RemoveEntitlementLineItemResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "removeEntitlementLineItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateEntitlementLineItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateEntitlementLineItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateEntitlementLineItemRequestType"), com.flexnet.operations.webservices.UpdateEntitlementLineItemRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateEntitlementLineItemResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.UpdateEntitlementLineItemResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateEntitlementLineItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEntitlementsQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementRequestType"), com.flexnet.operations.webservices.SearchEntitlementRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.SearchEntitlementResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBulkEntitlementPropertiesQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementPropertiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementPropertiesRequestType"), com.flexnet.operations.webservices.GetBulkEntitlementPropertiesRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementPropertiesResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetBulkEntitlementPropertiesResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementPropertiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBulkEntitlementCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementCountRequestType"), com.flexnet.operations.webservices.GetBulkEntitlementCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementCountResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetBulkEntitlementCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getActivatableItemsQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchActivatableItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchActivatableItemRequestType"), com.flexnet.operations.webservices.SearchActivatableItemRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchActivatableItemResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.SearchActivatableItemResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchActivatableItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEntitlementLineItemPropertiesQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementLineItemPropertiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementLineItemPropertiesRequestType"), com.flexnet.operations.webservices.SearchEntitlementLineItemPropertiesRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementLineItemPropertiesResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.SearchEntitlementLineItemPropertiesResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementLineItemPropertiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEntitlementCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementCountRequestType"), com.flexnet.operations.webservices.GetEntitlementCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementCountResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetEntitlementCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getActivatableItemCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getActivatableItemCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getActivatableItemCountRequestType"), com.flexnet.operations.webservices.GetActivatableItemCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getActivatableItemCountResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetActivatableItemCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getActivatableItemCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExactAvailableCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getExactAvailableCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getExactAvailableCountRequestType"), com.flexnet.operations.webservices.GetExactAvailableCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getExactAvailableCountResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetExactAvailableCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getExactAvailableCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setEntitlementState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setEntitlementStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setEntitlementStateRequestType"), com.flexnet.operations.webservices.SetEntitlementStateRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setEntitlementStateResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.SetEntitlementStateResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setEntitlementStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebRegKeyCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeyCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeyCountRequestType"), com.flexnet.operations.webservices.GetWebRegKeyCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeyCountResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetWebRegKeyCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeyCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebRegKeysQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeysQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeysQueryRequestType"), com.flexnet.operations.webservices.GetWebRegKeysQueryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeysQueryResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetWebRegKeysQueryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeysQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEntitlementAttributesFromModel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementAttributesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementAttributesRequestType"), com.flexnet.operations.webservices.GetEntitlementAttributesRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementAttributesResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetEntitlementAttributesResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("renewLicense");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewLicenseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewEntitlementRequestType"), com.flexnet.operations.webservices.RenewEntitlementRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewEntitlementResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.RenewEntitlementResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewLicenseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("upgradeLicense");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "upgradeLicenseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "EntitlementLifeCycleRequestType"), com.flexnet.operations.webservices.EntitlementLifeCycleRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "EntitlementLifeCycleResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.EntitlementLifeCycleResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "upgradeLicenseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("upsellLicense");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "upsellLicenseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "EntitlementLifeCycleRequestType"), com.flexnet.operations.webservices.EntitlementLifeCycleRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "EntitlementLifeCycleResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.EntitlementLifeCycleResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "upsellLicenseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mapEntitlementsToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mapEntitlementsToUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mapEntitlementsToUserRequestType"), com.flexnet.operations.webservices.MapEntitlementsToUserRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mapEntitlementsToUserResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.MapEntitlementsToUserResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mapEntitlementsToUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("emailEntitlement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailEntitlementRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailEntitlementRequestType"), com.flexnet.operations.webservices.EmailEntitlementRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailEntitlementResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.EmailEntitlementResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailEntitlementResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("emailActivatableItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailActivatableItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailActivatableItemRequestType"), com.flexnet.operations.webservices.EmailActivatableItemRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailActivatableItemResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.EmailActivatableItemResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailActivatableItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLineItemState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setLineItemStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setLineItemStateRequestType"), com.flexnet.operations.webservices.SetLineItemStateRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setLineItemStateResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.SetLineItemStateResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setLineItemStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setMaintenanceLineItemState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setMaintenanceLineItemStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setMaintenanceLineItemStateRequestType"), com.flexnet.operations.webservices.SetMaintenanceLineItemStateRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setMaintenanceLineItemStateResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.SetMaintenanceLineItemStateResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setMaintenanceLineItemStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteWebRegKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteWebRegKeyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteWebRegKeyRequestType"), com.flexnet.operations.webservices.DeleteWebRegKeyRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteWebRegKeyResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.DeleteWebRegKeyResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteWebRegKeyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mergeEntitlements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mergeEntitlementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mergeEntitlementsRequestType"), com.flexnet.operations.webservices.MergeEntitlementsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mergeEntitlementsResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.MergeEntitlementsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mergeEntitlementsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transferEntitlement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferEntitlementsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferEntitlementsRequestType"), com.flexnet.operations.webservices.TransferEntitlementsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferEntitlementsResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.TransferEntitlementsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferEntitlementsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transferLineItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferLineItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferLineItemsRequestType"), com.flexnet.operations.webservices.TransferLineItemsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferLineItemsResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.TransferLineItemsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferLineItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getStateChangeHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getStateChangeHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getStateChangeHistoryRequestType"), com.flexnet.operations.webservices.GetStateChangeHistoryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getStateChangeHistoryResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetStateChangeHistoryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getStateChangeHistoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("linkMaintenanceLineItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkMaintenanceLineItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkMaintenanceLineItemRequestType"), com.flexnet.operations.webservices.LinkMaintenanceLineItemRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkMaintenanceLineItemResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.LinkMaintenanceLineItemResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkMaintenanceLineItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("splitLineItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItemRequestType"), com.flexnet.operations.webservices.SplitLineItemRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItemResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.SplitLineItemResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("splitBulkEntitlement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementRequestType"), com.flexnet.operations.webservices.SplitBulkEntitlementRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.SplitBulkEntitlementResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMatchingLineItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingLineItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingLineItemsRequestType"), com.flexnet.operations.webservices.GetMatchingLineItemsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingLineItemsResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetMatchingLineItemsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingLineItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMatchingBulkEnts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingBulkEntsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingBulkEntsRequestType"), com.flexnet.operations.webservices.GetMatchingBulkEntsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingBulkEntsResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetMatchingBulkEntsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingBulkEntsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteMaintenanceLineItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceLineItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceLineItemRequestType"), com.flexnet.operations.webservices.DeleteMaintenanceLineItemRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceLineItemResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.DeleteMaintenanceLineItemResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceLineItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unlinkMaintenanceLineItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItemRequestType"), com.flexnet.operations.webservices.UnlinkMaintenanceLineItemRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItemResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.UnlinkMaintenanceLineItemResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

    }

    public EntitlementOrderServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EntitlementOrderServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EntitlementOrderServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "acpiGenerationIdLicensePolicyDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AcpiGenerationIdLicensePolicyDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "activatableItemDetailType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ActivatableItemDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "ActivatableItemType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ActivatableItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addedEntitlementLineItemDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AddedEntitlementLineItemDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addedEntitlementLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AddedEntitlementLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addEntitlementLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AddEntitlementLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addOrReplaceEntitlementLineItemRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addOrReplaceEntitlementLineItemResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addWebRegKeyDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AddWebRegKeyDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addWebRegKeyRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AddWebRegKeyRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addWebRegKeyResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AddWebRegKeyResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "advancedReinstallPolicyType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AdvancedReinstallPolicyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "AttributeDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AttributeDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeDescriptorDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AttributeDescriptorDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeDescriptorType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AttributeDescriptorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeMetaDescriptorDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AttributeMetaDescriptorDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "attributeMetaDescriptorType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AttributeMetaDescriptorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.BulkEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementPropertiesType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.BulkEntitlementPropertiesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "bulkEntitlementResponseConfigRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.BulkEntitlementResponseConfigRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "BulkEntitlementType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.BulkEntitlementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "cancelLicensePolicyDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CancelLicensePolicyDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "channelPartnerDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ChannelPartnerDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "channelPartnerDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ChannelPartnerDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "CollectionOperationType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CollectionOperationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createBulkEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateBulkEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createBulkEntitlementRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateBulkEntitlementRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createBulkEntitlementResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateBulkEntitlementResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdBulkEntitlementDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedBulkEntitlementDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdBulkEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedBulkEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdEntitlementLifeCycleDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedEntitlementLifeCycleDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdEntitlementLifeCycleDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedEntitlementLifeCycleDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdRenewEntitlementDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedRenewEntitlementDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdRenewEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedRenewEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdSimpleEntitlementDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedSimpleEntitlementDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdSimpleEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedSimpleEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createEntitlementLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateEntitlementLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createMaintenanceLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateMaintenanceLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createSimpleEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateSimpleEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createSimpleEntitlementRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateSimpleEntitlementRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createSimpleEntitlementResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateSimpleEntitlementResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customAttributeDescriptorDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CustomAttributeDescriptorDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customAttributeDescriptorType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CustomAttributeDescriptorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customAttributeQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CustomAttributeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "customAttributesQueryListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CustomAttributesQueryListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "datedSearchType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DatedSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DateQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateTimeQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DateTimeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteEntitlementRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteEntitlementRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteEntitlementResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteEntitlementResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteMaintenanceLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceLineItemRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteMaintenanceLineItemRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceLineItemResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteMaintenanceLineItemResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteWebRegKeyRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteWebRegKeyRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteWebRegKeyResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteWebRegKeyResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DurationType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DurationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DurationUnit");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DurationUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailActivatableItemRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EmailActivatableItemRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailActivatableItemResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EmailActivatableItemResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailContactListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EmailContactListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailEntitlementRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EmailEntitlementRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "emailEntitlementResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EmailEntitlementResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entCustomAttributeQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntCustomAttributeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entCustomAttributesQueryListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntCustomAttributesQueryListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitledProductDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitledProductDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitledProductDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitledProductDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLifeCycleDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementLifeCycleDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "EntitlementLifeCycleRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementLifeCycleRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "EntitlementLifeCycleResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementLifeCycleResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementLineItemIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementLineItemPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemPropertiesType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementLineItemPropertiesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementLineItemResponseConfigRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementLineItemResponseConfigRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementStateChangeDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementStateChangeDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementStateChangeListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementStateChangeListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "entitlementStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.EntitlementStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "expirationTermsDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ExpirationTermsDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "extraActivationDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ExtraActivationDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedAddEntitlementLineItemDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedAddEntitlementLineItemDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedAddEntitlementLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedAddEntitlementLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedAddWebRegKeyDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedAddWebRegKeyDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedAddWebRegKeyDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedAddWebRegKeyDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedBulkEntitlementDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedBulkEntitlementDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedBulkEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedBulkEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteEntitlementDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteEntitlementDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteMaintenanceLineItemDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteMaintenanceLineItemDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteMaintenanceLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteMaintenanceLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteWebRegKeyDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteWebRegKeyDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteWebRegKeyListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteWebRegKeyListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedEntitlementLifeCycleDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedEntitlementLifeCycleDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedEntitlementLifeCycleDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedEntitlementLifeCycleDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedEntitlementStateDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedEntitlementStateDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedEntitlementStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedEntitlementStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedIdDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedIdDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedLineItemStateDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedLineItemStateDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedLineItemStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedLineItemStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedLinkMaintenanceLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedLinkMaintenanceLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedLinkMaintenanceLineItemListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedLinkMaintenanceLineItemListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMaintenanceLineItemStateDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedMaintenanceLineItemStateDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMaintenanceLineItemStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedMaintenanceLineItemStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMapEntitlementsToUserDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedMapEntitlementsToUserDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMatchingBulkEntDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedMatchingBulkEntDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMatchingBulkEntsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedMatchingBulkEntsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMatchingLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedMatchingLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMatchingLineItemsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedMatchingLineItemsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedRemoveEntitlementLineItemDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedRemoveEntitlementLineItemDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedRemoveEntitlementLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedRemoveEntitlementLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedRenewEntitlementDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedRenewEntitlementDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedRenewEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedRenewEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedSimpleEntitlementDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedSimpleEntitlementDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedSimpleEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedSimpleEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedSplitBulkEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedSplitBulkEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedSplitBulkEntitlementListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedSplitBulkEntitlementListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedSplitLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedSplitLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedSplitLineItemListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedSplitLineItemListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedTransferEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedTransferEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedTransferEntitlementListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedTransferEntitlementListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedTransferLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedTransferLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedTransferLineItemListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedTransferLineItemListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUnlinkMaintenanceLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUnlinkMaintenanceLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUnlinkMaintenanceLineItemListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUnlinkMaintenanceLineItemListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateBulkEntitlementDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateBulkEntitlementDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateBulkEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateBulkEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateEntitlementLineItemDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateEntitlementLineItemDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateEntitlementLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateEntitlementLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateSimpleEntitlementDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateSimpleEntitlementDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateSimpleEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateSimpleEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureBundleIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureBundleListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundlePKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureBundlePKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleStateChangeDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureBundleStateChangeDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleStateChangeListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureBundleStateChangeListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featurePKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeaturePKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureStateChangeDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureStateChangeDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureStateChangeListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureStateChangeListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getActivatableItemCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetActivatableItemCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getActivatableItemCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetActivatableItemCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetBulkEntitlementCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetBulkEntitlementCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementPropertiesRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetBulkEntitlementPropertiesRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getBulkEntitlementPropertiesResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetBulkEntitlementPropertiesResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementAttributesRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetEntitlementAttributesRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementAttributesResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetEntitlementAttributesResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetEntitlementCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getEntitlementCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetEntitlementCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getExactAvailableCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetExactAvailableCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getExactAvailableCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetExactAvailableCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingBulkEntInfoType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMatchingBulkEntInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingBulkEntsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMatchingBulkEntsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingBulkEntsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMatchingBulkEntsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingBulkEntsResponseListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMatchingBulkEntsResponseListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingBulkEntsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMatchingBulkEntsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingLineItemInfoType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMatchingLineItemInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingLineItemsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMatchingLineItemsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingLineItemsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMatchingLineItemsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingLineItemsResponseListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMatchingLineItemsResponseListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMatchingLineItemsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMatchingLineItemsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getStateChangeHistoryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetStateChangeHistoryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getStateChangeHistoryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetStateChangeHistoryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeyCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetWebRegKeyCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeyCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetWebRegKeyCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeysQueryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetWebRegKeysQueryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getWebRegKeysQueryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetWebRegKeysQueryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "idListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.IdListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "idType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.IdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseModelIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseModelListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseModelPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelStateChangeDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseModelStateChangeDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelStateChangeListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseModelStateChangeListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnologyIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseTechnologyIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnologyPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseTechnologyPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lifeCycleLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LifeCycleLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemCustomAttributeQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LineItemCustomAttributeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemCustomAttributesQueryListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LineItemCustomAttributesQueryListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemLifeCycleDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LineItemLifeCycleDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "lineItemStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LineItemStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "LineItemType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LineItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkMaintenanceLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LinkMaintenanceLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkMaintenanceLineItemListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LinkMaintenanceLineItemListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkMaintenanceLineItemRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LinkMaintenanceLineItemRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkMaintenanceLineItemResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LinkMaintenanceLineItemResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MaintenanceLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItemPropertiesType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MaintenanceLineItemPropertiesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceLineItemStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MaintenanceLineItemStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mapEntitlementsToUserRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MapEntitlementsToUserRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mapEntitlementsToUserResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MapEntitlementsToUserResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "matchingBulkEntDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MatchingBulkEntDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "matchingLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MatchingLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mergeEntitlementsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MergeEntitlementsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "mergeEntitlementsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MergeEntitlementsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "newEntitlementLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.NewEntitlementLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "NumberQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.NumberQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "numberSearchType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.NumberSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.OrganizationIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.OrganizationPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "PartnerTierQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PartnerTierQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PartNumberIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PartNumberPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyAttributesDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PolicyAttributesDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyAttributesListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PolicyAttributesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PolicyDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "policyTermType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PolicyTermType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productStateChangeDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductStateChangeDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productStateChangeListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductStateChangeListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "ProductType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "reinstallPolicyDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ReinstallPolicyDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "removeEntitlementLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RemoveEntitlementLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "removeEntitlementLineItemRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RemoveEntitlementLineItemRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "removeEntitlementLineItemResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RemoveEntitlementLineItemResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewedEntitlementLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RenewedEntitlementLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RenewEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewEntitlementRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RenewEntitlementRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewEntitlementResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RenewEntitlementResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RenewLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "renewParametersDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RenewParametersDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchActivatableItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SearchActivatableItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchActivatableItemRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SearchActivatableItemRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchActivatableItemResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SearchActivatableItemResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchBulkEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SearchBulkEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SearchEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementLineItemPropertiesRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SearchEntitlementLineItemPropertiesRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementLineItemPropertiesResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SearchEntitlementLineItemPropertiesResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SearchEntitlementRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "searchEntitlementResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SearchEntitlementResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setEntitlementStateRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetEntitlementStateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setEntitlementStateResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetEntitlementStateResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setLineItemStateRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetLineItemStateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setLineItemStateResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetLineItemStateResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setMaintenanceLineItemStateRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetMaintenanceLineItemStateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setMaintenanceLineItemStateResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetMaintenanceLineItemStateResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "simpleEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SimpleEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "SimpleQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SimpleQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "simpleSearchType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SimpleSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SplitBulkEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementInfoType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SplitBulkEntitlementInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SplitBulkEntitlementListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SplitBulkEntitlementRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementResponseListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SplitBulkEntitlementResponseListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitBulkEntitlementResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SplitBulkEntitlementResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SplitLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItemInfoType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SplitLineItemInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItemListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SplitLineItemListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItemRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SplitLineItemRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItemResponseListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SplitLineItemResponseListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "splitLineItemResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SplitLineItemResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StartDateOptionType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.StartDateOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "stateChangeDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.StateChangeDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateChangeEventType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.StateChangeEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "stateChangeResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.StateChangeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.StateQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StateType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.StateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StatusInfoType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.StatusInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "StatusType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.StatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferEntitlementInfoType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransferEntitlementInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferEntitlementsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransferEntitlementsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferEntitlementsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransferEntitlementsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferEntitlementsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransferEntitlementsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferLineItemInfoType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransferLineItemInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferLineItemsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransferLineItemsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferLineItemsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransferLineItemsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferLineItemsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransferLineItemsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferredEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransferredEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferredEntitlementsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransferredEntitlementsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferredLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransferredLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferredLineItemMapType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransferredLineItemMapType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transferredLineItemsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransferredLineItemsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UnlinkMaintenanceLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItemListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UnlinkMaintenanceLineItemListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItemRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UnlinkMaintenanceLineItemRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "unlinkMaintenanceLineItemResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UnlinkMaintenanceLineItemResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateBulkEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateBulkEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateBulkEntitlementRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateBulkEntitlementRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateBulkEntitlementResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateBulkEntitlementResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateEntitledProductDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateEntitledProductDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateEntitlementLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateEntitlementLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateEntitlementLineItemRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateEntitlementLineItemRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateEntitlementLineItemResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateEntitlementLineItemResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateMaintenanceLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateMaintenanceLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateSimpleEntitlementDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateSimpleEntitlementDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateSimpleEntitlementRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateSimpleEntitlementRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateSimpleEntitlementResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateSimpleEntitlementResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UserIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UserPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "valueType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "versionDateAttributesType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.VersionDateAttributesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "VersionDateOptionType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.VersionDateOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "virtualLicensePolicyDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.VirtualLicensePolicyDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeyCountDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.WebRegKeyCountDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeyDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.WebRegKeyDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeyDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.WebRegKeyDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeysDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.WebRegKeysDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeysListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.WebRegKeysListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "webRegKeyType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.WebRegKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.flexnet.operations.webservices.CreateBulkEntitlementResponseType createBulkEntitlement(com.flexnet.operations.webservices.CreateBulkEntitlementRequestType createBulkEntitlementRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createBulkEntitlement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createBulkEntitlementRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.CreateBulkEntitlementResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.CreateBulkEntitlementResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.CreateBulkEntitlementResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.CreateSimpleEntitlementResponseType createSimpleEntitlement(com.flexnet.operations.webservices.CreateSimpleEntitlementRequestType createSimpleEntitlementRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createSimpleEntitlement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createSimpleEntitlementRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.CreateSimpleEntitlementResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.CreateSimpleEntitlementResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.CreateSimpleEntitlementResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.DeleteEntitlementResponseType deleteEntitlement(com.flexnet.operations.webservices.DeleteEntitlementRequestType deleteEntitlementRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteEntitlement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteEntitlementRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.DeleteEntitlementResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.DeleteEntitlementResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.DeleteEntitlementResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.AddWebRegKeyResponseType createWebRegKey(com.flexnet.operations.webservices.AddWebRegKeyRequestType addWebRegKeyRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createWebRegKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {addWebRegKeyRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.AddWebRegKeyResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.AddWebRegKeyResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.AddWebRegKeyResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.UpdateBulkEntitlementResponseType updateBulkEntitlement(com.flexnet.operations.webservices.UpdateBulkEntitlementRequestType updateBulkEntitlementRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateBulkEntitlement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateBulkEntitlementRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.UpdateBulkEntitlementResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.UpdateBulkEntitlementResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.UpdateBulkEntitlementResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.UpdateSimpleEntitlementResponseType updateSimpleEntitlement(com.flexnet.operations.webservices.UpdateSimpleEntitlementRequestType updateSimpleEntitlementRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateSimpleEntitlement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateSimpleEntitlementRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.UpdateSimpleEntitlementResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.UpdateSimpleEntitlementResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.UpdateSimpleEntitlementResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemResponseType createEntitlementLineItem(com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemRequestType createEntitlementLineItemRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createEntitlementLineItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createEntitlementLineItemRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemResponseType replaceEntitlementLineItem(com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemRequestType replaceEntitlementLineItemRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "replaceEntitlementLineItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {replaceEntitlementLineItemRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.RemoveEntitlementLineItemResponseType deleteEntitlementLineItem(com.flexnet.operations.webservices.RemoveEntitlementLineItemRequestType removeEntitlementLineItemRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteEntitlementLineItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {removeEntitlementLineItemRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.RemoveEntitlementLineItemResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.RemoveEntitlementLineItemResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.RemoveEntitlementLineItemResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.UpdateEntitlementLineItemResponseType updateEntitlementLineItem(com.flexnet.operations.webservices.UpdateEntitlementLineItemRequestType updateEntitlementLineItemRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateEntitlementLineItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateEntitlementLineItemRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.UpdateEntitlementLineItemResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.UpdateEntitlementLineItemResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.UpdateEntitlementLineItemResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.SearchEntitlementResponseType getEntitlementsQuery(com.flexnet.operations.webservices.SearchEntitlementRequestType searchEntitlementRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getEntitlementsQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchEntitlementRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.SearchEntitlementResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.SearchEntitlementResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.SearchEntitlementResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetBulkEntitlementPropertiesResponseType getBulkEntitlementPropertiesQuery(com.flexnet.operations.webservices.GetBulkEntitlementPropertiesRequestType getBulkEntitlementPropertiesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBulkEntitlementPropertiesQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getBulkEntitlementPropertiesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetBulkEntitlementPropertiesResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetBulkEntitlementPropertiesResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetBulkEntitlementPropertiesResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetBulkEntitlementCountResponseType getBulkEntitlementCount(com.flexnet.operations.webservices.GetBulkEntitlementCountRequestType getBulkEntitlementCountRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBulkEntitlementCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getBulkEntitlementCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetBulkEntitlementCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetBulkEntitlementCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetBulkEntitlementCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.SearchActivatableItemResponseType getActivatableItemsQuery(com.flexnet.operations.webservices.SearchActivatableItemRequestType searchActivatableItemRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getActivatableItemsQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchActivatableItemRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.SearchActivatableItemResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.SearchActivatableItemResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.SearchActivatableItemResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.SearchEntitlementLineItemPropertiesResponseType getEntitlementLineItemPropertiesQuery(com.flexnet.operations.webservices.SearchEntitlementLineItemPropertiesRequestType searchEntitlementLineItemPropertiesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getEntitlementLineItemPropertiesQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchEntitlementLineItemPropertiesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.SearchEntitlementLineItemPropertiesResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.SearchEntitlementLineItemPropertiesResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.SearchEntitlementLineItemPropertiesResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetEntitlementCountResponseType getEntitlementCount(com.flexnet.operations.webservices.GetEntitlementCountRequestType getEntitlementCountRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getEntitlementCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getEntitlementCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetEntitlementCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetEntitlementCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetEntitlementCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetActivatableItemCountResponseType getActivatableItemCount(com.flexnet.operations.webservices.GetActivatableItemCountRequestType getActivatableItemCountRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getActivatableItemCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getActivatableItemCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetActivatableItemCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetActivatableItemCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetActivatableItemCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetExactAvailableCountResponseType getExactAvailableCount(com.flexnet.operations.webservices.GetExactAvailableCountRequestType getExactAvailableCountRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getExactAvailableCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getExactAvailableCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetExactAvailableCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetExactAvailableCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetExactAvailableCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.SetEntitlementStateResponseType setEntitlementState(com.flexnet.operations.webservices.SetEntitlementStateRequestType setEntitlementStateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setEntitlementState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setEntitlementStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.SetEntitlementStateResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.SetEntitlementStateResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.SetEntitlementStateResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetWebRegKeyCountResponseType getWebRegKeyCount(com.flexnet.operations.webservices.GetWebRegKeyCountRequestType getWebRegKeyCountRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getWebRegKeyCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getWebRegKeyCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetWebRegKeyCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetWebRegKeyCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetWebRegKeyCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetWebRegKeysQueryResponseType getWebRegKeysQuery(com.flexnet.operations.webservices.GetWebRegKeysQueryRequestType getWebRegKeysQueryRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getWebRegKeysQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getWebRegKeysQueryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetWebRegKeysQueryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetWebRegKeysQueryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetWebRegKeysQueryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetEntitlementAttributesResponseType getEntitlementAttributesFromModel(com.flexnet.operations.webservices.GetEntitlementAttributesRequestType getEntitlementAttributesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getEntitlementAttributesFromModel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getEntitlementAttributesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetEntitlementAttributesResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetEntitlementAttributesResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetEntitlementAttributesResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.RenewEntitlementResponseType renewLicense(com.flexnet.operations.webservices.RenewEntitlementRequestType renewLicenseRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "renewLicense"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {renewLicenseRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.RenewEntitlementResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.RenewEntitlementResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.RenewEntitlementResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.EntitlementLifeCycleResponseType upgradeLicense(com.flexnet.operations.webservices.EntitlementLifeCycleRequestType upgradeLicenseRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "upgradeLicense"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {upgradeLicenseRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.EntitlementLifeCycleResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.EntitlementLifeCycleResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.EntitlementLifeCycleResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.EntitlementLifeCycleResponseType upsellLicense(com.flexnet.operations.webservices.EntitlementLifeCycleRequestType upsellLicenseRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "upsellLicense"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {upsellLicenseRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.EntitlementLifeCycleResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.EntitlementLifeCycleResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.EntitlementLifeCycleResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.MapEntitlementsToUserResponseType mapEntitlementsToUser(com.flexnet.operations.webservices.MapEntitlementsToUserRequestType mapEntitlementsToUserRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "mapEntitlementsToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {mapEntitlementsToUserRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.MapEntitlementsToUserResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.MapEntitlementsToUserResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.MapEntitlementsToUserResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.EmailEntitlementResponseType emailEntitlement(com.flexnet.operations.webservices.EmailEntitlementRequestType emailEntitlementRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "emailEntitlement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {emailEntitlementRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.EmailEntitlementResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.EmailEntitlementResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.EmailEntitlementResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.EmailActivatableItemResponseType emailActivatableItem(com.flexnet.operations.webservices.EmailActivatableItemRequestType emailActivatableItemRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "emailActivatableItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {emailActivatableItemRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.EmailActivatableItemResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.EmailActivatableItemResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.EmailActivatableItemResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.SetLineItemStateResponseType setLineItemState(com.flexnet.operations.webservices.SetLineItemStateRequestType setLineItemStateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setLineItemState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setLineItemStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.SetLineItemStateResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.SetLineItemStateResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.SetLineItemStateResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.SetMaintenanceLineItemStateResponseType setMaintenanceLineItemState(com.flexnet.operations.webservices.SetMaintenanceLineItemStateRequestType setMaintenanceLineItemStateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setMaintenanceLineItemState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setMaintenanceLineItemStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.SetMaintenanceLineItemStateResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.SetMaintenanceLineItemStateResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.SetMaintenanceLineItemStateResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.DeleteWebRegKeyResponseType deleteWebRegKey(com.flexnet.operations.webservices.DeleteWebRegKeyRequestType deleteWebRegKeyRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteWebRegKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteWebRegKeyRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.DeleteWebRegKeyResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.DeleteWebRegKeyResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.DeleteWebRegKeyResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.MergeEntitlementsResponseType mergeEntitlements(com.flexnet.operations.webservices.MergeEntitlementsRequestType mergeEntitlementsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "mergeEntitlements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {mergeEntitlementsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.MergeEntitlementsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.MergeEntitlementsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.MergeEntitlementsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.TransferEntitlementsResponseType transferEntitlement(com.flexnet.operations.webservices.TransferEntitlementsRequestType transferEntitlementsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "transferEntitlement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {transferEntitlementsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.TransferEntitlementsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.TransferEntitlementsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.TransferEntitlementsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.TransferLineItemsResponseType transferLineItem(com.flexnet.operations.webservices.TransferLineItemsRequestType transferLineItemsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "transferLineItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {transferLineItemsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.TransferLineItemsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.TransferLineItemsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.TransferLineItemsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetStateChangeHistoryResponseType getStateChangeHistory(com.flexnet.operations.webservices.GetStateChangeHistoryRequestType getStateChangeHistoryRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getStateChangeHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getStateChangeHistoryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetStateChangeHistoryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetStateChangeHistoryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetStateChangeHistoryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.LinkMaintenanceLineItemResponseType linkMaintenanceLineItem(com.flexnet.operations.webservices.LinkMaintenanceLineItemRequestType linkMaintenanceLineItemRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "linkMaintenanceLineItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {linkMaintenanceLineItemRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.LinkMaintenanceLineItemResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.LinkMaintenanceLineItemResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.LinkMaintenanceLineItemResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.SplitLineItemResponseType splitLineItem(com.flexnet.operations.webservices.SplitLineItemRequestType splitLineItemRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "splitLineItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {splitLineItemRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.SplitLineItemResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.SplitLineItemResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.SplitLineItemResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.SplitBulkEntitlementResponseType splitBulkEntitlement(com.flexnet.operations.webservices.SplitBulkEntitlementRequestType splitBulkEntitlementRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "splitBulkEntitlement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {splitBulkEntitlementRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.SplitBulkEntitlementResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.SplitBulkEntitlementResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.SplitBulkEntitlementResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetMatchingLineItemsResponseType getMatchingLineItems(com.flexnet.operations.webservices.GetMatchingLineItemsRequestType getMatchingLineItemsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMatchingLineItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getMatchingLineItemsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetMatchingLineItemsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetMatchingLineItemsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetMatchingLineItemsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetMatchingBulkEntsResponseType getMatchingBulkEnts(com.flexnet.operations.webservices.GetMatchingBulkEntsRequestType getMatchingBulkEntsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMatchingBulkEnts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getMatchingBulkEntsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetMatchingBulkEntsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetMatchingBulkEntsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetMatchingBulkEntsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.DeleteMaintenanceLineItemResponseType deleteMaintenanceLineItem(com.flexnet.operations.webservices.DeleteMaintenanceLineItemRequestType deleteMaintenanceLineItemRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteMaintenanceLineItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteMaintenanceLineItemRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.DeleteMaintenanceLineItemResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.DeleteMaintenanceLineItemResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.DeleteMaintenanceLineItemResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.UnlinkMaintenanceLineItemResponseType unlinkMaintenanceLineItem(com.flexnet.operations.webservices.UnlinkMaintenanceLineItemRequestType unlinkMaintenanceLineItemRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "unlinkMaintenanceLineItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unlinkMaintenanceLineItemRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.UnlinkMaintenanceLineItemResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.UnlinkMaintenanceLineItemResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.UnlinkMaintenanceLineItemResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
