# RoutesApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRoute**](RoutesApi.md#createRoute) | **POST** /accounts/{account_id}/routes | Add a new route to the account.
[**deleteAccountRoute**](RoutesApi.md#deleteAccountRoute) | **DELETE** /accounts/{account_id}/routes/{route_id} | Delete a route from the account.
[**getAccountRoute**](RoutesApi.md#getAccountRoute) | **GET** /accounts/{account_id}/routes/{route_id} | Show details of an individual route.
[**listAccountRoutes**](RoutesApi.md#listAccountRoutes) | **GET** /accounts/{account_id}/routes | Get a list of routes for an account.
[**replaceAccountRoute**](RoutesApi.md#replaceAccountRoute) | **PUT** /accounts/{account_id}/routes/{route_id} | Update the information of a route.


<a name="createRoute"></a>
# **createRoute**
> RouteFull createRoute(accountId, data)

Add a new route to the account.

Add a new route to the account. See Intro to Routes for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
Integer accountId = 56; // Integer | Account ID
CreateRouteParams data = new CreateRouteParams(); // CreateRouteParams | Route data
try {
    RouteFull result = apiInstance.createRoute(accountId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#createRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **data** | [**CreateRouteParams**](CreateRouteParams.md)| Route data | [optional]

### Return type

[**RouteFull**](RouteFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountRoute"></a>
# **deleteAccountRoute**
> DeleteEntry deleteAccountRoute(accountId, routeId)

Delete a route from the account.

Delete a route from the account. See Intro to Routes for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
Integer accountId = 56; // Integer | Account ID
Integer routeId = 56; // Integer | Route ID
try {
    DeleteEntry result = apiInstance.deleteAccountRoute(accountId, routeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#deleteAccountRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **routeId** | **Integer**| Route ID |

### Return type

[**DeleteEntry**](DeleteEntry.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountRoute"></a>
# **getAccountRoute**
> RouteFull getAccountRoute(accountId, routeId)

Show details of an individual route.

Show details of an individual route. See Intro to Routes for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
Integer accountId = 56; // Integer | Account ID
Integer routeId = 56; // Integer | Route ID
try {
    RouteFull result = apiInstance.getAccountRoute(accountId, routeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#getAccountRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **routeId** | **Integer**| Route ID |

### Return type

[**RouteFull**](RouteFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountRoutes"></a>
# **listAccountRoutes**
> ListRoutes listAccountRoutes(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields)

Get a list of routes for an account.

Get a list of routes for an account. See Intro to Routes for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
Integer accountId = 56; // Integer | Account ID
List<String> filtersId = Arrays.asList("filtersId_example"); // List<String> | ID filter
List<String> filtersName = Arrays.asList("filtersName_example"); // List<String> | Name filter
String sortId = "sortId_example"; // String | ID sorting
String sortName = "sortName_example"; // String | Name sorting
Integer limit = 56; // Integer | Max results
Integer offset = 56; // Integer | Results to skip
String fields = "fields_example"; // String | Field set
try {
    ListRoutes result = apiInstance.listAccountRoutes(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#listAccountRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **filtersId** | [**List&lt;String&gt;**](String.md)| ID filter | [optional]
 **filtersName** | [**List&lt;String&gt;**](String.md)| Name filter | [optional]
 **sortId** | **String**| ID sorting | [optional]
 **sortName** | **String**| Name sorting | [optional]
 **limit** | **Integer**| Max results | [optional]
 **offset** | **Integer**| Results to skip | [optional]
 **fields** | **String**| Field set | [optional]

### Return type

[**ListRoutes**](ListRoutes.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceAccountRoute"></a>
# **replaceAccountRoute**
> RouteFull replaceAccountRoute(accountId, routeId, data)

Update the information of a route.

Update the information of a route. See Intro to Routes for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.RoutesApi;

RoutesApi apiInstance = new RoutesApi();
Integer accountId = 56; // Integer | Account ID
Integer routeId = 56; // Integer | Route ID
CreateRouteParams data = new CreateRouteParams(); // CreateRouteParams | Route data
try {
    RouteFull result = apiInstance.replaceAccountRoute(accountId, routeId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#replaceAccountRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **routeId** | **Integer**| Route ID |
 **data** | [**CreateRouteParams**](CreateRouteParams.md)| Route data | [optional]

### Return type

[**RouteFull**](RouteFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

