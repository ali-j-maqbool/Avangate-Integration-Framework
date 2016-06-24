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
import java.util.ArrayList;
import javax.xml.soap.SOAPException;

import com.flexnet.operations.webservices.CollectionOperationType;
import com.flexnet.operations.webservices.OrganizationIdentifierType;
import com.flexnet.operations.webservices.OrganizationPKType;
import com.flexnet.operations.webservices.SimpleQueryType;
import com.flexnet.operations.webservices.SimpleSearchType;
import com.flexnet.operations.webservices.UserIdentifierType;
import com.flexnet.operations.webservices.UserPKType;
import com.flexnet.opsembedded.webservices.*;
import org.apache.log4j.Logger;

public class ALMIntegrationService
implements IntegrationService {
    private static final Logger log = Logger.getLogger((String) ALMIntegrationService.class.getName());

    private IntegrationCredentials creds;

    public ALMIntegrationService() {
        try {
            Credentials credentials = Credentials.getInstance((String) "ALM_connection.properties");
        } catch (Exception e) {
            log.error( ("Unable to load credentials: " + e.getMessage()), (Throwable) e);
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

    private String getManagedDeviceServiceEndpoint() {
        if (null != this.creds) {
            return this.creds.MANAGE_DEVICE_SERVICE_ENDPOINT;
        }
        return Credentials.MANAGE_DEVICE_SERVICE_ENDPOINT;
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
        log.debug(("Add account: " + account.getName()));
        try {
            UserOrgHierarchyServiceLocator locator = new UserOrgHierarchyServiceLocator();
            UserOrgHierarchyServiceInterface service = locator.getUserOrgHierarchyService(new URL(this.getUserOrgServiceEndpoint()));
            this.setServiceCredentials(service);
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
                log.info( "orgs created successfully ");
            } else {
                log.info( ("failed - Reason for Failure -> " + response.getStatusInfo().getReason()));
            }
        } catch (Exception e) {
            log.error( "Error has occurred.", (Throwable) e);
        }
    }

    @Override
    public void addUser(UserVO user) {
        try {
            UserOrgHierarchyServiceLocator locator = new UserOrgHierarchyServiceLocator();
            UserOrgHierarchyServiceInterface service = locator.getUserOrgHierarchyService(new URL(this.getUserOrgServiceEndpoint()));
            this.setServiceCredentials(service);
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
                log.info( "Users create successfully ");
            } else {
                log.info( ("failed - Reason for Failure -> " + response.getStatusInfo().getReason()));
            }
        } catch (Exception e) {
            log.error( "Error has occurred.", (Throwable) e);
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
            lineItems[lineCount].setExpirationDate(item.expirationDate);
            //if (item.expirationDate == null) {
            //    lineItems[lineCount].setIsPermanent(Boolean.valueOf(true));
            //} else {
            //    lineItems[lineCount].setExpirationDate(item.expirationDate);
            //}
            PartNumberIdentifierType pnIden = new PartNumberIdentifierType();
            PartNumberPKType pk = new PartNumberPKType();
            pk.setPartId(item.getSKU());
            pnIden.setPrimaryKeys(pk);
            lineItems[lineCount].setPartNumber(pnIden);
            ++lineCount;
        }
        se1.setLineItems(lineItems);
        se1.setAutoDeploy(Boolean.valueOf(true));
        this.setServiceCredentials(service);
        CreateSimpleEntitlementResponseType result = service.createSimpleEntitlement(request);
        if (result.getStatusInfo().getStatus() != StatusType.SUCCESS) {
            log.info( "Creation of simple entitlement failed.");
            log.info( ("Reason for Failure -> " + result.getStatusInfo().getReason()));
            FailedSimpleEntitlementDataListType failedlist = result.getFailedData();
            log.info( ("Actual Reason for failure: " + failedlist.getFailedSimpleEntitlement()[0].getReason()));
            throw new Exception(result.getStatusInfo().getReason() + " : " + failedlist.getFailedSimpleEntitlement()[0].getReason());
        }
        CreatedSimpleEntitlementDataType[] createdData = result.getResponseData().getCreatedSimpleEntitlement();
        log.info( ("Added simple entitlement with unique ID " + createdData[0].getUniqueId()));
        log.info( ("Unique ID of added line item " + createdData[0].getLineItemUniqueIds(0)));
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

            this.setServiceCredentials(service);

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
    public void updateEntitlement(EntitlementVO entitlement) throws Exception{

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
        AccountVO retrvdAcct = null;
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
            retrvdAcct = new AccountVO();
            retrvdAcct.setName(orgDetail.getDisplayName());
            address = new AddressVO();
            if (null != orgDetail.getAddress()) {
                address.setAddress1(orgDetail.getAddress().getAddress1());
                address.setAddress2(orgDetail.getAddress().getAddress2());
                address.setCity(orgDetail.getAddress().getCity());
                address.setState(orgDetail.getAddress().getState());
                address.setCountry(orgDetail.getAddress().getCountry());
                address.setRegion(orgDetail.getAddress().getRegion());
                address.setZipcode(orgDetail.getAddress().getZipcode());

                retrvdAcct.setAddress(address);
            }
        } else {
            log.info("failed - account not found");
            if (null != response.getResponseData()) {
                log.info(response.getStatusInfo().getReason());
            }
        }

        return retrvdAcct;
    }

    private void setServiceCredentials(Remote service) throws SOAPException, UnsupportedEncodingException {
        ClientSecurityCredentials credentials = new ClientSecurityCredentials(service);
        credentials.setUsername(this.getUser());
        credentials.setPassword(this.getPassword());
    }

    @Override
    public UserVO getUser(UserVO user) throws Exception {
        AddressVO address = null;
        UserVO retrievedUser=null;
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
            log.info( "user retrieved successfully ");
            UserDetailDataType userDetail = response.getResponseData().getUser(0);
            log.info( ("Retrieved USER: " + userDetail.getUserIdentifier().getPrimaryKeys().getEmailAddress()));
            retrievedUser = new UserVO();
            retrievedUser.setEmail(user.getEmail());
            retrievedUser.setFirstName(userDetail.getUserIdentifier().getPrimaryKeys().getFirstName());
            retrievedUser.setLastName(userDetail.getUserIdentifier().getPrimaryKeys().getLastName());
            address = new AddressVO();
            if (null != userDetail.getCountry()) {
                retrievedUser.setId(userDetail.getUserIdentifier().getUniqueId());
                address.setAddress1(userDetail.getStreet());
                address.setCity(userDetail.getCity());
                address.setState(userDetail.getState());
                address.setCountry(userDetail.getCountry());
                address.setZipcode(userDetail.getZipcode());
                retrievedUser.setAddress(address);
            }

            if (null != userDetail.getOrgRolesList()) {
                retrievedUser.setOrgsLinked(new ArrayList<String>());
                for (int i=0; i < userDetail.getOrgRolesList().getOrgRoles().length; i++) {

                    retrievedUser.addOrgsLinked(userDetail.getOrgRolesList().getOrgRoles()[i].getOrganization().getPrimaryKeys().getName());
                }

            } else {
                log.info("failed - account not found");
                if (null != response.getResponseData()) {
                    log.info(response.getStatusInfo().getReason());
                }
            }
        }
        return retrievedUser;
    }

    public void updateEntitlementLine( EntitlementLineItemDataType entLine, String entId) throws Exception{

        // Instantiate locator
        EntitlementOrderServiceLocator locator = new EntitlementOrderServiceLocator();

        EntitlementOrderServiceInterface service;

        try {

            // Get the handle to EntitlementService
            service = locator.getEntitlementOrderService(new java.net.URL(this.getEntitlementServiceEndpoint()));

            //create a request to update line item
            UpdateEntitlementLineItemRequestType updateLineRequest = new UpdateEntitlementLineItemRequestType();
            // allocate data array of size 1 since line tiems in only 1 entitlement will be updated
            UpdateEntitlementLineItemDataType[] updateArray = new UpdateEntitlementLineItemDataType[1];
            updateLineRequest.setLineItemData(updateArray);
            updateArray[0] = new UpdateEntitlementLineItemDataType();

            // The entitlement to be deleted can be specified in tersm of its unique id or its primary keys.
            // here we are specifying the primary key, which is the entitlement id.
            EntitlementIdentifierType entIden = new EntitlementIdentifierType();
            EntitlementPKType entpk = new EntitlementPKType();
            entpk.setEntitlementId(entId);
            entIden.setPrimaryKeys(entpk);
            updateArray[0].setEntitlementIdentifier(entIden);

            //allocate data array of size 1 since only 1 line item is being updated
            UpdateLineItemDataType[] lineItemData = new UpdateLineItemDataType[1];
            updateArray[0].setLineItemData(lineItemData);
            lineItemData[0] = new UpdateLineItemDataType();

            // The entitlement line item to be updated can be specified in terms of its unique id or its primary keys.
            // here we are specifying the primary key, which is the entitlement line item id.
            EntitlementLineItemIdentifierType lineIden = new EntitlementLineItemIdentifierType();
            EntitlementLineItemPKType linepk = new EntitlementLineItemPKType();
            linepk.setActivationId(entLine.getActivationId().getId());
            lineIden.setPrimaryKeys(linepk);
            lineItemData[0].setLineItemIdentifier(lineIden);
            lineItemData[0].setNumberOfCopies(entLine.getNumberOfCopies());
            lineItemData[0].setExpirationDate(entLine.getExpirationDate());

            this.setServiceCredentials(service);

            UpdateEntitlementLineItemResponseType updateLineResponse = service.updateEntitlementLineItem(updateLineRequest);

            // Check the status in the response
            if (updateLineResponse.getStatusInfo().getStatus().toString().equals(StatusType.SUCCESS.toString()))
            {
                log.info("Line Item updated successfully ");
            }else
            {
                log.error("Update line item failed");
                log.error("Reason for Failure -> " +
                        updateLineResponse.getStatusInfo().getReason() != null ?
                        updateLineResponse.getStatusInfo().getReason() : "no reason returned");

                if (null != updateLineResponse && null != updateLineResponse.getFailedData()) {
                    FailedUpdateEntitlementLineItemDataListType failedData = updateLineResponse.getFailedData();
                    FailedUpdateEntitlementLineItemDataType[] failedArray = failedData.getFailedData();
                    for (int ii = 0; failedArray != null && ii < failedArray.length; ii++) {
                        log.error("Entitlement line item update failed due to reason :" + failedArray[ii].getReason());
                    }
                }
            }

        }
        catch(Exception e) {
            log.error("Error occurred updating entitlement line", e);
        }
    }

    public void setEntitleLineStatus(StateType status, String activationID){
        EntitlementOrderServiceInterface service = null;

        // Instantiate locator
        EntitlementOrderServiceLocator locator = new EntitlementOrderServiceLocator();

        try {

            // Get the handle to EntitlementService
            service = locator.getEntitlementOrderService(new java.net.URL(this.getEntitlementServiceEndpoint()));

            SetLineItemStateRequestType cpRequest = new SetLineItemStateRequestType();

            EntitlementLineItemIdentifierType liIdentifier1 = new EntitlementLineItemIdentifierType();
            EntitlementLineItemPKType entlineItemPk = new EntitlementLineItemPKType();
            entlineItemPk.setActivationId(activationID);
            liIdentifier1.setPrimaryKeys(entlineItemPk);

            LineItemStateDataType liState1 = new LineItemStateDataType();
            liState1.setLineItemIdentifier(liIdentifier1);
            liState1.setStateToSet(status);

            // Set this to true if we want to deploy all the child items of this line item as well
            // otherwise, no need to set this explictly to FALSE.
            liState1.setIncludeChildItems(Boolean.TRUE);

            LineItemStateDataType[] liStateArray = new LineItemStateDataType[1];
            liStateArray[0] = liState1;

            cpRequest.setLineItem(liStateArray);

            //setup credentials
            this.setServiceCredentials(service);


            // invoke webservice and get the response
            SetLineItemStateResponseType response = service.setLineItemState(cpRequest);

            // Check the status in the response
            if (response.getStatusInfo().getStatus().toString().equals(StatusType.SUCCESS.toString())) {
               log.info("LineItem State successfully changed ");
            }else {
                log.info("set lineItem state failed failed.");
                log.info("Reason for Failure -> " + response.getStatusInfo().getReason());
                FailedLineItemStateDataListType failedData = response.getFailedData();
                FailedLineItemStateDataType[] failedArray = failedData.getFailedLineItem();
                for (int ii = 0; failedArray != null && ii < failedArray.length; ii++)
                    log.info("set lineItem state failed failed due to reason " + failedArray[ii].getReason());
            }

        }
        catch(Exception e) {
            e.printStackTrace();
        }

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
            log.info("user retrieved successfully ");
            UserDetailDataType userDetail = response.getResponseData().getUser(0);
            log.info(("Retrieved USER: " + userDetail.getUserIdentifier().getPrimaryKeys().getEmailAddress()));
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

    public String getCLSID(String orgName) throws Exception {
        String clsID = "";
        ManageDeviceServiceInterface service = null;
        ManageDeviceServiceLocator locator = new ManageDeviceServiceLocator();
        GetAutoProvisionedServerRequest gapsr = new GetAutoProvisionedServerRequest(orgName);
        service = locator.getManageDeviceService(new URL(this.getManagedDeviceServiceEndpoint()));
        this.setServiceCredentials(service);

        log.info(String.format("Retrieving the CLS_ID for the organisation %s", orgName));
        GetAutoProvisionedServerResponse response = service.getAutoProvisionedServer(gapsr);
        clsID = response.getCloudLicenseServer().getServerIds().getServerId()[0];
        if (response.getStatusInfo().getStatus().toString().equals(StatusType.SUCCESS.toString())) {
            log.info(String.format("CLS_ID for the organisation is %s", clsID));
        }else {
            log.info(String.format("CLS_ID not found for the organisation %s", orgName));
            log.error(String.format("Reason for Failure -> %s",
                    null == response.getStatusInfo().getReason() ? "Reason not returned" :
                            response.getStatusInfo().getReason()));
        }

        return clsID;
    }

    public ArrayList<String> getActivationID(String refNo) throws Exception{
        ArrayList<String> activationID = new ArrayList();

        EntitlementVO entitlement = new EntitlementVO();
        entitlement.setId(refNo);

        EntitlementDataType[] edt = getEntitlement(entitlement);

        if(edt[0]==null){
            throw new Exception("Entitlement not found");
        } else {
            if(edt[0].getSimpleEntitlement().getLineItems()==null) {
                throw new Exception("Entitlement lines not found");
            } else {
                for(EntitlementLineItemDataType e : edt[0].getSimpleEntitlement().getLineItems()){
                    if(e.getPartNumber().getPrimaryKeys().getPartId().contains("_ACTIVATION")){
                        activationID.add(e.getActivationId().getId());
                    }
                }
            }
        }

        return activationID;
    }
}
