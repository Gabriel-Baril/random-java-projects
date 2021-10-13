package main;

public class Main {
	public static void main(String[] args){
		
		A a1 = new A(10);
		A a2 = new A(a1);
		
		a2.b[0].var = 10;
		a1.b[3] = new B(6);
		
		for(int i = 0;i < a1.b.length;i++){
			System.out.println("a1 : " + a1.b[i].var + " a2 : " + a2.b[i].var);
		}
		
	}
}
