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
            if(message.length() == 0)
            {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"Please enter valid message");
            }
            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";
        } catch (NullPointerException e )
        {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Please enter valid message");
        }
    }
}
