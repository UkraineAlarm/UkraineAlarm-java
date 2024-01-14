# WebHookApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV3WebhookDelete**](WebHookApi.md#apiV3WebhookDelete) | **DELETE** /api/v3/webhook | Відписка на WebHook про нові сирени та їх відбій
[**apiV3WebhookPatch**](WebHookApi.md#apiV3WebhookPatch) | **PATCH** /api/v3/webhook | Оновлення WebHook посилання про нові сирени та їх відбій
[**apiV3WebhookPost**](WebHookApi.md#apiV3WebhookPost) | **POST** /api/v3/webhook | Підписка на WebHook про нові сирени та їх відбій. У вебхукі відпрявляється подія тривоги/відбою (приклад в відповіді \&quot;200\&quot;)

<a name="apiV3WebhookDelete"></a>
# **apiV3WebhookDelete**
> apiV3WebhookDelete(body)

Відписка на WebHook про нові сирени та їх відбій

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebHookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

WebHookApi apiInstance = new WebHookApi();
WebHookModel body = new WebHookModel(); // WebHookModel | 
try {
    apiInstance.apiV3WebhookDelete(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookApi#apiV3WebhookDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WebHookModel**](WebHookModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="apiV3WebhookPatch"></a>
# **apiV3WebhookPatch**
> apiV3WebhookPatch(body)

Оновлення WebHook посилання про нові сирени та їх відбій

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebHookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

WebHookApi apiInstance = new WebHookApi();
WebHookModel body = new WebHookModel(); // WebHookModel | 
try {
    apiInstance.apiV3WebhookPatch(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookApi#apiV3WebhookPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WebHookModel**](WebHookModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="apiV3WebhookPost"></a>
# **apiV3WebhookPost**
> AlertRegionModel apiV3WebhookPost(body)

Підписка на WebHook про нові сирени та їх відбій. У вебхукі відпрявляється подія тривоги/відбою (приклад в відповіді \&quot;200\&quot;)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebHookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

WebHookApi apiInstance = new WebHookApi();
WebHookModel body = new WebHookModel(); // WebHookModel | 
try {
    AlertRegionModel result = apiInstance.apiV3WebhookPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookApi#apiV3WebhookPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WebHookModel**](WebHookModel.md)|  | [optional]

### Return type

[**AlertRegionModel**](AlertRegionModel.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

