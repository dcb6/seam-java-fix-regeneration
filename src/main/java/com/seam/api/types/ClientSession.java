package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = ClientSession.Builder.class)
public final class ClientSession {
    private final String clientSessionId;

    private final Optional<String> userIdentifierKey;

    private final OffsetDateTime createdAt;

    private final String token;

    private final double deviceCount;

    private final List<String> connectedAccountIds;

    private final List<String> connectWebviewIds;

    private final String workspaceId;

    private ClientSession(
            String clientSessionId,
            Optional<String> userIdentifierKey,
            OffsetDateTime createdAt,
            String token,
            double deviceCount,
            List<String> connectedAccountIds,
            List<String> connectWebviewIds,
            String workspaceId) {
        this.clientSessionId = clientSessionId;
        this.userIdentifierKey = userIdentifierKey;
        this.createdAt = createdAt;
        this.token = token;
        this.deviceCount = deviceCount;
        this.connectedAccountIds = connectedAccountIds;
        this.connectWebviewIds = connectWebviewIds;
        this.workspaceId = workspaceId;
    }

    @JsonProperty("client_session_id")
    public String getClientSessionId() {
        return clientSessionId;
    }

    @JsonProperty("user_identifier_key")
    public Optional<String> getUserIdentifierKey() {
        return userIdentifierKey;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("device_count")
    public double getDeviceCount() {
        return deviceCount;
    }

    @JsonProperty("connected_account_ids")
    public List<String> getConnectedAccountIds() {
        return connectedAccountIds;
    }

    @JsonProperty("connect_webview_ids")
    public List<String> getConnectWebviewIds() {
        return connectWebviewIds;
    }

    @JsonProperty("workspace_id")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientSession && equalTo((ClientSession) other);
    }

    private boolean equalTo(ClientSession other) {
        return clientSessionId.equals(other.clientSessionId)
                && userIdentifierKey.equals(other.userIdentifierKey)
                && createdAt.equals(other.createdAt)
                && token.equals(other.token)
                && deviceCount == other.deviceCount
                && connectedAccountIds.equals(other.connectedAccountIds)
                && connectWebviewIds.equals(other.connectWebviewIds)
                && workspaceId.equals(other.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.clientSessionId,
                this.userIdentifierKey,
                this.createdAt,
                this.token,
                this.deviceCount,
                this.connectedAccountIds,
                this.connectWebviewIds,
                this.workspaceId);
    }

    @Override
    public String toString() {
        return "ClientSession{" + "clientSessionId: " + clientSessionId + ", userIdentifierKey: " + userIdentifierKey
                + ", createdAt: " + createdAt + ", token: " + token + ", deviceCount: " + deviceCount
                + ", connectedAccountIds: " + connectedAccountIds + ", connectWebviewIds: " + connectWebviewIds
                + ", workspaceId: " + workspaceId + "}";
    }

    public static ClientSessionIdStage builder() {
        return new Builder();
    }

    public interface ClientSessionIdStage {
        CreatedAtStage clientSessionId(String clientSessionId);

        Builder from(ClientSession other);
    }

    public interface CreatedAtStage {
        TokenStage createdAt(OffsetDateTime createdAt);
    }

    public interface TokenStage {
        DeviceCountStage token(String token);
    }

    public interface DeviceCountStage {
        WorkspaceIdStage deviceCount(double deviceCount);
    }

    public interface WorkspaceIdStage {
        _FinalStage workspaceId(String workspaceId);
    }

    public interface _FinalStage {
        ClientSession build();

        _FinalStage userIdentifierKey(Optional<String> userIdentifierKey);

        _FinalStage userIdentifierKey(String userIdentifierKey);

        _FinalStage connectedAccountIds(List<String> connectedAccountIds);

        _FinalStage addConnectedAccountIds(String connectedAccountIds);

        _FinalStage addAllConnectedAccountIds(List<String> connectedAccountIds);

        _FinalStage connectWebviewIds(List<String> connectWebviewIds);

        _FinalStage addConnectWebviewIds(String connectWebviewIds);

        _FinalStage addAllConnectWebviewIds(List<String> connectWebviewIds);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements ClientSessionIdStage,
                    CreatedAtStage,
                    TokenStage,
                    DeviceCountStage,
                    WorkspaceIdStage,
                    _FinalStage {
        private String clientSessionId;

        private OffsetDateTime createdAt;

        private String token;

        private double deviceCount;

        private String workspaceId;

        private List<String> connectWebviewIds = new ArrayList<>();

        private List<String> connectedAccountIds = new ArrayList<>();

        private Optional<String> userIdentifierKey = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ClientSession other) {
            clientSessionId(other.getClientSessionId());
            userIdentifierKey(other.getUserIdentifierKey());
            createdAt(other.getCreatedAt());
            token(other.getToken());
            deviceCount(other.getDeviceCount());
            connectedAccountIds(other.getConnectedAccountIds());
            connectWebviewIds(other.getConnectWebviewIds());
            workspaceId(other.getWorkspaceId());
            return this;
        }

        @Override
        @JsonSetter("client_session_id")
        public CreatedAtStage clientSessionId(String clientSessionId) {
            this.clientSessionId = clientSessionId;
            return this;
        }

        @Override
        @JsonSetter("created_at")
        public TokenStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @Override
        @JsonSetter("token")
        public DeviceCountStage token(String token) {
            this.token = token;
            return this;
        }

        @Override
        @JsonSetter("device_count")
        public WorkspaceIdStage deviceCount(double deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }

        @Override
        @JsonSetter("workspace_id")
        public _FinalStage workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public _FinalStage addAllConnectWebviewIds(List<String> connectWebviewIds) {
            this.connectWebviewIds.addAll(connectWebviewIds);
            return this;
        }

        @Override
        public _FinalStage addConnectWebviewIds(String connectWebviewIds) {
            this.connectWebviewIds.add(connectWebviewIds);
            return this;
        }

        @Override
        @JsonSetter(value = "connect_webview_ids", nulls = Nulls.SKIP)
        public _FinalStage connectWebviewIds(List<String> connectWebviewIds) {
            this.connectWebviewIds.clear();
            this.connectWebviewIds.addAll(connectWebviewIds);
            return this;
        }

        @Override
        public _FinalStage addAllConnectedAccountIds(List<String> connectedAccountIds) {
            this.connectedAccountIds.addAll(connectedAccountIds);
            return this;
        }

        @Override
        public _FinalStage addConnectedAccountIds(String connectedAccountIds) {
            this.connectedAccountIds.add(connectedAccountIds);
            return this;
        }

        @Override
        @JsonSetter(value = "connected_account_ids", nulls = Nulls.SKIP)
        public _FinalStage connectedAccountIds(List<String> connectedAccountIds) {
            this.connectedAccountIds.clear();
            this.connectedAccountIds.addAll(connectedAccountIds);
            return this;
        }

        @Override
        public _FinalStage userIdentifierKey(String userIdentifierKey) {
            this.userIdentifierKey = Optional.of(userIdentifierKey);
            return this;
        }

        @Override
        @JsonSetter(value = "user_identifier_key", nulls = Nulls.SKIP)
        public _FinalStage userIdentifierKey(Optional<String> userIdentifierKey) {
            this.userIdentifierKey = userIdentifierKey;
            return this;
        }

        @Override
        public ClientSession build() {
            return new ClientSession(
                    clientSessionId,
                    userIdentifierKey,
                    createdAt,
                    token,
                    deviceCount,
                    connectedAccountIds,
                    connectWebviewIds,
                    workspaceId);
        }
    }
}
