package objectOrientedProgramming.challengeInheritance;

public class SalariedEmployee extends Employee
{
	private double annualSalary;
	private boolean isRetired = false;

	void retire()
	{
		this.isRetired = true;
	}

	@Override
	double collectPay()
	{
		return annualSalary / 12;
	}
}