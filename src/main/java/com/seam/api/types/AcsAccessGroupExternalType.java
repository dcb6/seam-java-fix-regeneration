/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AcsAccessGroupExternalType {
    PTI_UNIT("pti_unit"),

    PTI_ACCESS_LEVEL("pti_access_level"),

    SALTO_ACCESS_GROUP("salto_access_group"),

    BRIVO_GROUP("brivo_group");

    private final String value;

    AcsAccessGroupExternalType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
