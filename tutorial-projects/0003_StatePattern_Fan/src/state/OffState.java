package state;

public class OffState extends FanState
{

	@Override
	public void pull(Fan fan)
	{
		System.out.println("Fan off");
		fan.setState(new MinimumSpeedState());
	}

}
