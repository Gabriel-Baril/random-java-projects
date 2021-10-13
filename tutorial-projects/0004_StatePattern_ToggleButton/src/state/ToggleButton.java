package state;

public class ToggleButton
{
	private ToggleButtonState state;
	
	public ToggleButton(ToggleButtonState state)
	{
		this.state = state;
	}
	
	public ToggleButton()
	{
		this.state = new OffState();
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
