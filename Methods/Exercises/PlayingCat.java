package methods.exercises;

public class PlayingCat
{
	// write code here
	public static boolean isCatPlaying(boolean summer, int temperature)
	{
		int lowerLimit = 25;
		int upperLimit = 35;
		if (summer)
		{
			upperLimit = 45;
		}
		if (temperature >= lowerLimit && temperature <= upperLimit)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}