import java.util.Scanner;

public class Principale05 {

	public static void main(String[] args) {
		int nombreAnnees, i;
		double tauxInteret, capitalInitial, capitalFinal;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Quel est le montant du capital a placer (en $) ?");
		capitalInitial = clavier.nextDouble();
		System.out.print("Combien d'années le capital va-t-il etre placé ?");
		nombreAnnees = clavier.nextInt();
		System.out.print("Quel est le taux d'interet du placement ?");
		tauxInteret = clavier.nextDouble();
		capitalFinal = capitalInitial;

		for(i=1 ; i <= nombreAnnees; i++){
			capitalFinal = (1 + tauxInteret/100)*capitalFinal;
		}
		System.out.print("Les interets acquis au bout de"+ nombreAnnees + "an(s) son de ");
		System.out.printf("%6.2f", capitalFinal - capitalInitial); // formatage 8 chiffre dont 2 decimale
		System.out.print(" $");
		clavier.close();
		
	}

}
