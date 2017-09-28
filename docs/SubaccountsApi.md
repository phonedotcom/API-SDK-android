# SubaccountsApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountSubaccount**](SubaccountsApi.md#createAccountSubaccount) | **POST** /accounts/{account_id}/subaccounts | Add a subaccount for the authenticated user or client
[**listAccountSubaccounts**](SubaccountsApi.md#listAccountSubaccounts) | **GET** /accounts/{account_id}/subaccounts | Get a list of subaccounts for the authenticated user or client


<a name="createAccountSubaccount"></a>
# **createAccountSubaccount**
> AccountFull createAccountSubaccount(accountId, data)

Add a subaccount for the authenticated user or client

Add a subaccount for the authenticated user or client

### Example
```java
// Import classes:
//import io.swagger.client.api.SubaccountsApi;

SubaccountsApi apiInstance = new SubaccountsApi();
Integer accountId = 56; // Integer | Account ID
CreateSubaccountParams data = new CreateSubaccountParams(); // CreateSubaccountParams | Subaccount data
try {
    AccountFull result = apiInstance.createAccountSubaccount(accountId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsApi#createAccountSubaccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **data** | [**CreateSubaccountParams**](CreateSubaccountParams.md)| Subaccount data |

### Return type

[**AccountFull**](AccountFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountSubaccounts"></a>
# **listAccountSubaccounts**
> ListAccounts listAccountSubaccounts(accountId, filtersId, sortId, limit, offset, fields)

Get a list of subaccounts for the authenticated user or client

Get a list of subaccounts for the authenticated user or client

### Example
```java
// Import classes:
//import io.swagger.client.api.SubaccountsApi;

SubaccountsApi apiInstance = new SubaccountsApi();
Integer accountId = 56; // Integer | Account ID
List<String> filtersId = Arrays.asList("filtersId_example"); // List<String> | ID filter
String sortId = "sortId_example"; // String | ID sorting
Integer limit = 56; // Integer | Max results
Integer offset = 56; // Integer | Results to skip
String fields = "fields_example"; // String | Field set
try {
    ListAccounts result = apiInstance.listAccountSubaccounts(accountId, filtersId, sortId, limit, offset, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountsApi#listAccountSubaccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **filtersId** | [**List&lt;String&gt;**](String.md)| ID filter | [optional]
 **sortId** | **String**| ID sorting | [optional]
 **limit** | **Integer**| Max results | [optional]
 **offset** | **Integer**| Results to skip | [optional]
 **fields** | **String**| Field set | [optional]

### Return type

[**ListAccounts**](ListAccounts.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

