import java.util.Scanner;

public class Principale09 {
	
	static void calculeAffichePrixSolde(double prixArticle, double tauxSolde){
		double prixSolde;
		prixSolde = (1 - tauxSolde/100)*prixArticle;
		System.out.println("Le prix de l'article sold� est de "+ prixSolde +" $.");
	}
	

	public static void main(String[] args) {
		
		double prixArticle = 0., tauxSolde = 0.;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Pour saisir une d�cimal au clavier, on utilise la virgule");
	    System.out.print("Entrer le prix de l'article non sold� :");
	    prixArticle = clavier.nextDouble();
	    System.out.print("Entrer le pourcentage de r�duction : ");
	    tauxSolde = clavier.nextDouble();
		
	    clavier.close();
	    
	    calculeAffichePrixSolde(prixArticle, tauxSolde); //Appel de la fonction
	}

}
