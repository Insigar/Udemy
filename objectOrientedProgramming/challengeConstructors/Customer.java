package objectOrientedProgramming.challengeConstructors;

public class Customer
{
	private String name;
	private double creditLimit;
	private String email;

	public Customer(String name, double creditLimit, String email)
	{
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public Customer()
	{
		this("DefaultName", "default@email.com"); // omit credit limit to call 2-arg constructor to only hardcode it in one place
	}

	public Customer(String name, String email)
	{
		this(name, -1, email);
	}

	public String getName()
	{
		return name;
	}

	public double getCreditLimit()
	{
		return creditLimit;
	}

	public String getEmail()
	{
		return email;
	}

}
