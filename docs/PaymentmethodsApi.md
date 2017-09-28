# PaymentmethodsApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountPaymentMethod**](PaymentmethodsApi.md#createAccountPaymentMethod) | **POST** /accounts/{account_id}/payment-methods | Create an individual payment method.
[**deleteAccountPaymentMethod**](PaymentmethodsApi.md#deleteAccountPaymentMethod) | **DELETE** /accounts/{account_id}/payment-methods/{pm_id} | Delete an individual payment method.
[**getAccountPaymentMethod**](PaymentmethodsApi.md#getAccountPaymentMethod) | **GET** /accounts/{account_id}/payment-methods/{pm_id} | Show details of an individual payment method.
[**listAccountPaymentMethods**](PaymentmethodsApi.md#listAccountPaymentMethods) | **GET** /accounts/{account_id}/payment-methods | Get a list of payment methods for an account.
[**patchAccountPaymentMethod**](PaymentmethodsApi.md#patchAccountPaymentMethod) | **PATCH** /accounts/{account_id}/payment-methods/{pm_id} | Replace the status of an individual payment method.


<a name="createAccountPaymentMethod"></a>
# **createAccountPaymentMethod**
> PaymentFull createAccountPaymentMethod(accountId, data)

Create an individual payment method.

Create an individual payment method. See Account Payment Methods for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentmethodsApi;

PaymentmethodsApi apiInstance = new PaymentmethodsApi();
Integer accountId = 56; // Integer | Account ID
CreatePaymentParams data = new CreatePaymentParams(); // CreatePaymentParams | Payment data
try {
    PaymentFull result = apiInstance.createAccountPaymentMethod(accountId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentmethodsApi#createAccountPaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **data** | [**CreatePaymentParams**](CreatePaymentParams.md)| Payment data |

### Return type

[**PaymentFull**](PaymentFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountPaymentMethod"></a>
# **deleteAccountPaymentMethod**
> DeleteEntry deleteAccountPaymentMethod(accountId, pmId)

Delete an individual payment method.

Delete an individual payment method. See Account Payment Methods for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentmethodsApi;

PaymentmethodsApi apiInstance = new PaymentmethodsApi();
Integer accountId = 56; // Integer | Account ID
Integer pmId = 56; // Integer | Payment Method ID
try {
    DeleteEntry result = apiInstance.deleteAccountPaymentMethod(accountId, pmId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentmethodsApi#deleteAccountPaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **pmId** | **Integer**| Payment Method ID |

### Return type

[**DeleteEntry**](DeleteEntry.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountPaymentMethod"></a>
# **getAccountPaymentMethod**
> PaymentFull getAccountPaymentMethod(accountId, pmId)

Show details of an individual payment method.

Show details of an individual payment method. See Account Payment Methods for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentmethodsApi;

PaymentmethodsApi apiInstance = new PaymentmethodsApi();
Integer accountId = 56; // Integer | Account ID
Integer pmId = 56; // Integer | Payment Method ID
try {
    PaymentFull result = apiInstance.getAccountPaymentMethod(accountId, pmId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentmethodsApi#getAccountPaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **pmId** | **Integer**| Payment Method ID |

### Return type

[**PaymentFull**](PaymentFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountPaymentMethods"></a>
# **listAccountPaymentMethods**
> ListPaymentMethods listAccountPaymentMethods(accountId, filtersId, sortId, limit, offset, fields)

Get a list of payment methods for an account.

Get a list of payment methods for an account. See Account Payment Methods for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentmethodsApi;

PaymentmethodsApi apiInstance = new PaymentmethodsApi();
Integer accountId = 56; // Integer | Account ID
List<String> filtersId = Arrays.asList("filtersId_example"); // List<String> | ID filter
String sortId = "sortId_example"; // String | ID sorting
Integer limit = 56; // Integer | Max results
Integer offset = 56; // Integer | Results to skip
String fields = "fields_example"; // String | Field set
try {
    ListPaymentMethods result = apiInstance.listAccountPaymentMethods(accountId, filtersId, sortId, limit, offset, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentmethodsApi#listAccountPaymentMethods");
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

[**ListPaymentMethods**](ListPaymentMethods.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchAccountPaymentMethod"></a>
# **patchAccountPaymentMethod**
> PaymentFull patchAccountPaymentMethod(accountId, pmId, data)

Replace the status of an individual payment method.

Replace the status of an individual payment method. See Account Payment Methods for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.PaymentmethodsApi;

PaymentmethodsApi apiInstance = new PaymentmethodsApi();
Integer accountId = 56; // Integer | Account ID
Integer pmId = 56; // Integer | Payment Method ID
PatchPaymentParams data = new PatchPaymentParams(); // PatchPaymentParams | Payment data
try {
    PaymentFull result = apiInstance.patchAccountPaymentMethod(accountId, pmId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentmethodsApi#patchAccountPaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **pmId** | **Integer**| Payment Method ID |
 **data** | [**PatchPaymentParams**](PatchPaymentParams.md)| Payment data | [optional]

### Return type

[**PaymentFull**](PaymentFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

