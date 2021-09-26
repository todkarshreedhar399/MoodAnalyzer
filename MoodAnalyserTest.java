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

    /*Method to return sad mood*/
    @Test
    public void iAmIn_SadMood_ShouldReturn_sad()
    {
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("sad" , mood);
        System.out.println(mood);
    }

    /*Method to return Happy mood*/
    @Test
    public void iAmIn_AnyMood_ShouldReturn_Happy()
    {
        String mood = moodAnalyser.analyseMood("I am in any mood");
        Assert.assertEquals("Happy" , mood);
        System.out.println(mood);
    }


}
