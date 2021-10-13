package main;

public class Main {
	public static void main(String args[]){
		A a = new A(10){
			public void printData(){
				System.out.println("Age : " + this.data);
			}
		};
		a.printData();
	}
}
