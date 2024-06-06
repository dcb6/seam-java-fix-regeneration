/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.networks.requests;

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
@JsonDeserialize(builder = NetworksGetRequest.Builder.class)
public final class NetworksGetRequest {
    private final String networkId;

    private final Map<String, Object> additionalProperties;

    private NetworksGetRequest(String networkId, Map<String, Object> additionalProperties) {
        this.networkId = networkId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("network_id")
    public String getNetworkId() {
        return networkId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NetworksGetRequest && equalTo((NetworksGetRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NetworksGetRequest other) {
        return networkId.equals(other.networkId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.networkId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NetworkIdStage builder() {
        return new Builder();
    }

    public interface NetworkIdStage {
        _FinalStage networkId(String networkId);

        Builder from(NetworksGetRequest other);
    }

    public interface _FinalStage {
        NetworksGetRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NetworkIdStage, _FinalStage {
        private String networkId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(NetworksGetRequest other) {
            networkId(other.getNetworkId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("network_id")
        public _FinalStage networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }

        @java.lang.Override
        public NetworksGetRequest build() {
            return new NetworksGetRequest(networkId, additionalProperties);
        }
    }
}