package com.seam.api.resources.devices;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.ObjectMappers;
import com.seam.api.core.RequestOptions;
import com.seam.api.core.Suppliers;
import com.seam.api.resources.devices.requests.DevicesDeleteRequest;
import com.seam.api.resources.devices.requests.DevicesGetRequest;
import com.seam.api.resources.devices.requests.DevicesListDeviceProvidersRequest;
import com.seam.api.resources.devices.requests.DevicesListRequest;
import com.seam.api.resources.devices.requests.DevicesUpdateRequest;
import com.seam.api.resources.devices.unmanaged.UnmanagedClient;
import com.seam.api.types.DevicesDeleteResponse;
import com.seam.api.types.DevicesGetResponse;
import com.seam.api.types.DevicesListDeviceProvidersResponse;
import com.seam.api.types.DevicesListResponse;
import com.seam.api.types.DevicesUpdateResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class DevicesClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<UnmanagedClient> unmanagedClient;

    public DevicesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.unmanagedClient = Suppliers.memoize(() -> new UnmanagedClient(clientOptions));
    }

    public DevicesDeleteResponse delete(DevicesDeleteRequest request) {
        return delete(request, null);
    }

    public DevicesDeleteResponse delete(DevicesDeleteRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("devices/delete")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
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
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), DevicesDeleteResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DevicesGetResponse get(DevicesGetRequest request) {
        return get(request, null);
    }

    public DevicesGetResponse get(DevicesGetRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("devices/get")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getDeviceId().isPresent()) {
            _requestBodyProperties.put("device_id", request.getDeviceId());
        }
        if (request.getName().isPresent()) {
            _requestBodyProperties.put("name", request.getName());
        }
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
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), DevicesGetResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DevicesListResponse list(DevicesListRequest request) {
        return list(request, null);
    }

    public DevicesListResponse list(DevicesListRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("devices/list")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getConnectedAccountId().isPresent()) {
            _requestBodyProperties.put("connected_account_id", request.getConnectedAccountId());
        }
        if (request.getConnectedAccountIds().isPresent()) {
            _requestBodyProperties.put("connected_account_ids", request.getConnectedAccountIds());
        }
        if (request.getConnectWebviewId().isPresent()) {
            _requestBodyProperties.put("connect_webview_id", request.getConnectWebviewId());
        }
        if (request.getDeviceType().isPresent()) {
            _requestBodyProperties.put("device_type", request.getDeviceType());
        }
        if (request.getDeviceTypes().isPresent()) {
            _requestBodyProperties.put("device_types", request.getDeviceTypes());
        }
        if (request.getManufacturer().isPresent()) {
            _requestBodyProperties.put("manufacturer", request.getManufacturer());
        }
        if (request.getDeviceIds().isPresent()) {
            _requestBodyProperties.put("device_ids", request.getDeviceIds());
        }
        if (request.getLimit().isPresent()) {
            _requestBodyProperties.put("limit", request.getLimit());
        }
        if (request.getCreatedBefore().isPresent()) {
            _requestBodyProperties.put("created_before", request.getCreatedBefore());
        }
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
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), DevicesListResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DevicesListDeviceProvidersResponse listDeviceProviders(DevicesListDeviceProvidersRequest request) {
        return listDeviceProviders(request, null);
    }

    public DevicesListDeviceProvidersResponse listDeviceProviders(
            DevicesListDeviceProvidersRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("devices/list_device_providers")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        if (request.getProviderCategory().isPresent()) {
            _requestBodyProperties.put("provider_category", request.getProviderCategory());
        }
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
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        _response.body().string(), DevicesListDeviceProvidersResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DevicesUpdateResponse update(DevicesUpdateRequest request) {
        return update(request, null);
    }

    public DevicesUpdateResponse update(DevicesUpdateRequest request, RequestOptions requestOptions) {
        HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("devices/update")
                .build();
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("device_id", request.getDeviceId());
        if (request.getProperties().isPresent()) {
            _requestBodyProperties.put("properties", request.getProperties());
        }
        if (request.getName().isPresent()) {
            _requestBodyProperties.put("name", request.getName());
        }
        if (request.getLocation().isPresent()) {
            _requestBodyProperties.put("location", request.getLocation());
        }
        if (request.getIsManaged().isPresent()) {
            _requestBodyProperties.put("is_managed", request.getIsManaged());
        }
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
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), DevicesUpdateResponse.class);
            }
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public UnmanagedClient unmanaged() {
        return this.unmanagedClient.get();
    }
}
