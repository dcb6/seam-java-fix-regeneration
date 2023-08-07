package com.seam.api.resources.accesscodes.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.types.AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AccessCodesCreateMultipleRequest.Builder.class)
public final class AccessCodesCreateMultipleRequest {
    private final List<String> deviceIds;

    private final Optional<AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared>
            behaviorWhenCodeCannotBeShared;

    private final Optional<String> name;

    private final Optional<String> startsAt;

    private final Optional<String> endsAt;

    private final Optional<String> code;

    private final Optional<Boolean> attemptForOfflineDevice;

    private final Optional<Boolean> preferNativeScheduling;

    private final Optional<Boolean> useBackupAccessCodePool;

    private AccessCodesCreateMultipleRequest(
            List<String> deviceIds,
            Optional<AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared> behaviorWhenCodeCannotBeShared,
            Optional<String> name,
            Optional<String> startsAt,
            Optional<String> endsAt,
            Optional<String> code,
            Optional<Boolean> attemptForOfflineDevice,
            Optional<Boolean> preferNativeScheduling,
            Optional<Boolean> useBackupAccessCodePool) {
        this.deviceIds = deviceIds;
        this.behaviorWhenCodeCannotBeShared = behaviorWhenCodeCannotBeShared;
        this.name = name;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.code = code;
        this.attemptForOfflineDevice = attemptForOfflineDevice;
        this.preferNativeScheduling = preferNativeScheduling;
        this.useBackupAccessCodePool = useBackupAccessCodePool;
    }

    @JsonProperty("device_ids")
    public List<String> getDeviceIds() {
        return deviceIds;
    }

