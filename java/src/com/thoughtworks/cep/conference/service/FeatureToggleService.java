package com.thoughtworks.cep.conference.service;

import java.util.List;

public class FeatureToggleService {
    private List<String> _enabledFeature;

    public FeatureToggleService(List<String> enabledFeatures) {
        this._enabledFeature = enabledFeatures;
    }

    public boolean IsEnabled(String feature) {
        return this._enabledFeature.contains(feature);
    }
}
