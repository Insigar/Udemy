package basics;

public class PrimitiveDataTypes
{
	public static void main(String[] args)
	{
		int intMinValue = Integer.MIN_VALUE;
		int intMaxValue = Integer.MIN_VALUE;
		// 32 bit range
		System.out.println("Int ranges from " + intMinValue + " to " + intMaxValue);
		// Commas to get thousands separator
		System.out.printf("Int ranges from %,d to %,d%n", intMinValue, intMaxValue);
		// Also known as Integer wraparounds
		// Overflow
		System.out.println("Max value overflow: " + (intMaxValue + 1));
		// Underflow
		System.out.println("Min value underflow: " + (intMinValue - 1));

		int underscoredIntLiteral = 2_147_483_647;
		System.out.println("Underscored literal: " + underscoredIntLiteral);
	}
}
