package strategy_composite.filter;

public class And<T> implements IFilter<T>
{
	IFilter<T>[] filters;
	
	@SuppressWarnings("unchecked")
	public And(IFilter<T>... filters)
	{
		this.filters = filters;
	}
	
	@Override
	public boolean filter(T entity) {
		boolean isMatching = true;
		for(IFilter<T> current : this.filters)
		{
			if(!current.filter(entity))
			{
				isMatching = false;
				break;
			}
		}
		return isMatching;
	}
}
