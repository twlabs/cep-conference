package com.thoughtworks.cep.conference

class FeatureToggles(val enabledFeatures: List<String> = listOf()) {

    fun isEnabled(feature: String): Boolean {
        return enabledFeatures.contains(feature)
    }
}