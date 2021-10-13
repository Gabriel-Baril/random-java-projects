package state;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("STATE TOGGLE BUTTON EXAMPLE");
		ToggleButton button = new ToggleButton();
		for(int i = 0;i < 10;i++)
		{
			button.push();
		}
	}
}
