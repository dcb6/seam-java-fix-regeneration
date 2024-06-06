/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.useridentities.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UserIdentitiesUpdateRequest.Builder.class)
public final class UserIdentitiesUpdateRequest {
    private final String userIdentityId;

    private final Optional<String> userIdentityKey;

    private final Optional<String> emailAddress;

    private final Optional<String> phoneNumber;

    private final Optional<String> fullName;

    private final Map<String, Object> additionalProperties;

    private UserIdentitiesUpdateRequest(
            String userIdentityId,
            Optional<String> userIdentityKey,
            Optional<String> emailAddress,
            Optional<String> phoneNumber,
            Optional<String> fullName,
            Map<String, Object> additionalProperties) {
        this.userIdentityId = userIdentityId;
        this.userIdentityKey = userIdentityKey;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("user_identity_id")
    public String getUserIdentityId() {
        return userIdentityId;
    }

    @JsonProperty("user_identity_key")
    public Optional<String> getUserIdentityKey() {
        return userIdentityKey;
    }

    @JsonProperty("email_address")
    public Optional<String> getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("phone_number")
    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("full_name")
    public Optional<String> getFullName() {
        return fullName;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserIdentitiesUpdateRequest && equalTo((UserIdentitiesUpdateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserIdentitiesUpdateRequest other) {
        return userIdentityId.equals(other.userIdentityId)
                && userIdentityKey.equals(other.userIdentityKey)
                && emailAddress.equals(other.emailAddress)
                && phoneNumber.equals(other.phoneNumber)
                && fullName.equals(other.fullName);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.userIdentityId, this.userIdentityKey, this.emailAddress, this.phoneNumber, this.fullName);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdentityIdStage builder() {
        return new Builder();
    }

    public interface UserIdentityIdStage {
        _FinalStage userIdentityId(String userIdentityId);

        Builder from(UserIdentitiesUpdateRequest other);
    }

    public interface _FinalStage {
        UserIdentitiesUpdateRequest build();

        _FinalStage userIdentityKey(Optional<String> userIdentityKey);

        _FinalStage userIdentityKey(String userIdentityKey);

        _FinalStage emailAddress(Optional<String> emailAddress);

        _FinalStage emailAddress(String emailAddress);

        _FinalStage phoneNumber(Optional<String> phoneNumber);

        _FinalStage phoneNumber(String phoneNumber);

        _FinalStage fullName(Optional<String> fullName);

        _FinalStage fullName(String fullName);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdentityIdStage, _FinalStage {
        private String userIdentityId;

        private Optional<String> fullName = Optional.empty();

        private Optional<String> phoneNumber = Optional.empty();

        private Optional<String> emailAddress = Optional.empty();

        private Optional<String> userIdentityKey = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UserIdentitiesUpdateRequest other) {
            userIdentityId(other.getUserIdentityId());
            userIdentityKey(other.getUserIdentityKey());
            emailAddress(other.getEmailAddress());
            phoneNumber(other.getPhoneNumber());
            fullName(other.getFullName());
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_identity_id")
        public _FinalStage userIdentityId(String userIdentityId) {
            this.userIdentityId = userIdentityId;
            return this;
        }

        @java.lang.Override
        public _FinalStage fullName(String fullName) {
            this.fullName = Optional.of(fullName);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "full_name", nulls = Nulls.SKIP)
        public _FinalStage fullName(Optional<String> fullName) {
            this.fullName = fullName;
            return this;
        }

        @java.lang.Override
        public _FinalStage phoneNumber(String phoneNumber) {
            this.phoneNumber = Optional.of(phoneNumber);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "phone_number", nulls = Nulls.SKIP)
        public _FinalStage phoneNumber(Optional<String> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @java.lang.Override
        public _FinalStage emailAddress(String emailAddress) {
            this.emailAddress = Optional.of(emailAddress);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "email_address", nulls = Nulls.SKIP)
        public _FinalStage emailAddress(Optional<String> emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        @java.lang.Override
        public _FinalStage userIdentityKey(String userIdentityKey) {
            this.userIdentityKey = Optional.of(userIdentityKey);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "user_identity_key", nulls = Nulls.SKIP)
        public _FinalStage userIdentityKey(Optional<String> userIdentityKey) {
            this.userIdentityKey = userIdentityKey;
            return this;
        }

        @java.lang.Override
        public UserIdentitiesUpdateRequest build() {
            return new UserIdentitiesUpdateRequest(
                    userIdentityId, userIdentityKey, emailAddress, phoneNumber, fullName, additionalProperties);
        }
    }
}
