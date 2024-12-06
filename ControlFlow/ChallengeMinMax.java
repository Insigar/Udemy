package ControlFlow;

import java.util.Scanner;

public class ChallengeMinMax
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		// double minNumber = Double.MAX_VALUE;
		// double maxNumber = Double.MIN_VALUE;
		double minNumber = 0;
		double maxNumber = 0;
		int validNumbersEntered = 0;

		while (true)
		{
			System.out.println("Enter a number or any character to quit");
			try
			{

				double numberEntered = Double.parseDouble(userInput.nextLine());
				if (validNumbersEntered == 0) // Thanks Buchalka
				{
					minNumber = maxNumber = numberEntered;
				}
				// if (numberEntered > maxNumber)
				else if (numberEntered > maxNumber)
				{
					maxNumber = numberEntered;
				}
				// if (numberEntered < minNumber)
				else if (numberEntered < minNumber)
				{
					minNumber = numberEntered;
				}
				validNumbersEntered++;
			}
			catch (Exception e)
			{
				System.out.println("Exiting...");
				break;
			}

		}

		if (validNumbersEntered > 0)
		{
			String output = "Of the %d numbers you entered your minimum Value is %f and your maximum value is %f";
			System.out.printf(output, validNumbersEntered, minNumber, maxNumber);
		}
		userInput.close();
	}
}
