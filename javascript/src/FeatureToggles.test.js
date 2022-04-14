const FeatureToggles = require("./FeatureToggles")

describe("FeatureToggleService", () => {
    it("returns true when feature is enabled", () => {
        const Feature1 = "feature1";

        const featureToggles = new FeatureToggles([Feature1]);

        expect(featureToggles.isEnabled(Feature1)).toEqual(true);
    });

    it("returns false when feature is not enabled", () => {
        const featureToggles = new FeatureToggles([]);

        expect(featureToggles.isEnabled("feature1")).toEqual(false);
    });
});