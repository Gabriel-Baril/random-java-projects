package collider.colliders;

import collider.ColliderType;
import collider.CollisionData;
import collider.IllegalColliderTypeException;

public abstract class Collider
{
	private ColliderType colliderType;
	
	protected Collider(ColliderType colliderType)
	{
		this.colliderType = colliderType;
	}
	
	public abstract CollisionData collide(Point point);
	public abstract CollisionData collide(Circle circle);
	public abstract CollisionData collide(Rectangle rectangle);
	public abstract CollisionData collide(Polygon polygon);
	public abstract CollisionData collide(Ellipse ellipse);
	
	public CollisionData collide(Collider collider)
	{
		switch(collider.getColliderType())
		{
			case CIRCLE: 	this.collide((Circle) 	collider); break;
			case ELLIPSE: 	this.collide((Ellipse)	collider); break;
			case POINT:     this.collide((Point)	collider); break;
			case POLYGON:   this.collide((Polygon)  collider); break;
			case RECTANGLE: this.collide((Rectangle)collider); break;
		}
		throw new IllegalColliderTypeException(collider.getColliderType());
	}
	
	public final ColliderType getColliderType() { return colliderType; }
}
