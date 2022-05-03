package com.thoughtworks.cep.conference

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FeatureTogglesTest {
    @Test
    fun returnsTrueWhenFeatureIsEnabled() {
        val enabledFeature = "feature1"
        val toggleService = FeatureToggles(listOf(enabledFeature))
        assertTrue(toggleService.isEnabled(enabledFeature))
    }

    @Test
    fun returnsFalseWhenFeatureIsNotEnabled() {
        val toggleService = FeatureToggles()
        assertFalse(toggleService.isEnabled("feature1"))
    }
}