package com.thoughtworks.cep.conference;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.requireNonNullElseGet;

public class FeatureToggles {
    private final List<String> enabledFeature;

    public FeatureToggles(List<String> enabledFeatures) {
        this.enabledFeature = requireNonNullElseGet(enabledFeatures, ArrayList::new);
    }

    public boolean isEnabled(String feature) {
        return this.enabledFeature.contains(feature);
    }
}
