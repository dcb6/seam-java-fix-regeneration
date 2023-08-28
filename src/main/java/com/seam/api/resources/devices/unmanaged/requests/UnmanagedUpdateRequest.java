package com.seam.api.resources.devices.unmanaged.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UnmanagedUpdateRequest.Builder.class)
public final class UnmanagedUpdateRequest {
    private final String deviceId;

    private final String isManaged;

    private UnmanagedUpdateRequest(String deviceId, String isManaged) {
        this.deviceId = deviceId;
        this.isManaged = isManaged;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("is_managed")
    public String getIsManaged() {
        return isManaged;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UnmanagedUpdateRequest && equalTo((UnmanagedUpdateRequest) other);
    }

    private boolean equalTo(UnmanagedUpdateRequest other) {
        return deviceId.equals(other.deviceId) && isManaged.equals(other.isManaged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.isManaged);
    }

    @Override
    public String toString() {
        return "UnmanagedUpdateRequest{" + "deviceId: " + deviceId + ", isManaged: " + isManaged + "}";
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        IsManagedStage deviceId(String deviceId);

        Builder from(UnmanagedUpdateRequest other);
    }

    public interface IsManagedStage {
        _FinalStage isManaged(String isManaged);
    }

    public interface _FinalStage {
        UnmanagedUpdateRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, IsManagedStage, _FinalStage {
        private String deviceId;

        private String isManaged;

        private Builder() {}

        @Override
        public Builder from(UnmanagedUpdateRequest other) {
            deviceId(other.getDeviceId());
            isManaged(other.getIsManaged());
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public IsManagedStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        @JsonSetter("is_managed")
        public _FinalStage isManaged(String isManaged) {
            this.isManaged = isManaged;
            return this;
        }

        @Override
        public UnmanagedUpdateRequest build() {
            return new UnmanagedUpdateRequest(deviceId, isManaged);
        }
    }
}