# UkraineAlarm - the Java library for the [Ukraine Alert API](https://api.ukrainealarm.com/)

- API version: 3.0

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AlertsApi;

import java.io.File;
import java.util.*;

public class AlertsApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AlertsApi;

import java.io.File;
import java.util.*;

public class AlertsApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AlertsApi;

import java.io.File;
import java.util.*;

public class AlertsApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AlertsApi;

import java.io.File;
import java.util.*;

public class AlertsApiExample {

    public static void main(String[] args) {
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to */*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AlertsApi* | [**apiV3AlertsGet**](docs/AlertsApi.md#apiV3AlertsGet) | **GET** /api/v3/alerts | Області, регіони та громади з тривогами
*AlertsApi* | [**apiV3AlertsRegionHistoryGet**](docs/AlertsApi.md#apiV3AlertsRegionHistoryGet) | **GET** /api/v3/alerts/regionHistory | Отримати останніх 25 тривог регіону
*AlertsApi* | [**apiV3AlertsRegionIdGet**](docs/AlertsApi.md#apiV3AlertsRegionIdGet) | **GET** /api/v3/alerts/{regionId} | Статус області/регіону/громади
*AlertsApi* | [**apiV3AlertsStatusGet**](docs/AlertsApi.md#apiV3AlertsStatusGet) | **GET** /api/v3/alerts/status | Перевірка номеру останньої дії. Використовувати для перевірки необхідності оновлювати дані
*RegionsApi* | [**apiV3RegionsGet**](docs/RegionsApi.md#apiV3RegionsGet) | **GET** /api/v3/regions | Повертає список усіх областей, регіонів та міст
*WebHookApi* | [**apiV3WebhookDelete**](docs/WebHookApi.md#apiV3WebhookDelete) | **DELETE** /api/v3/webhook | Відписка на WebHook про нові сирени та їх відбій
*WebHookApi* | [**apiV3WebhookPatch**](docs/WebHookApi.md#apiV3WebhookPatch) | **PATCH** /api/v3/webhook | Оновлення WebHook посилання про нові сирени та їх відбій
*WebHookApi* | [**apiV3WebhookPost**](docs/WebHookApi.md#apiV3WebhookPost) | **POST** /api/v3/webhook | Підписка на WebHook про нові сирени та їх відбій. У вебхукі відпрявляється подія тривоги/відбою (приклад в відповіді \&quot;200\&quot;)

## Documentation for Models

 - [Alert](docs/Alert.md)
 - [AlertModification](docs/AlertModification.md)
 - [AlertRegionModel](docs/AlertRegionModel.md)
 - [AlertType](docs/AlertType.md)
 - [RegionAlarmModel](docs/RegionAlarmModel.md)
 - [RegionAlarmsHistory](docs/RegionAlarmsHistory.md)
 - [RegionViewModel](docs/RegionViewModel.md)
 - [RegionsViewModel](docs/RegionsViewModel.md)
 - [TimeSpan](docs/TimeSpan.md)
 - [V2RegionType](docs/V2RegionType.md)
 - [WebHookModel](docs/WebHookModel.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### Token

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@stfalcon.com
