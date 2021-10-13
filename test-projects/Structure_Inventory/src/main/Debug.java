package main;

public class Debug {
	private static Debug instance;
	
	public Debug() {}
	
	public void printSource(Object obj){
		System.out.println("OBJECT_ENTITY[" + obj.getClass().getSimpleName() + "::" + ((obj instanceof InventoryStorable) ? ((InventoryStorable)obj).name : "") + "]");
	}
	
	public String printSourceString(Object obj){
		return "OBJECT_ENTITY[" + obj.getClass().getSimpleName() + "::" + ((obj instanceof InventoryStorable) ? ((InventoryStorable)obj).name : "") + "]";
	}
	
	public static Debug getInstance(){
		if(instance == null)
			instance = new Debug();
		return instance;
	}
	
}
