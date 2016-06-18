/**
 * EntitlementOrderServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public interface EntitlementOrderServiceInterface extends java.rmi.Remote {
    public com.flexnet.operations.webservices.CreateBulkEntitlementResponseType createBulkEntitlement(com.flexnet.operations.webservices.CreateBulkEntitlementRequestType createBulkEntitlementRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.CreateSimpleEntitlementResponseType createSimpleEntitlement(com.flexnet.operations.webservices.CreateSimpleEntitlementRequestType createSimpleEntitlementRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.DeleteEntitlementResponseType deleteEntitlement(com.flexnet.operations.webservices.DeleteEntitlementRequestType deleteEntitlementRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.AddWebRegKeyResponseType createWebRegKey(com.flexnet.operations.webservices.AddWebRegKeyRequestType addWebRegKeyRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.UpdateBulkEntitlementResponseType updateBulkEntitlement(com.flexnet.operations.webservices.UpdateBulkEntitlementRequestType updateBulkEntitlementRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.UpdateSimpleEntitlementResponseType updateSimpleEntitlement(com.flexnet.operations.webservices.UpdateSimpleEntitlementRequestType updateSimpleEntitlementRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemResponseType createEntitlementLineItem(com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemRequestType createEntitlementLineItemRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemResponseType replaceEntitlementLineItem(com.flexnet.operations.webservices.AddOrReplaceEntitlementLineItemRequestType replaceEntitlementLineItemRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.RemoveEntitlementLineItemResponseType deleteEntitlementLineItem(com.flexnet.operations.webservices.RemoveEntitlementLineItemRequestType removeEntitlementLineItemRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.UpdateEntitlementLineItemResponseType updateEntitlementLineItem(com.flexnet.operations.webservices.UpdateEntitlementLineItemRequestType updateEntitlementLineItemRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.SearchEntitlementResponseType getEntitlementsQuery(com.flexnet.operations.webservices.SearchEntitlementRequestType searchEntitlementRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetBulkEntitlementPropertiesResponseType getBulkEntitlementPropertiesQuery(com.flexnet.operations.webservices.GetBulkEntitlementPropertiesRequestType getBulkEntitlementPropertiesRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetBulkEntitlementCountResponseType getBulkEntitlementCount(com.flexnet.operations.webservices.GetBulkEntitlementCountRequestType getBulkEntitlementCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.SearchActivatableItemResponseType getActivatableItemsQuery(com.flexnet.operations.webservices.SearchActivatableItemRequestType searchActivatableItemRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.SearchEntitlementLineItemPropertiesResponseType getEntitlementLineItemPropertiesQuery(com.flexnet.operations.webservices.SearchEntitlementLineItemPropertiesRequestType searchEntitlementLineItemPropertiesRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetEntitlementCountResponseType getEntitlementCount(com.flexnet.operations.webservices.GetEntitlementCountRequestType getEntitlementCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetActivatableItemCountResponseType getActivatableItemCount(com.flexnet.operations.webservices.GetActivatableItemCountRequestType getActivatableItemCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetExactAvailableCountResponseType getExactAvailableCount(com.flexnet.operations.webservices.GetExactAvailableCountRequestType getExactAvailableCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.SetEntitlementStateResponseType setEntitlementState(com.flexnet.operations.webservices.SetEntitlementStateRequestType setEntitlementStateRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetWebRegKeyCountResponseType getWebRegKeyCount(com.flexnet.operations.webservices.GetWebRegKeyCountRequestType getWebRegKeyCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetWebRegKeysQueryResponseType getWebRegKeysQuery(com.flexnet.operations.webservices.GetWebRegKeysQueryRequestType getWebRegKeysQueryRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetEntitlementAttributesResponseType getEntitlementAttributesFromModel(com.flexnet.operations.webservices.GetEntitlementAttributesRequestType getEntitlementAttributesRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.RenewEntitlementResponseType renewLicense(com.flexnet.operations.webservices.RenewEntitlementRequestType renewLicenseRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.EntitlementLifeCycleResponseType upgradeLicense(com.flexnet.operations.webservices.EntitlementLifeCycleRequestType upgradeLicenseRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.EntitlementLifeCycleResponseType upsellLicense(com.flexnet.operations.webservices.EntitlementLifeCycleRequestType upsellLicenseRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.MapEntitlementsToUserResponseType mapEntitlementsToUser(com.flexnet.operations.webservices.MapEntitlementsToUserRequestType mapEntitlementsToUserRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.EmailEntitlementResponseType emailEntitlement(com.flexnet.operations.webservices.EmailEntitlementRequestType emailEntitlementRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.EmailActivatableItemResponseType emailActivatableItem(com.flexnet.operations.webservices.EmailActivatableItemRequestType emailActivatableItemRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.SetLineItemStateResponseType setLineItemState(com.flexnet.operations.webservices.SetLineItemStateRequestType setLineItemStateRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.SetMaintenanceLineItemStateResponseType setMaintenanceLineItemState(com.flexnet.operations.webservices.SetMaintenanceLineItemStateRequestType setMaintenanceLineItemStateRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.DeleteWebRegKeyResponseType deleteWebRegKey(com.flexnet.operations.webservices.DeleteWebRegKeyRequestType deleteWebRegKeyRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.MergeEntitlementsResponseType mergeEntitlements(com.flexnet.operations.webservices.MergeEntitlementsRequestType mergeEntitlementsRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.TransferEntitlementsResponseType transferEntitlement(com.flexnet.operations.webservices.TransferEntitlementsRequestType transferEntitlementsRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.TransferLineItemsResponseType transferLineItem(com.flexnet.operations.webservices.TransferLineItemsRequestType transferLineItemsRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetStateChangeHistoryResponseType getStateChangeHistory(com.flexnet.operations.webservices.GetStateChangeHistoryRequestType getStateChangeHistoryRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.LinkMaintenanceLineItemResponseType linkMaintenanceLineItem(com.flexnet.operations.webservices.LinkMaintenanceLineItemRequestType linkMaintenanceLineItemRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.SplitLineItemResponseType splitLineItem(com.flexnet.operations.webservices.SplitLineItemRequestType splitLineItemRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.SplitBulkEntitlementResponseType splitBulkEntitlement(com.flexnet.operations.webservices.SplitBulkEntitlementRequestType splitBulkEntitlementRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetMatchingLineItemsResponseType getMatchingLineItems(com.flexnet.operations.webservices.GetMatchingLineItemsRequestType getMatchingLineItemsRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetMatchingBulkEntsResponseType getMatchingBulkEnts(com.flexnet.operations.webservices.GetMatchingBulkEntsRequestType getMatchingBulkEntsRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.DeleteMaintenanceLineItemResponseType deleteMaintenanceLineItem(com.flexnet.operations.webservices.DeleteMaintenanceLineItemRequestType deleteMaintenanceLineItemRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.UnlinkMaintenanceLineItemResponseType unlinkMaintenanceLineItem(com.flexnet.operations.webservices.UnlinkMaintenanceLineItemRequestType unlinkMaintenanceLineItemRequest) throws java.rmi.RemoteException;
}
