import java.util.Scanner;

public class Alpha19 {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);

		double numb1;
		double numb2;
		double reponse;
		String operator;
		String determinator;
		double mod;

		determinator = "";
		operator = "";

		System.out.print("Voulez vous faire un calcul simple +,-,/,* (oui ou non?) : ");
		determinator = clavier.next();
		

		if (determinator.equals("oui")) {
			System.out.print("Entrer un premier nombre : ");
			numb1 = clavier.nextDouble();
			System.out.print("Entrer l'opérateur : ");
			operator = clavier.next();
			System.out.print("Entrer un deuxieme nombre : ");
			numb2 = clavier.nextDouble();

			if (operator.equals("+")) {
				reponse = numb1 + numb2;
			} else if (operator.equals("-")) {
				reponse = numb1 - numb2;
			} else if (operator.equals("*")) {
				reponse = numb1 * numb2;
			} else if (operator.equals("/")) {
				reponse = numb1 / numb2;
			} else {
				while(operator.equals("%") == false){
					System.out.print("Entrer un vrai operateur : ");
					operator = clavier.next();
					if(operator.equals("%") || (operator.equals("-") || (operator.equals("+") || (operator.equals("/") || (operator.equals("*")))))){
						if (operator.equals("+")) {
							reponse = numb1 + numb2;
						} else if (operator.equals("-")) {
							reponse = numb1 - numb2;
						} else if (operator.equals("*")) {
							reponse = numb1 * numb2;
						} else if (operator.equals("/")) {
							reponse = numb1 / numb2;
						} else {
							
						}
					}
				}
				reponse = numb1 % numb2;
			}

			System.out.println("La reponse est " + reponse);
			System.exit(0); // Fonction qui dit au programme de s'arreté(forcer)

		} else {
			System.out.print("Alors voulez vous faire une racine carre (oui ou non?) : ");
			determinator = clavier.next();
		}

		if (determinator.equals("oui")) {
			System.out.print("Entrer un nombre : ");
			numb1 = clavier.nextDouble();
			reponse = Math.sqrt(numb1);
			System.out.println("La racine carré de ce nombre est " + reponse);

			System.exit(0);

		} else {
			System.out.print("Alors voulez vous trouver le PGCD de deux nombre (oui ou non?) : ");
			determinator = clavier.next();

			if (determinator.equals("oui")) {
				System.out.print("Entrer un premier nombre : ");
				numb1 = clavier.nextDouble();
				System.out.print("Entrer un deuxieme nombre : ");
				numb2 = clavier.nextDouble();

				double alphaNumb = (Math.max(numb1, numb2));
				double deltaNumb = (Math.min(numb1, numb2));

				if (alphaNumb % deltaNumb == 0) {
					System.out.print("PGCD = " + deltaNumb);
				} else {

					while (alphaNumb % deltaNumb != 0) {
						mod = alphaNumb % deltaNumb;
						alphaNumb = deltaNumb;
						deltaNumb = mod;
						if (alphaNumb % deltaNumb == 0) {
							System.out.print("Le PGCD est = " + mod);

						}
					}

				}

				System.exit(0);

			} else {
				System.out.print("Alors voulez vous trouver le PPCM de deux nombre (oui ou non?) : ");
				determinator = clavier.next();

				if (determinator.equals("oui")) {
					System.out.print("Entrer un premier nombre : ");
					numb1 = clavier.nextDouble();
					System.out.print("Entrer un deuxieme nombre : ");
					numb2 = clavier.nextDouble();

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

					System.out.println("PPCM = " + PPCM);

					System.exit(0);

				} else {
					System.out.print("Ben mange dla ces la derniere fonction de ma calculatrice");
				}

			}

		}
		clavier.close();

	}
}
