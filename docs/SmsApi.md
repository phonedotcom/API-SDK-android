# SmsApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountSms**](SmsApi.md#createAccountSms) | **POST** /accounts/{account_id}/sms | Send a SMS to one or a group of recipients.
[**getAccountSms**](SmsApi.md#getAccountSms) | **GET** /accounts/{account_id}/sms/{sms_id} | This service shows the details of an individual SMS.
[**listAccountSms**](SmsApi.md#listAccountSms) | **GET** /accounts/{account_id}/sms | Get a list of SMS messages for an account.
[**patchAccountSms**](SmsApi.md#patchAccountSms) | **PATCH** /accounts/{account_id}/sms/{sms_id} | Update the is_new parameter in a sms record.


<a name="createAccountSms"></a>
# **createAccountSms**
> SmsFull createAccountSms(accountId, data)

Send a SMS to one or a group of recipients.

Send a SMS to one or a group of recipients. For details on the input fields, see Intro to SMS. Note: This API is for users with Account Owner scope access token. Users with Extension User scope token should invoke the Extension level Create SMS API with the following definition: POST https://api.phone.com/v4/accounts/:account_id/extensions/:extension_id/sms

### Example
```java
// Import classes:
//import io.swagger.client.api.SmsApi;

SmsApi apiInstance = new SmsApi();
Integer accountId = 56; // Integer | Account ID
CreateSmsParams data = new CreateSmsParams(); // CreateSmsParams | SMS data
try {
    SmsFull result = apiInstance.createAccountSms(accountId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#createAccountSms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **data** | [**CreateSmsParams**](CreateSmsParams.md)| SMS data |

### Return type

[**SmsFull**](SmsFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountSms"></a>
# **getAccountSms**
> SmsFull getAccountSms(accountId, smsId)

This service shows the details of an individual SMS.

This service shows the details of an individual SMS. See Intro to SMS for more info on the properties. Note: This API is for users with Account Owner scope access token. Users with Extension User scope token should invoke the Extension level Get SMS API with the following definition: GET https://api.phone.com/v4/accounts/:account_id/extensions/:extension_id/sms/:sms_id

### Example
```java
// Import classes:
//import io.swagger.client.api.SmsApi;

SmsApi apiInstance = new SmsApi();
Integer accountId = 56; // Integer | Account ID
String smsId = "smsId_example"; // String | SMS ID
try {
    SmsFull result = apiInstance.getAccountSms(accountId, smsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#getAccountSms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **smsId** | **String**| SMS ID |

### Return type

[**SmsFull**](SmsFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountSms"></a>
# **listAccountSms**
> ListSms listAccountSms(accountId, filtersId, filtersFrom, filtersTo, filtersDirection, filtersExtension, filtersCreatedAt, sortId, sortCreatedAt, limit, offset, fields)

Get a list of SMS messages for an account.

Get a list of SMS messages for an account. See Intro to SMS for more info on the properties. Note: This API is for users with Account Owner scope access token. Users with Extension User scope token should invoke the Extension level List SMS API with the following definition: GET https://api.phone.com/v4/accounts/:account_id/extensions/:extension_id/sms

### Example
```java
// Import classes:
//import io.swagger.client.api.SmsApi;

SmsApi apiInstance = new SmsApi();
Integer accountId = 56; // Integer | Account ID
List<String> filtersId = Arrays.asList("filtersId_example"); // List<String> | ID filter
String filtersFrom = "filtersFrom_example"; // String | Caller ID filter
String filtersTo = "filtersTo_example"; // String | Callee ID filter, the E.164 phone number to send the SMS TO. Note you must encode the + as %2B
String filtersDirection = "filtersDirection_example"; // String | Direction filter
List<String> filtersExtension = Arrays.asList("filtersExtension_example"); // List<String> | Extension filter
String filtersCreatedAt = "filtersCreatedAt_example"; // String | Date string representing the UTC time that sms was created
String sortId = "sortId_example"; // String | ID sorting
String sortCreatedAt = "sortCreatedAt_example"; // String | Sort by created time of message
Integer limit = 56; // Integer | Max results
Integer offset = 56; // Integer | Results to skip
String fields = "fields_example"; // String | Field set
try {
    ListSms result = apiInstance.listAccountSms(accountId, filtersId, filtersFrom, filtersTo, filtersDirection, filtersExtension, filtersCreatedAt, sortId, sortCreatedAt, limit, offset, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#listAccountSms");
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
 **filtersDirection** | **String**| Direction filter | [optional]
 **filtersExtension** | [**List&lt;String&gt;**](String.md)| Extension filter | [optional]
 **filtersCreatedAt** | **String**| Date string representing the UTC time that sms was created | [optional]
 **sortId** | **String**| ID sorting | [optional]
 **sortCreatedAt** | **String**| Sort by created time of message | [optional]
 **limit** | **Integer**| Max results | [optional]
 **offset** | **Integer**| Results to skip | [optional]
 **fields** | **String**| Field set | [optional]

### Return type

[**ListSms**](ListSms.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchAccountSms"></a>
# **patchAccountSms**
> SmsFull patchAccountSms(accountId, smsId, data)

Update the is_new parameter in a sms record.

Update the is_new parameter in a sms record. See Account SMS for more info on the properties. Note: This API is for users with Account Owner scope access token. Users with Extension User scope token should invoke the Extension level Patch SMS API with the following definition: PATCH https://api.phone.com/v4/accounts/:account_id/extensions/:extension_id/sms/:sms_id

### Example
```java
// Import classes:
//import io.swagger.client.api.SmsApi;

SmsApi apiInstance = new SmsApi();
Integer accountId = 56; // Integer | Account ID
String smsId = "smsId_example"; // String | SMS ID
PatchSmsParams data = new PatchSmsParams(); // PatchSmsParams | Sms data
try {
    SmsFull result = apiInstance.patchAccountSms(accountId, smsId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#patchAccountSms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **smsId** | **String**| SMS ID |
 **data** | [**PatchSmsParams**](PatchSmsParams.md)| Sms data | [optional]

### Return type

[**SmsFull**](SmsFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

