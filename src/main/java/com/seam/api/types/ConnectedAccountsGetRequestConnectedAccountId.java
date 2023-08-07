package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectedAccountsGetRequestConnectedAccountId.Builder.class)
public final class ConnectedAccountsGetRequestConnectedAccountId {
    private final String connectedAccountId;

    private ConnectedAccountsGetRequestConnectedAccountId(String connectedAccountId) {
        this.connectedAccountId = connectedAccountId;
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

    private boolean equalTo(ConnectedAccountsGetRequestConnectedAccountId other) {
        return connectedAccountId.equals(other.connectedAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.connectedAccountId);
    }

    @Override
    public String toString() {
        return "ConnectedAccountsGetRequestConnectedAccountId{" + "connectedAccountId: " + connectedAccountId + "}";
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
            return new ConnectedAccountsGetRequestConnectedAccountId(connectedAccountId);
        }
    }
}