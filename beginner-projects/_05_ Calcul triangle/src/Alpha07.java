import java.util.Scanner;

public class Alpha07 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int baseTriangle, hauteurTriangle;
		double aireTriangle;
		String chaine;
		
		chaine = "";
		
		System.out.print("Veulliez entrer la base du triangle : ");
		baseTriangle = clavier.nextInt();
		System.out.print("Veulliez entrer lunité de mesure que vous voulez : ");
		chaine = clavier.next();
		System.out.print("Veulliez entrer la longueur du triangle : ");
		hauteurTriangle = clavier.nextInt();
			
		aireTriangle = baseTriangle * hauteurTriangle / 2;
		
		if(chaine.equals("cm")){
			System.out.println("Laire de ce triangle est de : " + aireTriangle + chaine);
		} else if(chaine.equals("m")){
			System.out.println("Laire de ce triangle est de : " + aireTriangle + " metre carre");
		} else
		
		clavier.close();

	}

}
