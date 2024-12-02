package Methods.Exercises;

public class MinutesToYearsDaysCalculator
{
	// write code here
	public static void printYearsAndDays(long minutes)
	{
		if (minutes < 0)
		{
			System.out.println("Invalid Value");
			return;
		}
		long years = minutes / (60 * 24 * 365);
		long yearsRemainder = minutes % (60 * 24 * 365);
		long days = yearsRemainder / (60 * 24);
		System.out.println(minutes + " min = " + years + " y and " + days + " d");
	}
}
