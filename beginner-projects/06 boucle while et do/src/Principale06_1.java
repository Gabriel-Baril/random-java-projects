import java.util.Scanner;

public class Principale06_1 {

	public static void main(String[] args) {
		int nombreAnnees;
		double tauxInteret, capitalInitial, capitalFinal, gain;
		
		nombreAnnees = 0;
		tauxInteret = 0.; capitalInitial = 0.; capitalFinal = 0.; gain = 0.;
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Quel est le montant du capital a placer (en $) ?");
		capitalInitial = clavier.nextDouble();
		System.out.print("Quel est le taux d'interet du placement ?");
		tauxInteret = clavier.nextDouble();
		System.out.print("Quel est le gain souhaiter (en $) ?");
		gain = clavier.nextInt(); //Le gain doit etre strictement positif
		capitalFinal = capitalInitial;
		
		while(capitalFinal - capitalInitial < gain){
		    nombreAnnees++;
		    capitalFinal = (1+ tauxInteret/100)*capitalFinal;
	    
		}
		System.out.print("Le gain de ");
		System.out.printf("%6.0f", gain); // formatage 6 chiffre dont 0 decimale
		System.out.print(" $ sera atteint au bout de " + nombreAnnees + "an(s).");
		clavier.close();
	}
}
