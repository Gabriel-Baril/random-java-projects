package algebra.connector;

public class Substraction implements Connector 
{
	public String getType()
	{
		return "Substraction";
	}

	public String print() {
		return " - ";
	}
}
