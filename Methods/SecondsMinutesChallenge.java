package Methods;

public class SecondsMinutesChallenge
{
	public static void main(String[] args)
	{
		testValues();
	}

	public static void testValues()
	{
		System.out.println(getDurationString(60));
		System.out.println(getDurationString(161));
		System.out.println(getDurationString(7599));
		System.out.println(getDurationString(7601));
		System.out.println(getDurationString(-3601));
		System.out.println(getDurationString(3800));
		System.out.println(getDurationString(4500));

		System.out.println("Next");

		System.out.println(getDurationString(0, 1));
		System.out.println(getDurationString(1, 1));
		System.out.println(getDurationString(10000, 10000));
		System.out.println(getDurationString(-12, 69));
		System.out.println(getDurationString(12, 59));
		System.out.println(getDurationString(120, 59));
		System.out.println(getDurationString(12, 60));
	}

	public static String getDurationString(int seconds)
	{
		if (seconds < 0)
		{
			return "Invalid Values";
		}

		int hours = seconds / 3600;
		int minutes = (seconds % 3600) / 60;
		seconds = (seconds % 3600) % 60;
		return String.format("%dh %dm %ds", hours, minutes, seconds);
	}

	public static String getDurationString(int minutes, int seconds)
	{
		if ((seconds < 0 || seconds > 59) || minutes < 0)
		{
			return "Invalid Values";
		}

		int hours = minutes / 60;
		minutes %= 60;
		return String.format("%dh %dm %ds", hours, minutes, seconds);
	}
}
