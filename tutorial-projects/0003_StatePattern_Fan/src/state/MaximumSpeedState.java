package state;

public class MaximumSpeedState extends FanState
{

	@Override
	public void pull(Fan fan)
	{
		System.out.println("Maximum speed");
		fan.setState(new OffState());	
	}

}
