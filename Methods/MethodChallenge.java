package Methods;

public class MethodChallenge
{
	public static void main(String[] args)
	{
		displayHighScorePosition("Insigar", calculateHighScorePosition(1500));
		displayHighScorePosition("Jeffrey", calculateHighScorePosition(1000));
		displayHighScorePosition("Alfred", calculateHighScorePosition(500));
		displayHighScorePosition("Batman", calculateHighScorePosition(100));
		displayHighScorePosition("Daniele", calculateHighScorePosition(25));
	}

	public static void displayHighScorePosition(String player, int position)
	{
		System.out.printf("%s managed to get into position %d on the high score list.\n", player, position);
	}

	public static int calculateHighScorePosition(int score)
	{
		int position = 4;

		if (score >= 1000)
		{
			position = 1;
		}
		else if (score >= 500)
		{
			position = 2;
		}
		else if (score >= 100)
		{
			position = 3;
		}

		return position;
	}

	// Arguably better, since it's in order
	public static int calculateHighScorePositionAlternative(int score)
	{
		if (score >= 1000)
		{
			return 1;
		}
		else if (score >= 500)
		{
			return 2;
		}
		else if (score >= 100)
		{
			return 3;
		}
		return 4;
	}
}
