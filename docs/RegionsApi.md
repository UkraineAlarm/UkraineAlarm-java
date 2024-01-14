# RegionsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV3RegionsGet**](RegionsApi.md#apiV3RegionsGet) | **GET** /api/v3/regions | Повертає список усіх областей, регіонів та міст

<a name="apiV3RegionsGet"></a>
# **apiV3RegionsGet**
> RegionsViewModel apiV3RegionsGet()

Повертає список усіх областей, регіонів та міст

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RegionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Token
ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Token.setApiKeyPrefix("Token");

RegionsApi apiInstance = new RegionsApi();
try {
    RegionsViewModel result = apiInstance.apiV3RegionsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegionsApi#apiV3RegionsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RegionsViewModel**](RegionsViewModel.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

