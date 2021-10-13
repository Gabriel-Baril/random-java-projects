import java.util.Scanner;

public class Alpha18 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		int numb1;
		int numb2;
		int mod;

		System.out.println("Entrer deux nombres pour definir leur pgcd");
		System.out.print("Entrer un premier nombre : ");
		numb1 = clavier.nextInt();
		System.out.print("Entrer un deuxieme nombre : ");
		numb2 = clavier.nextInt();

		int alphaNumb = (Math.max(numb1, numb2));
		int deltaNumb = (Math.min(numb1, numb2));

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
		clavier.close();
	}

}
