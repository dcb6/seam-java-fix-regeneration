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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UserIdentity.Builder.class)
public final class UserIdentity {
    private final String userIdentityId;

    private final Optional<String> userIdentityKey;

    private final Optional<String> emailAddress;

    private final Optional<String> phoneNumber;

    private final String displayName;

    private final Optional<String> fullName;

    private final OffsetDateTime createdAt;

    private final String workspaceId;

    private final Map<String, Object> additionalProperties;

    private UserIdentity(
            String userIdentityId,
            Optional<String> userIdentityKey,
            Optional<String> emailAddress,
            Optional<String> phoneNumber,
            String displayName,
            Optional<String> fullName,
            OffsetDateTime createdAt,
            String workspaceId,
            Map<String, Object> additionalProperties) {
        this.userIdentityId = userIdentityId;
        this.userIdentityKey = userIdentityKey;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.displayName = displayName;
        this.fullName = fullName;
        this.createdAt = createdAt;
        this.workspaceId = workspaceId;
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

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("full_name")
    public Optional<String> getFullName() {
        return fullName;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("workspace_id")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserIdentity && equalTo((UserIdentity) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserIdentity other) {
        return userIdentityId.equals(other.userIdentityId)
                && userIdentityKey.equals(other.userIdentityKey)
                && emailAddress.equals(other.emailAddress)
                && phoneNumber.equals(other.phoneNumber)
                && displayName.equals(other.displayName)
                && fullName.equals(other.fullName)
                && createdAt.equals(other.createdAt)
                && workspaceId.equals(other.workspaceId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.userIdentityId,
                this.userIdentityKey,
                this.emailAddress,
                this.phoneNumber,
                this.displayName,
                this.fullName,
                this.createdAt,
                this.workspaceId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdentityIdStage builder() {
        return new Builder();
    }

    public interface UserIdentityIdStage {
        DisplayNameStage userIdentityId(String userIdentityId);

        Builder from(UserIdentity other);
    }

    public interface DisplayNameStage {
        CreatedAtStage displayName(String displayName);
    }

    public interface CreatedAtStage {
        WorkspaceIdStage createdAt(OffsetDateTime createdAt);
    }

    public interface WorkspaceIdStage {
        _FinalStage workspaceId(String workspaceId);
    }

    public interface _FinalStage {
        UserIdentity build();

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
    public static final class Builder
            implements UserIdentityIdStage, DisplayNameStage, CreatedAtStage, WorkspaceIdStage, _FinalStage {
        private String userIdentityId;

        private String displayName;

        private OffsetDateTime createdAt;

        private String workspaceId;

        private Optional<String> fullName = Optional.empty();

        private Optional<String> phoneNumber = Optional.empty();

        private Optional<String> emailAddress = Optional.empty();

        private Optional<String> userIdentityKey = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UserIdentity other) {
            userIdentityId(other.getUserIdentityId());
            userIdentityKey(other.getUserIdentityKey());
            emailAddress(other.getEmailAddress());
            phoneNumber(other.getPhoneNumber());
            displayName(other.getDisplayName());
            fullName(other.getFullName());
            createdAt(other.getCreatedAt());
            workspaceId(other.getWorkspaceId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_identity_id")
        public DisplayNameStage userIdentityId(String userIdentityId) {
            this.userIdentityId = userIdentityId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("display_name")
        public CreatedAtStage displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        @java.lang.Override
        @JsonSetter("created_at")
        public WorkspaceIdStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("workspace_id")
        public _FinalStage workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
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
        public UserIdentity build() {
            return new UserIdentity(
                    userIdentityId,
                    userIdentityKey,
                    emailAddress,
                    phoneNumber,
                    displayName,
                    fullName,
                    createdAt,
                    workspaceId,
                    additionalProperties);
        }
    }
}