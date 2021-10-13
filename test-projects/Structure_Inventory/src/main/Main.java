package main;

public class Main {
	
	public static void main(String args[]){
		Inventory inventory = new Inventory();
		
		inventory.addItem(new Food("Apple", 35));
		inventory.addItem(new Weapon("LongSword",100,200));
		inventory.addItem(new Food("Banana", 20));
		inventory.addItem(new Food("Pineaple", 40));
		inventory.addItem(new Food("Strawberry", 10));
		inventory.addItem(new Weapon("ShortSwort",50,150));
		inventory.addItem(new Weapon("Rapier",200,400));
		inventory.addItem(new Food("Orange", 25));
		inventory.addItem(new Weapon("LongSword ",100,200));
		
		
		Player player = new Player(200, new Weapon("WoodSword",75,50),inventory);
		
		
		player.getEffects().add(new Effect("Speed",3));
		player.getEffects().add(new Effect("Regeneration",2));
		
		player.getInfo();
		
		player.use(player.getInventory().getFoods().get(3));
		player.use(player.getInventory().getItems().get(1));
		
		player.getInfo();
		
	}
}
