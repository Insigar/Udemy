package Methods.Exercises;

public class MegaBytesConverter
{
	// write code here
	public static void printMegaBytesAndKiloBytes(int kiloBytes)
	{
		int megaBytes = kiloBytes / 1024;
		if (kiloBytes < 0)
		{
			System.out.println("Invalid Value");
		}
		else
		{
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytes % 1024 + " KB");
		}
	}

	public static void printMegaBytesAndKiloBytesAlt(int kiloBytes)
	{
		int megaBytes = kiloBytes / 1024;
		if (kiloBytes < 0)
		{
			System.out.println("Invalid Value");
			return;
		}
		System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytes % 1024 + " KB");
	}
}
