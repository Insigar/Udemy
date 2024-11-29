package Methods.Exercises;

public class TeenNumberChecker
{
	// write code here
	public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber)
	{
		if (isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber))
		{
			return true;
		}
		return false;
	}

	public static boolean isTeen(int number)
	{
		if (number >= 13 && number <= 19)
		{
			return true;
		}
		return false;
	}
}
