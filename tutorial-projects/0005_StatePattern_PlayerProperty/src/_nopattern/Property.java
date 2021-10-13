package _nopattern;

public class Property
{
	private String name;
	private int price;
	private int rent;
	private Player owner;
	
	public Property(String name)
	{
		this.name = name;
		this.price = 100;
		this.rent = 10;
	}
	
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
	public int getRent() { return this.rent; }
	public Player getOwner() { return this.owner; }
	
	public void setOwner(Player p)
	{
		this.owner = p;
	}
	
	public void landOnBy(Player p)
	{
		System.out.print(p.getName() + " landed on " + this.name);
		if(this.getOwner() == null)
		{
			System.out.print(" - not owned\n" + p.getName());
			if(p.getMoney() < this.getPrice())
			{
				System.out.println(" does not have enough money to purchase");
			}
			else
			{
				p.debit(this.getPrice());
				this.setOwner(p);
				System.out.println(" bought " + this.getName());
			}
		}
		else
		{
			System.out.println(" - owned by " + this.getOwner().getName());
			if(p != this.getOwner())
			{
				p.debit(this.getRent());
				this.getOwner().credit(this.getRent());
				System.out.println(this.getOwner().getName() + " now has "
						+ this.getOwner().getMoney() + " dollars");
			}
		}
		System.out.println(p.getName() + " has " + p.getMoney() + " dollars");
	}
}
