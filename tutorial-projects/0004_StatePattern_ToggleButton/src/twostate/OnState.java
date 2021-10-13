package twostate;

public class OnState extends ToggleButtonState
{
	@Override
	public void push(ToggleButton toggleButton)
	{
		System.out.println("OFF");
		toggleButton.setToggleState(new OffState());
	}
}
