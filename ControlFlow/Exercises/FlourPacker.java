package controlFlow.exercises;

public class FlourPacker
{

	public static void main(String[] args)
	{
		System.out.println(canPack(5, 3, 24));
		System.out.println(canPack(0, 5, 5));
		System.out.println(canPack(2, 10, 18));
	}

	// write code here
	public static boolean canPack(int bigCount, int smallCount, int goal)
	{
		if (bigCount < 0 || smallCount < 0 || goal < 0)
		{
			return false;
		}

		while (bigCount > 0)
		{
			if (goal < 5)
			{
				break;
			}
			bigCount--;
			goal -= 5;
		}
		while (goal > 0 && smallCount > 0)
		{
			smallCount--;
			goal--;
		}

		return goal == 0;
	}
}
