/**
 * ManageDeviceServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.opsembedded.webservices;

public interface ManageDeviceServiceInterface extends java.rmi.Remote {
    public com.flexnet.opsembedded.webservices.BaseProductResponseType createBaseProduct(com.flexnet.opsembedded.webservices.BaseProductRequestType createBaseProductRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.BaseProductResponseType updateBaseProduct(com.flexnet.opsembedded.webservices.BaseProductRequestType updateBaseProductRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.BaseProductResponseType deleteBaseProduct(com.flexnet.opsembedded.webservices.DeleteBaseProductRequestType deleteBaseProductRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.CreateDevResponseType createDevice(com.flexnet.opsembedded.webservices.CreateDevRequestType createDeviceRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.CreateDevResponseType createTestDevice(com.flexnet.opsembedded.webservices.CreateDevRequestType createTestDeviceRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.DeleteDeviceResponseType deleteDevice(com.flexnet.opsembedded.webservices.DeleteDeviceRequestType deleteDeviceRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.UpdateDevResponseType updateDevice(com.flexnet.opsembedded.webservices.UpdateDevRequestType updateDeviceRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseResponseType generatePrebuiltLicense(com.flexnet.opsembedded.webservices.GeneratePrebuiltLicenseRequestType generatePrebuiltLicenseRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.GetDevicesResponseType getDevicesQuery(com.flexnet.opsembedded.webservices.GetDevicesRequestType getDevicesRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.GetDeviceCountResponseType getDeviceCount(com.flexnet.opsembedded.webservices.GetDevicesCountRequestType getDeviceCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType linkAddonLineItems(com.flexnet.opsembedded.webservices.LinkAddonLineItemsRequestType linkAddonLineItemsRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.DeleteAddonLineItemsResponseType deleteAddonLineItems(com.flexnet.opsembedded.webservices.DeleteAddonLineItemsRequestType deleteAddonLineItemsRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType incrementAddonLineItems(com.flexnet.opsembedded.webservices.LinkAddonLineItemsRequestType incrementAddonLineItemsRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.LinkAddonLineItemsResponseType decrementAddonLineItems(com.flexnet.opsembedded.webservices.LinkAddonLineItemsRequestType decrementAddonLineItemsRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.SetDeviceStatusResponseType setDeviceStatus(com.flexnet.opsembedded.webservices.SetDeviceStatusRequestListType setDeviceStatusRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.GenerateCapabilityResponseResponseType generateCapabilityResponse(com.flexnet.opsembedded.webservices.GenerateCapabilityResponseRequestType generateCapabilityResponseRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.GetUsageSummaryResponseType getUsageSummary(com.flexnet.opsembedded.webservices.GetUsageSummaryRequestType getUsageSummaryRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.GetUsageSummaryTimesResponseType getUsageSummaryTimes(com.flexnet.opsembedded.webservices.GetUsageSummaryTimesRequestType getUsageSummaryTimesRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.GetUsageHistoryResponseType getUsageHistory(com.flexnet.opsembedded.webservices.GetUsageHistoryRequestType getUsageHistoryRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.DeleteUsageHistoryResponseType deleteUsageHistory(com.flexnet.opsembedded.webservices.DeleteUsageHistoryRequestType deleteUsageHistoryRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.MoveDeviceResponseType moveDevice(com.flexnet.opsembedded.webservices.MoveDeviceRequestType moveDeviceRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.ReturnHostResponseType returnHost(com.flexnet.opsembedded.webservices.ReturnHostRequestListType returnHostRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.ObsoleteHostResponseType obsoleteHost(com.flexnet.opsembedded.webservices.ObsoleteHostRequestListType obsoleteHostRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.GetDeletedSyncResponseType getDeletedSync(com.flexnet.opsembedded.webservices.GetDeletedSyncRequestType getDeletedSyncRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.RestoreServedClientResponseType restoreServedClient(com.flexnet.opsembedded.webservices.RestoreServedClientRequestType restoreServedClientRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.GetAutoProvisionedServerResponse getAutoProvisionedServer(com.flexnet.opsembedded.webservices.GetAutoProvisionedServerRequest getAutoProvisionedServerRequest) throws java.rmi.RemoteException;
    public com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportResponse generateCloneDetectionReport(com.flexnet.opsembedded.webservices.GenerateCloneDetectionReportRequest generateCloneDetectionReportRequest) throws java.rmi.RemoteException;
}
