package strategy_composite.filter.owner;

import strategy_composite.entity.Owner;
import strategy_composite.filter.IFilter;

public class OwnerLastNameFilter implements IFilter<Owner>
{
	String lastNameToMatch;
	
	public OwnerLastNameFilter(String lastNameToMatch)
	{
		this.lastNameToMatch = lastNameToMatch;
	}
	
	public boolean filter(Owner owner)
	{
		return owner.getLastName().equals(this.lastNameToMatch);
	}
}
