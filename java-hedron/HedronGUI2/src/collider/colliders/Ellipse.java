package collider.colliders;

import collider.ColliderType;
import collider.CollisionData;
import collider.IllegalRadiusException;
import math.Vec2;

public class Ellipse extends Collider
{
	private Vec2 centerPos;
	private double horizontalRadius;
	private double verticalRadius;
	
	
	public Ellipse(Vec2 centerPos, double horizontalRadius, double verticalRadius) {
		super(ColliderType.ELLIPSE);
		this.setCenterPos(new Vec2(centerPos));
		this.setHorizontalRadius(horizontalRadius);
		this.setVerticalRadius(verticalRadius);
	}
	
	public Ellipse(double x, double y, double horizontalRadius, double verticalRadius) {
		super(ColliderType.ELLIPSE);
		this.setCenterPos(new Vec2(x, y));
		this.setHorizontalRadius(horizontalRadius);
		this.setVerticalRadius(verticalRadius);
	}
	
	public Ellipse(double horizontalRadius, double verticalRadius) {
		super(ColliderType.ELLIPSE);
		this.setCenterPos(new Vec2(0, 0));
		this.setHorizontalRadius(horizontalRadius);
		this.setVerticalRadius(verticalRadius);
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
	public double getHorizontalRadius() { return horizontalRadius; }
	public double getVerticalRadius() { return verticalRadius; }

	public void setCenterPos(Vec2 centerPos) { this.centerPos = centerPos; }
	
	public void setHorizontalRadius(double horizontalRadius)
	{
		validateRadius(horizontalRadius);
		this.horizontalRadius = horizontalRadius;
	}

	public void setVerticalRadius(double verticalRadius)
	{
		validateRadius(verticalRadius);
		this.verticalRadius = verticalRadius;
	}
	
	private void validateRadius(double radius)
	{
		if(radius < 0)
		{
			throw new IllegalRadiusException(radius);
		}
	}
}
