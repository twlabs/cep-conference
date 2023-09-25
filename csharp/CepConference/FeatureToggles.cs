namespace CepConference;

public class FeatureToggles
{
    private readonly ICollection<string> _enabledFeatures;

    public FeatureToggles(ICollection<string> enabledFeatures)
    {
        _enabledFeatures = enabledFeatures;
    }

    public bool IsEnabled(string feature)
    {
        return _enabledFeatures.Contains(feature);
    }
}