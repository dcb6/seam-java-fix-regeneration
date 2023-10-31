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
@JsonDeserialize(builder = NoiseThresholdsGetResponse.Builder.class)
public final class NoiseThresholdsGetResponse {
    private final NoiseThreshold noiseThreshold;

    private final boolean ok;

    private final Map<String, Object> additionalProperties;

    private NoiseThresholdsGetResponse(
            NoiseThreshold noiseThreshold, boolean ok, Map<String, Object> additionalProperties) {
        this.noiseThreshold = noiseThreshold;
        this.ok = ok;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("noise_threshold")
    public NoiseThreshold getNoiseThreshold() {
        return noiseThreshold;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NoiseThresholdsGetResponse && equalTo((NoiseThresholdsGetResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NoiseThresholdsGetResponse other) {
        return noiseThreshold.equals(other.noiseThreshold) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.noiseThreshold, this.ok);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NoiseThresholdStage builder() {
        return new Builder();
    }

    public interface NoiseThresholdStage {
        OkStage noiseThreshold(NoiseThreshold noiseThreshold);

        Builder from(NoiseThresholdsGetResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        NoiseThresholdsGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NoiseThresholdStage, OkStage, _FinalStage {
        private NoiseThreshold noiseThreshold;

        private boolean ok;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(NoiseThresholdsGetResponse other) {
            noiseThreshold(other.getNoiseThreshold());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("noise_threshold")
        public OkStage noiseThreshold(NoiseThreshold noiseThreshold) {
            this.noiseThreshold = noiseThreshold;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public NoiseThresholdsGetResponse build() {
            return new NoiseThresholdsGetResponse(noiseThreshold, ok, additionalProperties);
        }
    }
}
