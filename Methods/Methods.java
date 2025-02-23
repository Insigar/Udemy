package methods;

public class Methods
{
	public static void main(String[] args)
	{
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		calculateScore(gameOver, score, levelCompleted, bonus);

		calculateScore(true, 10000, 8, 200);
	}

	static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
	{
		int finalScore = score;

		if (gameOver)
		{
			finalScore += (levelCompleted * bonus);
			finalScore += 1000;
			System.out.printf("Your score is: %d\n", finalScore);
		}
	}
}
