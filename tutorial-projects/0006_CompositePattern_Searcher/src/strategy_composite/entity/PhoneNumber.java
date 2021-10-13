package strategy_composite.entity;

public class PhoneNumber
{
	String regionalCode;
	String number;
	
	public PhoneNumber(String regionalCode, String number)
	{
		this.regionalCode = regionalCode;
		this.number = number;
	}
	
	public String getRegionalCode() { return this.regionalCode; }
	public String getNumber() { return this.number; }
}
