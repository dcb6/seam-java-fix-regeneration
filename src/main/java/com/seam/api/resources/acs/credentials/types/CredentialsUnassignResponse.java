/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.acs.credentials.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.AcsCredential;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = CredentialsUnassignResponse.Builder.class)
public final class CredentialsUnassignResponse {
    private final AcsCredential acsCredential;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private CredentialsUnassignResponse(
            AcsCredential acsCredential, boolean ok, Map<String, Object> additionalProperties) {
        this.acsCredential = acsCredential;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("acs_credential")
    public AcsCredential getAcsCredential() {
        return acsCredential;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CredentialsUnassignResponse && equalTo((CredentialsUnassignResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CredentialsUnassignResponse other) {
        return acsCredential.equals(other.acsCredential) && ok == other.ok;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.acsCredential, this.ok);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AcsCredentialStage builder() {
        return new Builder();
    }

    public interface AcsCredentialStage {
        OkStage acsCredential(AcsCredential acsCredential);

        Builder from(CredentialsUnassignResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        CredentialsUnassignResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AcsCredentialStage, OkStage, _FinalStage {
        private AcsCredential acsCredential;

        private boolean ok;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CredentialsUnassignResponse other) {
            acsCredential(other.getAcsCredential());
            ok(other.getOk());
            return this;
        }

        @java.lang.Override
        @JsonSetter("acs_credential")
        public OkStage acsCredential(AcsCredential acsCredential) {
            this.acsCredential = acsCredential;
            return this;
        }

        @java.lang.Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @java.lang.Override
        public CredentialsUnassignResponse build() {
            return new CredentialsUnassignResponse(acsCredential, ok, additionalProperties);
        }
    }
}
