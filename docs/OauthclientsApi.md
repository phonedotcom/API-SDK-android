# OauthclientsApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAccountOauthClient**](OauthclientsApi.md#deleteAccountOauthClient) | **DELETE** /accounts/{account_id}/oauth/clients/{client_id} | Delete an individual OAuth client.
[**getAccountOauthClient**](OauthclientsApi.md#getAccountOauthClient) | **GET** /accounts/{account_id}/oauth/clients/{client_id} | Show details of an individual OAuth client.
[**listAccountOauthClients**](OauthclientsApi.md#listAccountOauthClients) | **GET** /accounts/{account_id}/oauth/clients | Get a list of OAuth clients for an account.


<a name="deleteAccountOauthClient"></a>
# **deleteAccountOauthClient**
> DeleteEntry deleteAccountOauthClient(accountId, clientId)

Delete an individual OAuth client.

Delete an individual OAuth client. See Account OAuth Clients for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.OauthclientsApi;

OauthclientsApi apiInstance = new OauthclientsApi();
Integer accountId = 56; // Integer | Account ID
Integer clientId = 56; // Integer | Client ID
try {
    DeleteEntry result = apiInstance.deleteAccountOauthClient(accountId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthclientsApi#deleteAccountOauthClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **clientId** | **Integer**| Client ID |

### Return type

[**DeleteEntry**](DeleteEntry.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountOauthClient"></a>
# **getAccountOauthClient**
> OauthClientFull getAccountOauthClient(accountId, clientId)

Show details of an individual OAuth client.

Show details of an individual OAuth client. See Account OAuth Clients for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.OauthclientsApi;

OauthclientsApi apiInstance = new OauthclientsApi();
Integer accountId = 56; // Integer | Account ID
Integer clientId = 56; // Integer | Client ID
try {
    OauthClientFull result = apiInstance.getAccountOauthClient(accountId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthclientsApi#getAccountOauthClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **clientId** | **Integer**| Client ID |

### Return type

[**OauthClientFull**](OauthClientFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountOauthClients"></a>
# **listAccountOauthClients**
> ListOauthClients listAccountOauthClients(accountId, filtersId, sortId, limit, offset, fields)

Get a list of OAuth clients for an account.

Get a list of OAuth clients for an account. See Account OAuth Clients for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.OauthclientsApi;

OauthclientsApi apiInstance = new OauthclientsApi();
Integer accountId = 56; // Integer | Account ID
List<String> filtersId = Arrays.asList("filtersId_example"); // List<String> | ID filter
String sortId = "sortId_example"; // String | ID sorting
Integer limit = 56; // Integer | Max results
Integer offset = 56; // Integer | Results to skip
String fields = "fields_example"; // String | Field set
try {
    ListOauthClients result = apiInstance.listAccountOauthClients(accountId, filtersId, sortId, limit, offset, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthclientsApi#listAccountOauthClients");
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

[**ListOauthClients**](ListOauthClients.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

