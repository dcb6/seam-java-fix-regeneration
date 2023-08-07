package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ConnectWebviewsGetResponse.Builder.class)
public final class ConnectWebviewsGetResponse {
    private final ConnectWebview connectWebview;

    private final boolean ok;

    private ConnectWebviewsGetResponse(ConnectWebview connectWebview, boolean ok) {
        this.connectWebview = connectWebview;
        this.ok = ok;
    }

    @JsonProperty("connect_webview")
    public ConnectWebview getConnectWebview() {
        return connectWebview;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConnectWebviewsGetResponse && equalTo((ConnectWebviewsGetResponse) other);
    }

    private boolean equalTo(ConnectWebviewsGetResponse other) {
        return connectWebview.equals(other.connectWebview) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.connectWebview, this.ok);
    }

    @Override
    public String toString() {
        return "ConnectWebviewsGetResponse{" + "connectWebview: " + connectWebview + ", ok: " + ok + "}";
    }

    public static ConnectWebviewStage builder() {
        return new Builder();
    }

    public interface ConnectWebviewStage {
        OkStage connectWebview(ConnectWebview connectWebview);

        Builder from(ConnectWebviewsGetResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        ConnectWebviewsGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ConnectWebviewStage, OkStage, _FinalStage {
        private ConnectWebview connectWebview;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(ConnectWebviewsGetResponse other) {
            connectWebview(other.getConnectWebview());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("connect_webview")
        public OkStage connectWebview(ConnectWebview connectWebview) {
            this.connectWebview = connectWebview;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public ConnectWebviewsGetResponse build() {
            return new ConnectWebviewsGetResponse(connectWebview, ok);
        }
    }
}
