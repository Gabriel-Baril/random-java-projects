import java.util.Scanner;

public class Alpha20 {
	static Scanner clavier = new Scanner(System.in);
	
	public static double PGCD(double numb1, double numb2) {
		
		double alphaNumb = (Math.max(numb1, numb2));
		double deltaNumb = (Math.min(numb1, numb2));
		double mod = 0;

		if (alphaNumb % deltaNumb == 0) {
			System.out.print("PGCD = " + deltaNumb);
		} else {

			while (alphaNumb % deltaNumb != 0) {
				mod = alphaNumb % deltaNumb;
				alphaNumb = deltaNumb;
				deltaNumb = mod;
				
			}

		}
		return mod;

	}
	
	public static double PPCM(double numb1, double numb2) {
		
		double produit;
		double reste;
		double alphaNumb = (Math.max(numb1, numb2));
		double deltaNumb = (Math.min(numb1, numb2));
		double PPCM;

		produit = alphaNumb * deltaNumb;
		reste = alphaNumb % deltaNumb;
		while (reste != 0) {
			alphaNumb = deltaNumb;
			deltaNumb = reste;
			reste = alphaNumb % deltaNumb;
		}
		PPCM = produit / deltaNumb;

		

		
        return PPCM;
	}

	public static void main(String[] args) {
		int numbA = (int) (Math.random()*999) + 1;
		int numbB = (int) (Math.random()*999) + 1;
		double alphaNumb = (Math.max(numbA, numbB));
		double deltaNumb = (Math.min(numbA, numbB));
		int numbC = (int) (Math.random()*999) + 1;
		int numbD = (int) (Math.random()*999) + 1;
		double alphaNumb1 = (Math.max(numbC, numbD));
		double deltaNumb2 = (Math.min(numbC, numbD));
		
		
		System.out.println("Le PGCD de " + alphaNumb + " et " + deltaNumb + " est " + PGCD(numbA, numbB));
		System.out.println("Le PPCM de " + alphaNumb1 + " et " + deltaNumb2 + " est " + PPCM(numbC, numbD));
		
		if(PGCD(numbA, numbB) > PPCM(numbC, numbD)){
			System.out.println("WTF");
		}
		if(PGCD(numbA, numbB) < PPCM(numbC, numbD)){
			System.out.println("LOGIQUE");
		}

	}

}
