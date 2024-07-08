/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.webhooks.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import com.seam.api.types.Webhook;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = WebhooksGetResponse.Builder.class)
public final class WebhooksGetResponse {
    private final Webhook webhook;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private WebhooksGetResponse(Webhook webhook, boolean ok, Map<String, Object> additionalProperties) {
        this.webhook = webhook;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("webhook")
    public Webhook getWebhook() {
        return webhook;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WebhooksGetResponse && equalTo((WebhooksGetResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(WebhooksGetResponse other) {
        return webhook.equals(other.webhook) && ok == other.ok;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.webhook, this.ok);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static WebhookStage builder() {
        return new Builder();
    }

    public interface WebhookStage {
        OkStage webhook(Webhook webhook);

        Builder from(WebhooksGetResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        WebhooksGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements WebhookStage, OkStage, _FinalStage {
        private Webhook webhook;

        private boolean ok;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(WebhooksGetResponse other) {
            webhook(other.getWebhook());
            ok(other.getOk());
            return this;
        }

        @java.lang.Override
        @JsonSetter("webhook")
        public OkStage webhook(Webhook webhook) {
            this.webhook = webhook;
            return this;
        }

        @java.lang.Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @java.lang.Override
        public WebhooksGetResponse build() {
            return new WebhooksGetResponse(webhook, ok, additionalProperties);
        }
    }
}