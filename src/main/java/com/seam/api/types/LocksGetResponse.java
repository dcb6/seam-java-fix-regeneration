/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seam.api.core.ObjectMappers;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LocksGetResponse.Builder.class)
public final class LocksGetResponse {
    private final Optional<Object> lock;

    private final Optional<Object> device;

    private final boolean ok;

    private LocksGetResponse(Optional<Object> lock, Optional<Object> device, boolean ok) {
        this.lock = lock;
        this.device = device;
        this.ok = ok;
    }

    @JsonProperty("lock")
    public Optional<Object> getLock() {
        return lock;
    }

    @JsonProperty("device")
    public Optional<Object> getDevice() {
        return device;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LocksGetResponse && equalTo((LocksGetResponse) other);
    }

    private boolean equalTo(LocksGetResponse other) {
        return lock.equals(other.lock) && device.equals(other.device) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.lock, this.device, this.ok);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(LocksGetResponse other);
    }

    public interface _FinalStage {
        LocksGetResponse build();

        _FinalStage lock(Optional<Object> lock);

        _FinalStage lock(Object lock);

        _FinalStage device(Optional<Object> device);

        _FinalStage device(Object device);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private Optional<Object> device = Optional.empty();

        private Optional<Object> lock = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(LocksGetResponse other) {
            lock(other.getLock());
            device(other.getDevice());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public _FinalStage device(Object device) {
            this.device = Optional.of(device);
            return this;
        }

        @Override
        @JsonSetter(value = "device", nulls = Nulls.SKIP)
        public _FinalStage device(Optional<Object> device) {
            this.device = device;
            return this;
        }

        @Override
        public _FinalStage lock(Object lock) {
            this.lock = Optional.of(lock);
            return this;
        }

        @Override
        @JsonSetter(value = "lock", nulls = Nulls.SKIP)
        public _FinalStage lock(Optional<Object> lock) {
            this.lock = lock;
            return this;
        }

        @Override
        public LocksGetResponse build() {
            return new LocksGetResponse(lock, device, ok);
        }
    }
}
