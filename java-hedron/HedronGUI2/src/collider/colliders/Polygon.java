package collider.colliders;

import java.util.ArrayList;
import java.util.List;

import collider.ColliderType;
import collider.CollisionData;
import math.Vec2;

public class Polygon extends Collider
{
	private List<Vec2> verticesPosition;
	
	public Polygon() {
		super(ColliderType.POLYGON);
		this.verticesPosition = new ArrayList<Vec2>();
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
	
	public void addVertex(Vec2 vertex)
	{
		verticesPosition.add(vertex);
	}
}

