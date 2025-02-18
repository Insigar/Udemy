package controlFlow.exercises;

public class NumberOfDaysInMonth
{
	// write code here
	public static boolean isLeapYear(int year)
	{
		if (year < 1 || year > 9999)
		{
			return false;
		}

		if ((year % 4) == 0)
		{
			if ((year % 100) == 0)
			{
				if ((year % 400) == 0)
				{
					return true;
				}
			}
			else
			{
				return true;
			}
		}
		return false;
	}

	// public static int returnFeb(int year)
	// {
	// 	if (isLeapYear(year))
	// 	{
	// 		return 29;
	// 	}
	// 	else
	// 	{
	// 		return 28;
	// 	}
	// }

	public static int getDaysInMonth(int month, int year)
	{
		if (month < 1 || month > 12)
		{
			return -1;
		}
		if (year < 1 || year > 9999)
		{
			return -1;
		}

		return switch (month)
		{
			case 1, 3, 5, 7, 8, 10, 12 -> 31;
			case 2 -> {
				if (isLeapYear(year))
				{
					yield 29;
				}
				else
				{
					yield 28;
				}
			}
			// case 2 -> returnFeb(year);
			default -> 30;
		};

		// int days = 30;

		// switch (month)
		// {
		// 	case 1:
		// 	case 3:
		// 	case 5:
		// 	case 7:
		// 	case 8:
		// 	case 10:
		// 	case 12:
		// 		days = 31;
		// 		break;
		// 	case 2:
		// 		if (isLeapYear(year))
		// 		{
		// 			days = 29;
		// 		}
		// 		else
		// 		{
		// 			days = 28;
		// 		}
		// 		break;
		// 	default:
		// 		break;
		// }
		// return days;
	}
}