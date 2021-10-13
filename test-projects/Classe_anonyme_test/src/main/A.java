package main;

public class A {
	int life = 0;
	
	public void heal(B b){
		life += b.soigne();
	}
}
