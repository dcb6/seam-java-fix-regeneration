/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClimateSettingScheduleHvacModeSetting {
    OFF("off"),

    HEAT("heat"),

    COOL("cool"),

    HEAT_COOL("heat_cool");

    private final String value;

    ClimateSettingScheduleHvacModeSetting(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}