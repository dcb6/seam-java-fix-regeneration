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
@JsonDeserialize(builder = DevicesGetResponse.Builder.class)
public final class DevicesGetResponse {
    private final Device device;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private DevicesGetResponse(Device device, boolean ok, Map<String, Object> additionalProperties) {
        this.device = device;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("device")
    public Device getDevice() {
        return device;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesGetResponse && equalTo((DevicesGetResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicesGetResponse other) {
        return device.equals(other.device) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.device, this.ok);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DeviceStage builder() {
        return new Builder();
    }

    public interface DeviceStage {
        OkStage device(Device device);

        Builder from(DevicesGetResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        DevicesGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceStage, OkStage, _FinalStage {
        private Device device;

        private boolean ok;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(DevicesGetResponse other) {
            device(other.getDevice());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("device")
        public OkStage device(Device device) {
            this.device = device;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public DevicesGetResponse build() {
            return new DevicesGetResponse(device, ok, additionalProperties);
        }
    }
}
