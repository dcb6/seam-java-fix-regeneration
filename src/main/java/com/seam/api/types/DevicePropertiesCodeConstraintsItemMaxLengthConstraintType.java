/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DevicePropertiesCodeConstraintsItemMaxLengthConstraintType {
    NAME_LENGTH("name_length"),

    NAME_MUST_BE_UNIQUE("name_must_be_unique");

    private final String value;

    DevicePropertiesCodeConstraintsItemMaxLengthConstraintType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}