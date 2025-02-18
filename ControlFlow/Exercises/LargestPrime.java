package controlFlow.exercises;

public class LargestPrime
{
	// write code here
	public static int getLargestPrime(int number)
	{
		if (number < 2)
		{
			return -1;
		}

		int factor = 2;
		for (int i = 2; i <= Math.sqrt(number); i++)
		{
			if (number % i == 0)
			{
				factor = i;
				while (number % i == 0)
				{
					number /= i;
				}
			}
		}
		if (number == 1)
		{
			return factor;
		}
		else
		{
			return number;
		}
	}
}
