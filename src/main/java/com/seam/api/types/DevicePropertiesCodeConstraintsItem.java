/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.seam.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = DevicePropertiesCodeConstraintsItem.Deserializer.class)
public final class DevicePropertiesCodeConstraintsItem {
    private final Object value;

    private final int type;

    private DevicePropertiesCodeConstraintsItem(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((DevicePropertiesCodeConstraintsItemZero) this.value);
        } else if (this.type == 1) {
            return visitor.visit((DevicePropertiesCodeConstraintsItemMaxLength) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicePropertiesCodeConstraintsItem
                && equalTo((DevicePropertiesCodeConstraintsItem) other);
    }

    private boolean equalTo(DevicePropertiesCodeConstraintsItem other) {
        return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
        return this.value.toString();
    }

    public static DevicePropertiesCodeConstraintsItem of(DevicePropertiesCodeConstraintsItemZero value) {
        return new DevicePropertiesCodeConstraintsItem(value, 0);
    }

    public static DevicePropertiesCodeConstraintsItem of(DevicePropertiesCodeConstraintsItemMaxLength value) {
        return new DevicePropertiesCodeConstraintsItem(value, 1);
    }

    public interface Visitor<T> {
        T visit(DevicePropertiesCodeConstraintsItemZero value);

        T visit(DevicePropertiesCodeConstraintsItemMaxLength value);
    }

    static final class Deserializer extends StdDeserializer<DevicePropertiesCodeConstraintsItem> {
        Deserializer() {
            super(DevicePropertiesCodeConstraintsItem.class);
        }

        @java.lang.Override
        public DevicePropertiesCodeConstraintsItem deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, DevicePropertiesCodeConstraintsItemZero.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, DevicePropertiesCodeConstraintsItemMaxLength.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
