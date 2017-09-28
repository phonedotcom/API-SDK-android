# VoicemailApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountVoicemail**](VoicemailApi.md#getAccountVoicemail) | **GET** /accounts/{account_id}/voicemail/{voicemail_id} | This service shows the details of an individual voicemail.
[**listAccountVoicemail**](VoicemailApi.md#listAccountVoicemail) | **GET** /accounts/{account_id}/voicemail | Get a list of voicemail messages for an account.
[**patchAccountVoicemail**](VoicemailApi.md#patchAccountVoicemail) | **PATCH** /accounts/{account_id}/voicemail/{voicemail_id} | Update the is_new parameter in a voicemail record.


<a name="getAccountVoicemail"></a>
# **getAccountVoicemail**
> VoicemailFull getAccountVoicemail(accountId, voicemailId)

This service shows the details of an individual voicemail.

This service shows the details of an individual voicemail. See Intro to Voicemail for more info on the properties. Note: This API is for users with Account Owner scope access token. Users with Extension User scope token should invoke the Get Voicemail API with the following definition: GET https://api.phone.com/v4/accounts/:account_id/extensions/:extension_id/voicemail/:voicemail_id

### Example
```java
// Import classes:
//import io.swagger.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
Integer accountId = 56; // Integer | Account ID
String voicemailId = "voicemailId_example"; // String | Voicemail ID
try {
    VoicemailFull result = apiInstance.getAccountVoicemail(accountId, voicemailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#getAccountVoicemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **voicemailId** | **String**| Voicemail ID |

### Return type

[**VoicemailFull**](VoicemailFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountVoicemail"></a>
# **listAccountVoicemail**
> ListVoicemail listAccountVoicemail(accountId, filtersId, filtersFrom, filtersTo, filtersIsNew, filtersCreatedAt, filtersExtension, sortId, sortCreatedAt, limit, offset, fields)

Get a list of voicemail messages for an account.

Get a list of voicemail messages for an account. See Intro to Voicemail for more info on the properties. Note: This API is for users with Account Owner scope access token. Users with Extension User scope token should invoke the List Voicemail API with the following definition: GET https://api.phone.com/v4/accounts/:account_id/extensions/:extension_id/voicemail

### Example
```java
// Import classes:
//import io.swagger.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
Integer accountId = 56; // Integer | Account ID
List<String> filtersId = Arrays.asList("filtersId_example"); // List<String> | ID filter
String filtersFrom = "filtersFrom_example"; // String | Caller ID filter
String filtersTo = "filtersTo_example"; // String | Callee ID filter, the E.164 phone number to send the SMS TO. Note you must encode the + as %2B
Boolean filtersIsNew = true; // Boolean | 
String filtersCreatedAt = "filtersCreatedAt_example"; // String | Date string representing the UTC time that sms was created
List<String> filtersExtension = Arrays.asList("filtersExtension_example"); // List<String> | Extension filter
String sortId = "sortId_example"; // String | ID sorting
String sortCreatedAt = "sortCreatedAt_example"; // String | Sort by the UTC time that voicemail was created
Integer limit = 56; // Integer | Max results
Integer offset = 56; // Integer | Results to skip
String fields = "fields_example"; // String | Field set
try {
    ListVoicemail result = apiInstance.listAccountVoicemail(accountId, filtersId, filtersFrom, filtersTo, filtersIsNew, filtersCreatedAt, filtersExtension, sortId, sortCreatedAt, limit, offset, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#listAccountVoicemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **filtersId** | [**List&lt;String&gt;**](String.md)| ID filter | [optional]
 **filtersFrom** | **String**| Caller ID filter | [optional]
 **filtersTo** | **String**| Callee ID filter, the E.164 phone number to send the SMS TO. Note you must encode the + as %2B | [optional]
 **filtersIsNew** | **Boolean**|  | [optional]
 **filtersCreatedAt** | **String**| Date string representing the UTC time that sms was created | [optional]
 **filtersExtension** | [**List&lt;String&gt;**](String.md)| Extension filter | [optional]
 **sortId** | **String**| ID sorting | [optional]
 **sortCreatedAt** | **String**| Sort by the UTC time that voicemail was created | [optional]
 **limit** | **Integer**| Max results | [optional]
 **offset** | **Integer**| Results to skip | [optional]
 **fields** | **String**| Field set | [optional]

### Return type

[**ListVoicemail**](ListVoicemail.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchAccountVoicemail"></a>
# **patchAccountVoicemail**
> VoicemailFull patchAccountVoicemail(accountId, voicemailId, data)

Update the is_new parameter in a voicemail record.

Update the is_new parameter in a voicemail record. See Account Voicemail for more info on the properties. Note: This API is for users with Account Owner scope access token. Users with Extension User scope token should invoke the Patch Voicemail API with the following definition: PATCH https://api.phone.com/v4/accounts/:account_id/extensions/:extension_id/voicemail/:voicemail_id

### Example
```java
// Import classes:
//import io.swagger.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
Integer accountId = 56; // Integer | Account ID
String voicemailId = "voicemailId_example"; // String | Voicemail ID
PatchVoicemailParams data = new PatchVoicemailParams(); // PatchVoicemailParams | Payment data
try {
    VoicemailFull result = apiInstance.patchAccountVoicemail(accountId, voicemailId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#patchAccountVoicemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **voicemailId** | **String**| Voicemail ID |
 **data** | [**PatchVoicemailParams**](PatchVoicemailParams.md)| Payment data | [optional]

### Return type

[**VoicemailFull**](VoicemailFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

