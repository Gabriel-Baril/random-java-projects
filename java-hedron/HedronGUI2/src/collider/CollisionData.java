package collider;

import java.util.ArrayList;
import java.util.List;

import math.Vec2;

public class CollisionData
{
	private List<Vec2> intersectionPoints;
	
	public CollisionData()
	{
		intersectionPoints = new ArrayList<Vec2>();
	}
	
	public void addIntersectionPoint(Vec2 intersectionPoint)
	{
		intersectionPoints.add(intersectionPoint);
	}
	
	public boolean removeIntersectionPoint(Vec2 intersectionPoint)
	{
		return intersectionPoints.remove(intersectionPoint);
	}
	
	public boolean hasCollision()
	{
		return intersectionPoints.size() != 0;
	}
}
