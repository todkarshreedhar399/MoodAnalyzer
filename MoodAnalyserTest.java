import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest
{
    @Test
    public void iAmIn_SadMood_ShouldReturn_sad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("sad" , mood);
    }

    @Test
    public void iAmIn_anyMood_ShouldReturn_happy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy" , mood);
    }

    @Test
    public void null_Should_Return_Happy_Mood() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy" , mood);
    }

}
