package main;

public class B {
	int var;

	public B(int rand){
		var = rand;
	}
	
	public B(B copy){
		this.var = copy.var;
	}
}
