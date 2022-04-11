const FeatureToggleService = require("./FeatureToggleService")

describe("FeatureToggleService", () => {
    it("returns true when feature is enabled", () => {
        const Feature1 = "feature1";

        const featureToggleService = new FeatureToggleService([Feature1]);

        expect(featureToggleService.isEnabled(Feature1)).toEqual(true);
    });

    it("returns false when feature is not enabled", () => {
        const featureToggleService = new FeatureToggleService([]);

        expect(featureToggleService.isEnabled("feature1")).toEqual(false);
    });
});