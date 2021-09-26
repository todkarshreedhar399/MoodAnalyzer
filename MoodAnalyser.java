public class MoodAnalyser
{
    private String message;
    public MoodAnalyser(String message)
    {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try
        {
            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalyserException("Please enter valid message");
        }
    }
}
