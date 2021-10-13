import java.util.Scanner;

public class Alpha15 {

	public static void main(String[] args) {
		int i = 0;
		Scanner clavier = new Scanner(System.in);
						
		do{
			System.out.print("Entrer la valeur du i : ");
			i = clavier.nextInt();
			if(i <= 45){
				System.out.println("faite en sorte que la valeur du i soit superieur a 45");
			}
		}while(i <= 45 );
		
		System.out.print("Continuation du programme");
		
		clavier.close();

	}

}
