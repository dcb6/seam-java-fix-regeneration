/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.noisesensors.noisethresholds.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = NoiseThresholdsCreateRequest.Builder.class)
public final class NoiseThresholdsCreateRequest {
    private final String deviceId;

    private final Optional<Boolean> sync;

    private final Optional<String> name;

    private final String startsDailyAt;

    private final String endsDailyAt;

    private final Optional<Double> noiseThresholdDecibels;

    private final Optional<Double> noiseThresholdNrs;

    private NoiseThresholdsCreateRequest(
            String deviceId,
            Optional<Boolean> sync,
            Optional<String> name,
            String startsDailyAt,
            String endsDailyAt,
            Optional<Double> noiseThresholdDecibels,
            Optional<Double> noiseThresholdNrs,
            Map<String, Object> additionalProperties) {
        this.deviceId = deviceId;
        this.sync = sync;
        this.name = name;
        this.startsDailyAt = startsDailyAt;
        this.endsDailyAt = endsDailyAt;
        this.noiseThresholdDecibels = noiseThresholdDecibels;
        this.noiseThresholdNrs = noiseThresholdNrs;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("sync")
    public Optional<Boolean> getSync() {
        return sync;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("starts_daily_at")
    public String getStartsDailyAt() {
        return startsDailyAt;
    }

    @JsonProperty("ends_daily_at")
    public String getEndsDailyAt() {
        return endsDailyAt;
    }

    @JsonProperty("noise_threshold_decibels")
    public Optional<Double> getNoiseThresholdDecibels() {
        return noiseThresholdDecibels;
    }

    @JsonProperty("noise_threshold_nrs")
    public Optional<Double> getNoiseThresholdNrs() {
        return noiseThresholdNrs;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NoiseThresholdsCreateRequest && equalTo((NoiseThresholdsCreateRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NoiseThresholdsCreateRequest other) {
        return deviceId.equals(other.deviceId)
                && sync.equals(other.sync)
                && name.equals(other.name)
                && startsDailyAt.equals(other.startsDailyAt)
                && endsDailyAt.equals(other.endsDailyAt)
                && noiseThresholdDecibels.equals(other.noiseThresholdDecibels)
                && noiseThresholdNrs.equals(other.noiseThresholdNrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.deviceId,
                this.sync,
                this.name,
                this.startsDailyAt,
                this.endsDailyAt,
                this.noiseThresholdDecibels,
                this.noiseThresholdNrs);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DeviceIdStage builder() {
        return new Builder();
    }

    public interface DeviceIdStage {
        StartsDailyAtStage deviceId(String deviceId);

        Builder from(NoiseThresholdsCreateRequest other);
    }

    public interface StartsDailyAtStage {
        EndsDailyAtStage startsDailyAt(String startsDailyAt);
    }

    public interface EndsDailyAtStage {
        _FinalStage endsDailyAt(String endsDailyAt);
    }

    public interface _FinalStage {
        NoiseThresholdsCreateRequest build();

        _FinalStage sync(Optional<Boolean> sync);

        _FinalStage sync(Boolean sync);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage noiseThresholdDecibels(Optional<Double> noiseThresholdDecibels);

        _FinalStage noiseThresholdDecibels(Double noiseThresholdDecibels);

        _FinalStage noiseThresholdNrs(Optional<Double> noiseThresholdNrs);

        _FinalStage noiseThresholdNrs(Double noiseThresholdNrs);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceIdStage, StartsDailyAtStage, EndsDailyAtStage, _FinalStage {
        private String deviceId;

        private String startsDailyAt;

        private String endsDailyAt;

        private Optional<Double> noiseThresholdNrs = Optional.empty();

        private Optional<Double> noiseThresholdDecibels = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<Boolean> sync = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(NoiseThresholdsCreateRequest other) {
            deviceId(other.getDeviceId());
            sync(other.getSync());
            name(other.getName());
            startsDailyAt(other.getStartsDailyAt());
            endsDailyAt(other.getEndsDailyAt());
            noiseThresholdDecibels(other.getNoiseThresholdDecibels());
            noiseThresholdNrs(other.getNoiseThresholdNrs());
            return this;
        }

        @Override
        @JsonSetter("device_id")
        public StartsDailyAtStage deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Override
        @JsonSetter("starts_daily_at")
        public EndsDailyAtStage startsDailyAt(String startsDailyAt) {
            this.startsDailyAt = startsDailyAt;
            return this;
        }

        @Override
        @JsonSetter("ends_daily_at")
        public _FinalStage endsDailyAt(String endsDailyAt) {
            this.endsDailyAt = endsDailyAt;
            return this;
        }

        @Override
        public _FinalStage noiseThresholdNrs(Double noiseThresholdNrs) {
            this.noiseThresholdNrs = Optional.of(noiseThresholdNrs);
            return this;
        }

        @Override
        @JsonSetter(value = "noise_threshold_nrs", nulls = Nulls.SKIP)
        public _FinalStage noiseThresholdNrs(Optional<Double> noiseThresholdNrs) {
            this.noiseThresholdNrs = noiseThresholdNrs;
            return this;
        }

        @Override
        public _FinalStage noiseThresholdDecibels(Double noiseThresholdDecibels) {
            this.noiseThresholdDecibels = Optional.of(noiseThresholdDecibels);
            return this;
        }

        @Override
        @JsonSetter(value = "noise_threshold_decibels", nulls = Nulls.SKIP)
        public _FinalStage noiseThresholdDecibels(Optional<Double> noiseThresholdDecibels) {
            this.noiseThresholdDecibels = noiseThresholdDecibels;
            return this;
        }

        @Override
        public _FinalStage name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        @Override
        public _FinalStage sync(Boolean sync) {
            this.sync = Optional.of(sync);
            return this;
        }

        @Override
        @JsonSetter(value = "sync", nulls = Nulls.SKIP)
        public _FinalStage sync(Optional<Boolean> sync) {
            this.sync = sync;
            return this;
        }

        @Override
        public NoiseThresholdsCreateRequest build() {
            return new NoiseThresholdsCreateRequest(
                    deviceId,
                    sync,
                    name,
                    startsDailyAt,
                    endsDailyAt,
                    noiseThresholdDecibels,
                    noiseThresholdNrs,
                    additionalProperties);
        }
    }
}
