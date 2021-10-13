package twostate;

public class ToggleButton
{
	private ToggleButtonState toggleState;
	private boolean isActivated;
	
	public ToggleButton(ToggleButtonState toggleState, boolean isActivated)
	{
		this.toggleState = toggleState;
		this.isActivated = isActivated;
	}
	
	public ToggleButton()
	{
		this.toggleState = new OffState();
		this.isActivated = true;
	}
	
	public void push()
	{
		if(isActivated)
		{
			toggleState.push(this);
		}
	}
	
	public void setToggleState(ToggleButtonState state)
	{
		this.toggleState = state;
	}
}
