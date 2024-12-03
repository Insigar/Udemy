package ControlFlow;

public class ChallengePrimeNumber
{
	public static void main(String[] args)
	{
		getThreePrimeNumbers(0, 50);
		getThreePrimeNumbers(17, 1000);
		getThreePrimeNumbers(317, 500);
		getThreePrimeNumbers(1001, 1500);
		getThreePrimeNumbers(-10, 10);
	}

	public static void getThreePrimeNumbers(int rangeStart, int rangeEnd)
	{
		if (rangeEnd > 1000 || rangeStart < -1000)
		{
			System.out.println("Numbers higher than 1000 or lower than -1000 are not allowed");
			return;
		}

		int primeNumberCounter = 0;

		for (int i = rangeStart; i <= rangeEnd; i++)
		{
			if (isPrime(i))
			{
				System.out.println("Found a prime number: " + i);
				primeNumberCounter++;
			}
			if (primeNumberCounter >= 3)
			{
				break;
			}
		}
	}

	public static boolean isPrime(int wholeNumber)
	{
		// negative numbers are by definition not prime but I still wanted them here
		if (wholeNumber < 0)
		{
			wholeNumber *= -1;
		}

		if (wholeNumber <= 2)
		{
			return wholeNumber == 2;
		}

		for (int divisor = 2; divisor <= wholeNumber / 2; divisor++)
		{
			if (wholeNumber % divisor == 0)
			{
				return false;
			}
		}

		return true;
	}
}
