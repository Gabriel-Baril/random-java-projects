package algebra.connector;

public class Division implements Connector
{

	public String getType()
	{
		return "Division";
	}
	
	public String print() {
		return " / ";
	}
}
