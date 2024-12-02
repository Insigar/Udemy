package ControlFlow;

public class ChallengeNatoAlphabet
{
	public static void main(String[] args)
	{
		char inputChar = 'A';

		switch (inputChar)
		{
			case 'A':
				System.out.println(inputChar + " = Alfa");
				break;
			case 'B':
				System.out.println(inputChar + " = Bravo");
				break;
			case 'C':
				System.out.println(inputChar + " = Charlie");
				break;
			case 'D':
				System.out.println(inputChar + " = Delta");
				break;
			case 'E':
				System.out.println(inputChar + " = Echo");
				break;
			default:
				System.out.println(inputChar + " = other character");
				break;
		}

		switch (inputChar)
		{
			case 'A' -> System.out.println(inputChar + " = Alfa");
			case 'B' -> System.out.println(inputChar + " = Bravo");
			case 'C' -> System.out.println(inputChar + " = Charlie");
			case 'D' -> System.out.println(inputChar + " = Delta");
			case 'E' -> System.out.println(inputChar + " = Echo");
			default -> System.out.println(inputChar + " = other character");
		}
	}
}
