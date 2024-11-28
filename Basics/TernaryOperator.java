package Basics;

public class TernaryOperator
{
	public static void main(String[] args)
	{
		String makeOfCar = "Volkswagen";
		// boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true;

		// better for strings, because it compares content of string not reference
		boolean isDomestic = makeOfCar.equals("Volkswagen") ? false : true;
		if (!isDomestic)
		{
			System.out.println("Made it just to remember this kind of statement with a bool check inside declaration");
		}
	}
}
