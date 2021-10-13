package main;

import java.util.ArrayList;

public class Player {
	private Inventory inventory;
	private int life;
	private Weapon currentWeapon;
	private ArrayList<Effect> effects;

	public Player(int life,Weapon currentWeapon,Inventory inventory){
		this.setEffects(new ArrayList<Effect>());
		
		this.life = life;
		this.currentWeapon = currentWeapon;
		this.inventory = inventory;
		this.inventory.addItem(currentWeapon);
	}
	
	public void getInfo() {
		System.out.println("EFFECTS:");
		for(int i = 0;i < effects.size();i++) {
			System.out.println("  " + effects.get(i).getInfo());
		}
		this.inventory.getInfo();
	}

	public void use(InventoryStorable item){
		if(inventory.getItems().contains(item) && item instanceof Usable){
			if(item instanceof Food)
				this.heal((Food)item);
			
			System.out.println("Item used successfully: " + Debug.getInstance().printSourceString(item));
			inventory.removeItem(item);
		} else {
			System.out.println("Cannot use this item: " + Debug.getInstance().printSourceString(item));
		}
	}
	
	public void heal(Food food) {
		this.life += food.hp;
	}
	
	public Inventory getInventory() {return inventory;}
	public int getLife() {return life;}
	public void setLife(int life) {this.life = life;}
	public Weapon getCurrentWeapon() {return currentWeapon;}
	public void setCurrentWeapon(Weapon currentWeapon) {this.currentWeapon = currentWeapon;}
	public ArrayList<Effect> getEffects() {return effects;}
	public void setEffects(ArrayList<Effect> effects) {this.effects = effects;}
}
