import java.util.Scanner;

public class Alpha12 {
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		
		int nombre;
		
		System.out.print("Entrer un nombre pour avoir ca table de multiplication : ");
		nombre = clavier.nextInt();
		

		for(int i = 1; i <= 12; i++){
			System.out.println(nombre +" multiplié par " + i + " est " + (nombre*i)); 
		}

	}

}
