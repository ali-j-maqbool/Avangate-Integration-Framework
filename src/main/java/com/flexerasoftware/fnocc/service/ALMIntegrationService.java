package com.flexerasoftware.fnocc.service;

import com.flexerasoftware.fnocc.properties.*;
import com.flexerasoftware.fnocc.service.IntegrationService;
import com.flexerasoftware.fnocc.vo.AccountVO;
import com.flexerasoftware.fnocc.vo.AddressVO;
import com.flexerasoftware.fnocc.vo.EntitlementLineVO;
import com.flexerasoftware.fnocc.vo.EntitlementVO;
import com.flexerasoftware.fnocc.vo.UserVO;
import com.flexnet.operations.webservices.*;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URL;
import java.rmi.Remote;
import javax.xml.soap.SOAPException;
import org.apache.log4j.Logger;

public class ALMIntegrationService
implements IntegrationService {
    private static final Logger log = Logger.getLogger((String) ALMIntegrationService.class.getName());

    private IntegrationCredentials creds;

    public ALMIntegrationService() {
        try {
            Credentials credentials = Credentials.getInstance((String) "ALM_connection.properties");
        } catch (Exception e) {
            log.error((Object) ("Unable to load credentials: " + e.getMessage()), (Throwable) e);
        }
    }


    public ALMIntegrationService(IntegrationCredentials creds) {
        this.creds = creds;
    }

    private String getUserOrgServiceEndpoint() {
        if (null != this.creds) {
            return this.creds.USER_ORG_HIERARCHY_SERVICE;
        }
        return Credentials.USER_ORG_HIERARCHY_SERVICE;
    }

    private String getEntitlementServiceEndpoint() {
        if (null != this.creds) {
            return this.creds.ENTITLEMENT_ORDER_SERVICE_ENDPOINT;
        }
        return Credentials.ENTITLEMENT_ORDER_SERVICE_ENDPOINT;
    }

    private String getUser() {
        if (null != this.creds) {
            return this.creds.USER;
        }
        return Credentials.USER;
    }

    public UserDetailDataType[] getAccountUser(String emailAddress) throws Exception {

        UserOrgHierarchyServiceInterface service = null;

        // Instantiate locator
        UserOrgHierarchyServiceLocator locator = new UserOrgHierarchyServiceLocator();
        service = locator.getUserOrgHierarchyService(new URL(this.getUserOrgServiceEndpoint()));

        //setup credentials
        ClientSecurityCredentials credentials = new ClientSecurityCredentials(service);
        credentials.setUsername(this.getUser());
        credentials.setPassword(this.getPassword());

        GetUsersQueryRequestType cpRequest = new GetUsersQueryRequestType();
        UserQueryParametersType queryParams = new UserQueryParametersType();
        SimpleQueryType emailaddr = new SimpleQueryType();
        emailaddr.setValue(emailAddress);
        emailaddr.setSearchType(SimpleSearchType.CONTAINS);
        queryParams.setEmailAddress(emailaddr);

        queryParams.setCanLogIn(Boolean.TRUE);

        cpRequest.setBatchSize(BigInteger.ONE);
        cpRequest.setPageNumber(BigInteger.ONE);
        cpRequest.setQueryParams(queryParams);

        // invoke getUsers webservice and get the response
        GetUsersQueryResponseType response = service.getUsersQuery(cpRequest);

        // Check the status in the response
        if (response.getStatusInfo().getStatus().toString().equals(StatusType.SUCCESS.toString())) {
            log.info("getUsers Query invoked successfully ");

            GetUsersQueryResponseDataType responseDataType = response.getResponseData();
            if (responseDataType != null) {
                UserDetailDataType[] usersGot = responseDataType.getUser();
                return usersGot;
            }
        } else {
            log.info("user not found");
            log.info("Reason for Failure -> " + response.getStatusInfo().getReason());
        }

        return null;

    }

    private String getPassword() {
        if (null != this.creds) {
            return this.creds.PASSWORD;
        }
        return Credentials.PASSWORD;
    }

    @Override
    public void addAccount(AccountVO account) {
        log.debug((Object) ("Add account: " + account.getName()));
        try {
            UserOrgHierarchyServiceLocator locator = new UserOrgHierarchyServiceLocator();
            UserOrgHierarchyServiceInterface service = locator.getUserOrgHierarchyService(new URL(this.getUserOrgServiceEndpoint()));
            this.setServiceCredentials((Remote) service);
            CreateOrgRequestType req = new CreateOrgRequestType();
            OrganizationDataType[] orgdataarr = new OrganizationDataType[1];
            OrganizationDataType org1 = new OrganizationDataType();
            org1.setName(account.getId());
            org1.setDisplayName(account.getName());
            org1.setDescription(account.getName());
            AddressDataType addr1 = new AddressDataType();
            if (account.getAddress() != null) {
                addr1.setAddress1(account.getAddress().getAddress1());
                addr1.setCity(account.getAddress().getCity());
                addr1.setState(account.getAddress().getState());
                addr1.setZipcode(account.getAddress().getZipcode());
                addr1.setCountry(account.getAddress().getCountry());
            }
            org1.setAddress(addr1);
            orgdataarr[0] = org1;
            req.setOrganization(orgdataarr);
            CreateOrgResponseType response = service.createOrganization(req);
            if (response.getStatusInfo().getStatus().toString().equals(StatusType.SUCCESS.toString())) {
                log.info((Object) "orgs created successfully ");
            } else {
                log.info((Object) ("failed - Reason for Failure -> " + response.getStatusInfo().getReason()));
            }
        } catch (Exception e) {
            log.error((Object) "Error has occurred.", (Throwable) e);
        }
    }

    @Override
    public void addUser(UserVO user) {
        try {
            UserOrgHierarchyServiceLocator locator = new UserOrgHierarchyServiceLocator();
            UserOrgHierarchyServiceInterface service = locator.getUserOrgHierarchyService(new URL(this.getUserOrgServiceEndpoint()));
            this.setServiceCredentials((Remote) service);
            CreateUserRequestType req = new CreateUserRequestType();
            CreateUserDataType[] userRecs = new CreateUserDataType[1];
            CreateUserDataType ALMuser = new CreateUserDataType();
            ALMuser.setCanLogin(true);
            ALMuser.setFirstName(user.getFirstName());
            ALMuser.setLastName(user.getLastName());
            ALMuser.setEmailAddress(user.getEmail());
            ALMuser.setUserName(user.getEmail());
            ALMuser.setCanLogin(false);
            ALMuser.setStreet(user.getAddress().getAddress1());
            ALMuser.setCity(user.getAddress().getCity());
            ALMuser.setState(user.getAddress().getState());
            ALMuser.setCountry(user.getAddress().getCountry());
            ALMuser.setLocale("en_US");
            CreateUserOrganizationsListType orgList = new CreateUserOrganizationsListType();
            CreateUserOrganizationType[] orgdataarr = new CreateUserOrganizationType[1];
            CreateUserOrganizationType updateorg1 = new CreateUserOrganizationType();
            OrganizationIdentifierType orgId1 = new OrganizationIdentifierType();
            OrganizationPKType org1pk = new OrganizationPKType();
            org1pk.setName(user.getAccountID());
            orgId1.setPrimaryKeys(org1pk);
            updateorg1.setOrganization(orgId1);
            orgdataarr[0] = updateorg1;
            orgList.setOrgRoles(orgdataarr);
            ALMuser.setOrgRolesList(orgList);
            userRecs[0] = ALMuser;
            req.setUser(userRecs);
            CreateUserResponseType response = service.createUser(req);
            if (response.getStatusInfo().getStatus().toString().equals(StatusType.SUCCESS.toString())) {
                log.info((Object) "Users create successfully ");
            } else {
                log.info((Object) ("failed - Reason for Failure -> " + response.getStatusInfo().getReason()));
            }
        } catch (Exception e) {
            log.error((Object) "Error has occurred.", (Throwable) e);
        }
    }

    @Override
    public void addEntitlement(EntitlementVO entitlement) throws Exception {
        CreateSimpleEntitlementDataType se1;
        EntitlementOrderServiceLocator locator = new EntitlementOrderServiceLocator();
        EntitlementOrderServiceInterface service = locator.getEntitlementOrderService(new URL(this.getEntitlementServiceEndpoint()));
        CreateSimpleEntitlementDataType[] seArray = new CreateSimpleEntitlementDataType[1];
        CreateSimpleEntitlementRequestType request = new CreateSimpleEntitlementRequestType();
        request.setSimpleEntitlement(seArray);
        seArray[0] = se1 = new CreateSimpleEntitlementDataType();
        IdType idtype = new IdType();
        idtype.setId(entitlement.getId());
        se1.setEntitlementId(idtype);
        se1.setSoldTo(entitlement.getAccount().getId());
        CreateEntitlementLineItemDataType[] lineItems = new CreateEntitlementLineItemDataType[entitlement.getLines().length];
        int lineCount = 0;
        for (EntitlementLineVO item : entitlement.getLines()) {
            lineItems[lineCount] = new CreateEntitlementLineItemDataType();
            idtype = new IdType();
            idtype.setAutoGenerate(Boolean.valueOf(true));
            lineItems[lineCount].setActivationId(idtype);
            lineItems[lineCount].setNumberOfCopies(BigInteger.valueOf(item.getQuantity()));
            lineItems[lineCount].setStartDate(item.effectiveDate);
            if (item.expirationDate == null) {
                lineItems[lineCount].setIsPermanent(Boolean.valueOf(true));
            } else {
                lineItems[lineCount].setExpirationDate(item.expirationDate);
            }
            PartNumberIdentifierType pnIden = new PartNumberIdentifierType();
            PartNumberPKType pk = new PartNumberPKType();
            pk.setPartId(item.getSKU());
            pnIden.setPrimaryKeys(pk);
            lineItems[lineCount].setPartNumber(pnIden);
            ++lineCount;
        }
        se1.setLineItems(lineItems);
        se1.setAutoDeploy(Boolean.valueOf(true));
        ClientSecurityCredentials credentials = new ClientSecurityCredentials((Remote) service);
        credentials.setUsername(this.getUser());
        credentials.setPassword(this.getPassword());
        CreateSimpleEntitlementResponseType result = service.createSimpleEntitlement(request);
        if (result.getStatusInfo().getStatus() != StatusType.SUCCESS) {
            log.info((Object) "Creation of simple entitlement failed.");
            log.info((Object) ("Reason for Failure -> " + result.getStatusInfo().getReason()));
            FailedSimpleEntitlementDataListType failedlist = result.getFailedData();
            log.info((Object) ("Actual Reason for failure: " + failedlist.getFailedSimpleEntitlement()[0].getReason()));
            throw new Exception(result.getStatusInfo().getReason() + " : " + failedlist.getFailedSimpleEntitlement()[0].getReason());
        }
        CreatedSimpleEntitlementDataType[] createdData = result.getResponseData().getCreatedSimpleEntitlement();
        log.info((Object) ("Added simple entitlement with unique ID " + createdData[0].getUniqueId()));
        log.info((Object) ("Unique ID of added line item " + createdData[0].getLineItemUniqueIds(0)));
    }

    public EntitlementDataType[] getEntitlement(EntitlementVO entitlement) throws Exception {

        EntitlementOrderServiceInterface service = null;

        // Instantiate locator
        EntitlementOrderServiceLocator locator = new EntitlementOrderServiceLocator();

        try {

            // Get the handle to EntitlementService
            service = locator.getEntitlementOrderService(new URL(this.getEntitlementServiceEndpoint()));

            SearchEntitlementRequestType searchRequest = new SearchEntitlementRequestType();
            // Set the batch size to 15.  This means only 15 records satisfying the criteria will be retrieved
            searchRequest.setBatchSize(new BigInteger("15"));
            // Set the page number to 1.  This means only the first 15 records satisfying the criteria will be retrieved
            searchRequest.setPageNumber(new BigInteger("1"));
            SearchEntitlementDataType criteria = new SearchEntitlementDataType();

            SimpleQueryType simpleQuery = new SimpleQueryType();
            simpleQuery.setSearchType(SimpleSearchType.EQUALS);
            simpleQuery.setValue(entitlement.getId());

            criteria.setEntitlementId(simpleQuery);

            searchRequest.setEntitlementSearchCriteria(criteria);

            //criteria.setIsBulk(new Boolean(false));

            ClientSecurityCredentials credentials = new ClientSecurityCredentials(service);
            //ClientSecurityCredentials credentials = new ClientSecurityCredentials((Remote)service);
            credentials.setUsername(this.getUser());
            credentials.setPassword(this.getPassword());
            SearchEntitlementResponseType searchResponse = service.getEntitlementsQuery(searchRequest);

            // Check the status in the response
            if (searchResponse.getStatusInfo().getStatus() == StatusType.SUCCESS) {
                EntitlementDataType[] resultArray = searchResponse.getEntitlement();
                if (resultArray == null)
                    log.info("No entitlements found");
                else
                    log.info(resultArray.length + " entitlements found");

                return resultArray;

            } else {
                log.info("Search for entitlements failed.");
                log.info("Reason for Failure -> " + searchResponse.getStatusInfo().getReason());
            }

        } catch (Exception e) {
            log.error("Error retrieving entitlement", e);
        }
        return null;
    }

    @Override
    public void updateAccount(AccountVO account) {
    }

    @Override
    public void updateUser(UserVO user) {
    }

    @Override
    public void updateEntitlement(EntitlementVO entitlement) {
    }

    @Override
    public void login() throws Exception {
        throw new Exception("Method not supported.");
    }

    @Override
    public void logout() throws Exception {
        throw new Exception("Method not supported.");
    }

    @Override
    public AccountVO getAccount(AccountVO account) throws Exception {
        AddressVO address = null;
        UserOrgHierarchyServiceLocator locator = new UserOrgHierarchyServiceLocator();
        UserOrgHierarchyServiceInterface service = locator.getUserOrgHierarchyService(new URL(this.getUserOrgServiceEndpoint()));
        this.setServiceCredentials(service);
        GetOrganizationsQueryRequestType req = new GetOrganizationsQueryRequestType();
        OrganizationQueryParametersType queryParams = new OrganizationQueryParametersType();
        queryParams.setOrgDisplayName(new SimpleQueryType(account.getName(), SimpleSearchType.EQUALS));
        req.setQueryParams(queryParams);
        req.setBatchSize(BigInteger.ONE);
        req.setPageNumber(BigInteger.ONE);
        GetOrganizationsQueryResponseType response = service.getOrganizationsQuery(req);
        if (response.getStatusInfo().getStatus().equals(StatusType.SUCCESS) && response.getResponseData() != null) {
            log.info("orgs retrieved successfully ");
            OrganizationDetailDataType orgDetail = response.getResponseData().getOrgData(0);
            log.info("Retrieved organization: " + orgDetail.getDisplayName());
            account.setName(orgDetail.getDisplayName());
            address = new AddressVO();
            if (null != orgDetail.getAddress()) {
                address.setAddress1(orgDetail.getAddress().getAddress1());
                address.setAddress2(orgDetail.getAddress().getAddress2());
                address.setCity(orgDetail.getAddress().getCity());
                address.setState(orgDetail.getAddress().getState());
                address.setCountry(orgDetail.getAddress().getCountry());
                address.setRegion(orgDetail.getAddress().getRegion());
                address.setZipcode(orgDetail.getAddress().getZipcode());
            }
        } else {
            log.info("failed - account not found");
            if (null != response.getResponseData()) {
                log.info(response.getStatusInfo().getReason());
            }
        }
        account.setAddress(address);
        return account;
    }

    private void setServiceCredentials(Remote service) throws SOAPException, UnsupportedEncodingException {
        ClientSecurityCredentials credentials = new ClientSecurityCredentials(service);
        credentials.setUsername(this.getUser());
        credentials.setPassword(this.getPassword());
    }

    @Override
    public UserVO getUser(UserVO user) throws Exception {
        AddressVO address = null;
        UserOrgHierarchyServiceLocator locator = new UserOrgHierarchyServiceLocator();
        UserOrgHierarchyServiceInterface service = locator.getUserOrgHierarchyService(new URL(this.getUserOrgServiceEndpoint()));
        this.setServiceCredentials(service);
        GetUsersQueryRequestType req = new GetUsersQueryRequestType();
        UserQueryParametersType query = new UserQueryParametersType();
        query.setEmailAddress(new SimpleQueryType(user.getEmail(), SimpleSearchType.EQUALS));
        req.setQueryParams(query);
        req.setBatchSize(BigInteger.ONE);
        req.setPageNumber(BigInteger.ONE);
        GetUsersQueryResponseType response = service.getUsersQuery(req);
        if (response.getStatusInfo().getStatus().toString().equals(StatusType.SUCCESS.toString()) &&
                response.getResponseData() != null) {
            log.info((Object) "user retrieved successfully ");
            UserDetailDataType userDetail = response.getResponseData().getUser(0);
            log.info((Object) ("Retrieved USER: " + userDetail.getUserIdentifier().getPrimaryKeys().getEmailAddress()));
            user.setEmail(userDetail.getUserIdentifier().getPrimaryKeys().getEmailAddress());
            user.setFirstName(userDetail.getUserIdentifier().getPrimaryKeys().getFirstName());
            user.setLastName(userDetail.getUserIdentifier().getPrimaryKeys().getLastName());
            address = new AddressVO();
            if (null != userDetail.getStreet()) {
                user.setId(userDetail.getUserIdentifier().getUniqueId());
                address.setAddress1(userDetail.getStreet());
                address.setCity(userDetail.getCity());
                address.setState(userDetail.getState());
                address.setCountry(userDetail.getCountry());
                address.setZipcode(userDetail.getZipcode());
            }

            if (null != userDetail.getOrgRolesList()) {
                for (int i = 0; i < userDetail.getOrgRolesList().getOrgRoles().length; i++) {
                    user.addOrgsLinked(userDetail.getOrgRolesList().getOrgRoles()[i].getOrganization().getPrimaryKeys().getName());
                }

            } else {
                log.info("failed - account not found");
                if (null != response.getResponseData()) {
                    log.info(response.getStatusInfo().getReason());
                }
            }
        }
        user.setAddress(address);
        return user;
    }


    public UserVO getUserWithLinkedOrgs(UserVO user) throws Exception {
        UserVO usr = new UserVO();       
    	AddressVO address=null;
    	UserOrgHierarchyServiceLocator locator = new UserOrgHierarchyServiceLocator();
        UserOrgHierarchyServiceInterface service = locator.getUserOrgHierarchyService(new URL(this.getUserOrgServiceEndpoint()));
        this.setServiceCredentials(service);
        GetUsersQueryRequestType req = new GetUsersQueryRequestType();
        UserQueryParametersType query = new UserQueryParametersType();
        query.setEmailAddress(new SimpleQueryType(user.getEmail(), SimpleSearchType.EQUALS));
        query.setOrgName(new SimpleQueryType(user.getAccountID(), SimpleSearchType.EQUALS));
        req.setQueryParams(query);
        req.setBatchSize(BigInteger.ONE);
        req.setPageNumber(BigInteger.ONE);
        GetUsersQueryResponseType response = service.getUsersQuery(req);
        if (response.getStatusInfo().getStatus().toString().equals(StatusType.SUCCESS.toString())
                && response.getResponseData() != null) {
            log.info((Object)"user retrieved successfully ");
            UserDetailDataType userDetail = response.getResponseData().getUser(0);
            log.info((Object)("Retrieved USER: " + userDetail.getUserIdentifier().getPrimaryKeys().getEmailAddress()));
            usr.setEmail(userDetail.getUserIdentifier().getPrimaryKeys().getEmailAddress());
            usr.setFirstName(userDetail.getUserIdentifier().getPrimaryKeys().getFirstName());
            usr.setLastName(userDetail.getUserIdentifier().getPrimaryKeys().getLastName());
            
            if (null != userDetail.getOrgRolesList()){
	            for (int i=0; i< userDetail.getOrgRolesList().getOrgRoles().length;i++){
	            	usr.addOrgsLinked(userDetail.getOrgRolesList().getOrgRoles()[i].getOrganization().getPrimaryKeys().getName());
	            }
        	}
            address = new AddressVO();
            if (null != userDetail.getStreet()) {
                address.setAddress1(userDetail.getStreet());
                address.setCity(userDetail.getCity());
                address.setState(userDetail.getState());
                address.setCountry(userDetail.getCountry());
                address.setZipcode(userDetail.getZipcode());
            }
        } else {
            if (null != response.getResponseData()) {
                log.info(response.getStatusInfo().getReason());
            }
        }
        usr.setAddress(address);
        return usr;
    }
    
    public void linkUserToOrganisation(UserVO uservo, String accountName) throws Exception {

		UserOrgHierarchyServiceInterface service = null;

		// Instantiate locator
		UserOrgHierarchyServiceLocator locator = new UserOrgHierarchyServiceLocator();


			// Get the handle to UserOrgHierarchy
			service = locator.getUserOrgHierarchyService(new URL(this.getUserOrgServiceEndpoint()));


    		//setup credentials
            ClientSecurityCredentials credentials = new ClientSecurityCredentials(service);
            this.setServiceCredentials(service);

            UpdateUserRolesRequestType req = new UpdateUserRolesRequestType();
            UpdateUserRolesDataType[] userRecs = new UpdateUserRolesDataType[1];

            UpdateUserRolesDataType user2 = new UpdateUserRolesDataType();
            
            
            UserIdentifierType uId2 = new UserIdentifierType();
            UserPKType uPk = new UserPKType();
            uPk.setFirstName(uservo.getFirstName());
            uPk.setLastName(uservo.getLastName());
            uPk.setEmailAddress(uservo.getEmail());
            uId2.setPrimaryKeys(uPk);
            
            user2.setUser(uId2);
            
            UpdateUserRolesOrganizationDataType updateorg3 = new UpdateUserRolesOrganizationDataType();
            OrganizationIdentifierType orgId3 = new OrganizationIdentifierType();
    		OrganizationPKType org3pk = new OrganizationPKType();
    		org3pk.setName(accountName);
    		orgId3.setPrimaryKeys(org3pk);
    		updateorg3.setOrganization(orgId3);
    		
    		UpdateUserRolesListType roleListType = new UpdateUserRolesListType();
    		
    		/*RoleIdentifierType[] rolesArr = new RoleIdentifierType[1];
    		RoleIdentifierType role1 = new RoleIdentifierType();
    		RolePKType rpk1 = new RolePKType();
    		rpk1.setName("Portal User Role");
    		role1.setPrimaryKeys(rpk1);
    		rolesArr[0] = role1;
    		roleListType.setRole(rolesArr);*/
    		roleListType.setOpType(CollectionOperationType.ADD);
    		updateorg3.setRoles(roleListType);
    		user2.setOrgRoles(updateorg3);
    		
    		userRecs[0] = user2;
    		
            req.setUserData(userRecs);

			// invoke updateUserRoles webservice and get the response
           UpdateUserRolesResponseType response = service.updateUserRoles(req);

           
  		    // Check the status in the response
			if (response.getStatusInfo().getStatus().toString().equals(StatusType.SUCCESS.toString()))
			{
				log.info("User Roles updated successfully ");

			}else
			{
				log.error("failed to link the user to the supplied account");
				log.error("Reason for Failure -> " + response.getStatusInfo().getReason());
			}


	}
    
}
