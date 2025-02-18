package objectOrientedProgramming.challengeBankAccount;

public class Main
{
	public static void main(String[] args)
	{
		BankAccount testAccount = new BankAccount();
		testAccount.depositFunds(-6953.96);
		testAccount.depositFunds(6953.96);
		System.out.printf("Account balance: %.2f\n", testAccount.getAccountBalance());

		testAccount.withdrawFunds(-123);
		testAccount.withdrawFunds(7000);
		testAccount.withdrawFunds(5000);
		System.out.printf("Account balance: %.2f\n", testAccount.getAccountBalance());

		System.out.println("Trying new account");

		BankAccount testAccount2 = new BankAccount(12000);
		testAccount2.depositFunds(-6953.96);
		testAccount2.depositFunds(6953.96);
		System.out.printf("Account balance: %.2f\n", testAccount2.getAccountBalance());

		testAccount2.withdrawFunds(-123);
		testAccount2.withdrawFunds(7000);
		testAccount2.withdrawFunds(5000);
		System.out.printf("Account balance: %.2f\n", testAccount2.getAccountBalance());
	}
}
