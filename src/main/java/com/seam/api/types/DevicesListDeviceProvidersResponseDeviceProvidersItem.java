package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(builder = DevicesListDeviceProvidersResponseDeviceProvidersItem.Builder.class)
public final class DevicesListDeviceProvidersResponseDeviceProvidersItem {
    private final String deviceProviderName;

    private final String displayName;

    private final String imageUrl;

    private final List<DevicesListDeviceProvidersResponseDeviceProvidersItemProviderCategoriesItem> providerCategories;

    private DevicesListDeviceProvidersResponseDeviceProvidersItem(
            String deviceProviderName,
            String displayName,
            String imageUrl,
            List<DevicesListDeviceProvidersResponseDeviceProvidersItemProviderCategoriesItem> providerCategories) {
        this.deviceProviderName = deviceProviderName;
        this.displayName = displayName;
        this.imageUrl = imageUrl;
        this.providerCategories = providerCategories;
    }

    @JsonProperty("device_provider_name")
    public String getDeviceProviderName() {
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
    public List<DevicesListDeviceProvidersResponseDeviceProvidersItemProviderCategoriesItem> getProviderCategories() {
        return providerCategories;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DevicesListDeviceProvidersResponseDeviceProvidersItem
                && equalTo((DevicesListDeviceProvidersResponseDeviceProvidersItem) other);
    }

    private boolean equalTo(DevicesListDeviceProvidersResponseDeviceProvidersItem other) {
        return deviceProviderName.equals(other.deviceProviderName)
                && displayName.equals(other.displayName)
                && imageUrl.equals(other.imageUrl)
                && providerCategories.equals(other.providerCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.deviceProviderName, this.displayName, this.imageUrl, this.providerCategories);
    }

    @Override
    public String toString() {
        return "DevicesListDeviceProvidersResponseDeviceProvidersItem{" + "deviceProviderName: " + deviceProviderName
                + ", displayName: " + displayName + ", imageUrl: " + imageUrl + ", providerCategories: "
                + providerCategories + "}";
    }

    public static DeviceProviderNameStage builder() {
        return new Builder();
    }

    public interface DeviceProviderNameStage {
        DisplayNameStage deviceProviderName(String deviceProviderName);

        Builder from(DevicesListDeviceProvidersResponseDeviceProvidersItem other);
    }

    public interface DisplayNameStage {
        ImageUrlStage displayName(String displayName);
    }

    public interface ImageUrlStage {
        _FinalStage imageUrl(String imageUrl);
    }

    public interface _FinalStage {
        DevicesListDeviceProvidersResponseDeviceProvidersItem build();

        _FinalStage providerCategories(
                List<DevicesListDeviceProvidersResponseDeviceProvidersItemProviderCategoriesItem> providerCategories);

        _FinalStage addProviderCategories(
                DevicesListDeviceProvidersResponseDeviceProvidersItemProviderCategoriesItem providerCategories);

        _FinalStage addAllProviderCategories(
                List<DevicesListDeviceProvidersResponseDeviceProvidersItemProviderCategoriesItem> providerCategories);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DeviceProviderNameStage, DisplayNameStage, ImageUrlStage, _FinalStage {
        private String deviceProviderName;

        private String displayName;

        private String imageUrl;

        private List<DevicesListDeviceProvidersResponseDeviceProvidersItemProviderCategoriesItem> providerCategories =
                new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(DevicesListDeviceProvidersResponseDeviceProvidersItem other) {
            deviceProviderName(other.getDeviceProviderName());
            displayName(other.getDisplayName());
            imageUrl(other.getImageUrl());
            providerCategories(other.getProviderCategories());
            return this;
        }

        @Override
        @JsonSetter("device_provider_name")
        public DisplayNameStage deviceProviderName(String deviceProviderName) {
            this.deviceProviderName = deviceProviderName;
            return this;
        }

        @Override
        @JsonSetter("display_name")
        public ImageUrlStage displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        @Override
        @JsonSetter("image_url")
        public _FinalStage imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        @Override
        public _FinalStage addAllProviderCategories(
                List<DevicesListDeviceProvidersResponseDeviceProvidersItemProviderCategoriesItem> providerCategories) {
            this.providerCategories.addAll(providerCategories);
            return this;
        }

        @Override
        public _FinalStage addProviderCategories(
                DevicesListDeviceProvidersResponseDeviceProvidersItemProviderCategoriesItem providerCategories) {
            this.providerCategories.add(providerCategories);
            return this;
        }

        @Override
        @JsonSetter(value = "provider_categories", nulls = Nulls.SKIP)
        public _FinalStage providerCategories(
                List<DevicesListDeviceProvidersResponseDeviceProvidersItemProviderCategoriesItem> providerCategories) {
            this.providerCategories.clear();
            this.providerCategories.addAll(providerCategories);
            return this;
        }

        @Override
        public DevicesListDeviceProvidersResponseDeviceProvidersItem build() {
            return new DevicesListDeviceProvidersResponseDeviceProvidersItem(
                    deviceProviderName, displayName, imageUrl, providerCategories);
        }
    }
}