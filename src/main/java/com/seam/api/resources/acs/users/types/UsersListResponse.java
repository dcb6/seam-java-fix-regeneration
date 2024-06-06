/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.acs.users.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.AcsUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UsersListResponse.Builder.class)
public final class UsersListResponse {
    private final List<AcsUser> acsUsers;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private UsersListResponse(List<AcsUser> acsUsers, boolean ok, Map<String, Object> additionalProperties) {
        this.acsUsers = acsUsers;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("acs_users")
    public List<AcsUser> getAcsUsers() {
        return acsUsers;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UsersListResponse && equalTo((UsersListResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UsersListResponse other) {
        return acsUsers.equals(other.acsUsers) && ok == other.ok;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.acsUsers, this.ok);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(UsersListResponse other);
    }

    public interface _FinalStage {
        UsersListResponse build();

        _FinalStage acsUsers(List<AcsUser> acsUsers);

        _FinalStage addAcsUsers(AcsUser acsUsers);

        _FinalStage addAllAcsUsers(List<AcsUser> acsUsers);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<AcsUser> acsUsers = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UsersListResponse other) {
            acsUsers(other.getAcsUsers());
            ok(other.getOk());
            return this;
        }

        @java.lang.Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllAcsUsers(List<AcsUser> acsUsers) {
            this.acsUsers.addAll(acsUsers);
            return this;
        }

        @java.lang.Override
        public _FinalStage addAcsUsers(AcsUser acsUsers) {
            this.acsUsers.add(acsUsers);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "acs_users", nulls = Nulls.SKIP)
        public _FinalStage acsUsers(List<AcsUser> acsUsers) {
            this.acsUsers.clear();
            this.acsUsers.addAll(acsUsers);
            return this;
        }

        @java.lang.Override
        public UsersListResponse build() {
            return new UsersListResponse(acsUsers, ok, additionalProperties);
        }
    }
}
