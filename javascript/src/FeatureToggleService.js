class FeatureToggleService {
    constructor(enabledFeatures) {
        this.enabledFeatures = enabledFeatures;
    };

    isEnabled(feature) {
        return this.enabledFeatures.includes(feature)
    }
}

module.exports = FeatureToggleService;