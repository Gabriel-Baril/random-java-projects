import java.util.Scanner;

public class Alpha10 {

	public static void main(String[] args) {
		
		double numb1, numb2, operator;
		 
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("veuillez taper un chiffre : ");
		numb1 = clavier.nextDouble();
		System.out.print("veuillez entrer un operateur /n(1 pour +) (2 pour -) (3 pour *) et (4 pour /) : ");
		operator = clavier.nextDouble();
		System.out.print("veuillez taper un chiffre : ");
		numb2 = clavier.nextDouble();
		
		if(operator == 1) {
		System.out.print("Le resultat de votre calcul est : "+(numb1 + numb2));
		} else if(operator == 2) {
		System.out.print("Le resultat de votre calcul est : "+(numb1 - numb2));
		} else if(operator == 3) {
		System.out.print("Le resultat de votre calcul est : "+(numb1 * numb2));
		} else if(operator == 4) {
		System.out.print("Le resultat de votre calcul est : "+(numb1 / numb2));
		} else {
		System.out.println("Une erreur a été detecté lors de la mise de l'opérateur");
		}
		
	clavier.close();
	}

}
