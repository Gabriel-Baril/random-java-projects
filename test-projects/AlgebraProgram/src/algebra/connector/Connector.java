package algebra.connector;

public interface Connector {
	
	public String print();
	public default String getType()
	{
		return "Connector";
	}
}
