package Basics;

public class Chars
{
	public static void main(String[] args)
	{
		char literalChar = 'D';
		char unicodeChar = '\u0044';
		char integerChar = 68;
		System.out.println(literalChar + " " + unicodeChar + " " + integerChar);

		// Challenge part
		char questionMarkChar = '?';
		char unicodeQM = '\u003F';
		char integerQM = 63;
		System.out.println("What" + questionMarkChar + unicodeQM + integerQM);
	}
}