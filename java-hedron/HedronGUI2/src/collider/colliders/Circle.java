package collider.colliders;

import collider.ColliderType;
import collider.CollisionData;
import collider.IllegalRadiusException;
import math.Vec2;

public class Circle extends Collider
{
	private Vec2 centerPos;
	private double radius;
	

	public Circle(Vec2 centerPos, double radius) {
		super(ColliderType.CIRCLE);
		this.setCenterPos(new Vec2(centerPos));
		this.setRadius(radius);
	}
	
	public Circle(double x, double y, double radius) {
		super(ColliderType.CIRCLE);
		this.setCenterPos(new Vec2(x, y));
		this.setRadius(radius);
	}
	
	public Circle(double radius) {
		super(ColliderType.CIRCLE);
		this.setCenterPos(new Vec2(0, 0));
		this.setRadius(radius);
	}

	@Override
	public CollisionData collide(Point point)
	{
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

	public Vec2 getCenterPos() { return new Vec2(centerPos); }
	public double getRadius() { return radius; } 

	public void setCenterPos(Vec2 centerPos) { this.centerPos = centerPos; }
	public void setRadius(double radius)
	{
		validateRadius(radius);
		this.radius = radius;
	}
	
	private void validateRadius(double radius)
	{
		if(radius < 0)
		{
			throw new IllegalRadiusException(radius);
		}
	}
}
