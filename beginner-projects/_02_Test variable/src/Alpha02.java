import java.util.Scanner;

public class Alpha02 {

	public static void main(String[] args) {
		
		double resultProduit, numbMultiAl, numbMultiDe;

		Scanner clavier = new Scanner(System.in);
		System.out.print("Entrer le Multiplicateur : ");
		numbMultiAl = clavier.nextDouble();
		System.out.print("Entrer le Multiplier : ");
		numbMultiDe = clavier.nextDouble();

		resultProduit = numbMultiAl * numbMultiDe;

		System.out.print("Voici la reponse de votre soustraction est : " + resultProduit);

		clavier.close();

	}

}
