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
@JsonDeserialize(builder = DevicePropertiesHubitatMetadata.Builder.class)
public final class DevicePropertiesHubitatMetadata {
    private final String deviceId;

    private final String deviceName;

    private final String deviceLabel;

    private final Map<String, Object> additionalProperties;

    private DevicePropertiesHubitatMetadata(
            String deviceId, String deviceName, String deviceLabel, Map<String, Object> additionalProperties) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.deviceLabel = deviceLabel;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("device_name")
    public String getDeviceName() {
        return deviceName;
    }

    @JsonProperty("device_label")
    public String getDeviceLabel() {
        return deviceLabel;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesHubitatMetadata && equalTo((DevicePropertiesHubitatMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicePropertiesHubitatMetadata other) {
        return deviceId.equals(other.deviceId)
                && deviceName.equals(other.deviceName)
                && deviceLabel.equals(other.deviceLabel);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.deviceName, this.deviceLabel);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        DeviceNameStage deviceId(String deviceId);

        Builder from(DevicePropertiesHubitatMetadata other);
    }

    public interface DeviceNameStage {
        DeviceLabelStage deviceName(String deviceName);
    }

    public interface DeviceLabelStage {
        _FinalStage deviceLabel(String deviceLabel);
    }

    public interface _FinalStage {
        DevicePropertiesHubitatMetadata build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, DeviceNameStage, DeviceLabelStage, _FinalStage {
        private String deviceId;

        private String deviceName;

        private String deviceLabel;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DevicePropertiesHubitatMetadata other) {
            deviceId(other.getDeviceId());
            deviceName(other.getDeviceName());
            deviceLabel(other.getDeviceLabel());
            return this;
        }

        @java.lang.Override
        @JsonSetter("device_id")
        public DeviceNameStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("device_name")
        public DeviceLabelStage deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        @java.lang.Override
        @JsonSetter("device_label")
        public _FinalStage deviceLabel(String deviceLabel) {
            this.deviceLabel = deviceLabel;
            return this;
        }

        @java.lang.Override
        public DevicePropertiesHubitatMetadata build() {
            return new DevicePropertiesHubitatMetadata(deviceId, deviceName, deviceLabel, additionalProperties);
        }
    }
}