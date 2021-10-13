package src;

public class Ball
{
	public static final float MAX_SPEED = 7.0f;
	
	private float x, y;
	private float radius;
	
	public Ball(float x, float y, float radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public float getX()
	{
		return this.x;
	}
	
}
