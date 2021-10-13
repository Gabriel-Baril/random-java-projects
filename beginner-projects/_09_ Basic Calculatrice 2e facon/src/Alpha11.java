import java.util.Scanner;

public class Alpha11 {
	
    static Scanner clavier = new Scanner(System.in);
	public static void main(String[] args) {
		double numb1 = 0, numb2 = 0;
		
		System.out.print("Entrer le premier nombre : ");
		numb1 = clavier.nextDouble();
		
		System.out.print("Entrer le deuxieme nombre : ");
		numb2 = clavier.nextDouble();
		
		System.out.println("La somme de " + numb1 + " et " + numb2 + " est : " + (numb1 + numb2));
		System.out.println("La difference de " + numb1 + " et " + numb2 + " est : " + (numb1 - numb2));
		System.out.println("Le produit de " + numb1 + " et " + numb2 + " est : " + (numb1 * numb2));
		System.out.println("La quotient de " + numb1 + " et " + numb2 + " est : " + (numb1 / numb2));
		System.out.println("La modulo de " + numb1 + " et " + numb2 + " est : " + (numb1 % numb2));
		
		clavier.close();
		
		int r;
		int u = 0;
		
		r = u + 10;

	}

}
