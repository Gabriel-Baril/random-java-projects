package strategy_composite.filter.owner;

import strategy_composite.entity.Owner;
import strategy_composite.filter.IFilter;
import strategy_composite.filter.phonenumber.PhoneNumberNumberFilter;

public class OwnerPhoneNumberNumberFilter implements IFilter<Owner>
{
	String numberToMatch;
	
	public OwnerPhoneNumberNumberFilter(String numberToMatch)
	{
		this.numberToMatch = numberToMatch;
	}
	
	public boolean filter(Owner owner)
	{
		PhoneNumberNumberFilter numberSearcher = new PhoneNumberNumberFilter(numberToMatch);
		return numberSearcher.filter(owner.getPhoneNumber());
	}
}