package strategy_composite.filter.owner;

import strategy_composite.entity.Owner;
import strategy_composite.filter.IFilter;

public class OwnerFirstNameFilter implements IFilter<Owner>
{
	String firstNameToMatch;
	
	public OwnerFirstNameFilter(String firstNameToMatch)
	{
		this.firstNameToMatch = firstNameToMatch;
	}
	
	public boolean filter(Owner owner)
	{
		return owner.getFirstName().equals(this.firstNameToMatch);
	}
}
