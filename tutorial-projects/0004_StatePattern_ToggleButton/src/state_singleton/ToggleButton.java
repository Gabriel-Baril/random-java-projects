package state_singleton;

public class ToggleButton
{
	private ToggleButtonState state;
	
	public ToggleButton(ToggleButtonState state)
	{
		this.state = state;
	}
	
	public ToggleButton()
	{
		this.state = OffState.instance();
	}
	
	public void push()
	{
		state.push(this);
	}
	
	public void setState(ToggleButtonState state)
	{
		this.state = state;
	}
}
