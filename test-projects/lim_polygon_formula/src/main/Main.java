package main;

public class Main {
	public static void main(String[] args){
		float apo = 5;
		float dist = 4;
		float side = 4;
		
		for(int i = 0;i < 100;i++){
			float perimeter = dist*side;
			System.out.println("Area polygon : " + (apo*dist*side)/2 + "     Circle Area : " + (Math.PI*apo*apo));
			side++;
			dist = perimeter/side;
		}
	}
}
