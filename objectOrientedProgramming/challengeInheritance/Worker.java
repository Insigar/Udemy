package objectOrientedProgramming.challengeInheritance;

public class Worker
{
	private String name;
	private String birthDate;
	private String endDate;

	public Worker()
	{

	}

	public Worker(String name, String birthDate)
	{
		this.name = name;
		this.birthDate = birthDate;
	}

	int getAge()
	{
		int currentYear = 2025;
		int birthYear = Integer.parseInt(birthDate.substring(6));
		return currentYear - birthYear;
	}

	double collectPay()
	{
		return 0.0;
	}

	void terminate(String endDate)
	{
		this.endDate = endDate;
	}

	@Override
	public String toString()
	{
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}

}