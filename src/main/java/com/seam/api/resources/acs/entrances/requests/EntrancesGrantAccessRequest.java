/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.resources.acs.entrances.requests;

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
@JsonDeserialize(builder = EntrancesGrantAccessRequest.Builder.class)
public final class EntrancesGrantAccessRequest {
    private final String acsEntranceId;

    private final String acsUserId;

    private final Map<String, Object> additionalProperties;

    private EntrancesGrantAccessRequest(
            String acsEntranceId, String acsUserId, Map<String, Object> additionalProperties) {
        this.acsEntranceId = acsEntranceId;
        this.acsUserId = acsUserId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("acs_entrance_id")
    public String getAcsEntranceId() {
        return acsEntranceId;
    }

    @JsonProperty("acs_user_id")
    public String getAcsUserId() {
        return acsUserId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntrancesGrantAccessRequest && equalTo((EntrancesGrantAccessRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntrancesGrantAccessRequest other) {
        return acsEntranceId.equals(other.acsEntranceId) && acsUserId.equals(other.acsUserId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.acsEntranceId, this.acsUserId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AcsEntranceIdStage builder() {
        return new Builder();
    }

    public interface AcsEntranceIdStage {
        AcsUserIdStage acsEntranceId(String acsEntranceId);

        Builder from(EntrancesGrantAccessRequest other);
    }

    public interface AcsUserIdStage {
        _FinalStage acsUserId(String acsUserId);
    }

    public interface _FinalStage {
        EntrancesGrantAccessRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AcsEntranceIdStage, AcsUserIdStage, _FinalStage {
        private String acsEntranceId;

        private String acsUserId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(EntrancesGrantAccessRequest other) {
            acsEntranceId(other.getAcsEntranceId());
            acsUserId(other.getAcsUserId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("acs_entrance_id")
        public AcsUserIdStage acsEntranceId(String acsEntranceId) {
            this.acsEntranceId = acsEntranceId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("acs_user_id")
        public _FinalStage acsUserId(String acsUserId) {
            this.acsUserId = acsUserId;
            return this;
        }

        @java.lang.Override
        public EntrancesGrantAccessRequest build() {
            return new EntrancesGrantAccessRequest(acsEntranceId, acsUserId, additionalProperties);
        }
    }
}