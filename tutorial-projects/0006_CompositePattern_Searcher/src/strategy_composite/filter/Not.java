package strategy_composite.filter;

public class Not<T> implements IFilter<T>
{
	IFilter<T> filterer;
	
	@SuppressWarnings("unchecked")
	public Not(IFilter<T> filterer)
	{
		this.filterer = filterer;
	}
	
	@Override
	public boolean filter(T entity)
	{
		return !filterer.filter(entity);
	}
}
