import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest
{

    /*
     * for checking Sad mood
     * when found SAD in message
     */
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
    /*
     * for checking happy mood
     * when not found SAD in message
     */
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

    /*
     * for throwing MoodAnalyzerException and display message
     * when message is null
     */
    @Test
    public void when_Entered_Null_Should_Throw_MoodAnalyzerException()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try
        {
            moodAnalyser.analyseMood();

        } catch (MoodAnalyserException e)
        {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
            System.out.println(e.getMessage());
        }
    }
    /**
     * for throwing MoodAnalyzerException and display message
     * when message is empty
     */
    @Test
    public void when_Empty_Should_Return_Message()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try
        {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e)
        {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
            System.out.println(e.getMessage());
        }
    }

}
