package collider.colliders;

import collider.ColliderType;
import collider.CollisionData;
import collider.IllegalDefaultPointCollisionOffsetException;
import math.Vec2;

public class Point extends Collider
{
	private static double DEFAULT_POINT_COLLISION_OFFSET = 0.1d;
	
	private Vec2 position;
	private double collisionOffset = DEFAULT_POINT_COLLISION_OFFSET;
	
	public Point(Vec2 position) {
		super(ColliderType.POINT);
		this.position = new Vec2(position);
	}
	
	public Point(double x, double y) {
		super(ColliderType.POINT);
		this.position = new Vec2(x, y);
	}
	
	public Point() {
		super(ColliderType.POINT);
		this.position = new Vec2(0, 0);
	}

	@Override
	public CollisionData collide(Point point)
	{
		CollisionData output = new CollisionData();
		if(point.position.getX() == this.position.getX() &&
		   point.position.getY() == this.position.getY())
		{
			output.addIntersectionPoint(point.position);
		}
		return output;
	}

	@Override
	public CollisionData collide(Circle circle)
	{
		CollisionData output = new CollisionData();
		return null;
	}

	@Override
	public CollisionData collide(Rectangle rectangle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CollisionData collide(Polygon polygon) {
		System.out.println("POINT-POLYGON collision");
		return null;
	}

	@Override
	public CollisionData collide(Ellipse ellipse) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Vec2 getPosition() { return new Vec2(position); }
	public double getCollisionOffset() { return collisionOffset; }
	public static double getDefaultPointCollisionOffset() { return Point.DEFAULT_POINT_COLLISION_OFFSET; }

	public void setPosition(Vec2 position) { this.position = position; }
	public void setCollisionOffset(double collisionOffset) { this.collisionOffset = collisionOffset; }
	public static void setDefaultPointCollisionOffset(double defaultPointCollisionOffset)
	{
		validateDefaultPointCollisionOffset(defaultPointCollisionOffset);
		Point.DEFAULT_POINT_COLLISION_OFFSET = defaultPointCollisionOffset;
	}
	
	private static void validateDefaultPointCollisionOffset(double defaultPointCollisionOffset)
	{
		if(defaultPointCollisionOffset < 0)
		{
			throw new IllegalDefaultPointCollisionOffsetException(defaultPointCollisionOffset);
		}
	}
}

