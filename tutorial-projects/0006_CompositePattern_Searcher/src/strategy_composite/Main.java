package strategy_composite;

import java.util.ArrayList;
import java.util.List;

import strategy_composite.entity.Owner;
import strategy_composite.entity.PhoneNumber;
import strategy_composite.filter.And;
import strategy_composite.filter.IFilter;
import strategy_composite.filter.Not;
import strategy_composite.filter.Or ;
import strategy_composite.filter.owner.OwnerAgeFilter;
import strategy_composite.filter.owner.OwnerLastNameFilter;
import strategy_composite.filter.owner.OwnerPhoneNumberRegionalCodeFilter;

public class Main
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		OwnerAgeFilter filterAge1 = new OwnerAgeFilter(18);
		OwnerAgeFilter filterAge2 = new OwnerAgeFilter(32);
		
		OwnerLastNameFilter filterLastName = new OwnerLastNameFilter("B1");
		OwnerPhoneNumberRegionalCodeFilter filterRegionalCode = new OwnerPhoneNumberRegionalCodeFilter("581");
		
		Or<Owner> orFilter = new Or<>(filterAge1, filterAge2);
		And<Owner> andFilter = new And<>(orFilter, filterLastName, filterRegionalCode);
		Not<Owner> filter = new Not<>(andFilter);
		
		ArrayList<Owner> owners = new ArrayList<>();
		owners.add(new Owner(32, "A1", "B1", new PhoneNumber("418", "1111111")));
		owners.add(new Owner(18, "A2", "B1", new PhoneNumber("581", "1231232")));
		owners.add(new Owner(32, "A3", "B3", new PhoneNumber("581", "1111111")));
		owners.add(new Owner(18, "A4", "B6", new PhoneNumber("418", "2222222")));
		owners.add(new Owner(18, "A5", "B1", new PhoneNumber("581", "1234465")));
		owners.add(new Owner(27, "A6", "B3", new PhoneNumber("418", "1111111")));
		owners.add(new Owner(64, "A7", "B3", new PhoneNumber("581", "4444444")));
		owners.add(new Owner(64, "A8", "B3", new PhoneNumber("418", "2222222")));
		
		System.out.println(search(owners, filter));
	}
	
	public static List<Owner> search(ArrayList<Owner> owners, IFilter<Owner> filter)
	{
		ArrayList<Owner> output = new ArrayList<Owner>();
		for(Owner owner : owners)
		{
			if(filter.filter(owner))
			{
				output.add(owner);
			}
		}
		return output;
	}
}
