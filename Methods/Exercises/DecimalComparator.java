package Methods.Exercises;

public class DecimalComparator
{
	// write code here
	public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber)
	{
		if ((int) (firstNumber * 1000) == (int) (secondNumber * 1000))
		{
			return true;
		}
		return false;
	}
}
