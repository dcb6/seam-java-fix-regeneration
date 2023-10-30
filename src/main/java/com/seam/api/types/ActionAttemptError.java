/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ActionAttemptError.Builder.class)
public final class ActionAttemptError {
    private final String actionType;

    private final String actionAttemptId;

    private final Optional<String> result;

    private final ActionAttemptErrorError error;

    private ActionAttemptError(
            String actionType,
            String actionAttemptId,
            Optional<String> result,
            ActionAttemptErrorError error,
            Map<String, Object> additionalProperties) {
        this.actionType = actionType;
        this.actionAttemptId = actionAttemptId;
        this.result = result;
        this.error = error;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("action_type")
    public String getActionType() {
        return actionType;
    }

    @JsonProperty("action_attempt_id")
    public String getActionAttemptId() {
        return actionAttemptId;
    }

    @JsonProperty("result")
    public Optional<String> getResult() {
        return result;
    }

    @JsonProperty("error")
    public ActionAttemptErrorError getError() {
        return error;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptError && equalTo((ActionAttemptError) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ActionAttemptError other) {
        return actionType.equals(other.actionType)
                && actionAttemptId.equals(other.actionAttemptId)
                && result.equals(other.result)
                && error.equals(other.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.actionType, this.actionAttemptId, this.result, this.error);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ActionTypeStage builder() {
        return new Builder();
    }

    public interface ActionTypeStage {
        ActionAttemptIdStage actionType(String actionType);

        Builder from(ActionAttemptError other);
    }

    public interface ActionAttemptIdStage {
        ErrorStage actionAttemptId(String actionAttemptId);
    }

    public interface ErrorStage {
        _FinalStage error(ActionAttemptErrorError error);
    }

    public interface _FinalStage {
        ActionAttemptError build();

        _FinalStage result(Optional<String> result);

        _FinalStage result(String result);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionTypeStage, ActionAttemptIdStage, ErrorStage, _FinalStage {
        private String actionType;

        private String actionAttemptId;

        private ActionAttemptErrorError error;

        private Optional<String> result = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(ActionAttemptError other) {
            actionType(other.getActionType());
            actionAttemptId(other.getActionAttemptId());
            result(other.getResult());
            error(other.getError());
            return this;
        }

        @Override
        @JsonSetter("action_type")
        public ActionAttemptIdStage actionType(String actionType) {
            this.actionType = actionType;
            return this;
        }

        @Override
        @JsonSetter("action_attempt_id")
        public ErrorStage actionAttemptId(String actionAttemptId) {
            this.actionAttemptId = actionAttemptId;
            return this;
        }

        @Override
        @JsonSetter("error")
        public _FinalStage error(ActionAttemptErrorError error) {
            this.error = error;
            return this;
        }

        @Override
        public _FinalStage result(String result) {
            this.result = Optional.of(result);
            return this;
        }

        @Override
        @JsonSetter(value = "result", nulls = Nulls.SKIP)
        public _FinalStage result(Optional<String> result) {
            this.result = result;
            return this;
        }

        @Override
        public ActionAttemptError build() {
            return new ActionAttemptError(actionType, actionAttemptId, result, error, additionalProperties);
        }
    }
}
