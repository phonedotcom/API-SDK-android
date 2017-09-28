# ListenersApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountListener**](ListenersApi.md#createAccountListener) | **POST** /accounts/{account_id}/listeners | Add a listener object to your account that can be used to subscribe an event.
[**deleteAccountListener**](ListenersApi.md#deleteAccountListener) | **DELETE** /accounts/{account_id}/listeners/{listener_id} | Delete an individual event listener.
[**getAccountListener**](ListenersApi.md#getAccountListener) | **GET** /accounts/{account_id}/listeners/{listener_id} | Show details of an individual listener.
[**listAccountListeners**](ListenersApi.md#listAccountListeners) | **GET** /accounts/{account_id}/listeners | Get a list of listeners for an account.
[**replaceAccountListener**](ListenersApi.md#replaceAccountListener) | **PUT** /accounts/{account_id}/listeners/{listener_id} | Update the settings of an individual event listener.


<a name="createAccountListener"></a>
# **createAccountListener**
> ListenerFull createAccountListener(accountId, data)

Add a listener object to your account that can be used to subscribe an event.

Add a listener object to your account that can be used to subscribe an event. See Account Listeners for more info on the properties. Note: This API is for users with Account Owner scope access token. Users with Extension User scope token should invoke the Extension level Post Listener API with the following definition: POST https://api.phone.com/v4/accounts/:account_id/extensions/:extension_id/listeners

### Example
```java
// Import classes:
//import io.swagger.client.api.ListenersApi;

ListenersApi apiInstance = new ListenersApi();
Integer accountId = 56; // Integer | Account ID
CreateListenerParams data = new CreateListenerParams(); // CreateListenerParams | Account Listeners Data
try {
    ListenerFull result = apiInstance.createAccountListener(accountId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListenersApi#createAccountListener");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **data** | [**CreateListenerParams**](CreateListenerParams.md)| Account Listeners Data | [optional]

### Return type

[**ListenerFull**](ListenerFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountListener"></a>
# **deleteAccountListener**
> DeleteEntry deleteAccountListener(accountId, listenerId)

Delete an individual event listener.

Delete an individual event listener. See Account Listeners for more info on the properties. Note: This API is for users with Account Owner scope access token. Users with Extension User scope token should invoke the Extension level Delete Listener API with the following definition: DELETE https://api.phone.com/v4/accounts/:account_id/extensions/:extension_id/listeners/:listener_id

### Example
```java
// Import classes:
//import io.swagger.client.api.ListenersApi;

ListenersApi apiInstance = new ListenersApi();
Integer accountId = 56; // Integer | Account ID
Integer listenerId = 56; // Integer | Listener ID
try {
    DeleteEntry result = apiInstance.deleteAccountListener(accountId, listenerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListenersApi#deleteAccountListener");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **listenerId** | **Integer**| Listener ID |

### Return type

[**DeleteEntry**](DeleteEntry.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountListener"></a>
# **getAccountListener**
> ListenerFull getAccountListener(accountId, listenerId)

Show details of an individual listener.

Show details of an individual event listener. See Account Listeners for more info on the properties. Note: This API is for users with Account Owner scope access token. Users with Extension User scope token should invoke the Extension level Get Listener API with the following definition: GET https://api.phone.com/v4/accounts/:account_id/extensions/:extension_id/listeners/:listener_id

### Example
```java
// Import classes:
//import io.swagger.client.api.ListenersApi;

ListenersApi apiInstance = new ListenersApi();
Integer accountId = 56; // Integer | Account ID
Integer listenerId = 56; // Integer | Listener ID
try {
    ListenerFull result = apiInstance.getAccountListener(accountId, listenerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListenersApi#getAccountListener");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **listenerId** | **Integer**| Listener ID |

### Return type

[**ListenerFull**](ListenerFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountListeners"></a>
# **listAccountListeners**
> ListListeners listAccountListeners(accountId, filtersId, sortId, limit, offset, fields)

Get a list of listeners for an account.

Get a list of listeners for an account. See Account Listeners for more info on the properties. Note: This API is for users with Account Owner scope access token. Users with Extension User scope token should invoke the Extension level List Listeners API with the following definition: GET https://api.phone.com/v4/accounts/:account_id/extensions/:extension_id/listeners

### Example
```java
// Import classes:
//import io.swagger.client.api.ListenersApi;

ListenersApi apiInstance = new ListenersApi();
Integer accountId = 56; // Integer | Account ID
List<String> filtersId = Arrays.asList("filtersId_example"); // List<String> | ID filter
String sortId = "sortId_example"; // String | ID sorting
Integer limit = 56; // Integer | Max results
Integer offset = 56; // Integer | Results to skip
String fields = "fields_example"; // String | Field set
try {
    ListListeners result = apiInstance.listAccountListeners(accountId, filtersId, sortId, limit, offset, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListenersApi#listAccountListeners");
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

[**ListListeners**](ListListeners.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceAccountListener"></a>
# **replaceAccountListener**
> ListenerFull replaceAccountListener(accountId, listenerId, data)

Update the settings of an individual event listener.

Update the settings of an individual event listener. See Event Listeners for more detail. Note: This API is for users with Account Owner scope access token. Users with Extension User scope token should invoke the Extension level Replace Listener API with the following definition: PUT https://api.phone.com/v4/accounts/:account_id/extensions/:extension_id/listeners/:listener_id

### Example
```java
// Import classes:
//import io.swagger.client.api.ListenersApi;

ListenersApi apiInstance = new ListenersApi();
Integer accountId = 56; // Integer | Account ID
Integer listenerId = 56; // Integer | Listener ID
CreateListenerParams data = new CreateListenerParams(); // CreateListenerParams | Account Listeners Data
try {
    ListenerFull result = apiInstance.replaceAccountListener(accountId, listenerId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListenersApi#replaceAccountListener");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **listenerId** | **Integer**| Listener ID |
 **data** | [**CreateListenerParams**](CreateListenerParams.md)| Account Listeners Data | [optional]

### Return type

[**ListenerFull**](ListenerFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

