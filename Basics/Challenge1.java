package Basics;

public class Challenge1
{
	public static void main(String[] args)
	{
		byte byteValue = 64;
		short shortValue = 69;
		int intValue = 100;
		long longValue = 50_000 + 10 * (byteValue + shortValue + intValue);
		System.out.println(longValue);

		short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
		System.out.println(shortTotal);
	}
}
