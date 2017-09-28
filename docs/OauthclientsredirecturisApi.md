# OauthclientsredirecturisApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountOauthClientsRedirectUri**](OauthclientsredirecturisApi.md#createAccountOauthClientsRedirectUri) | **POST** /accounts/{account_id}/oauth/clients/{client_id}/redirect-uris | Create an OAuth Client Redirect URI record.
[**deleteAccountOauthClientsRedirectUri**](OauthclientsredirecturisApi.md#deleteAccountOauthClientsRedirectUri) | **DELETE** /accounts/{account_id}/oauth/clients/{client_id}/redirect-uris/{uri_id} | Delete an OAuth Client Redirect URI record.
[**getAccountOauthClientsRedirectUri**](OauthclientsredirecturisApi.md#getAccountOauthClientsRedirectUri) | **GET** /accounts/{account_id}/oauth/clients/{client_id}/redirect-uris/{uri_id} | Get details of an OAuth Client Redirect URI record.
[**listAccountOauthClientsRedirectUris**](OauthclientsredirecturisApi.md#listAccountOauthClientsRedirectUris) | **GET** /accounts/{account_id}/oauth/clients/{client_id}/redirect-uris | Get a list of OAuth Client Redirect URIs for an account.


<a name="createAccountOauthClientsRedirectUri"></a>
# **createAccountOauthClientsRedirectUri**
> OauthClientRedirectUriFull createAccountOauthClientsRedirectUri(accountId, clientId, data)

Create an OAuth Client Redirect URI record.

Create an OAuth Client Redirect URI record.

### Example
```java
// Import classes:
//import io.swagger.client.api.OauthclientsredirecturisApi;

OauthclientsredirecturisApi apiInstance = new OauthclientsredirecturisApi();
Integer accountId = 56; // Integer | Account ID
Integer clientId = 56; // Integer | Client ID
CreateRedirectUriParams data = new CreateRedirectUriParams(); // CreateRedirectUriParams | Redirect Uri data
try {
    OauthClientRedirectUriFull result = apiInstance.createAccountOauthClientsRedirectUri(accountId, clientId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthclientsredirecturisApi#createAccountOauthClientsRedirectUri");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **clientId** | **Integer**| Client ID |
 **data** | [**CreateRedirectUriParams**](CreateRedirectUriParams.md)| Redirect Uri data | [optional]

### Return type

[**OauthClientRedirectUriFull**](OauthClientRedirectUriFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountOauthClientsRedirectUri"></a>
# **deleteAccountOauthClientsRedirectUri**
> DeleteEntry deleteAccountOauthClientsRedirectUri(accountId, clientId, uriId)

Delete an OAuth Client Redirect URI record.

Delete an OAuth Client Redirect URI record.

### Example
```java
// Import classes:
//import io.swagger.client.api.OauthclientsredirecturisApi;

OauthclientsredirecturisApi apiInstance = new OauthclientsredirecturisApi();
Integer accountId = 56; // Integer | Account ID
Integer clientId = 56; // Integer | Client ID
Integer uriId = 56; // Integer | Redirect URI ID
try {
    DeleteEntry result = apiInstance.deleteAccountOauthClientsRedirectUri(accountId, clientId, uriId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthclientsredirecturisApi#deleteAccountOauthClientsRedirectUri");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **clientId** | **Integer**| Client ID |
 **uriId** | **Integer**| Redirect URI ID |

### Return type

[**DeleteEntry**](DeleteEntry.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountOauthClientsRedirectUri"></a>
# **getAccountOauthClientsRedirectUri**
> OauthClientRedirectUriFull getAccountOauthClientsRedirectUri(accountId, clientId, uriId)

Get details of an OAuth Client Redirect URI record.

Get details of an OAuth Client Redirect URI record.

### Example
```java
// Import classes:
//import io.swagger.client.api.OauthclientsredirecturisApi;

OauthclientsredirecturisApi apiInstance = new OauthclientsredirecturisApi();
Integer accountId = 56; // Integer | Account ID
Integer clientId = 56; // Integer | Client ID
Integer uriId = 56; // Integer | Redirect URI ID
try {
    OauthClientRedirectUriFull result = apiInstance.getAccountOauthClientsRedirectUri(accountId, clientId, uriId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthclientsredirecturisApi#getAccountOauthClientsRedirectUri");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **clientId** | **Integer**| Client ID |
 **uriId** | **Integer**| Redirect URI ID |

### Return type

[**OauthClientRedirectUriFull**](OauthClientRedirectUriFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountOauthClientsRedirectUris"></a>
# **listAccountOauthClientsRedirectUris**
> ListOauthClientsRedirectUris listAccountOauthClientsRedirectUris(accountId, clientId, filtersId, sortId, limit, offset, fields)

Get a list of OAuth Client Redirect URIs for an account.

Get a list of OAuth Client Redirect URIs for an account.

### Example
```java
// Import classes:
//import io.swagger.client.api.OauthclientsredirecturisApi;

OauthclientsredirecturisApi apiInstance = new OauthclientsredirecturisApi();
Integer accountId = 56; // Integer | Account ID
Integer clientId = 56; // Integer | Client ID
List<String> filtersId = Arrays.asList("filtersId_example"); // List<String> | ID filter
String sortId = "sortId_example"; // String | ID sorting
Integer limit = 56; // Integer | Max results
Integer offset = 56; // Integer | Results to skip
String fields = "fields_example"; // String | Field set
try {
    ListOauthClientsRedirectUris result = apiInstance.listAccountOauthClientsRedirectUris(accountId, clientId, filtersId, sortId, limit, offset, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthclientsredirecturisApi#listAccountOauthClientsRedirectUris");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **clientId** | **Integer**| Client ID |
 **filtersId** | [**List&lt;String&gt;**](String.md)| ID filter | [optional]
 **sortId** | **String**| ID sorting | [optional]
 **limit** | **Integer**| Max results | [optional]
 **offset** | **Integer**| Results to skip | [optional]
 **fields** | **String**| Field set | [optional]

### Return type

[**ListOauthClientsRedirectUris**](ListOauthClientsRedirectUris.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

