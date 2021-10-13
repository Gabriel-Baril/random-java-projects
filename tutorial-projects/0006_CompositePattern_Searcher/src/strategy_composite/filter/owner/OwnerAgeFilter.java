package strategy_composite.filter.owner;

import strategy_composite.entity.Owner;
import strategy_composite.filter.IFilter;

public class OwnerAgeFilter implements IFilter<Owner>
{
	int ageToMatch;
	
	public OwnerAgeFilter(int ageToMatch)
	{
		this.ageToMatch = ageToMatch;
	}
	
	public boolean filter(Owner owner)
	{
		return owner.getAge() == ageToMatch;
	}
}