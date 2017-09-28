
# PaymentFull

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Payment Method ID |  [optional]
**voipId** | **Integer** | API Account ID |  [optional]
**status** | **String** | &#39;primary&#39; &#x3D; primary card used for billing; &#39;onfile&#39; &#x3D; card on file; &#39;hidden&#39; &#x3D; deleted card; |  [optional]
**nickname** | **String** | Name of Card |  [optional]
**type** | **String** | &#39;cc&#39; for credit card |  [optional]
**createdAt** | **Integer** | Time payment record is created |  [optional]
**contact** | [**ContactResponse**](ContactResponse.md) | Detail of contact person |  [optional]
**declineCount** | **Integer** | Number of times the payment method was declined |  [optional]
**nextChargeDate** | **Integer** | Next billing date |  [optional]
**updatedAt** | **Integer** | Last time the payment method was updated |  [optional]
**ccToken** | **String** | Encrypted credit card token to be used for billing |  [optional]
**ccNumber** | **String** | Credit card number partially masked with xxxxxxxx |  [optional]
**ccExp** | **String** | Credit card expiration date |  [optional]



