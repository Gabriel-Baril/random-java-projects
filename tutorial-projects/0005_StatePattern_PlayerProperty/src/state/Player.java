package state;

public class Player
{
	private String name;
	private int money;
	
	public Player(String name, int money)
	{
		this.name = name;
		this.money = money;
	}
	
	public String getName() { return this.name; }
	public int getMoney() { return this.money; }
	
	public void debit(int moneyToDebit)
	{
		this.money -= moneyToDebit;
	}
	
	public void credit(int moneyToCredit)
	{
		this.money += moneyToCredit;
	}
}
