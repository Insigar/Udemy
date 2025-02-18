package controlFlow.exercises;

public class EvenDigitSum
{
	public static void main(String[] args)
	{
		System.out.println(getEvenDigitSum(121));
		System.out.println(getEvenDigitSum(123));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(466));
		System.out.println(getEvenDigitSum(-120));
		System.out.println(getEvenDigitSum(1));
		System.out.println(getEvenDigitSum(2));
		System.out.println(getEvenDigitSum(9));
	}

	// write code here
	public static int getEvenDigitSum(int number)
	{
		if (number < 0)
		{
			return -1;
		}

		int digit = 0;
		int sumEven = 0;

		while (number > 0)
		{
			digit = number % 10;
			if (digit % 2 == 0)
			{
				sumEven += digit;
			}
			number /= 10;
		}
		return sumEven;
	}
}
