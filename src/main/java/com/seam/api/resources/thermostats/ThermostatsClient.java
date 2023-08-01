package com.seam.api.resources.thermostats;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.Suppliers;
import com.seam.api.resources.thermostats.climatesettingschedules.ClimateSettingSchedulesClient;
import com.seam.api.resources.thermostats.requests.ThermostatsGetRequest;
import com.seam.api.resources.thermostats.requests.ThermostatsHeatRequest;
import com.seam.api.resources.thermostats.requests.ThermostatsListRequest;
import com.seam.api.resources.thermostats.requests.ThermostatsUpdateRequest;
import com.seam.api.types.ThermostatsGetResponse;
import com.seam.api.types.ThermostatsHeatResponse;
import com.seam.api.types.ThermostatsListResponse;
import com.seam.api.types.ThermostatsUpdateResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ThermostatsClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<ClimateSettingSchedulesClient> climateSettingSchedulesClient;

    public ThermostatsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.climateSettingSchedulesClient = Suppliers.memoize(() -> new ClimateSettingSchedulesClient(clientOptions));
    }

    public ThermostatsGetResponse get(ThermostatsGetRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("thermostats/get")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
        _requestBodyProperties.put("name", request.getName());
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ThermostatsGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ThermostatsHeatResponse heat(ThermostatsHeatRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("thermostats/heat")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
        _requestBodyProperties.put("heating_set_point_celsius", request.getHeatingSetPointCelsius());
        _requestBodyProperties.put("heating_set_point_fahrenheit", request.getHeatingSetPointFahrenheit());
        _requestBodyProperties.put("sync", request.getSync());
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ThermostatsHeatResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ThermostatsListResponse list(ThermostatsListRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("thermostats/list")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("connected_account_id", request.getConnectedAccountId());
        _requestBodyProperties.put("connected_account_ids", request.getConnectedAccountIds());
        _requestBodyProperties.put("connect_webview_id", request.getConnectWebviewId());
        _requestBodyProperties.put("device_type", request.getDeviceType());
        _requestBodyProperties.put("device_types", request.getDeviceTypes());
        _requestBodyProperties.put("manufacturer", request.getManufacturer());
        _requestBodyProperties.put("device_ids", request.getDeviceIds());
        _requestBodyProperties.put("limit", request.getLimit());
        _requestBodyProperties.put("created_before", request.getCreatedBefore());
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ThermostatsListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ThermostatsUpdateResponse update(ThermostatsUpdateRequest request) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("thermostats/update")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
        _requestBodyProperties.put("default_climate_setting", request.getDefaultClimateSetting());
        RequestBody _requestBody;
        try {
            _requestBody = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
                    MediaType.parse("application/json"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("POST", _requestBody)
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ThermostatsUpdateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ClimateSettingSchedulesClient climateSettingSchedules() {
        return this.climateSettingSchedulesClient.get();
    }
}