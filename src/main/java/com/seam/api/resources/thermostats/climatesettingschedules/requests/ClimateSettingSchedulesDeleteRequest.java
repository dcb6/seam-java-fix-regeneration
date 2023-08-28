package com.seam.api.resources.thermostats.climatesettingschedules.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ClimateSettingSchedulesDeleteRequest.Builder.class)
public final class ClimateSettingSchedulesDeleteRequest {
    private final String climateSettingScheduleId;

    private ClimateSettingSchedulesDeleteRequest(String climateSettingScheduleId) {
        this.climateSettingScheduleId = climateSettingScheduleId;
    }

    @JsonProperty("climate_setting_schedule_id")
    public String getClimateSettingScheduleId() {
        return climateSettingScheduleId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClimateSettingSchedulesDeleteRequest
                && equalTo((ClimateSettingSchedulesDeleteRequest) other);
    }

    private boolean equalTo(ClimateSettingSchedulesDeleteRequest other) {
        return climateSettingScheduleId.equals(other.climateSettingScheduleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.climateSettingScheduleId);
    }

    @Override
    public String toString() {
        return "ClimateSettingSchedulesDeleteRequest{" + "climateSettingScheduleId: " + climateSettingScheduleId + "}";
    }

    public static ClimateSettingScheduleIdStage builder() {
        return new Builder();
    }

    public interface ClimateSettingScheduleIdStage {
        _FinalStage climateSettingScheduleId(String climateSettingScheduleId);

        Builder from(ClimateSettingSchedulesDeleteRequest other);
    }

    public interface _FinalStage {
        ClimateSettingSchedulesDeleteRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ClimateSettingScheduleIdStage, _FinalStage {
        private String climateSettingScheduleId;

        private Builder() {}

        @Override
        public Builder from(ClimateSettingSchedulesDeleteRequest other) {
            climateSettingScheduleId(other.getClimateSettingScheduleId());
            return this;
        }

        @Override
        @JsonSetter("climate_setting_schedule_id")
        public _FinalStage climateSettingScheduleId(String climateSettingScheduleId) {
            this.climateSettingScheduleId = climateSettingScheduleId;
            return this;
        }

        @Override
        public ClimateSettingSchedulesDeleteRequest build() {
            return new ClimateSettingSchedulesDeleteRequest(climateSettingScheduleId);
        }
    }
}