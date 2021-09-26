import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest
{
    @Test
    public void iAmIn_SadMood_ShouldReturn_Sad() throws MoodAnalyserException
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String  mood = moodAnalyser.analyseMood();
        try
        {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e)
        {
            e.printStackTrace();
        }
        Assert.assertEquals("sad" , mood);
    }
    @Test
    public void iAmIn_anyMood_ShouldReturn_Happy() throws MoodAnalyserException
    {

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        try
        {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e)
        {
            e.printStackTrace();
        }
        Assert.assertEquals("Happy" , mood);
    }

    @Test
    public void when_Null_Should_Return_Message() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try
        {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e)
        {
            Assert.assertEquals("Please enter valid message", e.getMessage());
            System.out.println("Enter valid message");
        }


    }

}
