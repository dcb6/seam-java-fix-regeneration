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
@JsonDeserialize(builder = PhonePropertiesAssaAbloyCredentialServiceMetadata.Builder.class)
public final class PhonePropertiesAssaAbloyCredentialServiceMetadata {
    private final boolean hasActiveEndpoint;

    private final List<PhonePropertiesAssaAbloyCredentialServiceMetadataEndpointsItem> endpoints;

    private final Map<String, Object> additionalProperties;

    private PhonePropertiesAssaAbloyCredentialServiceMetadata(
            boolean hasActiveEndpoint,
            List<PhonePropertiesAssaAbloyCredentialServiceMetadataEndpointsItem> endpoints,
            Map<String, Object> additionalProperties) {
        this.hasActiveEndpoint = hasActiveEndpoint;
        this.endpoints = endpoints;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("has_active_endpoint")
    public boolean getHasActiveEndpoint() {
        return hasActiveEndpoint;
    }

    @JsonProperty("endpoints")
    public List<PhonePropertiesAssaAbloyCredentialServiceMetadataEndpointsItem> getEndpoints() {
        return endpoints;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PhonePropertiesAssaAbloyCredentialServiceMetadata
                && equalTo((PhonePropertiesAssaAbloyCredentialServiceMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PhonePropertiesAssaAbloyCredentialServiceMetadata other) {
        return hasActiveEndpoint == other.hasActiveEndpoint && endpoints.equals(other.endpoints);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.hasActiveEndpoint, this.endpoints);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static HasActiveEndpointStage builder() {
        return new Builder();
    }

    public interface HasActiveEndpointStage {
        _FinalStage hasActiveEndpoint(boolean hasActiveEndpoint);

        Builder from(PhonePropertiesAssaAbloyCredentialServiceMetadata other);
    }

    public interface _FinalStage {
        PhonePropertiesAssaAbloyCredentialServiceMetadata build();

        _FinalStage endpoints(List<PhonePropertiesAssaAbloyCredentialServiceMetadataEndpointsItem> endpoints);

        _FinalStage addEndpoints(PhonePropertiesAssaAbloyCredentialServiceMetadataEndpointsItem endpoints);

        _FinalStage addAllEndpoints(List<PhonePropertiesAssaAbloyCredentialServiceMetadataEndpointsItem> endpoints);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements HasActiveEndpointStage, _FinalStage {
        private boolean hasActiveEndpoint;

        private List<PhonePropertiesAssaAbloyCredentialServiceMetadataEndpointsItem> endpoints = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PhonePropertiesAssaAbloyCredentialServiceMetadata other) {
            hasActiveEndpoint(other.getHasActiveEndpoint());
            endpoints(other.getEndpoints());
            return this;
        }

        @java.lang.Override
        @JsonSetter("has_active_endpoint")
        public _FinalStage hasActiveEndpoint(boolean hasActiveEndpoint) {
            this.hasActiveEndpoint = hasActiveEndpoint;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllEndpoints(
                List<PhonePropertiesAssaAbloyCredentialServiceMetadataEndpointsItem> endpoints) {
            this.endpoints.addAll(endpoints);
            return this;
        }

        @java.lang.Override
        public _FinalStage addEndpoints(PhonePropertiesAssaAbloyCredentialServiceMetadataEndpointsItem endpoints) {
            this.endpoints.add(endpoints);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "endpoints", nulls = Nulls.SKIP)
        public _FinalStage endpoints(List<PhonePropertiesAssaAbloyCredentialServiceMetadataEndpointsItem> endpoints) {
            this.endpoints.clear();
            this.endpoints.addAll(endpoints);
            return this;
        }

        @java.lang.Override
        public PhonePropertiesAssaAbloyCredentialServiceMetadata build() {
            return new PhonePropertiesAssaAbloyCredentialServiceMetadata(
                    hasActiveEndpoint, endpoints, additionalProperties);
        }
    }
}