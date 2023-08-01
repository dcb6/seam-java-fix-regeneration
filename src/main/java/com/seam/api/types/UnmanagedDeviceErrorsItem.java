package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = UnmanagedDeviceErrorsItem.Builder.class)
public final class UnmanagedDeviceErrorsItem {
    private final String errorCode;

    private final String message;

    private UnmanagedDeviceErrorsItem(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    @JsonProperty("error_code")
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UnmanagedDeviceErrorsItem && equalTo((UnmanagedDeviceErrorsItem) other);
    }

    private boolean equalTo(UnmanagedDeviceErrorsItem other) {
        return errorCode.equals(other.errorCode) && message.equals(other.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.errorCode, this.message);
    }

    @Override
    public String toString() {
        return "UnmanagedDeviceErrorsItem{" + "errorCode: " + errorCode + ", message: " + message + "}";
    }

    public static ErrorCodeStage builder() {
        return new Builder();
    }

    public interface ErrorCodeStage {
        MessageStage errorCode(String errorCode);

        Builder from(UnmanagedDeviceErrorsItem other);
    }

    public interface MessageStage {
        _FinalStage message(String message);
    }

    public interface _FinalStage {
        UnmanagedDeviceErrorsItem build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ErrorCodeStage, MessageStage, _FinalStage {
        private String errorCode;

        private String message;

        private Builder() {}

        @Override
        public Builder from(UnmanagedDeviceErrorsItem other) {
            errorCode(other.getErrorCode());
            message(other.getMessage());
            return this;
        }

        @Override
        @JsonSetter("error_code")
        public MessageStage errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        @Override
        @JsonSetter("message")
        public _FinalStage message(String message) {
            this.message = message;
            return this;
        }

        @Override
        public UnmanagedDeviceErrorsItem build() {
            return new UnmanagedDeviceErrorsItem(errorCode, message);
        }
    }
}