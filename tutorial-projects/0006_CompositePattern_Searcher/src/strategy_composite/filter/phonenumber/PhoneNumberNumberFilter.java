package strategy_composite.filter.phonenumber;

import strategy_composite.entity.PhoneNumber;
import strategy_composite.filter.IFilter;

public class PhoneNumberNumberFilter implements IFilter<PhoneNumber>
{
	String numberToMatch;
	
	public PhoneNumberNumberFilter(String numberToMatch)
	{
		this.numberToMatch = numberToMatch;
	}
	
	public boolean filter(PhoneNumber phoneNumber)
	{
		return phoneNumber.getNumber().equals(this.numberToMatch);
	}
}
