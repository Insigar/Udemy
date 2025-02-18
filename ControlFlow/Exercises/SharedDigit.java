package controlFlow.exercises;

public class SharedDigit
{
	public static void main(String[] args)
	{
		System.out.println(hasSharedDigit(12, 13));
	}

	// write code here
	public static boolean hasSharedDigit(int firstNumber, int secondNumber)
	{
		boolean isFirstNumberInRange = firstNumber >= 10 && firstNumber <= 99;
		boolean isSecondNumberInRange = secondNumber >= 10 && secondNumber <= 99;
		if (!(isFirstNumberInRange && isSecondNumberInRange))
		{
			return false;
		}

		int firstNumDigit = 0;
		int secondNumDigit = 0;
		int originalSecondNumber = secondNumber;

		while (firstNumber > 0)
		{
			secondNumber = originalSecondNumber;
			firstNumDigit = firstNumber % 10;
			while (secondNumber > 0)
			{
				secondNumDigit = secondNumber % 10;
				if (firstNumDigit == secondNumDigit)
				{
					return true;
				}
				secondNumber /= 10;
			}
			firstNumber /= 10;
		}
		return false;
	}
}
