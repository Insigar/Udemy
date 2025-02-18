package objectOrientedProgramming.challengeInheritance;

public class HourlyEmployee extends Employee
{
	private double hourlyPayRate;

	void getDoublePay()
	{
		this.hourlyPayRate *= 2;
	}
}
