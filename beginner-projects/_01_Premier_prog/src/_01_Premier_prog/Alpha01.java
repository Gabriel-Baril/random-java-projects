package _01_Premier_prog;

import java.util.Scanner;

public class Alpha01 {

	public static void main(String[] args) {
		
		double resultSomme, numbSoustraiyeur, numbSoustrait;
		
		Scanner clavier = new Scanner(System.in);
		System.out.print("Entrer le soustrayeur : ");
		numbSoustraiyeur = clavier.nextDouble();
		System.out.print("Entrer le soustrait : ");
		numbSoustrait = clavier.nextDouble();
		
		resultSomme = numbSoustraiyeur - numbSoustrait;
		
		System.out.print("Voici la reponse de votre soustraction est : " + resultSomme );
		
		clavier.close();
		
	}

}
