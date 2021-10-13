package main;

public class C extends B{
	int c;
	
	public C(int c,int x, int y) {
		super(x, y);
		this.c = c;
	}
	
	public void parler(){
		super.parler();
		System.out.println("Specific process : (c: " + c + ")");
	}
}
