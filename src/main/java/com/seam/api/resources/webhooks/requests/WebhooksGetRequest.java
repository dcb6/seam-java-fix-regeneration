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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = WebhooksGetRequest.Builder.class)
public final class WebhooksGetRequest {
    private final String webhookId;

    private final Map<String, Object> additionalProperties;

    private WebhooksGetRequest(String webhookId, Map<String, Object> additionalProperties) {
        this.webhookId = webhookId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("webhook_id")
    public String getWebhookId() {
        return webhookId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WebhooksGetRequest && equalTo((WebhooksGetRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(WebhooksGetRequest other) {
        return webhookId.equals(other.webhookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.webhookId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static WebhookIdStage builder() {
        return new Builder();
    }

    public interface WebhookIdStage {
        _FinalStage webhookId(String webhookId);

        Builder from(WebhooksGetRequest other);
    }

    public interface _FinalStage {
        WebhooksGetRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements WebhookIdStage, _FinalStage {
        private String webhookId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(WebhooksGetRequest other) {
            webhookId(other.getWebhookId());
            return this;
        }

        @Override
        @JsonSetter("webhook_id")
        public _FinalStage webhookId(String webhookId) {
            this.webhookId = webhookId;
            return this;
        }

        @Override
        public WebhooksGetRequest build() {
            return new WebhooksGetRequest(webhookId, additionalProperties);
        }
    }
}
