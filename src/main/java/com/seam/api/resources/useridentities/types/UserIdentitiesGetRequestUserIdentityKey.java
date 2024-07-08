/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.useridentities.types;

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
@JsonDeserialize(builder = UserIdentitiesGetRequestUserIdentityKey.Builder.class)
public final class UserIdentitiesGetRequestUserIdentityKey {
    private final String userIdentityKey;

    private final Map<String, Object> additionalProperties;

    private UserIdentitiesGetRequestUserIdentityKey(String userIdentityKey, Map<String, Object> additionalProperties) {
        this.userIdentityKey = userIdentityKey;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("user_identity_key")
    public String getUserIdentityKey() {
        return userIdentityKey;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserIdentitiesGetRequestUserIdentityKey
                && equalTo((UserIdentitiesGetRequestUserIdentityKey) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserIdentitiesGetRequestUserIdentityKey other) {
        return userIdentityKey.equals(other.userIdentityKey);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.userIdentityKey);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdentityKeyStage builder() {
        return new Builder();
    }

    public interface UserIdentityKeyStage {
        _FinalStage userIdentityKey(String userIdentityKey);

        Builder from(UserIdentitiesGetRequestUserIdentityKey other);
    }

    public interface _FinalStage {
        UserIdentitiesGetRequestUserIdentityKey build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdentityKeyStage, _FinalStage {
        private String userIdentityKey;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UserIdentitiesGetRequestUserIdentityKey other) {
            userIdentityKey(other.getUserIdentityKey());
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_identity_key")
        public _FinalStage userIdentityKey(String userIdentityKey) {
            this.userIdentityKey = userIdentityKey;
            return this;
        }

        @java.lang.Override
        public UserIdentitiesGetRequestUserIdentityKey build() {
            return new UserIdentitiesGetRequestUserIdentityKey(userIdentityKey, additionalProperties);
        }
    }
}