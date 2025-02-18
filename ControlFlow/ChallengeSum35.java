package controlFlow;

public class ChallengeSum35
{
	public static void main(String[] args)
	{
		// Everything in main because Tim Buchalka asked me to
		int sum = 0;
		int numbersCount = 0;

		// for (int i = 1; i <= 1000 && numbersCount < 5; i++)
		for (int i = 1; i <= 1000; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.println("Found a number: " + i);
				numbersCount++;
				sum += i;
			}
			if (numbersCount >= 5)
			{
				break;
			}
		}
		System.out.println("Sum = " + sum);
	}
}
