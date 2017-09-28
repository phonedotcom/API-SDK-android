# QueuesApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountQueue**](QueuesApi.md#createAccountQueue) | **POST** /accounts/{account_id}/queues | Create a queue.
[**deleteAccountQueue**](QueuesApi.md#deleteAccountQueue) | **DELETE** /accounts/{account_id}/queues/{queue_id} | Delete a queue.
[**getAccountQueue**](QueuesApi.md#getAccountQueue) | **GET** /accounts/{account_id}/queues/{queue_id} | Show details of an individual queue.
[**listAccountQueues**](QueuesApi.md#listAccountQueues) | **GET** /accounts/{account_id}/queues | Get a list of queues for an account.
[**replaceAccountQueue**](QueuesApi.md#replaceAccountQueue) | **PUT** /accounts/{account_id}/queues/{queue_id} | Replace a queue.


<a name="createAccountQueue"></a>
# **createAccountQueue**
> QueueFull createAccountQueue(accountId, data)

Create a queue.

Create a queue. See Account Queues for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.QueuesApi;

QueuesApi apiInstance = new QueuesApi();
Integer accountId = 56; // Integer | Account ID
CreateQueueParams data = new CreateQueueParams(); // CreateQueueParams | Queue data
try {
    QueueFull result = apiInstance.createAccountQueue(accountId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueuesApi#createAccountQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **data** | [**CreateQueueParams**](CreateQueueParams.md)| Queue data | [optional]

### Return type

[**QueueFull**](QueueFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountQueue"></a>
# **deleteAccountQueue**
> DeleteEntry deleteAccountQueue(accountId, queueId)

Delete a queue.

Delete a queue. See Account Queues for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.QueuesApi;

QueuesApi apiInstance = new QueuesApi();
Integer accountId = 56; // Integer | Account ID
Integer queueId = 56; // Integer | Queue ID
try {
    DeleteEntry result = apiInstance.deleteAccountQueue(accountId, queueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueuesApi#deleteAccountQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **queueId** | **Integer**| Queue ID |

### Return type

[**DeleteEntry**](DeleteEntry.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountQueue"></a>
# **getAccountQueue**
> QueueFull getAccountQueue(accountId, queueId)

Show details of an individual queue.

Show details of an individual queue. See Account Queues for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.QueuesApi;

QueuesApi apiInstance = new QueuesApi();
Integer accountId = 56; // Integer | Account ID
Integer queueId = 56; // Integer | Queue ID
try {
    QueueFull result = apiInstance.getAccountQueue(accountId, queueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueuesApi#getAccountQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **queueId** | **Integer**| Queue ID |

### Return type

[**QueueFull**](QueueFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountQueues"></a>
# **listAccountQueues**
> ListQueues listAccountQueues(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields)

Get a list of queues for an account.

Get a list of queues for an account. See Account Queues for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.QueuesApi;

QueuesApi apiInstance = new QueuesApi();
Integer accountId = 56; // Integer | Account ID
List<String> filtersId = Arrays.asList("filtersId_example"); // List<String> | ID filter
List<String> filtersName = Arrays.asList("filtersName_example"); // List<String> | Name filter
String sortId = "sortId_example"; // String | ID sorting
String sortName = "sortName_example"; // String | Name sorting
Integer limit = 56; // Integer | Max results
Integer offset = 56; // Integer | Results to skip
String fields = "fields_example"; // String | Field set
try {
    ListQueues result = apiInstance.listAccountQueues(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueuesApi#listAccountQueues");
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

[**ListQueues**](ListQueues.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceAccountQueue"></a>
# **replaceAccountQueue**
> QueueFull replaceAccountQueue(accountId, queueId, data)

Replace a queue.

Replace a queue. See Account Queues for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.api.QueuesApi;

QueuesApi apiInstance = new QueuesApi();
Integer accountId = 56; // Integer | Account ID
Integer queueId = 56; // Integer | Queue ID
CreateQueueParams data = new CreateQueueParams(); // CreateQueueParams | Queue data
try {
    QueueFull result = apiInstance.replaceAccountQueue(accountId, queueId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueuesApi#replaceAccountQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **queueId** | **Integer**| Queue ID |
 **data** | [**CreateQueueParams**](CreateQueueParams.md)| Queue data | [optional]

### Return type

[**QueueFull**](QueueFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

