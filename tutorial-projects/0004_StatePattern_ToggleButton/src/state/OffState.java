package state;

public class OffState extends ToggleButtonState
{
	@Override
	public void push(ToggleButton toggleButton)
	{
		System.out.println("ON");
		toggleButton.setState(new OnState());
	}
}
