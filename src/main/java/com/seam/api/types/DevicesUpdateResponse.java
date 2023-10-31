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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DevicesUpdateResponse.Builder.class)
public final class DevicesUpdateResponse {
    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private DevicesUpdateResponse(boolean ok, Map<String, Object> additionalProperties) {
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesUpdateResponse && equalTo((DevicesUpdateResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicesUpdateResponse other) {
        return ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ok);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(DevicesUpdateResponse other);
    }

    public interface _FinalStage {
        DevicesUpdateResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(DevicesUpdateResponse other) {
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public DevicesUpdateResponse build() {
            return new DevicesUpdateResponse(ok, additionalProperties);
        }
    }
}
