import java.util.Scanner;

public class racineNumerique {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);

		String mot = "";
		int num = 0 ;

		System.out.print("Entrer une chaine de caractere : ");
		mot = clavier.nextLine();

		for (int i = 0; i < mot.length(); i++) {

			if (mot.charAt(i) == 'a' || mot.charAt(i) == 'A') {
				num += 1;
			}
			if (mot.charAt(i) == 'b' || mot.charAt(i) == 'B') {
				num += 2;
			}
			if (mot.charAt(i) == 'c' || mot.charAt(i) == 'C') {
				num += 3;
			}
			if (mot.charAt(i) == 'd' || mot.charAt(i) == 'D') {
				num += 4;
			}
			if (mot.charAt(i) == 'e' || mot.charAt(i) == 'E') {
				num += 5;
			}
			if (mot.charAt(i) == 'f' || mot.charAt(i) == 'F') {
				num += 6;
			}
			if (mot.charAt(i) == 'g' || mot.charAt(i) == 'G') {
				num += 7;
			}
			if (mot.charAt(i) == 'h' || mot.charAt(i) == 'H') {
				num += 8;
			}
			if (mot.charAt(i) == 'i' || mot.charAt(i) == 'I') {
				num += 9;
			}
			if (mot.charAt(i) == 'j' || mot.charAt(i) == 'J') {
				num += 10;
			}
			if (mot.charAt(i) == 'k' || mot.charAt(i) == 'K') {
				num += 11;
			}
			if (mot.charAt(i) == 'l' || mot.charAt(i) == 'L') {
				num += 12;
			}
			if (mot.charAt(i) == 'm' || mot.charAt(i) == 'M') {
				num += 13;
			}
			if (mot.charAt(i) == 'n' || mot.charAt(i) == 'N') {
				num += 14;
			}
			if (mot.charAt(i) == 'o' || mot.charAt(i) == 'O') {
				num += 15;
			}
			if (mot.charAt(i) == 'p' || mot.charAt(i) == 'P') {
				num += 16;
			}
			if (mot.charAt(i) == 'q' || mot.charAt(i) == 'Q') {
				num += 17;
			}
			if (mot.charAt(i) == 'r' || mot.charAt(i) == 'R') {
				num += 18;
			}
			if (mot.charAt(i) == 's' || mot.charAt(i) == 'S') {
				num += 19;
			}
			if (mot.charAt(i) == 't' || mot.charAt(i) == 'T') {
				num += 20;
			}
			if (mot.charAt(i) == 'u' || mot.charAt(i) == 'U') {
				num += 21;
			}
			if (mot.charAt(i) == 'v' || mot.charAt(i) == 'V') {
				num += 22;
			}
			if (mot.charAt(i) == 'w' || mot.charAt(i) == 'W') {
				num += 23;
			}
			if (mot.charAt(i) == 'x' || mot.charAt(i) == 'X') {
				num += 24;
			}
			if (mot.charAt(i) == 'y' || mot.charAt(i) == 'Y') {
				num += 25;
			}
			if (mot.charAt(i) == 'z' || mot.charAt(i) == 'Z') {
				num += 26;
			}
			if (mot.charAt(i) == '0') {
				num += 0;
			}
			if (mot.charAt(i) == '1') {
				num += 1;
			}
			if (mot.charAt(i) == '2') {
				num += 2;
			}
			if (mot.charAt(i) == '3') {
				num += 3;
			}
			if (mot.charAt(i) == '4') {
				num += 4;
			}
			if (mot.charAt(i) == '5') {
				num += 5;
			}
			if (mot.charAt(i) == '6') {
				num += 6;
			}
			if (mot.charAt(i) == '7') {
				num += 7;
			}
			if (mot.charAt(i) == '8') {
				num += 8;
			}
			if (mot.charAt(i) == '9') {
				num += 9;
			}
			
		}

		System.out.println("La racine numerique de cette chaine de caractere est : " + num);
		clavier.close();
		

	}

}
