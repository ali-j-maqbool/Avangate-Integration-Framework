/**
 * ProductPackagingServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public interface ProductPackagingServiceInterface extends java.rmi.Remote {
    public com.flexnet.operations.webservices.CreateFeatureResponseType createFeature(com.flexnet.operations.webservices.CreateFeatureRequestType createFeatureRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.UpdateFeatureResponseType updateFeature(com.flexnet.operations.webservices.UpdateFeatureRequestType updateFeatureRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.DeleteFeatureResponseType deleteFeature(com.flexnet.operations.webservices.DeleteFeatureRequestType deleteFeatureRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetFeatureCountResponseType getFeatureCount(com.flexnet.operations.webservices.GetFeatureCountRequestType getFeatureCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetFeaturesQueryResponseType getFeaturesQuery(com.flexnet.operations.webservices.GetFeaturesQueryRequestType getFeaturesQueryRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.SetFeatureStateResponseType setFeatureState(com.flexnet.operations.webservices.SetFeatureStateRequestType setFeatureStateRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.CreateFeatureBundleResponseType createFeatureBundle(com.flexnet.operations.webservices.CreateFeatureBundleRequestType createFeatureBundleRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.UpdateFeatureBundleResponseType updateFeatureBundle(com.flexnet.operations.webservices.UpdateFeatureBundleRequestType updateFeatureBundleRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.DeleteFeatureBundleResponseType deleteFeatureBundle(com.flexnet.operations.webservices.DeleteFeatureBundleRequestType deleteFeatureBundleRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetFeatureBundleCountResponseType getFeatureBundleCount(com.flexnet.operations.webservices.GetFeatureBundleCountRequestType getFeatureBundleCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetFeatureBundlesQueryResponseType getFeatureBundlesQuery(com.flexnet.operations.webservices.GetFeatureBundlesQueryRequestType getFeatureBundlesQueryRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.SetFeatureBundleStateResponseType setFeatureBundleState(com.flexnet.operations.webservices.SetFeatureBundleStateRequestType setFeatureBundleStateRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.CreateProductResponseType createProduct(com.flexnet.operations.webservices.CreateProductRequestType createProductRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.UpdateProductResponseType updateProduct(com.flexnet.operations.webservices.UpdateProductRequestType updateProductRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.DeleteProductResponseType deleteProduct(com.flexnet.operations.webservices.DeleteProductRequestType deleteProductRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetProductCountResponseType getProductCount(com.flexnet.operations.webservices.GetProductCountRequestType getProductCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetProductsQueryResponseType getProductsQuery(com.flexnet.operations.webservices.GetProductsQueryRequestType getProductsQueryRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.CreateProductCategoryResponseType createProductCategory(com.flexnet.operations.webservices.CreateProductCategoryRequestType createProductCategoryRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetProductCategoriesResponseType getProductCategories(com.flexnet.operations.webservices.GetProductCategoriesRequestType getProductCategoriesRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.HandleProductCategoriesToUserResponseType assignProductCategoriesToUser(com.flexnet.operations.webservices.HandleProductCategoriesToUserRequestType assignProductCategoriesToUserRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.HandleProductCategoriesToUserResponseType removeProductCategoriesFromUser(com.flexnet.operations.webservices.HandleProductCategoriesToUserRequestType removeProductCategoriesFromUserRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetUsersForProductCategoryResponseType getUsersForProductCategory(com.flexnet.operations.webservices.GetUsersForProductCategoryRequestType getUsersForProductCategoryRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.HandleProductCategoryToOrgResponseType assignProductCategoriesToOrg(com.flexnet.operations.webservices.HandleProductCategoryToOrgRequestType assignProductCategoriesToOrgRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.HandleProductCategoryToOrgResponseType removeProductCategoriesFromOrg(com.flexnet.operations.webservices.HandleProductCategoryToOrgRequestType removeProductCategoriesFromOrgRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.IsEntitlementVisibleInTargetOrgResponseType isEntitlementVisibleInTargetOrg(com.flexnet.operations.webservices.IsEntitlementVisibleInTargetOrgRequestType isEntitlementVisibleInTargetOrgRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.IsFulfillmentVisibleInTargetOrgResponseType isFulfillmentVisibleInTargetOrg(com.flexnet.operations.webservices.IsFulfillmentVisibleInTargetOrgRequestType isFulfillmentVisibleInTargetOrgRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.SetProductStateResponseType setProductState(com.flexnet.operations.webservices.SetProductStateRequestType setProductStateRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.CreateMaintenanceResponseType createMaintenance(com.flexnet.operations.webservices.CreateMaintenanceRequestType createMaintenanceRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.UpdateMaintenanceResponseType updateMaintenance(com.flexnet.operations.webservices.UpdateMaintenanceRequestType updateMaintenanceRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.DeleteMaintenanceResponseType deleteMaintenance(com.flexnet.operations.webservices.DeleteMaintenanceRequestType deleteMaintenanceRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetMaintenanceCountResponseType getMaintenanceCount(com.flexnet.operations.webservices.GetMaintenanceCountRequestType getMaintenanceCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetMaintenanceQueryResponseType getMaintenanceQuery(com.flexnet.operations.webservices.GetMaintenanceQueryRequestType getMaintenanceQueryRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.SetMaintenanceStateResponseType setMaintenanceState(com.flexnet.operations.webservices.SetMaintenanceStateRequestType setMaintenanceStateRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.CreateUniformSuiteResponseType createUniformSuite(com.flexnet.operations.webservices.CreateUniformSuiteRequestType createUniformSuiteRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.UpdateUniformSuiteResponseType updateUniformSuite(com.flexnet.operations.webservices.UpdateUniformSuiteRequestType updateUniformSuiteRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.DeleteUniformSuiteResponseType deleteUniformSuite(com.flexnet.operations.webservices.DeleteUniformSuiteRequestType deleteUniformSuiteRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetUniformSuiteCountResponseType getUniformSuiteCount(com.flexnet.operations.webservices.GetUniformSuiteCountRequestType getUniformSuiteCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetUniformSuitesQueryResponseType getUniformSuiteQuery(com.flexnet.operations.webservices.GetUniformSuitesQueryRequestType getUniformSuitesQueryRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.SetUniformSuiteStateResponseType setUniformSuiteState(com.flexnet.operations.webservices.SetUniformSuiteStateRequestType setUniformSuiteStateRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.CreatePartNumberResponseType createPartNumber(com.flexnet.operations.webservices.CreatePartNumberRequestType createPartNumberRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.DeletePartNumberResponseType deletePartNumber(com.flexnet.operations.webservices.DeletePartNumberRequestType deletePartNumberRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetPartNumberCountResponseType getPartNumberCount(com.flexnet.operations.webservices.GetPartNumberCountRequestType getPartNumberCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetPartNumbersQueryResponseType getPartNumbersQuery(com.flexnet.operations.webservices.GetPartNumbersQueryRequestType getPartNumbersQueryRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.CreateProductRelationshipResponseType createProductRelationship(com.flexnet.operations.webservices.CreateProductRelationshipRequestType createProductRelationshipRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.UpdateProductRelationshipResponseType updateProductRelationship(com.flexnet.operations.webservices.UpdateProductRelationshipRequestType updateProductRelationshipRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.DeleteProductRelationshipResponseType deleteProductRelationship(com.flexnet.operations.webservices.DeleteProductRelationshipRequestType deleteProductRelationshipRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetProductRelationshipsResponseType getProductRelationships(com.flexnet.operations.webservices.GetProductRelationshipsRequestType getProductRelationshipsRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetModelIdentifiersResponseType getLicenseModelIdentifiers(com.flexnet.operations.webservices.GetModelIdentifiersRequestType getModelIdentifiersRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetTransactionKeyIdentifiersResponseType getTransactionKeyIdentifiers(com.flexnet.operations.webservices.GetTransactionKeyIdentifiersRequestType getTransactionKeyIdentifiersRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.CreateOrganizationResponseType createOrganization(com.flexnet.operations.webservices.CreateOrganizationRequestType createOrganizationRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetLicenseTechnologyQueryResponseType getLicenseTechnologiesQuery(com.flexnet.operations.webservices.GetLicenseTechnologyQueryRequestType getLicenseTechnologyQueryRequest) throws java.rmi.RemoteException;
}
