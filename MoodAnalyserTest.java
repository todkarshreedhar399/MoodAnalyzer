
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest
{
    @Test
    public void iAmIn_SadMood_ShouldReturn_sad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("sad" , mood);
    }

}
