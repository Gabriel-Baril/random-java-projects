package state_singleton;

public class OnState extends ToggleButtonState
{
	private static OnState instance = null;
	private OnState() {}
	
	@Override
	public void push(ToggleButton toggleButton)
	{
		System.out.println("OFF");
		toggleButton.setState(OffState.instance());
	}
	
	public static OnState instance()
	{
		if(instance == null)
			OnState.instance = new OnState();
		return OnState.instance;
	}
}
