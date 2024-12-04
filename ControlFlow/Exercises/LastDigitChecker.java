package ControlFlow.Exercises;

public class LastDigitChecker
{
	// write code here
	public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber)
	{

		if (!(isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)))
		{
			return false;
		}

		if (firstNumber % 10 == secondNumber % 10 || secondNumber % 10 == thirdNumber % 10 || firstNumber % 10 == thirdNumber % 10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean isValid(int number)
	{
		if (number >= 10 && number <= 1000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
