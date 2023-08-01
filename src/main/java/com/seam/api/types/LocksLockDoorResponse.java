package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = LocksLockDoorResponse.Builder.class)
public final class LocksLockDoorResponse {
    private final ActionAttempt actionAttempt;

    private final boolean ok;

    private LocksLockDoorResponse(ActionAttempt actionAttempt, boolean ok) {
        this.actionAttempt = actionAttempt;
        this.ok = ok;
    }

    @JsonProperty("action_attempt")
    public ActionAttempt getActionAttempt() {
        return actionAttempt;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LocksLockDoorResponse && equalTo((LocksLockDoorResponse) other);
    }

    private boolean equalTo(LocksLockDoorResponse other) {
        return actionAttempt.equals(other.actionAttempt) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.actionAttempt, this.ok);
    }

    @Override
    public String toString() {
        return "LocksLockDoorResponse{" + "actionAttempt: " + actionAttempt + ", ok: " + ok + "}";
    }

    public static ActionAttemptStage builder() {
        return new Builder();
    }

    public interface ActionAttemptStage {
        OkStage actionAttempt(ActionAttempt actionAttempt);

        Builder from(LocksLockDoorResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        LocksLockDoorResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionAttemptStage, OkStage, _FinalStage {
        private ActionAttempt actionAttempt;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(LocksLockDoorResponse other) {
            actionAttempt(other.getActionAttempt());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("action_attempt")
        public OkStage actionAttempt(ActionAttempt actionAttempt) {
            this.actionAttempt = actionAttempt;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public LocksLockDoorResponse build() {
            return new LocksLockDoorResponse(actionAttempt, ok);
        }
    }
}