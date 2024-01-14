# AlertsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV3AlertsGet**](AlertsApi.md#apiV3AlertsGet) | **GET** /api/v3/alerts | Області, регіони та громади з тривогами
[**apiV3AlertsRegionHistoryGet**](AlertsApi.md#apiV3AlertsRegionHistoryGet) | **GET** /api/v3/alerts/regionHistory | Отримати останніх 25 тривог регіону
[**apiV3AlertsRegionIdGet**](AlertsApi.md#apiV3AlertsRegionIdGet) | **GET** /api/v3/alerts/{regionId} | Статус області/регіону/громади
[**apiV3AlertsStatusGet**](AlertsApi.md#apiV3AlertsStatusGet) | **GET** /api/v3/alerts/status | Перевірка номеру останньої дії. Використовувати для перевірки необхідності оновлювати дані

<a name="apiV3AlertsGet"></a>
# **apiV3AlertsGet**
> List&lt;AlertRegionModel&gt; apiV3AlertsGet()

Області, регіони та громади з тривогами

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
try {
    List<AlertRegionModel> result = apiInstance.apiV3AlertsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#apiV3AlertsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AlertRegionModel&gt;**](AlertRegionModel.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3AlertsRegionHistoryGet"></a>
# **apiV3AlertsRegionHistoryGet**
> List&lt;RegionAlarmsHistory&gt; apiV3AlertsRegionHistoryGet(regionId)

Отримати останніх 25 тривог регіону

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
String regionId = "regionId_example"; // String | 
try {
    List<RegionAlarmsHistory> result = apiInstance.apiV3AlertsRegionHistoryGet(regionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#apiV3AlertsRegionHistoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | **String**|  | [optional]

### Return type

[**List&lt;RegionAlarmsHistory&gt;**](RegionAlarmsHistory.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3AlertsRegionIdGet"></a>
# **apiV3AlertsRegionIdGet**
> List&lt;AlertRegionModel&gt; apiV3AlertsRegionIdGet(regionId)

Статус області/регіону/громади

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
String regionId = "regionId_example"; // String | ID області/регіону/громади
try {
    List<AlertRegionModel> result = apiInstance.apiV3AlertsRegionIdGet(regionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#apiV3AlertsRegionIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | **String**| ID області/регіону/громади |

### Return type

[**List&lt;AlertRegionModel&gt;**](AlertRegionModel.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3AlertsStatusGet"></a>
# **apiV3AlertsStatusGet**
> AlertModification apiV3AlertsStatusGet()

Перевірка номеру останньої дії. Використовувати для перевірки необхідності оновлювати дані

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
try {
    AlertModification result = apiInstance.apiV3AlertsStatusGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#apiV3AlertsStatusGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AlertModification**](AlertModification.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

