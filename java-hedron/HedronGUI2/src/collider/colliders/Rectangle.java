package collider.colliders;

import collider.ColliderType;
import collider.CollisionData;
import math.Vec2;

public class Rectangle extends Collider
{
	private Vec2 position;
	private double width;
	private double height;
	
	public Rectangle(Vec2 postion, double width, double height)
	{
		super(ColliderType.RECTANGLE);
		this.position = new Vec2(position);
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public Rectangle(double x, double y, double width, double height)
	{
		super(ColliderType.RECTANGLE);
		this.position = new Vec2(x, y);
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public Rectangle(double width, double height)
	{
		super(ColliderType.RECTANGLE);
		this.position = new Vec2(0, 0);
		this.setWidth(width);
		this.setHeight(height);
	}

	@Override
	public CollisionData collide(Point point) {
		return point.collide(this);
	}

	@Override
	public CollisionData collide(Circle circle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CollisionData collide(Rectangle rectangle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CollisionData collide(Polygon polygon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CollisionData collide(Ellipse ellipse) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getWidth() { return width; } 
	public void setWidth(double width) { this.width = width; } 
	public double getHeight() { return height; } 
	public void setHeight(double height) { this.height = height; }
}

