package algebra.connector;

public class Multiplication implements Connector 
{
	public String getType()
	{
		return "Multiplication";
	}

	public String print() {
		return " * ";
	}
}
