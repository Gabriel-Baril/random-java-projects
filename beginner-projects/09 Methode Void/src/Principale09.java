import java.util.Scanner;

public class Principale09 {
	
	static void calculeAffichePrixSolde(double prixArticle, double tauxSolde){
		double prixSolde;
		prixSolde = (1 - tauxSolde/100)*prixArticle;
		System.out.println("Le prix de l'article soldé est de "+ prixSolde +" $.");
	}
	

	public static void main(String[] args) {
		
		double prixArticle = 0., tauxSolde = 0.;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Pour saisir une décimal au clavier, on utilise la virgule");
	    System.out.print("Entrer le prix de l'article non soldé :");
	    prixArticle = clavier.nextDouble();
	    System.out.print("Entrer le pourcentage de réduction : ");
	    tauxSolde = clavier.nextDouble();
		
	    clavier.close();
	    
	    calculeAffichePrixSolde(prixArticle, tauxSolde); //Appel de la fonction
	}

}
