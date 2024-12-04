package ControlFlow.Exercises;

public class NumberPalindrome
{
	public static void main(String[] args)
	{
		System.out.println(isPalindrome(123));
		// System.out.println(isPalindrome(-121));
		// System.out.println(isPalindrome(12321));
		// System.out.println(isPalindrome(-12321));
		// System.out.println(isPalindrome(1323141));
	}

	// write code here
	public static boolean isPalindrome(int number)
	{
		if (number < 0)
		{
			number *= -1;
		}

		int originalNumber = number;
		int reversedNumber = 0;
		int lastDigit = 0;

		while (number > 9)
		{
			lastDigit = number % 10;
			reversedNumber = (reversedNumber + lastDigit) * 10;
			number /= 10;
		}
		reversedNumber += number;
		if (reversedNumber == originalNumber)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}