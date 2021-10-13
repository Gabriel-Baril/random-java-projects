package state;

public class MediumSpeedState extends FanState
{

	@Override
	public void pull(Fan fan)
	{
		System.out.println("Medium speed");
		fan.setState(new MaximumSpeedState());
	}

}
