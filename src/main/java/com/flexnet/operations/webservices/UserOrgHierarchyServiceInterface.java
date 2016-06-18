/**
 * UserOrgHierarchyServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public interface UserOrgHierarchyServiceInterface extends java.rmi.Remote {
    public com.flexnet.operations.webservices.CreateOrgResponseType createOrganization(com.flexnet.operations.webservices.CreateOrgRequestType createOrgRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.LinkOrganizationsResponseType linkOrganizations(com.flexnet.operations.webservices.LinkOrganizationsRequestType linkOrganizationsRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.UpdateOrganizationResponseType updateOrganization(com.flexnet.operations.webservices.UpdateOrganizationRequestType updateOrganizationRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.DeleteOrganizationResponseType deleteOrganization(com.flexnet.operations.webservices.DeleteOrganizationRequestType deleteOrganizationRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetOrganizationsQueryResponseType getOrganizationsQuery(com.flexnet.operations.webservices.GetOrganizationsQueryRequestType getOrganizationsQueryRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetOrganizationCountResponseType getOrganizationCount(com.flexnet.operations.webservices.GetOrganizationCountRequestType getOrganizationCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetParentOrganizationsResponseType getParentOrganizations(com.flexnet.operations.webservices.GetParentOrganizationsRequestType getParentOrganizationsRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetSubOrganizationsResponseType getSubOrganizations(com.flexnet.operations.webservices.GetSubOrganizationsRequestType getSubOrganizationsRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetUsersQueryResponseType getUsersQuery(com.flexnet.operations.webservices.GetUsersQueryRequestType getUsersQueryRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetUserCountResponseType getUserCount(com.flexnet.operations.webservices.GetUserCountRequestType getUserCountRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.CreateUserResponseType createUser(com.flexnet.operations.webservices.CreateUserRequestType createUserRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.UpdateUserResponseType updateUser(com.flexnet.operations.webservices.UpdateUserRequestType updateUserRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.UpdateUserRolesResponseType updateUserRoles(com.flexnet.operations.webservices.UpdateUserRolesRequestType updateUserRolesRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.DeleteUserResponseType deleteUser(com.flexnet.operations.webservices.DeleteUserRequestType deleteUserRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.RelateOrganizationsResponseType relateOrganizations(com.flexnet.operations.webservices.RelateOrganizationsRequestType relateOrganizationsRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetRelatedOrganizationsResponseType getRelatedOrganizations(com.flexnet.operations.webservices.GetRelatedOrganizationsRequestType getRelatedOrganizationsRequest) throws java.rmi.RemoteException;
    public com.flexnet.operations.webservices.GetUserPermissionsResponseType getUserPermissions(com.flexnet.operations.webservices.GetUserPermissionsRequestType getUserPermissionsRequest) throws java.rmi.RemoteException;
}
