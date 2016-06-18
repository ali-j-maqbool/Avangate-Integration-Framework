/**
 * UserOrgHierarchyServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.flexnet.operations.webservices;

public class UserOrgHierarchyServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.flexnet.operations.webservices.UserOrgHierarchyServiceInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[17];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createOrganization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createOrgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createOrgRequestType"), com.flexnet.operations.webservices.CreateOrgRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createOrgResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.CreateOrgResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createOrgResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("linkOrganizations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkOrganizationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkOrganizationsRequestType"), com.flexnet.operations.webservices.LinkOrganizationsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkOrganizationsResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.LinkOrganizationsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkOrganizationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateOrganization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateOrganizationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateOrganizationRequestType"), com.flexnet.operations.webservices.UpdateOrganizationRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateOrganizationResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.UpdateOrganizationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateOrganizationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteOrganization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteOrganizationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteOrganizationRequestType"), com.flexnet.operations.webservices.DeleteOrganizationRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteOrganizationResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.DeleteOrganizationResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteOrganizationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrganizationsQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationsQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationsQueryRequestType"), com.flexnet.operations.webservices.GetOrganizationsQueryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationsQueryResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetOrganizationsQueryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationsQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrganizationCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationCountRequestType"), com.flexnet.operations.webservices.GetOrganizationCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationCountResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetOrganizationCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getParentOrganizations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getParentOrganizationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getParentOrganizationsRequestType"), com.flexnet.operations.webservices.GetParentOrganizationsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getParentOrganizationsResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetParentOrganizationsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getParentOrganizationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubOrganizations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getSubOrganizationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getSubOrganizationsRequestType"), com.flexnet.operations.webservices.GetSubOrganizationsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getSubOrganizationsResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetSubOrganizationsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getSubOrganizationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUsersQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersQueryRequestType"), com.flexnet.operations.webservices.GetUsersQueryRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersQueryResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetUsersQueryResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserCountRequestType"), com.flexnet.operations.webservices.GetUserCountRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserCountResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetUserCountResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUserRequestType"), com.flexnet.operations.webservices.CreateUserRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUserResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.CreateUserResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRequestType"), com.flexnet.operations.webservices.UpdateUserRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.UpdateUserResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateUserRoles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRolesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRolesRequestType"), com.flexnet.operations.webservices.UpdateUserRolesRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRolesResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.UpdateUserRolesResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRolesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUserRequestType"), com.flexnet.operations.webservices.DeleteUserRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUserResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.DeleteUserResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("relateOrganizations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relateOrganizationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relateOrganizationsRequestType"), com.flexnet.operations.webservices.RelateOrganizationsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relateOrganizationsResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.RelateOrganizationsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relateOrganizationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRelatedOrganizations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getRelatedOrganizationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getRelatedOrganizationsRequestType"), com.flexnet.operations.webservices.GetRelatedOrganizationsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getRelatedOrganizationsResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetRelatedOrganizationsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getRelatedOrganizationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserPermissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserPermissionsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserPermissionsRequestType"), com.flexnet.operations.webservices.GetUserPermissionsRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserPermissionsResponseType"));
        oper.setReturnClass(com.flexnet.operations.webservices.GetUserPermissionsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserPermissionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

    }

    public UserOrgHierarchyServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public UserOrgHierarchyServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public UserOrgHierarchyServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "addressDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.AddressDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "CollectionOperationType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CollectionOperationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdOrganizationDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedOrganizationDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createdUserDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreatedUserDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createOrgRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateOrgRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createOrgResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateOrgResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUserDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateUserDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUserOrganizationRolesListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateUserOrganizationRolesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUserOrganizationsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateUserOrganizationsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUserOrganizationType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateUserOrganizationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUserRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateUserRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "createUserResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.CreateUserResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "datedSearchType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DatedSearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "DateTimeQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DateTimeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteOrganizationRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteOrganizationRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteOrganizationResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteOrganizationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteOrgDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteOrgDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUserRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteUserRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "deleteUserResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.DeleteUserResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedCreateOrgDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedCreateOrgDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedCreateOrgDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedCreateOrgDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedCreateUserDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedCreateUserDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedCreateUserDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedCreateUserDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteOrgDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteOrgDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteOrgDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteOrgDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteUserDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteUserDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedDeleteUserDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedDeleteUserDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedLinkOrgDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedLinkOrgDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedLinkOrgDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedLinkOrgDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedRelateOrganizationsDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedRelateOrganizationsDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedRelateOrganizationsDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedRelateOrganizationsDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateOrgDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateOrgDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateOrgDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateOrgDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateUserDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateUserDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateUserDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateUserDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateUserRolesDataListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateUserRolesDataListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "failedUpdateUserRolesDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.FailedUpdateUserRolesDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetOrganizationCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationCountResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetOrganizationCountResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetOrganizationCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationsQueryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetOrganizationsQueryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationsQueryResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetOrganizationsQueryResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getOrganizationsQueryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetOrganizationsQueryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getParentOrganizationsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetParentOrganizationsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getParentOrganizationsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetParentOrganizationsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getRelatedOrganizationsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetRelatedOrganizationsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getRelatedOrganizationsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetRelatedOrganizationsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getSubOrganizationsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetSubOrganizationsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getSubOrganizationsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetSubOrganizationsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserCountRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUserCountRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserCountResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUserCountResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserCountResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUserCountResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserPermissionsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUserPermissionsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserPermissionsResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUserPermissionsResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUserPermissionsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUserPermissionsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersQueryRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUsersQueryRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersQueryResponseDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUsersQueryResponseDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "getUsersQueryResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.GetUsersQueryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkOrganizationsDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LinkOrganizationsDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkOrganizationsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LinkOrganizationsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "linkOrganizationsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.LinkOrganizationsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.OrganizationDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationDetailDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.OrganizationDetailDataType.class;
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

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "organizationQueryParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.OrganizationQueryParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgCustomAttributeQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.OrgCustomAttributeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "orgCustomAttributesQueryListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.OrgCustomAttributesQueryListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "OrgType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.OrgType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "OrgTypeList");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.OrgTypeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "permissionListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.PermissionListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relateOrganizationsDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RelateOrganizationsDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relateOrganizationsRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RelateOrganizationsRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "relateOrganizationsResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RelateOrganizationsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "roleIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RoleIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "rolePKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.RolePKType.class;
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

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateOrganizationRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateOrganizationRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateOrganizationResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateOrganizationResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateOrgDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateOrgDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateRelatedOrganizationsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateRelatedOrganizationsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateSubOrganizationsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateSubOrganizationsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUserDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserOrganizationRolesListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUserOrganizationRolesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserOrganizationsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUserOrganizationsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserOrganizationType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUserOrganizationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUserRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUserResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRolesDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUserRolesDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRolesListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUserRolesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRolesOrganizationDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUserRolesOrganizationDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRolesRequestType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUserRolesRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "updateUserRolesResponseType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UpdateUserRolesResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userCustomAttributeQueryType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UserCustomAttributeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userCustomAttributesQueryListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UserCustomAttributesQueryListType.class;
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
            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userDetailDataType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UserDetailDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userIdentifierType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UserIdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userOrganizationRolesListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UserOrganizationRolesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userOrganizationsListType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UserOrganizationsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userOrganizationType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UserOrganizationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userPKType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UserPKType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "userQueryParametersType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UserQueryParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.macrovision:flexnet/operations", "UserStatusType");
            cachedSerQNames.add(qName);
            cls = com.flexnet.operations.webservices.UserStatusType.class;
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

    public com.flexnet.operations.webservices.CreateOrgResponseType createOrganization(com.flexnet.operations.webservices.CreateOrgRequestType createOrgRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "createOrganization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createOrgRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.CreateOrgResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.CreateOrgResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.CreateOrgResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.LinkOrganizationsResponseType linkOrganizations(com.flexnet.operations.webservices.LinkOrganizationsRequestType linkOrganizationsRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "linkOrganizations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {linkOrganizationsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.LinkOrganizationsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.LinkOrganizationsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.LinkOrganizationsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.UpdateOrganizationResponseType updateOrganization(com.flexnet.operations.webservices.UpdateOrganizationRequestType updateOrganizationRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "updateOrganization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateOrganizationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.UpdateOrganizationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.UpdateOrganizationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.UpdateOrganizationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.DeleteOrganizationResponseType deleteOrganization(com.flexnet.operations.webservices.DeleteOrganizationRequestType deleteOrganizationRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteOrganization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteOrganizationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.DeleteOrganizationResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.DeleteOrganizationResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.DeleteOrganizationResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetOrganizationsQueryResponseType getOrganizationsQuery(com.flexnet.operations.webservices.GetOrganizationsQueryRequestType getOrganizationsQueryRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getOrganizationsQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getOrganizationsQueryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetOrganizationsQueryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetOrganizationsQueryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetOrganizationsQueryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetOrganizationCountResponseType getOrganizationCount(com.flexnet.operations.webservices.GetOrganizationCountRequestType getOrganizationCountRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getOrganizationCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getOrganizationCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetOrganizationCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetOrganizationCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetOrganizationCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetParentOrganizationsResponseType getParentOrganizations(com.flexnet.operations.webservices.GetParentOrganizationsRequestType getParentOrganizationsRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getParentOrganizations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getParentOrganizationsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetParentOrganizationsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetParentOrganizationsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetParentOrganizationsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetSubOrganizationsResponseType getSubOrganizations(com.flexnet.operations.webservices.GetSubOrganizationsRequestType getSubOrganizationsRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubOrganizations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSubOrganizationsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetSubOrganizationsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetSubOrganizationsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetSubOrganizationsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetUsersQueryResponseType getUsersQuery(com.flexnet.operations.webservices.GetUsersQueryRequestType getUsersQueryRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getUsersQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getUsersQueryRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetUsersQueryResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetUsersQueryResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetUsersQueryResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetUserCountResponseType getUserCount(com.flexnet.operations.webservices.GetUserCountRequestType getUserCountRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getUserCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getUserCountRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetUserCountResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetUserCountResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetUserCountResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.CreateUserResponseType createUser(com.flexnet.operations.webservices.CreateUserRequestType createUserRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "createUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createUserRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.CreateUserResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.CreateUserResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.CreateUserResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.UpdateUserResponseType updateUser(com.flexnet.operations.webservices.UpdateUserRequestType updateUserRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "updateUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateUserRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.UpdateUserResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.UpdateUserResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.UpdateUserResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.UpdateUserRolesResponseType updateUserRoles(com.flexnet.operations.webservices.UpdateUserRolesRequestType updateUserRolesRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "updateUserRoles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateUserRolesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.UpdateUserRolesResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.UpdateUserRolesResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.UpdateUserRolesResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.DeleteUserResponseType deleteUser(com.flexnet.operations.webservices.DeleteUserRequestType deleteUserRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteUserRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.DeleteUserResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.DeleteUserResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.DeleteUserResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.RelateOrganizationsResponseType relateOrganizations(com.flexnet.operations.webservices.RelateOrganizationsRequestType relateOrganizationsRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "relateOrganizations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {relateOrganizationsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.RelateOrganizationsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.RelateOrganizationsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.RelateOrganizationsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetRelatedOrganizationsResponseType getRelatedOrganizations(com.flexnet.operations.webservices.GetRelatedOrganizationsRequestType getRelatedOrganizationsRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getRelatedOrganizations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getRelatedOrganizationsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetRelatedOrganizationsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetRelatedOrganizationsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetRelatedOrganizationsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.flexnet.operations.webservices.GetUserPermissionsResponseType getUserPermissions(com.flexnet.operations.webservices.GetUserPermissionsRequestType getUserPermissionsRequest) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getUserPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getUserPermissionsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.flexnet.operations.webservices.GetUserPermissionsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.flexnet.operations.webservices.GetUserPermissionsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.flexnet.operations.webservices.GetUserPermissionsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
