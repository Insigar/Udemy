package controlFlow.exercises;

public class FirstLastDigitSum
{
	// write code here
	public static int sumFirstAndLastDigit(int number)
	{
		if (number < 0)
		{
			return -1;
		}

		int firstDigit = 0;
		int lastDigit = number % 10;

		while (number > 9)
		{
			number /= 10;
		}
		firstDigit = number;
		return firstDigit + lastDigit;
	}
}
