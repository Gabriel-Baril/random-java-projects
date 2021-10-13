package strategy_composite.filter;

public class Or<T> implements IFilter<T>
{
	IFilter<T>[] filters;
	
	@SuppressWarnings("unchecked")
	public Or(IFilter<T>... filters)
	{
		this.filters = filters;
	}
	
	@Override
	public boolean filter(T entity) {
		boolean isMatching = false;
		for(IFilter<T> current : this.filters)
		{
			if(current.filter(entity))
			{
				isMatching = true;
				break;
			}
		}
		return isMatching;
	}
}
