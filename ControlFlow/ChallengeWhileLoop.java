package ControlFlow;

public class ChallengeWhileLoop
{
	public static void main(String[] args)
	{
		int i = 5;
		int numbersFound = 0;
		int evenNumbersFound = 0;

		// with multiple numbers incrementing I see now why it's recommended to increment at the start of the loop
		// still gonna leave it here for educational purposes
		while (i <= 20)
		{
			numbersFound++;
			if (isEvenNumber(i))
			{
				evenNumbersFound++;
				System.out.println("Even number is: " + i);
			}
			if (evenNumbersFound >= 5)
			{
				break;
			}
			i++;
		}
		System.out.println("Numbers found: " + numbersFound);

		// Buchalka
		int number = 4;
		int finishNumber = 20;
		int evenCount = 0;
		int oddCount = 0;

		while (number <= finishNumber)
		{
			number++;
			if (!isEvenNumber(number))
			{
				oddCount++;
				continue;
			}
			System.out.println("Even number " + number);
			evenCount++;
			if (evenCount >= 5)
			{
				break;
			}
		}

		System.out.println("Total odd numbers found = " + oddCount);
		System.out.println("Total even numbers found = " + evenCount);
	}

	public static boolean isEvenNumber(int number)
	{
		if (number % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
