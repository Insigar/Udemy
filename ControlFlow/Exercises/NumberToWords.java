package ControlFlow.Exercises;

public class NumberToWords
{
	public static void main(String[] args)
	{
		// numberToWords(00);
		// System.out.println();
		// numberToWords(4);
		// System.out.println();
		// numberToWords(10);
		// System.out.println();
		// numberToWords(123);
		// System.out.println();
		// System.out.println(getDigitCount(123));
		// System.out.println(reverse(-123));

		// System.out.println(reverse(-2521));
	}

	public static void numberToWords(int number)
	{
		if (number < 0)
		{
			System.out.println("Invalid Value");
		}

		int digitCount = getDigitCount(number);
		number = reverse(number);

		int digit = 0;
		String digitWord = "";

		for (int i = 1; i <= digitCount; i++)
		{
			digit = number % 10;

			digitWord = switch (digit)
			{
				case 0 -> "Zero";
				case 1 -> "One";
				case 2 -> "Two";
				case 3 -> "Three";
				case 4 -> "Four";
				case 5 -> "Five";
				case 6 -> "Six";
				case 7 -> "Seven";
				case 8 -> "Eight";
				case 9 -> "Nine";
				default -> "Zero";
			};

			System.out.print(digitWord);
			if (i < digitCount)
			{
				System.out.print(" ");
			}
			number /= 10;
		}
	}

	public static int reverse(int number)
	{
		boolean isNumberNegative = number < 0;
		int reversedNumber = 0;
		int lastDigit = 0;

		if (isNumberNegative)
		{
			number *= -1;
		}
		while (number > 9)
		{
			lastDigit = number % 10;
			reversedNumber = (reversedNumber + lastDigit) * 10;
			number /= 10;
		}
		reversedNumber += number;
		if (isNumberNegative)
		{
			reversedNumber *= -1;
		}
		return reversedNumber;
	}

	public static int getDigitCount(int number)
	{
		if (number < 0)
		{
			return -1;
		}

		int digitCount = 1;
		while (number > 9)
		{
			digitCount++;
			number /= 10;
		}
		return digitCount;
	}
}