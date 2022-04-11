package com.thoughtworks.cep.conference;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class FeatureTogglesTest {

    @Test
    public void returnsTrueWhenFeatureIsEnabled() {
        String enabledFeature = "feature1";

        FeatureToggles toggleService = new FeatureToggles(Arrays.asList(enabledFeature));

        assertTrue(toggleService.isEnabled(enabledFeature));
    }

    @Test
    public void returnsFalseWhenFeatureIsNotEnabled() {
        FeatureToggles toggleService = new FeatureToggles(Arrays.asList());

        assertFalse(toggleService.isEnabled("feature1"));
    }
}
