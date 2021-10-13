package strategy_composite.filter;

public interface IFilter<T>
{
	public boolean filter(T entity);
}
