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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = NoiseThresholdsListResponse.Builder.class)
public final class NoiseThresholdsListResponse {
    private final List<NoiseThreshold> noiseThresholds;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private NoiseThresholdsListResponse(
            List<NoiseThreshold> noiseThresholds, boolean ok, Map<String, Object> additionalProperties) {
        this.noiseThresholds = noiseThresholds;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("noise_thresholds")
    public List<NoiseThreshold> getNoiseThresholds() {
        return noiseThresholds;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NoiseThresholdsListResponse && equalTo((NoiseThresholdsListResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NoiseThresholdsListResponse other) {
        return noiseThresholds.equals(other.noiseThresholds) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.noiseThresholds, this.ok);
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

        Builder from(NoiseThresholdsListResponse other);
    }

    public interface _FinalStage {
        NoiseThresholdsListResponse build();

        _FinalStage noiseThresholds(List<NoiseThreshold> noiseThresholds);

        _FinalStage addNoiseThresholds(NoiseThreshold noiseThresholds);

        _FinalStage addAllNoiseThresholds(List<NoiseThreshold> noiseThresholds);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<NoiseThreshold> noiseThresholds = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(NoiseThresholdsListResponse other) {
            noiseThresholds(other.getNoiseThresholds());
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
        public _FinalStage addAllNoiseThresholds(List<NoiseThreshold> noiseThresholds) {
            this.noiseThresholds.addAll(noiseThresholds);
            return this;
        }

        @Override
        public _FinalStage addNoiseThresholds(NoiseThreshold noiseThresholds) {
            this.noiseThresholds.add(noiseThresholds);
            return this;
        }

        @Override
        @JsonSetter(value = "noise_thresholds", nulls = Nulls.SKIP)
        public _FinalStage noiseThresholds(List<NoiseThreshold> noiseThresholds) {
            this.noiseThresholds.clear();
            this.noiseThresholds.addAll(noiseThresholds);
            return this;
        }

        @Override
        public NoiseThresholdsListResponse build() {
            return new NoiseThresholdsListResponse(noiseThresholds, ok, additionalProperties);
        }
    }
}
