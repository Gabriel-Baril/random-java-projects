package _nopattern;

public class Fan
{
	private int fanSpeed;
	
	public Fan()
	{
		this.fanSpeed = 0;
	}
	
	public void pull()
	{
		if(fanSpeed == 0)
		{
			System.out.println("Minimum speed");
			this.fanSpeed = 1;
		} 
		else if(fanSpeed == 1)
		{
			System.out.println("Medium speed");
			this.fanSpeed = 2;
		}
		else if(fanSpeed == 2)
		{
			System.out.println("Max speed");
			this.fanSpeed = 3;
		}
		else if(fanSpeed == 3)
		{
			System.out.println("Turning off");
			this.fanSpeed = 0;
		}
	}
}
