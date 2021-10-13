package _nopattern;

public class Main
{
	public static void main(String[] args)
	{
		Player p1 = new Player("Gab", 90);
		Player p2 = new Player("Max", 500);
		Property prop = new Property("Property1");
		prop.landOnBy(p1);
		prop.landOnBy(p2);
		prop.landOnBy(p1);
		prop.landOnBy(p2);
		prop.landOnBy(p1);
	}
}
