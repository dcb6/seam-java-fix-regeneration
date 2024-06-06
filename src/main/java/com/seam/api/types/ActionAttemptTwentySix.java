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
@JsonDeserialize(builder = ActionAttemptTwentySix.Builder.class)
public final class ActionAttemptTwentySix {
    private final String actionAttemptId;

    private final Optional<String> result;

    private final ActionAttemptTwentySixError error;

    private final Map<String, Object> additionalProperties;

    private ActionAttemptTwentySix(
            String actionAttemptId,
            Optional<String> result,
            ActionAttemptTwentySixError error,
            Map<String, Object> additionalProperties) {
        this.actionAttemptId = actionAttemptId;
        this.result = result;
        this.error = error;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return <hr />
     * <pre><code>title: Action Attempt ID
     * ---
     * The ID of the action attempt.
     * </code></pre>
     */
    @JsonProperty("action_attempt_id")
    public String getActionAttemptId() {
        return actionAttemptId;
    }

    @JsonProperty("status")
    public String getStatus() {
        return "error";
    }

    @JsonProperty("result")
    public Optional<String> getResult() {
        return result;
    }

    @JsonProperty("action_type")
    public String getActionType() {
        return "SYNC_ACCESS_CODES";
    }

    @JsonProperty("error")
    public ActionAttemptTwentySixError getError() {
        return error;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ActionAttemptTwentySix && equalTo((ActionAttemptTwentySix) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ActionAttemptTwentySix other) {
        return actionAttemptId.equals(other.actionAttemptId)
                && result.equals(other.result)
                && error.equals(other.error);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.actionAttemptId, this.result, this.error);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ActionAttemptIdStage builder() {
        return new Builder();
    }

    public interface ActionAttemptIdStage {
        ErrorStage actionAttemptId(String actionAttemptId);

        Builder from(ActionAttemptTwentySix other);
    }

    public interface ErrorStage {
        _FinalStage error(ActionAttemptTwentySixError error);
    }

    public interface _FinalStage {
        ActionAttemptTwentySix build();

        _FinalStage result(Optional<String> result);

        _FinalStage result(String result);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionAttemptIdStage, ErrorStage, _FinalStage {
        private String actionAttemptId;

        private ActionAttemptTwentySixError error;

        private Optional<String> result = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ActionAttemptTwentySix other) {
            actionAttemptId(other.getActionAttemptId());
            result(other.getResult());
            error(other.getError());
            return this;
        }

        /**
         * <hr />
         * <pre><code>title: Action Attempt ID
         * ---
         * The ID of the action attempt.
         * </code></pre>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("action_attempt_id")
        public ErrorStage actionAttemptId(String actionAttemptId) {
            this.actionAttemptId = actionAttemptId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("error")
        public _FinalStage error(ActionAttemptTwentySixError error) {
            this.error = error;
            return this;
        }

        @java.lang.Override
        public _FinalStage result(String result) {
            this.result = Optional.of(result);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "result", nulls = Nulls.SKIP)
        public _FinalStage result(Optional<String> result) {
            this.result = result;
            return this;
        }

        @java.lang.Override
        public ActionAttemptTwentySix build() {
            return new ActionAttemptTwentySix(actionAttemptId, result, error, additionalProperties);
        }
    }
}
