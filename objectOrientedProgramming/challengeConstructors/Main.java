package objectOrientedProgramming.challengeConstructors;

public class Main
{
	public static void main(String[] args)
	{
		Customer fullCustomer = new Customer("Mr. Man", 100000, "Mr@Man.com");
		Customer emptyCustomer = new Customer();
		Customer noCreditMan = new Customer("No Credit Man", "NoCredit@Man.com");
		String fString = "%s: %s with a %.2f credit limit, reachable at %s\n";

		System.out.printf(fString, "Full Customer", fullCustomer.getName(), fullCustomer.getCreditLimit(), fullCustomer.getEmail());
		System.out.printf(fString, "Empty Customer", emptyCustomer.getName(), emptyCustomer.getCreditLimit(), emptyCustomer.getEmail());
		System.out.printf(fString, "No Credit Customer", noCreditMan.getName(), noCreditMan.getCreditLimit(), noCreditMan.getEmail());
	}
}
