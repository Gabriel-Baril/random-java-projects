package behaviors;


public interface HBehavior 
{
	public abstract boolean triggerCondition();
	public abstract void effect();
	public default void test()
	{
		if(this.triggerCondition())
			this.effect();
	}
}
