# ContactsApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountExtensionContact**](ContactsApi.md#createAccountExtensionContact) | **POST** /accounts/{account_id}/extensions/{extension_id}/contacts | Add a new address book contact for an extension.
[**deleteAccountExtensionContact**](ContactsApi.md#deleteAccountExtensionContact) | **DELETE** /accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id} | Delete a contact from the address book.
[**getAccountExtensionContact**](ContactsApi.md#getAccountExtensionContact) | **GET** /accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id} | Retrieve the details of an address book contact.
[**listAccountExtensionContacts**](ContactsApi.md#listAccountExtensionContacts) | **GET** /accounts/{account_id}/extensions/{extension_id}/contacts | Show the Caller ID options a given extension can use.
[**replaceAccountExtensionContact**](ContactsApi.md#replaceAccountExtensionContact) | **PUT** /accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id} | Update the info of a contact in the address book.


<a name="createAccountExtensionContact"></a>
# **createAccountExtensionContact**
> ContactFull createAccountExtensionContact(accountId, extensionId, data)

Add a new address book contact for an extension.

Add a new address book contact for an extension. See Account Contacts for more info on the fields in each item.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContactsApi;

ContactsApi apiInstance = new ContactsApi();
Integer accountId = 56; // Integer | Account ID
Integer extensionId = 56; // Integer | Extension ID
CreateContactParams data = new CreateContactParams(); // CreateContactParams | Contact data
try {
    ContactFull result = apiInstance.createAccountExtensionContact(accountId, extensionId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#createAccountExtensionContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **extensionId** | **Integer**| Extension ID |
 **data** | [**CreateContactParams**](CreateContactParams.md)| Contact data | [optional]

### Return type

[**ContactFull**](ContactFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountExtensionContact"></a>
# **deleteAccountExtensionContact**
> DeleteEntry deleteAccountExtensionContact(accountId, extensionId, contactId)

Delete a contact from the address book.

Delete a contact from the address book. See Account Contacts for more info on the fields in each item.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContactsApi;

ContactsApi apiInstance = new ContactsApi();
Integer accountId = 56; // Integer | Account ID
Integer extensionId = 56; // Integer | Extension ID
Integer contactId = 56; // Integer | Contact ID
try {
    DeleteEntry result = apiInstance.deleteAccountExtensionContact(accountId, extensionId, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteAccountExtensionContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **extensionId** | **Integer**| Extension ID |
 **contactId** | **Integer**| Contact ID |

### Return type

[**DeleteEntry**](DeleteEntry.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountExtensionContact"></a>
# **getAccountExtensionContact**
> ContactFull getAccountExtensionContact(accountId, extensionId, contactId)

Retrieve the details of an address book contact.

Retrieve the details of an address book contact. See Account Contacts for more info on the fields in each item.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContactsApi;

ContactsApi apiInstance = new ContactsApi();
Integer accountId = 56; // Integer | Account ID
Integer extensionId = 56; // Integer | Extension ID
Integer contactId = 56; // Integer | Contact ID
try {
    ContactFull result = apiInstance.getAccountExtensionContact(accountId, extensionId, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getAccountExtensionContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **extensionId** | **Integer**| Extension ID |
 **contactId** | **Integer**| Contact ID |

### Return type

[**ContactFull**](ContactFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountExtensionContacts"></a>
# **listAccountExtensionContacts**
> ListContacts listAccountExtensionContacts(accountId, extensionId, filtersId, filtersGroupId, filtersUpdatedAt, sortId, sortUpdatedAt, limit, offset, fields)

Show the Caller ID options a given extension can use.

Show the Caller ID options a given extension can use. See Intro to Caller IDs for more on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContactsApi;

ContactsApi apiInstance = new ContactsApi();
Integer accountId = 56; // Integer | Account ID
Integer extensionId = 56; // Integer | Extension ID
List<String> filtersId = Arrays.asList("filtersId_example"); // List<String> | ID filter
List<String> filtersGroupId = Arrays.asList("filtersGroupId_example"); // List<String> | Group filter
List<String> filtersUpdatedAt = Arrays.asList("filtersUpdatedAt_example"); // List<String> | Updated At filter
String sortId = "sortId_example"; // String | ID sorting
String sortUpdatedAt = "sortUpdatedAt_example"; // String | Updated At sorting
Integer limit = 56; // Integer | Max results
Integer offset = 56; // Integer | Results to skip
String fields = "fields_example"; // String | Field set
try {
    ListContacts result = apiInstance.listAccountExtensionContacts(accountId, extensionId, filtersId, filtersGroupId, filtersUpdatedAt, sortId, sortUpdatedAt, limit, offset, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#listAccountExtensionContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **extensionId** | **Integer**| Extension ID |
 **filtersId** | [**List&lt;String&gt;**](String.md)| ID filter | [optional]
 **filtersGroupId** | [**List&lt;String&gt;**](String.md)| Group filter | [optional]
 **filtersUpdatedAt** | [**List&lt;String&gt;**](String.md)| Updated At filter | [optional]
 **sortId** | **String**| ID sorting | [optional]
 **sortUpdatedAt** | **String**| Updated At sorting | [optional]
 **limit** | **Integer**| Max results | [optional]
 **offset** | **Integer**| Results to skip | [optional]
 **fields** | **String**| Field set | [optional]

### Return type

[**ListContacts**](ListContacts.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceAccountExtensionContact"></a>
# **replaceAccountExtensionContact**
> ContactFull replaceAccountExtensionContact(accountId, extensionId, contactId, data)

Update the info of a contact in the address book.

Update the info of a contact in the address book. See Account Contacts for more info on the fields in each item.

### Example
```java
// Import classes:
//import io.swagger.client.api.ContactsApi;

ContactsApi apiInstance = new ContactsApi();
Integer accountId = 56; // Integer | Account ID
Integer extensionId = 56; // Integer | Extension ID
Integer contactId = 56; // Integer | Contact ID
CreateContactParams data = new CreateContactParams(); // CreateContactParams | Contact data
try {
    ContactFull result = apiInstance.replaceAccountExtensionContact(accountId, extensionId, contactId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#replaceAccountExtensionContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **extensionId** | **Integer**| Extension ID |
 **contactId** | **Integer**| Contact ID |
 **data** | [**CreateContactParams**](CreateContactParams.md)| Contact data | [optional]

### Return type

[**ContactFull**](ContactFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

