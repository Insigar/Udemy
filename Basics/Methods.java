package Basics;

public class Methods
{
	public static void main(String[] args)
	{
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int finalScore = score;

		gameOverScreen(gameOver, finalScore, levelCompleted, bonus);

		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		finalScore = score;

		gameOverScreen(gameOver, finalScore, levelCompleted, bonus);

	}

	static void gameOverScreen(boolean gameOver, int finalScore, int levelCompleted, int bonus)
	{
		if (gameOver)
		{
			finalScore += (levelCompleted * bonus);
			finalScore += 1000;
			System.out.printf("Your score is: %d\n", finalScore);
		}
	}
}
