package controlFlow.exercises;

import java.util.Scanner;

public class InputCalculator
{
	public static void main(String[] args)
	{
		inputThenPrintSumAndAverage();
	}

	// write code here
	public static void inputThenPrintSumAndAverage()
	{
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int validNumbers = 0;
		long average = 0;

		while (true)
		{
			try
			{
				int numberEntered = Integer.parseInt(input.nextLine());
				sum += numberEntered;
				validNumbers++;
				average = Math.round((double) sum / validNumbers);
			}
			catch (Exception e)
			{
				System.out.println("SUM = " + sum + " AVG = " + average);
				break;
			}
		}
		input.close();
	}
}
