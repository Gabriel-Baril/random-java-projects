package strategy_composite.entity;

public class Cat
{
	private int age;
	private String name;
	private String breed;
	private Owner owner;
	
	public Cat(int age, String name, String breed, Owner owner)
	{
		this.age = age;
		this.name = name;
		this.breed = breed;
	}
	
	public int getAge() { return this.age; }
	public String getName() { return this.name; }
	public String getBreed() { return this.breed; }
}
