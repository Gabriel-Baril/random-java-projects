import java.util.Scanner;

public class Alpha16 {

	public static void main(String[] args) {

		int nombreDivin;
		int nombreEcrit;
		
		nombreDivin = (int) (Math.random() * 999) + 1;

		Scanner clavier = new Scanner(System.in);

		do{
			System.out.print("Entrer un nombre entre (1 et 1000) : ");
			nombreEcrit = clavier.nextInt();
			if(nombreEcrit == nombreDivin){
				System.out.print("Bravo !!!");
			} else if (nombreEcrit > nombreDivin){
				System.out.println("Votre nombre est trop grand !");
			} else {
				System.out.println("Votre nombre est trop petit !");
			} 
		}while(nombreEcrit != nombreDivin);
		
		clavier.close();
		

	}

}
