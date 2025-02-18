package objectOrientedProgramming.exercises;

public class Point
{
	// write code here
	private int x;
	private int y;

	public Point()
	{
	}

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public double distance(Point point)
	{
		return Math.sqrt((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.y));
	}

	public double distance()
	{
		return this.distance(new Point(0, 0));
	}

	public double distance(int x, int y)
	{
		return distance(new Point(x, y));
	}

	public int getX()
	{
		return this.x;
	}

	public int getY()
	{
		return this.y;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public void setY(int y)
	{
		this.y = y;
	}
}