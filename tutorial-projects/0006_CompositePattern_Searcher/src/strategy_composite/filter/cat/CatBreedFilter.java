package strategy_composite.filter.cat;

import strategy_composite.entity.Cat;
import strategy_composite.filter.IFilter;

public class CatBreedFilter implements IFilter<Cat>
{
	String breedToMatch;
	
	public CatBreedFilter(String breedToMatch)
	{
		this.breedToMatch = breedToMatch;
	}
	
	public boolean filter(Cat cat)
	{
		return cat.getName().equals(this.breedToMatch);
	}
}
