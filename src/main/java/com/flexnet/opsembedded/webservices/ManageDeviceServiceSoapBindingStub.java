/**
 * ManageDeviceServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public class ManageDeviceServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.flexnet.opsembedded.webservices.ManageDeviceServiceInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[27];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createBaseProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createBaseProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "baseProductRequestType"), com.flexnet.opsembedded.webservices.BaseProductRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "baseProductResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.BaseProductResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createBaseProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateBaseProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateBaseProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "baseProductRequestType"), com.flexnet.opsembedded.webservices.BaseProductRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "baseProductResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.BaseProductResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateBaseProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteBaseProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteBaseProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteBaseProductRequestType"), com.flexnet.opsembedded.webservices.DeleteBaseProductRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "baseProductResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.BaseProductResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteBaseProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createDeviceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createDevRequestType"), com.flexnet.opsembedded.webservices.CreateDevRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createDevResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.CreateDevResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createDeviceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createTestDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createTestDeviceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createDevRequestType"), com.flexnet.opsembedded.webservices.CreateDevRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createDevResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.CreateDevResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createTestDeviceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteDeviceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteDeviceRequestType"), com.flexnet.opsembedded.webservices.DeleteDeviceRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteDeviceResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.DeleteDeviceResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteDeviceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateDeviceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateDevRequestType"), com.flexnet.opsembedded.webservices.UpdateDevRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateDevResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.UpdateDevResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateDeviceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatePrebuiltLicense");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generatePrebuiltLicenseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generatePrebuiltLicenseRequestType"), com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generatePrebuiltLicenseResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generatePrebuiltLicenseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDevicesQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDevicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDevicesRequestType"), com.flexnet.opsembedded.webservices.GetDevicesRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDevicesResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.GetDevicesResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDevicesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeviceCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeviceCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDevicesCountRequestType"), com.flexnet.opsembedded.webservices.GetDevicesCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeviceCountResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.GetDeviceCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeviceCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("linkAddonLineItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkAddonLineItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkAddonLineItemsRequestType"), com.flexnet.opsembedded.webservices.LinkAddonLineItemsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkAddonLineItemsResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkAddonLineItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAddonLineItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteAddonLineItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteAddonLineItemsRequestType"), com.flexnet.opsembedded.webservices.DeleteAddonLineItemsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteAddonLineItemsResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.DeleteAddonLineItemsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteAddonLineItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("incrementAddonLineItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "incrementAddonLineItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkAddonLineItemsRequestType"), com.flexnet.opsembedded.webservices.LinkAddonLineItemsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkAddonLineItemsResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "incrementAddonLineItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("decrementAddonLineItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "decrementAddonLineItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkAddonLineItemsRequestType"), com.flexnet.opsembedded.webservices.LinkAddonLineItemsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkAddonLineItemsResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "decrementAddonLineItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setDeviceStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "setDeviceStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "setDeviceStatusRequestListType"), com.flexnet.opsembedded.webservices.SetDeviceStatusRequestListType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "setDeviceStatusResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.SetDeviceStatusResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "setDeviceStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateCapabilityResponse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCapabilityResponseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCapabilityResponseRequestType"), com.flexnet.opsembedded.webservices.GenerateCapabilityResponseRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCapabilityResponseResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.GenerateCapabilityResponseResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCapabilityResponseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUsageSummary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryRequestType"), com.flexnet.opsembedded.webservices.GetUsageSummaryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.GetUsageSummaryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUsageSummaryTimes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryTimesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryTimesRequestType"), com.flexnet.opsembedded.webservices.GetUsageSummaryTimesRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryTimesResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.GetUsageSummaryTimesResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryTimesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUsageHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageHistoryRequestType"), com.flexnet.opsembedded.webservices.GetUsageHistoryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageHistoryResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.GetUsageHistoryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageHistoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUsageHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteUsageHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteUsageHistoryRequestType"), com.flexnet.opsembedded.webservices.DeleteUsageHistoryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteUsageHistoryResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.DeleteUsageHistoryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteUsageHistoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moveDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "moveDeviceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "moveDeviceRequestType"), com.flexnet.opsembedded.webservices.MoveDeviceRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "moveDeviceResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.MoveDeviceResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "moveDeviceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("returnHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "returnHostRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "returnHostRequestListType"), com.flexnet.opsembedded.webservices.ReturnHostRequestListType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "returnHostResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.ReturnHostResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "returnHostResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obsoleteHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "obsoleteHostRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "obsoleteHostRequestListType"), com.flexnet.opsembedded.webservices.ObsoleteHostRequestListType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "obsoleteHostResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.ObsoleteHostResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "obsoleteHostResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeletedSync");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeletedSyncRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeletedSyncRequestType"), com.flexnet.opsembedded.webservices.GetDeletedSyncRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeletedSyncResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.GetDeletedSyncResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeletedSyncResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("restoreServedClient");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "restoreServedClientRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "restoreServedClientRequestType"), com.flexnet.opsembedded.webservices.RestoreServedClientRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "restoreServedClientResponseType"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.RestoreServedClientResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "restoreServedClientResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAutoProvisionedServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getAutoProvisionedServerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getAutoProvisionedServerRequest"), com.flexnet.opsembedded.webservices.GetAutoProvisionedServerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getAutoProvisionedServerResponse"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.GetAutoProvisionedServerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getAutoProvisionedServerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateCloneDetectionReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCloneDetectionReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCloneDetectionReportRequest"), com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCloneDetectionReportResponse"));
        oper.setReturnClass(com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCloneDetectionReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

    }

    public ManageDeviceServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ManageDeviceServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ManageDeviceServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", ">cloneSuspect>lineItemActivationIds");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.CloneSuspectLineItemActivationIds.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", ">generateCloneDetectionReportRequest>enterpriseIds");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportRequestEnterpriseIds.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", ">generateCloneDetectionReportResponse>cloneSuspects");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportResponseCloneSuspects.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "addonLineItemDataDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.AddonLineItemDataDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "attributeDescriptorDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.AttributeDescriptorDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "attributeDescriptorType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.AttributeDescriptorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "baseProductDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.BaseProductDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "baseProductDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.BaseProductDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "baseProductRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.BaseProductRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "baseProductResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.BaseProductResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "capabilityRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.CapabilityRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "capabilityResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.CapabilityResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "channelPartnerDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.ChannelPartnerDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "channelPartnerDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.ChannelPartnerDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "cloneSuspect");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.CloneSuspect.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "CollectionOperationType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.CollectionOperationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createdDeviceDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.CreatedDeviceDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createDeviceIdentifier");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.CreateDeviceIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createDevRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.CreateDevRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "createDevResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.CreateDevResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "customAttributeDescriptorDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.CustomAttributeDescriptorDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "customAttributeDescriptorType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.CustomAttributeDescriptorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "customAttributeQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.CustomAttributeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "customAttributesQueryListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.CustomAttributesQueryListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "datedSearchType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DatedSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DateQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DateQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DateTimeQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DateTimeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteAddonLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeleteAddonLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteAddonLineItemsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeleteAddonLineItemsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteAddonLineItemsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeleteAddonLineItemsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteBaseProductRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeleteBaseProductRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteDeviceRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeleteDeviceRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteDeviceResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeleteDeviceResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deletedSyncDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeletedSyncDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteFailAddonDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeleteFailAddonDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteFailAddonDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeleteFailAddonDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeleteLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteLineItemIdentifier");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeleteLineItemIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteUsageHistoryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeleteUsageHistoryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deleteUsageHistoryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeleteUsageHistoryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeviceDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdentifier");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeviceIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DeviceIdTypeQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeviceIdTypeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceIdTypeType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeviceIdTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DeviceMachineTypeQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeviceMachineTypeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceQueryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeviceQueryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceResponseConfigRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeviceResponseConfigRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DeviceServedStateQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeviceServedStateQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceServedStatusType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeviceServedStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DeviceStateQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeviceStateQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceStatusSettableType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeviceStatusSettableType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceStatusType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeviceStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "deviceTypeList");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DeviceTypeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "dictionaryEntry");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DictionaryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "dictionaryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DictionaryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DurationType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DurationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "DurationUnit");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.DurationUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "entitledProductDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.EntitledProductDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "entitledProductDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.EntitledProductDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "enumSearchType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.EnumSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "ExternalIdQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.ExternalIdQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "externalIdSearchType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.ExternalIdSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedBaseProductDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedBaseProductDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedBaseProductDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedBaseProductDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedCapabilityResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedCapabilityResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedCreateDevDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedCreateDevDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedCreateDeviceDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedCreateDeviceDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedDeleteDevDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedDeleteDevDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedDeleteDevDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedDeleteDevDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedDeleteUsageHistoryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedDeleteUsageHistoryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedGenerateCapabilityResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedGenerateCapabilityResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedGeneratePrebuiltLicenseDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedGeneratePrebuiltLicenseDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedGeneratePrebuiltLicenseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedGeneratePrebuiltLicenseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedGetDeletedSyncDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedGetDeletedSyncDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedGetDevicesDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedGetDevicesDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedGetUsageHistoryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedGetUsageHistoryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedGetUsageSummaryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedGetUsageSummaryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedGetUsageSummaryTimesDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedGetUsageSummaryTimesDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedMoveDeviceDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedMoveDeviceDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedMoveDeviceListDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedMoveDeviceListDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedObsoleteHostDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedObsoleteHostDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedObsoleteHostListDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedObsoleteHostListDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedRestoreServedClientDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedRestoreServedClientDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedReturnHostDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedReturnHostDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedReturnHostListDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedReturnHostListDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedSetDeviceStatusDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedSetDeviceStatusDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedSetDeviceStatusDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedSetDeviceStatusDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedUpdateDevDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedUpdateDevDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "failedUpdateDeviceDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FailedUpdateDeviceDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureDataDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FeatureDataDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "featureIds");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.FeatureIds.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCapabilityResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GenerateCapabilityResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCapabilityResponseDictionary");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GenerateCapabilityResponseDictionary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCapabilityResponseDictionaryEntry");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GenerateCapabilityResponseDictionaryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCapabilityResponseRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GenerateCapabilityResponseRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCapabilityResponseResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GenerateCapabilityResponseResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCloneDetectionReportRequest");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generateCloneDetectionReportResponse");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generatePrebuiltLicenseDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generatePrebuiltLicenseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseDataType.class;
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
            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generatePrebuiltLicenseRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "generatePrebuiltLicenseResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getAutoProvisionedServerRequest");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetAutoProvisionedServerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getAutoProvisionedServerResponse");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetAutoProvisionedServerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeletedSyncDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetDeletedSyncDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeletedSyncParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetDeletedSyncParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeletedSyncRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetDeletedSyncRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeletedSyncResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetDeletedSyncResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeviceCountResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetDeviceCountResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDeviceCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetDeviceCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDevicesCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetDevicesCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDevicesParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetDevicesParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDevicesRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetDevicesRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDevicesResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetDevicesResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getDevicesResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetDevicesResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageHistoryConfigType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetUsageHistoryConfigType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageHistoryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetUsageHistoryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageHistoryParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetUsageHistoryParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageHistoryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetUsageHistoryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageHistoryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetUsageHistoryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetUsageSummaryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetUsageSummaryParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetUsageSummaryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetUsageSummaryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryTimesDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetUsageSummaryTimesDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryTimesRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetUsageSummaryTimesRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "getUsageSummaryTimesResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.GetUsageSummaryTimesResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "hostTypeIdentifier");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.HostTypeIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "licenseModelIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.LicenseModelIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "licenseModelPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.LicenseModelPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "licenseStateType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.LicenseStateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkAddonLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.LinkAddonLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkAddonLineItemsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.LinkAddonLineItemsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkAddonLineItemsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkFailAddonDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.LinkFailAddonDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkFailAddonDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.LinkFailAddonDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkLineItemDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.LinkLineItemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "linkLineItemIdentifier");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.LinkLineItemIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "machineTypeType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.MachineTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "moveDeviceList");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.MoveDeviceList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "moveDeviceRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.MoveDeviceRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "moveDeviceResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.MoveDeviceResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "NumberQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.NumberQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "numberSearchType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.NumberSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "obsoleteHostRequestListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.ObsoleteHostRequestListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "obsoleteHostResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.ObsoleteHostResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "obsoleteHostType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.ObsoleteHostType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "OpsEmbeddedStatusInfoType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.OpsEmbeddedStatusInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "OpsEmbeddedStatusType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.OpsEmbeddedStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "organizationIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.OrganizationIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "organizationPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.OrganizationPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "PartnerTierQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.PartnerTierQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "productIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.ProductIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "productPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.ProductPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "publisherIdentifier");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.PublisherIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "restoreServedClientDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.RestoreServedClientDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "restoreServedClientRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.RestoreServedClientRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "restoreServedClientResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.RestoreServedClientResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "returnHostRequestListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.ReturnHostRequestListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "returnHostResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.ReturnHostResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "returnHostType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.ReturnHostType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "ServerIdsType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.ServerIdsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "setDeviceStatusRequestListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.SetDeviceStatusRequestListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "setDeviceStatusResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.SetDeviceStatusResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "setDeviceStatusType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.SetDeviceStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "SimpleQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.SimpleQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "simpleSearchType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.SimpleSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "soldToType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.SoldToType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "successAddonDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.SuccessAddonDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateChannelPartnerDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.UpdateChannelPartnerDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updatedDeviceDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.UpdatedDeviceDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateDevDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.UpdateDevDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateDevRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.UpdateDevRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "updateDevResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.UpdateDevResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usageHistoryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.UsageHistoryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usageSummaryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.UsageSummaryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usageSummaryGroupByType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.UsageSummaryGroupByType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "usageSummaryTimesDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.UsageSummaryTimesDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "userIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.UserIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "userPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.UserPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/opsembedded", "WSDeviceType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.opsembedded.webservices.WSDeviceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

    public com.flexnet.opsembedded.webservices.BaseProductResponseType createBaseProduct(com.flexnet.opsembedded.webservices.BaseProductRequestType createBaseProductRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "createBaseProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createBaseProductRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.BaseProductResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.BaseProductResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.BaseProductResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.BaseProductResponseType updateBaseProduct(com.flexnet.opsembedded.webservices.BaseProductRequestType updateBaseProductRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "updateBaseProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateBaseProductRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.BaseProductResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.BaseProductResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.BaseProductResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.BaseProductResponseType deleteBaseProduct(com.flexnet.opsembedded.webservices.DeleteBaseProductRequestType deleteBaseProductRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteBaseProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteBaseProductRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.BaseProductResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.BaseProductResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.BaseProductResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.CreateDevResponseType createDevice(com.flexnet.opsembedded.webservices.CreateDevRequestType createDeviceRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "createDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createDeviceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.CreateDevResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.CreateDevResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.CreateDevResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.CreateDevResponseType createTestDevice(com.flexnet.opsembedded.webservices.CreateDevRequestType createTestDeviceRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "createTestDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createTestDeviceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.CreateDevResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.CreateDevResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.CreateDevResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.DeleteDeviceResponseType deleteDevice(com.flexnet.opsembedded.webservices.DeleteDeviceRequestType deleteDeviceRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteDeviceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.DeleteDeviceResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.DeleteDeviceResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.DeleteDeviceResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.UpdateDevResponseType updateDevice(com.flexnet.opsembedded.webservices.UpdateDevRequestType updateDeviceRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "updateDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateDeviceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.UpdateDevResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.UpdateDevResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.UpdateDevResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseResponseType generatePrebuiltLicense(com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseRequestType generatePrebuiltLicenseRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "generatePrebuiltLicense"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {generatePrebuiltLicenseRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.GetDevicesResponseType getDevicesQuery(com.flexnet.opsembedded.webservices.GetDevicesRequestType getDevicesRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getDevicesQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getDevicesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.GetDevicesResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.GetDevicesResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.GetDevicesResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.GetDeviceCountResponseType getDeviceCount(com.flexnet.opsembedded.webservices.GetDevicesCountRequestType getDeviceCountRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getDeviceCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getDeviceCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.GetDeviceCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.GetDeviceCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.GetDeviceCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType linkAddonLineItems(com.flexnet.opsembedded.webservices.LinkAddonLineItemsRequestType linkAddonLineItemsRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "linkAddonLineItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {linkAddonLineItemsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.DeleteAddonLineItemsResponseType deleteAddonLineItems(com.flexnet.opsembedded.webservices.DeleteAddonLineItemsRequestType deleteAddonLineItemsRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteAddonLineItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteAddonLineItemsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.DeleteAddonLineItemsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.DeleteAddonLineItemsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.DeleteAddonLineItemsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType incrementAddonLineItems(com.flexnet.opsembedded.webservices.LinkAddonLineItemsRequestType incrementAddonLineItemsRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "incrementAddonLineItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {incrementAddonLineItemsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType decrementAddonLineItems(com.flexnet.opsembedded.webservices.LinkAddonLineItemsRequestType decrementAddonLineItemsRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "decrementAddonLineItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {decrementAddonLineItemsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.SetDeviceStatusResponseType setDeviceStatus(com.flexnet.opsembedded.webservices.SetDeviceStatusRequestListType setDeviceStatusRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "setDeviceStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setDeviceStatusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.SetDeviceStatusResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.SetDeviceStatusResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.SetDeviceStatusResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.GenerateCapabilityResponseResponseType generateCapabilityResponse(com.flexnet.opsembedded.webservices.GenerateCapabilityResponseRequestType generateCapabilityResponseRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "generateCapabilityResponse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {generateCapabilityResponseRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.GenerateCapabilityResponseResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.GenerateCapabilityResponseResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.GenerateCapabilityResponseResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.GetUsageSummaryResponseType getUsageSummary(com.flexnet.opsembedded.webservices.GetUsageSummaryRequestType getUsageSummaryRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getUsageSummary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getUsageSummaryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.GetUsageSummaryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.GetUsageSummaryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.GetUsageSummaryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.GetUsageSummaryTimesResponseType getUsageSummaryTimes(com.flexnet.opsembedded.webservices.GetUsageSummaryTimesRequestType getUsageSummaryTimesRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getUsageSummaryTimes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getUsageSummaryTimesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.GetUsageSummaryTimesResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.GetUsageSummaryTimesResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.GetUsageSummaryTimesResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.GetUsageHistoryResponseType getUsageHistory(com.flexnet.opsembedded.webservices.GetUsageHistoryRequestType getUsageHistoryRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getUsageHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getUsageHistoryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.GetUsageHistoryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.GetUsageHistoryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.GetUsageHistoryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.DeleteUsageHistoryResponseType deleteUsageHistory(com.flexnet.opsembedded.webservices.DeleteUsageHistoryRequestType deleteUsageHistoryRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteUsageHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteUsageHistoryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.DeleteUsageHistoryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.DeleteUsageHistoryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.DeleteUsageHistoryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.MoveDeviceResponseType moveDevice(com.flexnet.opsembedded.webservices.MoveDeviceRequestType moveDeviceRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "moveDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moveDeviceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.MoveDeviceResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.MoveDeviceResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.MoveDeviceResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.ReturnHostResponseType returnHost(com.flexnet.opsembedded.webservices.ReturnHostRequestListType returnHostRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "returnHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {returnHostRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.ReturnHostResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.ReturnHostResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.ReturnHostResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.ObsoleteHostResponseType obsoleteHost(com.flexnet.opsembedded.webservices.ObsoleteHostRequestListType obsoleteHostRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "obsoleteHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {obsoleteHostRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.ObsoleteHostResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.ObsoleteHostResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.ObsoleteHostResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.GetDeletedSyncResponseType getDeletedSync(com.flexnet.opsembedded.webservices.GetDeletedSyncRequestType getDeletedSyncRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getDeletedSync"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getDeletedSyncRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.GetDeletedSyncResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.GetDeletedSyncResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.GetDeletedSyncResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.RestoreServedClientResponseType restoreServedClient(com.flexnet.opsembedded.webservices.RestoreServedClientRequestType restoreServedClientRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "restoreServedClient"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {restoreServedClientRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.RestoreServedClientResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.RestoreServedClientResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.RestoreServedClientResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.GetAutoProvisionedServerResponse getAutoProvisionedServer(com.flexnet.opsembedded.webservices.GetAutoProvisionedServerRequest getAutoProvisionedServerRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getAutoProvisionedServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getAutoProvisionedServerRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.GetAutoProvisionedServerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.GetAutoProvisionedServerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.GetAutoProvisionedServerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportResponse generateCloneDetectionReport(com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportRequest generateCloneDetectionReportRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "generateCloneDetectionReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {generateCloneDetectionReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
