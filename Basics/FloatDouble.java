package Basics;

import java.text.DecimalFormat;

public class FloatDouble
{
	public static void main(String[] args)
	{
		System.out.printf("Float ranges from %,f to %,f%n", Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf("Double ranges from %,f to %,f%n", Double.MIN_VALUE, Double.MAX_VALUE);

		int intValue = 5;
		float floatValue = 5f; // gives an error without f-suffix, cause double is default. Gotta love Java

		@SuppressWarnings("unused") // Supresses the "unused variable" warning (applies to the next statement or class)
		float floatValueCasted = (float) 5.25; // because Tim Buchalka wanted me to

		double doublevalue = 5;

		System.out.println("Int-Division: " + intValue / 3);
		System.out.println("Float-Division: " + floatValue / 3);
		System.out.println("Double-Division: " + doublevalue / 3);

		System.out.println("Wrong Double-Division: " + 5 / 3); // one of them has to explicitly be a double, else it's handled as ints
		System.out.println("Right Double-Division: " + 5d / 3);

		// Challenge Part: Yes the file is a mess
		DecimalFormat dFormat = new DecimalFormat("#.##");

		double poundDivisor = 0.45359237;
		String poundDivString = dFormat.format(poundDivisor);
		System.out.println(poundDivString);

		double pounds = 140.76, kilograms = pounds * poundDivisor;

		System.out.printf("%.2f pounds equals %.2f kilograms\n", pounds, kilograms);
		// System.out.println(String.format("Raw values: %f pounds; %f kilograms", pounds, kilograms));
		System.out.println("Raw values: " + pounds + " pounds; " + kilograms + " kilograms");
		// Note: for precise calculations "BigDecimal" exists
	}
}
