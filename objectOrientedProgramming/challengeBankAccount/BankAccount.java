package objectOrientedProgramming.challengeBankAccount;

public class BankAccount
{
	private int accountNumber;
	private double accountBalance;
	private String customerName;
	private String email;
	private String phoneNumber;

	// Default empty constructor has to be explicitly created if other constructors are here
	public BankAccount()
	{
		this(10000); // Constructor-chaining: special "this" that calls another constructor in the same class
		// this MUST be the first line in the constructor
	}

	public BankAccount(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}

	public void depositFunds(double depositAmount)
	{
		if (depositAmount < 0)
		{
			System.out.println("Can't deposit negative amount of funds");
			return;
		}
		this.accountBalance += depositAmount;
	}

	public void withdrawFunds(double withdrawAmount)
	{
		if (withdrawAmount < 0)
		{
			System.out.println("Can't withdraw negative amount of funds");
			return;
		}
		if (withdrawAmount > this.accountBalance)
		{
			System.out.println("Not enough funds in bank account account.");
			return;
		}
		this.accountBalance -= withdrawAmount;
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance()
	{
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

}
