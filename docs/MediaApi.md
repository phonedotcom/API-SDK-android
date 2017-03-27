# MediaApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountMediaFiles**](MediaApi.md#createAccountMediaFiles) | **POST** /accounts/{account_id}/media/files | Add a media object to your account that can be used as a greeting or hold music. Users may create a media by using the built-in Text-to-speech (TTS) facility or upload a file of their choice. (Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB)
[**createAccountMediaTts**](MediaApi.md#createAccountMediaTts) | **POST** /accounts/{account_id}/media/tts | Add a media object to your account that can be used as a greeting or hold music. Users may create a media by using the built-in Text-to-speech (TTS) facility or upload a file of their choice. (Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB)
[**deleteAccountMedia**](MediaApi.md#deleteAccountMedia) | **DELETE** /accounts/{account_id}/media/{media_id} | Delete an individual media record
[**getAccountMedia**](MediaApi.md#getAccountMedia) | **GET** /accounts/{account_id}/media/{media_id} | Show details of an individual media recording (Greeting or Hold Music)
[**listAccountMedia**](MediaApi.md#listAccountMedia) | **GET** /accounts/{account_id}/media | Get a list of media recordings for an account
[**replaceAccountMediaTts**](MediaApi.md#replaceAccountMediaTts) | **PUT** /accounts/{account_id}/media/{media_id} | Update a media object to your account. Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB.


<a name="createAccountMediaFiles"></a>
# **createAccountMediaFiles**
> MediaFull createAccountMediaFiles(accountId, json, file)

Add a media object to your account that can be used as a greeting or hold music. Users may create a media by using the built-in Text-to-speech (TTS) facility or upload a file of their choice. (Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB)

See Account Media for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
Integer accountId = 56; // Integer | Account ID
String json = "json_example"; // String | Media extra parameters
File file = new File("/path/to/file.txt"); // File | Media file
try {
    MediaFull result = apiInstance.createAccountMediaFiles(accountId, json, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#createAccountMediaFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **json** | **String**| Media extra parameters | [optional]
 **file** | **File**| Media file | [optional]

### Return type

[**MediaFull**](MediaFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createAccountMediaTts"></a>
# **createAccountMediaTts**
> MediaFull createAccountMediaTts(accountId, data)

Add a media object to your account that can be used as a greeting or hold music. Users may create a media by using the built-in Text-to-speech (TTS) facility or upload a file of their choice. (Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB)

See Account Media for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
Integer accountId = 56; // Integer | Account ID
CreateMediaParams data = new CreateMediaParams(); // CreateMediaParams | Media data
try {
    MediaFull result = apiInstance.createAccountMediaTts(accountId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#createAccountMediaTts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **data** | [**CreateMediaParams**](CreateMediaParams.md)| Media data | [optional]

### Return type

[**MediaFull**](MediaFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountMedia"></a>
# **deleteAccountMedia**
> DeleteMedia deleteAccountMedia(accountId, mediaId)

Delete an individual media record

See Account Media for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
Integer accountId = 56; // Integer | Account ID
Integer mediaId = 56; // Integer | Media ID
try {
    DeleteMedia result = apiInstance.deleteAccountMedia(accountId, mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#deleteAccountMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **mediaId** | **Integer**| Media ID |

### Return type

[**DeleteMedia**](DeleteMedia.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountMedia"></a>
# **getAccountMedia**
> MediaFull getAccountMedia(accountId, mediaId)

Show details of an individual media recording (Greeting or Hold Music)

Get individual media recording

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
Integer accountId = 56; // Integer | Account ID
Integer mediaId = 56; // Integer | Media ID
try {
    MediaFull result = apiInstance.getAccountMedia(accountId, mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getAccountMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **mediaId** | **Integer**| Media ID |

### Return type

[**MediaFull**](MediaFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountMedia"></a>
# **listAccountMedia**
> ListMedia listAccountMedia(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields)

Get a list of media recordings for an account

See Account Menus for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
Integer accountId = 56; // Integer | Account ID
List<String> filtersId = Arrays.asList("filtersId_example"); // List<String> | ID filter
List<String> filtersName = Arrays.asList("filtersName_example"); // List<String> | Name filter
String sortId = "sortId_example"; // String | ID sorting
String sortName = "sortName_example"; // String | Name sorting
Integer limit = 56; // Integer | Max results
Integer offset = 56; // Integer | Results to skip
String fields = "fields_example"; // String | Field set
try {
    ListMedia result = apiInstance.listAccountMedia(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#listAccountMedia");
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

[**ListMedia**](ListMedia.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceAccountMediaTts"></a>
# **replaceAccountMediaTts**
> MediaFull replaceAccountMediaTts(accountId, mediaId, data)

Update a media object to your account. Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB.

See Account Media for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
Integer accountId = 56; // Integer | Account ID
Integer mediaId = 56; // Integer | Media ID
CreateMediaParams data = new CreateMediaParams(); // CreateMediaParams | Media data
try {
    MediaFull result = apiInstance.replaceAccountMediaTts(accountId, mediaId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#replaceAccountMediaTts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **mediaId** | **Integer**| Media ID |
 **data** | [**CreateMediaParams**](CreateMediaParams.md)| Media data | [optional]

### Return type

[**MediaFull**](MediaFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

