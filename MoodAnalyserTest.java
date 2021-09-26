import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest
{
    MoodAnalyser moodAnalyser = null;

    @Before
    public void objectCreation()
    {
        moodAnalyser = new MoodAnalyser();
    }

    @Test
    public void iAmIn_SadMood_Should_Return_sad()
    {
        String mood = moodAnalyser.analyseMood("This is sad message");
        Assert.assertEquals("sad" , mood);
        System.out.println(mood);
    }
}
