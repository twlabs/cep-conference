namespace CepConference.Tests;

public class ConferenceTest
{
    private readonly Conference _conference = new();
    
    [Test]
    public void Fails()
    {
        Assert.Fail("...start here!");
    }
}