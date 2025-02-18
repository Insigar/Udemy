package controlFlow;

public class ChallengeForLoop
{
	public static void main(String[] args)
	{
		double amount = 100;
		for (double i = 7.5; i <= 10; i += 0.25)
		{
			System.out.println(calculateInterest(amount, i));
		}
	}

	public static double calculateInterest(double amount, double interestRate)
	{
		return amount * (interestRate / 100);
	}
}
