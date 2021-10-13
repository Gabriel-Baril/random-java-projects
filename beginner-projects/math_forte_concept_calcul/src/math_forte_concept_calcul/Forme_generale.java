package math_forte_concept_calcul;

public class Forme_generale {

	public static void main(String[] args) {
		
		//Mettre valeur voulu pour avoir resultat canonique ou symetrique de cette 
		//equation en generale
		
		double A = -6;
		double B = -3;
		double C = 10;
		
		System.out.println("Equation en generale basique : Ax + By + C = 0 ");
		System.out.println("Equation en generale : " + ((int)A) + "x" + " + " + ((int)B) + "y" + " + " + ((int)C) + " = " + "0" );
		
		System.out.println();
		
		System.out.println("Transformation de lequation en canonique : y = mx + b");
		System.out.println("Equation en canonique non simplifier : " + ((int)B) + "y" + " = " + ((int)-A) + "x" + " + " + ((int)-C));
		System.out.println("Equation en canonique simplifier : " + "y" + " = " + ((int)-A) + "/" + ((int)B) + "x" + " + " + ((int)-C) + "/" + ((int)B));
		if(-A % B == 0 && -C % B == 0){
			A = -A/B;
			C = -C/B;
			
			System.out.println("Equation en canonique simplifier avec fraction reduite : "  + "y" + " = " + ((int)A) + "x" + ((int)C));
			}
		if(-A % B != 0 && -C % B == 0){
			C = -C/B;
			
			System.out.println("Equation en canonique simplifier avec fraction reduite : "  + "y" + " = " + ((int)-A) + "/" + ((int)B) + "x" + ((int)-C));
		}
		if(-A % B == 0 && -C % B != 0){
			A = -A/B;
			if(C < 0 && B < 0){
				System.out.println("Equation en canonique simplifier avec fraction reduite : "  + "y" + " = " + ((int)A) + "x" + " + " +  ((int)-C) + "/" + ((int)B));
			}

			System.out.println("Equation en canonique simplifier avec fraction reduite : "  + "y" + " = " + ((int)A) + "x" + " + " +  ((int)-C) + "/" + ((int)B));
		}
				
		System.out.println();
		
		System.out.println("transformation de lequation en symetrique : x/a + y/b = 1");
		

	}

}