    @JsonProperty("behavior_when_code_cannot_be_shared")
    public Optional<AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared>
            getBehaviorWhenCodeCannotBeShared() {
        return behaviorWhenCodeCannotBeShared;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("starts_at")
    public Optional<String> getStartsAt() {
        return startsAt;
    }

    @JsonProperty("ends_at")
    public Optional<String> getEndsAt() {
        return endsAt;
    }

    /**
     * @return &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 8 characters</code>&lt;/span&gt;
     */
    @JsonProperty("code")
    public Optional<String> getCode() {
        return code;
    }

    @JsonProperty("attempt_for_offline_device")
    public Optional<Boolean> getAttemptForOfflineDevice() {
        return attemptForOfflineDevice;
    }

    @JsonProperty("prefer_native_scheduling")
    public Optional<Boolean> getPreferNativeScheduling() {
        return preferNativeScheduling;
    }

    @JsonProperty("use_backup_access_code_pool")
    public Optional<Boolean> getUseBackupAccessCodePool() {
        return useBackupAccessCodePool;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesCreateMultipleRequest && equalTo((AccessCodesCreateMultipleRequest) other);
    }

    private boolean equalTo(AccessCodesCreateMultipleRequest other) {
        return deviceIds.equals(other.deviceIds)
                && behaviorWhenCodeCannotBeShared.equals(other.behaviorWhenCodeCannotBeShared)
                && name.equals(other.name)
                && startsAt.equals(other.startsAt)
                && endsAt.equals(other.endsAt)
                && code.equals(other.code)
                && attemptForOfflineDevice.equals(other.attemptForOfflineDevice)
                && preferNativeScheduling.equals(other.preferNativeScheduling)
                && useBackupAccessCodePool.equals(other.useBackupAccessCodePool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.deviceIds,
                this.behaviorWhenCodeCannotBeShared,
                this.name,
                this.startsAt,
                this.endsAt,
                this.code,
                this.attemptForOfflineDevice,
                this.preferNativeScheduling,
                this.useBackupAccessCodePool);
    }

    @Override
    public String toString() {
        return "AccessCodesCreateMultipleRequest{" + "deviceIds: " + deviceIds + ", behaviorWhenCodeCannotBeShared: "
                + behaviorWhenCodeCannotBeShared + ", name: " + name + ", startsAt: " + startsAt + ", endsAt: " + endsAt
                + ", code: " + code + ", attemptForOfflineDevice: " + attemptForOfflineDevice
                + ", preferNativeScheduling: " + preferNativeScheduling + ", useBackupAccessCodePool: "
                + useBackupAccessCodePool + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private List<String> deviceIds = new ArrayList<>();

        private Optional<AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared>
                behaviorWhenCodeCannotBeShared = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> startsAt = Optional.empty();

        private Optional<String> endsAt = Optional.empty();

        private Optional<String> code = Optional.empty();

        private Optional<Boolean> attemptForOfflineDevice = Optional.empty();

        private Optional<Boolean> preferNativeScheduling = Optional.empty();

        private Optional<Boolean> useBackupAccessCodePool = Optional.empty();

        private Builder() {}

        public Builder from(AccessCodesCreateMultipleRequest other) {
            deviceIds(other.getDeviceIds());
            behaviorWhenCodeCannotBeShared(other.getBehaviorWhenCodeCannotBeShared());
            name(other.getName());
            startsAt(other.getStartsAt());
            endsAt(other.getEndsAt());
            code(other.getCode());
            attemptForOfflineDevice(other.getAttemptForOfflineDevice());
            preferNativeScheduling(other.getPreferNativeScheduling());
            useBackupAccessCodePool(other.getUseBackupAccessCodePool());
            return this;
        }

        @JsonSetter(value = "device_ids", nulls = Nulls.SKIP)
        public Builder deviceIds(List<String> deviceIds) {
            this.deviceIds.clear();
            this.deviceIds.addAll(deviceIds);
            return this;
        }

        public Builder addDeviceIds(String deviceIds) {
            this.deviceIds.add(deviceIds);
            return this;
        }

        public Builder addAllDeviceIds(List<String> deviceIds) {
            this.deviceIds.addAll(deviceIds);
            return this;
        }

        @JsonSetter(value = "behavior_when_code_cannot_be_shared", nulls = Nulls.SKIP)
        public Builder behaviorWhenCodeCannotBeShared(
                Optional<AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared>
                        behaviorWhenCodeCannotBeShared) {
            this.behaviorWhenCodeCannotBeShared = behaviorWhenCodeCannotBeShared;
            return this;
        }

        public Builder behaviorWhenCodeCannotBeShared(
                AccessCodesCreateMultipleRequestBehaviorWhenCodeCannotBeShared behaviorWhenCodeCannotBeShared) {
            this.behaviorWhenCodeCannotBeShared = Optional.of(behaviorWhenCodeCannotBeShared);
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

        @JsonSetter(value = "starts_at", nulls = Nulls.SKIP)
        public Builder startsAt(Optional<String> startsAt) {
            this.startsAt = startsAt;
            return this;
        }

        public Builder startsAt(String startsAt) {
            this.startsAt = Optional.of(startsAt);
            return this;
        }

        @JsonSetter(value = "ends_at", nulls = Nulls.SKIP)
        public Builder endsAt(Optional<String> endsAt) {
            this.endsAt = endsAt;
            return this;
        }

        public Builder endsAt(String endsAt) {
            this.endsAt = Optional.of(endsAt);
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

        @JsonSetter(value = "attempt_for_offline_device", nulls = Nulls.SKIP)
        public Builder attemptForOfflineDevice(Optional<Boolean> attemptForOfflineDevice) {
            this.attemptForOfflineDevice = attemptForOfflineDevice;
            return this;
        }

        public Builder attemptForOfflineDevice(Boolean attemptForOfflineDevice) {
            this.attemptForOfflineDevice = Optional.of(attemptForOfflineDevice);
            return this;
        }

        @JsonSetter(value = "prefer_native_scheduling", nulls = Nulls.SKIP)
        public Builder preferNativeScheduling(Optional<Boolean> preferNativeScheduling) {
            this.preferNativeScheduling = preferNativeScheduling;
            return this;
        }

        public Builder preferNativeScheduling(Boolean preferNativeScheduling) {
            this.preferNativeScheduling = Optional.of(preferNativeScheduling);
            return this;
        }

        @JsonSetter(value = "use_backup_access_code_pool", nulls = Nulls.SKIP)
        public Builder useBackupAccessCodePool(Optional<Boolean> useBackupAccessCodePool) {
            this.useBackupAccessCodePool = useBackupAccessCodePool;
            return this;
        }

        public Builder useBackupAccessCodePool(Boolean useBackupAccessCodePool) {
            this.useBackupAccessCodePool = Optional.of(useBackupAccessCodePool);
            return this;
        }

        public AccessCodesCreateMultipleRequest build() {
            return new AccessCodesCreateMultipleRequest(
                    deviceIds,
                    behaviorWhenCodeCannotBeShared,
                    name,
                    startsAt,
                    endsAt,
                    code,
                    attemptForOfflineDevice,
                    preferNativeScheduling,
                    useBackupAccessCodePool);
        }
    }
}
