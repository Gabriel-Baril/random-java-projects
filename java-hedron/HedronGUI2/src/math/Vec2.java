package math;

public class Vec2
{
	private double x;
	private double y;
	
	public Vec2(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Vec2(Vec2 copy)
	{
		this.x = copy.x;
		this.y = copy.y;
	}

	public void setX(double x) 
	{ 
		this.x = x;
	}
	public double getX()
	{ 
		return this.x;
	}
	public int getXi()
	{
		return (int)getX();
	}
	public void setY(double y)
	{
		this.y = y;
	}
	public double getY()
	{ 
		return this.y;
	}
	public int getYi()
	{
		return (int)getY();
	}
}
