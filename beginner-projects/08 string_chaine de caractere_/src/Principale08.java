import java.util.Scanner;

public class Principale08 {

	public static void main(String[] args) {
		int n = 1;
		String motDePasse = new String(); // creation d'un objet String
		motDePasse = "";

		Scanner clavier = new Scanner(System.in);

		while (motDePasse.equals("SeSaMe") == false && n < 4) {
			System.out.println("Entrer le mot de passe :"); // saisie du mot de passe
			motDePasse = clavier.next();
			n++; // Incr�mentation du compteur d'essais
		}
		
		if (motDePasse.equals("SeSaMe")) {
			System.out.print("Merci, vous pouvez entrer");

		} else {
			System.out.print("L'alarme va etre d�clench�e !");

		}
	    clavier.close();
	}

}
