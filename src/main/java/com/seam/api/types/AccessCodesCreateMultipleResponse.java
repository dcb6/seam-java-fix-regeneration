package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AccessCodesCreateMultipleResponse.Builder.class)
public final class AccessCodesCreateMultipleResponse {
    private final List<AccessCode> accessCodes;

    private final boolean ok;

    private AccessCodesCreateMultipleResponse(List<AccessCode> accessCodes, boolean ok) {
        this.accessCodes = accessCodes;
        this.ok = ok;
    }

    @JsonProperty("access_codes")
    public List<AccessCode> getAccessCodes() {
        return accessCodes;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesCreateMultipleResponse && equalTo((AccessCodesCreateMultipleResponse) other);
    }

    private boolean equalTo(AccessCodesCreateMultipleResponse other) {
        return accessCodes.equals(other.accessCodes) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.accessCodes, this.ok);
    }

    @Override
    public String toString() {
        return "AccessCodesCreateMultipleResponse{" + "accessCodes: " + accessCodes + ", ok: " + ok + "}";
    }

    public static OkStage builder() {
        return new Builder();
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);

        Builder from(AccessCodesCreateMultipleResponse other);
    }

    public interface _FinalStage {
        AccessCodesCreateMultipleResponse build();

        _FinalStage accessCodes(List<AccessCode> accessCodes);

        _FinalStage addAccessCodes(AccessCode accessCodes);

        _FinalStage addAllAccessCodes(List<AccessCode> accessCodes);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OkStage, _FinalStage {
        private boolean ok;

        private List<AccessCode> accessCodes = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(AccessCodesCreateMultipleResponse other) {
            accessCodes(other.getAccessCodes());
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
        public _FinalStage addAllAccessCodes(List<AccessCode> accessCodes) {
            this.accessCodes.addAll(accessCodes);
            return this;
        }

        @Override
        public _FinalStage addAccessCodes(AccessCode accessCodes) {
            this.accessCodes.add(accessCodes);
            return this;
        }

        @Override
        @JsonSetter(value = "access_codes", nulls = Nulls.SKIP)
        public _FinalStage accessCodes(List<AccessCode> accessCodes) {
            this.accessCodes.clear();
            this.accessCodes.addAll(accessCodes);
            return this;
        }

        @Override
        public AccessCodesCreateMultipleResponse build() {
            return new AccessCodesCreateMultipleResponse(accessCodes, ok);
        }
    }
}
