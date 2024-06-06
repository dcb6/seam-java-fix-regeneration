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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DevicePropertiesCodeConstraintsItemMaxLength.Builder.class)
public final class DevicePropertiesCodeConstraintsItemMaxLength {
    private final DevicePropertiesCodeConstraintsItemMaxLengthConstraintType constraintType;

    private final Optional<Double> minLength;

    private final Optional<Double> maxLength;

    private final Map<String, Object> additionalProperties;

    private DevicePropertiesCodeConstraintsItemMaxLength(
            DevicePropertiesCodeConstraintsItemMaxLengthConstraintType constraintType,
            Optional<Double> minLength,
            Optional<Double> maxLength,
            Map<String, Object> additionalProperties) {
        this.constraintType = constraintType;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("constraint_type")
    public DevicePropertiesCodeConstraintsItemMaxLengthConstraintType getConstraintType() {
        return constraintType;
    }

    @JsonProperty("min_length")
    public Optional<Double> getMinLength() {
        return minLength;
    }

    @JsonProperty("max_length")
    public Optional<Double> getMaxLength() {
        return maxLength;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesCodeConstraintsItemMaxLength
                && equalTo((DevicePropertiesCodeConstraintsItemMaxLength) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DevicePropertiesCodeConstraintsItemMaxLength other) {
        return constraintType.equals(other.constraintType)
                && minLength.equals(other.minLength)
                && maxLength.equals(other.maxLength);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.constraintType, this.minLength, this.maxLength);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ConstraintTypeStage builder() {
        return new Builder();
    }

    public interface ConstraintTypeStage {
        _FinalStage constraintType(DevicePropertiesCodeConstraintsItemMaxLengthConstraintType constraintType);

        Builder from(DevicePropertiesCodeConstraintsItemMaxLength other);
    }

    public interface _FinalStage {
        DevicePropertiesCodeConstraintsItemMaxLength build();

        _FinalStage minLength(Optional<Double> minLength);

        _FinalStage minLength(Double minLength);

        _FinalStage maxLength(Optional<Double> maxLength);

        _FinalStage maxLength(Double maxLength);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ConstraintTypeStage, _FinalStage {
        private DevicePropertiesCodeConstraintsItemMaxLengthConstraintType constraintType;

        private Optional<Double> maxLength = Optional.empty();

        private Optional<Double> minLength = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DevicePropertiesCodeConstraintsItemMaxLength other) {
            constraintType(other.getConstraintType());
            minLength(other.getMinLength());
            maxLength(other.getMaxLength());
            return this;
        }

        @java.lang.Override
        @JsonSetter("constraint_type")
        public _FinalStage constraintType(DevicePropertiesCodeConstraintsItemMaxLengthConstraintType constraintType) {
            this.constraintType = constraintType;
            return this;
        }

        @java.lang.Override
        public _FinalStage maxLength(Double maxLength) {
            this.maxLength = Optional.of(maxLength);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "max_length", nulls = Nulls.SKIP)
        public _FinalStage maxLength(Optional<Double> maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        @java.lang.Override
        public _FinalStage minLength(Double minLength) {
            this.minLength = Optional.of(minLength);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "min_length", nulls = Nulls.SKIP)
        public _FinalStage minLength(Optional<Double> minLength) {
            this.minLength = minLength;
            return this;
        }

        @java.lang.Override
        public DevicePropertiesCodeConstraintsItemMaxLength build() {
            return new DevicePropertiesCodeConstraintsItemMaxLength(
                    constraintType, minLength, maxLength, additionalProperties);
        }
    }
}
