/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.thermostats.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ThermostatsGetRequest.Builder.class)
public final class ThermostatsGetRequest {
    private final Optional<String> deviceId;

    private final Optional<String> name;

    private ThermostatsGetRequest(
            Optional<String> deviceId, Optional<String> name, Map<String, Object> additionalProperties) {
        this.deviceId = deviceId;
        this.name = name;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("device_id")
    public Optional<String> getDeviceId() {
        return deviceId;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ThermostatsGetRequest && equalTo((ThermostatsGetRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ThermostatsGetRequest other) {
        return deviceId.equals(other.deviceId) && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.name);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> deviceId = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Builder() {}

        public Builder from(ThermostatsGetRequest other) {
            deviceId(other.getDeviceId());
            name(other.getName());
            return this;
        }

        @JsonSetter(value = "device_id", nulls = Nulls.SKIP)
        public Builder deviceId(Optional<String> deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public Builder deviceId(String deviceId) {
            this.deviceId = Optional.of(deviceId);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        public ThermostatsGetRequest build() {
            return new ThermostatsGetRequest(deviceId, name, additionalProperties);
        }
    }
}
