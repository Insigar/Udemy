package ControlFlow;

public class ChallengeDigitSum
{
	public static void main(String[] args)
	{
		System.out.println(sumDigits(1234));
		System.out.println(sumDigits(-125));
		System.out.println(sumDigits(4));
		System.out.println(sumDigits(32123));
	}

	public static int sumDigits(int number)
	{
		if (number < 0)
		{
			return -1;
		}

		int sumDigits = 0;
		while (number > 9)
		{
			sumDigits += number % 10;
			number /= 10;
		}
		sumDigits += number;
		return sumDigits;
	}
}
