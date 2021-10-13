package strategy_composite.filter.cat;

import strategy_composite.entity.Cat;
import strategy_composite.filter.IFilter;

public class CatAgeFilter implements IFilter<Cat>
{
	int ageToMatch;
	
	public CatAgeFilter(int ageToMatch)
	{
		this.ageToMatch = ageToMatch;
	}
	
	public boolean filter(Cat cat)
	{
		return cat.getAge() == ageToMatch;
	}
}
