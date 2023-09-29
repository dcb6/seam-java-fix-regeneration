/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectedAccountsGetRequestEmail.Builder.class)
public final class ConnectedAccountsGetRequestEmail {
    private final String email;

    private ConnectedAccountsGetRequestEmail(String email) {
        this.email = email;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectedAccountsGetRequestEmail && equalTo((ConnectedAccountsGetRequestEmail) other);
    }

    private boolean equalTo(ConnectedAccountsGetRequestEmail other) {
        return email.equals(other.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EmailStage builder() {
        return new Builder();
    }

    public interface EmailStage {
        _FinalStage email(String email);

        Builder from(ConnectedAccountsGetRequestEmail other);
    }

    public interface _FinalStage {
        ConnectedAccountsGetRequestEmail build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements EmailStage, _FinalStage {
        private String email;

        private Builder() {}

        @Override
        public Builder from(ConnectedAccountsGetRequestEmail other) {
            email(other.getEmail());
            return this;
        }

        @Override
        @JsonSetter("email")
        public _FinalStage email(String email) {
            this.email = email;
            return this;
        }

        @Override
        public ConnectedAccountsGetRequestEmail build() {
            return new ConnectedAccountsGetRequestEmail(email);
        }
    }
}
