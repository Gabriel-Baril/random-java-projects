package state;

public class MinimumSpeedState extends FanState
{

	@Override
	public void pull(Fan fan)
	{
		System.out.println("Minimum speed");
		fan.setState(new MediumSpeedState());
	}

}
