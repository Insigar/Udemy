package controlFlow;

public class ChallengeDayOfTheWeek
{
	public static void main(String[] args)
	{
		printDayOfWeek(0);
		printDayOfWeek(1);
		printDayOfWeek(2);
		printDayOfWeek(3);
		printDayOfWeek(4);
		printDayOfWeek(5);
		printDayOfWeek(6);
		printDayOfWeek(-1);
		printDayOfWeek(7);

		printDayOfWeekIfStatement(0);
		printDayOfWeekIfStatement(1);
		printDayOfWeekIfStatement(2);
		printDayOfWeekIfStatement(3);
		printDayOfWeekIfStatement(4);
		printDayOfWeekIfStatement(5);
		printDayOfWeekIfStatement(6);
		printDayOfWeekIfStatement(-1);
		printDayOfWeekIfStatement(7);
	}

	public static void printDayOfWeek(int dayNumber)
	{
		// System.out.printf("Day %d = %s; ", dayNumber, returnDayOfTheWeek(dayNumber));
		// System.out.printf("If-Statement: Day %d = %s\n", dayNumber,
		// returnDayOfWeekIfStatement(dayNumber));

		String dayOfWeek = switch (dayNumber)
		{
			case 0 -> {
				yield "Sunday"; // Adding that just to remember it exists
			}
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			default -> "Invalid Day";
		};

		System.out.printf("Day %d = %s;\n", dayNumber, dayOfWeek);
	}

	public static void printDayOfWeekIfStatement(int dayNumber)
	{
		String dayOfWeek = "Invalid Day";
		if (dayNumber == 0)
		{
			dayOfWeek = "Sunday";
		}
		else if (dayNumber == 1)
		{
			dayOfWeek = "Monday";
		}
		else if (dayNumber == 2)
		{
			dayOfWeek = "Tuesday";
		}
		else if (dayNumber == 3)
		{
			dayOfWeek = "Wednesday";
		}
		else if (dayNumber == 4)
		{
			dayOfWeek = "Thursday";
		}
		else if (dayNumber == 5)
		{
			dayOfWeek = "Friday";
		}
		else if (dayNumber == 6)
		{
			dayOfWeek = "Saturday";
		}
		System.out.printf("Day %d = %s;\n", dayNumber, dayOfWeek);
	}

	// public static String returnDayOfTheWeek(int dayNumber)
	// {
	// 	return switch (dayNumber)
	// 	{
	// 		case 0 -> {
	// 			yield "Sunday"; // Adding that just to remember it exists
	// 		}
	// 		case 1 -> "Monday";
	// 		case 2 -> "Tuesday";
	// 		case 3 -> "Wednesday";
	// 		case 4 -> "Thursday";
	// 		case 5 -> "Friday";
	// 		case 6 -> "Saturday";
	// 		default -> "Invalid Day";
	// 	};
	// }

	// public static String returnDayOfWeekIfStatement(int dayNumber)
	// {
	// 	if (dayNumber == 0)
	// 	{
	// 		return "Sunday";
	// 	}
	// 	else if (dayNumber == 1)
	// 	{
	// 		return "Monday";
	// 	}
	// 	else if (dayNumber == 2)
	// 	{
	// 		return "Tuesday";
	// 	}
	// 	else if (dayNumber == 3)
	// 	{
	// 		return "Wednesday";
	// 	}
	// 	else if (dayNumber == 4)
	// 	{
	// 		return "Thursday";
	// 	}
	// 	else if (dayNumber == 5)
	// 	{
	// 		return "Friday";
	// 	}
	// 	else if (dayNumber == 6)
	// 	{
	// 		return "Saturday";
	// 	}
	// 	else
	// 	{
	// 		return "Invalid day";
	// 	}
	// }
}
