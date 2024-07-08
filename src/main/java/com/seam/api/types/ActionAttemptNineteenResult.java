/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ActionAttemptNineteenResult.Builder.class)
public final class ActionAttemptNineteenResult {
    private final Map<String, Object> additionalProperties;

    private ActionAttemptNineteenResult(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptNineteenResult;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ActionAttemptNineteenResult other) {
            return this;
        }

        public ActionAttemptNineteenResult build() {
            return new ActionAttemptNineteenResult(additionalProperties);
        }
    }
}