package state;

public class Fan
{
	private FanState fanState;
	
	public Fan()
	{
		this.fanState = new OffState();
	}
	
	public void pull()
	{
		fanState.pull(this);
	}
	
	public void setState(FanState state)
	{
		this.fanState = state;
	}
}
