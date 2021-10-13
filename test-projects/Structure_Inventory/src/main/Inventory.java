package main;

import java.util.ArrayList;

public class Inventory {
	private ArrayList<InventoryStorable> items;
	private ArrayList<Food> foods;
	private ArrayList<Weapon> weapons;
	public Inventory(){
		this.items = new ArrayList<>();
		this.foods = new ArrayList<>();
		this.weapons = new ArrayList<>();
	}
	
	public Inventory(ArrayList<InventoryStorable> c_inventory){
		this.items = new ArrayList<>(c_inventory);
	}
	
	public void getInfo(){
		System.out.println("FOODS:");
		for(int i = 0;i < foods.size();i++){
			System.out.println("  " + foods.get(i).getInfo());
		}
		System.out.println("WEAPONS:");
		for(int i = 0;i < weapons.size();i++){
			System.out.println("  " + weapons.get(i).getInfo());
		}
	}
	
	public void addItem(InventoryStorable item){
		items.add(item);
		if(item instanceof Food)
			foods.add((Food)item);
		else if(item instanceof Weapon)
			weapons.add((Weapon)item);
	}
	
	public void removeItem(InventoryStorable item){
		items.remove(item);
		if(item instanceof Food)
			foods.remove((Food)item);
		else if(item instanceof Weapon)
			weapons.remove((Weapon)item);
	}

	
	public ArrayList<InventoryStorable> getItems() {return items;}
	public ArrayList<Food> getFoods() {return foods;}
	public ArrayList<Weapon> getWeapons() {return weapons;}

}
