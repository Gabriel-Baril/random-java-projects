package strategy_composite.entity;

public class Owner
{
	private int age;
	private String firstName;
	private String lastName;
	private PhoneNumber phoneNumber;
	
	public Owner(int age, String firstName, String lastName, PhoneNumber phoneNumber)
	{
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public PhoneNumber getPhoneNumber() { return phoneNumber; } 
	public String getLastName() { return lastName; } 
	public String getFirstName() { return firstName; } 
	public int getAge() { return age; }
	
	public String toString()
	{
		return firstName;
	}
}
