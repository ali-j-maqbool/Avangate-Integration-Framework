/**
 * ProductPackagingServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class ProductPackagingServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.flexnet.operations.webservices.ProductPackagingServiceInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[51];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createFeature");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createFeatureRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createFeatureRequestType"), com.flexnet.operations.webservices.CreateFeatureRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createFeatureResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.CreateFeatureResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createFeatureResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateFeature");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureRequestType"), com.flexnet.operations.webservices.UpdateFeatureRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.UpdateFeatureResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteFeature");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureRequestType"), com.flexnet.operations.webservices.DeleteFeatureRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.DeleteFeatureResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFeatureCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureCountRequestType"), com.flexnet.operations.webservices.GetFeatureCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureCountResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetFeatureCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFeaturesQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeaturesQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeaturesQueryRequestType"), com.flexnet.operations.webservices.GetFeaturesQueryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeaturesQueryResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetFeaturesQueryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeaturesQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setFeatureState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setFeatureStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setFeatureStateRequestType"), com.flexnet.operations.webservices.SetFeatureStateRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setFeatureStateResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.SetFeatureStateResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setFeatureStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createFeatureBundle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createFeatureBundleRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createFeatureBundleRequestType"), com.flexnet.operations.webservices.CreateFeatureBundleRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createFeatureBundleResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.CreateFeatureBundleResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createFeatureBundleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateFeatureBundle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureBundleRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureBundleRequestType"), com.flexnet.operations.webservices.UpdateFeatureBundleRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureBundleResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.UpdateFeatureBundleResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureBundleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteFeatureBundle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureBundleRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureBundleRequestType"), com.flexnet.operations.webservices.DeleteFeatureBundleRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureBundleResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.DeleteFeatureBundleResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureBundleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFeatureBundleCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundleCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundleCountRequestType"), com.flexnet.operations.webservices.GetFeatureBundleCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundleCountResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetFeatureBundleCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundleCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFeatureBundlesQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundlesQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundlesQueryRequestType"), com.flexnet.operations.webservices.GetFeatureBundlesQueryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundlesQueryResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetFeatureBundlesQueryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundlesQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setFeatureBundleState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setFeatureBundleStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setFeatureBundleStateRequestType"), com.flexnet.operations.webservices.SetFeatureBundleStateRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setFeatureBundleStateResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.SetFeatureBundleStateResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setFeatureBundleStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductRequestType"), com.flexnet.operations.webservices.CreateProductRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.CreateProductResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductRequestType"), com.flexnet.operations.webservices.UpdateProductRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.UpdateProductResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteProductRequestType"), com.flexnet.operations.webservices.DeleteProductRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteProductResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.DeleteProductResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProductCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCountRequestType"), com.flexnet.operations.webservices.GetProductCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCountResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetProductCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProductsQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductsQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductsQueryRequestType"), com.flexnet.operations.webservices.GetProductsQueryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductsQueryResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetProductsQueryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductsQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createProductCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductCategoryRequestType"), com.flexnet.operations.webservices.CreateProductCategoryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductCategoryResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.CreateProductCategoryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductCategoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProductCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCategoriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCategoriesRequestType"), com.flexnet.operations.webservices.GetProductCategoriesRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCategoriesResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetProductCategoriesResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCategoriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignProductCategoriesToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "assignProductCategoriesToUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "handleProductCategoriesToUserRequestType"), com.flexnet.operations.webservices.HandleProductCategoriesToUserRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "handleProductCategoriesToUserResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.HandleProductCategoriesToUserResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "assignProductCategoriesToUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeProductCategoriesFromUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "removeProductCategoriesFromUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "handleProductCategoriesToUserRequestType"), com.flexnet.operations.webservices.HandleProductCategoriesToUserRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "handleProductCategoriesToUserResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.HandleProductCategoriesToUserResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "removeProductCategoriesFromUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUsersForProductCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersForProductCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersForProductCategoryRequestType"), com.flexnet.operations.webservices.GetUsersForProductCategoryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersForProductCategoryResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetUsersForProductCategoryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersForProductCategoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignProductCategoriesToOrg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "assignProductCategoriesToOrgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "handleProductCategoryToOrgRequestType"), com.flexnet.operations.webservices.HandleProductCategoryToOrgRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "handleProductCategoryToOrgResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.HandleProductCategoryToOrgResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "assignProductCategoriesToOrgResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeProductCategoriesFromOrg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "removeProductCategoriesFromOrgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "handleProductCategoryToOrgRequestType"), com.flexnet.operations.webservices.HandleProductCategoryToOrgRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "handleProductCategoryToOrgResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.HandleProductCategoryToOrgResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "removeProductCategoriesFromOrgResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isEntitlementVisibleInTargetOrg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isEntitlementVisibleInTargetOrgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isEntitlementVisibleInTargetOrgRequestType"), com.flexnet.operations.webservices.IsEntitlementVisibleInTargetOrgRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isEntitlementVisibleInTargetOrgResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.IsEntitlementVisibleInTargetOrgResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isEntitlementVisibleInTargetOrgResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isFulfillmentVisibleInTargetOrg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isFulfillmentVisibleInTargetOrgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isFulfillmentVisibleInTargetOrgRequestType"), com.flexnet.operations.webservices.IsFulfillmentVisibleInTargetOrgRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isFulfillmentVisibleInTargetOrgResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.IsFulfillmentVisibleInTargetOrgResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isFulfillmentVisibleInTargetOrgResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setProductState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setProductStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setProductStateRequestType"), com.flexnet.operations.webservices.SetProductStateRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setProductStateResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.SetProductStateResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setProductStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createMaintenance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createMaintenanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createMaintenanceRequestType"), com.flexnet.operations.webservices.CreateMaintenanceRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createMaintenanceResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.CreateMaintenanceResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createMaintenanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateMaintenance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateMaintenanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateMaintenanceRequestType"), com.flexnet.operations.webservices.UpdateMaintenanceRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateMaintenanceResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.UpdateMaintenanceResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateMaintenanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteMaintenance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceRequestType"), com.flexnet.operations.webservices.DeleteMaintenanceRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.DeleteMaintenanceResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMaintenanceCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceCountRequestType"), com.flexnet.operations.webservices.GetMaintenanceCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceCountResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetMaintenanceCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMaintenanceQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceQueryRequestType"), com.flexnet.operations.webservices.GetMaintenanceQueryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceQueryResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetMaintenanceQueryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setMaintenanceState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setMaintenanceStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setMaintenanceStateRequestType"), com.flexnet.operations.webservices.SetMaintenanceStateRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setMaintenanceStateResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.SetMaintenanceStateResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setMaintenanceStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUniformSuite");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUniformSuiteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUniformSuiteRequestType"), com.flexnet.operations.webservices.CreateUniformSuiteRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUniformSuiteResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.CreateUniformSuiteResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUniformSuiteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateUniformSuite");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUniformSuiteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUniformSuiteRequestType"), com.flexnet.operations.webservices.UpdateUniformSuiteRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUniformSuiteResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.UpdateUniformSuiteResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUniformSuiteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUniformSuite");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUniformSuiteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUniformSuiteRequestType"), com.flexnet.operations.webservices.DeleteUniformSuiteRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUniformSuiteResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.DeleteUniformSuiteResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUniformSuiteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniformSuiteCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUniformSuiteCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUniformSuiteCountRequestType"), com.flexnet.operations.webservices.GetUniformSuiteCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUniformSuiteCountResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetUniformSuiteCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUniformSuiteCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniformSuiteQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUniformSuitesQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUniformSuitesQueryRequestType"), com.flexnet.operations.webservices.GetUniformSuitesQueryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUniformSuitesQueryResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetUniformSuitesQueryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUniformSuitesQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setUniformSuiteState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setUniformSuiteStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setUniformSuiteStateRequestType"), com.flexnet.operations.webservices.SetUniformSuiteStateRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setUniformSuiteStateResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.SetUniformSuiteStateResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setUniformSuiteStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPartNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createPartNumberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createPartNumberRequestType"), com.flexnet.operations.webservices.CreatePartNumberRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createPartNumberResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.CreatePartNumberResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createPartNumberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deletePartNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deletePartNumberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deletePartNumberRequestType"), com.flexnet.operations.webservices.DeletePartNumberRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deletePartNumberResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.DeletePartNumberResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deletePartNumberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPartNumberCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getPartNumberCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getPartNumberCountRequestType"), com.flexnet.operations.webservices.GetPartNumberCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getPartNumberCountResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetPartNumberCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getPartNumberCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPartNumbersQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getPartNumbersQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getPartNumbersQueryRequestType"), com.flexnet.operations.webservices.GetPartNumbersQueryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getPartNumbersQueryResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetPartNumbersQueryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getPartNumbersQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createProductRelationship");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductRelationshipRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductRelationshipRequestType"), com.flexnet.operations.webservices.CreateProductRelationshipRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductRelationshipResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.CreateProductRelationshipResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductRelationshipResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateProductRelationship");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductRelationshipRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductRelationshipRequestType"), com.flexnet.operations.webservices.UpdateProductRelationshipRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductRelationshipResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.UpdateProductRelationshipResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductRelationshipResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteProductRelationship");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteProductRelationshipRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteProductRelationshipRequestType"), com.flexnet.operations.webservices.DeleteProductRelationshipRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteProductRelationshipResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.DeleteProductRelationshipResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteProductRelationshipResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProductRelationships");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductRelationshipsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductRelationshipsRequestType"), com.flexnet.operations.webservices.GetProductRelationshipsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductRelationshipsResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetProductRelationshipsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductRelationshipsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLicenseModelIdentifiers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getModelIdentifiersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getModelIdentifiersRequestType"), com.flexnet.operations.webservices.GetModelIdentifiersRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getModelIdentifiersResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetModelIdentifiersResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getModelIdentifiersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTransactionKeyIdentifiers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getTransactionKeyIdentifiersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getTransactionKeyIdentifiersRequestType"), com.flexnet.operations.webservices.GetTransactionKeyIdentifiersRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getTransactionKeyIdentifiersResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetTransactionKeyIdentifiersResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getTransactionKeyIdentifiersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createOrganization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createOrganizationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createOrganizationRequestType"), com.flexnet.operations.webservices.CreateOrganizationRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createOrganizationResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.CreateOrganizationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createOrganizationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLicenseTechnologiesQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getLicenseTechnologyQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getLicenseTechnologyQueryRequestType"), com.flexnet.operations.webservices.GetLicenseTechnologyQueryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getLicenseTechnologyQueryResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetLicenseTechnologyQueryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getLicenseTechnologyQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

    }

    public ProductPackagingServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ProductPackagingServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ProductPackagingServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "categoryAttributeDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CategoryAttributeDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "categoryAttributesDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CategoryAttributesDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "CollectionOperationType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CollectionOperationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "correlationDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CorrelationDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdFeatureBundleDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedFeatureBundleDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdFeatureDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedFeatureDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdFeatureDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedFeatureDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdMaintenaceDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedMaintenaceDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdMaintenanceDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedMaintenanceDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdOrgDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedOrgDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdOrgDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedOrgDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdPartNumberDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedPartNumberDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdPartNumberDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedPartNumberDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdProductCategoryDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedProductCategoryDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdProductCategoryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedProductCategoryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdProductDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedProductDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdProductDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedProductDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdUniformSuiteDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedUniformSuiteDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdUniformSuiteDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedUniformSuiteDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createFeatureBundleDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateFeatureBundleDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createFeatureBundleRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateFeatureBundleRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createFeatureBundleResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateFeatureBundleResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createFeatureRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateFeatureRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createFeatureResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateFeatureResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createMaintenanceDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateMaintenanceDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createMaintenanceRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateMaintenanceRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createMaintenanceResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateMaintenanceResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createOrganizationRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateOrganizationRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createOrganizationResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateOrganizationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createPartNumberDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatePartNumberDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createPartNumberRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatePartNumberRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createPartNumberResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatePartNumberResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductCategoryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateProductCategoryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductCategoryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateProductCategoryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductCategoryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateProductCategoryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateProductDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductRelationshipRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateProductRelationshipRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductRelationshipResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateProductRelationshipResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateProductRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createProductResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateProductResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUniformSuiteDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateUniformSuiteDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUniformSuiteRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateUniformSuiteRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUniformSuiteResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateUniformSuiteResponseType.class;
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

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureBundleDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteFeatureBundleDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureBundleRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteFeatureBundleRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureBundleResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteFeatureBundleResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteFeatureDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteFeatureRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteFeatureResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteFeatureResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteMaintenanceDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteMaintenanceRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteMaintenanceResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteMaintenanceResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deletePartNumberDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeletePartNumberDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deletePartNumberRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeletePartNumberRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deletePartNumberResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeletePartNumberResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteProductDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteProductDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteProductRelationshipRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteProductRelationshipRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteProductRelationshipResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteProductRelationshipResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteProductRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteProductRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteProductResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteProductResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUniformSuiteDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteUniformSuiteDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUniformSuiteRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteUniformSuiteRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUniformSuiteResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteUniformSuiteResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "dupGroupDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DupGroupDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DupGroupType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DupGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteFeatureBundleDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteFeatureBundleDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteFeatureBundleDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteFeatureBundleDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteFeatureDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteFeatureDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteFeatureDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteFeatureDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteMaintenanceDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteMaintenanceDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteMaintenanceDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteMaintenanceDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeletePartNumberDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeletePartNumberDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeletePartNumberDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeletePartNumberDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteProductDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteProductDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteProductDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteProductDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteUniformSuiteDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteUniformSuiteDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteUniformSuiteDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteUniformSuiteDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeatureBundleDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedFeatureBundleDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeatureBundleDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedFeatureBundleDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeatureBundleStateDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedFeatureBundleStateDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeatureBundleStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedFeatureBundleStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeatureDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedFeatureDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeatureDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedFeatureDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeatureStateDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedFeatureStateDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedFeatureStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedFeatureStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMaintenanceDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedMaintenanceDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMaintenanceDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedMaintenanceDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMaintenanceStateDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedMaintenanceStateDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedMaintenanceStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedMaintenanceStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedOrgDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedOrgDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedOrgDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedOrgDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedPartNumberDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedPartNumberDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedPartNumberDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedPartNumberDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedProductCategoryDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedProductCategoryDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedProductCategoryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedProductCategoryDataType.class;
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
            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedProductDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedProductDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedProductDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedProductDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedProductRelationshipDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedProductRelationshipDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedProductRelationshipDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedProductRelationshipDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedProductStateDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedProductStateDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedProductStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedProductStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUniformSuiteDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUniformSuiteDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUniformSuiteDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUniformSuiteDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUniformSuiteStateDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUniformSuiteStateDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUniformSuiteStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUniformSuiteStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateFeatureBundleDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateFeatureBundleDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateFeatureBundleDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateFeatureBundleDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateFeatureDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateFeatureDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateFeatureDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateFeatureDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateMaintenanceDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateMaintenanceDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateMaintenanceDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateMaintenanceDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateProductDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateProductDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateProductDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateProductDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateProductRelationshipDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateProductRelationshipDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateProductRelationshipDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateProductRelationshipDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateUniformSuiteDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateUniformSuiteDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateUniformSuiteDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateUniformSuiteDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureBundleIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleIdentifierWithCountDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureBundleIdentifierWithCountDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundlePKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureBundlePKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleQueryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureBundleQueryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleQueryParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureBundleQueryParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundlesListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureBundlesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureBundleStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureBundleStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureIdentifierWithCountDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureIdentifierWithCountDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureOverrideParamsType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureOverrideParamsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featurePKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeaturePKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureQueryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureQueryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureQueryParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureQueryParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featuresListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeaturesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "featureStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FeatureStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getCountResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetCountResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundleCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetFeatureBundleCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundleCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetFeatureBundleCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundlesQueryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetFeatureBundlesQueryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundlesQueryResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetFeatureBundlesQueryResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureBundlesQueryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetFeatureBundlesQueryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetFeatureCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeatureCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetFeatureCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeaturesQueryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetFeaturesQueryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeaturesQueryResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetFeaturesQueryResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getFeaturesQueryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetFeaturesQueryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getLicenseTechnologyQueryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetLicenseTechnologyQueryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getLicenseTechnologyQueryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetLicenseTechnologyQueryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMaintenanceCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMaintenanceCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceQueryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMaintenanceQueryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceQueryResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMaintenanceQueryResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getMaintenanceQueryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetMaintenanceQueryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getModelIdentifiersRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetModelIdentifiersRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getModelIdentifiersResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetModelIdentifiersResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getPartNumberCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetPartNumberCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getPartNumberCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetPartNumberCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getPartNumbersQueryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetPartNumbersQueryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getPartNumbersQueryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetPartNumbersQueryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCategoriesRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetProductCategoriesRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCategoriesResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetProductCategoriesResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCategoriesResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetProductCategoriesResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetProductCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetProductCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductRelationshipsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetProductRelationshipsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductRelationshipsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetProductRelationshipsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductsQueryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetProductsQueryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductsQueryResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetProductsQueryResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getProductsQueryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetProductsQueryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getTransactionKeyIdentifiersRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetTransactionKeyIdentifiersRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getTransactionKeyIdentifiersResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetTransactionKeyIdentifiersResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUniformSuiteCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUniformSuiteCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUniformSuiteCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUniformSuiteCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUniformSuitesQueryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUniformSuitesQueryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUniformSuitesQueryResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUniformSuitesQueryResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUniformSuitesQueryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUniformSuitesQueryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersForProductCategoryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUsersForProductCategoryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersForProductCategoryResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUsersForProductCategoryResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersForProductCategoryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUsersForProductCategoryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "groupMaskDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GroupMaskDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "GroupMaskType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GroupMaskType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "handleProductCategoriesToUserRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.HandleProductCategoriesToUserRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "handleProductCategoriesToUserResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.HandleProductCategoriesToUserResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "handleProductCategoryToOrgRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.HandleProductCategoryToOrgRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "handleProductCategoryToOrgResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.HandleProductCategoryToOrgResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "hostTypeListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.HostTypeListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "hostTypePKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.HostTypePKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "identifierQueryParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.IdentifierQueryParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isEntitlementVisibleInTargetOrgRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.IsEntitlementVisibleInTargetOrgRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isEntitlementVisibleInTargetOrgResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.IsEntitlementVisibleInTargetOrgResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isFulfillmentVisibleInTargetOrgRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.IsFulfillmentVisibleInTargetOrgRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "isFulfillmentVisibleInTargetOrgResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.IsFulfillmentVisibleInTargetOrgResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseGeneratorIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseGeneratorIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseGeneratorPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseGeneratorPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseGeneratorsDetailsType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseGeneratorsDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelDetailsType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseModelDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseModelIdentifierType.class;
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
            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseModelPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseModelsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseModelsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnologyDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseTechnologyDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnologyDetailsType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseTechnologyDetailsType.class;
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

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "licenseTechnologyQueryParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LicenseTechnologyQueryParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MaintenanceIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenancePKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MaintenancePKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceQueryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MaintenanceQueryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceQueryParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MaintenanceQueryParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "maintenanceStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.MaintenanceStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "modelAttributesType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ModelAttributesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "modelIdentifiersDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ModelIdentifiersDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationBasicDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.OrganizationBasicDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "packagePropertiesDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PackagePropertiesDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberCountDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PartNumberCountDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PartNumberDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PartNumberDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PartNumberIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberIdentifierWithModelType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PartNumberIdentifierWithModelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PartNumberPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumberQueryParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PartNumberQueryParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumbersListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PartNumbersListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "partNumbersSimpleListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PartNumbersSimpleListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "prodCustomAttributeQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProdCustomAttributeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "prodCustomAttributesQueryListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProdCustomAttributesQueryListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productCategoryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductCategoryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productIdentifierWithCountDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductIdentifierWithCountDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productQueryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductQueryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productQueryParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductQueryParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productRelationshipDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductRelationshipDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "productStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.ProductStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relationshipType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RelationshipType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setFeatureBundleStateRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetFeatureBundleStateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setFeatureBundleStateResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetFeatureBundleStateResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setFeatureStateRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetFeatureStateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setFeatureStateResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetFeatureStateResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setMaintenanceStateRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetMaintenanceStateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setMaintenanceStateResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetMaintenanceStateResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setProductStateRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetProductStateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setProductStateResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetProductStateResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setUniformSuiteStateRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetUniformSuiteStateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "setUniformSuiteStateResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SetUniformSuiteStateResponseType.class;
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

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "suiteCustomAttributeQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SuiteCustomAttributeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "suiteCustomAttributesQueryListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SuiteCustomAttributesQueryListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "suiteIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SuiteIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "suitePKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SuitePKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "suiteQueryParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.SuiteQueryParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "transactionKeyIdentifiersDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TransactionKeyIdentifiersDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "trustedKeyIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TrustedKeyIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "trustedKeyPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.TrustedKeyPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "uniformSuiteQueryDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UniformSuiteQueryDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "uniformSuiteStateDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UniformSuiteStateDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureBundleDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateFeatureBundleDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureBundleRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateFeatureBundleRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureBundleResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateFeatureBundleResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureBundlesListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateFeatureBundlesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateFeatureDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateFeatureRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeatureResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateFeatureResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateFeaturesListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateFeaturesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateHostTypeListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateHostTypeListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateLicenseModelsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateLicenseModelsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateMaintenanceDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateMaintenanceDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateMaintenanceRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateMaintenanceRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateMaintenanceResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateMaintenanceResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updatePartNumbersListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdatePartNumbersListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updatePartNumbersSimpleListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdatePartNumbersSimpleListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateProductDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductRelationshipDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateProductRelationshipDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductRelationshipRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateProductRelationshipRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductRelationshipResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateProductRelationshipResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateProductRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateProductResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateProductsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateProductsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUniformSuiteDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUniformSuiteDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUniformSuiteRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUniformSuiteRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUniformSuiteResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUniformSuiteResponseType.class;
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

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "VersionFormatQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.VersionFormatQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "VersionFormatType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.VersionFormatType.class;
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

    public com.flexnet.operations.webservices.CreateFeatureResponseType createFeature(com.flexnet.operations.webservices.CreateFeatureRequestType createFeatureRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "createFeature"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createFeatureRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.CreateFeatureResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.CreateFeatureResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.CreateFeatureResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.UpdateFeatureResponseType updateFeature(com.flexnet.operations.webservices.UpdateFeatureRequestType updateFeatureRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "updateFeature"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateFeatureRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.UpdateFeatureResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.UpdateFeatureResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.UpdateFeatureResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.DeleteFeatureResponseType deleteFeature(com.flexnet.operations.webservices.DeleteFeatureRequestType deleteFeatureRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteFeature"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteFeatureRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.DeleteFeatureResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.DeleteFeatureResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.DeleteFeatureResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetFeatureCountResponseType getFeatureCount(com.flexnet.operations.webservices.GetFeatureCountRequestType getFeatureCountRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getFeatureCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getFeatureCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetFeatureCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetFeatureCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetFeatureCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetFeaturesQueryResponseType getFeaturesQuery(com.flexnet.operations.webservices.GetFeaturesQueryRequestType getFeaturesQueryRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getFeaturesQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getFeaturesQueryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetFeaturesQueryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetFeaturesQueryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetFeaturesQueryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.SetFeatureStateResponseType setFeatureState(com.flexnet.operations.webservices.SetFeatureStateRequestType setFeatureStateRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "setFeatureState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setFeatureStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.SetFeatureStateResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.SetFeatureStateResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.SetFeatureStateResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.CreateFeatureBundleResponseType createFeatureBundle(com.flexnet.operations.webservices.CreateFeatureBundleRequestType createFeatureBundleRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "createFeatureBundle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createFeatureBundleRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.CreateFeatureBundleResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.CreateFeatureBundleResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.CreateFeatureBundleResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.UpdateFeatureBundleResponseType updateFeatureBundle(com.flexnet.operations.webservices.UpdateFeatureBundleRequestType updateFeatureBundleRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "updateFeatureBundle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateFeatureBundleRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.UpdateFeatureBundleResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.UpdateFeatureBundleResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.UpdateFeatureBundleResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.DeleteFeatureBundleResponseType deleteFeatureBundle(com.flexnet.operations.webservices.DeleteFeatureBundleRequestType deleteFeatureBundleRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteFeatureBundle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteFeatureBundleRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.DeleteFeatureBundleResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.DeleteFeatureBundleResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.DeleteFeatureBundleResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetFeatureBundleCountResponseType getFeatureBundleCount(com.flexnet.operations.webservices.GetFeatureBundleCountRequestType getFeatureBundleCountRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getFeatureBundleCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getFeatureBundleCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetFeatureBundleCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetFeatureBundleCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetFeatureBundleCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetFeatureBundlesQueryResponseType getFeatureBundlesQuery(com.flexnet.operations.webservices.GetFeatureBundlesQueryRequestType getFeatureBundlesQueryRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getFeatureBundlesQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getFeatureBundlesQueryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetFeatureBundlesQueryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetFeatureBundlesQueryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetFeatureBundlesQueryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.SetFeatureBundleStateResponseType setFeatureBundleState(com.flexnet.operations.webservices.SetFeatureBundleStateRequestType setFeatureBundleStateRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "setFeatureBundleState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setFeatureBundleStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.SetFeatureBundleStateResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.SetFeatureBundleStateResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.SetFeatureBundleStateResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.CreateProductResponseType createProduct(com.flexnet.operations.webservices.CreateProductRequestType createProductRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "createProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createProductRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.CreateProductResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.CreateProductResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.CreateProductResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.UpdateProductResponseType updateProduct(com.flexnet.operations.webservices.UpdateProductRequestType updateProductRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "updateProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateProductRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.UpdateProductResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.UpdateProductResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.UpdateProductResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.DeleteProductResponseType deleteProduct(com.flexnet.operations.webservices.DeleteProductRequestType deleteProductRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteProductRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.DeleteProductResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.DeleteProductResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.DeleteProductResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetProductCountResponseType getProductCount(com.flexnet.operations.webservices.GetProductCountRequestType getProductCountRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getProductCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getProductCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetProductCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetProductCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetProductCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetProductsQueryResponseType getProductsQuery(com.flexnet.operations.webservices.GetProductsQueryRequestType getProductsQueryRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getProductsQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getProductsQueryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetProductsQueryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetProductsQueryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetProductsQueryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.CreateProductCategoryResponseType createProductCategory(com.flexnet.operations.webservices.CreateProductCategoryRequestType createProductCategoryRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "createProductCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createProductCategoryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.CreateProductCategoryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.CreateProductCategoryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.CreateProductCategoryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetProductCategoriesResponseType getProductCategories(com.flexnet.operations.webservices.GetProductCategoriesRequestType getProductCategoriesRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getProductCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getProductCategoriesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetProductCategoriesResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetProductCategoriesResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetProductCategoriesResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.HandleProductCategoriesToUserResponseType assignProductCategoriesToUser(com.flexnet.operations.webservices.HandleProductCategoriesToUserRequestType assignProductCategoriesToUserRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "assignProductCategoriesToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {assignProductCategoriesToUserRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.HandleProductCategoriesToUserResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.HandleProductCategoriesToUserResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.HandleProductCategoriesToUserResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.HandleProductCategoriesToUserResponseType removeProductCategoriesFromUser(com.flexnet.operations.webservices.HandleProductCategoriesToUserRequestType removeProductCategoriesFromUserRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "removeProductCategoriesFromUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {removeProductCategoriesFromUserRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.HandleProductCategoriesToUserResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.HandleProductCategoriesToUserResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.HandleProductCategoriesToUserResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetUsersForProductCategoryResponseType getUsersForProductCategory(com.flexnet.operations.webservices.GetUsersForProductCategoryRequestType getUsersForProductCategoryRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getUsersForProductCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getUsersForProductCategoryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetUsersForProductCategoryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetUsersForProductCategoryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetUsersForProductCategoryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.HandleProductCategoryToOrgResponseType assignProductCategoriesToOrg(com.flexnet.operations.webservices.HandleProductCategoryToOrgRequestType assignProductCategoriesToOrgRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "assignProductCategoriesToOrg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {assignProductCategoriesToOrgRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.HandleProductCategoryToOrgResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.HandleProductCategoryToOrgResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.HandleProductCategoryToOrgResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.HandleProductCategoryToOrgResponseType removeProductCategoriesFromOrg(com.flexnet.operations.webservices.HandleProductCategoryToOrgRequestType removeProductCategoriesFromOrgRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "removeProductCategoriesFromOrg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {removeProductCategoriesFromOrgRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.HandleProductCategoryToOrgResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.HandleProductCategoryToOrgResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.HandleProductCategoryToOrgResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.IsEntitlementVisibleInTargetOrgResponseType isEntitlementVisibleInTargetOrg(com.flexnet.operations.webservices.IsEntitlementVisibleInTargetOrgRequestType isEntitlementVisibleInTargetOrgRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "isEntitlementVisibleInTargetOrg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {isEntitlementVisibleInTargetOrgRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.IsEntitlementVisibleInTargetOrgResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.IsEntitlementVisibleInTargetOrgResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.IsEntitlementVisibleInTargetOrgResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.IsFulfillmentVisibleInTargetOrgResponseType isFulfillmentVisibleInTargetOrg(com.flexnet.operations.webservices.IsFulfillmentVisibleInTargetOrgRequestType isFulfillmentVisibleInTargetOrgRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "isFulfillmentVisibleInTargetOrg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {isFulfillmentVisibleInTargetOrgRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.IsFulfillmentVisibleInTargetOrgResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.IsFulfillmentVisibleInTargetOrgResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.IsFulfillmentVisibleInTargetOrgResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.SetProductStateResponseType setProductState(com.flexnet.operations.webservices.SetProductStateRequestType setProductStateRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "setProductState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setProductStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.SetProductStateResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.SetProductStateResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.SetProductStateResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.CreateMaintenanceResponseType createMaintenance(com.flexnet.operations.webservices.CreateMaintenanceRequestType createMaintenanceRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "createMaintenance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createMaintenanceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.CreateMaintenanceResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.CreateMaintenanceResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.CreateMaintenanceResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.UpdateMaintenanceResponseType updateMaintenance(com.flexnet.operations.webservices.UpdateMaintenanceRequestType updateMaintenanceRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "updateMaintenance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateMaintenanceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.UpdateMaintenanceResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.UpdateMaintenanceResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.UpdateMaintenanceResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.DeleteMaintenanceResponseType deleteMaintenance(com.flexnet.operations.webservices.DeleteMaintenanceRequestType deleteMaintenanceRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteMaintenance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteMaintenanceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.DeleteMaintenanceResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.DeleteMaintenanceResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.DeleteMaintenanceResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetMaintenanceCountResponseType getMaintenanceCount(com.flexnet.operations.webservices.GetMaintenanceCountRequestType getMaintenanceCountRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getMaintenanceCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getMaintenanceCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetMaintenanceCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetMaintenanceCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetMaintenanceCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetMaintenanceQueryResponseType getMaintenanceQuery(com.flexnet.operations.webservices.GetMaintenanceQueryRequestType getMaintenanceQueryRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getMaintenanceQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getMaintenanceQueryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetMaintenanceQueryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetMaintenanceQueryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetMaintenanceQueryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.SetMaintenanceStateResponseType setMaintenanceState(com.flexnet.operations.webservices.SetMaintenanceStateRequestType setMaintenanceStateRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "setMaintenanceState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setMaintenanceStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.SetMaintenanceStateResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.SetMaintenanceStateResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.SetMaintenanceStateResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.CreateUniformSuiteResponseType createUniformSuite(com.flexnet.operations.webservices.CreateUniformSuiteRequestType createUniformSuiteRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "createUniformSuite"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createUniformSuiteRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.CreateUniformSuiteResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.CreateUniformSuiteResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.CreateUniformSuiteResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.UpdateUniformSuiteResponseType updateUniformSuite(com.flexnet.operations.webservices.UpdateUniformSuiteRequestType updateUniformSuiteRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "updateUniformSuite"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateUniformSuiteRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.UpdateUniformSuiteResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.UpdateUniformSuiteResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.UpdateUniformSuiteResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.DeleteUniformSuiteResponseType deleteUniformSuite(com.flexnet.operations.webservices.DeleteUniformSuiteRequestType deleteUniformSuiteRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteUniformSuite"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteUniformSuiteRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.DeleteUniformSuiteResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.DeleteUniformSuiteResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.DeleteUniformSuiteResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetUniformSuiteCountResponseType getUniformSuiteCount(com.flexnet.operations.webservices.GetUniformSuiteCountRequestType getUniformSuiteCountRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getUniformSuiteCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getUniformSuiteCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetUniformSuiteCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetUniformSuiteCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetUniformSuiteCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetUniformSuitesQueryResponseType getUniformSuiteQuery(com.flexnet.operations.webservices.GetUniformSuitesQueryRequestType getUniformSuitesQueryRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getUniformSuiteQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getUniformSuitesQueryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetUniformSuitesQueryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetUniformSuitesQueryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetUniformSuitesQueryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.SetUniformSuiteStateResponseType setUniformSuiteState(com.flexnet.operations.webservices.SetUniformSuiteStateRequestType setUniformSuiteStateRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "setUniformSuiteState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setUniformSuiteStateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.SetUniformSuiteStateResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.SetUniformSuiteStateResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.SetUniformSuiteStateResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.CreatePartNumberResponseType createPartNumber(com.flexnet.operations.webservices.CreatePartNumberRequestType createPartNumberRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "createPartNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createPartNumberRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.CreatePartNumberResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.CreatePartNumberResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.CreatePartNumberResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.DeletePartNumberResponseType deletePartNumber(com.flexnet.operations.webservices.DeletePartNumberRequestType deletePartNumberRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "deletePartNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deletePartNumberRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.DeletePartNumberResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.DeletePartNumberResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.DeletePartNumberResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetPartNumberCountResponseType getPartNumberCount(com.flexnet.operations.webservices.GetPartNumberCountRequestType getPartNumberCountRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getPartNumberCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPartNumberCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetPartNumberCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetPartNumberCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetPartNumberCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetPartNumbersQueryResponseType getPartNumbersQuery(com.flexnet.operations.webservices.GetPartNumbersQueryRequestType getPartNumbersQueryRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPartNumbersQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPartNumbersQueryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetPartNumbersQueryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetPartNumbersQueryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetPartNumbersQueryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.CreateProductRelationshipResponseType createProductRelationship(com.flexnet.operations.webservices.CreateProductRelationshipRequestType createProductRelationshipRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createProductRelationship"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createProductRelationshipRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.CreateProductRelationshipResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.CreateProductRelationshipResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.CreateProductRelationshipResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.UpdateProductRelationshipResponseType updateProductRelationship(com.flexnet.operations.webservices.UpdateProductRelationshipRequestType updateProductRelationshipRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateProductRelationship"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateProductRelationshipRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.UpdateProductRelationshipResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.UpdateProductRelationshipResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.UpdateProductRelationshipResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.DeleteProductRelationshipResponseType deleteProductRelationship(com.flexnet.operations.webservices.DeleteProductRelationshipRequestType deleteProductRelationshipRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteProductRelationship"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteProductRelationshipRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.DeleteProductRelationshipResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.DeleteProductRelationshipResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.DeleteProductRelationshipResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetProductRelationshipsResponseType getProductRelationships(com.flexnet.operations.webservices.GetProductRelationshipsRequestType getProductRelationshipsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getProductRelationships"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getProductRelationshipsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetProductRelationshipsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetProductRelationshipsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetProductRelationshipsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetModelIdentifiersResponseType getLicenseModelIdentifiers(com.flexnet.operations.webservices.GetModelIdentifiersRequestType getModelIdentifiersRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLicenseModelIdentifiers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getModelIdentifiersRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetModelIdentifiersResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetModelIdentifiersResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetModelIdentifiersResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetTransactionKeyIdentifiersResponseType getTransactionKeyIdentifiers(com.flexnet.operations.webservices.GetTransactionKeyIdentifiersRequestType getTransactionKeyIdentifiersRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTransactionKeyIdentifiers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getTransactionKeyIdentifiersRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetTransactionKeyIdentifiersResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetTransactionKeyIdentifiersResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetTransactionKeyIdentifiersResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.CreateOrganizationResponseType createOrganization(com.flexnet.operations.webservices.CreateOrganizationRequestType createOrganizationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createOrganization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createOrganizationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.CreateOrganizationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.CreateOrganizationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.CreateOrganizationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetLicenseTechnologyQueryResponseType getLicenseTechnologiesQuery(com.flexnet.operations.webservices.GetLicenseTechnologyQueryRequestType getLicenseTechnologyQueryRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLicenseTechnologiesQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getLicenseTechnologyQueryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetLicenseTechnologyQueryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetLicenseTechnologyQueryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetLicenseTechnologyQueryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
