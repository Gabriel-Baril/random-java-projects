import java.util.Scanner;

public class Alpha14 {

	public static void main(String[] args) {

		int age = 0;

		Scanner clavier = new Scanner(System.in);

		while (age <= 0){
			System.out.print("Veuillez entrer votre age : ");
			age = clavier.nextInt();
		}

		System.out.print("Suite du programme...");

		clavier.close();

	}

}
