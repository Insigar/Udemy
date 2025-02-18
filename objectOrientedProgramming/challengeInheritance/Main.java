package objectOrientedProgramming.challengeInheritance;

public class Main
{
	public static void main(String[] args)
	{
		Employee testEmployee = new Employee("TestEmployee", "13/02/1991", 756896, "22/01/2024");
		System.out.println(testEmployee);
		testEmployee.getAge();
		testEmployee.collectPay();
	}
}