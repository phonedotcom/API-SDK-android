# OauthApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOauthAccessToken**](OauthApi.md#createOauthAccessToken) | **POST** /oauth/access-token | To create an access token via the /oauth/access-token API, an API user may choose any one of the grant types it supports: Authorization Code Grant, Client Credential Grant, Password Credential Grant or Refresh Token Grant.
[**createOauthAuthorization**](OauthApi.md#createOauthAuthorization) | **GET** /oauth/authorization | Create Authorization Code or Access Token.
[**getOauthAccessToken**](OauthApi.md#getOauthAccessToken) | **GET** /oauth/access-token | Retrieve details of an access token, such as scope, expiration and extension ID.


<a name="createOauthAccessToken"></a>
# **createOauthAccessToken**
> OauthAccessToken createOauthAccessToken(data)

To create an access token via the /oauth/access-token API, an API user may choose any one of the grant types it supports: Authorization Code Grant, Client Credential Grant, Password Credential Grant or Refresh Token Grant.

To create an access token via the /oauth/access-token API, an API user may choose any one of the grant types it supports: Authorization Code Grant, Client Credential Grant, Password Credential Grant or Refresh Token Grant. For Authorization Code Grant, the input parameter &#39;code&#39; is generated via the Create Authorization API. NOTE: The Create Access Token API now accepts requests in query string format as well as JSON body format. See OAuth for more details on how to obtain client id and client secret to create an access token at real time.

### Example
```java
// Import classes:
//import io.swagger.client.api.OauthApi;

OauthApi apiInstance = new OauthApi();
CreateOauthParams data = new CreateOauthParams(); // CreateOauthParams | Oauth data
try {
    OauthAccessToken result = apiInstance.createOauthAccessToken(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthApi#createOauthAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**CreateOauthParams**](CreateOauthParams.md)| Oauth data | [optional]

### Return type

[**OauthAccessToken**](OauthAccessToken.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOauthAuthorization"></a>
# **createOauthAuthorization**
> createOauthAuthorization(clientId, responseType, scope, redirectUri)

Create Authorization Code or Access Token.

Create Authorization Code or Access Token. The /oauth/authorization API supports Authorization Grant and Implicit Grant. In Authorization Grant, this API returns a code (response_type&#x3D;code) for clients implemented in a browser using a scripting language such as JavaScript. Users may then use the code via the Create Access Token API to create an access token. The Implicit Grant is a simplified authorization code flow. In the implicit flow, instead of issuing the client an authorization code, the client is issued an access token (response_type&#x3D;token) directly. See OAuth for more details on how to obtain client id and client secret to create authorization code access token at real time.

### Example
```java
// Import classes:
//import io.swagger.client.api.OauthApi;

OauthApi apiInstance = new OauthApi();
String clientId = "clientId_example"; // String | Client ID
String responseType = "responseType_example"; // String | 'token' for Implicit Grant; 'code' for Authorization Code Grant
String scope = "scope_example"; // String | account-owner, extension-user and/or methods:ALL, separated by space (%20)
String redirectUri = "redirectUri_example"; // String | The URL where the response data of this API is redirected to
try {
    apiInstance.createOauthAuthorization(clientId, responseType, scope, redirectUri);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthApi#createOauthAuthorization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID |
 **responseType** | **String**| &#39;token&#39; for Implicit Grant; &#39;code&#39; for Authorization Code Grant |
 **scope** | **String**| account-owner, extension-user and/or methods:ALL, separated by space (%20) |
 **redirectUri** | **String**| The URL where the response data of this API is redirected to |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOauthAccessToken"></a>
# **getOauthAccessToken**
> GetOauthAccessToken getOauthAccessToken()

Retrieve details of an access token, such as scope, expiration and extension ID.

Retrieve details of an access token, such as scope, expiration and extension ID. Voip ID will be returned as well if scope contains account-owner scope.

### Example
```java
// Import classes:
//import io.swagger.client.api.OauthApi;

OauthApi apiInstance = new OauthApi();
try {
    GetOauthAccessToken result = apiInstance.getOauthAccessToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthApi#getOauthAccessToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetOauthAccessToken**](GetOauthAccessToken.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

