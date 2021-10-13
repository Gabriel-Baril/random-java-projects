package taxe;

import java.util.Scanner;

public class taxe {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);

		double numb;
		double tps;
		double tvq;
		double total;
		String determinator = "";
		double numbtotal = 0;

		System.out.print("Est ce que vous voulez entrer un seul prix dite(oui ou non) : ");
		determinator = clavier.nextLine();

		if (determinator.equals("non")) {
			System.out.println("Entrer un premier prix dite (fin) quand vous avez fini votre liste de prix !");

			do {

				System.out.println("entrer un nombre : ");
				numb = clavier.nextDouble();
				System.out.println("Dite (fin) si votre liste est fini : ");
				determinator = clavier.next();
				System.out.println("");

				numbtotal += numb;

			} while (!determinator.equals("fin"));

			tps = numbtotal * 0.05;
			tvq = (numbtotal + tps) * 0.095;
			total = numbtotal + tps + tvq;

			System.out.println("Le montant de tout les prix est de : " + numbtotal);
			System.out.println("");
			System.out.println("La tps est de : " + tps);
			System.out.println("La tvq est de : " + tvq);
			System.out.println("La total est de : " + total);

		}

		if (determinator.equals("oui")) {
			System.out.println("Entrer un prix pour avoir un total avec la taxe : ");
			numb = clavier.nextDouble();

			tps = numb * 0.05;
			tvq = (numb + tps) * 0.095;
			total = numb + tps + tvq;

			System.out.println("Le montant initial est de : " + numb);
			System.out.println("");
			System.out.println("La tps est de : " + tps);
			System.out.println("La tvq est de : " + tvq);
			System.out.println("La total est de : " + total);
		}
		clavier.close();
	}

}
