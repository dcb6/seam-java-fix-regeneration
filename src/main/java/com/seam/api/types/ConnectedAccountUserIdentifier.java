package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectedAccountUserIdentifier.Builder.class)
public final class ConnectedAccountUserIdentifier {
    private final Optional<String> username;

    private final Optional<String> apiUrl;

    private final Optional<String> email;

    private final Optional<String> phone;

    private final Optional<Boolean> exclusive;

    private ConnectedAccountUserIdentifier(
            Optional<String> username,
            Optional<String> apiUrl,
            Optional<String> email,
            Optional<String> phone,
            Optional<Boolean> exclusive) {
        this.username = username;
        this.apiUrl = apiUrl;
        this.email = email;
        this.phone = phone;
        this.exclusive = exclusive;
    }

    @JsonProperty("username")
    public Optional<String> getUsername() {
        return username;
    }

    @JsonProperty("api_url")
    public Optional<String> getApiUrl() {
        return apiUrl;
    }

    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    @JsonProperty("phone")
    public Optional<String> getPhone() {
        return phone;
    }

    @JsonProperty("exclusive")
    public Optional<Boolean> getExclusive() {
        return exclusive;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedAccountUserIdentifier && equalTo((ConnectedAccountUserIdentifier) other);
    }

    private boolean equalTo(ConnectedAccountUserIdentifier other) {
        return username.equals(other.username)
                && apiUrl.equals(other.apiUrl)
                && email.equals(other.email)
                && phone.equals(other.phone)
                && exclusive.equals(other.exclusive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.username, this.apiUrl, this.email, this.phone, this.exclusive);
    }

    @Override
    public String toString() {
        return "ConnectedAccountUserIdentifier{" + "username: " + username + ", apiUrl: " + apiUrl + ", email: " + email
                + ", phone: " + phone + ", exclusive: " + exclusive + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> username = Optional.empty();

        private Optional<String> apiUrl = Optional.empty();

        private Optional<String> email = Optional.empty();

        private Optional<String> phone = Optional.empty();

        private Optional<Boolean> exclusive = Optional.empty();

        private Builder() {}

        public Builder from(ConnectedAccountUserIdentifier other) {
            username(other.getUsername());
            apiUrl(other.getApiUrl());
            email(other.getEmail());
            phone(other.getPhone());
            exclusive(other.getExclusive());
            return this;
        }

        @JsonSetter(value = "username", nulls = Nulls.SKIP)
        public Builder username(Optional<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(String username) {
            this.username = Optional.of(username);
            return this;
        }

        @JsonSetter(value = "api_url", nulls = Nulls.SKIP)
        public Builder apiUrl(Optional<String> apiUrl) {
            this.apiUrl = apiUrl;
            return this;
        }

        public Builder apiUrl(String apiUrl) {
            this.apiUrl = Optional.of(apiUrl);
            return this;
        }

        @JsonSetter(value = "email", nulls = Nulls.SKIP)
        public Builder email(Optional<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(String email) {
            this.email = Optional.of(email);
            return this;
        }

        @JsonSetter(value = "phone", nulls = Nulls.SKIP)
        public Builder phone(Optional<String> phone) {
            this.phone = phone;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = Optional.of(phone);
            return this;
        }

        @JsonSetter(value = "exclusive", nulls = Nulls.SKIP)
        public Builder exclusive(Optional<Boolean> exclusive) {
            this.exclusive = exclusive;
            return this;
        }

        public Builder exclusive(Boolean exclusive) {
            this.exclusive = Optional.of(exclusive);
            return this;
        }

        public ConnectedAccountUserIdentifier build() {
            return new ConnectedAccountUserIdentifier(username, apiUrl, email, phone, exclusive);
        }
    }
}
