package state;

public class PropertyNotOwnedState extends PropertyState
{

	@Override
	public void landOnBy(Player player, Property property)
	{
		System.out.print(" - not owned\n" + player.getName());
		if(player.getMoney() < property.getPrice())
		{
			System.out.println(" does not have enough money to purchase");
		}
		else
		{
			player.debit(property.getPrice());
			property.setOwner(player);
			System.out.println(" bought " + property.getName());
		}
	}
}
