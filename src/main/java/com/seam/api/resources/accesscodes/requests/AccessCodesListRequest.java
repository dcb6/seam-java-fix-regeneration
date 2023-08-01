package com.seam.api.resources.accesscodes.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = AccessCodesListRequest.Builder.class)
public final class AccessCodesListRequest {
    private final String deviceId;

    private final Optional<List<String>> accessCodeIds;

    private AccessCodesListRequest(String deviceId, Optional<List<String>> accessCodeIds) {
        this.deviceId = deviceId;
        this.accessCodeIds = accessCodeIds;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("access_code_ids")
    public Optional<List<String>> getAccessCodeIds() {
        return accessCodeIds;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesListRequest && equalTo((AccessCodesListRequest) other);
    }

    private boolean equalTo(AccessCodesListRequest other) {
        return deviceId.equals(other.deviceId) && accessCodeIds.equals(other.accessCodeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.accessCodeIds);
    }

    @Override
    public String toString() {
        return "AccessCodesListRequest{" + "deviceId: " + deviceId + ", accessCodeIds: " + accessCodeIds + "}";
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        _FinalStage deviceId(String deviceId);

        Builder from(AccessCodesListRequest other);
    }

    public interface _FinalStage {
        AccessCodesListRequest build();

        _FinalStage accessCodeIds(Optional<List<String>> accessCodeIds);

        _FinalStage accessCodeIds(List<String> accessCodeIds);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, _FinalStage {
        private String deviceId;

        private Optional<List<String>> accessCodeIds = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AccessCodesListRequest other) {
            deviceId(other.getDeviceId());
            accessCodeIds(other.getAccessCodeIds());
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public _FinalStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public _FinalStage accessCodeIds(List<String> accessCodeIds) {
            this.accessCodeIds = Optional.of(accessCodeIds);
            return this;
        }

        @Override
        @JsonSetter(value = "access_code_ids", nulls = Nulls.SKIP)
        public _FinalStage accessCodeIds(Optional<List<String>> accessCodeIds) {
            this.accessCodeIds = accessCodeIds;
            return this;
        }

        @Override
        public AccessCodesListRequest build() {
            return new AccessCodesListRequest(deviceId, accessCodeIds);
        }
    }
}