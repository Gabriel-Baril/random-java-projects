
public class Corpulence {

	// Variables d'instance
	private int taille;
	private int poids;

	// Constructeur par défaut
	public Corpulence() {
		// On initialise les variables d'instances
		taille = 1;
		poids = 0;

	}

	// Constructeur d'initialisation
	public Corpulence(int pTaille, int pPoids) {
		taille = pTaille;
		poids = pPoids;

	}

	// getters
	public int getTaille() {
		return taille;

	}

	public int getPoids() {
		return poids;

	}

	// setters
	public void setTaille(int pTaille) {
		if (pTaille >= 0) {
			taille = pTaille;

		}else{
			System.out.println("La valeur proposé est incorrecte.");
		}
	}
	
	public void setPoids(int pPoids) {
		if (pPoids >= 0) {
			poids = pPoids;

		}else{
			System.out.println("La valeur proposé est incorrecte.");
		}
	}

}
