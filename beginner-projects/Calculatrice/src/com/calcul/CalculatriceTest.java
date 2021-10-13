package com.calcul;

public class CalculatriceTest {

	public static void main(String[] args) {
		
		Calculatrice test = new Calculatrice(false);
		Calculatrice test1 = new Calculatrice(false);
		Calculatrice test2 = new Calculatrice(false);
		Calculatrice test3 = new Calculatrice(false);
		
		Calculatrice.convertor();
		
		System.out.println(test.test);
		System.out.println(test1.test);
		System.out.println(test2.test);
		System.out.println(test3.test);

	}

}
