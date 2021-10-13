package state;

public class MainAfter
{
	public static void main(String[] args)
	{
		Fan fan = new Fan();
		for(int i = 0;i < 10;i++)
			fan.pull();
	}
}
