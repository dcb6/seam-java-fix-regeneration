/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.webhooks.requests;

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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = WebhooksCreateRequest.Builder.class)
public final class WebhooksCreateRequest {
    private final String url;

    private final Optional<List<String>> eventTypes;

    private final Map<String, Object> additionalProperties;

    private WebhooksCreateRequest(
            String url, Optional<List<String>> eventTypes, Map<String, Object> additionalProperties) {
        this.url = url;
        this.eventTypes = eventTypes;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("event_types")
    public Optional<List<String>> getEventTypes() {
        return eventTypes;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WebhooksCreateRequest && equalTo((WebhooksCreateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(WebhooksCreateRequest other) {
        return url.equals(other.url) && eventTypes.equals(other.eventTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.url, this.eventTypes);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UrlStage builder() {
        return new Builder();
    }

    public interface UrlStage {
        _FinalStage url(String url);

        Builder from(WebhooksCreateRequest other);
    }

    public interface _FinalStage {
        WebhooksCreateRequest build();

        _FinalStage eventTypes(Optional<List<String>> eventTypes);

        _FinalStage eventTypes(List<String> eventTypes);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UrlStage, _FinalStage {
        private String url;

        private Optional<List<String>> eventTypes = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(WebhooksCreateRequest other) {
            url(other.getUrl());
            eventTypes(other.getEventTypes());
            return this;
        }

        @Override
        @JsonSetter("url")
        public _FinalStage url(String url) {
            this.url = url;
            return this;
        }

        @Override
        public _FinalStage eventTypes(List<String> eventTypes) {
            this.eventTypes = Optional.of(eventTypes);
            return this;
        }

        @Override
        @JsonSetter(value = "event_types", nulls = Nulls.SKIP)
        public _FinalStage eventTypes(Optional<List<String>> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }

        @Override
        public WebhooksCreateRequest build() {
            return new WebhooksCreateRequest(url, eventTypes, additionalProperties);
        }
    }
}
