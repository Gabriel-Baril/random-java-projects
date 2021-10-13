package main;

public class A {
	public B[] b;
	
	public A(int size){
		b = new B[size];
		for(int i = 0;i < size;i++){
			b[i] = new B(0);
		}
	}
	
	public A(A copy){
		b = new B[copy.b.length];
		for(int i = 0;i < copy.b.length;i++){
			this.b[i] = new B(copy.b[i]);
		}
	}
	
}
