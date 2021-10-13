import java.util.Scanner;

public class Alpha06 {

	public static void main(String[] args) {
		
		int baseRectangle, longueurRectangle;
		double aireRectangle;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Veulliez entrer la base du rectangle : ");
		baseRectangle = clavier.nextInt();
		System.out.print("Veulliez entrer la longueur du rectangle : ");
		longueurRectangle = clavier.nextInt();
		
		aireRectangle = baseRectangle * longueurRectangle;
		
		System.out.println("Laire de ce rectangle est de : " + aireRectangle);
		
		clavier.close();

	}

}
