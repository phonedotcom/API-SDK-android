# SubaccountpricingApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountSubaccountPricing**](SubaccountpricingApi.md#createAccountSubaccountPricing) | **POST** /accounts/{account_id}/subaccounts/{subaccount_id}/pricing | Add a pricing plan to a subaccount.
[**deleteAccountSubaccountPricing**](SubaccountpricingApi.md#deleteAccountSubaccountPricing) | **DELETE** /accounts/{account_id}/subaccounts/{subaccount_id}/pricing/{pricing_id} | Delete a pricing plan from a subaccount.
[**getAccountSubaccountPricing**](SubaccountpricingApi.md#getAccountSubaccountPricing) | **GET** /accounts/{account_id}/subaccounts/{subaccount_id}/pricing/{pricing_id} | Get the details of a pricing plan for a subaccount.
[**listAccountSubaccountPricing**](SubaccountpricingApi.md#listAccountSubaccountPricing) | **GET** /accounts/{account_id}/subaccounts/{subaccount_id}/pricing | Get a list of pricing plans for a subaccount.


<a name="createAccountSubaccountPricing"></a>
# **createAccountSubaccountPricing**
> PricingFull createAccountSubaccountPricing(accountId, subaccountId, data)

Add a pricing plan to a subaccount.

Add a pricing plan to a subaccount. See Account Subaccount Pricing for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.SubaccountpricingApi;

SubaccountpricingApi apiInstance = new SubaccountpricingApi();
Integer accountId = 56; // Integer | Account ID
Integer subaccountId = 56; // Integer | Subaccount ID
CreatePricingParams data = new CreatePricingParams(); // CreatePricingParams | Subaccount pricing data
try {
    PricingFull result = apiInstance.createAccountSubaccountPricing(accountId, subaccountId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountpricingApi#createAccountSubaccountPricing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **subaccountId** | **Integer**| Subaccount ID |
 **data** | [**CreatePricingParams**](CreatePricingParams.md)| Subaccount pricing data |

### Return type

[**PricingFull**](PricingFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountSubaccountPricing"></a>
# **deleteAccountSubaccountPricing**
> DeleteEntry deleteAccountSubaccountPricing(accountId, subaccountId, pricingId)

Delete a pricing plan from a subaccount.

Delete a pricing plan from a subaccount. See Account Subaccount Pricing for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.SubaccountpricingApi;

SubaccountpricingApi apiInstance = new SubaccountpricingApi();
Integer accountId = 56; // Integer | Account ID
Integer subaccountId = 56; // Integer | Subaccount ID
Integer pricingId = 56; // Integer | Pricing Object ID
try {
    DeleteEntry result = apiInstance.deleteAccountSubaccountPricing(accountId, subaccountId, pricingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountpricingApi#deleteAccountSubaccountPricing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **subaccountId** | **Integer**| Subaccount ID |
 **pricingId** | **Integer**| Pricing Object ID |

### Return type

[**DeleteEntry**](DeleteEntry.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountSubaccountPricing"></a>
# **getAccountSubaccountPricing**
> PricingFull getAccountSubaccountPricing(accountId, subaccountId, pricingId)

Get the details of a pricing plan for a subaccount.

Get the details of a pricing plan for a subaccount. See Account Subaccount Pricing for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.SubaccountpricingApi;

SubaccountpricingApi apiInstance = new SubaccountpricingApi();
Integer accountId = 56; // Integer | Account ID
Integer subaccountId = 56; // Integer | Subaccount ID
Integer pricingId = 56; // Integer | Pricing Object ID
try {
    PricingFull result = apiInstance.getAccountSubaccountPricing(accountId, subaccountId, pricingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountpricingApi#getAccountSubaccountPricing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **subaccountId** | **Integer**| Subaccount ID |
 **pricingId** | **Integer**| Pricing Object ID |

### Return type

[**PricingFull**](PricingFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountSubaccountPricing"></a>
# **listAccountSubaccountPricing**
> ListPricings listAccountSubaccountPricing(accountId, subaccountId, filtersId, sortId, limit, offset, fields)

Get a list of pricing plans for a subaccount.

Get a list of pricing plans for a subaccount. See Account Subaccount Pricing for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.SubaccountpricingApi;

SubaccountpricingApi apiInstance = new SubaccountpricingApi();
Integer accountId = 56; // Integer | Account ID
Integer subaccountId = 56; // Integer | Subaccount ID
List<String> filtersId = Arrays.asList("filtersId_example"); // List<String> | ID filter
String sortId = "sortId_example"; // String | ID sorting
Integer limit = 56; // Integer | Max results
Integer offset = 56; // Integer | Results to skip
String fields = "fields_example"; // String | Field set
try {
    ListPricings result = apiInstance.listAccountSubaccountPricing(accountId, subaccountId, filtersId, sortId, limit, offset, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubaccountpricingApi#listAccountSubaccountPricing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **subaccountId** | **Integer**| Subaccount ID |
 **filtersId** | [**List&lt;String&gt;**](String.md)| ID filter | [optional]
 **sortId** | **String**| ID sorting | [optional]
 **limit** | **Integer**| Max results | [optional]
 **offset** | **Integer**| Results to skip | [optional]
 **fields** | **String**| Field set | [optional]

### Return type

[**ListPricings**](ListPricings.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

