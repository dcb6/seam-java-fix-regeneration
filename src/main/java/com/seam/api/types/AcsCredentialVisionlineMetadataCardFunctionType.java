/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AcsCredentialVisionlineMetadataCardFunctionType {
    GUEST("guest"),

    STAFF("staff");

    private final String value;

    AcsCredentialVisionlineMetadataCardFunctionType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
