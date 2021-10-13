package main;

import java.util.ArrayList;

public class Main{
	
	public static ArrayList<CollisionData> collide(ArrayList<Entity> entities){
		ArrayList<CollisionData> data = new ArrayList<CollisionData>();
		for(int i = 0;i < entities.size();i++){
			for(int j = 0;j < entities.size();j++){
				if(i != j){
					Entity c1 = entities.get(i);
					Entity c2 = entities.get(j);
					if (c1.getX() < c2.getX() + c2.getW() &&
						c1.getX() + c1.getW() > c2.getX() &&
						c1.getY() < c2.getY() + c2.getH() &&
						c1.getH() + c1.getY() > c2.getY()) {
						data.add(new CollisionData(entities.get(i),entities.get(j)));
					}
				}
			}
		}
		
		for(int i = 0;i < data.size();i++){
			for(int j = 0;j < data.size();j++){
				if(i != j){
					if(data.get(i).getE1().equals(data.get(j).getE2()) && data.get(i).getE2().equals(data.get(j).getE1())){
						data.remove(i);
					}
				}
			}
		}
		
		return data;
	} 

	public static void main(String[] args){
		ArrayList<Entity> entities = new ArrayList<Entity>();
		entities.add(new Entity(10,20,10,10));
		entities.add(new Entity(5,20,10,10));
		
		for(Entity e : entities){
			
		}
		
		System.out.println(collide(entities));
	}
}
