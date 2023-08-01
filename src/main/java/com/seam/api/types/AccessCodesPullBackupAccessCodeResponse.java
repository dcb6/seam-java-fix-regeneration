package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = AccessCodesPullBackupAccessCodeResponse.Builder.class)
public final class AccessCodesPullBackupAccessCodeResponse {
    private final AccessCode backupAccessCode;

    private final boolean ok;

    private AccessCodesPullBackupAccessCodeResponse(AccessCode backupAccessCode, boolean ok) {
        this.backupAccessCode = backupAccessCode;
        this.ok = ok;
    }

    @JsonProperty("backup_access_code")
    public AccessCode getBackupAccessCode() {
        return backupAccessCode;
    }

    @JsonProperty("ok")
    public boolean getOk() {
        return ok;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesPullBackupAccessCodeResponse
                && equalTo((AccessCodesPullBackupAccessCodeResponse) other);
    }

    private boolean equalTo(AccessCodesPullBackupAccessCodeResponse other) {
        return backupAccessCode.equals(other.backupAccessCode) && ok == other.ok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.backupAccessCode, this.ok);
    }

    @Override
    public String toString() {
        return "AccessCodesPullBackupAccessCodeResponse{" + "backupAccessCode: " + backupAccessCode + ", ok: " + ok
                + "}";
    }

    public static BackupAccessCodeStage builder() {
        return new Builder();
    }

    public interface BackupAccessCodeStage {
        OkStage backupAccessCode(AccessCode backupAccessCode);

        Builder from(AccessCodesPullBackupAccessCodeResponse other);
    }

    public interface OkStage {
        _FinalStage ok(boolean ok);
    }

    public interface _FinalStage {
        AccessCodesPullBackupAccessCodeResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements BackupAccessCodeStage, OkStage, _FinalStage {
        private AccessCode backupAccessCode;

        private boolean ok;

        private Builder() {}

        @Override
        public Builder from(AccessCodesPullBackupAccessCodeResponse other) {
            backupAccessCode(other.getBackupAccessCode());
            ok(other.getOk());
            return this;
        }

        @Override
        @JsonSetter("backup_access_code")
        public OkStage backupAccessCode(AccessCode backupAccessCode) {
            this.backupAccessCode = backupAccessCode;
            return this;
        }

        @Override
        @JsonSetter("ok")
        public _FinalStage ok(boolean ok) {
            this.ok = ok;
            return this;
        }

        @Override
        public AccessCodesPullBackupAccessCodeResponse build() {
            return new AccessCodesPullBackupAccessCodeResponse(backupAccessCode, ok);
        }
    }
}