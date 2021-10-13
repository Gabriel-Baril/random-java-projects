package _nopattern;

public class ToggleButton
{
	private boolean isPushed;
	
	public ToggleButton(boolean isPushed)
	{
		this.isPushed = isPushed;
	}
	
	public void push()
	{
		if(isPushed)
		{
			System.out.println("OFF");
			isPushed = false;
		}
		else
		{
			System.out.println("ON");
			isPushed = true;
		}
	}
}
