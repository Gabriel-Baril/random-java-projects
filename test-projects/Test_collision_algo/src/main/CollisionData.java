package main;

public class CollisionData {
	private Entity e1,e2;
	
	public CollisionData(Entity e1,Entity e2){
		this.e1 = e1;
		this.e2 = e2;
	}
	
	public String toString(){
		return "[E1 : " + getE1().toString() + "];[E2 : " + getE2().toString() + "]";
	}

	public Entity getE1() {return e1;}
	public Entity getE2() {return e2;}
}
