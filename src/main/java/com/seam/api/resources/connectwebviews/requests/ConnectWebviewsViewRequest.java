/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.connectwebviews.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectWebviewsViewRequest.Builder.class)
public final class ConnectWebviewsViewRequest {
    private final String connectWebviewId;

    private final String authToken;

    private final Map<String, Object> additionalProperties;

    private ConnectWebviewsViewRequest(
            String connectWebviewId, String authToken, Map<String, Object> additionalProperties) {
        this.connectWebviewId = connectWebviewId;
        this.authToken = authToken;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("connect_webview_id")
    public String getConnectWebviewId() {
        return connectWebviewId;
    }

    @JsonProperty("auth_token")
    public String getAuthToken() {
        return authToken;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectWebviewsViewRequest && equalTo((ConnectWebviewsViewRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConnectWebviewsViewRequest other) {
        return connectWebviewId.equals(other.connectWebviewId) && authToken.equals(other.authToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.connectWebviewId, this.authToken);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ConnectWebviewIdStage builder() {
        return new Builder();
    }

    public interface ConnectWebviewIdStage {
        AuthTokenStage connectWebviewId(String connectWebviewId);

        Builder from(ConnectWebviewsViewRequest other);
    }

    public interface AuthTokenStage {
        _FinalStage authToken(String authToken);
    }

    public interface _FinalStage {
        ConnectWebviewsViewRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ConnectWebviewIdStage, AuthTokenStage, _FinalStage {
        private String connectWebviewId;

        private String authToken;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ConnectWebviewsViewRequest other) {
            connectWebviewId(other.getConnectWebviewId());
            authToken(other.getAuthToken());
            return this;
        }

        @Override
        @JsonSetter("connect_webview_id")
        public AuthTokenStage connectWebviewId(String connectWebviewId) {
            this.connectWebviewId = connectWebviewId;
            return this;
        }

        @Override
        @JsonSetter("auth_token")
        public _FinalStage authToken(String authToken) {
            this.authToken = authToken;
            return this;
        }

        @Override
        public ConnectWebviewsViewRequest build() {
            return new ConnectWebviewsViewRequest(connectWebviewId, authToken, additionalProperties);
        }
    }
}