import java.util.Scanner;

public class Principale07 {

	public static void main(String[] args) {
		
		int nombreAnnees=0, i=0;
		double tauxInteret=0., capitalInitial=0., capitalFinal=0;
		
        System.out.print("Quel est le montant du capital a placer (en $) ?");
		Scanner clavier = new Scanner(System.in);
		capitalInitial = clavier.nextDouble();
		System.out.print("Combien d'années le capital va-t-il etre placé ?");
		nombreAnnees = clavier.nextInt();
		System.out.print("Quel est le taux d'interet du placement ?");
		tauxInteret = clavier.nextDouble(); 
		capitalFinal = capitalInitial;
		
		double tabInterets[] = new double [nombreAnnees];
		
		for(i=0; i<tabInterets.length; i++){
			capitalFinal = (1 + tauxInteret/100)*capitalFinal;
			tabInterets[i] = capitalFinal - capitalInitial;
			System.out.print("Les interet acquis au bout de "+ (i+1) +" an(s) sont de ");
			System.out.printf("%6.2f", tabInterets[i]);
			System.out.println(" $"); 
		
		}
		clavier.close();
	}

}
