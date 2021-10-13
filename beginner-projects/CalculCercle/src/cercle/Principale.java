package cercle;

import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		double rayon = 0;

		Methode methode = new Methode();
		methode.CalculCercleDiam(0);
		methode.CalculCercleCircon(0);
		methode.CalculCercleAire(0);
		methode.CalculSphereAire(0);
		methode.CalculSphereVolume(0);

		System.out.print("Entrer un rayon pour avoir tout les information sur ce cercle : ");
		rayon = clavier.nextDouble();
		System.out.println("");

		System.out.println("Le diametre de ce cercle est de : " + methode.CalculCercleDiam(rayon) + "cm");
		System.out.println("La circonference de ce cercle est de : " + methode.CalculCercleCircon(rayon) + "cm");
		System.out.println("Laire de ce cercle est de : " + methode.CalculCercleAire(rayon) + "cm");
		System.out.println("Si ce serait une sphere sont aire serait de : " + methode.CalculSphereAire(rayon) + "cm carre");
		System.out.println("Si ce serait une sphere sont volume serait de : " + methode.CalculSphereVolume(rayon) + "cm cube");

	}

}
