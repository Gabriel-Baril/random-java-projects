package state_singleton;

public class OffState extends ToggleButtonState
{
	private static OffState instance = null;
	private OffState() {}
	
	
	@Override
	public void push(ToggleButton toggleButton)
	{
		System.out.println("ON");
		toggleButton.setState(OnState.instance());
	}

	public static OffState instance()
	{
		if(instance == null)
			OffState.instance = new OffState();
		return OffState.instance;
	}
}
