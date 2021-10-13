package strategy_composite.filter.owner;

import strategy_composite.entity.Owner;
import strategy_composite.entity.PhoneNumber;
import strategy_composite.filter.IFilter;
import strategy_composite.filter.phonenumber.PhoneNumberRegionalCodeFilter;

public class OwnerPhoneNumberRegionalCodeFilter implements IFilter<Owner>
{
	String regionalCodeToMatch;
	
	public OwnerPhoneNumberRegionalCodeFilter(String regionalCodeToMatch)
	{
		this.regionalCodeToMatch = regionalCodeToMatch;
	}
	
	public boolean filter(Owner owner)
	{
		PhoneNumberRegionalCodeFilter s1 = new PhoneNumberRegionalCodeFilter(regionalCodeToMatch);
		return s1.filter(owner.getPhoneNumber());
	}
}
