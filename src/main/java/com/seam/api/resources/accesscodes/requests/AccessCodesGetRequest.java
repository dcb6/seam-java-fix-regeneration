package com.seam.api.resources.accesscodes.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = AccessCodesGetRequest.Builder.class)
public final class AccessCodesGetRequest {
    private final Optional<String> deviceId;

    private final Optional<String> accessCodeId;

    private final Optional<String> code;

    private AccessCodesGetRequest(Optional<String> deviceId, Optional<String> accessCodeId, Optional<String> code) {
        this.deviceId = deviceId;
        this.accessCodeId = accessCodeId;
        this.code = code;
    }

    @JsonProperty("device_id")
    public Optional<String> getDeviceId() {
        return deviceId;
    }

    @JsonProperty("access_code_id")
    public Optional<String> getAccessCodeId() {
        return accessCodeId;
    }

    @JsonProperty("code")
    public Optional<String> getCode() {
        return code;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesGetRequest && equalTo((AccessCodesGetRequest) other);
    }

    private boolean equalTo(AccessCodesGetRequest other) {
        return deviceId.equals(other.deviceId) && accessCodeId.equals(other.accessCodeId) && code.equals(other.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceId, this.accessCodeId, this.code);
    }

    @Override
    public String toString() {
        return "AccessCodesGetRequest{" + "deviceId: " + deviceId + ", accessCodeId: " + accessCodeId + ", code: "
                + code + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> deviceId = Optional.empty();

        private Optional<String> accessCodeId = Optional.empty();

        private Optional<String> code = Optional.empty();

        private Builder() {}

        public Builder from(AccessCodesGetRequest other) {
            deviceId(other.getDeviceId());
            accessCodeId(other.getAccessCodeId());
            code(other.getCode());
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

        @JsonSetter(value = "access_code_id", nulls = Nulls.SKIP)
        public Builder accessCodeId(Optional<String> accessCodeId) {
            this.accessCodeId = accessCodeId;
            return this;
        }

        public Builder accessCodeId(String accessCodeId) {
            this.accessCodeId = Optional.of(accessCodeId);
            return this;
        }

        @JsonSetter(value = "code", nulls = Nulls.SKIP)
        public Builder code(Optional<String> code) {
            this.code = code;
            return this;
        }

        public Builder code(String code) {
            this.code = Optional.of(code);
            return this;
        }

        public AccessCodesGetRequest build() {
            return new AccessCodesGetRequest(deviceId, accessCodeId, code);
        }
    }
}