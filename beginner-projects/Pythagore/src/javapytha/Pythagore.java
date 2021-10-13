package javapytha;

import java.util.Scanner;

public class Pythagore {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double cd;
		double aCarre;
		double bCarre;
		double cCarre;
		
		
		
		System.out.println("Entrer 2 mesure(min) d'un triangle rectangle et nous allons vous trouver la mesure manquante(mettre 0 sur la mesure a chercher)" );
		System.out.println("Entrer un nombre : ");
		a = clavier.nextDouble();
		System.out.println("Entrer un autre nombre : ");
		b = clavier.nextDouble();
		System.out.println("Entrer un autre nombre : ");
		c = clavier.nextDouble();
		
		double Alpha = Math.max(a, b);
		double Alpha2 = Math.max(Alpha, c);
		double hypo = Alpha2;
		
		aCarre = a * a;
		bCarre = b * b;
		cCarre = c * c;
		
		hypo = cCarre;
		
		
		
		
		
		if(aCarre == 0){
			double reponse;
			if(bCarre < 0){
				reponse = hypo + bCarre;
				
			} else {
				reponse = hypo - bCarre;
			}
			
			a = Math.sqrt(reponse);
			
			System.out.println("La mesure manquante est " + a);
		}
		
		if(bCarre == 0){
			double reponse;
			if(aCarre < 0){
				reponse = hypo + aCarre;
				
			} else {
				reponse = hypo - aCarre;
			}
			
			b = Math.sqrt(reponse);
			
			System.out.println("La mesure manquante est " + b);
			
		}
		
        if(cCarre == 0){
        	cCarre = aCarre + bCarre;
			c = Math.sqrt(cCarre);
			
			System.out.println("La mesure manquante est " + c);
		}
		
		
		
		
		
		
		
		
		
		
		
		clavier.close();

	}

}
