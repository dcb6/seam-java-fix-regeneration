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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = DeviceProvider.Builder.class)
public final class DeviceProvider {
    private final DeviceProviderDeviceProviderName deviceProviderName;

    private final String displayName;

    private final String imageUrl;

    private final List<DeviceProviderProviderCategoriesItem> providerCategories;

    private final Map<String, Object> additionalProperties;

    private DeviceProvider(
            DeviceProviderDeviceProviderName deviceProviderName,
            String displayName,
            String imageUrl,
            List<DeviceProviderProviderCategoriesItem> providerCategories,
            Map<String, Object> additionalProperties) {
        this.deviceProviderName = deviceProviderName;
        this.displayName = displayName;
        this.imageUrl = imageUrl;
        this.providerCategories = providerCategories;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("device_provider_name")
    public DeviceProviderDeviceProviderName getDeviceProviderName() {
        return deviceProviderName;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("provider_categories")
    public List<DeviceProviderProviderCategoriesItem> getProviderCategories() {
        return providerCategories;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DeviceProvider && equalTo((DeviceProvider) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DeviceProvider other) {
        return deviceProviderName.equals(other.deviceProviderName)
                && displayName.equals(other.displayName)
                && imageUrl.equals(other.imageUrl)
                && providerCategories.equals(other.providerCategories);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.deviceProviderName, this.displayName, this.imageUrl, this.providerCategories);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DeviceProviderNameStage builder() {
        return new Builder();
    }

    public interface DeviceProviderNameStage {
        DisplayNameStage deviceProviderName(DeviceProviderDeviceProviderName deviceProviderName);

        Builder from(DeviceProvider other);
    }

    public interface DisplayNameStage {
        ImageUrlStage displayName(String displayName);
    }

    public interface ImageUrlStage {
        _FinalStage imageUrl(String imageUrl);
    }

    public interface _FinalStage {
        DeviceProvider build();

        _FinalStage providerCategories(List<DeviceProviderProviderCategoriesItem> providerCategories);

        _FinalStage addProviderCategories(DeviceProviderProviderCategoriesItem providerCategories);

        _FinalStage addAllProviderCategories(List<DeviceProviderProviderCategoriesItem> providerCategories);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceProviderNameStage, DisplayNameStage, ImageUrlStage, _FinalStage {
        private DeviceProviderDeviceProviderName deviceProviderName;

        private String displayName;

        private String imageUrl;

        private List<DeviceProviderProviderCategoriesItem> providerCategories = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DeviceProvider other) {
            deviceProviderName(other.getDeviceProviderName());
            displayName(other.getDisplayName());
            imageUrl(other.getImageUrl());
            providerCategories(other.getProviderCategories());
            return this;
        }

        @java.lang.Override
        @JsonSetter("device_provider_name")
        public DisplayNameStage deviceProviderName(DeviceProviderDeviceProviderName deviceProviderName) {
            this.deviceProviderName = deviceProviderName;
            return this;
        }

        @java.lang.Override
        @JsonSetter("display_name")
        public ImageUrlStage displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        @java.lang.Override
        @JsonSetter("image_url")
        public _FinalStage imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllProviderCategories(List<DeviceProviderProviderCategoriesItem> providerCategories) {
            this.providerCategories.addAll(providerCategories);
            return this;
        }

        @java.lang.Override
        public _FinalStage addProviderCategories(DeviceProviderProviderCategoriesItem providerCategories) {
            this.providerCategories.add(providerCategories);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "provider_categories", nulls = Nulls.SKIP)
        public _FinalStage providerCategories(List<DeviceProviderProviderCategoriesItem> providerCategories) {
            this.providerCategories.clear();
            this.providerCategories.addAll(providerCategories);
            return this;
        }

        @java.lang.Override
        public DeviceProvider build() {
            return new DeviceProvider(
                    deviceProviderName, displayName, imageUrl, providerCategories, additionalProperties);
        }
    }
}