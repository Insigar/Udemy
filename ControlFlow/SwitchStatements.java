package controlFlow;

public class SwitchStatements
{
	public static void main(String[] args)
	{
		int switchValue = 1;

		// Traditional Switch Statement
		// Backwards compatible
		switch (switchValue)
		{
			case 1:
				System.out.println("Case 1 reached");
				break;
			case 2:
				System.out.println("Case 2 reached");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("Case 3, 4 or 5 reached");
				System.out.println("Actually case " + switchValue);
				break;
			default:
				System.out.println("Default case reached");
				break;
		}

		// Enhanced Switch Statement
		// After Java 14, fairly new
		switch (switchValue)
		{
			case 1 -> System.out.println("Case 1 reached");
			case 2 -> System.out.println("Case 2 reached");
			case 3, 4, 5 -> {
				System.out.println("Case 3, 4 or 5 reached");
				System.out.println("Actually case " + switchValue);
			}
			default -> System.out.println("Default case reached");
		}
		System.out.println(getQuarter("Aug"));
		System.out.println(getQuarter("August"));
	}

	public static String getQuarter(String month)
	{
		return switch (month)
		{
			case "Jan", "Feb", "Mar" -> "1st";
			case "Apr", "May", "Jun" -> "2nd";
			case "Jul", "Aug", "Sep" -> "3rd";
			case "Oct", "Nov", "Dec" -> "4th";
			default -> {
				String badResponse = month + " is a bad value";
				yield badResponse; // Here ye shall use yield
			}
		}; // Semicolon because of return;
	}
}
