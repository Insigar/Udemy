package basics;

// Eclipse formatter off because we're using the eclipse style.xml
public class FormatterEclipseOnOff
{
	public static void main(String[] args)
	{
		// @formatter:off
		if(true){System.out.println("Formatting off");}
		// @formatter:on
		if (true)
		{
			System.out.println("Formatting on");
		}
	}
}
