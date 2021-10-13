package _nopattern;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("NO PATTERN TOGGLE BUTTON EXAMPLE");
		ToggleButton button = new ToggleButton(false);
		for(int i = 0;i < 10;i++)
		{
			button.push();
		}
	}
}
