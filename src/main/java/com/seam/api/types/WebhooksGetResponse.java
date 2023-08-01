package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = WebhooksGetResponse.Builder.class)
public final class WebhooksGetResponse {
    private final Webhook webhook;

    private final boolean ok;

    private WebhooksGetResponse(Webhook webhook, boolean ok) {
        this.webhook = webhook;
        this.ok = ok;
    }

    @JsonProperty("webhook")
    public Webhook getWebhook() {
        return webhook;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof WebhooksGetResponse && equalTo((WebhooksGetResponse) other);
    }

    private boolean equalTo(WebhooksGetResponse other) {
        return webhook.equals(other.webhook) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.webhook, this.ok);
    }

    @Override
    public String toString() {
        return "WebhooksGetResponse{" + "webhook: " + webhook + ", ok: " + ok + "}";
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

        private Builder() {}

        @Override
        public Builder from(WebhooksGetResponse other) {
            webhook(other.getWebhook());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("webhook")
        public OkStage webhook(Webhook webhook) {
            this.webhook = webhook;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public WebhooksGetResponse build() {
            return new WebhooksGetResponse(webhook, ok);
        }
    }
}