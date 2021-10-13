package main;

public class Food extends InventoryStorable implements Usable{
	int hp;
	
	public Food(String name,int hp){
		super(name);
		this.hp = hp;
	}

	public String getInfo() {
		return super.name + "[HP[+" + hp + "]]";
	}
}
