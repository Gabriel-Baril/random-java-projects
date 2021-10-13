package main;

public abstract class InventoryStorable {
	String name;
	public InventoryStorable(String name){
		this.name = name;
	}
	
	public String getInfo(){
		return "Undefined";
	}
}
