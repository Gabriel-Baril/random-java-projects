package construction_com;

public class PrinTest {
	
	String prenom;
	String nom;
	
	public PrinTest(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
		
	}
	
	public String fullName(String deb){
		return deb + " " + nom + " " + prenom;
	}

	
}
