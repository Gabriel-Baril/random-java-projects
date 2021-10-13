package suite_fibonaci;

public class first_attemps {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		
		int c = a + b;
		int d = b + c;
		int e = c + d;
		
		int lgsuite = 0;
		int rang = 0;
		
		while( lgsuite != 7){
			
		System.out.println(" " + a + " : " + "Rang " + (rang));
		System.out.println(" " + b + " : " + "Rang " + (rang+1));
		System.out.println(" " + c + " : " + "Rang " + (rang+2));
		System.out.println(" " + d + " : " + "Rang " + (rang+3));
		System.out.println(" " + e + " : " + "Rang " + (rang+4));
		
		a = e + d;
		b = a + e;
		c = a + b;
		d = c + b;	
		e = d + c;
		
		rang += 5;
		lgsuite++;
		}

	}

}
