package controlFlow.exercises;

public class FactorPrinter
{
	// write code here
	public static void printFactors(int number)
	{
		if (number < 1)
		{
			System.out.println("Invalid Value");
		}

		for (int i = 1; i <= number; i++)
		{
			if (number % i == 0)
			{
				System.out.print(i + " ");
			}
		}
	}
}