import java.util.Scanner;

public class Alpha13 {

	public static void main(String[] args) {
		
		int age;
		
		Scanner clavier = new Scanner(System.in);
		
		do{
			System.out.print("Veuillez entrer votre age : ");
			age = clavier.nextInt();
			if(age <= 0){
				System.out.println("Votre age ne peut pas etre negatif");
			}
		}while( age <= 0);
		
		System.out.print("Suite du programme...");
		
		clavier.close();



	}

}
