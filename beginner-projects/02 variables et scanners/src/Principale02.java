import java.util.Scanner; // Import la fontionnalité clavier

public class Principale02 {

	public static void main(String[] args) {
		// Déclaration des variables
		int  diviseur;
		double dividende, quotient;
		
		
		// Enregistrement des valeurs tapees par l'utilisateur
	    Scanner clavier = new Scanner(System.in);
	    System.out.print("Entrer le dividende : ");
	    dividende = clavier.nextDouble();
	    System.out.print("Entrer le diviseur : ");
	    diviseur = clavier.nextInt();
		
		
		// Calcul du quotient
		quotient = dividende / diviseur;
		
		// Affichage du résultat dans la console
		System.out.print("Le quotient de la division est " + quotient);
		clavier.close();

	}

}
