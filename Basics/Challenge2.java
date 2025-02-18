package basics;

public class Challenge2
{

	public static enum enumTest
	{
		Monday, Friday, Saturday
	}

	public static void main(String[] args)
	{
		double firstDoubleValue = 20.00;
		double secondDoubleValue = 80.00;
		double doubleTotal = (firstDoubleValue + secondDoubleValue) * 100;
		System.out.println("doubleTotal: " + doubleTotal);
		int remainderDoubleTotal = (int) (doubleTotal % 40);
		boolean noRemainder = remainderDoubleTotal == 0 ? true : false; // I hate ternaries
		// boolean noRemainder = false;
		// if (remainderDoubleTotal == 0)
		// {
		// noRemainder = true;
		// }
		System.out.println("noRemainder: " + noRemainder);
		if (!noRemainder)
		{
			System.out.println("Got some remainder");
		}

		System.out.println(enumTest.Friday);
	}
}
