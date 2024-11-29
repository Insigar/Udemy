package Methods.Exercises;

public class BarkingDog
{
	// write code here
	public static boolean shouldWakeUp(boolean barking, int hourOfDay)
	{
		if (hourOfDay < 0 || hourOfDay > 23)
		{
			return false;
		}

		if (hourOfDay > 22 || hourOfDay < 8)
		{
			if (barking)
			{
				return true;
			}
		}
		return false;
	}
}