/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

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
@JsonDeserialize(builder = ConnectedAccountsGetRequestConnectedAccountId.Builder.class)
public final class ConnectedAccountsGetRequestConnectedAccountId {
    private final String connectedAccountId;

    private ConnectedAccountsGetRequestConnectedAccountId(
            String connectedAccountId, Map<String, Object> additionalProperties) {
        this.connectedAccountId = connectedAccountId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("connected_account_id")
    public String getConnectedAccountId() {
        return connectedAccountId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedAccountsGetRequestConnectedAccountId
                && equalTo((ConnectedAccountsGetRequestConnectedAccountId) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConnectedAccountsGetRequestConnectedAccountId other) {
        return connectedAccountId.equals(other.connectedAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.connectedAccountId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ConnectedAccountIdStage builder() {
        return new Builder();
    }

    public interface ConnectedAccountIdStage {
        _FinalStage connectedAccountId(String connectedAccountId);

        Builder from(ConnectedAccountsGetRequestConnectedAccountId other);
    }

    public interface _FinalStage {
        ConnectedAccountsGetRequestConnectedAccountId build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ConnectedAccountIdStage, _FinalStage {
        private String connectedAccountId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ConnectedAccountsGetRequestConnectedAccountId other) {
            connectedAccountId(other.getConnectedAccountId());
            return this;
        }

        @Override
        @JsonSetter("connected_account_id")
        public _FinalStage connectedAccountId(String connectedAccountId) {
            this.connectedAccountId = connectedAccountId;
            return this;
        }

        @Override
        public ConnectedAccountsGetRequestConnectedAccountId build() {
            return new ConnectedAccountsGetRequestConnectedAccountId(connectedAccountId, additionalProperties);
        }
    }
}
