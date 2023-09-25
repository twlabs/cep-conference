namespace CepConference.Tests;

public class FeatureTogglesTest
{
    [Test]
    public void ReturnsTrueWhenFeatureIsEnabled()
    {
        var enabledFeature = "feature1";
        var toggleService = new FeatureToggles(new[] {enabledFeature});
        Assert.That(toggleService.IsEnabled(enabledFeature), Is.True);
    }

    [Test]
    public void ReturnsFalseWhenFeatureIsNotEnabled()
    {
        var toggleService = new FeatureToggles(Array.Empty<string>());
        Assert.That(toggleService.IsEnabled("feature1"), Is.False);
    }
}