package Methods;

public class ChallengeOverloadedMethods
{
	public static void main(String[] args)
	{
		System.out.println("In centimeters: " + convertToCentimeters(68));
		System.out.println("In centimeters: " + convertToCentimeters(5, 8));
	}

	public static double convertToCentimeters(int inches)
	{
		double centimeters = inches * 2.54;
		return centimeters;
		// return inches * 2.54;
	}

	public static double convertToCentimeters(int feet, int inches)
	{
		inches += (feet * 12);
		return convertToCentimeters(inches);
		// return convertToCentimeters(inches + (feet * 12));
	}
}
