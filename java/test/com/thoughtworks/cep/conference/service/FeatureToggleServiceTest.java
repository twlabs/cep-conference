package com.thoughtworks.cep.conference.service;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class FeatureToggleServiceTest {

    @Test
    public void returnsTrueWhenFeatureIsEnabled() {
        String enabledFeature = "feature1";

        FeatureToggleService toggleService = new FeatureToggleService(Arrays.asList(enabledFeature));

        assertTrue(toggleService.IsEnabled(enabledFeature));
    }

    @Test
    public void returnsFalseWhenFeatureIsNotEnabled() {
        FeatureToggleService toggleService = new FeatureToggleService(Arrays.asList());

        assertFalse(toggleService.IsEnabled("feature1"));
    }
}
