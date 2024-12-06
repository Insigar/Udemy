package ControlFlow;

import java.util.Scanner;

public class ChallengeReadUserInput
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);

		System.out.println("Sum of numbers entered = " + userInputLoopIntegers(userInput));
		System.out.println("Sum of numbers entered = " + userInputLoopDouble(userInput));

		userInput.close();
	}

	public static int userInputLoopIntegers(Scanner userInput)
	{
		int validNumbersEntered = 0;
		int sumNumbers = 0;

		while (validNumbersEntered < 5)
		{
			System.out.printf("Enter number #%d:", validNumbersEntered + 1);
			try
			{
				int numberEntered = Integer.parseInt(userInput.nextLine());
				if (numberEntered < 0)
				{
					System.out.println("Number must be positive");
					continue;
				}
				sumNumbers += numberEntered;
				validNumbersEntered++;
			}
			catch (Exception e)
			{
				System.out.println("Invalid number");
			}
		}
		return sumNumbers;
	}

	public static double userInputLoopDouble(Scanner userInput)
	{
		int validNumbersEntered = 0;
		double sumNumbers = 0;

		while (validNumbersEntered < 5)
		{
			System.out.printf("Enter number #%d:", validNumbersEntered + 1);
			try
			{
				double numberEntered = Double.parseDouble(userInput.nextLine());
				if (numberEntered < 0)
				{
					System.out.println("Number must be positive");
					continue;
				}
				sumNumbers += numberEntered;
				validNumbersEntered++;
			}
			catch (Exception e)
			{
				System.out.println("Invalid number");
			}
		}
		return sumNumbers;
	}
}
