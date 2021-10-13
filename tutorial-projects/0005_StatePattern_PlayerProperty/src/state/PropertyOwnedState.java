package state;

public class PropertyOwnedState extends PropertyState
{

	@Override
	public void landOnBy(Player player, Property property)
	{
		System.out.println(" - owned by " + property.getOwner().getName());
		if(player != property.getOwner())
		{
			player.debit(property.getRent());
			property.getOwner().credit(property.getRent());
			System.out.println(property.getOwner().getName() + " now has " + property.getOwner().getMoney() + " dollars");
		}
	}

}
