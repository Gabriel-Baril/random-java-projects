package pratique;

import java.util.Scanner;

public class Jeu_trouver_chiffre {
	
	public static int Time(){
		
		long start= System.currentTimeMillis(); 
        long time; 
        int x = 0;
        
		for (;;){ 
            time = System.currentTimeMillis(); 
            int a = (int) ((time - start)/1000);
            
            if(x % 40000000 == 0){
            return a;
            }
            
            x++;
            
            }
	}

	public static void main(String[] args) {
		
		Scanner nombre = new Scanner(System.in);
		
		double chiffre_un = Math.random()*1000 ;
		int  chiffre_rep = (int) chiffre_un;
		int nb = 0;
		
		
		int nb_essaie = 0;
		
		
		
        
		
		
		
		do{
			System.out.print("Entrer un nombre : ");
			nb = nombre.nextInt();
			
			
			if(nb < chiffre_rep){
				System.out.println("Le nombre est superieur");
				nb_essaie++;
			}
			
			if(nb > chiffre_rep){
				System.out.println("Le nombre est inferieur");
				nb_essaie++;
			}
			
		}while(nb != chiffre_rep);
		
		
		System.out.println();
		System.out.println("Bravo le nombre est " + chiffre_rep);
		System.out.println("Tu as trouver le nombre mystere en " + nb_essaie + " essaie(s)");
		System.out.println("Nombre trouver en " + Time());
		
		
	}
	
	

}
