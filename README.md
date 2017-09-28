# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.AccountsApi;

public class AccountsApiExample {

    public static void main(String[] args) {
        AccountsApi apiInstance = new AccountsApi();
        Integer accountId = 56; // Integer | Account ID
        try {
            AccountFull result = apiInstance.getAccount(accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#getAccount");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.phone.com/v4*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**getAccount**](docs/AccountsApi.md#getAccount) | **GET** /accounts/{account_id} | Retrieve details of an individual account
*AccountsApi* | [**listAccounts**](docs/AccountsApi.md#listAccounts) | **GET** /accounts | Get a list of accounts visible to the authenticated user or client.
*ApplicationsApi* | [**getAccountApplication**](docs/ApplicationsApi.md#getAccountApplication) | **GET** /accounts/{account_id}/applications/{application_id} | Show details of an individual Application on a given account.
*ApplicationsApi* | [**listAccountApplications**](docs/ApplicationsApi.md#listAccountApplications) | **GET** /accounts/{account_id}/applications | This service lists the Applications on a given account
*AvailablenumbersApi* | [**listAvailablePhoneNumbers**](docs/AvailablenumbersApi.md#listAvailablePhoneNumbers) | **GET** /phone-numbers/available | 
*CalleridsApi* | [**getCallerIds**](docs/CalleridsApi.md#getCallerIds) | **GET** /accounts/{account_id}/extensions/{extension_id}/caller-ids | Show the Caller ID options a given extension can use.
*CalllogsApi* | [**getAccountCallLogs**](docs/CalllogsApi.md#getAccountCallLogs) | **GET** /accounts/{account_id}/call-logs/{call_id} | Show details of an individual Call Log entry
*CalllogsApi* | [**listAccountCallLogs**](docs/CalllogsApi.md#listAccountCallLogs) | **GET** /accounts/{account_id}/call-logs | Get a list of call details associated with your account
*CallsApi* | [**createAccountCall**](docs/CallsApi.md#createAccountCall) | **POST** /accounts/{account_id}/calls | Make a phone call
*ContactsApi* | [**createAccountExtensionContact**](docs/ContactsApi.md#createAccountExtensionContact) | **POST** /accounts/{account_id}/extensions/{extension_id}/contacts | Add a new address book contact for an extension.
*ContactsApi* | [**deleteAccountExtensionContact**](docs/ContactsApi.md#deleteAccountExtensionContact) | **DELETE** /accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id} | Delete a contact from the address book.
*ContactsApi* | [**getAccountExtensionContact**](docs/ContactsApi.md#getAccountExtensionContact) | **GET** /accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id} | Retrieve the details of an address book contact.
*ContactsApi* | [**listAccountExtensionContacts**](docs/ContactsApi.md#listAccountExtensionContacts) | **GET** /accounts/{account_id}/extensions/{extension_id}/contacts | Show the Caller ID options a given extension can use.
*ContactsApi* | [**replaceAccountExtensionContact**](docs/ContactsApi.md#replaceAccountExtensionContact) | **PUT** /accounts/{account_id}/extensions/{extension_id}/contacts/{contact_id} | Update the info of a contact in the address book.
*DefaultApi* | [**ping**](docs/DefaultApi.md#ping) | **GET** /ping | The default API command
*DevicesApi* | [**createAccountDevice**](docs/DevicesApi.md#createAccountDevice) | **POST** /accounts/{account_id}/devices | Register a generic VoIP device.
*DevicesApi* | [**deleteAccountDevice**](docs/DevicesApi.md#deleteAccountDevice) | **DELETE** /accounts/{account_id}/devices/{device_id} | Delete a VoIP device.
*DevicesApi* | [**getAccountDevice**](docs/DevicesApi.md#getAccountDevice) | **GET** /accounts/{account_id}/devices/{device_id} | Show details of an individual VoIP device.
*DevicesApi* | [**listAccountDevices**](docs/DevicesApi.md#listAccountDevices) | **GET** /accounts/{account_id}/devices | Get a list of VoIP devices associated with your account.
*DevicesApi* | [**replaceAccountDevice**](docs/DevicesApi.md#replaceAccountDevice) | **PUT** /accounts/{account_id}/devices/{device_id} | Update the details of an individual VoIP device.
*ExpressservicecodesApi* | [**getAccountExpressSrvCode**](docs/ExpressservicecodesApi.md#getAccountExpressSrvCode) | **GET** /accounts/{account_id}/express-service-codes/{code_id} | Show details of an account Express Service Code
*ExpressservicecodesApi* | [**listAccountExpressSrvCodes**](docs/ExpressservicecodesApi.md#listAccountExpressSrvCodes) | **GET** /accounts/{account_id}/express-service-codes | Get the Express Service Code associated with your account in list format.
*ExtensionsApi* | [**createAccountExtension**](docs/ExtensionsApi.md#createAccountExtension) | **POST** /accounts/{account_id}/extensions | Create an individual extension.
*ExtensionsApi* | [**getAccountExtension**](docs/ExtensionsApi.md#getAccountExtension) | **GET** /accounts/{account_id}/extensions/{extension_id} | Show details of an individual extension.
*ExtensionsApi* | [**listAccountExtensions**](docs/ExtensionsApi.md#listAccountExtensions) | **GET** /accounts/{account_id}/extensions | Get a list of extensions visible to the authenticated user or client.
*ExtensionsApi* | [**replaceAccountExtension**](docs/ExtensionsApi.md#replaceAccountExtension) | **PUT** /accounts/{account_id}/extensions/{extension_id} | Replace an individual extension.
*GroupsApi* | [**createAccountExtensionContactGroup**](docs/GroupsApi.md#createAccountExtensionContactGroup) | **POST** /accounts/{account_id}/extensions/{extension_id}/contact-groups | Add a new contact group to an account extension.
*GroupsApi* | [**deleteAccountExtensionContactGroup**](docs/GroupsApi.md#deleteAccountExtensionContactGroup) | **DELETE** /accounts/{account_id}/extensions/{extension_id}/contact-groups/{group_id} | Delete a contact group from the address book.
*GroupsApi* | [**getAccountExtensionContactGroup**](docs/GroupsApi.md#getAccountExtensionContactGroup) | **GET** /accounts/{account_id}/extensions/{extension_id}/contact-groups/{group_id} | Retrieve the information of a contact group.
*GroupsApi* | [**listAccountExtensionContactGroups**](docs/GroupsApi.md#listAccountExtensionContactGroups) | **GET** /accounts/{account_id}/extensions/{extension_id}/contact-groups | Show a list of contact groups belonging to an extension.
*GroupsApi* | [**replaceAccountExtensionContactGroup**](docs/GroupsApi.md#replaceAccountExtensionContactGroup) | **PUT** /accounts/{account_id}/extensions/{extension_id}/contact-groups/{group_id} | Update the information of a contact group.
*ListenersApi* | [**createAccountListener**](docs/ListenersApi.md#createAccountListener) | **POST** /accounts/{account_id}/listeners | Add a listener object to your account that can be used to subscribe an event.
*ListenersApi* | [**deleteAccountListener**](docs/ListenersApi.md#deleteAccountListener) | **DELETE** /accounts/{account_id}/listeners/{listener_id} | Delete an individual event listener.
*ListenersApi* | [**getAccountListener**](docs/ListenersApi.md#getAccountListener) | **GET** /accounts/{account_id}/listeners/{listener_id} | Show details of an individual listener.
*ListenersApi* | [**listAccountListeners**](docs/ListenersApi.md#listAccountListeners) | **GET** /accounts/{account_id}/listeners | Get a list of listeners for an account.
*ListenersApi* | [**replaceAccountListener**](docs/ListenersApi.md#replaceAccountListener) | **PUT** /accounts/{account_id}/listeners/{listener_id} | Update the settings of an individual event listener.
*MediaApi* | [**createAccountMediaFiles**](docs/MediaApi.md#createAccountMediaFiles) | **POST** /accounts/{account_id}/media/files | Add a media object to your account that can be used as a greeting or hold music. Users may create a media by using the built-in Text-to-speech (TTS) facility or upload a file of their choice. (Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB)
*MediaApi* | [**createAccountMediaTts**](docs/MediaApi.md#createAccountMediaTts) | **POST** /accounts/{account_id}/media/tts | Add a media object to your account that can be used as a greeting or hold music. Users may create a media by using the built-in Text-to-speech (TTS) facility or upload a file of their choice. (Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB)
*MediaApi* | [**deleteAccountMedia**](docs/MediaApi.md#deleteAccountMedia) | **DELETE** /accounts/{account_id}/media/{media_id} | Delete an individual media record
*MediaApi* | [**getAccountMedia**](docs/MediaApi.md#getAccountMedia) | **GET** /accounts/{account_id}/media/{media_id} | Show details of an individual media recording (Greeting or Hold Music)
*MediaApi* | [**listAccountMedia**](docs/MediaApi.md#listAccountMedia) | **GET** /accounts/{account_id}/media | Get a list of media recordings for an account.
*MediaApi* | [**replaceAccountMediaFiles**](docs/MediaApi.md#replaceAccountMediaFiles) | **PUT** /accounts/{account_id}/media/files/{media_id} | Update a media object to your account. Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB.
*MediaApi* | [**replaceAccountMediaTts**](docs/MediaApi.md#replaceAccountMediaTts) | **PUT** /accounts/{account_id}/media/tts/{media_id} | Update a media object to your account.
*MenusApi* | [**createAccountMenu**](docs/MenusApi.md#createAccountMenu) | **POST** /accounts/{account_id}/menus | Create an individual menu.
*MenusApi* | [**deleteAccountMenu**](docs/MenusApi.md#deleteAccountMenu) | **DELETE** /accounts/{account_id}/menus/{menu_id} | Delete an individual menu.
*MenusApi* | [**getAccountMenu**](docs/MenusApi.md#getAccountMenu) | **GET** /accounts/{account_id}/menus/{menu_id} | Show details of an individual menu.
*MenusApi* | [**listAccountMenus**](docs/MenusApi.md#listAccountMenus) | **GET** /accounts/{account_id}/menus | Get a list of menus for an account.
*MenusApi* | [**replaceAccountMenu**](docs/MenusApi.md#replaceAccountMenu) | **PUT** /accounts/{account_id}/menus/{menu_id} | Replace an individual menu.
*NumberregionsApi* | [**listAvailablePhoneNumberRegions**](docs/NumberregionsApi.md#listAvailablePhoneNumberRegions) | **GET** /phone-numbers/available/regions | 
*OauthApi* | [**createOauthAccessToken**](docs/OauthApi.md#createOauthAccessToken) | **POST** /oauth/access-token | To create an access token via the /oauth/access-token API, an API user may choose any one of the grant types it supports: Authorization Code Grant, Client Credential Grant, Password Credential Grant or Refresh Token Grant.
*OauthApi* | [**createOauthAuthorization**](docs/OauthApi.md#createOauthAuthorization) | **GET** /oauth/authorization | Create Authorization Code or Access Token.
*OauthApi* | [**getOauthAccessToken**](docs/OauthApi.md#getOauthAccessToken) | **GET** /oauth/access-token | Retrieve details of an access token, such as scope, expiration and extension ID.
*OauthclientsApi* | [**deleteAccountOauthClient**](docs/OauthclientsApi.md#deleteAccountOauthClient) | **DELETE** /accounts/{account_id}/oauth/clients/{client_id} | Delete an individual OAuth client.
*OauthclientsApi* | [**getAccountOauthClient**](docs/OauthclientsApi.md#getAccountOauthClient) | **GET** /accounts/{account_id}/oauth/clients/{client_id} | Show details of an individual OAuth client.
*OauthclientsApi* | [**listAccountOauthClients**](docs/OauthclientsApi.md#listAccountOauthClients) | **GET** /accounts/{account_id}/oauth/clients | Get a list of OAuth clients for an account.
*OauthclientsredirecturisApi* | [**createAccountOauthClientsRedirectUri**](docs/OauthclientsredirecturisApi.md#createAccountOauthClientsRedirectUri) | **POST** /accounts/{account_id}/oauth/clients/{client_id}/redirect-uris | Create an OAuth Client Redirect URI record.
*OauthclientsredirecturisApi* | [**deleteAccountOauthClientsRedirectUri**](docs/OauthclientsredirecturisApi.md#deleteAccountOauthClientsRedirectUri) | **DELETE** /accounts/{account_id}/oauth/clients/{client_id}/redirect-uris/{uri_id} | Delete an OAuth Client Redirect URI record.
*OauthclientsredirecturisApi* | [**getAccountOauthClientsRedirectUri**](docs/OauthclientsredirecturisApi.md#getAccountOauthClientsRedirectUri) | **GET** /accounts/{account_id}/oauth/clients/{client_id}/redirect-uris/{uri_id} | Get details of an OAuth Client Redirect URI record.
*OauthclientsredirecturisApi* | [**listAccountOauthClientsRedirectUris**](docs/OauthclientsredirecturisApi.md#listAccountOauthClientsRedirectUris) | **GET** /accounts/{account_id}/oauth/clients/{client_id}/redirect-uris | Get a list of OAuth Client Redirect URIs for an account.
*PaymentmethodsApi* | [**createAccountPaymentMethod**](docs/PaymentmethodsApi.md#createAccountPaymentMethod) | **POST** /accounts/{account_id}/payment-methods | Create an individual payment method.
*PaymentmethodsApi* | [**deleteAccountPaymentMethod**](docs/PaymentmethodsApi.md#deleteAccountPaymentMethod) | **DELETE** /accounts/{account_id}/payment-methods/{pm_id} | Delete an individual payment method.
*PaymentmethodsApi* | [**getAccountPaymentMethod**](docs/PaymentmethodsApi.md#getAccountPaymentMethod) | **GET** /accounts/{account_id}/payment-methods/{pm_id} | Show details of an individual payment method.
*PaymentmethodsApi* | [**listAccountPaymentMethods**](docs/PaymentmethodsApi.md#listAccountPaymentMethods) | **GET** /accounts/{account_id}/payment-methods | Get a list of payment methods for an account.
*PaymentmethodsApi* | [**patchAccountPaymentMethod**](docs/PaymentmethodsApi.md#patchAccountPaymentMethod) | **PATCH** /accounts/{account_id}/payment-methods/{pm_id} | Replace the status of an individual payment method.
*PhonenumbersApi* | [**createAccountPhoneNumber**](docs/PhonenumbersApi.md#createAccountPhoneNumber) | **POST** /accounts/{account_id}/phone-numbers | Add a phone number to an account.
*PhonenumbersApi* | [**getAccountPhoneNumber**](docs/PhonenumbersApi.md#getAccountPhoneNumber) | **GET** /accounts/{account_id}/phone-numbers/{number_id} | Show details of an individual phone number.
*PhonenumbersApi* | [**listAccountPhoneNumbers**](docs/PhonenumbersApi.md#listAccountPhoneNumbers) | **GET** /accounts/{account_id}/phone-numbers | Get a list of phone numbers registered to an account.
*PhonenumbersApi* | [**replaceAccountPhoneNumber**](docs/PhonenumbersApi.md#replaceAccountPhoneNumber) | **PUT** /accounts/{account_id}/phone-numbers/{number_id} | Update the settings for an existing phone number on your account.
*QueuesApi* | [**createAccountQueue**](docs/QueuesApi.md#createAccountQueue) | **POST** /accounts/{account_id}/queues | Create a queue.
*QueuesApi* | [**deleteAccountQueue**](docs/QueuesApi.md#deleteAccountQueue) | **DELETE** /accounts/{account_id}/queues/{queue_id} | Delete a queue.
*QueuesApi* | [**getAccountQueue**](docs/QueuesApi.md#getAccountQueue) | **GET** /accounts/{account_id}/queues/{queue_id} | Show details of an individual queue.
*QueuesApi* | [**listAccountQueues**](docs/QueuesApi.md#listAccountQueues) | **GET** /accounts/{account_id}/queues | Get a list of queues for an account.
*QueuesApi* | [**replaceAccountQueue**](docs/QueuesApi.md#replaceAccountQueue) | **PUT** /accounts/{account_id}/queues/{queue_id} | Replace a queue.
*RoutesApi* | [**createRoute**](docs/RoutesApi.md#createRoute) | **POST** /accounts/{account_id}/routes | Add a new route to the account.
*RoutesApi* | [**deleteAccountRoute**](docs/RoutesApi.md#deleteAccountRoute) | **DELETE** /accounts/{account_id}/routes/{route_id} | Delete a route from the account.
*RoutesApi* | [**getAccountRoute**](docs/RoutesApi.md#getAccountRoute) | **GET** /accounts/{account_id}/routes/{route_id} | Show details of an individual route.
*RoutesApi* | [**listAccountRoutes**](docs/RoutesApi.md#listAccountRoutes) | **GET** /accounts/{account_id}/routes | Get a list of routes for an account.
*RoutesApi* | [**replaceAccountRoute**](docs/RoutesApi.md#replaceAccountRoute) | **PUT** /accounts/{account_id}/routes/{route_id} | Update the information of a route.
*SchedulesApi* | [**getAccountSchedule**](docs/SchedulesApi.md#getAccountSchedule) | **GET** /accounts/{account_id}/schedules/{schedule_id} | Show details of an individual schedule
*SchedulesApi* | [**listAccountSchedules**](docs/SchedulesApi.md#listAccountSchedules) | **GET** /accounts/{account_id}/schedules | Get a list of schedules for an account
*SmsApi* | [**createAccountSms**](docs/SmsApi.md#createAccountSms) | **POST** /accounts/{account_id}/sms | Send a SMS to one or a group of recipients.
*SmsApi* | [**getAccountSms**](docs/SmsApi.md#getAccountSms) | **GET** /accounts/{account_id}/sms/{sms_id} | This service shows the details of an individual SMS.
*SmsApi* | [**listAccountSms**](docs/SmsApi.md#listAccountSms) | **GET** /accounts/{account_id}/sms | Get a list of SMS messages for an account.
*SmsApi* | [**patchAccountSms**](docs/SmsApi.md#patchAccountSms) | **PATCH** /accounts/{account_id}/sms/{sms_id} | Update the is_new parameter in a sms record.
*SubaccountpricingApi* | [**createAccountSubaccountPricing**](docs/SubaccountpricingApi.md#createAccountSubaccountPricing) | **POST** /accounts/{account_id}/subaccounts/{subaccount_id}/pricing | Add a pricing plan to a subaccount.
*SubaccountpricingApi* | [**deleteAccountSubaccountPricing**](docs/SubaccountpricingApi.md#deleteAccountSubaccountPricing) | **DELETE** /accounts/{account_id}/subaccounts/{subaccount_id}/pricing/{pricing_id} | Delete a pricing plan from a subaccount.
*SubaccountpricingApi* | [**getAccountSubaccountPricing**](docs/SubaccountpricingApi.md#getAccountSubaccountPricing) | **GET** /accounts/{account_id}/subaccounts/{subaccount_id}/pricing/{pricing_id} | Get the details of a pricing plan for a subaccount.
*SubaccountpricingApi* | [**listAccountSubaccountPricing**](docs/SubaccountpricingApi.md#listAccountSubaccountPricing) | **GET** /accounts/{account_id}/subaccounts/{subaccount_id}/pricing | Get a list of pricing plans for a subaccount.
*SubaccountsApi* | [**createAccountSubaccount**](docs/SubaccountsApi.md#createAccountSubaccount) | **POST** /accounts/{account_id}/subaccounts | Add a subaccount for the authenticated user or client
*SubaccountsApi* | [**listAccountSubaccounts**](docs/SubaccountsApi.md#listAccountSubaccounts) | **GET** /accounts/{account_id}/subaccounts | Get a list of subaccounts for the authenticated user or client
*TrunksApi* | [**createAccountTrunk**](docs/TrunksApi.md#createAccountTrunk) | **POST** /accounts/{account_id}/trunks | Add a trunk record with SIP information.
*TrunksApi* | [**deleteAccountTrunk**](docs/TrunksApi.md#deleteAccountTrunk) | **DELETE** /accounts/{account_id}/trunks/{trunk_id} | Delete a trunk from account.
*TrunksApi* | [**getAccountTrunk**](docs/TrunksApi.md#getAccountTrunk) | **GET** /accounts/{account_id}/trunks/{trunk_id} | Show details of an individual trunk.
*TrunksApi* | [**listAccountTrunks**](docs/TrunksApi.md#listAccountTrunks) | **GET** /accounts/{account_id}/trunks | Get a list of trunks for an account.
*TrunksApi* | [**replaceAccountTrunk**](docs/TrunksApi.md#replaceAccountTrunk) | **PUT** /accounts/{account_id}/trunks/{trunk_id} | Replace parameters in a trunk.
*VoicemailApi* | [**getAccountVoicemail**](docs/VoicemailApi.md#getAccountVoicemail) | **GET** /accounts/{account_id}/voicemail/{voicemail_id} | This service shows the details of an individual voicemail.
*VoicemailApi* | [**listAccountVoicemail**](docs/VoicemailApi.md#listAccountVoicemail) | **GET** /accounts/{account_id}/voicemail | Get a list of voicemail messages for an account.
*VoicemailApi* | [**patchAccountVoicemail**](docs/VoicemailApi.md#patchAccountVoicemail) | **PATCH** /accounts/{account_id}/voicemail/{voicemail_id} | Update the is_new parameter in a voicemail record.


## Documentation for Models

 - [AccountFull](docs/AccountFull.md)
 - [AccountSummary](docs/AccountSummary.md)
 - [Address](docs/Address.md)
 - [AddressListContacts](docs/AddressListContacts.md)
 - [ApplicationFull](docs/ApplicationFull.md)
 - [ApplicationSummary](docs/ApplicationSummary.md)
 - [AvailableNumbersFull](docs/AvailableNumbersFull.md)
 - [CallDetails](docs/CallDetails.md)
 - [CallFull](docs/CallFull.md)
 - [CallLogFull](docs/CallLogFull.md)
 - [CallNotifications](docs/CallNotifications.md)
 - [CallbackObject](docs/CallbackObject.md)
 - [CallerIdFull](docs/CallerIdFull.md)
 - [CallerIdPhoneNumber](docs/CallerIdPhoneNumber.md)
 - [ContactAccount](docs/ContactAccount.md)
 - [ContactFull](docs/ContactFull.md)
 - [ContactResponse](docs/ContactResponse.md)
 - [ContactSummary](docs/ContactSummary.md)
 - [CreateCallParams](docs/CreateCallParams.md)
 - [CreateContactParams](docs/CreateContactParams.md)
 - [CreateDeviceParams](docs/CreateDeviceParams.md)
 - [CreateExtensionParams](docs/CreateExtensionParams.md)
 - [CreateGroupParams](docs/CreateGroupParams.md)
 - [CreateListenerParams](docs/CreateListenerParams.md)
 - [CreateMediaParams](docs/CreateMediaParams.md)
 - [CreateMenuParams](docs/CreateMenuParams.md)
 - [CreateOauthParams](docs/CreateOauthParams.md)
 - [CreatePaymentParams](docs/CreatePaymentParams.md)
 - [CreatePhoneNumberParams](docs/CreatePhoneNumberParams.md)
 - [CreatePricingParams](docs/CreatePricingParams.md)
 - [CreateQueueParams](docs/CreateQueueParams.md)
 - [CreateRedirectUriParams](docs/CreateRedirectUriParams.md)
 - [CreateRouteParams](docs/CreateRouteParams.md)
 - [CreateSmsParams](docs/CreateSmsParams.md)
 - [CreateSubaccountParams](docs/CreateSubaccountParams.md)
 - [CreateTrunkParams](docs/CreateTrunkParams.md)
 - [DeleteEntry](docs/DeleteEntry.md)
 - [DeviceFull](docs/DeviceFull.md)
 - [DeviceMembership](docs/DeviceMembership.md)
 - [DeviceSummary](docs/DeviceSummary.md)
 - [Email](docs/Email.md)
 - [ExpressServiceCodeFull](docs/ExpressServiceCodeFull.md)
 - [ExtensionFull](docs/ExtensionFull.md)
 - [ExtensionSummary](docs/ExtensionSummary.md)
 - [FilterCallLogs](docs/FilterCallLogs.md)
 - [FilterIdArray](docs/FilterIdArray.md)
 - [FilterIdDirectionFrom](docs/FilterIdDirectionFrom.md)
 - [FilterIdExtensionNameArray](docs/FilterIdExtensionNameArray.md)
 - [FilterIdGroupIdUpdatedAtArray](docs/FilterIdGroupIdUpdatedAtArray.md)
 - [FilterIdNameArray](docs/FilterIdNameArray.md)
 - [FilterIdNamePhoneNumberArray](docs/FilterIdNamePhoneNumberArray.md)
 - [FilterListAvailableNumbers](docs/FilterListAvailableNumbers.md)
 - [FilterListPhoneNumbersRegions](docs/FilterListPhoneNumbersRegions.md)
 - [FilterNameNumberArray](docs/FilterNameNumberArray.md)
 - [FilterVoicemailArray](docs/FilterVoicemailArray.md)
 - [FromObject](docs/FromObject.md)
 - [GetOauthAccessToken](docs/GetOauthAccessToken.md)
 - [Greeting](docs/Greeting.md)
 - [GreetingInput](docs/GreetingInput.md)
 - [GroupFull](docs/GroupFull.md)
 - [GroupListContacts](docs/GroupListContacts.md)
 - [GroupSummary](docs/GroupSummary.md)
 - [HoldMusic](docs/HoldMusic.md)
 - [Line](docs/Line.md)
 - [ListAccounts](docs/ListAccounts.md)
 - [ListApplications](docs/ListApplications.md)
 - [ListAvailableNumbers](docs/ListAvailableNumbers.md)
 - [ListCallLogs](docs/ListCallLogs.md)
 - [ListCallerIds](docs/ListCallerIds.md)
 - [ListContacts](docs/ListContacts.md)
 - [ListDevices](docs/ListDevices.md)
 - [ListExpressServiceCodes](docs/ListExpressServiceCodes.md)
 - [ListExtensions](docs/ListExtensions.md)
 - [ListGroups](docs/ListGroups.md)
 - [ListListeners](docs/ListListeners.md)
 - [ListMedia](docs/ListMedia.md)
 - [ListMenus](docs/ListMenus.md)
 - [ListOauthClients](docs/ListOauthClients.md)
 - [ListOauthClientsRedirectUris](docs/ListOauthClientsRedirectUris.md)
 - [ListPaymentMethods](docs/ListPaymentMethods.md)
 - [ListPhoneNumbers](docs/ListPhoneNumbers.md)
 - [ListPhoneNumbersRegions](docs/ListPhoneNumbersRegions.md)
 - [ListPricings](docs/ListPricings.md)
 - [ListQueues](docs/ListQueues.md)
 - [ListRoutes](docs/ListRoutes.md)
 - [ListSchedules](docs/ListSchedules.md)
 - [ListSms](docs/ListSms.md)
 - [ListTrunks](docs/ListTrunks.md)
 - [ListVoicemail](docs/ListVoicemail.md)
 - [ListenerFull](docs/ListenerFull.md)
 - [MediaFull](docs/MediaFull.md)
 - [MediaSummary](docs/MediaSummary.md)
 - [Member](docs/Member.md)
 - [MenuFull](docs/MenuFull.md)
 - [MenuSummary](docs/MenuSummary.md)
 - [Notification](docs/Notification.md)
 - [OauthAccessToken](docs/OauthAccessToken.md)
 - [OauthClientFull](docs/OauthClientFull.md)
 - [OauthClientRedirectUriFull](docs/OauthClientRedirectUriFull.md)
 - [Option](docs/Option.md)
 - [PatchPaymentParams](docs/PatchPaymentParams.md)
 - [PatchSmsParams](docs/PatchSmsParams.md)
 - [PatchVoicemailParams](docs/PatchVoicemailParams.md)
 - [PaymentFull](docs/PaymentFull.md)
 - [PaymentSummary](docs/PaymentSummary.md)
 - [PhoneNumberContact](docs/PhoneNumberContact.md)
 - [PhoneNumberFull](docs/PhoneNumberFull.md)
 - [PhoneNumbersRegionFull](docs/PhoneNumbersRegionFull.md)
 - [PingResponse](docs/PingResponse.md)
 - [PricingFull](docs/PricingFull.md)
 - [PricingObject](docs/PricingObject.md)
 - [QueueFull](docs/QueueFull.md)
 - [QueueSummary](docs/QueueSummary.md)
 - [Recipient](docs/Recipient.md)
 - [RedirectUriFull](docs/RedirectUriFull.md)
 - [ReplaceExtensionParams](docs/ReplaceExtensionParams.md)
 - [ReplaceMenuParams](docs/ReplaceMenuParams.md)
 - [ReplacePhoneNumberParams](docs/ReplacePhoneNumberParams.md)
 - [RouteFull](docs/RouteFull.md)
 - [RouteSummary](docs/RouteSummary.md)
 - [RuleSet](docs/RuleSet.md)
 - [RuleSetAction](docs/RuleSetAction.md)
 - [RuleSetFilter](docs/RuleSetFilter.md)
 - [RuleSetForwardItem](docs/RuleSetForwardItem.md)
 - [ScheduleFull](docs/ScheduleFull.md)
 - [ScheduleSummary](docs/ScheduleSummary.md)
 - [ScopeDetails](docs/ScopeDetails.md)
 - [SipAuthentication](docs/SipAuthentication.md)
 - [SmsForwarding](docs/SmsForwarding.md)
 - [SmsForwardingParams](docs/SmsForwardingParams.md)
 - [SmsFull](docs/SmsFull.md)
 - [SortCallLogs](docs/SortCallLogs.md)
 - [SortId](docs/SortId.md)
 - [SortIdCreatedAt](docs/SortIdCreatedAt.md)
 - [SortIdExtensionName](docs/SortIdExtensionName.md)
 - [SortIdName](docs/SortIdName.md)
 - [SortIdNamePhoneNumber](docs/SortIdNamePhoneNumber.md)
 - [SortIdUpdatedAt](docs/SortIdUpdatedAt.md)
 - [SortListAvailableNumbers](docs/SortListAvailableNumbers.md)
 - [SortListPhoneNumbersRegions](docs/SortListPhoneNumbersRegions.md)
 - [SortNameNumber](docs/SortNameNumber.md)
 - [TrunkFull](docs/TrunkFull.md)
 - [TrunkSummary](docs/TrunkSummary.md)
 - [Voicemail](docs/Voicemail.md)
 - [VoicemailFull](docs/VoicemailFull.md)
 - [VoicemailInput](docs/VoicemailInput.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKey

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

apisupport@phone.com

