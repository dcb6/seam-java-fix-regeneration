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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClientSessionsListResponse.Builder.class)
public final class ClientSessionsListResponse {
    private final List<ClientSession> clientSessions;

    private final boolean ok;

    private ClientSessionsListResponse(
            List<ClientSession> clientSessions, boolean ok, Map<String, Object> additionalProperties) {
        this.clientSessions = clientSessions;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("client_sessions")
    public List<ClientSession> getClientSessions() {
        return clientSessions;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientSessionsListResponse && equalTo((ClientSessionsListResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientSessionsListResponse other) {
        return clientSessions.equals(other.clientSessions) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.clientSessions, this.ok);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(ClientSessionsListResponse other);
    }

    public interface _FinalStage {
        ClientSessionsListResponse build();

        _FinalStage clientSessions(List<ClientSession> clientSessions);

        _FinalStage addClientSessions(ClientSession clientSessions);

        _FinalStage addAllClientSessions(List<ClientSession> clientSessions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<ClientSession> clientSessions = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ClientSessionsListResponse other) {
            clientSessions(other.getClientSessions());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public _FinalStage addAllClientSessions(List<ClientSession> clientSessions) {
            this.clientSessions.addAll(clientSessions);
            return this;
        }

        @Override
        public _FinalStage addClientSessions(ClientSession clientSessions) {
            this.clientSessions.add(clientSessions);
            return this;
        }

        @Override
        @JsonSetter(value = "client_sessions", nulls = Nulls.SKIP)
        public _FinalStage clientSessions(List<ClientSession> clientSessions) {
            this.clientSessions.clear();
            this.clientSessions.addAll(clientSessions);
            return this;
        }

        @Override
        public ClientSessionsListResponse build() {
            return new ClientSessionsListResponse(clientSessions, ok, additionalProperties);
        }
    }
}
