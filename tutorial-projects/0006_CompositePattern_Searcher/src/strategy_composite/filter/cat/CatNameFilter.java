package strategy_composite.filter.cat;

import strategy_composite.entity.Cat;
import strategy_composite.filter.IFilter;

public class CatNameFilter implements IFilter<Cat>
{
	String nameToMatch;
	
	public CatNameFilter(String nameToMatch)
	{
		this.nameToMatch = nameToMatch;
	}
	
	public boolean filter(Cat cat)
	{
		return cat.getName().equals(this.nameToMatch);
	}
}
