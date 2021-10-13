package main;

public class Main {
	public static void main(String[] args){
		A pers = new A();
		System.out.println(pers.life);
		pers.heal(new B(){
			public int soigne(){
				return 5;
			}
		});
		System.out.println(pers.life);
		
	}
}
