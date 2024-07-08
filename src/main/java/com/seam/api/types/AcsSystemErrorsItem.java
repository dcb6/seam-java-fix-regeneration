/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

public final class AcsSystemErrorsItem {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private AcsSystemErrorsItem(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static AcsSystemErrorsItem seamBridgeDisconnected(AcsSystemErrorsItemSeamBridgeDisconnected value) {
        return new AcsSystemErrorsItem(new SeamBridgeDisconnectedValue(value));
    }

    public static AcsSystemErrorsItem visionlineInstanceUnreachable(
            AcsSystemErrorsItemVisionlineInstanceUnreachable value) {
        return new AcsSystemErrorsItem(new VisionlineInstanceUnreachableValue(value));
    }

    public boolean isSeamBridgeDisconnected() {
        return value instanceof SeamBridgeDisconnectedValue;
    }

    public boolean isVisionlineInstanceUnreachable() {
        return value instanceof VisionlineInstanceUnreachableValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<AcsSystemErrorsItemSeamBridgeDisconnected> getSeamBridgeDisconnected() {
        if (isSeamBridgeDisconnected()) {
            return Optional.of(((SeamBridgeDisconnectedValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<AcsSystemErrorsItemVisionlineInstanceUnreachable> getVisionlineInstanceUnreachable() {
        if (isVisionlineInstanceUnreachable()) {
            return Optional.of(((VisionlineInstanceUnreachableValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<Object> _getUnknown() {
        if (_isUnknown()) {
            return Optional.of(((_UnknownValue) value).value);
        }
        return Optional.empty();
    }

    @JsonValue
    private Value getValue() {
        return this.value;
    }

    public interface Visitor<T> {
        T visitSeamBridgeDisconnected(AcsSystemErrorsItemSeamBridgeDisconnected seamBridgeDisconnected);

        T visitVisionlineInstanceUnreachable(
                AcsSystemErrorsItemVisionlineInstanceUnreachable visionlineInstanceUnreachable);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            property = "error_code",
            visible = true,
            defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(SeamBridgeDisconnectedValue.class),
        @JsonSubTypes.Type(VisionlineInstanceUnreachableValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("seam_bridge_disconnected")
    private static final class SeamBridgeDisconnectedValue implements Value {
        @JsonUnwrapped
        private AcsSystemErrorsItemSeamBridgeDisconnected value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SeamBridgeDisconnectedValue() {}

        private SeamBridgeDisconnectedValue(AcsSystemErrorsItemSeamBridgeDisconnected value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitSeamBridgeDisconnected(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof SeamBridgeDisconnectedValue && equalTo((SeamBridgeDisconnectedValue) other);
        }

        private boolean equalTo(SeamBridgeDisconnectedValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AcsSystemErrorsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("visionline_instance_unreachable")
    private static final class VisionlineInstanceUnreachableValue implements Value {
        @JsonUnwrapped
        private AcsSystemErrorsItemVisionlineInstanceUnreachable value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private VisionlineInstanceUnreachableValue() {}

        private VisionlineInstanceUnreachableValue(AcsSystemErrorsItemVisionlineInstanceUnreachable value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitVisionlineInstanceUnreachable(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof VisionlineInstanceUnreachableValue
                    && equalTo((VisionlineInstanceUnreachableValue) other);
        }

        private boolean equalTo(VisionlineInstanceUnreachableValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AcsSystemErrorsItem{" + "value: " + value + "}";
        }
    }

    private static final class _UnknownValue implements Value {
        private String type;

        @JsonValue
        private Object value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _UnknownValue(@JsonProperty("value") Object value) {}

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor._visitUnknown(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _UnknownValue && equalTo((_UnknownValue) other);
        }

        private boolean equalTo(_UnknownValue other) {
            return type.equals(other.type) && value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.type, this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AcsSystemErrorsItem{" + "type: " + type + ", value: " + value + "}";
        }
    }
}