package pratique;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		int CODE = 2534;
		int essaie = 0;
		
		Scanner code_test = new Scanner(System.in);
		System.out.print("Entrer le code : ");
		int a = code_test.nextInt();
		
		if(a == CODE){
		System.out.println("porte ouverte");
		}
		
		
		while(a != CODE){
			
			System.out.print("Erreur veuiller resseyer : ");
			a = code_test.nextInt();
			if(a == CODE){
				System.out.println("porte ouverte");
			}
			essaie++;
			
			if(essaie == 3){
				System.out.println("intrut detecter");
				System.out.println("porte verrouiller");
				System.exit(1);
				
			}
			
			
		}

	}

}
