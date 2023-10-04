/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConnectWebviewDeviceSelectionMode {
    NONE("none"),

    SINGLE("single"),

    MULTIPLE("multiple");

    private final String value;

    ConnectWebviewDeviceSelectionMode(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
