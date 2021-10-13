package state;

public class Property
{
	private String name;
	private int price;
	private int rent;
	private Player owner;
	PropertyState saleState;
	
	public Property(String name)
	{
		this.name = name;
		this.price = 100;
		this.rent = 10;
		this.saleState = new PropertyNotOwnedState();
	}
	
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
	public int getRent() { return this.rent; }
	public Player getOwner() { return this.owner; }
	
	public void setOwner(Player p)
	{
		this.owner = p;
		this.saleState = new PropertyOwnedState();
	}
	
	public void landOnBy(Player p)
	{
		System.out.print(p.getName() + " landed on " + this.name);
		this.saleState.landOnBy(p, this);
		System.out.println(p.getName() + " has " + p.getMoney() + " dollars");
	}
}
