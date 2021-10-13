import java.util.Scanner;

public class additionneur {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		int finish = 0;
		
		
		System.out.println("ADDITIONNEUR\n\n");
		do{
		System.out.print("Entrer une premiere valeur : ");
		A = clavier.nextInt();
		System.out.print("Entrer une seconde valeur : ");
		B = clavier.nextInt();
		int C = A + B;
		System.out.println("Le resultat de " + A + " + " + B + " est " + C);
		
		System.out.println("Reesayer ? (1/0)");
		finish = clavier.nextInt();
		
		if(finish != 0 && finish != 1){
			System.out.println("Erreur de saisie");
			finish = 0;
			
		}
		 
		}while(finish != 0);
		
		System.out.println("programme terminer");
		
		
		
		
		clavier.close();
	}
}
