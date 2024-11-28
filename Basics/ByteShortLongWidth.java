package Basics;

public class ByteShortLongWidth
{
	public static void main(String[] args)
	{
		// 8-Bit width
		System.out.printf("Byte ranges from %,d to %,d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);

		// 16-Bit width
		System.out.printf("Short ranges from %,d to %,d%n", Short.MIN_VALUE, Short.MAX_VALUE);

		// 64-Bit width
		System.out.printf("Long ranges from %,d to %,d%n", Long.MIN_VALUE, Long.MAX_VALUE);
		System.out.println("Long has a width of " + Long.SIZE + " bit");

		// 100 is int by default, so has to be forced to be long
		long longValue = 100L; // L/l is not case-sensitive
		System.out.println("longValue: " + longValue);

		long bigLongValue = (long) Integer.MAX_VALUE + 1; // Manual casting: has to be cast as long, otherwise just overflows as int
		long bigLongLiteral = 2147483648L; // needs the suffix
		System.out.println("bigLongValue: " + bigLongValue);
		System.out.println("bigLongLiteral: " + bigLongLiteral);
	}
}
