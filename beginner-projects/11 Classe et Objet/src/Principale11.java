
public class Principale11 {

	public static void main(String[] args) {
		
		//Constructeur par d/faut (sans parametre)
		Corpulence jean = new Corpulence();
		
		//Constructeur d<initialisation (avec parametre)
		Corpulence pierre = new Corpulence (180, 85);
		System.out.println(pierre.getPoids());
		jean.setTaille(190);
		System.out.println(jean.getTaille());

	}

}
