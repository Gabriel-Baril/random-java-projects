package main;

public class A extends B{
	int a,b;
	
	public A(int a,int b,int x,int y){
		super(x,y);
		this.a = a;
		this.b = b;
	}
	
	public void parler(){
		super.parler();
		System.out.println("Specific process : (a: " + a + ",b: " + b + ")");
	}
}
