package main;

public class Weapon extends InventoryStorable{
	double damage;
	int durability;
	
	public Weapon(String name,double damage,int durability){
		super(name);
		this.damage = damage;
		this.durability = durability;
	}
	
	public String getInfo(){
		return super.name + "[DAMAGE[" + damage+ "],DURABILITY[" + durability + "]]";
	}
}
