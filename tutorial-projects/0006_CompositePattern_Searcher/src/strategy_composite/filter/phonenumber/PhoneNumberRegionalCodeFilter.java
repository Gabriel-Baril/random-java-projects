package strategy_composite.filter.phonenumber;

import strategy_composite.entity.PhoneNumber;
import strategy_composite.filter.IFilter;

public class PhoneNumberRegionalCodeFilter implements IFilter<PhoneNumber>
{
	String regionalCodeToMatch;
	
	public PhoneNumberRegionalCodeFilter(String regionalCodeToMatch)
	{
		this.regionalCodeToMatch = regionalCodeToMatch;
	}
	
	public boolean filter(PhoneNumber phoneNumber)
	{
		return phoneNumber.getRegionalCode().equals(this.regionalCodeToMatch);
	}
}
