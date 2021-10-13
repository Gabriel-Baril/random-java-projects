package state;

public class OnState extends ToggleButtonState
{
	@Override
	public void push(ToggleButton toggleButton)
	{
		System.out.println("OFF");
		toggleButton.setState(new OffState());
	}
}
