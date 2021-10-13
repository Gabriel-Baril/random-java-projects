package main;

public class Effect {
	private int power;
	private String name;
	public Effect(String name,int power) {
		this.setName(name);
		this.setPower(power);
	}
	
	public String getInfo() {
		return "EFFECT: " + name + "[POWER[" + power + "]]";
	}
	
	public int getPower() {return power;}
	public void setPower(int power) {this.power = power;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
}
